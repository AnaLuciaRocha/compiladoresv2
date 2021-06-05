package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import Symbols.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CodeGen extends algBaseVisitor<Symbol>{

    private int tmpCounter = 0;
    private int labelCounter = 0;
    private BufferedWriter out;
    private Scope globalScope;
    public List<String> code;
    private Stack<String> whileAfterLabels;
    private Stack<String> whileBeforeLabels;

    public ParseTreeProperty<Scope> scopes;

    public CodeGen(ParseTreeProperty<Scope> scopes)
    {
        this.scopes = scopes;
        code = new ArrayList<String>();
        this.whileAfterLabels = new Stack<>();
        this.whileBeforeLabels = new Stack<>();
    }

    private Symbol widen(ParserRuleContext ctx, Symbol addr, Type down, Type up)
    {
        //se são do mesmo tipo não há cast a fazer
        if(down.equals(up)) return addr;
        else if(Type.isConvertibleTo(down,up))
        {
            Symbol t = temp(ctx,up);
            emit(t.name + " = (" + up + ") " + addr.name );
            return t;
        }
        return null;
    }

    private int emit(String s)
    {
        this.code.add(s);
        return this.code.size()-1;
    }

    private void replace(int line, String s)
    {
        this.code.set(line,s);
    }

    private Symbol temp(ParserRuleContext ctx, Type t)
    {
        return this.scopes.get(ctx).defineTemp(t);
    }

    private String label()
    {
        return "_L" + this.labelCounter++;
    }

    private String label(String name)
    {
        return "_L" + name + this.labelCounter++;
    }

    //start : decl+ EOF;
    public Symbol visitStart(alg.StartContext ctx)
    {
        //initialize the Global scope
        this.globalScope = this.scopes.get(ctx);
        visitChildren(ctx);
        //only expressions need to return a proper symbol
        return null;
    }



    //simple expressions
    //simple_exp --> LINT;
    public Symbol visitInt(alg.IntContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.INT),ctx.getText(), ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> LITERAL_R
    public Symbol visitFloat(alg.FloatContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.FLOAT),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> LITERAL_STRING
    public Symbol visitString(alg.StringContext ctx)
    {
        String strText = ctx.getText();
        //we need to remove the trailing "" and add the null character
        strText = strText.substring(1,strText.length()-1) + "\u0000";
        //Strings are special because they are a dynamic multi-byte type
        //however, the size of a string literal is well-known in compile-time, so in this particular case
        // we can properly calculate its size
        Symbol s = new Symbol(new Type(Type.PType.STRING),strText,strText);
        s.width = s.type.getWidth() * strText.length(); //we need one extra space for the end of string character \u0000
        //literal constants can be stored as constants in the global scope, indexed by their value
        s.isWidthKnown = true;
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> Null
    public Symbol visitNull(alg.NullContext ctx)
    {
        //returns the special symbol null. This one doesn't even need to be stored in the symbol table
        return new Symbol(new Type(true, Type.PType.VOID),"null","null");
    }

    //simple_exp --> (TRUE|FALSE)
    public Symbol visitTrue(alg.TrueContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.BOOLEAN),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> (TRUE|FALSE)
    public Symbol visitFalse(alg.FalseContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.BOOLEAN),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> IDENT
    public Symbol visitVar(alg.VarContext ctx)
    {
        return this.scopes.get(ctx).resolve(ctx.INDENT().getText());
    }

    public Symbol visitSimpleExpr(alg.SimpleExprContext ctx)
    {
        return visit(ctx.simple_expression());
    }

    public Symbol  visitParenExpr(alg.ParenExprContext ctx)
    {
        return visit(ctx.expression());
    }

//    //Task T2
//    //exp --> QMark left_side #PointerExtract
//    public Symbol visitPointerExtract(alg.PointerExtractContext ctx)
//    {
//        //TODO
//    }

//  expression : (PLUS | MINUS | NOT | QUESTION) expression
   public Symbol visitUnary(alg.UnaryContext ctx)
    {
        if(ctx.QUESTION() == null) {
            String op = "";
            int opType = -1;
            if (ctx.PLUS() != null) {
                opType = ctx.PLUS().getSymbol().getType();
            } else if (ctx.MINUS() != null) {
                opType = ctx.MINUS().getSymbol().getType();
            } else if (ctx.NOT() != null) {
                opType = ctx.NOT().getSymbol().getType();
            }
//        int opType = ctx.unary_op().start.getType();
            Symbol s1 = visit(ctx.expression());
            //if it is a + we don't need to do anything
            if (opType == algLexer.PLUS) return s1;
            if (opType == algLexer.MINUS) {
                op = "-";
            } else if (opType == algLexer.NOT) {
                op = "not";
            }

            Symbol t = this.temp(ctx, s1.type);
            emit(t.name + " = " + op + " " + s1.name);
            return t;
        }
        else{


            if (ctx.expression().getText().contains("["))
            System.out.println(ctx.expression().getText());
//           ?y ---> TAC) _t0 = &y
            Symbol s1 = visit(ctx.expression());
//            Symbol s2 = visit(ctx.expression());
            Symbol t = this.temp(ctx, s1.type);

//            <string> a = a[8];
//            a[8] --> string

            emit(t.name + " = " + "&" + " " + s1.name);
            return t;

            // x = ?y[4]
//            int type_size = s1.type.getWidth();
            // x = ?y[4+x]


        }
    }


//  expression: expression (MULT | DIV | REMAIN) expression #MultDiv //Binary Operator Higher Priority
    public Symbol  visitMultDiv(alg.MultDivContext ctx)
    {
        Symbol t1 = visit(ctx.expression(0));
        Symbol t2 = visit(ctx.expression(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
//        String op = ctx.mul_op().getText();
        String op = "";
        if(ctx.MULT() !=null)
            op = ctx.MULT().getText();
        else if(ctx.DIV() != null)
            op = ctx.DIV().getText();
        else if (ctx.REMAIN() !=null)
            op = ctx.REMAIN().getText();

        Symbol t = this.temp(ctx,maxType);
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

//  expression : expression (PLUS | MINUS) expression        #PlusMinus//Binary Operator Lower Priority
    public Symbol visitPlusMinus(alg.PlusMinusContext ctx) {
        Symbol t1 = visit(ctx.expression(0));
        Symbol t2 = visit(ctx.expression(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);

        String op = "";
        if(ctx.PLUS() != null)
            op = ctx.PLUS().getText();
        else if(ctx.MINUS() !=null)
            op = ctx.MINUS().getText();

        Symbol t = this.temp(ctx,maxType);
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }


//  expression : expression (LESS_THAN | GREATER_THAN | LESS_EQUAL_THAN | GREATER_EQUAL_THAN | IS_EQUAL | DIFERENT) expression #BinaryComparator //Binary Operator Comparator
    public Symbol visitBinaryComparator(alg.BinaryComparatorContext ctx){
            Symbol t1 = visit(ctx.expression(0));
            Symbol t2 = visit(ctx.expression(1));
            Type maxType = Type.getMaxType(t1.type, t2.type);
            t1 = widen(ctx, t1, t1.type, maxType);
            t2 = widen(ctx, t2, t2.type, maxType);
//        String op = ctx.comp_op().getText();
            String op = "";
            if(ctx.IS_EQUAL() != null)
                op = ctx.IS_EQUAL().getText();
            else if (ctx.LESS_THAN() !=null)
                op = ctx.LESS_THAN().getText();
            else if (ctx.GREATER_THAN() != null)
                op = ctx.GREATER_THAN().getText();
            else if (ctx.LESS_EQUAL_THAN() !=null)
                op = ctx.LESS_EQUAL_THAN().getText();
            else if(ctx.GREATER_EQUAL_THAN() !=null)
                op = ctx.GREATER_EQUAL_THAN().getText();
            else if(ctx.DIFERENT() !=null)
                op = ctx.DIFERENT().getText();
            Symbol t = this.temp(ctx, new Type(Type.PType.BOOLEAN));
            emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
            return t;



    }

    public Symbol visitAndComparator(alg.AndComparatorContext ctx)
    {
        Symbol t1 = visit(ctx.expression(0));
        Symbol t2 = visit(ctx.expression(1));
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));

        emit(t.name + "=" + t1.name + " and " + t2.name);
        return t;
    }

    public Symbol visitOrComparator(alg.OrComparatorContext ctx)
    {
        Symbol t1 = visit(ctx.expression(0));
        Symbol t2 = visit(ctx.expression(1));
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));

        emit(t.name + "=" + t1.name + " or " + t2.name);
        return t;
    }





//    instructions : (expression
//             | instruction_control
//             | atribuition )SEMI_COLON
//             | instruction_conditional
//             | cycle
//             | sub_block ;
    public Symbol visitInstructions(alg.InstructionsContext ctx) {
        if(ctx.expression()!=null) {
            //this is very easy, just visit the expression
            visit(ctx.expression());
        }
        //It is not mandatory to return any symbol in an instruction
        return null;
    }


//    instructions_cycle : (expression
//             | instruction_control_cycle
//             | atribuition )SEMI_COLON
//             | instruction_conditional
//             | cycle
//             | sub_block ;
    public Symbol visitInstructions_cycle(alg.Instructions_cycleContext ctx) {
        if(ctx.expression()!=null) {
            //this is very easy, just visit the expression
            visit(ctx.expression());
        }
        //It is not mandatory to return any symbol in an instruction
        return null;
    }


    //inst --> IF exp THEN inst (ELSE inst)?   #If
    public Symbol visitInstruction_conditional(alg.Instruction_conditionalContext ctx)
    {
        Symbol condition = visit(ctx.expression());
        String falseLabel = label("false");
        emit("ifFalse " + condition.name + " goto " + falseLabel);
//        visit(ctx.inst(0));
        visit(ctx.instructions(0));

        if(ctx.ELSE() == null)
        {
            //Single if
            emit(falseLabel + ":");
        }
        else
        {
            String nextLabel = label("next");
            emit("goto " + nextLabel);
            emit(falseLabel + ":");
//            visit(ctx.inst(1));
            visit(ctx.instructions(1));

            emit(nextLabel + ":");
        }

        return null;
    }



    public Symbol visitInstruction_control(alg.Instruction_controlContext ctx)
    {
        if(ctx.expression() == null) {
            emit("return");
            return null;
        }
        else {
            Symbol returnValue = visit(ctx.expression());
            emit("return " + returnValue.name);
            return null;
        }
    }

    public Symbol visitInstruction_control_cycle(alg.Instruction_control_cycleContext ctx) {
        if (ctx.RETURN() != null) {
            if (ctx.expression() == null) {
                emit("return");
                return null;
            } else {
                Symbol returnValue = visit(ctx.expression());
                emit("return " + returnValue.name);
                return null;
            }
        }
        return null;
    }

}
