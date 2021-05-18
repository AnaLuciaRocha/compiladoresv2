package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class TypeChecker extends algBaseListener {

    public Scope globalScope;
    public Scope currentScope;
    private FunctionSymbol currentFunction;
    public boolean validated;

    ParseTreeProperty<Symbol.PType> exprType = new ParseTreeProperty<>();
    //métodos auxiliar (é usado em 2 regras gramaticais)
    private boolean defineSymbol(ParserRuleContext ctx, Symbol s)
    {
        if(!this.currentScope.define(s))
        {
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

    }

}
