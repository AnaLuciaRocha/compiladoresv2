package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ListIterator;

public class TypeChecker extends algBaseListener {

    public Scope globalScope;
    public Scope currentScope;
    private FunctionSymbol currentFunction;
    public boolean validated;

    ParseTreeProperty<Symbol.PType> exprType = new ParseTreeProperty<>();

    //métodos auxiliar (é usado em 2 regras gramaticais)
    private boolean defineSymbol(ParserRuleContext ctx, Symbol s) {
        if (!this.currentScope.define(s)) {
            //estejam à vontade para mudar as mensagens de erro!
            //ou adicionar mais informação, como por exemplo qual a posição da linha onde começa a variável com erro
            //ou até mesmo onde é que está definida a variável original...
            System.err.println("Redefining previously defined variable " + s.name + " in line " + ctx.start.getLine());
            validated = false;
            return false;
        }
        return true;
    }


    //Entra na regra principal da gramatica e inicializa os scopes
    public void enterStart(alg.StartContext ctx) {
        globalScope = new Scope(null);
        this.currentScope = globalScope;
        validated = true;
    }

    //Saida da regra principal, estamos a imprimir só para ver todos os símbolos que foram criados no scope global
    //está aqui para informação de debug
    public void exitStart(alg.StartContext ctx) {
        System.out.println(this.currentScope.toString());
    }


