// Generated from C:\Users\x1\OneDrive - Universidade do Algarve\LEI\06_Semestre\P2\src\algLexer.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", "TRUE", 
			"FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", "IF", 
			"THEN", "ELSE", "WRITE", "WRITELN", "SPACES", "COMMENT_E", "COMMENT_O", 
			"COMMA", "SEMI_COLON", "L_PAREN", "R_PAREN", "INDENT", "LITERAL_INT", 
			"DOUBLE", "LITERAL_STRING", "PLUS", "MINUS", "MULT", "DIV", "REMAIN", 
			"L_BRACKET", "R_BRACKET", "QUESTION", "LESS_THAN", "GREATER_THAN", "GREATER_EQUAL_THAN", 
			"LESS_EQUAL_THAN", "IS_EQUAL", "EQUAL", "DIFERENT", "NOT", "AND", "OR", 
			"MUCH_BIGGER_THAN", "AT", "L_CURVE_BRACKET", "R_CURVE_BRACKET"
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


	public algLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "algLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\6\27\u00e8\n\27\r\27\16\27\u00e9\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00f2\n\30\f\30\16\30\u00f5\13\30\3\30\5\30\u00f8\n\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0102\n\31\f\31\16\31\u0105"+
		"\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\5\36\u0115\n\36\3\36\7\36\u0118\n\36\f\36\16\36\u011b\13\36\3\37"+
		"\3\37\7\37\u011f\n\37\f\37\16\37\u0122\13\37\3\37\5\37\u0125\n\37\3 \3"+
		" \3 \6 \u012a\n \r \16 \u012b\5 \u012e\n \3 \3 \5 \u0132\n \3 \5 \u0135"+
		"\n \3!\3!\3!\3!\7!\u013b\n!\f!\16!\u013e\13!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\u013c\28\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\r\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\3\2+,\5\2C\\c|\u0082\u0101\7\2\62;C\\aac|\u0082\u0101"+
		"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2\2\2\4\2\2\2\u0080\u0080\2\u0180\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\3o\3\2\2\2\5s\3\2\2\2\7x\3\2\2\2\t~\3\2\2\2\13\u0085\3\2\2\2\r\u008a"+
		"\3\2\2\2\17\u0091\3\2\2\2\21\u0096\3\2\2\2\23\u009a\3\2\2\2\25\u009f\3"+
		"\2\2\2\27\u00a5\3\2\2\2\31\u00ab\3\2\2\2\33\u00ae\3\2\2\2\35\u00b6\3\2"+
		"\2\2\37\u00bc\3\2\2\2!\u00c4\3\2\2\2#\u00cb\3\2\2\2%\u00ce\3\2\2\2\'\u00d3"+
		"\3\2\2\2)\u00d8\3\2\2\2+\u00de\3\2\2\2-\u00e7\3\2\2\2/\u00ed\3\2\2\2\61"+
		"\u00fd\3\2\2\2\63\u010b\3\2\2\2\65\u010d\3\2\2\2\67\u010f\3\2\2\29\u0111"+
		"\3\2\2\2;\u0114\3\2\2\2=\u0124\3\2\2\2?\u0126\3\2\2\2A\u0136\3\2\2\2C"+
		"\u0141\3\2\2\2E\u0143\3\2\2\2G\u0145\3\2\2\2I\u0147\3\2\2\2K\u0149\3\2"+
		"\2\2M\u014b\3\2\2\2O\u014d\3\2\2\2Q\u014f\3\2\2\2S\u0151\3\2\2\2U\u0153"+
		"\3\2\2\2W\u0155\3\2\2\2Y\u0158\3\2\2\2[\u015b\3\2\2\2]\u015e\3\2\2\2_"+
		"\u0160\3\2\2\2a\u0163\3\2\2\2c\u0165\3\2\2\2e\u0168\3\2\2\2g\u016b\3\2"+
		"\2\2i\u016e\3\2\2\2k\u0170\3\2\2\2m\u0172\3\2\2\2op\7k\2\2pq\7p\2\2qr"+
		"\7v\2\2r\4\3\2\2\2st\7d\2\2tu\7q\2\2uv\7q\2\2vw\7n\2\2w\6\3\2\2\2xy\7"+
		"h\2\2yz\7n\2\2z{\7q\2\2{|\7c\2\2|}\7v\2\2}\b\3\2\2\2~\177\7u\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7i\2\2\u0084\n\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7q\2\2\u0087"+
		"\u0088\7k\2\2\u0088\u0089\7f\2\2\u0089\f\3\2\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7|\2\2\u008d\u008e\7g\2\2\u008e\u008f\7q\2\2"+
		"\u008f\u0090\7h\2\2\u0090\16\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7"+
		"w\2\2\u0093\u0094\7n\2\2\u0094\u0095\7n\2\2\u0095\20\3\2\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7i\2\2\u0099\22\3\2\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e"+
		"\24\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\u00a7\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\30\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7q\2\2\u00ad\32\3\2\2"+
		"\2\u00ae\u00af\7h\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7{\2\2\u00b5"+
		"\34\3\2\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7x\2\2\u00ba\u00bb\7g\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7c\2\2"+
		"\u00c1\u00c2\7t\2\2\u00c2\u00c3\7v\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7t\2"+
		"\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7p\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7h\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7p\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7(\3\2\2\2\u00d8\u00d9"+
		"\7y\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd*\3\2\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4\u00e5\7p\2\2\u00e5,\3\2\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b\27\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7%\2\2"+
		"\u00ee\u00ef\7%\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\n\3\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\b\30\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7*\2"+
		"\2\u00fe\u00ff\7,\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\n\4\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7,\2\2\u0107\u0108\7+\2"+
		"\2\u0108\u0109\3\2\2\2\u0109\u010a\b\31\2\2\u010a\62\3\2\2\2\u010b\u010c"+
		"\7.\2\2\u010c\64\3\2\2\2\u010d\u010e\7=\2\2\u010e\66\3\2\2\2\u010f\u0110"+
		"\7*\2\2\u01108\3\2\2\2\u0111\u0112\7+\2\2\u0112:\3\2\2\2\u0113\u0115\t"+
		"\5\2\2\u0114\u0113\3\2\2\2\u0115\u0119\3\2\2\2\u0116\u0118\t\6\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a<\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120\t\7\2\2\u011d\u011f"+
		"\t\b\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\7\62"+
		"\2\2\u0124\u011c\3\2\2\2\u0124\u0123\3\2\2\2\u0125>\3\2\2\2\u0126\u012d"+
		"\5=\37\2\u0127\u0129\7\60\2\2\u0128\u012a\t\b\2\2\u0129\u0128\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0134\3\2\2\2\u012f"+
		"\u0131\t\t\2\2\u0130\u0132\t\n\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\5=\37\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135@\3\2\2\2\u0136\u013c\7)\2\2\u0137\u0138\7\u0080\2"+
		"\2\u0138\u013b\n\13\2\2\u0139\u013b\n\f\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7)\2\2\u0140"+
		"B\3\2\2\2\u0141\u0142\7-\2\2\u0142D\3\2\2\2\u0143\u0144\7/\2\2\u0144F"+
		"\3\2\2\2\u0145\u0146\7,\2\2\u0146H\3\2\2\2\u0147\u0148\7\61\2\2\u0148"+
		"J\3\2\2\2\u0149\u014a\7\'\2\2\u014aL\3\2\2\2\u014b\u014c\7]\2\2\u014c"+
		"N\3\2\2\2\u014d\u014e\7_\2\2\u014eP\3\2\2\2\u014f\u0150\7A\2\2\u0150R"+
		"\3\2\2\2\u0151\u0152\7>\2\2\u0152T\3\2\2\2\u0153\u0154\7@\2\2\u0154V\3"+
		"\2\2\2\u0155\u0156\7@\2\2\u0156\u0157\7?\2\2\u0157X\3\2\2\2\u0158\u0159"+
		"\7>\2\2\u0159\u015a\7?\2\2\u015aZ\3\2\2\2\u015b\u015c\7?\2\2\u015c\u015d"+
		"\7?\2\2\u015d\\\3\2\2\2\u015e\u015f\7?\2\2\u015f^\3\2\2\2\u0160\u0161"+
		"\7#\2\2\u0161\u0162\7?\2\2\u0162`\3\2\2\2\u0163\u0164\7\u0080\2\2\u0164"+
		"b\3\2\2\2\u0165\u0166\7(\2\2\u0166\u0167\7(\2\2\u0167d\3\2\2\2\u0168\u0169"+
		"\7~\2\2\u0169\u016a\7~\2\2\u016af\3\2\2\2\u016b\u016c\7@\2\2\u016c\u016d"+
		"\7@\2\2\u016dh\3\2\2\2\u016e\u016f\7B\2\2\u016fj\3\2\2\2\u0170\u0171\7"+
		"}\2\2\u0171l\3\2\2\2\u0172\u0173\7\177\2\2\u0173n\3\2\2\2\22\2\u00e9\u00f3"+
		"\u00f7\u0103\u0114\u0117\u0119\u0120\u0124\u012b\u012d\u0131\u0134\u013a"+
		"\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}