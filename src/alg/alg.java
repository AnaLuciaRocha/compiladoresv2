// Generated from C:/Users/x1/OneDrive - Universidade do Algarve/LEI/06_Semestre/P2/src\alg.g4 by ANTLR 4.9.1
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				variable_declation();
				setState(58);
				match(SEMI_COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
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
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Initialization_declarationContext initialization_declaration() {
			return getRuleContext(Initialization_declarationContext.class,0);
		}
		public Variable_declationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterVariable_declation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitVariable_declation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitVariable_declation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declationContext variable_declation() throws RecognitionException {
		Variable_declationContext _localctx = new Variable_declationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				simple_declaration();
				}
				break;
			case 2:
				{
				setState(64);
				initialization_declaration();
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
			setState(67);
			type();
			setState(68);
			match(INDENT);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					match(COMMA);
					setState(70);
					match(INDENT);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(76);
			type();
			setState(77);
			match(INDENT);
			setState(78);
			match(EQUAL);
			setState(84);
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
				setState(79);
				expression(0);
				}
				break;
			case L_BRACKET:
				{
				setState(80);
				match(L_BRACKET);
				setState(81);
				expression(0);
				setState(82);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(BOOL);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(STRING);
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(LESS_THAN);
				setState(91);
				type();
				setState(92);
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
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(alg.L_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(alg.R_PAREN, 0); }
		public TerminalNode PLUS() { return getToken(alg.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(alg.MINUS, 0); }
		public TerminalNode NOT() { return getToken(alg.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(alg.QUESTION, 0); }
		public TerminalNode MULT() { return getToken(alg.MULT, 0); }
		public TerminalNode DIV() { return getToken(alg.DIV, 0); }
		public TerminalNode REMAIN() { return getToken(alg.REMAIN, 0); }
		public TerminalNode LESS_THAN() { return getToken(alg.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(alg.GREATER_THAN, 0); }
		public TerminalNode LESS_EQUAL_THAN() { return getToken(alg.LESS_EQUAL_THAN, 0); }
		public TerminalNode GREATER_EQUAL_THAN() { return getToken(alg.GREATER_EQUAL_THAN, 0); }
		public TerminalNode IS_EQUAL() { return getToken(alg.IS_EQUAL, 0); }
		public TerminalNode DIFERENT() { return getToken(alg.DIFERENT, 0); }
		public TerminalNode AND() { return getToken(alg.AND, 0); }
		public TerminalNode OR() { return getToken(alg.OR, 0); }
		public TerminalNode L_BRACKET() { return getToken(alg.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(alg.R_BRACKET, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(104);
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
				setState(97);
				simple_expression();
				}
				break;
			case L_PAREN:
				{
				setState(98);
				match(L_PAREN);
				setState(99);
				expression(0);
				setState(100);
				match(R_PAREN);
				}
				break;
			case PLUS:
			case MINUS:
			case QUESTION:
			case NOT:
				{
				setState(102);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << QUESTION) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				expression(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << REMAIN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << GREATER_EQUAL_THAN) | (1L << LESS_EQUAL_THAN) | (1L << IS_EQUAL) | (1L << DIFERENT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						match(AND);
						setState(117);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(119);
						match(OR);
						setState(120);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(122);
						match(L_BRACKET);
						setState(123);
						expression(0);
						setState(124);
						match(R_BRACKET);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TerminalNode LITERAL_INT() { return getToken(alg.LITERAL_INT, 0); }
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public TerminalNode INDENT() { return getToken(alg.INDENT, 0); }
		public TerminalNode DOUBLE() { return getToken(alg.DOUBLE, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(alg.LITERAL_STRING, 0); }
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_expression);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(LITERAL_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NULL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(INDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(LITERAL_STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(FALSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
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
			setState(141);
			expression(0);
			setState(142);
			match(L_BRACKET);
			setState(143);
			expression(0);
			setState(144);
			match(R_BRACKET);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					expression(0);
					}
					}
					setState(153);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(INDENT);
				setState(158);
				match(L_PAREN);
				setState(159);
				expression_list();
				setState(160);
				match(R_PAREN);
				}
				break;
			case SIZEOF:
			case WRITE:
			case WRITELN:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(AT);
				setState(166);
				match(L_PAREN);
				setState(167);
				match(R_PAREN);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(SIZEOF);
				setState(169);
				match(L_PAREN);
				setState(170);
				expression(0);
				setState(171);
				match(R_PAREN);
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case VOID:
			case LESS_THAN:
				{
				setState(177);
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
			setState(181);
			match(INDENT);
			setState(182);
			match(L_PAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << LESS_THAN))) != 0)) {
				{
				{
				setState(183);
				arg();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(R_PAREN);
			setState(190);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
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
				setState(193);
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
			setState(196);
			simple_declaration();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				simple_declaration();
				}
				}
				setState(203);
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
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(204);
				prologo();
				}
			}

			setState(207);
			block();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_CURVE_BRACKET) {
				{
				setState(208);
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
			setState(211);
			match(AT);
			setState(212);
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
			setState(214);
			block();
			setState(215);
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
			setState(217);
			match(L_CURVE_BRACKET);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << LESS_THAN))) != 0)) {
				{
				{
				setState(218);
				variable_declation();
				setState(219);
				match(SEMI_COLON);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(226);
					instructions();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_CURVE_BRACKET:
				{
				setState(231);
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
			setState(245);
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
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(235);
					expression(0);
					}
					break;
				case 2:
					{
					setState(236);
					instruction_control();
					}
					break;
				case 3:
					{
					setState(237);
					atribuition();
					}
					break;
				}
				setState(240);
				match(SEMI_COLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				instruction_conditional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				cycle();
				}
				break;
			case L_CURVE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(LEAVE);
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(RESTART);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(RETURN);
				setState(252);
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
					setState(250);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(256);
				match(INDENT);
				}
				break;
			case 2:
				{
				setState(257);
				index_pointer();
				}
				break;
			}
			setState(260);
			match(EQUAL);
			setState(261);
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
			setState(263);
			match(IF);
			setState(264);
			expression(0);
			setState(265);
			match(THEN);
			setState(266);
			instructions();
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(267);
				match(ELSE);
				setState(268);
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
			setState(271);
			match(WHILE);
			setState(272);
			expression(0);
			setState(273);
			match(DO);
			setState(274);
			instructions();
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(275);
				match(FINALLY);
				setState(276);
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
			setState(280);
			match(L_CURVE_BRACKET);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << L_PAREN) | (1L << INDENT) | (1L << LITERAL_INT) | (1L << DOUBLE) | (1L << LITERAL_STRING) | (1L << PLUS) | (1L << MINUS) | (1L << QUESTION) | (1L << NOT) | (1L << AT) | (1L << L_CURVE_BRACKET))) != 0)) {
				{
				{
				setState(281);
				instructions();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\5\4D\n\4\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f\b"+
		"\16\b\u0084\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\13"+
		"\5\13\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\16\3\16\5\16\u00b6\n\16\3\16"+
		"\3\16\3\16\7\16\u00bb\n\16\f\16\16\16\u00be\13\16\3\16\3\16\3\16\3\17"+
		"\3\17\5\17\u00c5\n\17\3\20\3\20\3\20\7\20\u00ca\n\20\f\20\16\20\u00cd"+
		"\13\20\3\21\5\21\u00d0\n\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00e0\n\24\f\24\16\24\u00e3\13"+
		"\24\3\24\6\24\u00e6\n\24\r\24\16\24\u00e7\3\24\3\24\5\24\u00ec\n\24\3"+
		"\25\3\25\3\25\5\25\u00f1\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f8\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00ff\n\26\5\26\u0101\n\26\3\27\3\27\5"+
		"\27\u0105\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0110"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0119\n\31\3\32\3\32\7\32"+
		"\u011d\n\32\f\32\16\32\u0120\13\32\3\32\3\32\3\32\2\3\16\33\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\5\2#$**\62\62\3\2%\'"+
		"\3\2#$\4\2+/\61\61\3\2\26\27\2\u013d\2\65\3\2\2\2\4?\3\2\2\2\6C\3\2\2"+
		"\2\bE\3\2\2\2\nN\3\2\2\2\f`\3\2\2\2\16j\3\2\2\2\20\u008d\3\2\2\2\22\u008f"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\u00a5\3\2\2\2\30\u00b1\3\2\2\2\32\u00b5\3"+
		"\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3\2\2\2 \u00cf\3\2\2\2\"\u00d5\3\2\2"+
		"\2$\u00d8\3\2\2\2&\u00db\3\2\2\2(\u00f7\3\2\2\2*\u0100\3\2\2\2,\u0104"+
		"\3\2\2\2.\u0109\3\2\2\2\60\u0111\3\2\2\2\62\u011a\3\2\2\2\64\66\5\4\3"+
		"\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7"+
		"\2\2\3:\3\3\2\2\2;<\5\6\4\2<=\7\34\2\2=@\3\2\2\2>@\5\32\16\2?;\3\2\2\2"+
		"?>\3\2\2\2@\5\3\2\2\2AD\5\b\5\2BD\5\n\6\2CA\3\2\2\2CB\3\2\2\2D\7\3\2\2"+
		"\2EF\5\f\7\2FK\7\37\2\2GH\7\33\2\2HJ\7\37\2\2IG\3\2\2\2JM\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\5\f\7\2OP\7\37\2\2PV\7\60\2\2"+
		"QW\5\16\b\2RS\7(\2\2ST\5\16\b\2TU\7)\2\2UW\3\2\2\2VQ\3\2\2\2VR\3\2\2\2"+
		"W\13\3\2\2\2Xa\7\3\2\2Ya\7\4\2\2Za\7\5\2\2[a\7\6\2\2\\]\7+\2\2]^\5\f\7"+
		"\2^_\7,\2\2_a\3\2\2\2`X\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2"+
		"\2a\r\3\2\2\2bc\b\b\1\2ck\5\20\t\2de\7\35\2\2ef\5\16\b\2fg\7\36\2\2gk"+
		"\3\2\2\2hi\t\2\2\2ik\5\16\b\bjb\3\2\2\2jd\3\2\2\2jh\3\2\2\2k\u0082\3\2"+
		"\2\2lm\f\7\2\2mn\t\3\2\2n\u0081\5\16\b\bop\f\6\2\2pq\t\4\2\2q\u0081\5"+
		"\16\b\7rs\f\5\2\2st\t\5\2\2t\u0081\5\16\b\6uv\f\4\2\2vw\7\63\2\2w\u0081"+
		"\5\16\b\5xy\f\3\2\2yz\7\64\2\2z\u0081\5\16\b\4{|\f\t\2\2|}\7(\2\2}~\5"+
		"\16\b\2~\177\7)\2\2\177\u0081\3\2\2\2\u0080l\3\2\2\2\u0080o\3\2\2\2\u0080"+
		"r\3\2\2\2\u0080u\3\2\2\2\u0080x\3\2\2\2\u0080{\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u008e\7 \2\2\u0086\u008e\7\t\2\2\u0087\u008e\7\37\2\2\u0088"+
		"\u008e\7!\2\2\u0089\u008e\7\"\2\2\u008a\u008e\7\13\2\2\u008b\u008e\7\f"+
		"\2\2\u008c\u008e\5\26\f\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d"+
		"\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\21\3\2\2\2\u008f\u0090"+
		"\5\16\b\2\u0090\u0091\7(\2\2\u0091\u0092\5\16\b\2\u0092\u0093\7)\2\2\u0093"+
		"\23\3\2\2\2\u0094\u009e\5\16\b\2\u0095\u0096\7\33\2\2\u0096\u0098\5\16"+
		"\b\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009e\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u0094\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\25\3\2\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\5\24"+
		"\13\2\u00a2\u00a3\7\36\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\5\30\r\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\66\2"+
		"\2\u00a8\u00a9\7\35\2\2\u00a9\u00b2\7\36\2\2\u00aa\u00ab\7\b\2\2\u00ab"+
		"\u00ac\7\35\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00ae\7\36\2\2\u00ae\u00b2"+
		"\3\2\2\2\u00af\u00b0\t\6\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00a7\3\2\2\2"+
		"\u00b1\u00aa\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b6"+
		"\5\34\17\2\u00b4\u00b6\b\16\1\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00bc\7\35\2\2\u00b9"+
		"\u00bb\5\36\20\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7\36\2\2\u00c0\u00c1\5 \21\2\u00c1\33\3\2\2\2\u00c2\u00c5\7\7\2"+
		"\2\u00c3\u00c5\5\f\7\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\35"+
		"\3\2\2\2\u00c6\u00cb\5\b\5\2\u00c7\u00c8\7\33\2\2\u00c8\u00ca\5\b\5\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5\"\22\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5&"+
		"\24\2\u00d2\u00d4\5$\23\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"!\3\2\2\2\u00d5\u00d6\7\66\2\2\u00d6\u00d7\5&\24\2\u00d7#\3\2\2\2\u00d8"+
		"\u00d9\5&\24\2\u00d9\u00da\7\65\2\2\u00da%\3\2\2\2\u00db\u00e1\7\67\2"+
		"\2\u00dc\u00dd\5\6\4\2\u00dd\u00de\7\34\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5(\25\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00ec\78\2\2\u00ea\u00ec\b\24\1\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00f1\5\16\b"+
		"\2\u00ee\u00f1\5*\26\2\u00ef\u00f1\5,\27\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\34\2\2"+
		"\u00f3\u00f8\3\2\2\2\u00f4\u00f8\5.\30\2\u00f5\u00f8\5\60\31\2\u00f6\u00f8"+
		"\5\62\32\2\u00f7\u00f0\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8)\3\2\2\2\u00f9\u0101\7\20\2\2\u00fa\u0101\7"+
		"\21\2\2\u00fb\u00fe\7\22\2\2\u00fc\u00ff\5\16\b\2\u00fd\u00ff\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00f9"+
		"\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0101+\3\2\2\2\u0102"+
		"\u0105\7\37\2\2\u0103\u0105\5\22\n\2\u0104\u0102\3\2\2\2\u0104\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\60\2\2\u0107\u0108\5\16\b\2\u0108"+
		"-\3\2\2\2\u0109\u010a\7\23\2\2\u010a\u010b\5\16\b\2\u010b\u010c\7\24\2"+
		"\2\u010c\u010f\5(\25\2\u010d\u010e\7\25\2\2\u010e\u0110\5(\25\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110/\3\2\2\2\u0111\u0112\7\r\2\2"+
		"\u0112\u0113\5\16\b\2\u0113\u0114\7\16\2\2\u0114\u0118\5(\25\2\u0115\u0116"+
		"\7\17\2\2\u0116\u0119\5(\25\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2"+
		"\u0118\u0117\3\2\2\2\u0119\61\3\2\2\2\u011a\u011e\7\67\2\2\u011b\u011d"+
		"\5(\25\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\78"+
		"\2\2\u0122\63\3\2\2\2!\67?CKV`j\u0080\u0082\u008d\u0099\u009d\u00a5\u00b1"+
		"\u00b5\u00bc\u00c4\u00cb\u00cf\u00d3\u00e1\u00e7\u00eb\u00f0\u00f7\u00fe"+
		"\u0100\u0104\u010f\u0118\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}