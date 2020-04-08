// Generated from E:/ideaws/compiler-geektime/antlr-test/src/main/java/me/chan/antlrtest\Hello.g4 by ANTLR 4.8
package me.chan.antlrtest.hello;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Hello extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Int=2, IntLiteral=3, StringLiteral=4, AssignmentOP=5, RelationalOP=6, 
		Star=7, Plus=8, Sharp=9, SemiColon=10, Dot=11, Comm=12, LeftBracket=13, 
		RightBracket=14, LeftBrace=15, RightBrace=16, LeftParen=17, RightParen=18, 
		Id=19, Whitespace=20, Newline=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "Int", "IntLiteral", "StringLiteral", "EscapeSequence", "HexDigit", 
			"AssignmentOP", "RelationalOP", "Star", "Plus", "Sharp", "SemiColon", 
			"Dot", "Comm", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"LeftParen", "RightParen", "Id", "Whitespace", "Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'='", null, "'*'", "'+'", "'#'", "';'", 
			"'.'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "Int", "IntLiteral", "StringLiteral", "AssignmentOP", "RelationalOP", 
			"Star", "Plus", "Sharp", "SemiColon", "Dot", "Comm", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "LeftParen", "RightParen", "Id", "Whitespace", 
			"Newline"
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


	public Hello(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\6\4B"+
		"\n\4\r\4\16\4C\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6T\n\6\3\6\5\6W\n\6\3\6\3\6\3\6\6\6\\\n\6\r\6\16\6]\3\6\3\6\3\6"+
		"\3\6\3\6\5\6e\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083"+
		"\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u009f"+
		"\n\26\f\26\16\26\u00a2\13\26\3\27\6\27\u00a5\n\27\r\27\16\27\u00a6\3\27"+
		"\3\27\3\30\3\30\5\30\u00ad\n\30\3\30\5\30\u00b0\n\30\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\5\t\6\13\2\r\2\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\21%\22\'\23)\24+\25-\26/\27\3\2\13\3\2\62;\6\2\f\f\17\17$$^^"+
		"\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;CHch\5\2C\\aac|\6\2\62;"+
		"C\\aac|\4\2\13\13\"\"\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\3\66\3\2\2\2\5>\3\2\2\2\7A\3\2\2\2\tE\3\2\2\2\13d\3\2\2\2\rf\3"+
		"\2\2\2\17h\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2"+
		"\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37"+
		"\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3"+
		"\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u00a4\3\2\2\2/\u00af\3\2\2\2\61"+
		"\62\7k\2\2\62\67\7h\2\2\63\64\7\u6fe3\2\2\64\65\7\u509d\2\2\65\67\7\u704b"+
		"\2\2\66\61\3\2\2\2\66\63\3\2\2\2\67\4\3\2\2\289\7k\2\29:\7p\2\2:?\7v\2"+
		"\2;<\7\u93c3\2\2<=\7\u6753\2\2=?\7\u8232\2\2>8\3\2\2\2>;\3\2\2\2?\6\3"+
		"\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\b\3\2\2\2EJ"+
		"\7$\2\2FI\n\3\2\2GI\5\13\6\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2J"+
		"K\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7$\2\2N\n\3\2\2\2OP\7^\2\2Pe\t\4\2\2Q"+
		"V\7^\2\2RT\t\5\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\t\6\2\2VS\3\2\2\2V"+
		"W\3\2\2\2WX\3\2\2\2Xe\t\6\2\2Y[\7^\2\2Z\\\7w\2\2[Z\3\2\2\2\\]\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\5\r\7\2`a\5\r\7\2ab\5\r\7\2bc\5\r\7\2"+
		"ce\3\2\2\2dO\3\2\2\2dQ\3\2\2\2dY\3\2\2\2e\f\3\2\2\2fg\t\7\2\2g\16\3\2"+
		"\2\2hi\7?\2\2i\20\3\2\2\2j\u0083\7@\2\2kl\7\u6fb8\2\2lm\7\u0444\2\2m\u0083"+
		"\7\u7c2e\2\2no\7@\2\2o\u0083\7?\2\2pq\7\u6fb8\2\2qr\7\u0444\2\2rs\7\u7c2e"+
		"\2\2st\7\u7edd\2\2tu\7\u590b\2\2u\u0083\7\u7c2e\2\2v\u0083\7>\2\2wx\7"+
		"\u7051\2\2xy\7\u5fd0\2\2y\u0083\7\u7c2e\2\2z{\7>\2\2{\u0083\7?\2\2|}\7"+
		"\u7051\2\2}~\7\u5fd0\2\2~\177\7\u7c2e\2\2\177\u0080\7\u7edd\2\2\u0080"+
		"\u0081\7\u590b\2\2\u0081\u0083\7\u7c2e\2\2\u0082j\3\2\2\2\u0082k\3\2\2"+
		"\2\u0082n\3\2\2\2\u0082p\3\2\2\2\u0082v\3\2\2\2\u0082w\3\2\2\2\u0082z"+
		"\3\2\2\2\u0082|\3\2\2\2\u0083\22\3\2\2\2\u0084\u0085\7,\2\2\u0085\24\3"+
		"\2\2\2\u0086\u0087\7-\2\2\u0087\26\3\2\2\2\u0088\u0089\7%\2\2\u0089\30"+
		"\3\2\2\2\u008a\u008b\7=\2\2\u008b\32\3\2\2\2\u008c\u008d\7\60\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7.\2\2\u008f\36\3\2\2\2\u0090\u0091\7]\2\2\u0091"+
		" \3\2\2\2\u0092\u0093\7_\2\2\u0093\"\3\2\2\2\u0094\u0095\7}\2\2\u0095"+
		"$\3\2\2\2\u0096\u0097\7\177\2\2\u0097&\3\2\2\2\u0098\u0099\7*\2\2\u0099"+
		"(\3\2\2\2\u009a\u009b\7+\2\2\u009b*\3\2\2\2\u009c\u00a0\t\b\2\2\u009d"+
		"\u009f\t\t\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1,\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5"+
		"\t\n\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\27\2\2\u00a9.\3\2\2\2"+
		"\u00aa\u00ac\7\17\2\2\u00ab\u00ad\7\f\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\7\f\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\30\2\2\u00b2\60\3\2\2"+
		"\2\22\2\66>CHJSV]d\u0082\u009e\u00a0\u00a6\u00ac\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}