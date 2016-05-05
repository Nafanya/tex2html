// Generated from /home/nafanya/study/parsers/tex2html/src/Tex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OPERATION=6, OP=7, CP=8, NUM=9, 
		WORD=10, DIGIT=11, LETTER=12, PARSEP=13, PREP=14, SPACE=15, SUB=16, SUP=17, 
		REL=18, BACKSLASH=19, SUM=20, FRAC=21, SQRT=22, INT=23, LIM=24, TO=25, 
		PI=26, INFTY=27, LIMITS=28, MIN=29;
	public static final int
		RULE_document = 0, RULE_command = 1, RULE_cmdoptions = 2, RULE_cmdparams = 3, 
		RULE_units = 4, RULE_unit = 5, RULE_text = 6, RULE_words = 7, RULE_mathexpr = 8, 
		RULE_math = 9, RULE_function = 10, RULE_min = 11, RULE_lim = 12, RULE_frac = 13, 
		RULE_sum = 14, RULE_integral = 15, RULE_symbols = 16, RULE_rel = 17;
	public static final String[] ruleNames = {
		"document", "command", "cmdoptions", "cmdparams", "units", "unit", "text", 
		"words", "mathexpr", "math", "function", "min", "lim", "frac", "sum", 
		"integral", "symbols", "rel"
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

	@Override
	public String getGrammarFileName() { return "Tex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<UnitsContext> units() {
			return getRuleContexts(UnitsContext.class);
		}
		public UnitsContext units(int i) {
			return getRuleContext(UnitsContext.class,i);
		}
		public List<TerminalNode> PARSEP() { return getTokens(TexParser.PARSEP); }
		public TerminalNode PARSEP(int i) {
			return getToken(TexParser.PARSEP, i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			switch (_input.LA(1)) {
			case BACKSLASH:
				{
				setState(36);
				command();
				}
				break;
			case T__4:
			case NUM:
			case WORD:
			case PREP:
				{
				setState(37);
				units();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << NUM) | (1L << WORD) | (1L << PARSEP) | (1L << PREP) | (1L << BACKSLASH))) != 0)) {
				{
				setState(43);
				switch (_input.LA(1)) {
				case BACKSLASH:
					{
					setState(40);
					command();
					}
					break;
				case T__4:
				case NUM:
				case WORD:
				case PREP:
					{
					setState(41);
					units();
					}
					break;
				case PARSEP:
					{
					setState(42);
					match(PARSEP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode BACKSLASH() { return getToken(TexParser.BACKSLASH, 0); }
		public TerminalNode WORD() { return getToken(TexParser.WORD, 0); }
		public CmdoptionsContext cmdoptions() {
			return getRuleContext(CmdoptionsContext.class,0);
		}
		public CmdparamsContext cmdparams() {
			return getRuleContext(CmdparamsContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(BACKSLASH);
			setState(49);
			match(WORD);
			setState(51);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(50);
				cmdoptions();
				}
			}

			setState(54);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(53);
				cmdparams();
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

	public static class CmdoptionsContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CmdoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterCmdoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitCmdoptions(this);
		}
	}

	public final CmdoptionsContext cmdoptions() throws RecognitionException {
		CmdoptionsContext _localctx = new CmdoptionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmdoptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			text();
			setState(58);
			match(T__1);
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

	public static class CmdparamsContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CmdparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterCmdparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitCmdparams(this);
		}
	}

	public final CmdparamsContext cmdparams() throws RecognitionException {
		CmdparamsContext _localctx = new CmdparamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(61);
			text();
			setState(62);
			match(T__3);
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

	public static class UnitsContext extends ParserRuleContext {
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public UnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_units; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitUnits(this);
		}
	}

	public final UnitsContext units() throws RecognitionException {
		UnitsContext _localctx = new UnitsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_units);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					unit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UnitContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public MathexprContext mathexpr() {
			return getRuleContext(MathexprContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unit);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case NUM:
			case WORD:
			case PREP:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				text();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				mathexpr();
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

	public static class TextContext extends ParserRuleContext {
		public List<WordsContext> words() {
			return getRuleContexts(WordsContext.class);
		}
		public WordsContext words(int i) {
			return getRuleContext(WordsContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					words();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class WordsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(TexParser.NUM, 0); }
		public TerminalNode WORD() { return getToken(TexParser.WORD, 0); }
		public List<TerminalNode> PREP() { return getTokens(TexParser.PREP); }
		public TerminalNode PREP(int i) {
			return getToken(TexParser.PREP, i);
		}
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitWords(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		WordsContext _localctx = new WordsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_words);
		int _la;
		try {
			int _alt;
			setState(86);
			switch (_input.LA(1)) {
			case NUM:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==WORD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(79);
						match(PREP);
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case PREP:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(PREP);
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

	public static class MathexprContext extends ParserRuleContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public MathexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterMathexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitMathexpr(this);
		}
	}

	public final MathexprContext mathexpr() throws RecognitionException {
		MathexprContext _localctx = new MathexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			math(0);
			setState(90);
			match(T__4);
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

	public static class MathContext extends ParserRuleContext {
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public TerminalNode OP() { return getToken(TexParser.OP, 0); }
		public TerminalNode CP() { return getToken(TexParser.CP, 0); }
		public TerminalNode WORD() { return getToken(TexParser.WORD, 0); }
		public TerminalNode NUM() { return getToken(TexParser.NUM, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public TerminalNode OPERATION() { return getToken(TexParser.OPERATION, 0); }
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TexParser.SUB, 0); }
		public TerminalNode SUP() { return getToken(TexParser.SUP, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitMath(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		return math(0);
	}

	private MathContext math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathContext _localctx = new MathContext(_ctx, _parentState);
		MathContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_math, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(93);
				match(T__2);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
					{
					{
					setState(94);
					math(0);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(T__3);
				}
				break;
			case OP:
				{
				setState(101);
				match(OP);
				setState(102);
				math(0);
				setState(103);
				match(CP);
				}
				break;
			case WORD:
				{
				setState(105);
				match(WORD);
				}
				break;
			case NUM:
				{
				setState(106);
				match(NUM);
				}
				break;
			case SUM:
			case FRAC:
			case INT:
			case LIM:
			case MIN:
				{
				setState(107);
				function();
				}
				break;
			case TO:
			case PI:
			case INFTY:
				{
				setState(108);
				symbols();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(111);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(112);
						match(OPERATION);
						setState(113);
						math(5);
						}
						break;
					case 2:
						{
						_localctx = new MathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(115);
						rel();
						setState(116);
						math(4);
						}
						break;
					case 3:
						{
						_localctx = new MathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(119);
						match(SUB);
						setState(120);
						math(3);
						}
						break;
					case 4:
						{
						_localctx = new MathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(121);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(122);
						match(SUP);
						setState(123);
						math(2);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class FunctionContext extends ParserRuleContext {
		public LimContext lim() {
			return getRuleContext(LimContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public FracContext frac() {
			return getRuleContext(FracContext.class,0);
		}
		public IntegralContext integral() {
			return getRuleContext(IntegralContext.class,0);
		}
		public MinContext min() {
			return getRuleContext(MinContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case LIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				lim();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				sum();
				}
				break;
			case FRAC:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				frac();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				integral();
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				min();
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

	public static class MinContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(TexParser.MIN, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public TerminalNode SUB() { return getToken(TexParser.SUB, 0); }
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitMin(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_min);
		int _la;
		try {
			int _alt;
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(MIN);
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						math(0);
						}
						} 
					}
					setState(142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(MIN);
				setState(144);
				match(SUB);
				setState(145);
				match(T__2);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
					{
					{
					setState(146);
					math(0);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(T__3);
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						math(0);
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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

	public static class LimContext extends ParserRuleContext {
		public TerminalNode LIM() { return getToken(TexParser.LIM, 0); }
		public TerminalNode SUB() { return getToken(TexParser.SUB, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public LimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterLim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitLim(this);
		}
	}

	public final LimContext lim() throws RecognitionException {
		LimContext _localctx = new LimContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LIM);
			setState(162);
			match(SUB);
			setState(163);
			match(T__2);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(164);
				math(0);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__3);
			setState(171);
			match(T__2);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(172);
				math(0);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__3);
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

	public static class FracContext extends ParserRuleContext {
		public TerminalNode FRAC() { return getToken(TexParser.FRAC, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public FracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterFrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitFrac(this);
		}
	}

	public final FracContext frac() throws RecognitionException {
		FracContext _localctx = new FracContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_frac);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FRAC);
			setState(181);
			match(T__2);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(182);
				math(0);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__3);
			setState(189);
			match(T__2);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(190);
				math(0);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__3);
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

	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(TexParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(TexParser.SUB, 0); }
		public TerminalNode LIMITS() { return getToken(TexParser.LIMITS, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(SUM);
			setState(200);
			_la = _input.LA(1);
			if (_la==LIMITS) {
				{
				setState(199);
				match(LIMITS);
				}
			}

			setState(202);
			match(SUB);
			setState(203);
			match(T__2);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(204);
				math(0);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(T__3);
			setState(211);
			match(SUP);
			setState(212);
			match(T__2);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(213);
				math(0);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__3);
			setState(220);
			match(T__2);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(221);
				math(0);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(T__3);
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

	public static class IntegralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TexParser.INT, 0); }
		public TerminalNode SUB() { return getToken(TexParser.SUB, 0); }
		public TerminalNode LIMITS() { return getToken(TexParser.LIMITS, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public IntegralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterIntegral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitIntegral(this);
		}
	}

	public final IntegralContext integral() throws RecognitionException {
		IntegralContext _localctx = new IntegralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(INT);
			setState(231);
			_la = _input.LA(1);
			if (_la==LIMITS) {
				{
				setState(230);
				match(LIMITS);
				}
			}

			setState(233);
			match(SUB);
			setState(234);
			match(T__2);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(235);
				math(0);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__3);
			setState(242);
			match(SUP);
			setState(243);
			match(T__2);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OP) | (1L << NUM) | (1L << WORD) | (1L << SUM) | (1L << FRAC) | (1L << INT) | (1L << LIM) | (1L << TO) | (1L << PI) | (1L << INFTY) | (1L << MIN))) != 0)) {
				{
				{
				setState(244);
				math(0);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(T__3);
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

	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(TexParser.TO, 0); }
		public TerminalNode INFTY() { return getToken(TexParser.INFTY, 0); }
		public TerminalNode PI() { return getToken(TexParser.PI, 0); }
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TO) | (1L << PI) | (1L << INFTY))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RelContext extends ParserRuleContext {
		public TerminalNode REL() { return getToken(TexParser.REL, 0); }
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(REL);
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
		case 9:
			return math_sempred((MathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_sempred(MathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0103\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6"+
		"\6D\n\6\r\6\16\6E\3\7\3\7\5\7J\n\7\3\b\6\bM\n\b\r\b\16\bN\3\t\3\t\7\t"+
		"S\n\t\f\t\16\tV\13\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"b\n\13\f\13\16\13e\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13p\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\177\n\13\f\13\16\13\u0082\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u0089"+
		"\n\f\3\r\3\r\7\r\u008d\n\r\f\r\16\r\u0090\13\r\3\r\3\r\3\r\3\r\7\r\u0096"+
		"\n\r\f\r\16\r\u0099\13\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\5\r"+
		"\u00a2\n\r\3\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab\13\16"+
		"\3\16\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\7\17\u00ba\n\17\f\17\16\17\u00bd\13\17\3\17\3\17\3\17\7\17"+
		"\u00c2\n\17\f\17\16\17\u00c5\13\17\3\17\3\17\3\20\3\20\5\20\u00cb\n\20"+
		"\3\20\3\20\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3\13\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00d9\n\20\f\20\16\20\u00dc\13\20\3\20\3\20\3\20\7\20\u00e1"+
		"\n\20\f\20\16\20\u00e4\13\20\3\20\3\20\3\21\3\21\5\21\u00ea\n\21\3\21"+
		"\3\21\3\21\7\21\u00ef\n\21\f\21\16\21\u00f2\13\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00f8\n\21\f\21\16\21\u00fb\13\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\2\3\24\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\13"+
		"\f\3\2\33\35\u0118\2(\3\2\2\2\4\62\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\nC\3"+
		"\2\2\2\fI\3\2\2\2\16L\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24o\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3\2\2\2\34\u00b6\3\2\2\2\36\u00c8\3"+
		"\2\2\2 \u00e7\3\2\2\2\"\u00fe\3\2\2\2$\u0100\3\2\2\2&)\5\4\3\2\')\5\n"+
		"\6\2(&\3\2\2\2(\'\3\2\2\2)/\3\2\2\2*.\5\4\3\2+.\5\n\6\2,.\7\17\2\2-*\3"+
		"\2\2\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2"+
		"\2\2\61/\3\2\2\2\62\63\7\25\2\2\63\65\7\f\2\2\64\66\5\6\4\2\65\64\3\2"+
		"\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\b\5\28\67\3\2\2\289\3\2\2\29\5\3"+
		"\2\2\2:;\7\3\2\2;<\5\16\b\2<=\7\4\2\2=\7\3\2\2\2>?\7\5\2\2?@\5\16\b\2"+
		"@A\7\6\2\2A\t\3\2\2\2BD\5\f\7\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2F\13\3\2\2\2GJ\5\16\b\2HJ\5\22\n\2IG\3\2\2\2IH\3\2\2\2J\r\3\2\2\2KM"+
		"\5\20\t\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PT\t\2\2"+
		"\2QS\7\20\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2\2\2VT\3\2"+
		"\2\2WY\7\20\2\2XP\3\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\7\7\2\2[\\\5\24\13\2"+
		"\\]\7\7\2\2]\23\3\2\2\2^_\b\13\1\2_c\7\5\2\2`b\5\24\13\2a`\3\2\2\2be\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fp\7\6\2\2gh\7\t\2\2hi\5"+
		"\24\13\2ij\7\n\2\2jp\3\2\2\2kp\7\f\2\2lp\7\13\2\2mp\5\26\f\2np\5\"\22"+
		"\2o^\3\2\2\2og\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\u0080"+
		"\3\2\2\2qr\f\6\2\2rs\7\b\2\2s\177\5\24\13\7tu\f\5\2\2uv\5$\23\2vw\5\24"+
		"\13\6w\177\3\2\2\2xy\f\4\2\2yz\7\22\2\2z\177\5\24\13\5{|\f\3\2\2|}\7\23"+
		"\2\2}\177\5\24\13\4~q\3\2\2\2~t\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\25\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0089\5\32\16\2\u0084\u0089\5\36\20\2\u0085\u0089\5\34"+
		"\17\2\u0086\u0089\5 \21\2\u0087\u0089\5\30\r\2\u0088\u0083\3\2\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\27\3\2\2\2\u008a\u008e\7\37\2\2\u008b\u008d\5\24\13\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u00a2\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\37\2\2\u0092"+
		"\u0093\7\22\2\2\u0093\u0097\7\5\2\2\u0094\u0096\5\24\13\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009e\7\6\2\2\u009b\u009d\5\24"+
		"\13\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u008a\3\2"+
		"\2\2\u00a1\u0091\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\32\2\2\u00a4\u00a5"+
		"\7\22\2\2\u00a5\u00a9\7\5\2\2\u00a6\u00a8\5\24\13\2\u00a7\u00a6\3\2\2"+
		"\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00b1\7\5\2\2\u00ae"+
		"\u00b0\5\24\13\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7\6\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00bb\7\5\2"+
		"\2\u00b8\u00ba\5\24\13\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c3\7\5\2\2\u00c0\u00c2\5\24\13\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\6\2\2\u00c7"+
		"\35\3\2\2\2\u00c8\u00ca\7\26\2\2\u00c9\u00cb\7\36\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\22\2\2\u00cd"+
		"\u00d1\7\5\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00da\7"+
		"\5\2\2\u00d7\u00d9\5\24\13\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\6\2\2\u00de\u00e2\7\5\2\2\u00df\u00e1\5\24\13\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\6\2\2\u00e6"+
		"\37\3\2\2\2\u00e7\u00e9\7\31\2\2\u00e8\u00ea\7\36\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\22\2\2\u00ec"+
		"\u00f0\7\5\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\7\23\2\2\u00f5\u00f9\7"+
		"\5\2\2\u00f6\u00f8\5\24\13\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\7\6\2\2\u00fd!\3\2\2\2\u00fe\u00ff\t\3\2\2\u00ff#\3\2"+
		"\2\2\u0100\u0101\7\24\2\2\u0101%\3\2\2\2 (-/\658EINTXco~\u0080\u0088\u008e"+
		"\u0097\u009e\u00a1\u00a9\u00b1\u00bb\u00c3\u00ca\u00d1\u00da\u00e2\u00e9"+
		"\u00f0\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}