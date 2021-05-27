package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TypeChecker extends algBaseListener {

    public Scope globalScope;
    public Scope currentScope;
    private FunctionSymbol currentFunction;
    public int semanticErrors;

    ParseTreeProperty<Symbol.PType> exprType = new ParseTreeProperty<>(); //tabela de simbolos

    //métodos auxiliar (é usado em 2 regras gramaticais)
    private boolean defineSymbol(ParserRuleContext ctx, Symbol s) {
        if (!this.currentScope.define(s)) {
            //estejam à vontade para mudar as mensagens de erro!
            //ou adicionar mais informação, como por exemplo qual a posição da linha onde começa a variável com erro
            //ou até mesmo onde é que está definida a variável original...
            System.err.println("Redefining previously defined variable " + s.name + " in line " + ctx.start.getLine());
            this.semanticErrors++;
            return false;
        }
        return true;
    }

    /**
     * Set symbol type for class symbol considering pointer types
     * bad practice, but easy way to do it
     *
     * @param symbol
     * @return string
     */
    //int x
    private String setSymbolType(String symbol) {
        String result = symbol;
        if (symbol.equals("<string>")) {
            result = "POINTER_STRING";
        } else if (symbol.equals("<float>")) {
            result = "POINTER_FLOAT";
        } else if (symbol.equals("<int>")) {
            result = "POINTER_INT";
        } else if (symbol.equals("<bool>")) {
            result = "POINTER_BOOL";
        } else if (symbol.equals("<void>")) {
            result = "POINTER_VOID";
        } else if (symbol.equals("null")) { //TODO check after question
            result = "POINTER_VOID";
        }

        return result;
    }


    /**
     * Returns if symbols is a pointer or not
     *
     * @param symbol
     */
    private boolean isPointerType(Symbol.PType symbol) {
        return symbol.toString().contains("POINTER");
    }

    /**
     * Returns if symbols is a void pointer
     *
     * @param symbol
     */
    private boolean isEmptyPointerType(Symbol.PType symbol) {
        return symbol.toString().contains("POINTER_VOID");
    }


    /**
     * Check if is primitive type (everything excepts void)
     *
     * @param symbol
     * @return
     */
    private boolean isPrimitiveType(Symbol.PType symbol) {
        return symbol != Symbol.PType.VOID;
//        return !isPointerType(symbol) && symbol != Symbol.PType.VOID;

    }

    /**
     * Check if a type is numeric (int || float)
     *
     * @param type
     * @return boolean
     */
    private boolean isNumericType(Symbol.PType type) {
        return type == Symbol.PType.INT || type == Symbol.PType.FLOAT;

    }


    /**
     * Transforms primitive type into pointer type
     *
     * @param primitive type (int, bool, float, null, void)
     * @return pointer type
     */
    private Symbol.PType primitiveToPointertype(Symbol.PType primitive) {
        Symbol.PType result = primitive;
        if (primitive == Symbol.PType.INT)
            result = Symbol.PType.POINTER_INT;
        else if (primitive == Symbol.PType.BOOL)
            result = Symbol.PType.POINTER_BOOL;
        else if (primitive == Symbol.PType.FLOAT)
            result = Symbol.PType.POINTER_FLOAT;
//        else if (primitive == Symbol.PType.NULL)
//            result = Symbol.PType.POINTER_VOID;
        else if (primitive == Symbol.PType.STRING)
            result = Symbol.PType.POINTER_STRING;
        return result;

    }


    // ******************************************************
    // *******************  START   *******************
    // ******************************************************


    //Entra na regra principal da gramatica e inicializa os scopes
    public void enterStart(alg.StartContext ctx) {
        globalScope = new Scope(null);
        this.currentScope = globalScope;
    }

    //Saida da regra principal, estamos a imprimir só para ver todos os símbolos que foram criados no scope global
    //está aqui para informação de debug

    /**
     * Generate error when there's no main function ('alg')
     *
     * @param ctx
     */
    public void exitStart(alg.StartContext ctx) {
        if (globalScope.resolve("alg") != null)
            System.out.println(this.currentScope.toString());
        else {
            System.err.println("Missing principal function 'alg'");
            this.semanticErrors++;
        }
    }


    // ******************************************************
    // *******************  Functions   *******************
    // ******************************************************


    //Saida de uma variavel. Retorna erro caso a variavel nao foi definida antes ou é utilizada como uma função.
    public void exitVar(alg.VarContext ctx) {

        String variableName = ctx.INDENT().getText();
        Symbol s = this.currentScope.resolve(variableName);
        if (s == null) {

            System.err.println("Undefined variable " + variableName + " in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if (s instanceof FunctionSymbol) {
            System.err.println("Using function symbol " + variableName + " as variable in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }

        exprType.put(ctx, s.type);
    }






    //Saida de uma simple_declaration, define os symbols iterando sobre a lista de indentificadores
    // simple_declaration : type INDENT (COMMA INDENT)*; //int i,j
//    type :     INT
//    | BOOL
//    | FLOAT
//    | STRING
//    | NULL
//    | LESS_THAN  type  GREATER_THAN ;
    public void exitSimple_declaration(alg.Simple_declarationContext ctx) {

        //Iterate in the INDENT list (simple_declaration : type INDENT (COMMA INDENT)*; //int i,j) and save all the symbols.
        for (TerminalNode terminalNode : ctx.INDENT()) {
            defineSymbol(ctx, new Symbol(setSymbolType(ctx.type().getText()), terminalNode.getText())); //esta na tabela de simbolos
        }
    }


    //Saida de uma initialization_declaration, define um symbol para a dada inicializacao
    public void exitInitialization_declaration(alg.Initialization_declarationContext ctx) {
        defineSymbol(ctx, new Symbol(setSymbolType(ctx.type().getText()), ctx.INDENT().getText()));

    }


    //Entra em uma declaração de uma função, define um novo scope  e um novo symbol para esta nova função.


    public void enterFunction_declaration(alg.Function_declarationContext ctx) {
        FunctionSymbol f = null;
        String functionName = null;
        if (ctx.INDENT() != null) {
            functionName = ctx.INDENT().getText();
            String type = ctx.function_type().start.getText();
            f = new FunctionSymbol(type, functionName);

            if (ctx.function_type() == null) {
                return;
            }
        }


        if (ctx.INDENT() == null) {
            functionName = ctx.main_function_declaration().ALG().getText();
            String type = ctx.main_function_declaration().INT(0).getText();
            f = new FunctionSymbol(type, functionName);
        }


        if (defineSymbol(ctx, f)) {
            if (ctx.INDENT() != null) {
                for (alg.Simple_declarationContext terminalNode : ctx.arg(0).simple_declaration()) {

                }
            }


            //para além de adicionarmos a função à tabela de símbolos, esta vai criar um novo enquadramento local
            //isto tem que ser feito quando entramos, porque caso existam argumentos formais, estes devem já ser guardados
            //dentro do enquadramento local da função. É mais fácil fazer isto se o enquadramento já estiver criado.
            //Existem linguagens onde os argumentos formais são guardados num enquadramento à parte especial só para os argumentos.
            //mas não é este o caso aqui.



            this.currentFunction = f;
            this.currentScope = new Scope(this.currentScope);
        }
    }


    public void exitFunction_declaration(alg.Function_declarationContext ctx) {
        if (this.currentFunction == null) return;


        //Print arguments
        for (Symbol s : this.currentFunction.arguments) {
            System.out.println("Argument: " + s.name + " Tipo: " + s.type);

        }


        //imprimir o enquadramento local, só para efeito de debug

        System.out.println("Local scope for function " + this.currentFunction.name + ": " + this.currentScope.toString());
        this.currentFunction = null;

        //temos de sair do contexto local da função
        currentScope = currentScope.getParentScope();
    }

    public void exitMain_function_declaration(alg.Main_function_declarationContext ctx) {


            if(ctx.INT(1) == null || ctx.STRING() == null)
            {
                exprType.put(ctx, Symbol.PType.ERR);
                System.err.println("Wrong arguments were passed to the main function");
                return;
            }
            Symbol s1 = new Symbol(ctx.INT(1).toString(), ctx.INDENT(0).getText());
            defineSymbol(ctx, s1);

            Symbol s2 = new Symbol("POINTER_STRING", ctx.INDENT(1).getText());
            defineSymbol(ctx, s2);


            this.currentFunction.arguments.add(s1);
            this.currentFunction.arguments.add(s2);
    }


    // ******************************************************
    // *******************  EXPRESSIONS   *******************
    // ******************************************************

    // ################## simple_expression
    //TODO check if is really necessary
    public void exitSimpleExpr(alg.SimpleExprContext ctx) {
        exprType.put(ctx, exprType.get(ctx.simple_expression()));
    }

    public void exitInt(alg.IntContext ctx) {
        exprType.put(ctx, Symbol.PType.INT);
    }

    public void exitNull(alg.NullContext ctx) {
        exprType.put(ctx, Symbol.PType.POINTER_VOID);
    }

    public void exitFloat(alg.FloatContext ctx) {
        exprType.put(ctx, Symbol.PType.FLOAT);
    }

    public void exitString(alg.StringContext ctx) {
        exprType.put(ctx, Symbol.PType.STRING);
    }

    public void exitTrue(alg.TrueContext ctx) {
        exprType.put(ctx, Symbol.PType.BOOL);
    }

    public void exitFalse(alg.FalseContext ctx) {
        exprType.put(ctx, Symbol.PType.BOOL);
    }

    //TODO function invocation


    // ################### expressions
//    expression: L_PAREN expression R_PAREN
    public void exitParenExpr(alg.ParenExprContext ctx) {
        Symbol.PType type = exprType.get(ctx.expression());
        if (type == Symbol.PType.ERR ) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        exprType.put(ctx, type);
    }



//    expression: expression L_BRACKET expression R_BRACKET
    public void exitIndexArr(alg.IndexArrContext ctx){

        Symbol.PType expr1 = exprType.get(ctx.expression(0));
        Symbol.PType expr2 = exprType.get(ctx.expression(1));
        if(expr1 == Symbol.PType.ERR || expr2 == Symbol.PType.ERR)
        {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if( isPointerType(expr1) && expr1 != Symbol.PType.POINTER_VOID && expr2 == Symbol.PType.INT)
        {
            exprType.put(ctx, expr1);
        }
        else {
            exprType.put(ctx, Symbol.PType.ERR);
            System.err.println("Expected a boolean type in line " + ctx.start.getLine());
            this.semanticErrors++;
        }


    }
//    expression: (PLUS | MINUS | NOT | QUESTION) expression

    public void exitUnary(alg.UnaryContext ctx) {
        Symbol.PType type = exprType.get(ctx.expression());
        if (type == Symbol.PType.ERR) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if (ctx.NOT() != null) {
            if (type == Symbol.PType.BOOL) exprType.put(ctx, Symbol.PType.BOOL);
            else {
                System.err.println("Expected a boolean type in line " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
            return;
        }

        if (ctx.PLUS() != null || ctx.MINUS() != null) {
            if (type == Symbol.PType.INT) exprType.put(ctx, Symbol.PType.INT);
            else if (type == Symbol.PType.FLOAT) exprType.put(ctx, Symbol.PType.FLOAT);
            else {
                System.err.println("Expected a INT or FLOAT type in line " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
        }
        if (ctx.QUESTION() != null) { //Pointer Extraction
            if ((ctx.expression().start.getType() == algLexer.INDENT || (ctx.expression() instanceof alg.IndexArrContext))
                    && !isPointerType(type) && isPrimitiveType(type)) {
                exprType.put(ctx, primitiveToPointertype(type));
            } else {
                System.err.println("Mismatched type for pointer extraction in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
        }
    }


//TODO must check type uppercast and downcast

    //    expression: expression (MULT | DIV | REMAIN) expression
    public void exitMultDiv(alg.MultDivContext ctx) {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        if (type1 == Symbol.PType.ERR || type2 == Symbol.PType.ERR) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if (ctx.REMAIN() != null) {
            if (type1 == Symbol.PType.INT && type2 == Symbol.PType.INT) {
                exprType.put(ctx, Symbol.PType.INT);
                System.out.println("REMAINDER : INT");
            } else {

                System.err.println("Expected to have INT % INT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;

            }

        } else //Multiplication and Division
        {
            if (type1 == Symbol.PType.INT && type2 == Symbol.PType.INT) {
                exprType.put(ctx, Symbol.PType.INT);

//                System.out.println("MULTIDIV: INT");
            } else if ((type1 == Symbol.PType.FLOAT && type2 == Symbol.PType.INT) || (type2 == Symbol.PType.FLOAT && type1 == Symbol.PType.INT)) {
                exprType.put(ctx, Symbol.PType.FLOAT);
//                System.out.println("MULTIDIV: FLOAT");
            } else {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
        }
    }



// expression (PLUS | MINUS) expression
    public void exitPlusMinus(alg.PlusMinusContext ctx) {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        if (type1 == Symbol.PType.ERR || type2 == Symbol.PType.ERR) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if(isNumericType(type1) && isNumericType(type2)){
            if (type1 == Symbol.PType.INT && type2 == Symbol.PType.INT) {
                exprType.put(ctx, Symbol.PType.INT);
            } else if ((type1 == Symbol.PType.FLOAT && type2 == Symbol.PType.INT) || (type2 == Symbol.PType.FLOAT && type1 == Symbol.PType.INT)) {
                exprType.put(ctx, Symbol.PType.FLOAT);
            } else {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
        }
        else if (isPointerType(type1) && type2== Symbol.PType.INT){
            if(isEmptyPointerType(type1)){
                System.err.println("Cannot add/subtract Array position with VOID type. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
            else {
                exprType.put(ctx, type1);
            }
        }
        else{
            if( type2 != Symbol.PType.INT){
                System.err.println("Cannot add/subtract Array position with other types! Should be INT. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;

            }
            else {
                System.err.println("We only add/subtract to number types (int or float) or array types. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
        }
    }



    //    /**
//     *
//     * @param type
//     * @return
//     */
//    private boolean isPrimitiveType(Symbol.PType type){
//        return type != Symbol.PType.ERR && type != Symbol.PType.NULL && type != Symbol.PType.VOID;
//    }
    //expression : expression ('<' | '>' | '<=' | '>=' | '==' | '!=') expression
    public void exitBinaryComparator(alg.BinaryComparatorContext ctx) {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        if (type1 == Symbol.PType.ERR || type2 == Symbol.PType.ERR) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }

        // == || !=
        if (ctx.IS_EQUAL() != null || ctx.DIFERENT() != null) {
            if (isPrimitiveType(type1) && isPrimitiveType(type2) && type1 == type2) { //primitive types
                exprType.put(ctx, Symbol.PType.BOOL);
            } else if (isEmptyPointerType(type1) && isPointerType(type2) || isPointerType(type1) && isEmptyPointerType(type2)
                    || type1 == type2) //pointers
            {
                exprType.put(ctx, Symbol.PType.BOOL);
            } else {
                System.err.println("Can't compare different types. Expected primitive values or pointer types with same type. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
            }
        } else {

            if (isNumericType(type1) && isNumericType(type2)) {


                exprType.put(ctx, Symbol.PType.BOOL);
            } else {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;

            }
        }
    }



    // expression: expression AND expression
    public void exitAndComparator(alg.AndComparatorContext ctx) {

        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));

        if (type1 == Symbol.PType.ERR || type2 == Symbol.PType.ERR) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if (type1 == Symbol.PType.BOOL && type1 == type2) {
            exprType.put(ctx, Symbol.PType.BOOL);
        } else {
            System.err.println("Expected two BOOL but other type was given. Error in line: " + ctx.start.getLine());
            exprType.put(ctx, Symbol.PType.ERR);
            this.semanticErrors++;
        }
    }


//    public void exitArg(alg.ArgContext ctx)
//    {
//
//        for (alg.Simple_declarationContext terminalNode : ctx.simple_declaration()) {
//           Symbol s = this.currentScope.resolve(terminalNode.getText());
//           System.out.println(s.type);
////            Symbol.PType type = exprType.get(terminalNode);
////            terminalNode.type();
////            Symbol s = new Symbol(type.toString(), terminalNode.getText());
////            this.currentFunction.arguments.add(s);
//        }
//    }

    public 	void exitFunctionIn(alg.FunctionInContext ctx)
    {
        FunctionSymbol s = (FunctionSymbol) this.globalScope.resolve(ctx.function_invocation().INDENT().getText());
        ArrayList<Symbol.PType> arr1 = new ArrayList<>();
        for (Symbol sym : s.arguments) {
            arr1.add(sym.type);
        }

        ArrayList<Symbol.PType> arr2 = new ArrayList<>();

        for(alg.ExpressionContext expr : ctx.function_invocation().expression_list().expression())
        {
            Symbol ss = this.currentScope.resolve(expr.start.getText());
            if(ss != null)
            {
                arr2.add(ss.type);
            }
            else
            {
                arr2.add(exprType.get(expr));
            }
        }

        if(arr1.size() != arr2.size())
        {
            System.err.println("Expecting " + arr1.size() + " argument(s)b but " + arr2.size() + " was given.");

            exprType.put(ctx, Symbol.PType.ERR);
            this.semanticErrors++;
            return;
        }



        for (int i = 0; i < arr2.size(); i++) {
            Symbol temp = new Symbol(arr2.get(i).toString(), "temp");
            if(!temp.isConvertible(arr1.get(i)))
            {
                System.err.println("Expecting type " + arr1.get(i).toString() + " but " + arr2.get(i).toString() + " was given.");
                exprType.put(ctx, Symbol.PType.ERR);
                this.semanticErrors++;
                return;
            }
        }
    }



    // expression : expression OR expression
    public void exitOrComparator(alg.OrComparatorContext ctx) {

        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        if (type1 == Symbol.PType.ERR || type2 == Symbol.PType.ERR) {
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if (type1 == Symbol.PType.BOOL && type1 == type2) {
            exprType.put(ctx, Symbol.PType.BOOL);
        } else {
            System.err.println("Expected two BOOL but other type was given. Error in line: " + ctx.start.getLine());
            exprType.put(ctx, Symbol.PType.ERR);
            this.semanticErrors++;
        }
    }


    // ******************************************************
    // ***************  FUNCTION INVOCATION   ****************
    // ******************************************************


    // ******************************************************
    // *************** INSTRUCTIONS  ****************
    // ******************************************************

    //    atribuition : (INDENT | index_pointer) EQUAL expression  ;
    public void exitAtribuition(alg.AtribuitionContext ctx) {
        String variableName = ctx.INDENT().getText();
        Symbol s = this.currentScope.resolve(variableName);
        Symbol.PType expresssion_type = exprType.get(ctx.expression());
        if (s == null) {
            System.err.println("Undefined variable " + variableName + " in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if(expresssion_type == Symbol.PType.VOID || !s.isConvertible(expresssion_type)){
            System.err.println("Cannot assign  " + variableName + " as variable in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        exprType.put(ctx, s.type); // TODO i'm not sure about add this one. acjo qiue sim, porque podemos inicialziar uma varial e atribuir logo
    }


    // function_invocation_special -> (WRITE | WRITELN) '(' expression_list ')'
    public void exitWriteFunction(alg.WriteFunctionContext ctx) {
        List<alg.ExpressionContext> expressions = ctx.expression_list().expression();
        for (alg.ExpressionContext expr : expressions) {
            if (isPointerType(exprType.get(expr)))
                System.err.println("Cannot print pointer types");
        }

    }


    public void exitArg(alg.ArgContext ctx) {

        for (alg.Simple_declarationContext terminalNode : ctx.simple_declaration()) {
            Symbol s = this.currentScope.resolve(terminalNode.INDENT().get(0).getText());
            this.currentFunction.arguments.add(s);
        }
    }


    //    public void exitArg(alg.ArgContext ctx)
//    {
//
//        for (alg.Simple_declarationContext terminalNode : ctx.simple_declaration()) {
//           Symbol s = this.currentScope.resolve(terminalNode.getText());
//           System.out.println(s.type);
////            Symbol.PType type = exprType.get(terminalNode);
////            terminalNode.type();
////            Symbol s = new Symbol(type.toString(), terminalNode.getText());
////            this.currentFunction.arguments.add(s);
//        }
//    }


}
