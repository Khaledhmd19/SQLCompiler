// Generated from C:/Users/KMHam/IdeaProjects/sql_compiler_lexer/src/mysqlparser.g4 by ANTLR 4.13.2
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
		CONSTRAINT=31, REFERENCES=32, DATABASE=33, INNER=34, LEFT=35, RIGHT=36, 
		FULL=37, CROSS=38, OUTER=39, DECLARE=40, CURSOR=41, OPEN=42, FETCH=43, 
		CLOSE=44, DEALLOCATE=45, NEXT=46, WITH=47, AND=48, OR=49, NOT=50, TRUE=51, 
		FALSE=52, NULL=53, EXISTS=54, LIKE=55, IN=56, ALL=57, ANY=58, BETWEEN=59, 
		CASE=60, WHEN=61, THEN=62, ELSE=63, END=64, ASC=65, DESC=66, USING=67, 
		MATCHED=68, ADD=69, TO=70, FOR=71, INT=72, COUNT=73, SUM=74, AVG=75, MIN=76, 
		MAX=77, ASSIGN=78, COMMA=79, CONCAT=80, DOT=81, EQ=82, NEQ=83, GT=84, 
		GTE=85, LT=86, LTE=87, PLUS=88, MINUS=89, STAR=90, SLASH=91, PERCENT_OP=92, 
		LPAREN=93, RPAREN=94, LBRACKET=95, RBRACKET=96, SEMI=97, BRACKETED_ID=98, 
		DQUOTE_ID=99, ID=100, HEX_STRING=101, BIT_STRING=102, INTEGER=103, DECIMAL=104, 
		FLOAT=105, STRING=106, WS=107, LINE_COMMENT=108, BLOCK_COMMENT=109, USER_VAR=110, 
		SYSTEM_VAR=111;
	public static final int
		RULE_sqlFile = 0, RULE_statement = 1, RULE_dmlStatement = 2, RULE_selectStatement = 3, 
		RULE_selectClause = 4, RULE_selectList = 5, RULE_selectItem = 6, RULE_fromClause = 7, 
		RULE_tableSource = 8, RULE_whereClause = 9, RULE_groupByClause = 10, RULE_orderByClause = 11, 
		RULE_insertStatement = 12, RULE_updateStatement = 13, RULE_assignment = 14, 
		RULE_deleteStatement = 15, RULE_truncateStatement = 16, RULE_mergeStatement = 17, 
		RULE_ddlStatement = 18, RULE_createStatement = 19, RULE_alterStatement = 20, 
		RULE_alterAction = 21, RULE_dropStatement = 22, RULE_renameStatement = 23, 
		RULE_columnDef = 24, RULE_dataType = 25, RULE_cursorStatement = 26, RULE_declareCursor = 27, 
		RULE_openCursor = 28, RULE_fetchCursor = 29, RULE_closeCursor = 30, RULE_deallocateCursor = 31, 
		RULE_cteStatement = 32, RULE_cteDefinition = 33, RULE_expression = 34, 
		RULE_logicalExpression = 35, RULE_relationalExpression = 36, RULE_additiveExpression = 37, 
		RULE_multiplicativeExpression = 38, RULE_unaryExpression = 39, RULE_primary = 40, 
		RULE_literal = 41, RULE_identifier = 42, RULE_tableName = 43, RULE_columnName = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlFile", "statement", "dmlStatement", "selectStatement", "selectClause", 
			"selectList", "selectItem", "fromClause", "tableSource", "whereClause", 
			"groupByClause", "orderByClause", "insertStatement", "updateStatement", 
			"assignment", "deleteStatement", "truncateStatement", "mergeStatement", 
			"ddlStatement", "createStatement", "alterStatement", "alterAction", "dropStatement", 
			"renameStatement", "columnDef", "dataType", "cursorStatement", "declareCursor", 
			"openCursor", "fetchCursor", "closeCursor", "deallocateCursor", "cteStatement", 
			"cteDefinition", "expression", "logicalExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primary", "literal", "identifier", "tableName", "columnName"
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
			null, null, null, null, null, null, "':='", "','", "'||'", "'.'", "'='", 
			null, "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'('", "')'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "INSERT", "UPDATE", "DELETE", "MERGE", "INTO", "VALUES", 
			"SET", "FROM", "WHERE", "JOIN", "ON", "GROUP", "BY", "ORDER", "HAVING", 
			"DISTINCT", "TOP", "PERCENT", "AS", "CREATE", "ALTER", "DROP", "TRUNCATE", 
			"RENAME", "TABLE", "VIEW", "INDEX", "PRIMARY", "UNIQUE", "CONSTRAINT", 
			"REFERENCES", "DATABASE", "INNER", "LEFT", "RIGHT", "FULL", "CROSS", 
			"OUTER", "DECLARE", "CURSOR", "OPEN", "FETCH", "CLOSE", "DEALLOCATE", 
			"NEXT", "WITH", "AND", "OR", "NOT", "TRUE", "FALSE", "NULL", "EXISTS", 
			"LIKE", "IN", "ALL", "ANY", "BETWEEN", "CASE", "WHEN", "THEN", "ELSE", 
			"END", "ASC", "DESC", "USING", "MATCHED", "ADD", "TO", "FOR", "INT", 
			"COUNT", "SUM", "AVG", "MIN", "MAX", "ASSIGN", "COMMA", "CONCAT", "DOT", 
			"EQ", "NEQ", "GT", "GTE", "LT", "LTE", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT_OP", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SEMI", "BRACKETED_ID", 
			"DQUOTE_ID", "ID", "HEX_STRING", "BIT_STRING", "INTEGER", "DECIMAL", 
			"FLOAT", "STRING", "WS", "LINE_COMMENT", "BLOCK_COMMENT", "USER_VAR", 
			"SYSTEM_VAR"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitSqlFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFileContext sqlFile() throws RecognitionException {
		SqlFileContext _localctx = new SqlFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207807762661438L) != 0)) {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(114);
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
				setState(98);
				dmlStatement();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(99);
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
				setState(102);
				ddlStatement();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(103);
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
				setState(106);
				cursorStatement();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(107);
					match(SEMI);
					}
				}

				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				cteStatement();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(111);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dmlStatement);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				selectStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				insertStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				deleteStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				truncateStatement();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
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
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			selectClause();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(125);
				fromClause();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(128);
				whereClause();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(131);
				groupByClause();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(134);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(SELECT);
			setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectList);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(STAR);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case INT:
			case MINUS:
			case LPAREN:
			case ID:
			case HEX_STRING:
			case BIT_STRING:
			case DECIMAL:
			case FLOAT:
			case STRING:
			case USER_VAR:
			case SYSTEM_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				selectItem();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142);
					match(COMMA);
					setState(143);
					selectItem();
					}
					}
					setState(148);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expression();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(152);
					match(AS);
					}
				}

				setState(155);
				match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FROM);
			setState(159);
			tableSource();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(160);
				match(COMMA);
				setState(161);
				tableSource();
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
	public static class TableSourceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitTableSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			tableName();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(168);
					match(AS);
					}
				}

				setState(171);
				match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(WHERE);
			setState(175);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(GROUP);
			setState(178);
			match(BY);
			setState(179);
			expression();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				expression();
				}
				}
				setState(186);
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
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(mysqlparser.ORDER, 0); }
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
		public TerminalNode ASC() { return getToken(mysqlparser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysqlparser.DESC, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ORDER);
			setState(188);
			match(BY);
			setState(189);
			expression();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				expression();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(197);
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
		public List<TerminalNode> LPAREN() { return getTokens(mysqlparser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(mysqlparser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(mysqlparser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(mysqlparser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(mysqlparser.VALUES, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(INSERT);
			setState(201);
			match(INTO);
			setState(202);
			tableName();
			setState(203);
			match(LPAREN);
			setState(204);
			columnName();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				columnName();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(RPAREN);
			setState(213);
			match(VALUES);
			setState(214);
			match(LPAREN);
			setState(215);
			expression();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				expression();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(UPDATE);
			setState(226);
			tableName();
			setState(227);
			match(SET);
			setState(228);
			assignment();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				assignment();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(236);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			columnName();
			setState(240);
			match(EQ);
			setState(241);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(DELETE);
			setState(244);
			match(FROM);
			setState(245);
			tableName();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(246);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitTruncateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStatementContext truncateStatement() throws RecognitionException {
		TruncateStatementContext _localctx = new TruncateStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(TRUNCATE);
			setState(250);
			match(TABLE);
			setState(251);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mergeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(MERGE);
			setState(254);
			match(INTO);
			setState(255);
			tableName();
			setState(256);
			match(USING);
			setState(257);
			tableName();
			setState(258);
			match(ON);
			setState(259);
			expression();
			setState(260);
			match(WHEN);
			setState(261);
			match(MATCHED);
			setState(262);
			match(THEN);
			setState(263);
			updateStatement();
			setState(264);
			match(WHEN);
			setState(265);
			match(NOT);
			setState(266);
			match(MATCHED);
			setState(267);
			match(THEN);
			setState(268);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ddlStatement);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				createStatement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				alterStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				dropStatement();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
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
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(CREATE);
			setState(277);
			match(TABLE);
			setState(278);
			tableName();
			setState(279);
			match(LPAREN);
			setState(280);
			columnDef();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				columnDef();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitAlterStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStatementContext alterStatement() throws RecognitionException {
		AlterStatementContext _localctx = new AlterStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alterStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ALTER);
			setState(291);
			match(TABLE);
			setState(292);
			tableName();
			setState(294); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(293);
					alterAction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(296); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitAlterAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterActionContext alterAction() throws RecognitionException {
		AlterActionContext _localctx = new AlterActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alterAction);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(ADD);
				setState(299);
				columnDef();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(DROP);
				setState(301);
				columnName();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(ALTER);
				setState(303);
				columnName();
				setState(304);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDropStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dropStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(DROP);
			setState(309);
			match(TABLE);
			setState(310);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitRenameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameStatementContext renameStatement() throws RecognitionException {
		RenameStatementContext _localctx = new RenameStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_renameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(RENAME);
			setState(313);
			match(TABLE);
			setState(314);
			tableName();
			setState(315);
			match(TO);
			setState(316);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_columnDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			columnName();
			setState(319);
			dataType();
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
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ID);
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
		public DeclareCursorContext declareCursor() {
			return getRuleContext(DeclareCursorContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitCursorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorStatementContext cursorStatement() throws RecognitionException {
		CursorStatementContext _localctx = new CursorStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cursorStatement);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				declareCursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				openCursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				fetchCursor();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				closeCursor();
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
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
	public static class DeclareCursorContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(mysqlparser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
		public TerminalNode CURSOR() { return getToken(mysqlparser.CURSOR, 0); }
		public TerminalNode FOR() { return getToken(mysqlparser.FOR, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DeclareCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareCursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).enterDeclareCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlparserListener ) ((mysqlparserListener)listener).exitDeclareCursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDeclareCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareCursorContext declareCursor() throws RecognitionException {
		DeclareCursorContext _localctx = new DeclareCursorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declareCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(DECLARE);
			setState(331);
			match(ID);
			setState(332);
			match(CURSOR);
			setState(333);
			match(FOR);
			setState(334);
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
	public static class OpenCursorContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(mysqlparser.OPEN, 0); }
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitOpenCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCursorContext openCursor() throws RecognitionException {
		OpenCursorContext _localctx = new OpenCursorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_openCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(OPEN);
			setState(337);
			match(ID);
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
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitFetchCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchCursorContext fetchCursor() throws RecognitionException {
		FetchCursorContext _localctx = new FetchCursorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fetchCursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(FETCH);
			setState(340);
			match(NEXT);
			setState(341);
			match(FROM);
			setState(342);
			match(ID);
			setState(343);
			match(INTO);
			setState(344);
			columnName();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				columnName();
				}
				}
				setState(351);
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
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitCloseCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseCursorContext closeCursor() throws RecognitionException {
		CloseCursorContext _localctx = new CloseCursorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_closeCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(CLOSE);
			setState(353);
			match(ID);
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
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitDeallocateCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeallocateCursorContext deallocateCursor() throws RecognitionException {
		DeallocateCursorContext _localctx = new DeallocateCursorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_deallocateCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(DEALLOCATE);
			setState(356);
			match(ID);
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
		public CteDefinitionContext cteDefinition() {
			return getRuleContext(CteDefinitionContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitCteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteStatementContext cteStatement() throws RecognitionException {
		CteStatementContext _localctx = new CteStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(WITH);
			setState(359);
			cteDefinition();
			setState(360);
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
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitCteDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteDefinitionContext cteDefinition() throws RecognitionException {
		CteDefinitionContext _localctx = new CteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cteDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ID);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(363);
				match(LPAREN);
				setState(364);
				columnName();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(365);
					match(COMMA);
					setState(366);
					columnName();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				match(RPAREN);
				}
			}

			setState(376);
			match(AS);
			setState(377);
			match(LPAREN);
			setState(378);
			selectStatement();
			setState(379);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			relationalExpression();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				relationalExpression();
				}
				}
				setState(390);
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
		public TerminalNode EQ() { return getToken(mysqlparser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(mysqlparser.NEQ, 0); }
		public TerminalNode LT() { return getToken(mysqlparser.LT, 0); }
		public TerminalNode LTE() { return getToken(mysqlparser.LTE, 0); }
		public TerminalNode GT() { return getToken(mysqlparser.GT, 0); }
		public TerminalNode GTE() { return getToken(mysqlparser.GTE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			additiveExpression();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 63L) != 0)) {
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(393);
				additiveExpression();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			multiplicativeExpression();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(397);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(398);
				multiplicativeExpression();
				}
				}
				setState(403);
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
		public List<TerminalNode> PERCENT() { return getTokens(mysqlparser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(mysqlparser.PERCENT, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			unaryExpression();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT || _la==STAR || _la==SLASH) {
				{
				{
				setState(405);
				_la = _input.LA(1);
				if ( !(_la==PERCENT || _la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				unaryExpression();
				}
				}
				setState(411);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unaryExpression);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(MINUS);
				setState(413);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case INT:
			case LPAREN:
			case ID:
			case HEX_STRING:
			case BIT_STRING:
			case DECIMAL:
			case FLOAT:
			case STRING:
			case USER_VAR:
			case SYSTEM_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
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
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode USER_VAR() { return getToken(mysqlparser.USER_VAR, 0); }
		public TerminalNode SYSTEM_VAR() { return getToken(mysqlparser.SYSTEM_VAR, 0); }
		public TerminalNode LPAREN() { return getToken(mysqlparser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mysqlparser.RPAREN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				columnName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				tableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				match(USER_VAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				match(SYSTEM_VAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				match(LPAREN);
				setState(423);
				expression();
				setState(424);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 66428094505811975L) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(ID);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlparserVisitor ) return ((mysqlparserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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

	public static final String _serializedATN =
		"\u0004\u0001o\u01b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001m\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0003\u0001s\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002{\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0082\b\u0003\u0001\u0003\u0003\u0003\u0085\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0088\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0091\b\u0005"+
		"\n\u0005\f\u0005\u0094\t\u0005\u0003\u0005\u0096\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u009a\b\u0006\u0001\u0006\u0003\u0006\u009d\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a3\b\u0007"+
		"\n\u0007\f\u0007\u00a6\t\u0007\u0001\b\u0001\b\u0003\b\u00aa\b\b\u0001"+
		"\b\u0003\b\u00ad\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c1\b\u000b\n\u000b"+
		"\f\u000b\u00c4\t\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d0\b\f\n\f\f\f\u00d3"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00db\b\f"+
		"\n\f\f\f\u00de\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00e8\b\r\n\r\f\r\u00eb\t\r\u0001\r\u0003\r\u00ee\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00f8\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0113\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u011c\b\u0013\n\u0013\f\u0013\u011f"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u0127\b\u0014\u000b\u0014\f\u0014\u0128\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0133\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0149\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u015c\b\u001d\n\u001d\f\u001d\u015f\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0170\b!\n!\f!\u0173"+
		"\t!\u0001!\u0001!\u0003!\u0177\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u0183\b#\n#\f#\u0186\t#\u0001$"+
		"\u0001$\u0001$\u0003$\u018b\b$\u0001%\u0001%\u0001%\u0005%\u0190\b%\n"+
		"%\f%\u0193\t%\u0001&\u0001&\u0001&\u0005&\u0198\b&\n&\f&\u019b\t&\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u01a0\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u01ab\b(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001,\u0000\u0000-\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVX\u0000\u0006\u0001\u0000AB\u0001\u000001\u0001\u0000"+
		"RW\u0001\u0000XY\u0002\u0000\u0013\u0013Z[\u0004\u000035HHefhj\u01bf\u0000"+
		"]\u0001\u0000\u0000\u0000\u0002r\u0001\u0000\u0000\u0000\u0004z\u0001"+
		"\u0000\u0000\u0000\u0006|\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000"+
		"\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000"+
		"\u0000\u000e\u009e\u0001\u0000\u0000\u0000\u0010\u00a7\u0001\u0000\u0000"+
		"\u0000\u0012\u00ae\u0001\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000"+
		"\u0000\u0016\u00bb\u0001\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000"+
		"\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c\u00ef\u0001\u0000\u0000"+
		"\u0000\u001e\u00f3\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000"+
		"\"\u00fd\u0001\u0000\u0000\u0000$\u0112\u0001\u0000\u0000\u0000&\u0114"+
		"\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000\u0000*\u0132\u0001\u0000"+
		"\u0000\u0000,\u0134\u0001\u0000\u0000\u0000.\u0138\u0001\u0000\u0000\u0000"+
		"0\u013e\u0001\u0000\u0000\u00002\u0141\u0001\u0000\u0000\u00004\u0148"+
		"\u0001\u0000\u0000\u00006\u014a\u0001\u0000\u0000\u00008\u0150\u0001\u0000"+
		"\u0000\u0000:\u0153\u0001\u0000\u0000\u0000<\u0160\u0001\u0000\u0000\u0000"+
		">\u0163\u0001\u0000\u0000\u0000@\u0166\u0001\u0000\u0000\u0000B\u016a"+
		"\u0001\u0000\u0000\u0000D\u017d\u0001\u0000\u0000\u0000F\u017f\u0001\u0000"+
		"\u0000\u0000H\u0187\u0001\u0000\u0000\u0000J\u018c\u0001\u0000\u0000\u0000"+
		"L\u0194\u0001\u0000\u0000\u0000N\u019f\u0001\u0000\u0000\u0000P\u01aa"+
		"\u0001\u0000\u0000\u0000R\u01ac\u0001\u0000\u0000\u0000T\u01ae\u0001\u0000"+
		"\u0000\u0000V\u01b0\u0001\u0000\u0000\u0000X\u01b2\u0001\u0000\u0000\u0000"+
		"Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0000\u0000\u0001a\u0001"+
		"\u0001\u0000\u0000\u0000bd\u0003\u0004\u0002\u0000ce\u0005a\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000es\u0001\u0000\u0000"+
		"\u0000fh\u0003$\u0012\u0000gi\u0005a\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000is\u0001\u0000\u0000\u0000jl\u00034\u001a\u0000"+
		"km\u0005a\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"ms\u0001\u0000\u0000\u0000np\u0003@ \u0000oq\u0005a\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rb\u0001\u0000\u0000\u0000rf\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000"+
		"\u0000rn\u0001\u0000\u0000\u0000s\u0003\u0001\u0000\u0000\u0000t{\u0003"+
		"\u0006\u0003\u0000u{\u0003\u0018\f\u0000v{\u0003\u001a\r\u0000w{\u0003"+
		"\u001e\u000f\u0000x{\u0003 \u0010\u0000y{\u0003\"\u0011\u0000zt\u0001"+
		"\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000"+
		"zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{\u0005\u0001\u0000\u0000\u0000|~\u0003\b\u0004\u0000}\u007f\u0003"+
		"\u000e\u0007\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0012\t\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085\u0003\u0014\n\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0016\u000b\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0007\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a"+
		"\u008b\u0003\n\u0005\u0000\u008b\t\u0001\u0000\u0000\u0000\u008c\u0096"+
		"\u0005Z\u0000\u0000\u008d\u0092\u0003\f\u0006\u0000\u008e\u008f\u0005"+
		"O\u0000\u0000\u008f\u0091\u0003\f\u0006\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u008c\u0001\u0000"+
		"\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0096\u000b\u0001\u0000"+
		"\u0000\u0000\u0097\u009c\u0003D\"\u0000\u0098\u009a\u0005\u0014\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0005d\u0000\u0000"+
		"\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\r\u0001\u0000\u0000\u0000\u009e\u009f\u0005\t\u0000\u0000\u009f"+
		"\u00a4\u0003\u0010\b\u0000\u00a0\u00a1\u0005O\u0000\u0000\u00a1\u00a3"+
		"\u0003\u0010\b\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00ac\u0003V+\u0000\u00a8\u00aa\u0005\u0014\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005d\u0000\u0000"+
		"\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af"+
		"\u00b0\u0003D\"\u0000\u00b0\u0013\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\r\u0000\u0000\u00b2\u00b3\u0005\u000e\u0000\u0000\u00b3\u00b8\u0003"+
		"D\"\u0000\u00b4\u00b5\u0005O\u0000\u0000\u00b5\u00b7\u0003D\"\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u0015\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd"+
		"\u00c2\u0003D\"\u0000\u00be\u00bf\u0005O\u0000\u0000\u00bf\u00c1\u0003"+
		"D\"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0007\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0017\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u00ca\u0005\u0006"+
		"\u0000\u0000\u00ca\u00cb\u0003V+\u0000\u00cb\u00cc\u0005]\u0000\u0000"+
		"\u00cc\u00d1\u0003X,\u0000\u00cd\u00ce\u0005O\u0000\u0000\u00ce\u00d0"+
		"\u0003X,\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005^\u0000\u0000\u00d5\u00d6\u0005\u0007\u0000"+
		"\u0000\u00d6\u00d7\u0005]\u0000\u0000\u00d7\u00dc\u0003D\"\u0000\u00d8"+
		"\u00d9\u0005O\u0000\u0000\u00d9\u00db\u0003D\"\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"^\u0000\u0000\u00e0\u0019\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0003"+
		"\u0000\u0000\u00e2\u00e3\u0003V+\u0000\u00e3\u00e4\u0005\b\u0000\u0000"+
		"\u00e4\u00e9\u0003\u001c\u000e\u0000\u00e5\u00e6\u0005O\u0000\u0000\u00e6"+
		"\u00e8\u0003\u001c\u000e\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ee\u0003\u0012\t\u0000\u00ed\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u001b"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003X,\u0000\u00f0\u00f1\u0005R"+
		"\u0000\u0000\u00f1\u00f2\u0003D\"\u0000\u00f2\u001d\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00f5\u0005\t\u0000\u0000"+
		"\u00f5\u00f7\u0003V+\u0000\u00f6\u00f8\u0003\u0012\t\u0000\u00f7\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u001f"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa\u00fb"+
		"\u0005\u001a\u0000\u0000\u00fb\u00fc\u0003V+\u0000\u00fc!\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\u0005\u0000\u0000\u00fe\u00ff\u0005\u0006"+
		"\u0000\u0000\u00ff\u0100\u0003V+\u0000\u0100\u0101\u0005C\u0000\u0000"+
		"\u0101\u0102\u0003V+\u0000\u0102\u0103\u0005\f\u0000\u0000\u0103\u0104"+
		"\u0003D\"\u0000\u0104\u0105\u0005=\u0000\u0000\u0105\u0106\u0005D\u0000"+
		"\u0000\u0106\u0107\u0005>\u0000\u0000\u0107\u0108\u0003\u001a\r\u0000"+
		"\u0108\u0109\u0005=\u0000\u0000\u0109\u010a\u00052\u0000\u0000\u010a\u010b"+
		"\u0005D\u0000\u0000\u010b\u010c\u0005>\u0000\u0000\u010c\u010d\u0003\u0018"+
		"\f\u0000\u010d#\u0001\u0000\u0000\u0000\u010e\u0113\u0003&\u0013\u0000"+
		"\u010f\u0113\u0003(\u0014\u0000\u0110\u0113\u0003,\u0016\u0000\u0111\u0113"+
		"\u0003.\u0017\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u010f\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0113%\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0015"+
		"\u0000\u0000\u0115\u0116\u0005\u001a\u0000\u0000\u0116\u0117\u0003V+\u0000"+
		"\u0117\u0118\u0005]\u0000\u0000\u0118\u011d\u00030\u0018\u0000\u0119\u011a"+
		"\u0005O\u0000\u0000\u011a\u011c\u00030\u0018\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005^\u0000"+
		"\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0016\u0000\u0000"+
		"\u0123\u0124\u0005\u001a\u0000\u0000\u0124\u0126\u0003V+\u0000\u0125\u0127"+
		"\u0003*\u0015\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129)\u0001\u0000\u0000\u0000\u012a\u012b\u0005E\u0000"+
		"\u0000\u012b\u0133\u00030\u0018\u0000\u012c\u012d\u0005\u0017\u0000\u0000"+
		"\u012d\u0133\u0003X,\u0000\u012e\u012f\u0005\u0016\u0000\u0000\u012f\u0130"+
		"\u0003X,\u0000\u0130\u0131\u00032\u0019\u0000\u0131\u0133\u0001\u0000"+
		"\u0000\u0000\u0132\u012a\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000"+
		"\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0133+\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005\u0017\u0000\u0000\u0135\u0136\u0005\u001a\u0000"+
		"\u0000\u0136\u0137\u0003V+\u0000\u0137-\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005\u0019\u0000\u0000\u0139\u013a\u0005\u001a\u0000\u0000\u013a"+
		"\u013b\u0003V+\u0000\u013b\u013c\u0005F\u0000\u0000\u013c\u013d\u0003"+
		"V+\u0000\u013d/\u0001\u0000\u0000\u0000\u013e\u013f\u0003X,\u0000\u013f"+
		"\u0140\u00032\u0019\u0000\u01401\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"d\u0000\u0000\u01423\u0001\u0000\u0000\u0000\u0143\u0149\u00036\u001b"+
		"\u0000\u0144\u0149\u00038\u001c\u0000\u0145\u0149\u0003:\u001d\u0000\u0146"+
		"\u0149\u0003<\u001e\u0000\u0147\u0149\u0003>\u001f\u0000\u0148\u0143\u0001"+
		"\u0000\u0000\u0000\u0148\u0144\u0001\u0000\u0000\u0000\u0148\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001"+
		"\u0000\u0000\u0000\u01495\u0001\u0000\u0000\u0000\u014a\u014b\u0005(\u0000"+
		"\u0000\u014b\u014c\u0005d\u0000\u0000\u014c\u014d\u0005)\u0000\u0000\u014d"+
		"\u014e\u0005G\u0000\u0000\u014e\u014f\u0003\u0006\u0003\u0000\u014f7\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005*\u0000\u0000\u0151\u0152\u0005d\u0000"+
		"\u0000\u01529\u0001\u0000\u0000\u0000\u0153\u0154\u0005+\u0000\u0000\u0154"+
		"\u0155\u0005.\u0000\u0000\u0155\u0156\u0005\t\u0000\u0000\u0156\u0157"+
		"\u0005d\u0000\u0000\u0157\u0158\u0005\u0006\u0000\u0000\u0158\u015d\u0003"+
		"X,\u0000\u0159\u015a\u0005O\u0000\u0000\u015a\u015c\u0003X,\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		";\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0005,\u0000\u0000\u0161\u0162\u0005d\u0000\u0000\u0162=\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0005-\u0000\u0000\u0164\u0165\u0005d\u0000\u0000"+
		"\u0165?\u0001\u0000\u0000\u0000\u0166\u0167\u0005/\u0000\u0000\u0167\u0168"+
		"\u0003B!\u0000\u0168\u0169\u0003\u0006\u0003\u0000\u0169A\u0001\u0000"+
		"\u0000\u0000\u016a\u0176\u0005d\u0000\u0000\u016b\u016c\u0005]\u0000\u0000"+
		"\u016c\u0171\u0003X,\u0000\u016d\u016e\u0005O\u0000\u0000\u016e\u0170"+
		"\u0003X,\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005^\u0000\u0000\u0175\u0177\u0001\u0000\u0000"+
		"\u0000\u0176\u016b\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0014\u0000"+
		"\u0000\u0179\u017a\u0005]\u0000\u0000\u017a\u017b\u0003\u0006\u0003\u0000"+
		"\u017b\u017c\u0005^\u0000\u0000\u017cC\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0003F#\u0000\u017eE\u0001\u0000\u0000\u0000\u017f\u0184\u0003H$\u0000"+
		"\u0180\u0181\u0007\u0001\u0000\u0000\u0181\u0183\u0003H$\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185G\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0003"+
		"J%\u0000\u0188\u0189\u0007\u0002\u0000\u0000\u0189\u018b\u0003J%\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018bI\u0001\u0000\u0000\u0000\u018c\u0191\u0003L&\u0000\u018d\u018e"+
		"\u0007\u0003\u0000\u0000\u018e\u0190\u0003L&\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192K\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0199\u0003N\'\u0000"+
		"\u0195\u0196\u0007\u0004\u0000\u0000\u0196\u0198\u0003N\'\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"M\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0005Y\u0000\u0000\u019d\u01a0\u0003N\'\u0000\u019e\u01a0\u0003P(\u0000"+
		"\u019f\u019c\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0O\u0001\u0000\u0000\u0000\u01a1\u01ab\u0003R)\u0000\u01a2\u01ab"+
		"\u0003X,\u0000\u01a3\u01ab\u0003V+\u0000\u01a4\u01ab\u0005n\u0000\u0000"+
		"\u01a5\u01ab\u0005o\u0000\u0000\u01a6\u01a7\u0005]\u0000\u0000\u01a7\u01a8"+
		"\u0003D\"\u0000\u01a8\u01a9\u0005^\u0000\u0000\u01a9\u01ab\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a1\u0001\u0000\u0000\u0000\u01aa\u01a2\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a3\u0001\u0000\u0000\u0000\u01aa\u01a4\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01aa\u01a6\u0001\u0000"+
		"\u0000\u0000\u01abQ\u0001\u0000\u0000\u0000\u01ac\u01ad\u0007\u0005\u0000"+
		"\u0000\u01adS\u0001\u0000\u0000\u0000\u01ae\u01af\u0005d\u0000\u0000\u01af"+
		"U\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003T*\u0000\u01b1W\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0003T*\u0000\u01b3Y\u0001\u0000\u0000\u0000"+
		"(]dhlprz~\u0081\u0084\u0087\u0092\u0095\u0099\u009c\u00a4\u00a9\u00ac"+
		"\u00b8\u00c2\u00c6\u00d1\u00dc\u00e9\u00ed\u00f7\u0112\u011d\u0128\u0132"+
		"\u0148\u015d\u0171\u0176\u0184\u018a\u0191\u0199\u019f\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}