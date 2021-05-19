package Symbols;

import java.util.ArrayList;
import java.util.List;

public class FunctionSymbol extends Symbol {

    public List<Symbol> arguments;

    public FunctionSymbol(String type, String functionName)
    {
        super(type,functionName);
        this.arguments = new ArrayList<Symbol>();
    }

    public String toString()
    {
        return "#F#" + name + ":" + this.type + this.arguments.toString();
    }
}
