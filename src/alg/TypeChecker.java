package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
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


    public void enterStart(alg.StartContext ctx) {
        globalScope = new Scope(null);
        this.currentScope = globalScope;
        validated = true;
    }

    //estamos a imprimir só para ver todos os símbolos que foram criados no scope global
    //está aqui para informação de debug
    public void exitStart(alg.StartContext ctx) {
        if(globalScope.resolve("alg") != null)
            System.out.println(this.currentScope.toString());
        else
            System.err.println("Missing principal function 'alg'");
    }



    //simple_declaration : type INDENT (COMMA INDENT)*; //int i,j)
    public void exitSimple_declaration(alg.Simple_declarationContext ctx) {

        //Iterate in the INDENT list (simple_declaration : type INDENT (COMMA INDENT)*; //int i,j) and save all the symbols.
        for (TerminalNode terminalNode : ctx.INDENT()) {
            defineSymbol(ctx, new Symbol(ctx.type().start.getText(), terminalNode.getText())); //esta na tabela de simbolos
        }
    }

//    public void exitInitialization_declaration(alg.Initialization_declarationContext ctx)
//    {
//        defineSymbol(ctx, new Symbol(ctx.type().start.getText(), ctx.INDENT().getText()));
//    }

    // function_invocation_special -> (WRITE | WRITELN) '(' expression_list ')'
    public void exitWriteFunction(alg.WriteFunctionContext ctx){
//        Symbol.PType e1 = exprType.get(ctx.getToken()
        List<alg.ExpressionContext> expressions = ctx.expression_list().expression();
        for( alg.ExpressionContext expr : expressions){
           if(exprType.get(expr).toString().contains("POINTER"))
               System.err.println("Cannot print pointer types");
        }

    }


}
