// Generated from /home/paumay/Documents/uni/5eQ/LP/Compiladors/Practica/ENTREGABLE/pandaQ.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pandaQParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		NUM=32, PAR=33, WS=34;
	public static final int
		RULE_root = 0, RULE_exprSelectUnion = 1, RULE_exprSelect = 2, RULE_orderByClause = 3, 
		RULE_orderByCamp = 4, RULE_camps = 5, RULE_campCalculat = 6, RULE_paraula = 7, 
		RULE_calcul = 8, RULE_whereClause = 9, RULE_whereExpr = 10, RULE_whereCamp = 11, 
		RULE_taulesExpr = 12, RULE_innerJoinExpr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "exprSelectUnion", "exprSelect", "orderByClause", "orderByCamp", 
			"camps", "campCalculat", "paraula", "calcul", "whereClause", "whereExpr", 
			"whereCamp", "taulesExpr", "innerJoinExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'plot'", "';'", "':='", "'union'", "'all'", "'select'", "'*'", 
			"'from'", "'order by'", "','", "'asc'", "'desc'", "'as'", "'('", "')'", 
			"'/'", "'+'", "'-'", "'where'", "'not'", "'and'", "'or'", "'in'", "'='", 
			"'<'", "'>'", "'<='", "'>='", "'\"'", "'inner join'", "'on'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUM", "PAR", "WS"
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
	public String getGrammarFileName() { return "pandaQ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pandaQParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	 
		public RootContext() { }
		public void copyFrom(RootContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootStoreContext extends RootContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public ExprSelectUnionContext exprSelectUnion() {
			return getRuleContext(ExprSelectUnionContext.class,0);
		}
		public RootStoreContext(RootContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootNormalContext extends RootContext {
		public ExprSelectUnionContext exprSelectUnion() {
			return getRuleContext(ExprSelectUnionContext.class,0);
		}
		public RootNormalContext(RootContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootPlotContext extends RootContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public RootPlotContext(RootContext ctx) { copyFrom(ctx); }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new RootPlotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				setState(29);
				match(PAR);
				setState(30);
				match(T__1);
				}
				break;
			case PAR:
				_localctx = new RootStoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(PAR);
				setState(32);
				match(T__2);
				setState(33);
				exprSelectUnion();
				setState(34);
				match(T__1);
				}
				break;
			case T__5:
				_localctx = new RootNormalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				exprSelectUnion();
				setState(37);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSelectUnionContext extends ParserRuleContext {
		public List<ExprSelectContext> exprSelect() {
			return getRuleContexts(ExprSelectContext.class);
		}
		public ExprSelectContext exprSelect(int i) {
			return getRuleContext(ExprSelectContext.class,i);
		}
		public ExprSelectUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSelectUnion; }
	}

	public final ExprSelectUnionContext exprSelectUnion() throws RecognitionException {
		ExprSelectUnionContext _localctx = new ExprSelectUnionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprSelectUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			exprSelect();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(42);
				match(T__3);
				setState(43);
				match(T__4);
				setState(44);
				exprSelect();
				}
				}
				setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSelectContext extends ParserRuleContext {
		public TaulesExprContext taulesExpr() {
			return getRuleContext(TaulesExprContext.class,0);
		}
		public CampsContext camps() {
			return getRuleContext(CampsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public ExprSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSelect; }
	}

	public final ExprSelectContext exprSelect() throws RecognitionException {
		ExprSelectContext _localctx = new ExprSelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__5);
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(51);
				match(T__6);
				}
				break;
			case T__13:
			case NUM:
			case PAR:
				{
				setState(52);
				camps();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55);
			match(T__7);
			setState(56);
			taulesExpr();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(57);
				whereClause();
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(60);
				orderByClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public List<OrderByCampContext> orderByCamp() {
			return getRuleContexts(OrderByCampContext.class);
		}
		public OrderByCampContext orderByCamp(int i) {
			return getRuleContext(OrderByCampContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__8);
			setState(64);
			orderByCamp();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(65);
				match(T__9);
				setState(66);
				orderByCamp();
				}
				}
				setState(71);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByCampContext extends ParserRuleContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public OrderByCampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByCamp; }
	}

	public final OrderByCampContext orderByCamp() throws RecognitionException {
		OrderByCampContext _localctx = new OrderByCampContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_orderByCamp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PAR);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CampsContext extends ParserRuleContext {
		public List<ParaulaContext> paraula() {
			return getRuleContexts(ParaulaContext.class);
		}
		public ParaulaContext paraula(int i) {
			return getRuleContext(ParaulaContext.class,i);
		}
		public List<CampCalculatContext> campCalculat() {
			return getRuleContexts(CampCalculatContext.class);
		}
		public CampCalculatContext campCalculat(int i) {
			return getRuleContext(CampCalculatContext.class,i);
		}
		public CampsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_camps; }
	}

	public final CampsContext camps() throws RecognitionException {
		CampsContext _localctx = new CampsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_camps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(76);
				paraula();
				}
				break;
			case 2:
				{
				setState(77);
				campCalculat();
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(80);
					match(T__9);
					setState(81);
					paraula();
					}
					break;
				case 2:
					{
					setState(82);
					match(T__9);
					setState(83);
					campCalculat();
					}
					break;
				}
				}
				setState(88);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CampCalculatContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public CampCalculatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campCalculat; }
	}

	public final CampCalculatContext campCalculat() throws RecognitionException {
		CampCalculatContext _localctx = new CampCalculatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_campCalculat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			calcul(0);
			setState(90);
			match(T__12);
			setState(91);
			match(PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParaulaContext extends ParserRuleContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public ParaulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraula; }
	}

	public final ParaulaContext paraula() throws RecognitionException {
		ParaulaContext _localctx = new ParaulaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paraula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalculContext extends ParserRuleContext {
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
	 
		public CalculContext() { }
		public void copyFrom(CalculContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalculNumParContext extends CalculContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public TerminalNode NUM() { return getToken(pandaQParser.NUM, 0); }
		public CalculNumParContext(CalculContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalculParentesisContext extends CalculContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public CalculParentesisContext(CalculContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalculBinContext extends CalculContext {
		public List<CalculContext> calcul() {
			return getRuleContexts(CalculContext.class);
		}
		public CalculContext calcul(int i) {
			return getRuleContext(CalculContext.class,i);
		}
		public CalculBinContext(CalculContext ctx) { copyFrom(ctx); }
	}

	public final CalculContext calcul() throws RecognitionException {
		return calcul(0);
	}

	private CalculContext calcul(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalculContext _localctx = new CalculContext(_ctx, _parentState);
		CalculContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_calcul, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				_localctx = new CalculParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(T__13);
				setState(97);
				calcul(0);
				setState(98);
				match(T__14);
				}
				break;
			case NUM:
			case PAR:
				{
				_localctx = new CalculNumParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==PAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new CalculBinContext(new CalculContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcul);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						calcul(4);
						}
						break;
					case 2:
						{
						_localctx = new CalculBinContext(new CalculContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcul);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						calcul(3);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public WhereExprContext whereExpr() {
			return getRuleContext(WhereExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__18);
			setState(115);
			whereExpr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereExprContext extends ParserRuleContext {
		public WhereExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpr; }
	 
		public WhereExprContext() { }
		public void copyFrom(WhereExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereEqGtContext extends WhereExprContext {
		public List<WhereCampContext> whereCamp() {
			return getRuleContexts(WhereCampContext.class);
		}
		public WhereCampContext whereCamp(int i) {
			return getRuleContext(WhereCampContext.class,i);
		}
		public WhereEqGtContext(WhereExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereSubconsultaContext extends WhereExprContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public ExprSelectContext exprSelect() {
			return getRuleContext(ExprSelectContext.class,0);
		}
		public WhereSubconsultaContext(WhereExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereParentesisContext extends WhereExprContext {
		public WhereExprContext whereExpr() {
			return getRuleContext(WhereExprContext.class,0);
		}
		public WhereParentesisContext(WhereExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereAndOrContext extends WhereExprContext {
		public List<WhereExprContext> whereExpr() {
			return getRuleContexts(WhereExprContext.class);
		}
		public WhereExprContext whereExpr(int i) {
			return getRuleContext(WhereExprContext.class,i);
		}
		public WhereAndOrContext(WhereExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereNotContext extends WhereExprContext {
		public WhereExprContext whereExpr() {
			return getRuleContext(WhereExprContext.class,0);
		}
		public WhereNotContext(WhereExprContext ctx) { copyFrom(ctx); }
	}

	public final WhereExprContext whereExpr() throws RecognitionException {
		return whereExpr(0);
	}

	private WhereExprContext whereExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WhereExprContext _localctx = new WhereExprContext(_ctx, _parentState);
		WhereExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_whereExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new WhereParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118);
				match(T__13);
				setState(119);
				whereExpr(0);
				setState(120);
				match(T__14);
				}
				break;
			case 2:
				{
				_localctx = new WhereNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__19);
				setState(123);
				whereExpr(5);
				}
				break;
			case 3:
				{
				_localctx = new WhereSubconsultaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(PAR);
				setState(125);
				match(T__22);
				setState(126);
				match(T__13);
				setState(127);
				exprSelect();
				setState(128);
				match(T__14);
				}
				break;
			case 4:
				{
				_localctx = new WhereEqGtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				whereCamp();
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				whereCamp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new WhereAndOrContext(new WhereExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_whereExpr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(137);
						match(T__20);
						}
						setState(138);
						whereExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new WhereAndOrContext(new WhereExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_whereExpr);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(140);
						match(T__21);
						}
						setState(141);
						whereExpr(4);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereCampContext extends ParserRuleContext {
		public WhereCampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCamp; }
	 
		public WhereCampContext() { }
		public void copyFrom(WhereCampContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereCampStringParaulaContext extends WhereCampContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public WhereCampStringParaulaContext(WhereCampContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereCampStringCometesContext extends WhereCampContext {
		public List<TerminalNode> PAR() { return getTokens(pandaQParser.PAR); }
		public TerminalNode PAR(int i) {
			return getToken(pandaQParser.PAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(pandaQParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(pandaQParser.NUM, i);
		}
		public WhereCampStringCometesContext(WhereCampContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereCampNUMContext extends WhereCampContext {
		public TerminalNode NUM() { return getToken(pandaQParser.NUM, 0); }
		public WhereCampNUMContext(WhereCampContext ctx) { copyFrom(ctx); }
	}

	public final WhereCampContext whereCamp() throws RecognitionException {
		WhereCampContext _localctx = new WhereCampContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whereCamp);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new WhereCampNUMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(NUM);
				}
				break;
			case PAR:
				_localctx = new WhereCampStringParaulaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(PAR);
				}
				break;
			case T__28:
				_localctx = new WhereCampStringCometesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__28);
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==PAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM || _la==PAR) {
					{
					{
					setState(151);
					_la = _input.LA(1);
					if ( !(_la==NUM || _la==PAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__28);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TaulesExprContext extends ParserRuleContext {
		public TerminalNode PAR() { return getToken(pandaQParser.PAR, 0); }
		public List<InnerJoinExprContext> innerJoinExpr() {
			return getRuleContexts(InnerJoinExprContext.class);
		}
		public InnerJoinExprContext innerJoinExpr(int i) {
			return getRuleContext(InnerJoinExprContext.class,i);
		}
		public TaulesExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taulesExpr; }
	}

	public final TaulesExprContext taulesExpr() throws RecognitionException {
		TaulesExprContext _localctx = new TaulesExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_taulesExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(PAR);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(161);
				innerJoinExpr();
				}
				}
				setState(166);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerJoinExprContext extends ParserRuleContext {
		public List<TerminalNode> PAR() { return getTokens(pandaQParser.PAR); }
		public TerminalNode PAR(int i) {
			return getToken(pandaQParser.PAR, i);
		}
		public InnerJoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoinExpr; }
	}

	public final InnerJoinExprContext innerJoinExpr() throws RecognitionException {
		InnerJoinExprContext _localctx = new InnerJoinExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_innerJoinExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__29);
			setState(168);
			match(PAR);
			setState(169);
			match(T__30);
			setState(170);
			match(PAR);
			setState(171);
			match(T__23);
			setState(172);
			match(PAR);
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
		case 8:
			return calcul_sempred((CalculContext)_localctx, predIndex);
		case 10:
			return whereExpr_sempred((WhereExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean calcul_sempred(CalculContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean whereExpr_sempred(WhereExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003"+
		"\f\u0003G\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bf\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\bn\b\b\n\b\f\bq\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0087\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008f"+
		"\b\n\n\n\f\n\u0092\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0099\b\u000b\n\u000b\f\u000b\u009c\t\u000b\u0001"+
		"\u000b\u0003\u000b\u009f\b\u000b\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f"+
		"\f\f\u00a6\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0000\u0002\u0010\u0014\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0005\u0001\u0000\u000b\f\u0001"+
		"\u0000 !\u0002\u0000\u0007\u0007\u0010\u0010\u0001\u0000\u0011\u0012\u0001"+
		"\u0000\u0018\u001c\u00b7\u0000\'\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000"+
		"\u0000\bH\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fY\u0001"+
		"\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000"+
		"\u0000\u0012r\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000"+
		"\u0016\u009e\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000\u0000"+
		"\u001a\u00a7\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000"+
		"\u001d\u001e\u0005!\u0000\u0000\u001e(\u0005\u0002\u0000\u0000\u001f "+
		"\u0005!\u0000\u0000 !\u0005\u0003\u0000\u0000!\"\u0003\u0002\u0001\u0000"+
		"\"#\u0005\u0002\u0000\u0000#(\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001"+
		"\u0000%&\u0005\u0002\u0000\u0000&(\u0001\u0000\u0000\u0000\'\u001c\u0001"+
		"\u0000\u0000\u0000\'\u001f\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000"+
		"\u0000(\u0001\u0001\u0000\u0000\u0000)/\u0003\u0004\u0002\u0000*+\u0005"+
		"\u0004\u0000\u0000+,\u0005\u0005\u0000\u0000,.\u0003\u0004\u0002\u0000"+
		"-*\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000025\u0005\u0006\u0000\u000036\u0005\u0007\u0000\u0000"+
		"46\u0003\n\u0005\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000078\u0005\b\u0000\u00008:\u0003\u0018\f\u0000"+
		"9;\u0003\u0012\t\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005"+
		"\t\u0000\u0000@E\u0003\b\u0004\u0000AB\u0005\n\u0000\u0000BD\u0003\b\u0004"+
		"\u0000CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HJ\u0005!\u0000\u0000IK\u0007\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\t\u0001\u0000\u0000"+
		"\u0000LO\u0003\u000e\u0007\u0000MO\u0003\f\u0006\u0000NL\u0001\u0000\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000OV\u0001\u0000\u0000\u0000PQ\u0005\n\u0000"+
		"\u0000QU\u0003\u000e\u0007\u0000RS\u0005\n\u0000\u0000SU\u0003\f\u0006"+
		"\u0000TP\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u000b"+
		"\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0003\u0010\b\u0000"+
		"Z[\u0005\r\u0000\u0000[\\\u0005!\u0000\u0000\\\r\u0001\u0000\u0000\u0000"+
		"]^\u0005!\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0006\b\uffff\uffff"+
		"\u0000`a\u0005\u000e\u0000\u0000ab\u0003\u0010\b\u0000bc\u0005\u000f\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000df\u0007\u0001\u0000\u0000e_\u0001\u0000"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000fo\u0001\u0000\u0000\u0000gh\n\u0003"+
		"\u0000\u0000hi\u0007\u0002\u0000\u0000in\u0003\u0010\b\u0004jk\n\u0002"+
		"\u0000\u0000kl\u0007\u0003\u0000\u0000ln\u0003\u0010\b\u0003mg\u0001\u0000"+
		"\u0000\u0000mj\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0011\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0013\u0000\u0000st\u0003\u0014"+
		"\n\u0000t\u0013\u0001\u0000\u0000\u0000uv\u0006\n\uffff\uffff\u0000vw"+
		"\u0005\u000e\u0000\u0000wx\u0003\u0014\n\u0000xy\u0005\u000f\u0000\u0000"+
		"y\u0087\u0001\u0000\u0000\u0000z{\u0005\u0014\u0000\u0000{\u0087\u0003"+
		"\u0014\n\u0005|}\u0005!\u0000\u0000}~\u0005\u0017\u0000\u0000~\u007f\u0005"+
		"\u000e\u0000\u0000\u007f\u0080\u0003\u0004\u0002\u0000\u0080\u0081\u0005"+
		"\u000f\u0000\u0000\u0081\u0087\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"\u0016\u000b\u0000\u0083\u0084\u0007\u0004\u0000\u0000\u0084\u0085\u0003"+
		"\u0016\u000b\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086u\u0001\u0000"+
		"\u0000\u0000\u0086z\u0001\u0000\u0000\u0000\u0086|\u0001\u0000\u0000\u0000"+
		"\u0086\u0082\u0001\u0000\u0000\u0000\u0087\u0090\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\n\u0004\u0000\u0000\u0089\u008a\u0005\u0015\u0000\u0000\u008a"+
		"\u008f\u0003\u0014\n\u0005\u008b\u008c\n\u0003\u0000\u0000\u008c\u008d"+
		"\u0005\u0016\u0000\u0000\u008d\u008f\u0003\u0014\n\u0004\u008e\u0088\u0001"+
		"\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u009f\u0005 \u0000\u0000\u0094\u009f\u0005!\u0000"+
		"\u0000\u0095\u0096\u0005\u001d\u0000\u0000\u0096\u009a\u0007\u0001\u0000"+
		"\u0000\u0097\u0099\u0007\u0001\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u001d\u0000"+
		"\u0000\u009e\u0093\u0001\u0000\u0000\u0000\u009e\u0094\u0001\u0000\u0000"+
		"\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009f\u0017\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a4\u0005!\u0000\u0000\u00a1\u00a3\u0003\u001a\r\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\u001e\u0000\u0000\u00a8\u00a9\u0005!\u0000\u0000\u00a9"+
		"\u00aa\u0005\u001f\u0000\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0018\u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u001b\u0001"+
		"\u0000\u0000\u0000\u0013\'/5:=EJNTVemo\u0086\u008e\u0090\u009a\u009e\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}