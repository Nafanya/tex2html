// Generated from /home/nafanya/study/parsers/tex2html/src/Tex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OPERATION=6, OP=7, CP=8, NUM=9, 
		WORD=10, DIGIT=11, LETTER=12, PARSEP=13, PREP=14, SPACE=15, SUB=16, SUP=17, 
		REL=18, BACKSLASH=19, SUM=20, FRAC=21, SQRT=22, INT=23, LIM=24, TO=25, 
		PI=26, INFTY=27, LIMITS=28, MIN=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "OPERATION", "OP", "CP", "NUM", 
		"WORD", "DIGIT", "LETTER", "PARSEP", "PREP", "SPACE", "SUB", "SUP", "REL", 
		"BACKSLASH", "SUM", "FRAC", "SQRT", "INT", "LIM", "TO", "PI", "INFTY", 
		"LIMITS", "MIN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{'", "'}'", "'$'", null, null, null, null, null, 
		null, null, null, null, null, "'_'", "'^'", null, "'\\'", "'\\sum'", "'\\frac'", 
		"'\\sqrt'", "'\\int'", "'\\lim'", "'\\to'", "'\\pi'", "'\\infty'", "'\\limits'", 
		"'\\min'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "OPERATION", "OP", "CP", "NUM", "WORD", 
		"DIGIT", "LETTER", "PARSEP", "PREP", "SPACE", "SUB", "SUP", "REL", "BACKSLASH", 
		"SUM", "FRAC", "SQRT", "INT", "LIM", "TO", "PI", "INFTY", "LIMITS", "MIN"
	};
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


	public TexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\5"+
		"\tR\n\t\3\n\6\nU\n\n\r\n\16\nV\3\13\3\13\6\13[\n\13\r\13\16\13\\\3\f\3"+
		"\f\3\r\3\r\3\16\6\16d\n\16\r\16\16\16e\3\17\3\17\3\20\6\20k\n\20\r\20"+
		"\16\20l\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\177\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\t\5\2,-//\61\61\4\2*"+
		"*]]\4\2++__\3\2\62;\5\2C\\c|\u0402\u0501\b\2##\'\'..\60\60<=AA\5\2\13"+
		"\f\17\17\"\"\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13"+
		"E\3\2\2\2\rG\3\2\2\2\17L\3\2\2\2\21Q\3\2\2\2\23T\3\2\2\2\25Z\3\2\2\2\27"+
		"^\3\2\2\2\31`\3\2\2\2\33c\3\2\2\2\35g\3\2\2\2\37j\3\2\2\2!p\3\2\2\2#r"+
		"\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0087\3\2\2\2-\u008d"+
		"\3\2\2\2/\u0093\3\2\2\2\61\u0098\3\2\2\2\63\u009d\3\2\2\2\65\u00a1\3\2"+
		"\2\2\67\u00a5\3\2\2\29\u00ac\3\2\2\2;\u00b4\3\2\2\2=>\7]\2\2>\4\3\2\2"+
		"\2?@\7_\2\2@\6\3\2\2\2AB\7}\2\2B\b\3\2\2\2CD\7\177\2\2D\n\3\2\2\2EF\7"+
		"&\2\2F\f\3\2\2\2GH\t\2\2\2H\16\3\2\2\2IM\t\3\2\2JK\7^\2\2KM\7}\2\2LI\3"+
		"\2\2\2LJ\3\2\2\2M\20\3\2\2\2NR\t\4\2\2OP\7^\2\2PR\7\177\2\2QN\3\2\2\2"+
		"QO\3\2\2\2R\22\3\2\2\2SU\5\27\f\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2W\24\3\2\2\2X[\5\31\r\2Y[\5\27\f\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]\26\3\2\2\2^_\t\5\2\2_\30\3\2\2\2`a\t\6\2\2a\32"+
		"\3\2\2\2bd\7\f\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\34\3\2\2\2"+
		"gh\t\7\2\2h\36\3\2\2\2ik\t\b\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mn\3\2\2\2no\b\20\2\2o \3\2\2\2pq\7a\2\2q\"\3\2\2\2rs\7`\2\2s$\3\2\2"+
		"\2t\177\4>@\2uv\7^\2\2vw\7n\2\2w\177\7g\2\2xy\7^\2\2yz\7i\2\2z\177\7g"+
		"\2\2{|\7^\2\2|}\7p\2\2}\177\7g\2\2~t\3\2\2\2~u\3\2\2\2~x\3\2\2\2~{\3\2"+
		"\2\2\177&\3\2\2\2\u0080\u0081\7^\2\2\u0081(\3\2\2\2\u0082\u0083\7^\2\2"+
		"\u0083\u0084\7u\2\2\u0084\u0085\7w\2\2\u0085\u0086\7o\2\2\u0086*\3\2\2"+
		"\2\u0087\u0088\7^\2\2\u0088\u0089\7h\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7e\2\2\u008c,\3\2\2\2\u008d\u008e\7^\2\2\u008e\u008f"+
		"\7u\2\2\u008f\u0090\7s\2\2\u0090\u0091\7t\2\2\u0091\u0092\7v\2\2\u0092"+
		".\3\2\2\2\u0093\u0094\7^\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7v\2\2\u0097\60\3\2\2\2\u0098\u0099\7^\2\2\u0099\u009a\7n\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7o\2\2\u009c\62\3\2\2\2\u009d\u009e\7^\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7q\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7^\2\2\u00a2"+
		"\u00a3\7r\2\2\u00a3\u00a4\7k\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7^\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7v\2\2"+
		"\u00aa\u00ab\7{\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7^\2\2\u00ad\u00ae\7n\2"+
		"\2\u00ae\u00af\7k\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2"+
		"\7v\2\2\u00b2\u00b3\7u\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5\u00b6"+
		"\7o\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8<\3\2\2\2\13\2LQVZ"+
		"\\el~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}