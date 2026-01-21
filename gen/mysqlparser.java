// Generated from mysqlparser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mysqlparser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, INSERT=2, UPDATE=3, DELETE=4, MERGE=5, INTO=6, VALUES=7, SET=8, 
		FROM=9, WHERE=10, JOIN=11, ON=12, GROUP=13, BY=14, ORDER=15, HAVING=16, 
		DISTINCT=17, TOP=18, PERCENT=19, AS=20, CREATE=21, ALTER=22, DROP=23, 
		TRUNCATE=24, RENAME=25, TABLE=26, VIEW=27, INDEX=28, PRIMARY=29, UNIQUE=30, 
		CONSTRAINT=31, REFERENCES=32, DATABASE=33, DEFAULT=34, KEY=35, CLUSTERED=36, 
		NONCLUSTERED=37, INNER=38, LEFT=39, RIGHT=40, FULL=41, CROSS=42, OUTER=43, 
		DECLARE=44, CURSOR=45, OPEN=46, FETCH=47, CLOSE=48, DEALLOCATE=49, NEXT=50, 
		WITH=51, AND=52, OR=53, NOT=54, IS=55, TRUE=56, FALSE=57, NULL=58, EXISTS=59, 
		LIKE=60, IN=61, ALL=62, ANY=63, BETWEEN=64, CASE=65, WHEN=66, THEN=67, 
		ELSE=68, END=69, ASC=70, DESC=71, USING=72, MATCHED=73, ADD=74, TO=75, 
		FOR=76, IF=77, BEGIN=78, GO=79, TRY=80, CATCH=81, EXEC=82, EXECUTE=83, 
		RETURN=84, PRINT=85, USE=86, IDENTITY=87, COUNT=88, SUM=89, AVG=90, MIN=91, 
		MAX=92, ASSIGN=93, COMMA=94, CONCAT=95, DOT=96, PLUS_EQ=97, MINUS_EQ=98, 
		STAR_EQ=99, SLASH_EQ=100, EQ=101, NEQ=102, GT=103, GTE=104, LT=105, LTE=106, 
		PLUS=107, MINUS=108, STAR=109, SLASH=110, PERCENT_OP=111, LPAREN=112, 
		RPAREN=113, LBRACKET=114, RBRACKET=115, SEMI=116, BRACKETED_ID=117, DQUOTE_ID=118, 
		ID=119, HEX_STRING=120, BIT_STRING=121, INT=122, DECIMAL=123, FLOAT=124, 
		STRING=125, WS=126, LINE_COMMENT=127, BLOCK_COMMENT=128, USER_VAR=129, 
		SYSTEM_VAR=130;
	public static final int
		RULE_sqlFile = 0, RULE_statement = 1, RULE_setStatement = 2, RULE_execStatement = 3, 
		RULE_useStatement = 4, RULE_controlFlowStatement = 5, RULE_ifStatement = 6, 
		RULE_beginEndBlock = 7, RULE_tryCatchBlock = 8, RULE_dmlStatement = 9, 
		RULE_selectStatement = 10, RULE_selectClause = 11, RULE_selectList = 12, 
		RULE_selectItem = 13, RULE_alias = 14, RULE_fromClause = 15, RULE_tableSource = 16, 
		RULE_joinClause = 17, RULE_joinType = 18, RULE_whereClause = 19, RULE_groupByClause = 20, 
		RULE_havingClause = 21, RULE_orderByClause = 22, RULE_orderByItem = 23, 
		RULE_insertStatement = 24, RULE_valueRow = 25, RULE_updateStatement = 26, 
		RULE_assignment = 27, RULE_deleteStatement = 28, RULE_truncateStatement = 29, 
		RULE_mergeStatement = 30, RULE_ddlStatement = 31, RULE_createStatement = 32, 
		RULE_tableElement = 33, RULE_tableConstraint = 34, RULE_alterStatement = 35, 
		RULE_alterAction = 36, RULE_dropStatement = 37, RULE_renameStatement = 38, 
		RULE_columnDef = 39, RULE_dataType = 40, RULE_identitySpec = 41, RULE_columnConstraint = 42, 
		RULE_cursorStatement = 43, RULE_declareStatement = 44, RULE_openCursor = 45, 
		RULE_fetchCursor = 46, RULE_closeCursor = 47, RULE_deallocateCursor = 48, 
		RULE_cteStatement = 49, RULE_cteDefinition = 50, RULE_expression = 51, 
		RULE_logicalExpression = 52, RULE_relationalExpression = 53, RULE_additiveExpression = 54, 
		RULE_multiplicativeExpression = 55, RULE_unaryExpression = 56, RULE_primary = 57, 
		RULE_aggregateFunction = 58, RULE_identifierOrFunction = 59, RULE_caseExpression = 60, 
		RULE_whenClause = 61, RULE_literal = 62, RULE_identifier = 63, RULE_tableName = 64, 
		RULE_columnName = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlFile", "statement", "setStatement", "execStatement", "useStatement", 
			"controlFlowStatement", "ifStatement", "beginEndBlock", "tryCatchBlock", 
			"dmlStatement", "selectStatement", "selectClause", "selectList", "selectItem", 
			"alias", "fromClause", "tableSource", "joinClause", "joinType", "whereClause", 
			"groupByClause", "havingClause", "orderByClause", "orderByItem", "insertStatement", 
			"valueRow", "updateStatement", "assignment", "deleteStatement", "truncateStatement", 
			"mergeStatement", "ddlStatement", "createStatement", "tableElement", 
			"tableConstraint", "alterStatement", "alterAction", "dropStatement", 
			"renameStatement", "columnDef", "dataType", "identitySpec", "columnConstraint", 
			"cursorStatement", "declareStatement", "openCursor", "fetchCursor", "closeCursor", 
			"deallocateCursor", "cteStatement", "cteDefinition", "expression", "logicalExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primary", "aggregateFunction", "identifierOrFunction", 
			"caseExpression", "whenClause", "literal", "identifier", "tableName", 
			"columnName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "':='", "','", 
			"'||'", "'.'", "'+='", "'-='", "'*='", "'/='", "'='", null, "'>'", "'>='", 
			"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", 
			"']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "INSERT", "UPDATE", "DELETE", "MERGE", "INTO", "VALUES", 
			"SET", "FROM", "WHERE", "JOIN", "ON", "GROUP", "BY", "ORDER", "HAVING", 
			"DISTINCT", "TOP", "PERCENT", "AS", "CREATE", "ALTER", "DROP", "TRUNCATE", 
			"RENAME", "TABLE", "VIEW", "INDEX", "PRIMARY", "UNIQUE", "CONSTRAINT", 
			"REFERENCES", "DATABASE", "DEFAULT", "KEY", "CLUSTERED", "NONCLUSTERED", 
			"INNER", "LEFT", "RIGHT", "FULL", "CROSS", "OUTER", "DECLARE", "CURSOR", 
			"OPEN", "FETCH", "CLOSE", "DEALLOCATE", "NEXT", "WITH", "AND", "OR", 
			"NOT", "IS", "TRUE", "FALSE", "NULL", "EXISTS", "LIKE", "IN", "ALL", 
			"ANY", "BETWEEN", "CASE", "WHEN", "THEN", "ELSE", "END", "ASC", "DESC", 
			"USING", "MATCHED", "ADD", "TO", "FOR", "IF", "BEGIN", "GO", "TRY", "CATCH", 
			"EXEC", "EXECUTE", "RETURN", "PRINT", "USE", "IDENTITY", "COUNT", "SUM", 
			"AVG", "MIN", "MAX", "ASSIGN", "COMMA", "CONCAT", "DOT", "PLUS_EQ", "MINUS_EQ", 
			"STAR_EQ", "SLASH_EQ", "EQ", "NEQ", "GT", "GTE", "LT", "LTE", "PLUS", 
			"MINUS", "STAR", "SLASH", "PERCENT_OP", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "SEMI", "BRACKETED_ID", "DQUOTE_ID", "ID", "HEX_STRING", 
			"BIT_STRING", "INT", "DECIMAL", "FLOAT", "STRING", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT", "USER_VAR", "SYSTEM_VAR"
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
	public String getGrammarFileName() { return "mysqlparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mysqlparser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mysqlparser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SqlFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterSqlFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitSqlFile(this);
		}
	}

	public final SqlFileContext sqlFile() throws RecognitionException {
		SqlFileContext _localctx = new SqlFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3324923227406654L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 615L) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(mysqlparser.SEMI, 0); }
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public CursorStatementContext cursorStatement() {
			return getRuleContext(CursorStatementContext.class,0);
		}
		public CteStatementContext cteStatement() {
			return getRuleContext(CteStatementContext.class,0);
		}
		public ControlFlowStatementContext controlFlowStatement() {
			return getRuleContext(ControlFlowStatementContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public ExecStatementContext execStatement() {
			return getRuleContext(ExecStatementContext.class,0);
		}
		public UseStatementContext useStatement() {
			return getRuleContext(UseStatementContext.class,0);
		}
		public TerminalNode GO() { return getToken(mysqlparser.GO, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case MERGE:
			case TRUNCATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				dmlStatement();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(141);
					match(SEMI);
					}
				}

				}
				break;
			case CREATE:
			case ALTER:
			case DROP:
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				ddlStatement();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(145);
					match(SEMI);
					}
				}

				}
				break;
			case DECLARE:
			case OPEN:
			case FETCH:
			case CLOSE:
			case DEALLOCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				cursorStatement();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(149);
					match(SEMI);
					}
				}

				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				cteStatement();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(153);
					match(SEMI);
					}
				}

				}
				break;
			case IF:
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				controlFlowStatement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				setStatement();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(158);
					match(SEMI);
					}
				}

				}
				break;
			case EXEC:
			case EXECUTE:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				execStatement();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(162);
					match(SEMI);
					}
				}

				}
				break;
			case USE:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				useStatement();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(166);
					match(SEMI);
					}
				}

				}
				break;
			case GO:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				match(GO);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(170);
					match(SEMI);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(mysqlparser.SET, 0); }
		public TerminalNode USER_VAR() { return getToken(mysqlparser.USER_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mysqlparser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(mysqlparser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(mysqlparser.MINUS_EQ, 0); }
		public TerminalNode STAR_EQ() { return getToken(mysqlparser.STAR_EQ, 0); }
		public TerminalNode SLASH_EQ() { return getToken(mysqlparser.SLASH_EQ, 0); }
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitSetStatement(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SET);
			setState(176);
			match(USER_VAR);
			setState(177);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			expression();
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
	public static class ExecStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EXEC() { return getToken(mysqlparser.EXEC, 0); }
		public TerminalNode EXECUTE() { return getToken(mysqlparser.EXECUTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public ExecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterExecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitExecStatement(this);
		}
	}

	public final ExecStatementContext execStatement() throws RecognitionException {
		ExecStatementContext _localctx = new ExecStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_execStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==EXEC || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			identifier();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & -8917126729617635267L) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 6399L) != 0)) {
				{
				setState(182);
				expression();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					expression();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class UseStatementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(mysqlparser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterUseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitUseStatement(this);
		}
	}

	public final UseStatementContext useStatement() throws RecognitionException {
		UseStatementContext _localctx = new UseStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_useStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(USE);
			setState(193);
			identifier();
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
	public static class ControlFlowStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BeginEndBlockContext beginEndBlock() {
			return getRuleContext(BeginEndBlockContext.class,0);
		}
		public TryCatchBlockContext tryCatchBlock() {
			return getRuleContext(TryCatchBlockContext.class,0);
		}
		public ControlFlowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlFlowStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterControlFlowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitControlFlowStatement(this);
		}
	}

	public final ControlFlowStatementContext controlFlowStatement() throws RecognitionException {
		ControlFlowStatementContext _localctx = new ControlFlowStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controlFlowStatement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				beginEndBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				tryCatchBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mysqlparser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(mysqlparser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IF);
			setState(201);
			expression();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					statement();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(208);
				match(ELSE);
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						statement();
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BeginEndBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(mysqlparser.BEGIN, 0); }
		public TerminalNode END() { return getToken(mysqlparser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BeginEndBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginEndBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterBeginEndBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitBeginEndBlock(this);
		}
	}

	public final BeginEndBlockContext beginEndBlock() throws RecognitionException {
		BeginEndBlockContext _localctx = new BeginEndBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_beginEndBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(BEGIN);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3324923227406654L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 615L) != 0)) {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(END);
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
	public static class TryCatchBlockContext extends ParserRuleContext {
		public List<TerminalNode> BEGIN() { return getTokens(mysqlparser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(mysqlparser.BEGIN, i);
		}
		public List<TerminalNode> TRY() { return getTokens(mysqlparser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(mysqlparser.TRY, i);
		}
		public List<TerminalNode> END() { return getTokens(mysqlparser.END); }
		public TerminalNode END(int i) {
			return getToken(mysqlparser.END, i);
		}
		public List<TerminalNode> CATCH() { return getTokens(mysqlparser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(mysqlparser.CATCH, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TryCatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterTryCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitTryCatchBlock(this);
		}
	}

	public final TryCatchBlockContext tryCatchBlock() throws RecognitionException {
		TryCatchBlockContext _localctx = new TryCatchBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tryCatchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(BEGIN);
			setState(227);
			match(TRY);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3324923227406654L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 615L) != 0)) {
				{
				{
				setState(228);
				statement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(END);
			setState(235);
			match(TRY);
			setState(236);
			match(BEGIN);
			setState(237);
			match(CATCH);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3324923227406654L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 615L) != 0)) {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(END);
			setState(245);
			match(CATCH);
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
	public static class DmlStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public TruncateStatementContext truncateStatement() {
			return getRuleContext(TruncateStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDmlStatement(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dmlStatement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				selectStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				insertStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				deleteStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				truncateStatement();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				mergeStatement();
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
	public static class SelectStatementContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitSelectStatement(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			selectClause();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(256);
				fromClause();
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215117312L) != 0)) {
				{
				{
				setState(259);
				joinClause();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(265);
				whereClause();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(268);
				groupByClause();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(271);
				havingClause();
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(274);
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
	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(mysqlparser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode TOP() { return getToken(mysqlparser.TOP, 0); }
		public TerminalNode INT() { return getToken(mysqlparser.INT, 0); }
		public TerminalNode DISTINCT() { return getToken(mysqlparser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(mysqlparser.ALL, 0); }
		public TerminalNode PERCENT() { return getToken(mysqlparser.PERCENT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitSelectClause(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SELECT);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(281);
				match(TOP);
				setState(282);
				match(INT);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(283);
					match(PERCENT);
					}
				}

				}
			}

			setState(288);
			selectList();
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
	public static class SelectListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(mysqlparser.STAR, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitSelectList(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectList);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(STAR);
				}
				break;
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case EXISTS:
			case CASE:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case MINUS:
			case LPAREN:
			case BRACKETED_ID:
			case DQUOTE_ID:
			case ID:
			case HEX_STRING:
			case BIT_STRING:
			case INT:
			case DECIMAL:
			case FLOAT:
			case STRING:
			case USER_VAR:
			case SYSTEM_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				selectItem();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(292);
					match(COMMA);
					setState(293);
					selectItem();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public TerminalNode USER_VAR() { return getToken(mysqlparser.USER_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mysqlparser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(mysqlparser.PLUS_EQ, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(mysqlparser.AS, 0); }
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitSelectItem(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectItem);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(USER_VAR);
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==PLUS_EQ || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				expression();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 263L) != 0)) {
					{
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(305);
						match(AS);
						}
					}

					setState(308);
					alias();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(mysqlparser.STRING, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alias);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKETED_ID:
			case DQUOTE_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(STRING);
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
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(mysqlparser.FROM, 0); }
		public List<TableSourceContext> tableSource() {
			return getRuleContexts(TableSourceContext.class);
		}
		public TableSourceContext tableSource(int i) {
			return getRuleContext(TableSourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FROM);
			setState(318);
			tableSource();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(319);
				match(COMMA);
				setState(320);
				tableSource();
				}
				}
				setState(325);
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
	public static class TableSourceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(mysqlparser.AS, 0); }
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterTableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitTableSource(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			tableName();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 7L) != 0)) {
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(327);
					match(AS);
					}
				}

				setState(330);
				identifier();
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
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(mysqlparser.JOIN, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode ON() { return getToken(mysqlparser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitJoinClause(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215115264L) != 0)) {
				{
				setState(333);
				joinType();
				}
			}

			setState(336);
			match(JOIN);
			setState(337);
			tableSource();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(338);
				match(ON);
				setState(339);
				expression();
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
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(mysqlparser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(mysqlparser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(mysqlparser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(mysqlparser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(mysqlparser.FULL, 0); }
		public TerminalNode CROSS() { return getToken(mysqlparser.CROSS, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitJoinType(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinType);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(LEFT);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(344);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(RIGHT);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(348);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(FULL);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(352);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				match(CROSS);
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
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(mysqlparser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(WHERE);
			setState(359);
			expression();
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
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(mysqlparser.GROUP, 0); }
		public TerminalNode BY() { return getToken(mysqlparser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(GROUP);
			setState(362);
			match(BY);
			setState(363);
			expression();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				expression();
				}
				}
				setState(370);
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
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(mysqlparser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitHavingClause(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(HAVING);
			setState(372);
			expression();
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
		public TerminalNode ORDER() { return getToken(mysqlparser.ORDER, 0); }
		public TerminalNode BY() { return getToken(mysqlparser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ORDER);
			setState(375);
			match(BY);
			setState(376);
			orderByItem();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				orderByItem();
				}
				}
				setState(383);
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
	public static class OrderByItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(mysqlparser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysqlparser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitOrderByItem(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			expression();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
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
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(mysqlparser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(mysqlparser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(mysqlparser.VALUES, 0); }
		public List<ValueRowContext> valueRow() {
			return getRuleContexts(ValueRowContext.class);
		}
		public ValueRowContext valueRow(int i) {
			return getRuleContext(ValueRowContext.class,i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitInsertStatement(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(INSERT);
			setState(389);
			match(INTO);
			setState(390);
			tableName();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(391);
				match(LPAREN);
				setState(392);
				columnName();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393);
					match(COMMA);
					setState(394);
					columnName();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400);
				match(RPAREN);
				}
			}

			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(404);
				match(VALUES);
				setState(405);
				valueRow();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(406);
					match(COMMA);
					setState(407);
					valueRow();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SELECT:
				{
				setState(413);
				selectStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueRowContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public ValueRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterValueRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitValueRow(this);
		}
	}

	public final ValueRowContext valueRow() throws RecognitionException {
		ValueRowContext _localctx = new ValueRowContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_valueRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LPAREN);
			setState(417);
			expression();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				expression();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(RPAREN);
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
	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(mysqlparser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(mysqlparser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitUpdateStatement(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(UPDATE);
			setState(428);
			tableName();
			setState(429);
			match(SET);
			setState(430);
			assignment();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				assignment();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(438);
				whereClause();
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
	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mysqlparser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			columnName();
			setState(442);
			match(EQ);
			setState(443);
			expression();
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
	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(mysqlparser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(mysqlparser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDeleteStatement(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(DELETE);
			setState(446);
			match(FROM);
			setState(447);
			tableName();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(448);
				whereClause();
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
	public static class TruncateStatementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(mysqlparser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(mysqlparser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterTruncateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitTruncateStatement(this);
		}
	}

	public final TruncateStatementContext truncateStatement() throws RecognitionException {
		TruncateStatementContext _localctx = new TruncateStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TRUNCATE);
			setState(452);
			match(TABLE);
			setState(453);
			tableName();
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
	public static class MergeStatementContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(mysqlparser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(mysqlparser.INTO, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode USING() { return getToken(mysqlparser.USING, 0); }
		public TerminalNode ON() { return getToken(mysqlparser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WHEN() { return getTokens(mysqlparser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(mysqlparser.WHEN, i);
		}
		public List<TerminalNode> MATCHED() { return getTokens(mysqlparser.MATCHED); }
		public TerminalNode MATCHED(int i) {
			return getToken(mysqlparser.MATCHED, i);
		}
		public List<TerminalNode> THEN() { return getTokens(mysqlparser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(mysqlparser.THEN, i);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public TerminalNode NOT() { return getToken(mysqlparser.NOT, 0); }
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitMergeStatement(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mergeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(MERGE);
			setState(456);
			match(INTO);
			setState(457);
			tableName();
			setState(458);
			match(USING);
			setState(459);
			tableName();
			setState(460);
			match(ON);
			setState(461);
			expression();
			setState(462);
			match(WHEN);
			setState(463);
			match(MATCHED);
			setState(464);
			match(THEN);
			setState(465);
			updateStatement();
			setState(466);
			match(WHEN);
			setState(467);
			match(NOT);
			setState(468);
			match(MATCHED);
			setState(469);
			match(THEN);
			setState(470);
			insertStatement();
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
	public static class DdlStatementContext extends ParserRuleContext {
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public AlterStatementContext alterStatement() {
			return getRuleContext(AlterStatementContext.class,0);
		}
		public DropStatementContext dropStatement() {
			return getRuleContext(DropStatementContext.class,0);
		}
		public RenameStatementContext renameStatement() {
			return getRuleContext(RenameStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDdlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDdlStatement(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ddlStatement);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				createStatement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				alterStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				dropStatement();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				renameStatement();
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
	public static class CreateStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlparser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(mysqlparser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitCreateStatement(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(CREATE);
			setState(479);
			match(TABLE);
			setState(480);
			tableName();
			setState(481);
			match(LPAREN);
			setState(482);
			tableElement();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(483);
				match(COMMA);
				setState(484);
				tableElement();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(RPAREN);
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
	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefContext columnDef() {
			return getRuleContext(ColumnDefContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitTableElement(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableElement);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKETED_ID:
			case DQUOTE_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				columnDef();
				}
				break;
			case PRIMARY:
			case UNIQUE:
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				tableConstraint();
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
	public static class TableConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(mysqlparser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlparser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(mysqlparser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public TerminalNode CLUSTERED() { return getToken(mysqlparser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(mysqlparser.NONCLUSTERED, 0); }
		public TerminalNode UNIQUE() { return getToken(mysqlparser.UNIQUE, 0); }
		public TerminalNode REFERENCES() { return getToken(mysqlparser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitTableConstraint(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableConstraint);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(496);
					match(CONSTRAINT);
					setState(497);
					identifier();
					}
				}

				setState(500);
				match(PRIMARY);
				setState(501);
				match(KEY);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(502);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(505);
				match(LPAREN);
				setState(506);
				columnName();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(507);
					match(COMMA);
					setState(508);
					columnName();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(516);
					match(CONSTRAINT);
					setState(517);
					identifier();
					}
				}

				setState(520);
				match(UNIQUE);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(521);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(524);
				match(LPAREN);
				setState(525);
				columnName();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(526);
					match(COMMA);
					setState(527);
					columnName();
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(535);
					match(CONSTRAINT);
					setState(536);
					identifier();
					}
				}

				setState(539);
				match(REFERENCES);
				setState(540);
				tableName();
				setState(541);
				match(LPAREN);
				setState(542);
				columnName();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(543);
					match(COMMA);
					setState(544);
					columnName();
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlparser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(mysqlparser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<AlterActionContext> alterAction() {
			return getRuleContexts(AlterActionContext.class);
		}
		public AlterActionContext alterAction(int i) {
			return getRuleContext(AlterActionContext.class,i);
		}
		public AlterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterAlterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitAlterStatement(this);
		}
	}

	public final AlterStatementContext alterStatement() throws RecognitionException {
		AlterStatementContext _localctx = new AlterStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alterStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(ALTER);
			setState(555);
			match(TABLE);
			setState(556);
			tableName();
			setState(558); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(557);
					alterAction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(560); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterActionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlparser.ADD, 0); }
		public ColumnDefContext columnDef() {
			return getRuleContext(ColumnDefContext.class,0);
		}
		public TerminalNode DROP() { return getToken(mysqlparser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(mysqlparser.ALTER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AlterActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterAlterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitAlterAction(this);
		}
	}

	public final AlterActionContext alterAction() throws RecognitionException {
		AlterActionContext _localctx = new AlterActionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alterAction);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(ADD);
				setState(563);
				columnDef();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(DROP);
				setState(565);
				columnName();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(ALTER);
				setState(567);
				columnName();
				setState(568);
				dataType();
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
	public static class DropStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlparser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(mysqlparser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDropStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDropStatement(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dropStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(DROP);
			setState(573);
			match(TABLE);
			setState(574);
			tableName();
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
	public static class RenameStatementContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(mysqlparser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(mysqlparser.TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(mysqlparser.TO, 0); }
		public RenameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterRenameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitRenameStatement(this);
		}
	}

	public final RenameStatementContext renameStatement() throws RecognitionException {
		RenameStatementContext _localctx = new RenameStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_renameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(RENAME);
			setState(577);
			match(TABLE);
			setState(578);
			tableName();
			setState(579);
			match(TO);
			setState(580);
			tableName();
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
	public static class ColumnDefContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public IdentitySpecContext identitySpec() {
			return getRuleContext(IdentitySpecContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitColumnDef(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			columnName();
			setState(583);
			dataType();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(584);
				identitySpec();
				}
			}

			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 306244797746642944L) != 0)) {
				{
				{
				setState(587);
				columnConstraint();
				}
				}
				setState(592);
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
	public static class DataTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(mysqlparser.INT); }
		public TerminalNode INT(int i) {
			return getToken(mysqlparser.INT, i);
		}
		public TerminalNode MAX() { return getToken(mysqlparser.MAX, 0); }
		public TerminalNode COMMA() { return getToken(mysqlparser.COMMA, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			identifier();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(594);
				match(LPAREN);
				setState(595);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(596);
					match(COMMA);
					setState(597);
					match(INT);
					}
				}

				setState(600);
				match(RPAREN);
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
	public static class IdentitySpecContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(mysqlparser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(mysqlparser.INT); }
		public TerminalNode INT(int i) {
			return getToken(mysqlparser.INT, i);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(mysqlparser.COMMA, 0); }
		public IdentitySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identitySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterIdentitySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitIdentitySpec(this);
		}
	}

	public final IdentitySpecContext identitySpec() throws RecognitionException {
		IdentitySpecContext _localctx = new IdentitySpecContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identitySpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(IDENTITY);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(604);
				match(LPAREN);
				setState(605);
				match(INT);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(606);
					match(COMMA);
					setState(607);
					match(INT);
					}
				}

				setState(610);
				match(RPAREN);
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
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(mysqlparser.NOT, 0); }
		public TerminalNode NULL() { return getToken(mysqlparser.NULL, 0); }
		public TerminalNode PRIMARY() { return getToken(mysqlparser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlparser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(mysqlparser.UNIQUE, 0); }
		public TerminalNode REFERENCES() { return getToken(mysqlparser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlparser.DEFAULT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitColumnConstraint(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_columnConstraint);
		int _la;
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(NOT);
				setState(614);
				match(NULL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(NULL);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				match(PRIMARY);
				setState(617);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(UNIQUE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(619);
				match(REFERENCES);
				setState(620);
				tableName();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(621);
					match(LPAREN);
					setState(622);
					columnName();
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(623);
						match(COMMA);
						setState(624);
						columnName();
						}
						}
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(630);
					match(RPAREN);
					}
				}

				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
				match(DEFAULT);
				setState(635);
				literal();
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
	public static class CursorStatementContext extends ParserRuleContext {
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
		}
		public OpenCursorContext openCursor() {
			return getRuleContext(OpenCursorContext.class,0);
		}
		public FetchCursorContext fetchCursor() {
			return getRuleContext(FetchCursorContext.class,0);
		}
		public CloseCursorContext closeCursor() {
			return getRuleContext(CloseCursorContext.class,0);
		}
		public DeallocateCursorContext deallocateCursor() {
			return getRuleContext(DeallocateCursorContext.class,0);
		}
		public CursorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterCursorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitCursorStatement(this);
		}
	}

	public final CursorStatementContext cursorStatement() throws RecognitionException {
		CursorStatementContext _localctx = new CursorStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cursorStatement);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				declareStatement();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				openCursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				fetchCursor();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(641);
				closeCursor();
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				deallocateCursor();
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
	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(mysqlparser.DECLARE, 0); }
		public TerminalNode USER_VAR() { return getToken(mysqlparser.USER_VAR, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mysqlparser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(mysqlparser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(mysqlparser.CURSOR, 0); }
		public TerminalNode FOR() { return getToken(mysqlparser.FOR, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDeclareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDeclareStatement(this);
		}
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declareStatement);
		int _la;
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(DECLARE);
				setState(646);
				match(USER_VAR);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 7L) != 0)) {
					{
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(647);
						match(AS);
						}
					}

					setState(650);
					dataType();
					}
				}

				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(653);
					match(EQ);
					setState(654);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(DECLARE);
				setState(658);
				identifier();
				setState(659);
				match(CURSOR);
				setState(660);
				match(FOR);
				setState(661);
				selectStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenCursorContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(mysqlparser.OPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpenCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterOpenCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitOpenCursor(this);
		}
	}

	public final OpenCursorContext openCursor() throws RecognitionException {
		OpenCursorContext _localctx = new OpenCursorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_openCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(OPEN);
			setState(666);
			identifier();
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
	public static class FetchCursorContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(mysqlparser.FETCH, 0); }
		public TerminalNode NEXT() { return getToken(mysqlparser.NEXT, 0); }
		public TerminalNode FROM() { return getToken(mysqlparser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTO() { return getToken(mysqlparser.INTO, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public FetchCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchCursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterFetchCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitFetchCursor(this);
		}
	}

	public final FetchCursorContext fetchCursor() throws RecognitionException {
		FetchCursorContext _localctx = new FetchCursorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fetchCursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(FETCH);
			setState(669);
			match(NEXT);
			setState(670);
			match(FROM);
			setState(671);
			identifier();
			setState(672);
			match(INTO);
			setState(673);
			columnName();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(674);
				match(COMMA);
				setState(675);
				columnName();
				}
				}
				setState(680);
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
	public static class CloseCursorContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(mysqlparser.CLOSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CloseCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterCloseCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitCloseCursor(this);
		}
	}

	public final CloseCursorContext closeCursor() throws RecognitionException {
		CloseCursorContext _localctx = new CloseCursorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_closeCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(CLOSE);
			setState(682);
			identifier();
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
	public static class DeallocateCursorContext extends ParserRuleContext {
		public TerminalNode DEALLOCATE() { return getToken(mysqlparser.DEALLOCATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deallocateCursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDeallocateCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDeallocateCursor(this);
		}
	}

	public final DeallocateCursorContext deallocateCursor() throws RecognitionException {
		DeallocateCursorContext _localctx = new DeallocateCursorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_deallocateCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(DEALLOCATE);
			setState(685);
			identifier();
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
	public static class CteStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(mysqlparser.WITH, 0); }
		public List<CteDefinitionContext> cteDefinition() {
			return getRuleContexts(CteDefinitionContext.class);
		}
		public CteDefinitionContext cteDefinition(int i) {
			return getRuleContext(CteDefinitionContext.class,i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public CteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterCteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitCteStatement(this);
		}
	}

	public final CteStatementContext cteStatement() throws RecognitionException {
		CteStatementContext _localctx = new CteStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(WITH);
			setState(688);
			cteDefinition();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(689);
				match(COMMA);
				setState(690);
				cteDefinition();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			selectStatement();
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
	public static class CteDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(mysqlparser.AS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(mysqlparser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysqlparser.LPAREN, i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysqlparser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysqlparser.RPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public CteDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterCteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitCteDefinition(this);
		}
	}

	public final CteDefinitionContext cteDefinition() throws RecognitionException {
		CteDefinitionContext _localctx = new CteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cteDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			identifier();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(699);
				match(LPAREN);
				setState(700);
				columnName();
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(701);
					match(COMMA);
					setState(702);
					columnName();
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708);
				match(RPAREN);
				}
			}

			setState(712);
			match(AS);
			setState(713);
			match(LPAREN);
			setState(714);
			selectStatement();
			setState(715);
			match(RPAREN);
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
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			logicalExpression();
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
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(mysqlparser.AND); }
		public TerminalNode AND(int i) {
			return getToken(mysqlparser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(mysqlparser.OR); }
		public TerminalNode OR(int i) {
			return getToken(mysqlparser.OR, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			relationalExpression();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(720);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(721);
				relationalExpression();
				}
				}
				setState(726);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(mysqlparser.IS, 0); }
		public TerminalNode NULL() { return getToken(mysqlparser.NULL, 0); }
		public TerminalNode IN() { return getToken(mysqlparser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public TerminalNode LIKE() { return getToken(mysqlparser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(mysqlparser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(mysqlparser.AND, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlparser.EXISTS, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mysqlparser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(mysqlparser.NEQ, 0); }
		public TerminalNode LT() { return getToken(mysqlparser.LT, 0); }
		public TerminalNode LTE() { return getToken(mysqlparser.LTE, 0); }
		public TerminalNode GT() { return getToken(mysqlparser.GT, 0); }
		public TerminalNode GTE() { return getToken(mysqlparser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(mysqlparser.NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			additiveExpression();
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(728);
				_la = _input.LA(1);
				if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(729);
				additiveExpression();
				}
				break;
			case 2:
				{
				setState(730);
				match(IS);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(731);
					match(NOT);
					}
				}

				setState(734);
				match(NULL);
				}
				break;
			case 3:
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(735);
					match(NOT);
					}
				}

				setState(738);
				match(IN);
				setState(739);
				match(LPAREN);
				setState(749);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case TRUE:
				case FALSE:
				case NULL:
				case EXISTS:
				case CASE:
				case COUNT:
				case SUM:
				case AVG:
				case MIN:
				case MAX:
				case MINUS:
				case LPAREN:
				case BRACKETED_ID:
				case DQUOTE_ID:
				case ID:
				case HEX_STRING:
				case BIT_STRING:
				case INT:
				case DECIMAL:
				case FLOAT:
				case STRING:
				case USER_VAR:
				case SYSTEM_VAR:
					{
					setState(740);
					expression();
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(741);
						match(COMMA);
						setState(742);
						expression();
						}
						}
						setState(747);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case SELECT:
					{
					setState(748);
					selectStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(751);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(753);
					match(NOT);
					}
				}

				setState(756);
				match(LIKE);
				setState(757);
				additiveExpression();
				}
				break;
			case 5:
				{
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(758);
					match(NOT);
					}
				}

				setState(761);
				match(BETWEEN);
				setState(762);
				additiveExpression();
				setState(763);
				match(AND);
				setState(764);
				additiveExpression();
				}
				break;
			case 6:
				{
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(766);
					match(NOT);
					}
				}

				setState(769);
				match(EXISTS);
				setState(770);
				match(LPAREN);
				setState(771);
				selectStatement();
				setState(772);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(mysqlparser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(mysqlparser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(mysqlparser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(mysqlparser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			multiplicativeExpression();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(777);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(778);
				multiplicativeExpression();
				}
				}
				setState(783);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(mysqlparser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(mysqlparser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(mysqlparser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(mysqlparser.SLASH, i);
		}
		public List<TerminalNode> PERCENT_OP() { return getTokens(mysqlparser.PERCENT_OP); }
		public TerminalNode PERCENT_OP(int i) {
			return getToken(mysqlparser.PERCENT_OP, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			unaryExpression();
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 7L) != 0)) {
				{
				{
				setState(785);
				_la = _input.LA(1);
				if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(786);
				unaryExpression();
				}
				}
				setState(791);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(mysqlparser.MINUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(mysqlparser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlparser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unaryExpression);
		try {
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(MINUS);
				setState(793);
				unaryExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(NOT);
				setState(795);
				unaryExpression();
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				match(EXISTS);
				setState(797);
				match(LPAREN);
				setState(798);
				selectStatement();
				setState(799);
				match(RPAREN);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case CASE:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case LPAREN:
			case BRACKETED_ID:
			case DQUOTE_ID:
			case ID:
			case HEX_STRING:
			case BIT_STRING:
			case INT:
			case DECIMAL:
			case FLOAT:
			case STRING:
			case USER_VAR:
			case SYSTEM_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public TerminalNode USER_VAR() { return getToken(mysqlparser.USER_VAR, 0); }
		public TerminalNode SYSTEM_VAR() { return getToken(mysqlparser.SYSTEM_VAR, 0); }
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public IdentifierOrFunctionContext identifierOrFunction() {
			return getRuleContext(IdentifierOrFunctionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primary);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				caseExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				match(USER_VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(SYSTEM_VAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				match(LPAREN);
				setState(809);
				selectStatement();
				setState(810);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				match(LPAREN);
				setState(813);
				expression();
				setState(814);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(816);
				aggregateFunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(817);
				identifierOrFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public TerminalNode COUNT() { return getToken(mysqlparser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(mysqlparser.SUM, 0); }
		public TerminalNode AVG() { return getToken(mysqlparser.AVG, 0); }
		public TerminalNode MIN() { return getToken(mysqlparser.MIN, 0); }
		public TerminalNode MAX() { return getToken(mysqlparser.MAX, 0); }
		public TerminalNode STAR() { return getToken(mysqlparser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(mysqlparser.DISTINCT, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitAggregateFunction(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(821);
			match(LPAREN);
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(822);
				match(STAR);
				}
				break;
			case DISTINCT:
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case EXISTS:
			case CASE:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case MINUS:
			case LPAREN:
			case BRACKETED_ID:
			case DQUOTE_ID:
			case ID:
			case HEX_STRING:
			case BIT_STRING:
			case INT:
			case DECIMAL:
			case FLOAT:
			case STRING:
			case USER_VAR:
			case SYSTEM_VAR:
				{
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(823);
					match(DISTINCT);
					}
				}

				setState(826);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(829);
			match(RPAREN);
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
	public static class IdentifierOrFunctionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlparser.COMMA, i);
		}
		public IdentifierOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterIdentifierOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitIdentifierOrFunction(this);
		}
	}

	public final IdentifierOrFunctionContext identifierOrFunction() throws RecognitionException {
		IdentifierOrFunctionContext _localctx = new IdentifierOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierOrFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			columnName();
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(832);
				match(LPAREN);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & -8917126729617635267L) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 6399L) != 0)) {
					{
					setState(833);
					expression();
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(834);
						match(COMMA);
						setState(835);
						expression();
						}
						}
						setState(840);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(843);
				match(RPAREN);
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
	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(mysqlparser.CASE, 0); }
		public TerminalNode END() { return getToken(mysqlparser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(mysqlparser.ELSE, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitCaseExpression(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(CASE);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & -8917126729617635267L) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 6399L) != 0)) {
				{
				setState(847);
				expression();
				}
			}

			setState(851); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(850);
				whenClause();
				}
				}
				setState(853); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(855);
				match(ELSE);
				setState(856);
				expression();
				}
			}

			setState(859);
			match(END);
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
	public static class WhenClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(mysqlparser.WHEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(mysqlparser.THEN, 0); }
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitWhenClause(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(WHEN);
			setState(862);
			expression();
			setState(863);
			match(THEN);
			setState(864);
			expression();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(mysqlparser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(mysqlparser.DECIMAL, 0); }
		public TerminalNode FLOAT() { return getToken(mysqlparser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(mysqlparser.STRING, 0); }
		public TerminalNode HEX_STRING() { return getToken(mysqlparser.HEX_STRING, 0); }
		public TerminalNode BIT_STRING() { return getToken(mysqlparser.BIT_STRING, 0); }
		public TerminalNode TRUE() { return getToken(mysqlparser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mysqlparser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(mysqlparser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
		public TerminalNode BRACKETED_ID() { return getToken(mysqlparser.BRACKETED_ID, 0); }
		public TerminalNode DQUOTE_ID() { return getToken(mysqlparser.DQUOTE_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mysqlparser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mysqlparser.DOT, i);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			identifier();
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(871);
				match(DOT);
				setState(872);
				identifier();
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(873);
					match(DOT);
					setState(874);
					identifier();
					}
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
	public static class ColumnNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(mysqlparser.DOT, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_columnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			identifier();
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(880);
				match(DOT);
				setState(881);
				identifier();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0082\u0375\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0001\u0000\u0005\u0000\u0086\b\u0000\n\u0000\f\u0000"+
		"\u0089\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u008f\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0093\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0097\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u009b\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a0"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a4\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00a8\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00ac\b\u0001\u0003\u0001\u00ae\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00ba\b\u0003\n\u0003\f\u0003\u00bd\t\u0003"+
		"\u0003\u0003\u00bf\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c7\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00cc\b\u0006\n\u0006\f\u0006\u00cf\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00d3\b\u0006\n\u0006\f\u0006\u00d6\t\u0006"+
		"\u0003\u0006\u00d8\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00dc\b"+
		"\u0007\n\u0007\f\u0007\u00df\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00e6\b\b\n\b\f\b\u00e9\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00f0\b\b\n\b\f\b\u00f3\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00fe\b\t\u0001"+
		"\n\u0001\n\u0003\n\u0102\b\n\u0001\n\u0005\n\u0105\b\n\n\n\f\n\u0108\t"+
		"\n\u0001\n\u0003\n\u010b\b\n\u0001\n\u0003\n\u010e\b\n\u0001\n\u0003\n"+
		"\u0111\b\n\u0001\n\u0003\n\u0114\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0118\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011d\b"+
		"\u000b\u0003\u000b\u011f\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0127\b\f\n\f\f\f\u012a\t\f\u0003\f\u012c\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0133\b\r\u0001\r\u0003"+
		"\r\u0136\b\r\u0003\r\u0138\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u013c"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0142"+
		"\b\u000f\n\u000f\f\u000f\u0145\t\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0149\b\u0010\u0001\u0010\u0003\u0010\u014c\b\u0010\u0001\u0011\u0003"+
		"\u0011\u014f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0155\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u015a"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u015e\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0162\b\u0012\u0001\u0012\u0003\u0012\u0165\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u016f\b\u0014\n\u0014\f\u0014"+
		"\u0172\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u017c\b\u0016\n\u0016"+
		"\f\u0016\u017f\t\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0183\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u018c\b\u0018\n\u0018\f\u0018\u018f\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0193\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0199\b\u0018\n\u0018\f\u0018\u019c\t\u0018"+
		"\u0001\u0018\u0003\u0018\u019f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u01a5\b\u0019\n\u0019\f\u0019\u01a8\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u01b2\b\u001a\n\u001a\f\u001a\u01b5\t\u001a"+
		"\u0001\u001a\u0003\u001a\u01b8\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01c2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01dd\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u01e6\b \n \f \u01e9\t \u0001 \u0001"+
		" \u0001!\u0001!\u0003!\u01ef\b!\u0001\"\u0001\"\u0003\"\u01f3\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01f8\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u01fe\b\"\n\"\f\"\u0201\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u0207\b\"\u0001\"\u0001\"\u0003\"\u020b\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u0211\b\"\n\"\f\"\u0214\t\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u021a\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0222\b\"\n\"\f\"\u0225\t\"\u0001\"\u0001\"\u0003\"\u0229\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0004#\u022f\b#\u000b#\f#\u0230\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u023b\b$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u024a\b\'\u0001\'\u0005\'\u024d\b\'\n\'\f\'\u0250\t\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0257\b(\u0001(\u0003(\u025a\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0261\b)\u0001)\u0003)\u0264\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u0272\b*\n*\f*\u0275\t*\u0001*\u0001*\u0003*\u0279\b*"+
		"\u0001*\u0001*\u0003*\u027d\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0284\b+\u0001,\u0001,\u0001,\u0003,\u0289\b,\u0001,\u0003,\u028c\b"+
		",\u0001,\u0001,\u0003,\u0290\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0298\b,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0005.\u02a5\b.\n.\f.\u02a8\t.\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00051\u02b4\b1\n1"+
		"\f1\u02b7\t1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00052\u02c0"+
		"\b2\n2\f2\u02c3\t2\u00012\u00012\u00032\u02c7\b2\u00012\u00012\u00012"+
		"\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00054\u02d3\b4\n4\f"+
		"4\u02d6\t4\u00015\u00015\u00015\u00015\u00015\u00035\u02dd\b5\u00015\u0001"+
		"5\u00035\u02e1\b5\u00015\u00015\u00015\u00015\u00015\u00055\u02e8\b5\n"+
		"5\f5\u02eb\t5\u00015\u00035\u02ee\b5\u00015\u00015\u00015\u00035\u02f3"+
		"\b5\u00015\u00015\u00015\u00035\u02f8\b5\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u0300\b5\u00015\u00015\u00015\u00015\u00015\u00035\u0307"+
		"\b5\u00016\u00016\u00016\u00056\u030c\b6\n6\f6\u030f\t6\u00017\u00017"+
		"\u00017\u00057\u0314\b7\n7\f7\u0317\t7\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00038\u0323\b8\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u0333\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u0339\b:\u0001"+
		":\u0003:\u033c\b:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0005"+
		";\u0345\b;\n;\f;\u0348\t;\u0003;\u034a\b;\u0001;\u0003;\u034d\b;\u0001"+
		"<\u0001<\u0003<\u0351\b<\u0001<\u0004<\u0354\b<\u000b<\f<\u0355\u0001"+
		"<\u0001<\u0003<\u035a\b<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u036c\b@\u0003@\u036e\b@\u0001A\u0001A\u0001A\u0003A\u0373\bA\u0001"+
		"A\u0000\u0000B\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0000\u000e\u0001\u0000ae\u0001\u0000RS\u0002\u0000"+
		"\u0011\u0011>>\u0002\u0000aaee\u0001\u0000FG\u0001\u0000$%\u0002\u0000"+
		"\\\\zz\u0001\u000045\u0001\u0000ej\u0001\u0000kl\u0001\u0000mo\u0001\u0000"+
		"X\\\u0002\u00008:x}\u0001\u0000uw\u03c8\u0000\u0087\u0001\u0000\u0000"+
		"\u0000\u0002\u00ad\u0001\u0000\u0000\u0000\u0004\u00af\u0001\u0000\u0000"+
		"\u0000\u0006\u00b4\u0001\u0000\u0000\u0000\b\u00c0\u0001\u0000\u0000\u0000"+
		"\n\u00c6\u0001\u0000\u0000\u0000\f\u00c8\u0001\u0000\u0000\u0000\u000e"+
		"\u00d9\u0001\u0000\u0000\u0000\u0010\u00e2\u0001\u0000\u0000\u0000\u0012"+
		"\u00fd\u0001\u0000\u0000\u0000\u0014\u00ff\u0001\u0000\u0000\u0000\u0016"+
		"\u0115\u0001\u0000\u0000\u0000\u0018\u012b\u0001\u0000\u0000\u0000\u001a"+
		"\u0137\u0001\u0000\u0000\u0000\u001c\u013b\u0001\u0000\u0000\u0000\u001e"+
		"\u013d\u0001\u0000\u0000\u0000 \u0146\u0001\u0000\u0000\u0000\"\u014e"+
		"\u0001\u0000\u0000\u0000$\u0164\u0001\u0000\u0000\u0000&\u0166\u0001\u0000"+
		"\u0000\u0000(\u0169\u0001\u0000\u0000\u0000*\u0173\u0001\u0000\u0000\u0000"+
		",\u0176\u0001\u0000\u0000\u0000.\u0180\u0001\u0000\u0000\u00000\u0184"+
		"\u0001\u0000\u0000\u00002\u01a0\u0001\u0000\u0000\u00004\u01ab\u0001\u0000"+
		"\u0000\u00006\u01b9\u0001\u0000\u0000\u00008\u01bd\u0001\u0000\u0000\u0000"+
		":\u01c3\u0001\u0000\u0000\u0000<\u01c7\u0001\u0000\u0000\u0000>\u01dc"+
		"\u0001\u0000\u0000\u0000@\u01de\u0001\u0000\u0000\u0000B\u01ee\u0001\u0000"+
		"\u0000\u0000D\u0228\u0001\u0000\u0000\u0000F\u022a\u0001\u0000\u0000\u0000"+
		"H\u023a\u0001\u0000\u0000\u0000J\u023c\u0001\u0000\u0000\u0000L\u0240"+
		"\u0001\u0000\u0000\u0000N\u0246\u0001\u0000\u0000\u0000P\u0251\u0001\u0000"+
		"\u0000\u0000R\u025b\u0001\u0000\u0000\u0000T\u027c\u0001\u0000\u0000\u0000"+
		"V\u0283\u0001\u0000\u0000\u0000X\u0297\u0001\u0000\u0000\u0000Z\u0299"+
		"\u0001\u0000\u0000\u0000\\\u029c\u0001\u0000\u0000\u0000^\u02a9\u0001"+
		"\u0000\u0000\u0000`\u02ac\u0001\u0000\u0000\u0000b\u02af\u0001\u0000\u0000"+
		"\u0000d\u02ba\u0001\u0000\u0000\u0000f\u02cd\u0001\u0000\u0000\u0000h"+
		"\u02cf\u0001\u0000\u0000\u0000j\u02d7\u0001\u0000\u0000\u0000l\u0308\u0001"+
		"\u0000\u0000\u0000n\u0310\u0001\u0000\u0000\u0000p\u0322\u0001\u0000\u0000"+
		"\u0000r\u0332\u0001\u0000\u0000\u0000t\u0334\u0001\u0000\u0000\u0000v"+
		"\u033f\u0001\u0000\u0000\u0000x\u034e\u0001\u0000\u0000\u0000z\u035d\u0001"+
		"\u0000\u0000\u0000|\u0362\u0001\u0000\u0000\u0000~\u0364\u0001\u0000\u0000"+
		"\u0000\u0080\u0366\u0001\u0000\u0000\u0000\u0082\u036f\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0000\u0000"+
		"\u0001\u008b\u0001\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u0012\t\u0000"+
		"\u008d\u008f\u0005t\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u00ae\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0003>\u001f\u0000\u0091\u0093\u0005t\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u00ae\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0003V+\u0000\u0095\u0097\u0005t\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u00ae\u0001\u0000\u0000\u0000\u0098\u009a\u0003b1\u0000\u0099"+
		"\u009b\u0005t\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u00ae\u0001\u0000\u0000\u0000\u009c\u00ae"+
		"\u0003\n\u0005\u0000\u009d\u009f\u0003\u0004\u0002\u0000\u009e\u00a0\u0005"+
		"t\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00ae\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\u0006"+
		"\u0003\u0000\u00a2\u00a4\u0005t\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00ae\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0003\b\u0004\u0000\u00a6\u00a8\u0005t\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ae\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005O\u0000\u0000\u00aa"+
		"\u00ac\u0005t\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u008c"+
		"\u0001\u0000\u0000\u0000\u00ad\u0090\u0001\u0000\u0000\u0000\u00ad\u0094"+
		"\u0001\u0000\u0000\u0000\u00ad\u0098\u0001\u0000\u0000\u0000\u00ad\u009c"+
		"\u0001\u0000\u0000\u0000\u00ad\u009d\u0001\u0000\u0000\u0000\u00ad\u00a1"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ae\u0003\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\b\u0000\u0000\u00b0\u00b1\u0005\u0081\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0003f3\u0000\u00b3\u0005\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000\u00b5\u00be\u0003~?\u0000\u00b6"+
		"\u00bb\u0003f3\u0000\u00b7\u00b8\u0005^\u0000\u0000\u00b8\u00ba\u0003"+
		"f3\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u0007\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005V\u0000\u0000"+
		"\u00c1\u00c2\u0003~?\u0000\u00c2\t\u0001\u0000\u0000\u0000\u00c3\u00c7"+
		"\u0003\f\u0006\u0000\u00c4\u00c7\u0003\u000e\u0007\u0000\u00c5\u00c7\u0003"+
		"\u0010\b\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u000b\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005M\u0000\u0000\u00c9\u00cd\u0003f3\u0000"+
		"\u00ca\u00cc\u0003\u0002\u0001\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d7\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d4\u0005D\u0000\u0000\u00d1"+
		"\u00d3\u0003\u0002\u0001\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d0\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\r\u0001\u0000\u0000\u0000\u00d9\u00dd"+
		"\u0005N\u0000\u0000\u00da\u00dc\u0003\u0002\u0001\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"E\u0000\u0000\u00e1\u000f\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005N\u0000"+
		"\u0000\u00e3\u00e7\u0005P\u0000\u0000\u00e4\u00e6\u0003\u0002\u0001\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005E\u0000\u0000\u00eb\u00ec\u0005P\u0000\u0000\u00ec\u00ed"+
		"\u0005N\u0000\u0000\u00ed\u00f1\u0005Q\u0000\u0000\u00ee\u00f0\u0003\u0002"+
		"\u0001\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005E\u0000\u0000\u00f5\u00f6\u0005Q\u0000\u0000"+
		"\u00f6\u0011\u0001\u0000\u0000\u0000\u00f7\u00fe\u0003\u0014\n\u0000\u00f8"+
		"\u00fe\u00030\u0018\u0000\u00f9\u00fe\u00034\u001a\u0000\u00fa\u00fe\u0003"+
		"8\u001c\u0000\u00fb\u00fe\u0003:\u001d\u0000\u00fc\u00fe\u0003<\u001e"+
		"\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u0013\u0001\u0000\u0000\u0000\u00ff\u0101\u0003\u0016\u000b"+
		"\u0000\u0100\u0102\u0003\u001e\u000f\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0106\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0003\"\u0011\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010b\u0003&\u0013\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"\u010d\u0001\u0000\u0000\u0000\u010c\u010e\u0003(\u0014\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110"+
		"\u0001\u0000\u0000\u0000\u010f\u0111\u0003*\u0015\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001"+
		"\u0000\u0000\u0000\u0112\u0114\u0003,\u0016\u0000\u0113\u0112\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0015\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0005\u0001\u0000\u0000\u0116\u0118\u0007\u0002"+
		"\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u011e\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0012"+
		"\u0000\u0000\u011a\u011c\u0005z\u0000\u0000\u011b\u011d\u0005\u0013\u0000"+
		"\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0119\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0003\u0018\f\u0000\u0121\u0017\u0001\u0000\u0000\u0000"+
		"\u0122\u012c\u0005m\u0000\u0000\u0123\u0128\u0003\u001a\r\u0000\u0124"+
		"\u0125\u0005^\u0000\u0000\u0125\u0127\u0003\u001a\r\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u0122"+
		"\u0001\u0000\u0000\u0000\u012b\u0123\u0001\u0000\u0000\u0000\u012c\u0019"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0081\u0000\u0000\u012e\u012f"+
		"\u0007\u0003\u0000\u0000\u012f\u0138\u0003f3\u0000\u0130\u0135\u0003f"+
		"3\u0000\u0131\u0133\u0005\u0014\u0000\u0000\u0132\u0131\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0003\u001c\u000e\u0000\u0135\u0132\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000"+
		"\u0000\u0137\u012d\u0001\u0000\u0000\u0000\u0137\u0130\u0001\u0000\u0000"+
		"\u0000\u0138\u001b\u0001\u0000\u0000\u0000\u0139\u013c\u0003~?\u0000\u013a"+
		"\u013c\u0005}\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u001d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\t\u0000\u0000\u013e\u0143\u0003 \u0010\u0000\u013f\u0140\u0005"+
		"^\u0000\u0000\u0140\u0142\u0003 \u0010\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u001f\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u014b\u0003\u0080@\u0000"+
		"\u0147\u0149\u0005\u0014\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0003~?\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c!\u0001\u0000\u0000\u0000\u014d\u014f\u0003"+
		"$\u0012\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u000b"+
		"\u0000\u0000\u0151\u0154\u0003 \u0010\u0000\u0152\u0153\u0005\f\u0000"+
		"\u0000\u0153\u0155\u0003f3\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155#\u0001\u0000\u0000\u0000\u0156\u0165"+
		"\u0005&\u0000\u0000\u0157\u0159\u0005\'\u0000\u0000\u0158\u015a\u0005"+
		"+\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u0165\u0001\u0000\u0000\u0000\u015b\u015d\u0005(\u0000"+
		"\u0000\u015c\u015e\u0005+\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0165\u0001\u0000\u0000\u0000"+
		"\u015f\u0161\u0005)\u0000\u0000\u0160\u0162\u0005+\u0000\u0000\u0161\u0160"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0165"+
		"\u0001\u0000\u0000\u0000\u0163\u0165\u0005*\u0000\u0000\u0164\u0156\u0001"+
		"\u0000\u0000\u0000\u0164\u0157\u0001\u0000\u0000\u0000\u0164\u015b\u0001"+
		"\u0000\u0000\u0000\u0164\u015f\u0001\u0000\u0000\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0165%\u0001\u0000\u0000\u0000\u0166\u0167\u0005\n"+
		"\u0000\u0000\u0167\u0168\u0003f3\u0000\u0168\'\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0005\r\u0000\u0000\u016a\u016b\u0005\u000e\u0000\u0000\u016b"+
		"\u0170\u0003f3\u0000\u016c\u016d\u0005^\u0000\u0000\u016d\u016f\u0003"+
		"f3\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171)\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0005\u0010\u0000\u0000\u0174\u0175\u0003f3\u0000\u0175+"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u000f\u0000\u0000\u0177\u0178"+
		"\u0005\u000e\u0000\u0000\u0178\u017d\u0003.\u0017\u0000\u0179\u017a\u0005"+
		"^\u0000\u0000\u017a\u017c\u0003.\u0017\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e-\u0001\u0000\u0000\u0000"+
		"\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0182\u0003f3\u0000\u0181\u0183"+
		"\u0007\u0004\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183/\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"\u0002\u0000\u0000\u0185\u0186\u0005\u0006\u0000\u0000\u0186\u0192\u0003"+
		"\u0080@\u0000\u0187\u0188\u0005p\u0000\u0000\u0188\u018d\u0003\u0082A"+
		"\u0000\u0189\u018a\u0005^\u0000\u0000\u018a\u018c\u0003\u0082A\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005q\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0187"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u019e"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0007\u0000\u0000\u0195\u019a"+
		"\u00032\u0019\u0000\u0196\u0197\u0005^\u0000\u0000\u0197\u0199\u00032"+
		"\u0019\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000"+
		"\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019f\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0003\u0014\n\u0000\u019e\u0194\u0001\u0000\u0000"+
		"\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f1\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005p\u0000\u0000\u01a1\u01a6\u0003f3\u0000\u01a2\u01a3"+
		"\u0005^\u0000\u0000\u01a3\u01a5\u0003f3\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005q\u0000"+
		"\u0000\u01aa3\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000"+
		"\u01ac\u01ad\u0003\u0080@\u0000\u01ad\u01ae\u0005\b\u0000\u0000\u01ae"+
		"\u01b3\u00036\u001b\u0000\u01af\u01b0\u0005^\u0000\u0000\u01b0\u01b2\u0003"+
		"6\u001b\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b8\u0003&\u0013\u0000\u01b7\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b85\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0003\u0082A\u0000\u01ba\u01bb\u0005e\u0000\u0000\u01bb\u01bc"+
		"\u0003f3\u0000\u01bc7\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0004"+
		"\u0000\u0000\u01be\u01bf\u0005\t\u0000\u0000\u01bf\u01c1\u0003\u0080@"+
		"\u0000\u01c0\u01c2\u0003&\u0013\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c29\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0018\u0000\u0000\u01c4\u01c5\u0005\u001a\u0000\u0000\u01c5"+
		"\u01c6\u0003\u0080@\u0000\u01c6;\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"\u0005\u0000\u0000\u01c8\u01c9\u0005\u0006\u0000\u0000\u01c9\u01ca\u0003"+
		"\u0080@\u0000\u01ca\u01cb\u0005H\u0000\u0000\u01cb\u01cc\u0003\u0080@"+
		"\u0000\u01cc\u01cd\u0005\f\u0000\u0000\u01cd\u01ce\u0003f3\u0000\u01ce"+
		"\u01cf\u0005B\u0000\u0000\u01cf\u01d0\u0005I\u0000\u0000\u01d0\u01d1\u0005"+
		"C\u0000\u0000\u01d1\u01d2\u00034\u001a\u0000\u01d2\u01d3\u0005B\u0000"+
		"\u0000\u01d3\u01d4\u00056\u0000\u0000\u01d4\u01d5\u0005I\u0000\u0000\u01d5"+
		"\u01d6\u0005C\u0000\u0000\u01d6\u01d7\u00030\u0018\u0000\u01d7=\u0001"+
		"\u0000\u0000\u0000\u01d8\u01dd\u0003@ \u0000\u01d9\u01dd\u0003F#\u0000"+
		"\u01da\u01dd\u0003J%\u0000\u01db\u01dd\u0003L&\u0000\u01dc\u01d8\u0001"+
		"\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd?\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\u0015\u0000\u0000\u01df\u01e0\u0005\u001a"+
		"\u0000\u0000\u01e0\u01e1\u0003\u0080@\u0000\u01e1\u01e2\u0005p\u0000\u0000"+
		"\u01e2\u01e7\u0003B!\u0000\u01e3\u01e4\u0005^\u0000\u0000\u01e4\u01e6"+
		"\u0003B!\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0005q\u0000\u0000\u01ebA\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ef\u0003N\'\u0000\u01ed\u01ef\u0003D\"\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01efC\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0005\u001f\u0000\u0000\u01f1\u01f3\u0003~?\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u001d\u0000\u0000"+
		"\u01f5\u01f7\u0005#\u0000\u0000\u01f6\u01f8\u0007\u0005\u0000\u0000\u01f7"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005p\u0000\u0000\u01fa\u01ff"+
		"\u0003\u0082A\u0000\u01fb\u01fc\u0005^\u0000\u0000\u01fc\u01fe\u0003\u0082"+
		"A\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0005q\u0000\u0000\u0203\u0229\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005\u001f\u0000\u0000\u0205\u0207\u0003~?\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208"+
		"\u0001\u0000\u0000\u0000\u0208\u020a\u0005\u001e\u0000\u0000\u0209\u020b"+
		"\u0007\u0005\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0005p\u0000\u0000\u020d\u0212\u0003\u0082A\u0000\u020e\u020f\u0005^"+
		"\u0000\u0000\u020f\u0211\u0003\u0082A\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000"+
		"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u0216\u0005q\u0000\u0000"+
		"\u0216\u0229\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u001f\u0000\u0000"+
		"\u0218\u021a\u0003~?\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0005 \u0000\u0000\u021c\u021d\u0003\u0080@\u0000\u021d\u021e\u0005p"+
		"\u0000\u0000\u021e\u0223\u0003\u0082A\u0000\u021f\u0220\u0005^\u0000\u0000"+
		"\u0220\u0222\u0003\u0082A\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222"+
		"\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225"+
		"\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u0005q\u0000\u0000\u0227\u0229"+
		"\u0001\u0000\u0000\u0000\u0228\u01f2\u0001\u0000\u0000\u0000\u0228\u0206"+
		"\u0001\u0000\u0000\u0000\u0228\u0219\u0001\u0000\u0000\u0000\u0229E\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0005\u0016\u0000\u0000\u022b\u022c\u0005"+
		"\u001a\u0000\u0000\u022c\u022e\u0003\u0080@\u0000\u022d\u022f\u0003H$"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231G\u0001\u0000\u0000\u0000\u0232\u0233\u0005J\u0000\u0000\u0233"+
		"\u023b\u0003N\'\u0000\u0234\u0235\u0005\u0017\u0000\u0000\u0235\u023b"+
		"\u0003\u0082A\u0000\u0236\u0237\u0005\u0016\u0000\u0000\u0237\u0238\u0003"+
		"\u0082A\u0000\u0238\u0239\u0003P(\u0000\u0239\u023b\u0001\u0000\u0000"+
		"\u0000\u023a\u0232\u0001\u0000\u0000\u0000\u023a\u0234\u0001\u0000\u0000"+
		"\u0000\u023a\u0236\u0001\u0000\u0000\u0000\u023bI\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0005\u0017\u0000\u0000\u023d\u023e\u0005\u001a\u0000\u0000"+
		"\u023e\u023f\u0003\u0080@\u0000\u023fK\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0005\u0019\u0000\u0000\u0241\u0242\u0005\u001a\u0000\u0000\u0242\u0243"+
		"\u0003\u0080@\u0000\u0243\u0244\u0005K\u0000\u0000\u0244\u0245\u0003\u0080"+
		"@\u0000\u0245M\u0001\u0000\u0000\u0000\u0246\u0247\u0003\u0082A\u0000"+
		"\u0247\u0249\u0003P(\u0000\u0248\u024a\u0003R)\u0000\u0249\u0248\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024e\u0001"+
		"\u0000\u0000\u0000\u024b\u024d\u0003T*\u0000\u024c\u024b\u0001\u0000\u0000"+
		"\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024fO\u0001\u0000\u0000\u0000"+
		"\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0259\u0003~?\u0000\u0252\u0253"+
		"\u0005p\u0000\u0000\u0253\u0256\u0007\u0006\u0000\u0000\u0254\u0255\u0005"+
		"^\u0000\u0000\u0255\u0257\u0005z\u0000\u0000\u0256\u0254\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000"+
		"\u0000\u0258\u025a\u0005q\u0000\u0000\u0259\u0252\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025aQ\u0001\u0000\u0000\u0000\u025b"+
		"\u0263\u0005W\u0000\u0000\u025c\u025d\u0005p\u0000\u0000\u025d\u0260\u0005"+
		"z\u0000\u0000\u025e\u025f\u0005^\u0000\u0000\u025f\u0261\u0005z\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0005q\u0000\u0000"+
		"\u0263\u025c\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000"+
		"\u0264S\u0001\u0000\u0000\u0000\u0265\u0266\u00056\u0000\u0000\u0266\u027d"+
		"\u0005:\u0000\u0000\u0267\u027d\u0005:\u0000\u0000\u0268\u0269\u0005\u001d"+
		"\u0000\u0000\u0269\u027d\u0005#\u0000\u0000\u026a\u027d\u0005\u001e\u0000"+
		"\u0000\u026b\u026c\u0005 \u0000\u0000\u026c\u0278\u0003\u0080@\u0000\u026d"+
		"\u026e\u0005p\u0000\u0000\u026e\u0273\u0003\u0082A\u0000\u026f\u0270\u0005"+
		"^\u0000\u0000\u0270\u0272\u0003\u0082A\u0000\u0271\u026f\u0001\u0000\u0000"+
		"\u0000\u0272\u0275\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000"+
		"\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0277\u0005q\u0000\u0000"+
		"\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u026d\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027d\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0005\"\u0000\u0000\u027b\u027d\u0003|>\u0000\u027c\u0265"+
		"\u0001\u0000\u0000\u0000\u027c\u0267\u0001\u0000\u0000\u0000\u027c\u0268"+
		"\u0001\u0000\u0000\u0000\u027c\u026a\u0001\u0000\u0000\u0000\u027c\u026b"+
		"\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027dU\u0001"+
		"\u0000\u0000\u0000\u027e\u0284\u0003X,\u0000\u027f\u0284\u0003Z-\u0000"+
		"\u0280\u0284\u0003\\.\u0000\u0281\u0284\u0003^/\u0000\u0282\u0284\u0003"+
		"`0\u0000\u0283\u027e\u0001\u0000\u0000\u0000\u0283\u027f\u0001\u0000\u0000"+
		"\u0000\u0283\u0280\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000"+
		"\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284W\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0005,\u0000\u0000\u0286\u028b\u0005\u0081\u0000\u0000\u0287"+
		"\u0289\u0005\u0014\u0000\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028c\u0003P(\u0000\u028b\u0288\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028e\u0005"+
		"e\u0000\u0000\u028e\u0290\u0003f3\u0000\u028f\u028d\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0298\u0001\u0000\u0000"+
		"\u0000\u0291\u0292\u0005,\u0000\u0000\u0292\u0293\u0003~?\u0000\u0293"+
		"\u0294\u0005-\u0000\u0000\u0294\u0295\u0005L\u0000\u0000\u0295\u0296\u0003"+
		"\u0014\n\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297\u0285\u0001\u0000"+
		"\u0000\u0000\u0297\u0291\u0001\u0000\u0000\u0000\u0298Y\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0005.\u0000\u0000\u029a\u029b\u0003~?\u0000\u029b"+
		"[\u0001\u0000\u0000\u0000\u029c\u029d\u0005/\u0000\u0000\u029d\u029e\u0005"+
		"2\u0000\u0000\u029e\u029f\u0005\t\u0000\u0000\u029f\u02a0\u0003~?\u0000"+
		"\u02a0\u02a1\u0005\u0006\u0000\u0000\u02a1\u02a6\u0003\u0082A\u0000\u02a2"+
		"\u02a3\u0005^\u0000\u0000\u02a3\u02a5\u0003\u0082A\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7]\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02aa\u00050\u0000"+
		"\u0000\u02aa\u02ab\u0003~?\u0000\u02ab_\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ad\u00051\u0000\u0000\u02ad\u02ae\u0003~?\u0000\u02aea\u0001\u0000"+
		"\u0000\u0000\u02af\u02b0\u00053\u0000\u0000\u02b0\u02b5\u0003d2\u0000"+
		"\u02b1\u02b2\u0005^\u0000\u0000\u02b2\u02b4\u0003d2\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\u0003\u0014\n\u0000\u02b9c\u0001\u0000\u0000\u0000\u02ba\u02c6\u0003"+
		"~?\u0000\u02bb\u02bc\u0005p\u0000\u0000\u02bc\u02c1\u0003\u0082A\u0000"+
		"\u02bd\u02be\u0005^\u0000\u0000\u02be\u02c0\u0003\u0082A\u0000\u02bf\u02bd"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0005q\u0000\u0000\u02c5\u02c7\u0001\u0000\u0000\u0000\u02c6\u02bb\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c9\u0005\u0014\u0000\u0000\u02c9\u02ca\u0005"+
		"p\u0000\u0000\u02ca\u02cb\u0003\u0014\n\u0000\u02cb\u02cc\u0005q\u0000"+
		"\u0000\u02cce\u0001\u0000\u0000\u0000\u02cd\u02ce\u0003h4\u0000\u02ce"+
		"g\u0001\u0000\u0000\u0000\u02cf\u02d4\u0003j5\u0000\u02d0\u02d1\u0007"+
		"\u0007\u0000\u0000\u02d1\u02d3\u0003j5\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5i\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u0306\u0003l6\u0000\u02d8\u02d9"+
		"\u0007\b\u0000\u0000\u02d9\u0307\u0003l6\u0000\u02da\u02dc\u00057\u0000"+
		"\u0000\u02db\u02dd\u00056\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000"+
		"\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\u0307\u0005:\u0000\u0000\u02df\u02e1\u00056\u0000\u0000\u02e0\u02df"+
		"\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005=\u0000\u0000\u02e3\u02ed\u0005"+
		"p\u0000\u0000\u02e4\u02e9\u0003f3\u0000\u02e5\u02e6\u0005^\u0000\u0000"+
		"\u02e6\u02e8\u0003f3\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02eb"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02ee\u0001\u0000\u0000\u0000\u02eb\u02e9"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003\u0014\n\u0000\u02ed\u02e4\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005q\u0000\u0000\u02f0\u0307\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f3\u00056\u0000\u0000\u02f2\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0005<\u0000\u0000\u02f5\u0307\u0003l6\u0000\u02f6"+
		"\u02f8\u00056\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f7\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fa"+
		"\u0005@\u0000\u0000\u02fa\u02fb\u0003l6\u0000\u02fb\u02fc\u00054\u0000"+
		"\u0000\u02fc\u02fd\u0003l6\u0000\u02fd\u0307\u0001\u0000\u0000\u0000\u02fe"+
		"\u0300\u00056\u0000\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300"+
		"\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0302"+
		"\u0005;\u0000\u0000\u0302\u0303\u0005p\u0000\u0000\u0303\u0304\u0003\u0014"+
		"\n\u0000\u0304\u0305\u0005q\u0000\u0000\u0305\u0307\u0001\u0000\u0000"+
		"\u0000\u0306\u02d8\u0001\u0000\u0000\u0000\u0306\u02da\u0001\u0000\u0000"+
		"\u0000\u0306\u02e0\u0001\u0000\u0000\u0000\u0306\u02f2\u0001\u0000\u0000"+
		"\u0000\u0306\u02f7\u0001\u0000\u0000\u0000\u0306\u02ff\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307k\u0001\u0000\u0000\u0000"+
		"\u0308\u030d\u0003n7\u0000\u0309\u030a\u0007\t\u0000\u0000\u030a\u030c"+
		"\u0003n7\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000"+
		"\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000"+
		"\u0000\u0000\u030em\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000"+
		"\u0000\u0310\u0315\u0003p8\u0000\u0311\u0312\u0007\n\u0000\u0000\u0312"+
		"\u0314\u0003p8\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0317\u0001"+
		"\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001"+
		"\u0000\u0000\u0000\u0316o\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0005l\u0000\u0000\u0319\u0323\u0003p8\u0000"+
		"\u031a\u031b\u00056\u0000\u0000\u031b\u0323\u0003p8\u0000\u031c\u031d"+
		"\u0005;\u0000\u0000\u031d\u031e\u0005p\u0000\u0000\u031e\u031f\u0003\u0014"+
		"\n\u0000\u031f\u0320\u0005q\u0000\u0000\u0320\u0323\u0001\u0000\u0000"+
		"\u0000\u0321\u0323\u0003r9\u0000\u0322\u0318\u0001\u0000\u0000\u0000\u0322"+
		"\u031a\u0001\u0000\u0000\u0000\u0322\u031c\u0001\u0000\u0000\u0000\u0322"+
		"\u0321\u0001\u0000\u0000\u0000\u0323q\u0001\u0000\u0000\u0000\u0324\u0333"+
		"\u0003|>\u0000\u0325\u0333\u0003x<\u0000\u0326\u0333\u0005\u0081\u0000"+
		"\u0000\u0327\u0333\u0005\u0082\u0000\u0000\u0328\u0329\u0005p\u0000\u0000"+
		"\u0329\u032a\u0003\u0014\n\u0000\u032a\u032b\u0005q\u0000\u0000\u032b"+
		"\u0333\u0001\u0000\u0000\u0000\u032c\u032d\u0005p\u0000\u0000\u032d\u032e"+
		"\u0003f3\u0000\u032e\u032f\u0005q\u0000\u0000\u032f\u0333\u0001\u0000"+
		"\u0000\u0000\u0330\u0333\u0003t:\u0000\u0331\u0333\u0003v;\u0000\u0332"+
		"\u0324\u0001\u0000\u0000\u0000\u0332\u0325\u0001\u0000\u0000\u0000\u0332"+
		"\u0326\u0001\u0000\u0000\u0000\u0332\u0327\u0001\u0000\u0000\u0000\u0332"+
		"\u0328\u0001\u0000\u0000\u0000\u0332\u032c\u0001\u0000\u0000\u0000\u0332"+
		"\u0330\u0001\u0000\u0000\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0333"+
		"s\u0001\u0000\u0000\u0000\u0334\u0335\u0007\u000b\u0000\u0000\u0335\u033b"+
		"\u0005p\u0000\u0000\u0336\u033c\u0005m\u0000\u0000\u0337\u0339\u0005\u0011"+
		"\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033c\u0003f3\u0000"+
		"\u033b\u0336\u0001\u0000\u0000\u0000\u033b\u0338\u0001\u0000\u0000\u0000"+
		"\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033e\u0005q\u0000\u0000\u033e"+
		"u\u0001\u0000\u0000\u0000\u033f\u034c\u0003\u0082A\u0000\u0340\u0349\u0005"+
		"p\u0000\u0000\u0341\u0346\u0003f3\u0000\u0342\u0343\u0005^\u0000\u0000"+
		"\u0343\u0345\u0003f3\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u0348"+
		"\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0001\u0000\u0000\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348\u0346"+
		"\u0001\u0000\u0000\u0000\u0349\u0341\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d"+
		"\u0005q\u0000\u0000\u034c\u0340\u0001\u0000\u0000\u0000\u034c\u034d\u0001"+
		"\u0000\u0000\u0000\u034dw\u0001\u0000\u0000\u0000\u034e\u0350\u0005A\u0000"+
		"\u0000\u034f\u0351\u0003f3\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0350"+
		"\u0351\u0001\u0000\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352"+
		"\u0354\u0003z=\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0355\u0001"+
		"\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001"+
		"\u0000\u0000\u0000\u0356\u0359\u0001\u0000\u0000\u0000\u0357\u0358\u0005"+
		"D\u0000\u0000\u0358\u035a\u0003f3\u0000\u0359\u0357\u0001\u0000\u0000"+
		"\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0005E\u0000\u0000\u035cy\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0005B\u0000\u0000\u035e\u035f\u0003f3\u0000\u035f\u0360\u0005"+
		"C\u0000\u0000\u0360\u0361\u0003f3\u0000\u0361{\u0001\u0000\u0000\u0000"+
		"\u0362\u0363\u0007\f\u0000\u0000\u0363}\u0001\u0000\u0000\u0000\u0364"+
		"\u0365\u0007\r\u0000\u0000\u0365\u007f\u0001\u0000\u0000\u0000\u0366\u036d"+
		"\u0003~?\u0000\u0367\u0368\u0005`\u0000\u0000\u0368\u036b\u0003~?\u0000"+
		"\u0369\u036a\u0005`\u0000\u0000\u036a\u036c\u0003~?\u0000\u036b\u0369"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e"+
		"\u0001\u0000\u0000\u0000\u036d\u0367\u0001\u0000\u0000\u0000\u036d\u036e"+
		"\u0001\u0000\u0000\u0000\u036e\u0081\u0001\u0000\u0000\u0000\u036f\u0372"+
		"\u0003~?\u0000\u0370\u0371\u0005`\u0000\u0000\u0371\u0373\u0003~?\u0000"+
		"\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000"+
		"\u0373\u0083\u0001\u0000\u0000\u0000o\u0087\u008e\u0092\u0096\u009a\u009f"+
		"\u00a3\u00a7\u00ab\u00ad\u00bb\u00be\u00c6\u00cd\u00d4\u00d7\u00dd\u00e7"+
		"\u00f1\u00fd\u0101\u0106\u010a\u010d\u0110\u0113\u0117\u011c\u011e\u0128"+
		"\u012b\u0132\u0135\u0137\u013b\u0143\u0148\u014b\u014e\u0154\u0159\u015d"+
		"\u0161\u0164\u0170\u017d\u0182\u018d\u0192\u019a\u019e\u01a6\u01b3\u01b7"+
		"\u01c1\u01dc\u01e7\u01ee\u01f2\u01f7\u01ff\u0206\u020a\u0212\u0219\u0223"+
		"\u0228\u0230\u023a\u0249\u024e\u0256\u0259\u0260\u0263\u0273\u0278\u027c"+
		"\u0283\u0288\u028b\u028f\u0297\u02a6\u02b5\u02c1\u02c6\u02d4\u02dc\u02e0"+
		"\u02e9\u02ed\u02f2\u02f7\u02ff\u0306\u030d\u0315\u0322\u0332\u0338\u033b"+
		"\u0346\u0349\u034c\u0350\u0355\u0359\u036b\u036d\u0372";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}