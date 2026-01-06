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
		MATCHED=68, ADD=69, TO=70, FOR=71, COUNT=72, SUM=73, AVG=74, MIN=75, MAX=76, 
		ASSIGN=77, COMMA=78, CONCAT=79, DOT=80, EQ=81, NEQ=82, GT=83, GTE=84, 
		LT=85, LTE=86, PLUS=87, MINUS=88, STAR=89, SLASH=90, PERCENT_OP=91, LPAREN=92, 
		RPAREN=93, LBRACKET=94, RBRACKET=95, SEMI=96, BRACKETED_ID=97, DQUOTE_ID=98, 
		ID=99, HEX_STRING=100, BIT_STRING=101, INT=102, DECIMAL=103, FLOAT=104, 
		STRING=105, WS=106, LINE_COMMENT=107, BLOCK_COMMENT=108, USER_VAR=109, 
		SYSTEM_VAR=110;
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
		RULE_literal = 41, RULE_tableName = 42, RULE_columnName = 43;
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
			"primary", "literal", "tableName", "columnName"
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
			null, null, null, null, null, "':='", "','", "'||'", "'.'", "'='", null, 
			"'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
			"')'", "'['", "']'", "';'"
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
			"END", "ASC", "DESC", "USING", "MATCHED", "ADD", "TO", "FOR", "COUNT", 
			"SUM", "AVG", "MIN", "MAX", "ASSIGN", "COMMA", "CONCAT", "DOT", "EQ", 
			"NEQ", "GT", "GTE", "LT", "LTE", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT_OP", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SEMI", "BRACKETED_ID", "DQUOTE_ID", 
			"ID", "HEX_STRING", "BIT_STRING", "INT", "DECIMAL", "FLOAT", "STRING", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT", "USER_VAR", "SYSTEM_VAR"
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207807762661438L) != 0)) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
			setState(112);
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
				setState(96);
				dmlStatement();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(97);
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
				setState(100);
				ddlStatement();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(101);
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
				setState(104);
				cursorStatement();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(105);
					match(SEMI);
					}
				}

				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				cteStatement();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(109);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				selectStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				insertStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				deleteStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				truncateStatement();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
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
			setState(122);
			selectClause();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(123);
				fromClause();
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(126);
				whereClause();
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(129);
				groupByClause();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(132);
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
			setState(135);
			match(SELECT);
			setState(136);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(STAR);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case MINUS:
			case LPAREN:
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
				setState(139);
				selectItem();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140);
					match(COMMA);
					setState(141);
					selectItem();
					}
					}
					setState(146);
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
			setState(149);
			expression();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(150);
					match(AS);
					}
				}

				setState(153);
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
			setState(156);
			match(FROM);
			setState(157);
			tableSource();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				tableSource();
				}
				}
				setState(164);
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
			setState(165);
			tableName();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(166);
					match(AS);
					}
				}

				setState(169);
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
			setState(172);
			match(WHERE);
			setState(173);
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
			setState(175);
			match(GROUP);
			setState(176);
			match(BY);
			setState(177);
			expression();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				expression();
				}
				}
				setState(184);
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
			setState(185);
			match(ORDER);
			setState(186);
			match(BY);
			setState(187);
			expression();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				expression();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(195);
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
			setState(198);
			match(INSERT);
			setState(199);
			match(INTO);
			setState(200);
			tableName();
			setState(201);
			match(LPAREN);
			setState(202);
			columnName();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				columnName();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(RPAREN);
			setState(211);
			match(VALUES);
			setState(212);
			match(LPAREN);
			setState(213);
			expression();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				expression();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
			setState(223);
			match(UPDATE);
			setState(224);
			tableName();
			setState(225);
			match(SET);
			setState(226);
			assignment();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				assignment();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(234);
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
			setState(237);
			columnName();
			setState(238);
			match(EQ);
			setState(239);
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
			setState(241);
			match(DELETE);
			setState(242);
			match(FROM);
			setState(243);
			tableName();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(244);
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
			setState(247);
			match(TRUNCATE);
			setState(248);
			match(TABLE);
			setState(249);
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
			setState(251);
			match(MERGE);
			setState(252);
			match(INTO);
			setState(253);
			tableName();
			setState(254);
			match(USING);
			setState(255);
			tableName();
			setState(256);
			match(ON);
			setState(257);
			expression();
			setState(258);
			match(WHEN);
			setState(259);
			match(MATCHED);
			setState(260);
			match(THEN);
			setState(261);
			updateStatement();
			setState(262);
			match(WHEN);
			setState(263);
			match(NOT);
			setState(264);
			match(MATCHED);
			setState(265);
			match(THEN);
			setState(266);
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
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				createStatement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				alterStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				dropStatement();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
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
			setState(274);
			match(CREATE);
			setState(275);
			match(TABLE);
			setState(276);
			tableName();
			setState(277);
			match(LPAREN);
			setState(278);
			columnDef();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				columnDef();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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
			setState(288);
			match(ALTER);
			setState(289);
			match(TABLE);
			setState(290);
			tableName();
			setState(292); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(291);
					alterAction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(294); 
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
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(ADD);
				setState(297);
				columnDef();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(DROP);
				setState(299);
				columnName();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(ALTER);
				setState(301);
				columnName();
				setState(302);
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
			setState(306);
			match(DROP);
			setState(307);
			match(TABLE);
			setState(308);
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
			setState(310);
			match(RENAME);
			setState(311);
			match(TABLE);
			setState(312);
			tableName();
			setState(313);
			match(TO);
			setState(314);
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
			setState(316);
			columnName();
			setState(317);
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
			setState(319);
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
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				declareCursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				openCursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				fetchCursor();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				closeCursor();
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
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
			setState(328);
			match(DECLARE);
			setState(329);
			match(ID);
			setState(330);
			match(CURSOR);
			setState(331);
			match(FOR);
			setState(332);
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
			setState(334);
			match(OPEN);
			setState(335);
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
			setState(337);
			match(FETCH);
			setState(338);
			match(NEXT);
			setState(339);
			match(FROM);
			setState(340);
			match(ID);
			setState(341);
			match(INTO);
			setState(342);
			columnName();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				match(COMMA);
				setState(344);
				columnName();
				}
				}
				setState(349);
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
			setState(350);
			match(CLOSE);
			setState(351);
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
			setState(353);
			match(DEALLOCATE);
			setState(354);
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
			setState(356);
			match(WITH);
			setState(357);
			cteDefinition();
			setState(358);
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
			setState(360);
			match(ID);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(361);
				match(LPAREN);
				setState(362);
				columnName();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					columnName();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(RPAREN);
				}
			}

			setState(374);
			match(AS);
			setState(375);
			match(LPAREN);
			setState(376);
			selectStatement();
			setState(377);
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
			setState(379);
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
			setState(381);
			relationalExpression();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				relationalExpression();
				}
				}
				setState(388);
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
			setState(389);
			additiveExpression();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 63L) != 0)) {
				{
				setState(390);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
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
			setState(394);
			multiplicativeExpression();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(396);
				multiplicativeExpression();
				}
				}
				setState(401);
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
			setState(402);
			unaryExpression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT || _la==STAR || _la==SLASH) {
				{
				{
				setState(403);
				_la = _input.LA(1);
				if ( !(_la==PERCENT || _la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				unaryExpression();
				}
				}
				setState(409);
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
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(MINUS);
				setState(411);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
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
				setState(412);
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
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				columnName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				tableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(USER_VAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(SYSTEM_VAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				match(LPAREN);
				setState(421);
				expression();
				setState(422);
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
			setState(426);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 35465847065542663L) != 0)) ) {
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
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		enterRule(_localctx, 84, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mysqlparser.ID, 0); }
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
		enterRule(_localctx, 86, RULE_columnName);
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

	public static final String _serializedATN =
		"\u0004\u0001n\u01b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"g\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001o\b\u0001\u0003\u0001q\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0003\u0003\u0003"+
		"\u0080\b\u0003\u0001\u0003\u0003\u0003\u0083\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0086\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008f\b\u0005\n\u0005\f\u0005"+
		"\u0092\t\u0005\u0003\u0005\u0094\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0098\b\u0006\u0001\u0006\u0003\u0006\u009b\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a1\b\u0007\n\u0007"+
		"\f\u0007\u00a4\t\u0007\u0001\b\u0001\b\u0003\b\u00a8\b\b\u0001\b\u0003"+
		"\b\u00ab\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00b5\b\n\n\n\f\n\u00b8\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00bf\b\u000b\n\u000b\f\u000b\u00c2"+
		"\t\u000b\u0001\u000b\u0003\u000b\u00c5\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d9\b\f\n\f\f\f\u00dc"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00e6\b\r\n\r\f\r\u00e9\t\r\u0001\r\u0003\r\u00ec\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00f6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0111\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u011a\b\u0013\n\u0013\f\u0013\u011d\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014"+
		"\u0125\b\u0014\u000b\u0014\f\u0014\u0126\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0131\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0147\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u015a"+
		"\b\u001d\n\u001d\f\u001d\u015d\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0005!\u016e\b!\n!\f!\u0171\t!\u0001!\u0001"+
		"!\u0003!\u0175\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0005#\u0181\b#\n#\f#\u0184\t#\u0001$\u0001$\u0001$\u0003"+
		"$\u0189\b$\u0001%\u0001%\u0001%\u0005%\u018e\b%\n%\f%\u0191\t%\u0001&"+
		"\u0001&\u0001&\u0005&\u0196\b&\n&\f&\u0199\t&\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u019e\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01a9\b(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0006\u0001"+
		"\u0000AB\u0001\u000001\u0001\u0000QV\u0001\u0000WX\u0002\u0000\u0013\u0013"+
		"YZ\u0002\u000035di\u01bc\u0000[\u0001\u0000\u0000\u0000\u0002p\u0001\u0000"+
		"\u0000\u0000\u0004x\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000\u0000"+
		"\b\u0087\u0001\u0000\u0000\u0000\n\u0093\u0001\u0000\u0000\u0000\f\u0095"+
		"\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a5"+
		"\u0001\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00af"+
		"\u0001\u0000\u0000\u0000\u0016\u00b9\u0001\u0000\u0000\u0000\u0018\u00c6"+
		"\u0001\u0000\u0000\u0000\u001a\u00df\u0001\u0000\u0000\u0000\u001c\u00ed"+
		"\u0001\u0000\u0000\u0000\u001e\u00f1\u0001\u0000\u0000\u0000 \u00f7\u0001"+
		"\u0000\u0000\u0000\"\u00fb\u0001\u0000\u0000\u0000$\u0110\u0001\u0000"+
		"\u0000\u0000&\u0112\u0001\u0000\u0000\u0000(\u0120\u0001\u0000\u0000\u0000"+
		"*\u0130\u0001\u0000\u0000\u0000,\u0132\u0001\u0000\u0000\u0000.\u0136"+
		"\u0001\u0000\u0000\u00000\u013c\u0001\u0000\u0000\u00002\u013f\u0001\u0000"+
		"\u0000\u00004\u0146\u0001\u0000\u0000\u00006\u0148\u0001\u0000\u0000\u0000"+
		"8\u014e\u0001\u0000\u0000\u0000:\u0151\u0001\u0000\u0000\u0000<\u015e"+
		"\u0001\u0000\u0000\u0000>\u0161\u0001\u0000\u0000\u0000@\u0164\u0001\u0000"+
		"\u0000\u0000B\u0168\u0001\u0000\u0000\u0000D\u017b\u0001\u0000\u0000\u0000"+
		"F\u017d\u0001\u0000\u0000\u0000H\u0185\u0001\u0000\u0000\u0000J\u018a"+
		"\u0001\u0000\u0000\u0000L\u0192\u0001\u0000\u0000\u0000N\u019d\u0001\u0000"+
		"\u0000\u0000P\u01a8\u0001\u0000\u0000\u0000R\u01aa\u0001\u0000\u0000\u0000"+
		"T\u01ac\u0001\u0000\u0000\u0000V\u01ae\u0001\u0000\u0000\u0000XZ\u0003"+
		"\u0002\u0001\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0000\u0000\u0001_\u0001\u0001"+
		"\u0000\u0000\u0000`b\u0003\u0004\u0002\u0000ac\u0005`\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cq\u0001\u0000\u0000\u0000"+
		"df\u0003$\u0012\u0000eg\u0005`\u0000\u0000fe\u0001\u0000\u0000\u0000f"+
		"g\u0001\u0000\u0000\u0000gq\u0001\u0000\u0000\u0000hj\u00034\u001a\u0000"+
		"ik\u0005`\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kq\u0001\u0000\u0000\u0000ln\u0003@ \u0000mo\u0005`\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"p`\u0001\u0000\u0000\u0000pd\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000"+
		"\u0000pl\u0001\u0000\u0000\u0000q\u0003\u0001\u0000\u0000\u0000ry\u0003"+
		"\u0006\u0003\u0000sy\u0003\u0018\f\u0000ty\u0003\u001a\r\u0000uy\u0003"+
		"\u001e\u000f\u0000vy\u0003 \u0010\u0000wy\u0003\"\u0011\u0000xr\u0001"+
		"\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000"+
		"xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000y\u0005\u0001\u0000\u0000\u0000z|\u0003\b\u0004\u0000{}\u0003\u000e"+
		"\u0007\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~\u0080\u0003\u0012\t\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0003\u0014\n\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0003\u0016\u000b\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0007\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089\u0003\n\u0005\u0000"+
		"\u0089\t\u0001\u0000\u0000\u0000\u008a\u0094\u0005Y\u0000\u0000\u008b"+
		"\u0090\u0003\f\u0006\u0000\u008c\u008d\u0005N\u0000\u0000\u008d\u008f"+
		"\u0003\f\u0006\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008b\u0001"+
		"\u0000\u0000\u0000\u0094\u000b\u0001\u0000\u0000\u0000\u0095\u009a\u0003"+
		"D\"\u0000\u0096\u0098\u0005\u0014\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0005c\u0000\u0000\u009a\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\r\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\t\u0000\u0000\u009d\u00a2\u0003\u0010\b\u0000\u009e"+
		"\u009f\u0005N\u0000\u0000\u009f\u00a1\u0003\u0010\b\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u000f"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00aa"+
		"\u0003T*\u0000\u00a6\u00a8\u0005\u0014\u0000\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0005c\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0011\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0003D\"\u0000\u00ae"+
		"\u0013\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\r\u0000\u0000\u00b0\u00b1"+
		"\u0005\u000e\u0000\u0000\u00b1\u00b6\u0003D\"\u0000\u00b2\u00b3\u0005"+
		"N\u0000\u0000\u00b3\u00b5\u0003D\"\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u0015\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000f\u0000"+
		"\u0000\u00ba\u00bb\u0005\u000e\u0000\u0000\u00bb\u00c0\u0003D\"\u0000"+
		"\u00bc\u00bd\u0005N\u0000\u0000\u00bd\u00bf\u0003D\"\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5"+
		"\u0007\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0002\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u00c9"+
		"\u0003T*\u0000\u00c9\u00ca\u0005\\\u0000\u0000\u00ca\u00cf\u0003V+\u0000"+
		"\u00cb\u00cc\u0005N\u0000\u0000\u00cc\u00ce\u0003V+\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005]\u0000\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d5\u0005"+
		"\\\u0000\u0000\u00d5\u00da\u0003D\"\u0000\u00d6\u00d7\u0005N\u0000\u0000"+
		"\u00d7\u00d9\u0003D\"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005]\u0000\u0000\u00de\u0019"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1"+
		"\u0003T*\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2\u00e7\u0003\u001c"+
		"\u000e\u0000\u00e3\u00e4\u0005N\u0000\u0000\u00e4\u00e6\u0003\u001c\u000e"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0003\u0012\t\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u001b\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0003V+\u0000\u00ee\u00ef\u0005Q\u0000\u0000\u00ef\u00f0"+
		"\u0003D\"\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0004\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000\u00f3\u00f5\u0003T"+
		"*\u0000\u00f4\u00f6\u0003\u0012\t\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u001f\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0018\u0000\u0000\u00f8\u00f9\u0005\u001a\u0000"+
		"\u0000\u00f9\u00fa\u0003T*\u0000\u00fa!\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0005\u0000\u0000\u00fc\u00fd\u0005\u0006\u0000\u0000\u00fd"+
		"\u00fe\u0003T*\u0000\u00fe\u00ff\u0005C\u0000\u0000\u00ff\u0100\u0003"+
		"T*\u0000\u0100\u0101\u0005\f\u0000\u0000\u0101\u0102\u0003D\"\u0000\u0102"+
		"\u0103\u0005=\u0000\u0000\u0103\u0104\u0005D\u0000\u0000\u0104\u0105\u0005"+
		">\u0000\u0000\u0105\u0106\u0003\u001a\r\u0000\u0106\u0107\u0005=\u0000"+
		"\u0000\u0107\u0108\u00052\u0000\u0000\u0108\u0109\u0005D\u0000\u0000\u0109"+
		"\u010a\u0005>\u0000\u0000\u010a\u010b\u0003\u0018\f\u0000\u010b#\u0001"+
		"\u0000\u0000\u0000\u010c\u0111\u0003&\u0013\u0000\u010d\u0111\u0003(\u0014"+
		"\u0000\u010e\u0111\u0003,\u0016\u0000\u010f\u0111\u0003.\u0017\u0000\u0110"+
		"\u010c\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		"%\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0015\u0000\u0000\u0113\u0114"+
		"\u0005\u001a\u0000\u0000\u0114\u0115\u0003T*\u0000\u0115\u0116\u0005\\"+
		"\u0000\u0000\u0116\u011b\u00030\u0018\u0000\u0117\u0118\u0005N\u0000\u0000"+
		"\u0118\u011a\u00030\u0018\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a"+
		"\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0005]\u0000\u0000\u011f\'"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0016\u0000\u0000\u0121\u0122"+
		"\u0005\u001a\u0000\u0000\u0122\u0124\u0003T*\u0000\u0123\u0125\u0003*"+
		"\u0015\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127)\u0001\u0000\u0000\u0000\u0128\u0129\u0005E\u0000\u0000"+
		"\u0129\u0131\u00030\u0018\u0000\u012a\u012b\u0005\u0017\u0000\u0000\u012b"+
		"\u0131\u0003V+\u0000\u012c\u012d\u0005\u0016\u0000\u0000\u012d\u012e\u0003"+
		"V+\u0000\u012e\u012f\u00032\u0019\u0000\u012f\u0131\u0001\u0000\u0000"+
		"\u0000\u0130\u0128\u0001\u0000\u0000\u0000\u0130\u012a\u0001\u0000\u0000"+
		"\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0131+\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\u0017\u0000\u0000\u0133\u0134\u0005\u001a\u0000\u0000"+
		"\u0134\u0135\u0003T*\u0000\u0135-\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0005\u0019\u0000\u0000\u0137\u0138\u0005\u001a\u0000\u0000\u0138\u0139"+
		"\u0003T*\u0000\u0139\u013a\u0005F\u0000\u0000\u013a\u013b\u0003T*\u0000"+
		"\u013b/\u0001\u0000\u0000\u0000\u013c\u013d\u0003V+\u0000\u013d\u013e"+
		"\u00032\u0019\u0000\u013e1\u0001\u0000\u0000\u0000\u013f\u0140\u0005c"+
		"\u0000\u0000\u01403\u0001\u0000\u0000\u0000\u0141\u0147\u00036\u001b\u0000"+
		"\u0142\u0147\u00038\u001c\u0000\u0143\u0147\u0003:\u001d\u0000\u0144\u0147"+
		"\u0003<\u001e\u0000\u0145\u0147\u0003>\u001f\u0000\u0146\u0141\u0001\u0000"+
		"\u0000\u0000\u0146\u0142\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u01475\u0001\u0000\u0000\u0000\u0148\u0149\u0005(\u0000\u0000"+
		"\u0149\u014a\u0005c\u0000\u0000\u014a\u014b\u0005)\u0000\u0000\u014b\u014c"+
		"\u0005G\u0000\u0000\u014c\u014d\u0003\u0006\u0003\u0000\u014d7\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005*\u0000\u0000\u014f\u0150\u0005c\u0000\u0000"+
		"\u01509\u0001\u0000\u0000\u0000\u0151\u0152\u0005+\u0000\u0000\u0152\u0153"+
		"\u0005.\u0000\u0000\u0153\u0154\u0005\t\u0000\u0000\u0154\u0155\u0005"+
		"c\u0000\u0000\u0155\u0156\u0005\u0006\u0000\u0000\u0156\u015b\u0003V+"+
		"\u0000\u0157\u0158\u0005N\u0000\u0000\u0158\u015a\u0003V+\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		";\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0005,\u0000\u0000\u015f\u0160\u0005c\u0000\u0000\u0160=\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0005-\u0000\u0000\u0162\u0163\u0005c\u0000\u0000"+
		"\u0163?\u0001\u0000\u0000\u0000\u0164\u0165\u0005/\u0000\u0000\u0165\u0166"+
		"\u0003B!\u0000\u0166\u0167\u0003\u0006\u0003\u0000\u0167A\u0001\u0000"+
		"\u0000\u0000\u0168\u0174\u0005c\u0000\u0000\u0169\u016a\u0005\\\u0000"+
		"\u0000\u016a\u016f\u0003V+\u0000\u016b\u016c\u0005N\u0000\u0000\u016c"+
		"\u016e\u0003V+\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0171\u0001"+
		"\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0005]\u0000\u0000\u0173\u0175\u0001\u0000"+
		"\u0000\u0000\u0174\u0169\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0014"+
		"\u0000\u0000\u0177\u0178\u0005\\\u0000\u0000\u0178\u0179\u0003\u0006\u0003"+
		"\u0000\u0179\u017a\u0005]\u0000\u0000\u017aC\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0003F#\u0000\u017cE\u0001\u0000\u0000\u0000\u017d\u0182\u0003"+
		"H$\u0000\u017e\u017f\u0007\u0001\u0000\u0000\u017f\u0181\u0003H$\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183G\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0003J%\u0000\u0186\u0187\u0007\u0002\u0000\u0000\u0187\u0189\u0003"+
		"J%\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189I\u0001\u0000\u0000\u0000\u018a\u018f\u0003L&\u0000\u018b"+
		"\u018c\u0007\u0003\u0000\u0000\u018c\u018e\u0003L&\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190K\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0197\u0003N\'"+
		"\u0000\u0193\u0194\u0007\u0004\u0000\u0000\u0194\u0196\u0003N\'\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198M\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005X\u0000\u0000\u019b\u019e\u0003N\'\u0000\u019c\u019e\u0003"+
		"P(\u0000\u019d\u019a\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000"+
		"\u0000\u019eO\u0001\u0000\u0000\u0000\u019f\u01a9\u0003R)\u0000\u01a0"+
		"\u01a9\u0003V+\u0000\u01a1\u01a9\u0003T*\u0000\u01a2\u01a9\u0005m\u0000"+
		"\u0000\u01a3\u01a9\u0005n\u0000\u0000\u01a4\u01a5\u0005\\\u0000\u0000"+
		"\u01a5\u01a6\u0003D\"\u0000\u01a6\u01a7\u0005]\u0000\u0000\u01a7\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a8\u019f\u0001\u0000\u0000\u0000\u01a8\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a1\u0001\u0000\u0000\u0000\u01a8\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a9Q\u0001\u0000\u0000\u0000\u01aa\u01ab\u0007"+
		"\u0005\u0000\u0000\u01abS\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005c\u0000"+
		"\u0000\u01adU\u0001\u0000\u0000\u0000\u01ae\u01af\u0005c\u0000\u0000\u01af"+
		"W\u0001\u0000\u0000\u0000([bfjnpx|\u007f\u0082\u0085\u0090\u0093\u0097"+
		"\u009a\u00a2\u00a7\u00aa\u00b6\u00c0\u00c4\u00cf\u00da\u00e7\u00eb\u00f5"+
		"\u0110\u011b\u0126\u0130\u0146\u015b\u016f\u0174\u0182\u0188\u018f\u0197"+
		"\u019d\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}