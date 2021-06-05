
package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import Symbols.Type;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

public class TypeChecker extends algBaseListener {

    public TypeChecker(List<FunctionSymbol> functionSymbolList){
        this.functionSymbolList = functionSymbolList;

    }

    public Scope globalScope;
    public Scope currentScope;
    private FunctionSymbol currentFunction;
    private List<FunctionSymbol> functionSymbolList;
    public int semanticErrors;
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();


    ParseTreeProperty<Type> exprType = new ParseTreeProperty<>(); //tabela de simbolos


    /**
     * O antlr corre sempre esta funcao
     * @param ctx
     */
    public void exitEveryRule(ParserRuleContext ctx)
    {
        if(this.scopes.get(ctx)==null)
        {
            this.scopes.put(ctx,this.currentScope);
        }
    }

    //métodos auxiliar (é usado em 2 regras gramaticais)
    private boolean defineSymbol(ParserRuleContext ctx, Symbol s) {
        if (!this.currentScope.define(s)) {
            System.err.println("Redefining previously defined variable " + s.name + " in line " + ctx.start.getLine());
            this.semanticErrors++;
            return false;
        }
        return true;
    }

//    /**
//     * Set symbol type for class symbol considering pointer types
//     * bad practice, but easy way to do it
//     *
//     * @param symbol
//     * @return string
//     */
//    //int x
//    private String setSymbolType(String symbol) {
//        String result = symbol;
//        if (symbol.equals("<string>")) {
//            result = "POINTER_STRING";
//        } else if (symbol.equals("<float>")) {
//            result = "POINTER_FLOAT";
//        } else if (symbol.equals("<int>")) {
//            result = "POINTER_INT";
//        } else if (symbol.equals("<bool>")) {
//            result = "POINTER_BOOL";
//        } else if (symbol.equals("<void>")) {
//            result = "POINTER_VOID";
//        } else if (symbol.equals("null")) {
//            result = "POINTER_VOID";
//        }
//
//        return result;
//    }


//    /**
//     * Returns if symbols is a pointer or not
//     *
//     * @param symbol
//     */
//    private boolean isPointerType(Type.PType type) {
//        return type.toString().contains("POINTER");
//    }

//    /**
//     * Returns if symbols is a void pointer
//     *
//     * @param symbol
//     */
//    private boolean isEmptyPointerType(Symbol.PType symbol) {
//        return symbol.toString().contains("POINTER_VOID");
//    }
//

//    /**
//     * Check if is primitive type (everything excepts void)
//     *
//     * @param symbol
//     * @return
//     */
//    private boolean isPrimitiveType(Symbol.PType symbol) {
//        return symbol != Symbol.PType.VOID;
////        return !isPointerType(symbol) && symbol != Symbol.PType.VOID;
//
//    }

//    /**
//     * Check if a type is numeric (int || float)
//     *
//     * @param type
//     * @return boolean
//     */
//    private boolean isNumericType(Symbol.PType type) {
//        return type == Symbol.PType.INT || type == Symbol.PType.FLOAT;
//
//    }


//    /**
//     * Transforms primitive type into pointer type
//     *
//     * @param primitive type (int, bool, float, null, void)
//     * @return pointer type
//     */
//    private Symbol.PType primitiveToPointertype(Symbol.PType primitive) {
//        Symbol.PType result = primitive;
//        if (primitive == Symbol.PType.INT)
//            result = Symbol.PType.POINTER_INT;
//        else if (primitive == Symbol.PType.BOOL)
//            result = Symbol.PType.POINTER_BOOL;
//        else if (primitive == Symbol.PType.FLOAT)
//            result = Symbol.PType.POINTER_FLOAT;
//        else if (primitive == Symbol.PType.STRING)
//            result = Symbol.PType.POINTER_STRING;
//        return result;
//
//    }


    // ******************************************************
    // *******************  START   *******************
    // ******************************************************


    //Entra na regra principal da gramatica e inicializa os scopes
    public void enterStart(alg.StartContext ctx) {
        globalScope = new Scope(null);
        this.currentScope = globalScope;
        //info from the 2nd listner
        for(FunctionSymbol f : functionSymbolList){
            defineSymbol(ctx, f);
        }

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
            exprType.put(ctx, new Type(Type.PType.ERROR));
            return;
        }
        if (s instanceof FunctionSymbol) {
            System.err.println("Using function symbol " + variableName + " as variable in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, new Type(Type.PType.ERROR));
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
            defineSymbol(ctx, new Symbol(new Type(ctx.type().getText()), terminalNode.getText())); //esta na tabela de simbolos
        }
    }


