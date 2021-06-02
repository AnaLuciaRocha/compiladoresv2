package Symbols;

import java.util.Locale;

public class Type {

    public enum PType
    {
        INT,
        FLOAT,
        VOID,
        STRING,
        BOOLEAN,
        ERROR
    }

    private boolean isPointer;
    private PType type;

    public static boolean isConvertibleTo(Type from, Type to)
    {
        if(from.equals(to)) return true;
        if(from.isPointer())
        {
            //conversão de null para qq tipo de ponteiro
            if(from.getPrimitiveType() == Type.PType.VOID && to.isPointer()) return true;
        }
        else
        {
            if(from.getPrimitiveType() == Type.PType.INT && to.getPrimitiveType() == Type.PType.FLOAT) return true;
        }
        return false;
    }

    //gets the maximum lower limit between two types, taking into account the language widening hierarchy
    //if types are not compatible, returns an error
    public static Type getMaxType(Type t1, Type t2)
    {
        if(t1.equals(t2)) return t1;

        if(!t1.isPointer && !t2.isPointer)
        {
            if(t1.getPrimitiveType() == PType.FLOAT && t2.getPrimitiveType() == PType.INT)
            {
                return t1;
            }
            else if(t2.getPrimitiveType() == PType.FLOAT && t1.getPrimitiveType() == PType.INT)
            {
                return t2;
            }
        }
        else if(t1.isPointer && t2.isPointer)
        {
            if(t1.getPrimitiveType() == PType.VOID) return t2;
            if(t2.getPrimitiveType() == PType.VOID) return t1;
        }

        return null;
    }

    public Type(String type)
    {
        this.isPointer = false;
        this.type = PType.valueOf(type.toUpperCase(Locale.ROOT));
    }

    public Type(boolean isPointer, String type)
    {
        this.isPointer = isPointer;
        this.type = PType.valueOf(type.toUpperCase(Locale.ROOT));
    }

    public Type(boolean isPointer, PType pType)
    {
        this.isPointer = isPointer;
        this.type = pType;
    }

    public Type(PType pType)
    {
        this.isPointer = false;
        this.type = pType;
    }

    public boolean isError()
    {
        return this.type == PType.ERROR;
    }

    public boolean isPointer()
    {
        return this.isPointer;
    }

    public PType getPrimitiveType()
    {
        return this.type;
    }

    public Type extractPointerType()
    {
        if(this.isPointer) return this;
        return new Type(true,this.type);
    }

    public Type extractValueType()
    {
        if(!this.isPointer) return this;
        return new Type(false,this.type);
    }

    public int getWidth()
    {
        if(this.isPointer) return 4;
        if(this.type == PType.FLOAT) return 8;
        else return 4;
    }

    public String toString()
    {
        String output = "";
        if(this.isPointer) output += "<";
        output += this.type.toString();
        if(this.isPointer) output += ">";
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Type)) return false;
        return this.equals((Type) obj);
    }

    public boolean equals(Type t2)
    {
        return t2.isPointer == this.isPointer && this.type == t2.type;
    }
}
