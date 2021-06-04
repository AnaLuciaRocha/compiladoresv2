package alg;

import Symbols.FunctionSymbol;

import Symbols.Symbol;
import Symbols.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclarationChecker extends algBaseListener {


    private FunctionSymbol currentFunction;
    public List<FunctionSymbol> functionList;



    //Entra na regra principal da gramatica e inicializa os scopes
    public void enterStart(alg.StartContext ctx) {
        this.functionList = new ArrayList<>();
    }


    //Entra em uma declaração de uma função, define um novo scope  e um novo symbol para esta nova função.
    public void enterFunction_declaration(alg.Function_declarationContext ctx) {
        FunctionSymbol f = null;
        String functionName = null;
        if (ctx.INDENT() != null) {
            functionName = ctx.INDENT().getText();
            String type = ctx.function_type().start.getText();
            f = new FunctionSymbol(type, functionName);

            if (type == null) {
                return;
            }
        }

        if (ctx.INDENT() == null) {
            functionName = ctx.main_function_declaration().ALG().getText();
            String type = ctx.main_function_declaration().INT(0).getText();
            f = new FunctionSymbol(type, functionName);
        }


            this.currentFunction = f;
            this.functionList.add(f);
    }


    public void exitArg(alg.ArgContext ctx) {
        for (int i = 0; i < ctx.simple_declaration().size(); i ++) {
            Symbol s = new Symbol( new Type(ctx.simple_declaration().get(i).type().getText()), ctx.simple_declaration().get(i).INDENT().toString());
            if(s != null)
                this.currentFunction.arguments.add(s);
        }
    }


}