    //Saida de uma initialization_declaration, define um symbol para a dada inicializacao
    public void exitInitialization_declaration(alg.Initialization_declarationContext ctx) {
        defineSymbol(ctx, new Symbol(new Type(ctx.type().getText()), ctx.INDENT().getText()));

    }


    //Entra em uma declaração de uma função, define um novo scope  e um novo symbol para esta nova função.
    public void enterFunction_declaration(alg.Function_declarationContext ctx) {
        FunctionSymbol f = null;
        String functionName = null;
        if (ctx.INDENT() != null) {
            functionName = ctx.INDENT().getText();
            String type = ctx.function_type().start.getText();
//            f = new FunctionSymbol(type, functionName);
            f = (FunctionSymbol) this.currentScope.resolve(functionName);
            if (ctx.function_type() == null) {
                return;
            }
        }


        if (ctx.INDENT() == null) {
            functionName = ctx.main_function_declaration().ALG().getText();
            String type = ctx.main_function_declaration().INT(0).getText();
//            f = new FunctionSymbol(type, functionName);
            f = (FunctionSymbol) this.currentScope.resolve(functionName);

        }


//        if (defineSymbol(ctx, f)) {



            //para além de adicionarmos a função à tabela de símbolos, esta vai criar um novo enquadramento local
            //isto tem que ser feito quando entramos, porque caso existam argumentos formais, estes devem já ser guardados
            //dentro do enquadramento local da função. É mais fácil fazer isto se o enquadramento já estiver criado.
            //Existem linguagens onde os argumentos formais são guardados num enquadramento à parte especial só para os argumentos.
            //mas não é este o caso aqui.

            this.currentFunction = f;
            this.currentScope = new Scope(this.currentScope);
//        }
    }


    public void exitFunction_declaration(alg.Function_declarationContext ctx) {
        if (this.currentFunction == null) return;


        //Print arguments
//        for (Symbol s : this.currentFunction.arguments) {
//            System.out.println("Argument: " + s.name + " Tipo: " + s.type);
//
//        }


        //imprimir o enquadramento local, só para efeito de debug
        // System.out.println("Local scope for function " + this.currentFunction.name + ": " + this.currentScope.toString());
        this.currentFunction = null;

        //temos de sair do contexto local da função
        currentScope = currentScope.getParentScope();
    }

    public void exitMain_function_declaration(alg.Main_function_declarationContext ctx) {


        if (ctx.INT(1) == null || ctx.STRING() == null) {
            exprType.put(ctx, new Type(Type.PType.ERROR));
            System.err.println("Wrong arguments were passed to the main function. Error in Line:" + ctx.start.getLine());
            this.semanticErrors++;
            return;
        }
        Symbol s1 = new Symbol(new Type(ctx.INT(1).toString()), ctx.INDENT(0).getText());
        defineSymbol(ctx, s1);

//        Symbol s2 = new Symbol("POINTER_STRING", ctx.INDENT(1).getText());
        Symbol s2 = new Symbol(new Type("<string>"), ctx.INDENT(1).getText());
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
        exprType.put(ctx, new Type (Type.PType.INT));
    }

    public void exitNull(alg.NullContext ctx) {
        exprType.put(ctx, new Type( Type.PType.VOID));
    }

    public void exitFloat(alg.FloatContext ctx) {
        exprType.put(ctx, new Type(Type.PType.FLOAT));
    }

    public void exitString(alg.StringContext ctx) {
        exprType.put(ctx, new Type(Type.PType.STRING));
    }

    public void exitTrue(alg.TrueContext ctx) {
        exprType.put(ctx, new Type(Type.PType.BOOLEAN));
    }

    public void exitFalse(alg.FalseContext ctx) {
        exprType.put(ctx, new Type(Type.PType.BOOLEAN));
    }



    // ################### expressions
//    expression: L_PAREN expression R_PAREN
    public void exitParenExpr(alg.ParenExprContext ctx) {
        Type type = exprType.get(ctx.expression());
        if (type.isError()) {
            exprType.put(ctx, new Type(Type.PType.ERROR));
            return;
        }
        exprType.put(ctx, type);
    }


    //    expression: expression L_BRACKET expression R_BRACKET
    public void exitIndexArr(alg.IndexArrContext ctx) {

        Type expr1 = exprType.get(ctx.expression(0));
        Type expr2 = exprType.get(ctx.expression(1));
        if (expr1.isError() || expr2.isError()) {
            exprType.put(ctx, new Type(Type.PType.ERROR));
            return;
        }
        if (expr1.isPointer() && !expr1.isEmptyPointerType() && expr2.getPrimitiveType() == Type.PType.INT) {
            exprType.put(ctx, new Type(false, expr1.getPrimitiveType()));
        } else {
            exprType.put(ctx, new Type(Type.PType.ERROR));
            System.err.println("Expected a boolean type in line " + ctx.start.getLine());
            this.semanticErrors++;
        }


    }


