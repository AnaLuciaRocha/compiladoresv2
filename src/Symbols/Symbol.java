package Symbols;

import java.util.Locale;

//classe apenas com campos
public class Symbol {

    public enum PType
    {
        INT,
        FLOAT,
<<<<<<< HEAD
        BOOL,
        STRING,
        POINTER_INT,
        POINTER_BOOL,
        POINTER_FLOAT,
        POINTER_STRING,
        POINTER_VOID,
=======
        STRING,
        BOOL,
>>>>>>> origin/TypeChecker-Jay
        VOID,
        ERR,
        NULL,
        POINTER,
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
}
