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

    //variable declarations and initialization
    //v_decl --> type IDENT EQUAL (exp | LRECT exp RRECT) #VarDeclInit;
    //we don't need to do anything for the variable declaration, but we do have to do for initialization
    //Task T1
    public Symbol visitVarDeclInit(alg.VarDeclInitContext ctx)
    {
        //TODO
    }

    //simple expressions
    //simple_exp --> LINT;
    public Symbol visitLInt(alg.LIntContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.INT),ctx.getText(), ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> LITERAL_R
    public Symbol visitLFloat(alg.LFloatContext ctx)
    {
        Symbol s = new Symbol(new Type(Type.PType.FLOAT),ctx.getText(),ctx.getText());
        //literal constants can be stored as constants in the global scope, indexed by their value
        this.globalScope.define(s);
        //we need to resolve, because it might be the case that the same constant was already declared, and in this case
        //we return the previously created symbol instead of a new one
        return globalScope.resolve(s.name);
    }

    //simple_exp --> LITERAL_STRING
    public Symbol visitLString(alg.LStringContext ctx)
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
    public Symbol visitLNull(alg.LNullContext ctx)
    {
        //returns the special symbol null. This one doesn't even need to be stored in the symbol table
        return new Symbol(new Type(true, Type.PType.VOID),"null","null");
    }

    //simple_exp --> (TRUE|FALSE)
    public Symbol visitLBoolean(alg.LBooleanContext ctx)
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
        return this.scopes.get(ctx).resolve(ctx.IDENT().getText());
    }

    public Symbol visitSimpleExp(alg.SimpleExpContext ctx)
    {
        return visit(ctx.simple_exp());
    }

    public Symbol visitParen(alg.ParenContext ctx)
    {
        return visit(ctx.exp());
    }

    //Task T2
    //exp --> QMark left_side #PointerExtract
    public Symbol visitPointerExtract(alg.PointerExtractContext ctx)
    {
        //TODO
    }

    //Task T3
    //exp --> exp LRECT exp RRECT #PointerAccess
    //usado no lado direito de uma atribuição, ou como uma expressão sózinha.
    public Symbol visitPointerAccess(alg.PointerAccessContext ctx)
    {
        //TODO
    }

    public Symbol visitUnary(alg.UnaryContext ctx)
    {
        String op = "";
        int opType = ctx.unary_op().start.getType();
        Symbol s1 = visit(ctx.exp());
        //if it is a + we don't need to do anything
        if(opType==algLexer.PLUS) return s1;
        if(opType==algLexer.MINUS)
        {
            op = "-";
        }
        else if(opType == algLexer.NOT)
        {
            op = "not";
        }

        Symbol t = this.temp(ctx,s1.type);
        emit(t.name + " = " + op + " " +  s1.name);
        return t;
    }

    public Symbol visitMulDiv(alg.MulDivContext ctx)
    {
        Symbol t1 = visit(ctx.exp(0));
        Symbol t2 = visit(ctx.exp(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
        String op = ctx.mul_op().getText();

        Symbol t = this.temp(ctx,maxType);
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

    public Symbol visitAddSub(alg.AddSubContext ctx) {

        Symbol t1 = visit(ctx.exp(0));
        Symbol t2 = visit(ctx.exp(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
        String op = ctx.sum_op().getText();

        Symbol t = this.temp(ctx,maxType);
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

    public Symbol visitCompare(alg.CompareContext ctx) {

        Symbol t1 = visit(ctx.exp(0));
        Symbol t2 = visit(ctx.exp(1));
        Type maxType = Type.getMaxType(t1.type,t2.type);
        t1 = widen(ctx,t1,t1.type,maxType);
        t2 = widen(ctx,t2,t2.type,maxType);
        String op = ctx.comp_op().getText();
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));
        emit(t.name + " = " + t1.name + " " + op + " " + t2.name);
        return t;
    }

    public Symbol visitAnd(alg.AndContext ctx)
    {
        Symbol t1 = visit(ctx.exp(0));
        Symbol t2 = visit(ctx.exp(1));
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));

        emit(t.name + "=" + t1.name + " and " + t2.name);
        return t;
    }

    public Symbol visitOr(alg.OrContext ctx)
    {
        Symbol t1 = visit(ctx.exp(0));
        Symbol t2 = visit(ctx.exp(1));
        Symbol t = this.temp(ctx,new Type(Type.PType.BOOLEAN));

        emit(t.name + "=" + t1.name + " or " + t2.name);
        return t;
    }



    //function declarations
    //f_decl --> (type|VOID) IDENT LPAR formalParameters? RPAR body #FunctionDecl
    //Task T4
    public Symbol visitFunctionDecl(alg.FunctionDeclContext ctx)
    {
        //TODO
    }



    //f_decl --> INT ALG LPAR INT IDENT VIR LTHAN STRING GTHAN IDENT RPAR body #MainDecl;
    //Task T4
    public Symbol visitMainDecl(alg.MainDeclContext ctx)
    {
        //TODO
    }

    //function invocations
    //f_inv --> IDENT LPAR (exp (VIR exp)*)? RPAR     #FCall
    //Task T5
    public Symbol visitFCall(alg.FCallContext ctx)
    {
        //TODO
    }

    //instructions
    //inst --> exp PVIR #ExpInst
    public Symbol visitExpInst(alg.ExpInstContext ctx)
    {
        //this is very easy, just visit the expression
        visit(ctx.exp());
        //It is not mandatory to return any symbol in an instruction
        return null;
    }

    //Task T6
    //inst --> left_side EQUAL exp PVIR;
    public Symbol visitAssign(alg.AssignContext ctx)
    {
        //TODO
    }

    //T6
    //left_side --> IDENT
    public Symbol visitLeftVar(alg.LeftVarContext ctx)
    {
        //TODO
    }


    //inst --> IF exp THEN inst (ELSE inst)?   #If
    public Symbol visitIf(alg.IfContext ctx)
    {
        Symbol condition = visit(ctx.exp());
        String falseLabel = label("false");
        emit("ifFalse " + condition.name + " goto " + falseLabel);
        visit(ctx.inst(0));

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
            visit(ctx.inst(1));
            emit(nextLabel + ":");
        }

        return null;
    }

    //inst --> WHILE exp DO inst (FINALLY inst)? #While
    //Task T8
    public Symbol visitWhile(alg.WhileContext ctx)
    {
        //TODO
    }

    //Task T8
    //ctrl_inst --> LEAVE #Leave
    public Symbol visitLeave(alg.LeaveContext ctx)
    {
        //TODO
    }

    //Task T8
    //ctrl_inst --> RESTART #Restart
    public Symbol visitRestart(alg.RestartContext ctx)
    {
        //TODO
    }

    public Symbol visitReturn(alg.ReturnContext ctx)
    {
        emit("return");
        return null;
    }

    public Symbol visitReturnValue(alg.ReturnValueContext ctx)
    {
        Symbol returnValue = visit(ctx.exp());
        emit("return " + returnValue.name);
        return null;
    }



}
