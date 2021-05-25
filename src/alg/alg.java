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
		LITERAL_INT=30, DOUBLE=31, LITERAL_STRING=32, PLUS=33, MINUS=34, MULT=35, 
		DIV=36, REMAIN=37, L_BRACKET=38, R_BRACKET=39, QUESTION=40, LESS_THAN=41, 
		GREATER_THAN=42, GREATER_EQUAL_THAN=43, LESS_EQUAL_THAN=44, IS_EQUAL=45, 
		EQUAL=46, DIFERENT=47, NOT=48, AND=49, OR=50, MUCH_BIGGER_THAN=51, AT=52, 
		L_CURVE_BRACKET=53, R_CURVE_BRACKET=54;
	public static final int
		RULE_start = 0, RULE_declaration = 1, RULE_variable_declation = 2, RULE_simple_declaration = 3, 
		RULE_initialization_declaration = 4, RULE_type = 5, RULE_expression = 6, 
		RULE_simple_expression = 7, RULE_index_pointer = 8, RULE_expression_list = 9, 
		RULE_function_invocation = 10, RULE_function_invocation_special = 11, 
		RULE_function_declaration = 12, RULE_function_type = 13, RULE_arg = 14, 
		RULE_body = 15, RULE_prologo = 16, RULE_epilogo = 17, RULE_block = 18, 
		RULE_instructions = 19, RULE_instruction_control = 20, RULE_atribuition = 21, 
		RULE_instruction_conditional = 22, RULE_cycle = 23, RULE_sub_block = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaration", "variable_declation", "simple_declaration", "initialization_declaration", 
			"type", "expression", "simple_expression", "index_pointer", "expression_list", 
			"function_invocation", "function_invocation_special", "function_declaration", 
			"function_type", "arg", "body", "prologo", "epilogo", "block", "instructions", 
			"instruction_control", "atribuition", "instruction_conditional", "cycle", 
			"sub_block"
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
			"DOUBLE", "LITERAL_STRING", "PLUS", "MINUS", "MULT", "DIV", "REMAIN", 
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				declaration();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << INDENT) | (1L << LESS_THAN))) != 0) );
			setState(55);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				variable_declation();
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMI_COLON:
					{
					setState(58);
					match(SEMI_COLON);
					}
					break;
				case EOF:
				case INT:
				case BOOL:
				case FLOAT:
				case STRING:
				case VOID:
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
				setState(62);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				simple_declaration();
				}
				break;
			case 2:
				_localctx = new InitializationDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(69);
			type();
			setState(70);
			match(INDENT);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					match(COMMA);
					setState(72);
					match(INDENT);
					}
					} 
				}
				setState(77);
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
			setState(78);
			type();
			setState(79);
			match(INDENT);
			setState(80);
			match(EQUAL);
			setState(86);
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
			case DOUBLE:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				{
				setState(81);
				expression(0);
				}
				break;
			case L_BRACKET:
				{
				setState(82);
				match(L_BRACKET);
				setState(83);
				expression(0);
				setState(84);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(BOOL);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(STRING);
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(LESS_THAN);
				setState(93);
				type();
				setState(94);
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
			setState(106);
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
			case DOUBLE:
			case LITERAL_STRING:
			case AT:
				{
				_localctx = new SimpleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99);
				simple_expression();
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(L_PAREN);
				setState(101);
				expression(0);
				setState(102);
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
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << QUESTION) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				expression(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(109);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << REMAIN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new BinaryComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(115);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << GREATER_EQUAL_THAN) | (1L << LESS_EQUAL_THAN) | (1L << IS_EQUAL) | (1L << DIFERENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new AndComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(AND);
						setState(119);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new OrComparatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						match(OR);
						setState(122);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new IndexArrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						match(L_BRACKET);
						setState(125);
						expression(0);
						setState(126);
						match(R_BRACKET);
						}
						break;
					}
					} 
				}
				setState(132);
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
	public static class DoubleContext extends Simple_expressionContext {
		public TerminalNode DOUBLE() { return getToken(alg.DOUBLE, 0); }
		public DoubleContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitDouble(this);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(LITERAL_INT);
				}
				break;
			case 2:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(NULL);
				}
				break;
			case 3:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(INDENT);
				}
				break;
			case 4:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(DOUBLE);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(LITERAL_STRING);
				}
				break;
			case 6:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(TRUE);
				}
				break;
			case 7:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(FALSE);
				}
				break;
			case 8:
				_localctx = new FunctionInContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
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
			setState(143);
			expression(0);
			setState(144);
			match(L_BRACKET);
			setState(145);
			expression(0);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_BRACKET:
				{
				setState(146);
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					expression(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(INDENT);
				setState(162);
				match(L_PAREN);
				setState(163);
				expression_list();
				setState(164);
				match(R_PAREN);
				}
				break;
			case SIZEOF:
			case WRITE:
			case WRITELN:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
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
		public TerminalNode AT() { return getToken(alg.AT, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public TerminalNode SIZEOF() { return getToken(alg.SIZEOF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(alg.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(alg.WRITELN, 0); }
		public Function_invocation_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction_invocation_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction_invocation_special(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction_invocation_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocation_specialContext function_invocation_special() throws RecognitionException {
		Function_invocation_specialContext _localctx = new Function_invocation_specialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_invocation_special);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(AT);
				setState(170);
				match(L_PAREN);
				setState(171);
				match(R_PAREN);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(SIZEOF);
				setState(173);
				match(L_PAREN);
				setState(174);
				expression(0);
				setState(175);
				match(R_PAREN);
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				function_invocation();
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
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case VOID:
			case LESS_THAN:
				{
				setState(181);
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
			setState(185);
			match(INDENT);
			setState(186);
			match(L_PAREN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << LESS_THAN))) != 0)) {
				{
				{
				setState(187);
				arg();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(R_PAREN);
			setState(194);
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
		enterRule(_localctx, 26, RULE_function_type);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case LESS_THAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		enterRule(_localctx, 28, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			simple_declaration();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				simple_declaration();
				}
				}
				setState(207);
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
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(208);
				prologo();
				}
			}

			setState(211);
			block();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_CURVE_BRACKET) {
				{
				setState(212);
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
		enterRule(_localctx, 32, RULE_prologo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(AT);
			setState(216);
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
		enterRule(_localctx, 34, RULE_epilogo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			block();
			setState(219);
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(L_CURVE_BRACKET);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << LESS_THAN))) != 0)) {
				{
				{
				setState(222);
				variable_declation();
				setState(223);
				match(SEMI_COLON);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					instructions();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_CURVE_BRACKET:
				{
				setState(235);
				match(R_CURVE_BRACKET);
				}
				break;
			case EOF:
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case VOID:
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
		enterRule(_localctx, 38, RULE_instructions);
		try {
			setState(249);
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
			case DOUBLE:
			case LITERAL_STRING:
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(239);
					expression(0);
					}
					break;
				case 2:
					{
					setState(240);
					instruction_control();
					}
					break;
				case 3:
					{
					setState(241);
					atribuition();
					}
					break;
				}
				setState(244);
				match(SEMI_COLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				instruction_conditional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				cycle();
				}
				break;
			case L_CURVE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
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
		public TerminalNode LEAVE() { return getToken(alg.LEAVE, 0); }
		public TerminalNode RESTART() { return getToken(alg.RESTART, 0); }
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
		enterRule(_localctx, 40, RULE_instruction_control);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(LEAVE);
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(RESTART);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(RETURN);
				setState(256);
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
				case DOUBLE:
				case LITERAL_STRING:
				case PLUS:
				case MINUS:
				case QUESTION:
				case NOT:
				case AT:
					{
					setState(254);
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
		enterRule(_localctx, 42, RULE_atribuition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(260);
				match(INDENT);
				}
				break;
			case 2:
				{
				setState(261);
				index_pointer();
				}
				break;
			}
			setState(264);
			match(EQUAL);
			setState(265);
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
		enterRule(_localctx, 44, RULE_instruction_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IF);
			setState(268);
			expression(0);
			setState(269);
			match(THEN);
			setState(270);
			instructions();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(271);
				match(ELSE);
				setState(272);
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
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
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
		enterRule(_localctx, 46, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(WHILE);
			setState(276);
			expression(0);
			setState(277);
			match(DO);
			setState(278);
			instructions();
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(279);
				match(FINALLY);
				setState(280);
				instructions();
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
		enterRule(_localctx, 48, RULE_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(L_CURVE_BRACKET);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << L_PAREN) | (1L << INDENT) | (1L << LITERAL_INT) | (1L << DOUBLE) | (1L << LITERAL_STRING) | (1L << PLUS) | (1L << MINUS) | (1L << QUESTION) | (1L << NOT) | (1L << AT) | (1L << L_CURVE_BRACKET))) != 0)) {
				{
				{
				setState(285);
				instructions();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\3\3\3\3\3\5\3?\n\3\3\3"+
		"\5\3B\n\3\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0083"+
		"\n\b\f\b\16\b\u0086\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\3\13\7\13\u009c\n\13\f\13"+
		"\16\13\u009f\13\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00aa"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\5"+
		"\16\u00ba\n\16\3\16\3\16\3\16\7\16\u00bf\n\16\f\16\16\16\u00c2\13\16\3"+
		"\16\3\16\3\16\3\17\3\17\5\17\u00c9\n\17\3\20\3\20\3\20\7\20\u00ce\n\20"+
		"\f\20\16\20\u00d1\13\20\3\21\5\21\u00d4\n\21\3\21\3\21\5\21\u00d8\n\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00e4\n\24\f\24"+
		"\16\24\u00e7\13\24\3\24\6\24\u00ea\n\24\r\24\16\24\u00eb\3\24\3\24\5\24"+
		"\u00f0\n\24\3\25\3\25\3\25\5\25\u00f5\n\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00fc\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0103\n\26\5\26\u0105\n\26"+
		"\3\27\3\27\5\27\u0109\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0114\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u011d\n\31\3"+
		"\32\3\32\7\32\u0121\n\32\f\32\16\32\u0124\13\32\3\32\3\32\3\32\2\3\16"+
		"\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\5\2#$**"+
		"\62\62\3\2%\'\3\2#$\4\2+/\61\61\3\2\26\27\2\u0143\2\65\3\2\2\2\4A\3\2"+
		"\2\2\6E\3\2\2\2\bG\3\2\2\2\nP\3\2\2\2\fb\3\2\2\2\16l\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u0091\3\2\2\2\24\u00a1\3\2\2\2\26\u00a9\3\2\2\2\30\u00b5\3"+
		"\2\2\2\32\u00b9\3\2\2\2\34\u00c8\3\2\2\2\36\u00ca\3\2\2\2 \u00d3\3\2\2"+
		"\2\"\u00d9\3\2\2\2$\u00dc\3\2\2\2&\u00df\3\2\2\2(\u00fb\3\2\2\2*\u0104"+
		"\3\2\2\2,\u0108\3\2\2\2.\u010d\3\2\2\2\60\u0115\3\2\2\2\62\u011e\3\2\2"+
		"\2\64\66\5\4\3\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"89\3\2\2\29:\7\2\2\3:\3\3\2\2\2;>\5\6\4\2<?\7\34\2\2=?\b\3\1\2><\3\2\2"+
		"\2>=\3\2\2\2?B\3\2\2\2@B\5\32\16\2A;\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CF\5"+
		"\b\5\2DF\5\n\6\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\5\f\7\2HM\7\37\2\2I"+
		"J\7\33\2\2JL\7\37\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2"+
		"\2OM\3\2\2\2PQ\5\f\7\2QR\7\37\2\2RX\7\60\2\2SY\5\16\b\2TU\7(\2\2UV\5\16"+
		"\b\2VW\7)\2\2WY\3\2\2\2XS\3\2\2\2XT\3\2\2\2Y\13\3\2\2\2Zc\7\3\2\2[c\7"+
		"\4\2\2\\c\7\5\2\2]c\7\6\2\2^_\7+\2\2_`\5\f\7\2`a\7,\2\2ac\3\2\2\2bZ\3"+
		"\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2c\r\3\2\2\2de\b\b\1\2e"+
		"m\5\20\t\2fg\7\35\2\2gh\5\16\b\2hi\7\36\2\2im\3\2\2\2jk\t\2\2\2km\5\16"+
		"\b\bld\3\2\2\2lf\3\2\2\2lj\3\2\2\2m\u0084\3\2\2\2no\f\7\2\2op\t\3\2\2"+
		"p\u0083\5\16\b\bqr\f\6\2\2rs\t\4\2\2s\u0083\5\16\b\7tu\f\5\2\2uv\t\5\2"+
		"\2v\u0083\5\16\b\6wx\f\4\2\2xy\7\63\2\2y\u0083\5\16\b\5z{\f\3\2\2{|\7"+
		"\64\2\2|\u0083\5\16\b\4}~\f\t\2\2~\177\7(\2\2\177\u0080\5\16\b\2\u0080"+
		"\u0081\7)\2\2\u0081\u0083\3\2\2\2\u0082n\3\2\2\2\u0082q\3\2\2\2\u0082"+
		"t\3\2\2\2\u0082w\3\2\2\2\u0082z\3\2\2\2\u0082}\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0090\7 \2\2\u0088\u0090\7\t\2\2\u0089\u0090\7\37\2\2\u008a"+
		"\u0090\7!\2\2\u008b\u0090\7\"\2\2\u008c\u0090\7\13\2\2\u008d\u0090\7\f"+
		"\2\2\u008e\u0090\5\26\f\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092"+
		"\5\16\b\2\u0092\u0093\7(\2\2\u0093\u0096\5\16\b\2\u0094\u0097\7)\2\2\u0095"+
		"\u0097\b\n\1\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\23\3\2\2"+
		"\2\u0098\u00a2\5\16\b\2\u0099\u009a\7\33\2\2\u009a\u009c\5\16\b\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a2\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0098\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\25\3\2\2"+
		"\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a6\5\24\13\2\u00a6"+
		"\u00a7\7\36\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5\30\r\2\u00a9\u00a3\3"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\7\66\2\2\u00ac"+
		"\u00ad\7\35\2\2\u00ad\u00b6\7\36\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\7"+
		"\35\2\2\u00b0\u00b1\5\16\b\2\u00b1\u00b2\7\36\2\2\u00b2\u00b6\3\2\2\2"+
		"\u00b3\u00b4\t\6\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00ab\3\2\2\2\u00b5\u00ae"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00ba\5\34\17\2\u00b8"+
		"\u00ba\b\16\1\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00c0\7\35\2\2\u00bd\u00bf\5\36\20\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\36\2\2"+
		"\u00c4\u00c5\5 \21\2\u00c5\33\3\2\2\2\u00c6\u00c9\7\7\2\2\u00c7\u00c9"+
		"\5\f\7\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\35\3\2\2\2\u00ca"+
		"\u00cf\5\b\5\2\u00cb\u00cc\7\33\2\2\u00cc\u00ce\5\b\5\2\u00cd\u00cb\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\37\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d2\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\5&\24\2\u00d6\u00d8"+
		"\5$\23\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2\u00d9"+
		"\u00da\7\66\2\2\u00da\u00db\5&\24\2\u00db#\3\2\2\2\u00dc\u00dd\5&\24\2"+
		"\u00dd\u00de\7\65\2\2\u00de%\3\2\2\2\u00df\u00e5\7\67\2\2\u00e0\u00e1"+
		"\5\6\4\2\u00e1\u00e2\7\34\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5(\25\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00f0\78\2\2\u00ee\u00f0\b\24\1\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00f5\5\16\b\2\u00f2\u00f5\5*\26"+
		"\2\u00f3\u00f5\5,\27\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\34\2\2\u00f7\u00fc\3\2\2\2"+
		"\u00f8\u00fc\5.\30\2\u00f9\u00fc\5\60\31\2\u00fa\u00fc\5\62\32\2\u00fb"+
		"\u00f4\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc)\3\2\2\2\u00fd\u0105\7\20\2\2\u00fe\u0105\7\21\2\2\u00ff\u0102"+
		"\7\22\2\2\u0100\u0103\5\16\b\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe"+
		"\3\2\2\2\u0104\u00ff\3\2\2\2\u0105+\3\2\2\2\u0106\u0109\7\37\2\2\u0107"+
		"\u0109\5\22\n\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3"+
		"\2\2\2\u010a\u010b\7\60\2\2\u010b\u010c\5\16\b\2\u010c-\3\2\2\2\u010d"+
		"\u010e\7\23\2\2\u010e\u010f\5\16\b\2\u010f\u0110\7\24\2\2\u0110\u0113"+
		"\5(\25\2\u0111\u0112\7\25\2\2\u0112\u0114\5(\25\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114/\3\2\2\2\u0115\u0116\7\r\2\2\u0116\u0117\5"+
		"\16\b\2\u0117\u0118\7\16\2\2\u0118\u011c\5(\25\2\u0119\u011a\7\17\2\2"+
		"\u011a\u011d\5(\25\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\61\3\2\2\2\u011e\u0122\7\67\2\2\u011f\u0121\5(\25\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\78\2\2\u0126"+
		"\63\3\2\2\2#\67>AEMXbl\u0082\u0084\u008f\u0096\u009d\u00a1\u00a9\u00b5"+
		"\u00b9\u00c0\u00c8\u00cf\u00d3\u00d7\u00e5\u00eb\u00ef\u00f4\u00fb\u0102"+
		"\u0104\u0108\u0113\u011c\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}