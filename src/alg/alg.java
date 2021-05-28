// Generated from /home/jay/IdeaProjects/compiladoresv2/src/alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alg extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, BOOL=2, FLOAT=3, STRING=4, VOID=5, SIZEOF=6, NULL=7, ALG=8, TRUE=9, 
		FALSE=10, WHILE=11, DO=12, FINALLY=13, LEAVE=14, RESTART=15, RETURN=16, 
		IF=17, THEN=18, ELSE=19, WRITE=20, WRITELN=21, SPACES=22, COMMENT_E=23, 
		COMMENT_O=24, COMMA=25, SEMI_COLON=26, L_PAREN=27, R_PAREN=28, INDENT=29, 
		LITERAL_INT=30, LITERAL_FLOAT=31, LITERAL_STRING=32, PLUS=33, MINUS=34, 
		MULT=35, DIV=36, REMAIN=37, L_BRACKET=38, R_BRACKET=39, QUESTION=40, LESS_THAN=41, 
		GREATER_THAN=42, GREATER_EQUAL_THAN=43, LESS_EQUAL_THAN=44, IS_EQUAL=45, 
		EQUAL=46, DIFERENT=47, NOT=48, AND=49, OR=50, MUCH_BIGGER_THAN=51, AT=52, 
		L_CURVE_BRACKET=53, R_CURVE_BRACKET=54;
	public static final int
		RULE_start = 0, RULE_declaration = 1, RULE_variable_declation = 2, RULE_simple_declaration = 3, 
		RULE_initialization_declaration = 4, RULE_type = 5, RULE_expression = 6, 
		RULE_simple_expression = 7, RULE_index_pointer = 8, RULE_expression_list = 9, 
		RULE_function_invocation = 10, RULE_function_invocation_special = 11, 
		RULE_function_declaration = 12, RULE_main_function_declaration = 13, RULE_function_type = 14, 
		RULE_arg = 15, RULE_body = 16, RULE_prologo = 17, RULE_epilogo = 18, RULE_block = 19, 
		RULE_instructions_cycle = 20, RULE_instruction_control = 21, RULE_instructions = 22, 
		RULE_instruction_control_cycle = 23, RULE_atribuition = 24, RULE_instruction_conditional = 25, 
		RULE_cycle = 26, RULE_sub_block = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaration", "variable_declation", "simple_declaration", "initialization_declaration", 
			"type", "expression", "simple_expression", "index_pointer", "expression_list", 
			"function_invocation", "function_invocation_special", "function_declaration", 
			"main_function_declaration", "function_type", "arg", "body", "prologo", 
			"epilogo", "block", "instructions_cycle", "instruction_control", "instructions", 
			"instruction_control_cycle", "atribuition", "instruction_conditional", 
			"cycle", "sub_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'float'", "'string'", "'void'", "'sizeof'", 
			"'null'", "'alg'", "'true'", "'false'", "'while'", "'do'", "'finally'", 
			"'leave'", "'restart'", "'return'", "'if'", "'then'", "'else'", "'write'", 
			"'writeln'", null, null, null, "','", "';'", "'('", "')'", null, null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", "'?'", "'<'", 
			"'>'", "'>='", "'<='", "'=='", "'='", "'!='", "'~'", "'&&'", "'||'", 
			"'>>'", "'@'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", 
			"TRUE", "FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", 
			"IF", "THEN", "ELSE", "WRITE", "WRITELN", "SPACES", "COMMENT_E", "COMMENT_O", 
			"COMMA", "SEMI_COLON", "L_PAREN", "R_PAREN", "INDENT", "LITERAL_INT", 
			"LITERAL_FLOAT", "LITERAL_STRING", "PLUS", "MINUS", "MULT", "DIV", "REMAIN", 
			"L_BRACKET", "R_BRACKET", "QUESTION", "LESS_THAN", "GREATER_THAN", "GREATER_EQUAL_THAN", 
			"LESS_EQUAL_THAN", "IS_EQUAL", "EQUAL", "DIFERENT", "NOT", "AND", "OR", 
			"MUCH_BIGGER_THAN", "AT", "L_CURVE_BRACKET", "R_CURVE_BRACKET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "alg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alg(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(alg.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				declaration();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << NULL) | (1L << INDENT) | (1L << LESS_THAN))) != 0) );
			setState(61);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Variable_declationContext variable_declation() {
			return getRuleContext(Variable_declationContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(alg.SEMI_COLON, 0); }
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				variable_declation();
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMI_COLON:
					{
					setState(64);
					match(SEMI_COLON);
					}
					break;
				case EOF:
				case INT:
				case BOOL:
				case FLOAT:
				case STRING:
				case VOID:
				case NULL:
				case INDENT:
				case LESS_THAN:
					{
					notifyErrorListeners("Missing ';'");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				function_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declationContext extends ParserRuleContext {
		public Variable_declationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declation; }
	 
		public Variable_declationContext() { }
		public void copyFrom(Variable_declationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitializationDeclarationContext extends Variable_declationContext {
		public Initialization_declarationContext initialization_declaration() {
			return getRuleContext(Initialization_declarationContext.class,0);
		}
		public InitializationDeclarationContext(Variable_declationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInitializationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInitializationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInitializationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleDeclarationContext extends Variable_declationContext {
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public SimpleDeclarationContext(Variable_declationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declationContext variable_declation() throws RecognitionException {
		Variable_declationContext _localctx = new Variable_declationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declation);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				simple_declaration();
				}
				break;
			case 2:
				_localctx = new InitializationDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				initialization_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(alg.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(alg.INDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alg.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alg.COMMA, i);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSimple_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSimple_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(INDENT);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					match(INDENT);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initialization_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(alg.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(alg.R_BRACKET, 0); }
		public Initialization_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInitialization_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInitialization_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInitialization_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialization_declarationContext initialization_declaration() throws RecognitionException {
		Initialization_declarationContext _localctx = new Initialization_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initialization_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			match(INDENT);
			setState(86);
			match(EQUAL);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case L_PAREN:
			case INDENT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				{
				setState(87);
				expression(0);
				}
				break;
			case L_BRACKET:
				{
				setState(88);
				match(L_BRACKET);
				setState(89);
				expression(0);
				setState(90);
				match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public TerminalNode LESS_THAN() { return getToken(alg.LESS_THAN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(alg.GREATER_THAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(BOOL);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(STRING);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(NULL);
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(LESS_THAN);
				setState(100);
				type();
				setState(101);
				match(GREATER_THAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExprContext extends ExpressionContext {
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public SimpleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(alg.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(alg.MINUS, 0); }
		public PlusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexArrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_BRACKET() { return getToken(alg.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(alg.R_BRACKET, 0); }
		public IndexArrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIndexArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIndexArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIndexArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndComparatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(alg.AND, 0); }
		public AndComparatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAndComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAndComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAndComparator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrComparatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(alg.OR, 0); }
		public OrComparatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterOrComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitOrComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitOrComparator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(alg.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(alg.MINUS, 0); }
		public TerminalNode NOT() { return getToken(alg.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(alg.QUESTION, 0); }
		public UnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryComparatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(alg.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(alg.GREATER_THAN, 0); }
		public TerminalNode LESS_EQUAL_THAN() { return getToken(alg.LESS_EQUAL_THAN, 0); }
		public TerminalNode GREATER_EQUAL_THAN() { return getToken(alg.GREATER_EQUAL_THAN, 0); }
		public TerminalNode IS_EQUAL() { return getToken(alg.IS_EQUAL, 0); }
		public TerminalNode DIFERENT() { return getToken(alg.DIFERENT, 0); }
		public BinaryComparatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBinaryComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBinaryComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBinaryComparator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(alg.MULT, 0); }
		public TerminalNode DIV() { return getToken(alg.DIV, 0); }
		public TerminalNode REMAIN() { return getToken(alg.REMAIN, 0); }
		public MultDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case INDENT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case AT:
				{
				_localctx = new SimpleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				simple_expression();
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(L_PAREN);
				setState(108);
				expression(0);
				setState(109);
				match(R_PAREN);
				}
				break;
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << QUESTION) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112);
				expression(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << REMAIN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new BinaryComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(122);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << GREATER_EQUAL_THAN) | (1L << LESS_EQUAL_THAN) | (1L << IS_EQUAL) | (1L << DIFERENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new AndComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(125);
						match(AND);
						setState(126);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new OrComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(128);
						match(OR);
						setState(129);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new IndexArrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(131);
						match(L_BRACKET);
						setState(132);
						expression(0);
						setState(133);
						match(R_BRACKET);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	 
		public Simple_expressionContext() { }
		public void copyFrom(Simple_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends Simple_expressionContext {
		public TerminalNode LITERAL_FLOAT() { return getToken(alg.LITERAL_FLOAT, 0); }
		public FloatContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends Simple_expressionContext {
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public NullContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends Simple_expressionContext {
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public VarContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends Simple_expressionContext {
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public TrueContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends Simple_expressionContext {
		public TerminalNode LITERAL_STRING() { return getToken(alg.LITERAL_STRING, 0); }
		public StringContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Simple_expressionContext {
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
		public FalseContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Simple_expressionContext {
		public TerminalNode LITERAL_INT() { return getToken(alg.LITERAL_INT, 0); }
		public IntContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionInContext extends Simple_expressionContext {
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public FunctionInContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunctionIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunctionIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunctionIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_expression);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(LITERAL_INT);
				}
				break;
			case 2:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(NULL);
				}
				break;
			case 3:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(INDENT);
				}
				break;
			case 4:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LITERAL_FLOAT);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(LITERAL_STRING);
				}
				break;
			case 6:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(TRUE);
				}
				break;
			case 7:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(FALSE);
				}
				break;
			case 8:
				_localctx = new FunctionInContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				function_invocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_pointerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_BRACKET() { return getToken(alg.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(alg.R_BRACKET, 0); }
		public Index_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIndex_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIndex_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIndex_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_pointerContext index_pointer() throws RecognitionException {
		Index_pointerContext _localctx = new Index_pointerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_index_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			expression(0);
			setState(151);
			match(L_BRACKET);
			setState(152);
			expression(0);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_BRACKET:
				{
				setState(153);
				match(R_BRACKET);
				}
				break;
			case EQUAL:
				{
				notifyErrorListeners("Missing ']'");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alg.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alg.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression_list);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case L_PAREN:
			case INDENT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				expression(0);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					expression(0);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case R_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_invocationContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public Function_invocation_specialContext function_invocation_special() {
			return getRuleContext(Function_invocation_specialContext.class,0);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_invocation);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(INDENT);
				setState(169);
				match(L_PAREN);
				setState(170);
				expression_list();
				setState(171);
				match(R_PAREN);
				}
				break;
			case SIZEOF:
			case WRITE:
			case WRITELN:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				function_invocation_special();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_invocation_specialContext extends ParserRuleContext {
		public Function_invocation_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation_special; }
	 
		public Function_invocation_specialContext() { }
		public void copyFrom(Function_invocation_specialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SizeOfFunctionContext extends Function_invocation_specialContext {
		public TerminalNode SIZEOF() { return getToken(alg.SIZEOF, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public SizeOfFunctionContext(Function_invocation_specialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSizeOfFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSizeOfFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSizeOfFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteFunctionContext extends Function_invocation_specialContext {
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public TerminalNode WRITE() { return getToken(alg.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(alg.WRITELN, 0); }
		public WriteFunctionContext(Function_invocation_specialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterWriteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitWriteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitWriteFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StdReadFunctionContext extends Function_invocation_specialContext {
		public TerminalNode AT() { return getToken(alg.AT, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public StdReadFunctionContext(Function_invocation_specialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterStdReadFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitStdReadFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitStdReadFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocation_specialContext function_invocation_special() throws RecognitionException {
		Function_invocation_specialContext _localctx = new Function_invocation_specialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_invocation_special);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				_localctx = new StdReadFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(AT);
				setState(177);
				match(L_PAREN);
				setState(178);
				match(R_PAREN);
				}
				break;
			case SIZEOF:
				_localctx = new SizeOfFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(SIZEOF);
				setState(180);
				match(L_PAREN);
				setState(181);
				expression(0);
				setState(182);
				match(R_PAREN);
				}
				break;
			case WRITE:
			case WRITELN:
				_localctx = new WriteFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				match(L_PAREN);
				setState(186);
				expression_list();
				setState(187);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public Main_function_declarationContext main_function_declaration() {
			return getRuleContext(Main_function_declarationContext.class,0);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case FLOAT:
				case STRING:
				case VOID:
				case NULL:
				case LESS_THAN:
					{
					setState(191);
					function_type();
					}
					break;
				case INDENT:
					{
					notifyErrorListeners("A function must have a type");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195);
				match(INDENT);
				setState(196);
				match(L_PAREN);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << NULL) | (1L << LESS_THAN))) != 0)) {
					{
					{
					setState(197);
					arg();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				setState(204);
				main_function_declaration();
				}
				break;
			}
			setState(207);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(alg.INT); }
		public TerminalNode INT(int i) {
			return getToken(alg.INT, i);
		}
		public TerminalNode ALG() { return getToken(alg.ALG, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public List<TerminalNode> INDENT() { return getTokens(alg.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(alg.INDENT, i);
		}
		public TerminalNode COMMA() { return getToken(alg.COMMA, 0); }
		public TerminalNode LESS_THAN() { return getToken(alg.LESS_THAN, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode GREATER_THAN() { return getToken(alg.GREATER_THAN, 0); }
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public Main_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterMain_function_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitMain_function_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitMain_function_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_function_declarationContext main_function_declaration() throws RecognitionException {
		Main_function_declarationContext _localctx = new Main_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_main_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(INT);
			setState(210);
			match(ALG);
			setState(211);
			match(L_PAREN);
			setState(212);
			match(INT);
			setState(213);
			match(INDENT);
			setState(214);
			match(COMMA);
			setState(215);
			match(LESS_THAN);
			setState(216);
			match(STRING);
			setState(217);
			match(GREATER_THAN);
			setState(218);
			match(INDENT);
			setState(219);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(alg.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_type);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case NULL:
			case LESS_THAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alg.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alg.COMMA, i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			simple_declaration();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				simple_declaration();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrologoContext prologo() {
			return getRuleContext(PrologoContext.class,0);
		}
		public EpilogoContext epilogo() {
			return getRuleContext(EpilogoContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(233);
				prologo();
				}
			}

			setState(236);
			block();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_CURVE_BRACKET) {
				{
				setState(237);
				epilogo();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrologoContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(alg.AT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrologoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPrologo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPrologo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPrologo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologoContext prologo() throws RecognitionException {
		PrologoContext _localctx = new PrologoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prologo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(AT);
			setState(241);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpilogoContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode MUCH_BIGGER_THAN() { return getToken(alg.MUCH_BIGGER_THAN, 0); }
		public EpilogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterEpilogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitEpilogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitEpilogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpilogoContext epilogo() throws RecognitionException {
		EpilogoContext _localctx = new EpilogoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_epilogo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			block();
			setState(244);
			match(MUCH_BIGGER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURVE_BRACKET() { return getToken(alg.L_CURVE_BRACKET, 0); }
		public TerminalNode R_CURVE_BRACKET() { return getToken(alg.R_CURVE_BRACKET, 0); }
		public List<Variable_declationContext> variable_declation() {
			return getRuleContexts(Variable_declationContext.class);
		}
		public Variable_declationContext variable_declation(int i) {
			return getRuleContext(Variable_declationContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(alg.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(alg.SEMI_COLON, i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(L_CURVE_BRACKET);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					variable_declation();
					setState(248);
					match(SEMI_COLON);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(256); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(255);
						instructions();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(258); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_CURVE_BRACKET:
				{
				setState(262);
				match(R_CURVE_BRACKET);
				}
				break;
			case EOF:
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case VOID:
			case NULL:
			case INDENT:
			case LESS_THAN:
			case MUCH_BIGGER_THAN:
			case L_CURVE_BRACKET:
				{
				notifyErrorListeners("Missing '}'");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instructions_cycleContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(alg.SEMI_COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Instruction_control_cycleContext instruction_control_cycle() {
			return getRuleContext(Instruction_control_cycleContext.class,0);
		}
		public AtribuitionContext atribuition() {
			return getRuleContext(AtribuitionContext.class,0);
		}
		public Instruction_conditionalContext instruction_conditional() {
			return getRuleContext(Instruction_conditionalContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public Sub_blockContext sub_block() {
			return getRuleContext(Sub_blockContext.class,0);
		}
		public Instructions_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInstructions_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInstructions_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInstructions_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instructions_cycleContext instructions_cycle() throws RecognitionException {
		Instructions_cycleContext _localctx = new Instructions_cycleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instructions_cycle);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case LEAVE:
			case RESTART:
			case RETURN:
			case WRITE:
			case WRITELN:
			case L_PAREN:
			case INDENT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(266);
					expression(0);
					}
					break;
				case 2:
					{
					setState(267);
					instruction_control_cycle();
					}
					break;
				case 3:
					{
					setState(268);
					atribuition();
					}
					break;
				}
				setState(271);
				match(SEMI_COLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				instruction_conditional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				cycle();
				}
				break;
			case L_CURVE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				sub_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_controlContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(alg.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Instruction_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInstruction_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInstruction_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInstruction_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_controlContext instruction_control() throws RecognitionException {
		Instruction_controlContext _localctx = new Instruction_controlContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instruction_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(RETURN);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case L_PAREN:
			case INDENT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				{
				setState(279);
				expression(0);
				}
				break;
			case SEMI_COLON:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(alg.SEMI_COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Instruction_controlContext instruction_control() {
			return getRuleContext(Instruction_controlContext.class,0);
		}
		public AtribuitionContext atribuition() {
			return getRuleContext(AtribuitionContext.class,0);
		}
		public Instruction_conditionalContext instruction_conditional() {
			return getRuleContext(Instruction_conditionalContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public Sub_blockContext sub_block() {
			return getRuleContext(Sub_blockContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instructions);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case RETURN:
			case WRITE:
			case WRITELN:
			case L_PAREN:
			case INDENT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(283);
					expression(0);
					}
					break;
				case 2:
					{
					setState(284);
					instruction_control();
					}
					break;
				case 3:
					{
					setState(285);
					atribuition();
					}
					break;
				}
				setState(288);
				match(SEMI_COLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				instruction_conditional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				cycle();
				}
				break;
			case L_CURVE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				sub_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_control_cycleContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(alg.LEAVE, 0); }
		public TerminalNode RESTART() { return getToken(alg.RESTART, 0); }
		public TerminalNode RETURN() { return getToken(alg.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Instruction_control_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_control_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInstruction_control_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInstruction_control_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInstruction_control_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_control_cycleContext instruction_control_cycle() throws RecognitionException {
		Instruction_control_cycleContext _localctx = new Instruction_control_cycleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instruction_control_cycle);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(LEAVE);
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(RESTART);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(RETURN);
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SIZEOF:
				case NULL:
				case TRUE:
				case FALSE:
				case WRITE:
				case WRITELN:
				case L_PAREN:
				case INDENT:
				case LITERAL_INT:
				case LITERAL_FLOAT:
				case LITERAL_STRING:
				case PLUS:
				case MINUS:
				case QUESTION:
				case NOT:
				case AT:
					{
					setState(298);
					expression(0);
					}
					break;
				case SEMI_COLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuitionContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public Index_pointerContext index_pointer() {
			return getRuleContext(Index_pointerContext.class,0);
		}
		public AtribuitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAtribuition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAtribuition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAtribuition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuitionContext atribuition() throws RecognitionException {
		AtribuitionContext _localctx = new AtribuitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atribuition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(304);
				match(INDENT);
				}
				break;
			case 2:
				{
				setState(305);
				index_pointer();
				}
				break;
			}
			setState(308);
			match(EQUAL);
			setState(309);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_conditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(alg.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(alg.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(alg.ELSE, 0); }
		public Instruction_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInstruction_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInstruction_conditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInstruction_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_conditionalContext instruction_conditional() throws RecognitionException {
		Instruction_conditionalContext _localctx = new Instruction_conditionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instruction_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IF);
			setState(312);
			expression(0);
			setState(313);
			match(THEN);
			setState(314);
			instructions();
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(315);
				match(ELSE);
				setState(316);
				instructions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(alg.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(alg.DO, 0); }
		public List<Instructions_cycleContext> instructions_cycle() {
			return getRuleContexts(Instructions_cycleContext.class);
		}
		public Instructions_cycleContext instructions_cycle(int i) {
			return getRuleContext(Instructions_cycleContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(alg.FINALLY, 0); }
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(WHILE);
			setState(320);
			expression(0);
			setState(321);
			match(DO);
			setState(322);
			instructions_cycle();
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(323);
				match(FINALLY);
				setState(324);
				instructions_cycle();
				}
				break;
			case 2:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_blockContext extends ParserRuleContext {
		public TerminalNode L_CURVE_BRACKET() { return getToken(alg.L_CURVE_BRACKET, 0); }
		public TerminalNode R_CURVE_BRACKET() { return getToken(alg.R_CURVE_BRACKET, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Sub_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSub_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSub_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSub_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_blockContext sub_block() throws RecognitionException {
		Sub_blockContext _localctx = new Sub_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(L_CURVE_BRACKET);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WHILE) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << L_PAREN) | (1L << INDENT) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_STRING) | (1L << PLUS) | (1L << MINUS) | (1L << QUESTION) | (1L << NOT) | (1L << AT) | (1L << L_CURVE_BRACKET))) != 0)) {
				{
				{
				setState(329);
				instructions();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(R_CURVE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\2\3"+
		"\2\3\3\3\3\3\3\5\3E\n\3\3\3\5\3H\n\3\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5"+
		"\7\5R\n\5\f\5\16\5U\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bt\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3"+
		"\13\3\13\3\13\7\13\u00a3\n\13\f\13\16\13\u00a6\13\13\3\13\5\13\u00a9\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c0\n\r\3\16\3\16\5\16\u00c4\n\16\3\16"+
		"\3\16\3\16\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\16\3\16\5\16\u00d0"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u00e2\n\20\3\21\3\21\3\21\7\21\u00e7\n\21\f\21\16"+
		"\21\u00ea\13\21\3\22\5\22\u00ed\n\22\3\22\3\22\5\22\u00f1\n\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00fd\n\25\f\25\16\25"+
		"\u0100\13\25\3\25\6\25\u0103\n\25\r\25\16\25\u0104\5\25\u0107\n\25\3\25"+
		"\3\25\5\25\u010b\n\25\3\26\3\26\3\26\5\26\u0110\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0117\n\26\3\27\3\27\3\27\5\27\u011c\n\27\3\30\3\30\3\30"+
		"\5\30\u0121\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0128\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u012f\n\31\5\31\u0131\n\31\3\32\3\32\5\32\u0135\n\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0140\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0149\n\34\3\35\3\35\7\35\u014d\n\35\f"+
		"\35\16\35\u0150\13\35\3\35\3\35\3\35\2\3\16\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\5\2#$**\62\62\3\2%\'\3\2#$\4"+
		"\2+/\61\61\3\2\26\27\2\u0174\2;\3\2\2\2\4G\3\2\2\2\6K\3\2\2\2\bM\3\2\2"+
		"\2\nV\3\2\2\2\fi\3\2\2\2\16s\3\2\2\2\20\u0096\3\2\2\2\22\u0098\3\2\2\2"+
		"\24\u00a8\3\2\2\2\26\u00b0\3\2\2\2\30\u00bf\3\2\2\2\32\u00cf\3\2\2\2\34"+
		"\u00d3\3\2\2\2\36\u00e1\3\2\2\2 \u00e3\3\2\2\2\"\u00ec\3\2\2\2$\u00f2"+
		"\3\2\2\2&\u00f5\3\2\2\2(\u00f8\3\2\2\2*\u0116\3\2\2\2,\u0118\3\2\2\2."+
		"\u0127\3\2\2\2\60\u0130\3\2\2\2\62\u0134\3\2\2\2\64\u0139\3\2\2\2\66\u0141"+
		"\3\2\2\28\u014a\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>?\3\2\2\2?@\7\2\2\3@\3\3\2\2\2AD\5\6\4\2BE\7\34\2\2CE\b\3\1\2DB\3"+
		"\2\2\2DC\3\2\2\2EH\3\2\2\2FH\5\32\16\2GA\3\2\2\2GF\3\2\2\2H\5\3\2\2\2"+
		"IL\5\b\5\2JL\5\n\6\2KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2\2MN\5\f\7\2NS\7\37\2"+
		"\2OP\7\33\2\2PR\7\37\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3"+
		"\2\2\2US\3\2\2\2VW\5\f\7\2WX\7\37\2\2X^\7\60\2\2Y_\5\16\b\2Z[\7(\2\2["+
		"\\\5\16\b\2\\]\7)\2\2]_\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2_\13\3\2\2\2`j\7\3"+
		"\2\2aj\7\4\2\2bj\7\5\2\2cj\7\6\2\2dj\7\t\2\2ef\7+\2\2fg\5\f\7\2gh\7,\2"+
		"\2hj\3\2\2\2i`\3\2\2\2ia\3\2\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ie\3\2\2"+
		"\2j\r\3\2\2\2kl\b\b\1\2lt\5\20\t\2mn\7\35\2\2no\5\16\b\2op\7\36\2\2pt"+
		"\3\2\2\2qr\t\2\2\2rt\5\16\b\bsk\3\2\2\2sm\3\2\2\2sq\3\2\2\2t\u008b\3\2"+
		"\2\2uv\f\7\2\2vw\t\3\2\2w\u008a\5\16\b\bxy\f\6\2\2yz\t\4\2\2z\u008a\5"+
		"\16\b\7{|\f\5\2\2|}\t\5\2\2}\u008a\5\16\b\6~\177\f\4\2\2\177\u0080\7\63"+
		"\2\2\u0080\u008a\5\16\b\5\u0081\u0082\f\3\2\2\u0082\u0083\7\64\2\2\u0083"+
		"\u008a\5\16\b\4\u0084\u0085\f\t\2\2\u0085\u0086\7(\2\2\u0086\u0087\5\16"+
		"\b\2\u0087\u0088\7)\2\2\u0088\u008a\3\2\2\2\u0089u\3\2\2\2\u0089x\3\2"+
		"\2\2\u0089{\3\2\2\2\u0089~\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0084\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\17\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0097\7 \2\2\u008f\u0097\7\t\2\2"+
		"\u0090\u0097\7\37\2\2\u0091\u0097\7!\2\2\u0092\u0097\7\"\2\2\u0093\u0097"+
		"\7\13\2\2\u0094\u0097\7\f\2\2\u0095\u0097\5\26\f\2\u0096\u008e\3\2\2\2"+
		"\u0096\u008f\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\21\3\2\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7(\2\2\u009a\u009d\5\16\b"+
		"\2\u009b\u009e\7)\2\2\u009c\u009e\b\n\1\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\23\3\2\2\2\u009f\u00a4\5\16\b\2\u00a0\u00a1\7\33\2\2\u00a1"+
		"\u00a3\5\16\b\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2"+
		"\2\u00aa\u00ab\7\37\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00ae\7\36\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\5\30\r\2\u00b0\u00aa\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\66\2\2\u00b3"+
		"\u00b4\7\35\2\2\u00b4\u00c0\7\36\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\7"+
		"\35\2\2\u00b7\u00b8\5\16\b\2\u00b8\u00b9\7\36\2\2\u00b9\u00c0\3\2\2\2"+
		"\u00ba\u00bb\t\6\2\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\5\24\13\2\u00bd"+
		"\u00be\7\36\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b2\3\2\2\2\u00bf\u00b5\3"+
		"\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00c4\5\36\20\2\u00c2"+
		"\u00c4\b\16\1\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\7\37\2\2\u00c6\u00ca\7\35\2\2\u00c7\u00c9\5 \21\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\7\36\2\2\u00ce"+
		"\u00d0\5\34\17\2\u00cf\u00c3\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\5\"\22\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\3\2\2\u00d4"+
		"\u00d5\7\n\2\2\u00d5\u00d6\7\35\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\7"+
		"\37\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00da\7+\2\2\u00da\u00db\7\6\2\2\u00db"+
		"\u00dc\7,\2\2\u00dc\u00dd\7\37\2\2\u00dd\u00de\7\36\2\2\u00de\35\3\2\2"+
		"\2\u00df\u00e2\7\7\2\2\u00e0\u00e2\5\f\7\2\u00e1\u00df\3\2\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e8\5\b\5\2\u00e4\u00e5\7\33\2\2\u00e5"+
		"\u00e7\5\b\5\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed"+
		"\5$\23\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\5(\25\2\u00ef\u00f1\5&\24\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1#\3\2\2\2\u00f2\u00f3\7\66\2\2\u00f3\u00f4\5(\25\2\u00f4%\3"+
		"\2\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7\7\65\2\2\u00f7\'\3\2\2\2\u00f8"+
		"\u00fe\7\67\2\2\u00f9\u00fa\5\6\4\2\u00fa\u00fb\7\34\2\2\u00fb\u00fd\3"+
		"\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0106\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5."+
		"\30\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u010b\78\2\2\u0109\u010b\b\25\1\2\u010a"+
		"\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b)\3\2\2\2\u010c\u0110\5\16\b\2"+
		"\u010d\u0110\5\60\31\2\u010e\u0110\5\62\32\2\u010f\u010c\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\34"+
		"\2\2\u0112\u0117\3\2\2\2\u0113\u0117\5\64\33\2\u0114\u0117\5\66\34\2\u0115"+
		"\u0117\58\35\2\u0116\u010f\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0115\3\2\2\2\u0117+\3\2\2\2\u0118\u011b\7\22\2\2\u0119\u011c"+
		"\5\16\b\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2"+
		"\u011c-\3\2\2\2\u011d\u0121\5\16\b\2\u011e\u0121\5,\27\2\u011f\u0121\5"+
		"\62\32\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\7\34\2\2\u0123\u0128\3\2\2\2\u0124\u0128\5"+
		"\64\33\2\u0125\u0128\5\66\34\2\u0126\u0128\58\35\2\u0127\u0120\3\2\2\2"+
		"\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128/\3"+
		"\2\2\2\u0129\u0131\7\20\2\2\u012a\u0131\7\21\2\2\u012b\u012e\7\22\2\2"+
		"\u012c\u012f\5\16\b\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012b\3\2\2\2\u0131\61\3\2\2\2\u0132\u0135\7\37\2\2\u0133\u0135\5\22"+
		"\n\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7\60\2\2\u0137\u0138\5\16\b\2\u0138\63\3\2\2\2\u0139\u013a\7\23"+
		"\2\2\u013a\u013b\5\16\b\2\u013b\u013c\7\24\2\2\u013c\u013f\5.\30\2\u013d"+
		"\u013e\7\25\2\2\u013e\u0140\5.\30\2\u013f\u013d\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140\65\3\2\2\2\u0141\u0142\7\r\2\2\u0142\u0143\5\16\b\2\u0143"+
		"\u0144\7\16\2\2\u0144\u0148\5*\26\2\u0145\u0146\7\17\2\2\u0146\u0149\5"+
		"*\26\2\u0147\u0149\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\67\3\2\2\2\u014a\u014e\7\67\2\2\u014b\u014d\5.\30\2\u014c\u014b\3\2\2"+
		"\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\78\2\2\u01529\3\2\2\2(=DGKS^"+
		"is\u0089\u008b\u0096\u009d\u00a4\u00a8\u00b0\u00bf\u00c3\u00ca\u00cf\u00e1"+
		"\u00e8\u00ec\u00f0\u00fe\u0104\u0106\u010a\u010f\u0116\u011b\u0120\u0127"+
		"\u012e\u0130\u0134\u013f\u0148\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}