    //    expression: (PLUS | MINUS | NOT | QUESTION) expression
    public void exitUnary(alg.UnaryContext ctx) {
        Type type = exprType.get(ctx.expression());
        if (type.isError()) {
            exprType.put(ctx, new Type(Type.PType.ERROR));
            return;
        }
        if (ctx.NOT() != null) {
            if (type.getPrimitiveType() == Type.PType.BOOLEAN) exprType.put(ctx, new Type(Type.PType.BOOLEAN));
            else {
                System.err.println("Expected a boolean type in line " + ctx.start.getLine());
                exprType.put(ctx, new Type(Type.PType.ERROR));
                this.semanticErrors++;
            }
            return;
        }

        if (ctx.PLUS() != null || ctx.MINUS() != null) {
            if (type.getPrimitiveType() == Type.PType.INT) exprType.put(ctx, new Type(Type.PType.INT));
            else if (type.getPrimitiveType() == Type.PType.FLOAT) exprType.put(ctx, new Type(Type.PType.FLOAT));
            else {
                System.err.println("Expected a INT or FLOAT type in line " + ctx.start.getLine());
                exprType.put(ctx, new Type(Type.PType.ERROR));
                this.semanticErrors++;
            }
        }
        if (ctx.QUESTION() != null) { //Pointer Extraction
            if ((ctx.expression().start.getType() == algLexer.INDENT || (ctx.expression() instanceof alg.IndexArrContext))
                    && !type.isEmptyPointerType() && type.isPrimitiveType() && !type.isPointer()) {
                exprType.put(ctx, new Type(true,type.getPrimitiveType()));
//                exprType.put(ctx, primitiveToPointertype(type));
            } else {
                System.err.println("Mismatched type for pointer extraction in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
            }
        }
    }


//TODO must check type uppercast and downcast

    //    expression: expression (MULT | DIV | REMAIN) expression
    public void exitMultDiv(alg.MultDivContext ctx) {
        Type type1 = exprType.get(ctx.expression(0));
        Type type2 = exprType.get(ctx.expression(1));
        if (type1.isError() || type2.isError()) {
            exprType.put(ctx, new Type (Type.PType.ERROR));
            return;
        }
        if (ctx.REMAIN() != null) {
            if (type1.getPrimitiveType() == Type.PType.INT && type2.getPrimitiveType() == Type.PType.INT) {
                exprType.put(ctx, new Type(Type.PType.INT));

                // System.out.println("REMAINDER : INT");
            } else {

                System.err.println("Expected to have INT % INT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;

            }

        } else //Multiplication and Division
        {
            if (type1.getPrimitiveType() == Type.PType.INT && type2.getPrimitiveType() == Type.PType.INT) {
                exprType.put(ctx, new Type(Type.PType.INT));

//                System.out.println("MULTIDIV: INT");
            } else if ((type1.getPrimitiveType() == Type.PType.FLOAT && type2.getPrimitiveType() == Type.PType.INT) ||
                    (type2.getPrimitiveType() == Type.PType.FLOAT && type1.getPrimitiveType() == Type.PType.INT)) {
                exprType.put(ctx, new Type(Type.PType.FLOAT));
//                System.out.println("MULTIDIV: FLOAT");
            } else {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
            }
        }
    }


    // expression (PLUS | MINUS) expression
    public void exitPlusMinus(alg.PlusMinusContext ctx) {
        Type type1 = exprType.get(ctx.expression(0));
        Type type2 = exprType.get(ctx.expression(1));
        if (type1.isError()|| type2.isError()) {
            exprType.put(ctx,new Type (Type.PType.ERROR));
            return;
        }
        if (type1.isNumericType() && type2.isNumericType()) {
            if (type1.getPrimitiveType() == Type.PType.INT && type2.getPrimitiveType() == Type.PType.INT) {
                exprType.put(ctx, new Type(Type.PType.INT));
            } else if ((type1.getPrimitiveType() == Type.PType.FLOAT && type2.getPrimitiveType() == Type.PType.INT)
                    || (type2.getPrimitiveType() == Type.PType.FLOAT && type1.getPrimitiveType() == Type.PType.INT)) {
                exprType.put(ctx, new Type(Type.PType.FLOAT));
            } else {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
            }
        } else if (type1.isPointer() && type2.getPrimitiveType() == Type.PType.INT) {
            if (type1.isEmptyPointerType()) {
                System.err.println("Cannot add/subtract Array position with VOID type. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
            } else {
                exprType.put(ctx, type1);
            }
        } else {
            if (type2.getPrimitiveType() != Type.PType.INT) {
                System.err.println("Cannot add/subtract Array position with other types! Should be INT. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;

            } else {
                System.err.println("We only add/subtract to number types (int or float) or array types. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
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
        Type type1 = exprType.get(ctx.expression(0));
        Type type2 = exprType.get(ctx.expression(1));
        if (type1.isError() || type2.isError()) {
            exprType.put(ctx, new Type (Type.PType.ERROR));
            return;
        }

        // == || !=
        if (ctx.IS_EQUAL() != null || ctx.DIFERENT() != null) {
            if (type1.isPrimitiveType() && type2.isPrimitiveType() && type1 == type2) { //primitive types
                exprType.put(ctx, new Type (Type.PType.BOOLEAN));
            } else if (type1.isEmptyPointerType() && type2.isPointer() || type1.isPointer() && type2.isEmptyPointerType()
                    || type1 == type2) //pointers
            {
                exprType.put(ctx,new Type (Type.PType.BOOLEAN));
            } else {
                System.err.println("Can't compare different types. Expected primitive values or pointer types with same type. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
            }
        } else {

            if ((type1.isNumericType()) && (type2.isNumericType())) {


                exprType.put(ctx, new Type (Type.PType.BOOLEAN));
            } else {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
                return;
            }
        }
    }


    // expression: expression AND expression
    public void exitAndComparator(alg.AndComparatorContext ctx) {

        Type type1 = exprType.get(ctx.expression(0));
        Type type2 = exprType.get(ctx.expression(1));

        if (type1.isError() || type2.isError()) {
            exprType.put(ctx,new Type (Type.PType.ERROR));
            return;
        }
        if (type1.getPrimitiveType() == Type.PType.BOOLEAN && type1 == type2) {
            exprType.put(ctx, new Type(Type.PType.BOOLEAN));
        } else {
            System.err.println("Expected two BOOL but other type was given. Error in line: " + ctx.start.getLine());

            exprType.put(ctx, new Type (Type.PType.ERROR));
            this.semanticErrors++;
        }
    }


    // expression : expression OR expression
    public void exitOrComparator(alg.OrComparatorContext ctx) {

        Type type1 = exprType.get(ctx.expression(0));
        Type type2 = exprType.get(ctx.expression(1));
        if (type1.isError() || type2.isError()) {
            exprType.put(ctx, new Type (Type.PType.ERROR));
            return;
        }
        if (type1.getPrimitiveType() == Type.PType.BOOLEAN && type1 == type2) {
            exprType.put(ctx, new Type (Type.PType.BOOLEAN));
        } else {
            System.err.println("Expected two BOOL but other type was given. Error in line: " + ctx.start.getLine());
            exprType.put(ctx, new Type (Type.PType.ERROR));
            this.semanticErrors++;
        }
    }


    // ******************************************************
    // ***************  FUNCTION INVOCATION   ****************
    // ******************************************************

    public void exitFunctionIn(alg.FunctionInContext ctx) {
        FunctionSymbol s = (FunctionSymbol) this.globalScope.resolve(ctx.function_invocation().INDENT().getText());
        ArrayList<Type> arr1 = new ArrayList<>();
        for (Symbol sym : s.arguments) {
            arr1.add(sym.type);
        }

        ArrayList<Type> arr2 = new ArrayList<>();

        for (alg.ExpressionContext expr : ctx.function_invocation().expression_list().expression()) {
            Symbol ss = this.currentScope.resolve(expr.start.getText());
            if (ss != null) {
                arr2.add(ss.type);
            } else {
                arr2.add(exprType.get(expr));
            }
        }

        if (arr1.size() != arr2.size()) {
            System.err.println("Expecting " + arr1.size() + " argument(s)b but " + arr2.size() + " was given. Error in line: " + ctx.start.getLine());
            exprType.put(ctx, new Type (Type.PType.ERROR));
            this.semanticErrors++;
            return;
        }


        for (int i = 0; i < arr2.size(); i++) {
//            Symbol temp = new Symbol(arr2.get(i), "temp");
            Type temp = arr2.get(i);
//            if (!  temp.isConvertible(arr1.get(i))) {
            if (!Type.isConvertibleTo(temp,arr1.get(i))) {
                System.err.println("Expecting type " + arr1.get(i).toString() + " but " + arr2.get(i).toString() + " was given. Error in line: " + ctx.start.getLine());
                this.semanticErrors++;
                return;
            }
        }
    }

    public void exitBody(alg.BodyContext ctx) {
        alg.BlockContext mainBlock = ctx.block();
        boolean hasReturn = false;
        boolean isvoid = false;

        //Check to see if function type if void, because the return keyword is optional
        if (this.currentFunction.type.getPrimitiveType() == Type.PType.VOID) {
            isvoid = true;
        }

        for (alg.InstructionsContext instruction : mainBlock.instructions()) {
            //In case the return has already been declared there shouldnt be any more instructions after it.
            if (hasReturn) {
                System.err.println("Return should be the last instruction at line " + instruction.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
            }

            //If conditions is met, means that the function has a return in it. It also checks if matches the function type
            if (instruction.instruction_control() != null && instruction.instruction_control().RETURN() != null) {
                hasReturn = true;
                Type type_expression = exprType.get(instruction.instruction_control().expression());
//                if (type_expression == null || !new Symbol(type_expression, "temp").isConvertible(this.currentFunction.type)) {
                if (type_expression == null || ! Type.isConvertibleTo(type_expression, this.currentFunction.type)) {
                    System.err.println("Function " + this.currentFunction.name + " expects to return type: " + this.currentFunction.type + "Error in line: " + ctx.start.getLine());
                    exprType.put(ctx, new Type (Type.PType.ERROR));
                    this.semanticErrors++;
                }

            }
        }

        //If return is not optional and there was no return it is an error.
        if (!hasReturn && !isvoid) {
            System.err.println("Function " + this.currentFunction.name + " is expecting a return. Error in line: " + ctx.start.getLine());
            this.semanticErrors++;
        }
    }


    public void exitCycle(alg.CycleContext ctx) {
        boolean leaveRestarUsed = false;

        for (alg.Instructions_cycleContext instruction : ctx.instructions_cycle()) {

            if (leaveRestarUsed && instruction.expression() == null) {
                System.err.println("Leave and Restart should be the last instruction inside the cycle. Error in line: " + instruction.start.getLine());
                exprType.put(ctx, new Type (Type.PType.ERROR));
                this.semanticErrors++;
                return;
            }


            if (instruction.instruction_control_cycle() != null) {
                boolean hasLeave = instruction.instruction_control_cycle().LEAVE() != null;
                boolean hasRestart = instruction.instruction_control_cycle().RESTART() != null;

                if (hasRestart || hasLeave) leaveRestarUsed = true;
            }

        }
    }

    // ******************************************************
    // *************** INSTRUCTIONS  ****************
    // ******************************************************

    //    atribuition : (INDENT | index_pointer) EQUAL expression  ;
    public void exitAtribuition(alg.AtribuitionContext ctx) {
        String variableName = ctx.INDENT().getText();
        Symbol s = this.currentScope.resolve(variableName);
        Type expresssion_type = exprType.get(ctx.expression());
        if (s == null) {
            System.err.println("Undefined variable " + variableName + " in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, new Type (Type.PType.ERROR));
            return;
        }
//        if (expresssion_type.getPrimitiveType() == Type.PType.VOID || !s.isConvertible(expresssion_type)) {
        if (expresssion_type.getPrimitiveType() == Type.PType.VOID || ! Type.isConvertibleTo(s.type, expresssion_type)) {
            System.err.println("Cannot assign  " + variableName + " as variable in line " + ctx.INDENT().getSymbol().getLine());
            this.semanticErrors++;
            exprType.put(ctx, new Type (Type.PType.ERROR));
            return;
        }
        exprType.put(ctx, s.type); // TODO i'm not sure about add this one. acjo qiue sim, porque podemos inicialziar uma varial e atribuir logo
    }


    // function_invocation_special -> (WRITE | WRITELN) '(' expression_list ')'
    public void exitWriteFunction(alg.WriteFunctionContext ctx) {
        List<alg.ExpressionContext> expressions = ctx.expression_list().expression();
        for (alg.ExpressionContext expr : expressions) {
            if (exprType.get(expr).isPointer()) {
                System.err.println("Cannot print pointer types. Error in line: " + ctx.start.getLine());
                this.semanticErrors++;
            }
        }
    }


//    public void exitArg(alg.ArgContext ctx) {
//
//        for (alg.Simple_declarationContext terminalNode : ctx.simple_declaration()) {
//            Symbol s = this.currentScope.resolve(terminalNode.INDENT().get(0).getText());
//
//            this.currentFunction.arguments.add(s);
//        }
//    }



}
