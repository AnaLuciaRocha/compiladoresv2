package Symbols;

import java.util.HashMap;

public class Scope {

    private HashMap<String,Symbol> symbols;
    private Scope parentScope;

    public Scope(Scope parentScope)
    {
        this.symbols = new HashMap<>();
        this.parentScope = parentScope;
    }

    public Scope getParentScope()
    {
        return this.parentScope;
    }

    public boolean isGlobalScope()
    {
        return this.parentScope == null;
    }

    /**
     *
     * @param symbol
     * @return adiciona novo simbolo a tabela
     */
    public boolean define(Symbol symbol)
    {
        if(this.symbols.containsKey(symbol.name))return false;
        symbol.scope = this;
        this.symbols.put(symbol.name,symbol);
        return true;
    }

    /**
     *
     * @param name
     * @return retorna o simbolo
     */
    public Symbol resolve(String name)
    {
        Symbol s = this.symbols.get(name);
        if(s!= null) return s;

        if(this.parentScope != null) return this.parentScope.resolve(name);
        return null;
    }

    public String toString()
    {
        return this.symbols.values().toString();
    }
}
