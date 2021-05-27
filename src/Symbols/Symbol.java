package Symbols;

import java.util.Locale;

//classe apenas com campos
public class Symbol {

    public enum PType
    {
        INT,
        FLOAT,
        BOOL,
        STRING,
        POINTER_INT,
        POINTER_BOOL,
        POINTER_FLOAT,
        POINTER_STRING,
        POINTER_VOID,
        VOID,
        ERR,

    }

    public PType type;
    public String name;
    public Scope scope;

    //usamos um enumerado para guardar o tipo, porque é mais eficiente nas comparações de tipos
    public Symbol(String type, String name)
    {
        this.type = PType.valueOf(type.toUpperCase(Locale.ROOT));
        this.name = name;
    }


    /**
     * Compara TODO
     */
    public boolean maxType(Symbol b){
        boolean result = false;

        return result;
    }




    public String toString()
    {
        return name + ":" + this.type;
    }

    public boolean isPointerType()
    {
        return this.type.toString().contains("POINTER");
    }

    /**
     * Check if a Symbol is convertible to other Symbol
     * @param t2
     * @return boolean
     */
    public boolean isConvertible(Symbol.PType t2)
    {
        Symbol.PType t = this.type;
        boolean result;
        if(t == t2)
            result = true;
        else if(t == PType.INT && t2 == PType.FLOAT)
            result = true;
        else result = this.isPointerType() && t2 == PType.POINTER_VOID;

        return result;
    }
}
