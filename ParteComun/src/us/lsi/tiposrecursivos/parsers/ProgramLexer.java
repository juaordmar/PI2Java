package us.lsi.tiposrecursivos.parsers;

// Generated from Program.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, TYPE=28, ID=29, INT=30, DOUBLE=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "TYPE", "ID", "INT", "DOUBLE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Declaraciones'", "'Codigo'", "':'", "'='", "'('", "')'", "','", 
			"'if'", "'else'", "'while'", "'{'", "'}'", "'(int)'", "'(double)'", "'+'", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'<='", "'<'", "'>='", "'>'", "'!='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TYPE", "ID", "INT", "DOUBLE", "WS"
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


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ba"+
		"\n\35\3\36\3\36\7\36\u00be\n\36\f\36\16\36\u00c1\13\36\3\37\6\37\u00c4"+
		"\n\37\r\37\16\37\u00c5\3 \3 \3 \5 \u00cb\n \3!\6!\u00ce\n!\r!\16!\u00cf"+
		"\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\2\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5Q\3\2\2\2"+
		"\7X\3\2\2\2\tZ\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2"+
		"\23e\3\2\2\2\25j\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35z\3\2\2"+
		"\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b"+
		"\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0092\3\2\2\2/\u0094\3\2\2\2\61"+
		"\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009c\3\2\2\2\67\u009f\3\2\2\29\u00b9"+
		"\3\2\2\2;\u00bb\3\2\2\2=\u00c3\3\2\2\2?\u00c7\3\2\2\2A\u00cd\3\2\2\2C"+
		"D\7F\2\2DE\7g\2\2EF\7e\2\2FG\7n\2\2GH\7c\2\2HI\7t\2\2IJ\7c\2\2JK\7e\2"+
		"\2KL\7k\2\2LM\7q\2\2MN\7p\2\2NO\7g\2\2OP\7u\2\2P\4\3\2\2\2QR\7E\2\2RS"+
		"\7q\2\2ST\7f\2\2TU\7k\2\2UV\7i\2\2VW\7q\2\2W\6\3\2\2\2XY\7<\2\2Y\b\3\2"+
		"\2\2Z[\7?\2\2[\n\3\2\2\2\\]\7*\2\2]\f\3\2\2\2^_\7+\2\2_\16\3\2\2\2`a\7"+
		".\2\2a\20\3\2\2\2bc\7k\2\2cd\7h\2\2d\22\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7"+
		"u\2\2hi\7g\2\2i\24\3\2\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no\7g\2"+
		"\2o\26\3\2\2\2pq\7}\2\2q\30\3\2\2\2rs\7\177\2\2s\32\3\2\2\2tu\7*\2\2u"+
		"v\7k\2\2vw\7p\2\2wx\7v\2\2xy\7+\2\2y\34\3\2\2\2z{\7*\2\2{|\7f\2\2|}\7"+
		"q\2\2}~\7w\2\2~\177\7d\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7+\2\2\u0082\36\3\2\2\2\u0083\u0084\7-\2\2\u0084 \3\2\2\2\u0085\u0086"+
		"\7/\2\2\u0086\"\3\2\2\2\u0087\u0088\7#\2\2\u0088$\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a&\3\2\2\2\u008b\u008c\7\61\2\2\u008c(\3\2\2\2\u008d\u008e"+
		"\7\'\2\2\u008e*\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091\7?\2\2\u0091,\3"+
		"\2\2\2\u0092\u0093\7>\2\2\u0093.\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096"+
		"\7?\2\2\u0096\60\3\2\2\2\u0097\u0098\7@\2\2\u0098\62\3\2\2\2\u0099\u009a"+
		"\7#\2\2\u009a\u009b\7?\2\2\u009b\64\3\2\2\2\u009c\u009d\7(\2\2\u009d\u009e"+
		"\7(\2\2\u009e\66\3\2\2\2\u009f\u00a0\7~\2\2\u00a0\u00a1\7~\2\2\u00a18"+
		"\3\2\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7p\2\2\u00a4\u00ba\7v\2\2\u00a5"+
		"\u00a6\7F\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7d\2\2"+
		"\u00a9\u00aa\7n\2\2\u00aa\u00ba\7g\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\u00b1\7i\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\7q\2"+
		"\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7c\2\2\u00b8\u00ba\7p\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a5\3\2\2\2\u00b9"+
		"\u00ab\3\2\2\2\u00ba:\3\2\2\2\u00bb\u00bf\t\2\2\2\u00bc\u00be\t\3\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0<\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\4\62;\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6>\3\2\2\2\u00c7\u00c8\5=\37\2\u00c8\u00ca\7\60\2\2\u00c9\u00cb"+
		"\5=\37\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb@\3\2\2\2\u00cc"+
		"\u00ce\t\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b!\2\2\u00d2"+
		"B\3\2\2\2\b\2\u00b9\u00bf\u00c5\u00ca\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}