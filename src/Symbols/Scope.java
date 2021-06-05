package Symbols;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scope {

    private static int scopeCounter = 0;
    private static int tempCounter = 0;

    private HashMap<String,Symbol> symbols;
    private List<Symbol> formalParameters;
    private Scope parentScope;
    private int scopeId;
    private int offset;
    private int staticStackSize;

    public Scope(Scope parentScope)
    {
        this.offset = -8;
        this.staticStackSize = 0;
        this.symbols = new HashMap<>();
        this.parentScope = parentScope;
        this.scopeId = Scope.scopeCounter++;
        this.formalParameters = new ArrayList<>();
    }

    public Scope getParentScope()
    {
        return this.parentScope;
    }

    public boolean isGlobalScope()
    {
        return this.parentScope == null;
    }

    public boolean define(Symbol symbol)
    {
        if(this.symbols.containsKey(symbol.name)) return false;
        if(symbol.isWidthKnown)
        {
            symbol.offset = this.offset;
            this.offset -= symbol.width;
            this.staticStackSize += symbol.width;
        }
        symbol.scope = this;
        this.symbols.put(symbol.name,symbol);
        return true;
    }

    //we need a specific method for formal parameters, because indexing formal parameters is done differently
    public boolean defineFormalParameter(Symbol symbol)
    {
        if(this.symbols.containsKey(symbol.name)) return false;

        symbol.scope = this;
        this.symbols.put(symbol.name,symbol);
        this.formalParameters.add(symbol);
        return true;
    }

    public List<Symbol> getFormalParameters()
    {
        return this.formalParameters;
    }

    public Symbol defineTemp(Type t)
    {
        Symbol s = new Symbol(t,"_t" + this.tempCounter++);
        if(s.isWidthKnown)
        {
            s.offset = this.offset;
            this.offset -= s.width;
            this.staticStackSize += s.width;
        }
        s.scope = this;
        this.symbols.put(s.name,s);
        return s;
    }

    public Symbol defineTempArray(Type t, int arraySize)
    {
        Symbol s = new Symbol(t,"_t" + this.tempCounter++);
        s.scope = this;
        s.width = s.type.getWidth()*arraySize;
        s.isWidthKnown = true;
        s.offset = this.offset;
        this.offset -= s.width;
        this.staticStackSize += s.width;
        this.symbols.put(s.name,s);
        return s;
    }

    public Symbol resolve(String name)
    {
        Symbol s = this.symbols.get(name);
        if(s!= null) return s;

        if(this.parentScope != null) return this.parentScope.resolve(name);
        return null;
    }

    public int getStaticMemorySize()
    {
        return this.staticStackSize;
    }

    public String toString()
    {
        return this.symbols.values().toString();
    }
}




//package Symbols;
//
//import java.util.HashMap;
//
//public class Scope {
//
//    private HashMap<String,Symbol> symbols;
//    private Scope parentScope;
//
//    public Scope(Scope parentScope)
//    {
//        this.symbols = new HashMap<>();
//        this.parentScope = parentScope;
//    }
//
//    public Scope getParentScope()
//    {
//        return this.parentScope;
//    }
//
//    public boolean isGlobalScope()
//    {
//        return this.parentScope == null;
//    }
//
//    /**
//     *
//     * @param symbol
//     * @return adiciona novo simbolo a tabela
//     */
//    public boolean define(Symbol symbol)
//    {
//        if(this.symbols.containsKey(symbol.name))return false;
//        symbol.scope = this;
//        this.symbols.put(symbol.name,symbol);
//        return true;
//    }
//
//    /**
//     *
//     * @param name
//     * @return retorna o simbolo
//     */
//    public Symbol resolve(String name)
//    {
//        Symbol s = this.symbols.get(name);
//        if(s!= null) return s;
//
//        if(this.parentScope != null) return this.parentScope.resolve(name);
//        return null;
//    }
//
//    public String toString()
//    {
//        return this.symbols.values().toString();
//    }
//}