    //Saida de uma variavel. Retorna erro caso a variavel nao foi definida antes ou é utilizada como uma função.
    public void exitVar(alg.VarContext ctx)
    {

        String variableName = ctx.INDENT().getText();
        Symbol s = this.currentScope.resolve(variableName);
        System.out.println("aa");
        if(s == null) {
            System.err.println("Undefined variable " + variableName + " in line " + ctx.INDENT().getSymbol().getLine());
            this.validated = false;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if(s instanceof FunctionSymbol) {
            System.err.println("Using function symbol " + variableName + " as variable in line " + ctx.INDENT().getSymbol().getLine());
            this.validated = false;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }

        exprType.put(ctx, s.type);
    }

    //Saida de uma simple_declaration, define os symbols iterando sobre a lista de indentificadores
    public void exitSimple_declaration(alg.Simple_declarationContext ctx) {

        //Iterate in the INDENT list (simple_declaration : type INDENT (COMMA INDENT)*; //int i,j) and save all the symbols.
        for (TerminalNode terminalNode : ctx.INDENT()) {
            defineSymbol(ctx, new Symbol(ctx.type().start.getText(), terminalNode.getText()));
        }

    }

    //Saida de uma initialization_declaration, define um symbol para a dada inicializacao
    public void exitInitialization_declaration(alg.Initialization_declarationContext ctx) {
        defineSymbol(ctx, new Symbol(ctx.type().start.getText(), ctx.INDENT().getText()));
    }


    //Entra em uma declaração de uma função, define um novo scope  e um novo symbol para esta nova função.
    public void enterFunction_declaration(alg.Function_declarationContext ctx)
    {
        FunctionSymbol f;
        String functionName = ctx.INDENT().getText();

        if(ctx.function_type() == null)
        {
            return;
        }
        String type = ctx.function_type().start.getText();
        f = new FunctionSymbol(type,functionName);

        if(defineSymbol(ctx,f))
        {
            //para além de adicionarmos a função à tabela de símbolos, esta vai criar um novo enquadramento local
            //isto tem que ser feito quando entramos, porque caso existam argumentos formais, estes devem já ser guardados
            //dentro do enquadramento local da função. É mais fácil fazer isto se o enquadramento já estiver criado.
            //Existem linguagens onde os argumentos formais são guardados num enquadramento à parte especial só para os argumentos.
            //mas não é este o caso aqui.


                for (alg.Simple_declarationContext terminalNode : ctx.arg(0).simple_declaration())
                {

                }



            this.currentFunction = f;
            this.currentScope = new Scope(this.currentScope);
        }
    }

    public void exitFunction_declaration(alg.Function_declarationContext ctx)
    {
        if(this.currentFunction == null) return;



        //Print arguments
        for (Symbol s : this.currentFunction.arguments)
        {
            System.out.println("Argument: " + s.name + " Tipo: " + s.type);
        }


        //imprimir o enquadramento local, só para efeito de debug

        System.out.println("Local scope for function " + this.currentFunction.name + ": " + this.currentScope.toString());
        this.currentFunction = null;

        //temos de sair do contexto local da função
        currentScope = currentScope.getParentScope();
    }

    public void exitAtribuition(alg.AtribuitionContext ctx)
    {
        String variableName = ctx.INDENT().getText();
        Symbol s = this.currentScope.resolve(variableName);
        if(s == null) {
            System.err.println("Undefined variable " + variableName + " in line " + ctx.INDENT().getSymbol().getLine());
            this.validated = false;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }
        if(s instanceof FunctionSymbol) {
            System.err.println("Using function symbol " + variableName + " as variable in line " + ctx.INDENT().getSymbol().getLine());
            this.validated = false;
            exprType.put(ctx, Symbol.PType.ERR);
            return;
        }

        exprType.put(ctx, s.type);
    }

    public void exitInt(alg.IntContext ctx) {
        exprType.put(ctx, Symbol.PType.INT);
    }

    public void exitNull(alg.NullContext ctx)
    {
        exprType.put(ctx, Symbol.PType.NULL);
    }

    public 	void exitDouble(alg.DoubleContext ctx)
    {
        exprType.put(ctx, Symbol.PType.FLOAT);
    }

    public void exitString(alg.StringContext ctx)
    {
        exprType.put(ctx, Symbol.PType.STRING);
    }

    public void exitTrue(alg.TrueContext ctx)
    {
        exprType.put(ctx, Symbol.PType.BOOL);
    }

    public void exitFalse(alg.FalseContext ctx)
    {
        exprType.put(ctx, Symbol.PType.BOOL);
    }

    public void exitParenExpr(alg.ParenExprContext ctx)
    {
        Symbol.PType type = exprType.get(ctx.expression());
        exprType.put(ctx, type);
    }

    public void exitSimpleExpr(alg.SimpleExprContext ctx)
    {
        exprType.put(ctx, exprType.get(ctx.simple_expression()));
    }

    public void exitUnary(alg.UnaryContext ctx)
    {
        Symbol.PType type = exprType.get(ctx.expression());


        if(ctx.NOT() != null)
        {
            if(type == Symbol.PType.BOOL) exprType.put(ctx, Symbol.PType.BOOL);
            else
            {
                System.err.println("Expected a boolean type in line " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.validated = false;
            }
            return;
        }

        if(ctx.PLUS() != null || ctx.MINUS() != null)
        {
            if(type == Symbol.PType.INT) exprType.put(ctx, Symbol.PType.INT);
            else if(type == Symbol.PType.FLOAT) exprType.put(ctx, Symbol.PType.FLOAT);
            else
            {
                System.err.println("Expected a INT or FLOAT type in line " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.validated = false;
            }
        }
    }

    public void exitMultDiv(alg.MultDivContext ctx)
    {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));

        if(ctx.REMAIN() != null)
        {
            if(type1 == Symbol.PType.INT && type2 == Symbol.PType.INT)
            {
                exprType.put(ctx, Symbol.PType.INT);
                System.out.println("REMAINDER : INT");
            }
            else
            {
                System.err.println("Expected to have INT % INT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.validated = false;
            }

        } else //Multiplication and Division
        {
            if(type1 == Symbol.PType.INT && type2 == Symbol.PType.INT)
            {
                exprType.put(ctx, Symbol.PType.INT);
                System.out.println("MULTIDIV: INT");
            }
            else if((type1 == Symbol.PType.FLOAT && type2 == Symbol.PType.INT) || (type2 == Symbol.PType.FLOAT && type1 == Symbol.PType.INT))
            {
                exprType.put(ctx, Symbol.PType.FLOAT);
                System.out.println("MULTIDIV: FLOAT");
            }
            else
            {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.validated = false;
            }
        }
    }


    public 	void exitBinaryComparator(alg.BinaryComparatorContext ctx)
    {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        boolean isNumeric1 = type1 == Symbol.PType.INT || type1 == Symbol.PType.FLOAT;
        boolean isNumeric2  = type2 == Symbol.PType.INT || type2 == Symbol.PType.FLOAT;
        boolean isPrimitive = type1 != Symbol.PType.ERR && type1 != Symbol.PType.NULL && type1 != Symbol.PType.VOID;


        if(ctx.IS_EQUAL() != null || ctx.DIFERENT() != null)
        {
            if(isPrimitive && type1 == type2)
            {
                exprType.put(ctx, Symbol.PType.BOOL);
            }
            else
            {
                System.err.println("Expected primitive values. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.validated = false;
            }
        }
        else
        {
            if(isNumeric1 && isNumeric2)
            {
                exprType.put(ctx, Symbol.PType.BOOL);
            }
            else
            {
                System.err.println("Expected an INT or FLOAT but other type was given. Error in line: " + ctx.start.getLine());
                exprType.put(ctx, Symbol.PType.ERR);
                this.validated = false;
            }
        }
    }

    public void exitAndComparator(alg.AndComparatorContext ctx)
    {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        if(type1 == Symbol.PType.BOOL && type1 == type2)
        {
            exprType.put(ctx, Symbol.PType.BOOL);
        }
        else
        {
            System.err.println("Expected two BOOL but other type was given. Error in line: " + ctx.start.getLine());
            exprType.put(ctx, Symbol.PType.ERR);
            this.validated = false;
        }
    }

    public void exitOrComparator(alg.OrComparatorContext ctx)
    {
        Symbol.PType type1 = exprType.get(ctx.expression(0));
        Symbol.PType type2 = exprType.get(ctx.expression(1));
        if(type1 == Symbol.PType.BOOL && type1 == type2)
        {
            exprType.put(ctx, Symbol.PType.BOOL);
        }
        else
        {
            System.err.println("Expected two BOOL but other type was given. Error in line: " + ctx.start.getLine());
            exprType.put(ctx, Symbol.PType.ERR);
            this.validated = false;
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
