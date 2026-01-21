parser grammar mysqlparser;

options {
    tokenVocab = mysqllexer;
}

// ======================================
// Entry point
// ======================================
sqlFile
    : statement* EOF
    ;

// ======================================
// Statements
// ======================================
statement
    : dmlStatement SEMI?
    | ddlStatement SEMI?
    | cursorStatement SEMI?
    | cteStatement SEMI?
    | controlFlowStatement
    | setStatement SEMI?
    | execStatement SEMI?
    | useStatement SEMI?
    | GO SEMI?
    ;

setStatement
    : SET USER_VAR (EQ | PLUS_EQ | MINUS_EQ | STAR_EQ | SLASH_EQ) expression  // SET @var = 1 or SET @var += 1
    ;

execStatement
    : (EXEC | EXECUTE) identifier (expression (COMMA expression)*)?
    ;

// USE database statement
useStatement
    : USE identifier
    ;

// ======================================
// Control Flow Statements
// ======================================
controlFlowStatement
    : ifStatement
    | beginEndBlock
    | tryCatchBlock
    ;

ifStatement
    : IF expression statement* (ELSE statement*)?
    ;

beginEndBlock
    : BEGIN statement* END
    ;

tryCatchBlock
    : BEGIN TRY statement* END TRY BEGIN CATCH statement* END CATCH
    ;

// ======================================
// DML Statements
// ======================================
dmlStatement
    : selectStatement
    | insertStatement
    | updateStatement
    | deleteStatement
    | truncateStatement
    | mergeStatement
    ;

// SELECT with JOIN support
selectStatement
    : selectClause fromClause? joinClause* whereClause? groupByClause? havingClause? orderByClause?
    ;

selectClause
    : SELECT (DISTINCT | ALL)? (TOP INT PERCENT?)? selectList
    ;

selectList
    : STAR
    | selectItem (COMMA selectItem)*
    ;

selectItem
    : USER_VAR (EQ | PLUS_EQ) expression  // SELECT @var = expr or @var += expr
    | expression (AS? alias)?
    ;

// Alias can be identifier or string
alias
    : identifier
    | STRING
    ;

fromClause
    : FROM tableSource (COMMA tableSource)*
    ;

tableSource
    : tableName (AS? identifier)?
    ;

// JOIN clauses
joinClause
    : joinType? JOIN tableSource (ON expression)?
    ;

joinType
    : INNER
    | LEFT OUTER?
    | RIGHT OUTER?
    | FULL OUTER?
    | CROSS
    ;

whereClause
    : WHERE expression
    ;

groupByClause
    : GROUP BY expression (COMMA expression)*
    ;

// HAVING clause
havingClause
    : HAVING expression
    ;

// ORDER BY with ASC/DESC per column
orderByClause
    : ORDER BY orderByItem (COMMA orderByItem)*
    ;

orderByItem
    : expression (ASC | DESC)?
    ;

// INSERT with VALUES or SELECT
insertStatement
    : INSERT INTO tableName
      (LPAREN columnName (COMMA columnName)* RPAREN)?
      (VALUES valueRow (COMMA valueRow)* | selectStatement)
    ;

valueRow
    : LPAREN expression (COMMA expression)* RPAREN
    ;

// UPDATE
updateStatement
    : UPDATE tableName
      SET assignment (COMMA assignment)*
      whereClause?
    ;

assignment
    : columnName EQ expression
    ;

// DELETE
deleteStatement
    : DELETE FROM tableName
      whereClause?
    ;

// TRUNCATE
truncateStatement
    : TRUNCATE TABLE tableName
    ;

// MERGE (simplified version)
mergeStatement
    : MERGE INTO tableName USING tableName ON expression
      WHEN MATCHED THEN updateStatement
      WHEN NOT MATCHED THEN insertStatement
    ;

// ======================================
// DDL Statements
// ======================================
ddlStatement
    : createStatement
    | alterStatement
    | dropStatement
    | renameStatement
    ;

createStatement
    : CREATE TABLE tableName LPAREN tableElement (COMMA tableElement)* RPAREN
    ;

tableElement
    : columnDef
    | tableConstraint
    ;

// Table-level constraints (PRIMARY KEY, UNIQUE, FOREIGN KEY)
tableConstraint
    : (CONSTRAINT identifier)? PRIMARY KEY (CLUSTERED | NONCLUSTERED)? LPAREN columnName (COMMA columnName)* RPAREN
    | (CONSTRAINT identifier)? UNIQUE (CLUSTERED | NONCLUSTERED)? LPAREN columnName (COMMA columnName)* RPAREN
    | (CONSTRAINT identifier)? REFERENCES tableName LPAREN columnName (COMMA columnName)* RPAREN
    ;

alterStatement
    : ALTER TABLE tableName alterAction+
    ;

alterAction
    : ADD columnDef
    | DROP columnName
    | ALTER columnName dataType
    ;

dropStatement
    : DROP TABLE tableName
    ;

renameStatement
    : RENAME TABLE tableName TO tableName
    ;

columnDef
    : columnName dataType identitySpec? columnConstraint*
    ;

dataType
    : identifier (LPAREN (INT | MAX) (COMMA INT)? RPAREN)?  // INT, VARCHAR(300), VARCHAR(MAX), DECIMAL(10,2)
    ;

// IDENTITY specification for auto-increment columns
identitySpec
    : IDENTITY (LPAREN INT (COMMA INT)? RPAREN)?
    ;

columnConstraint
    : NOT NULL
    | NULL
    | PRIMARY KEY
    | UNIQUE
    | REFERENCES tableName (LPAREN columnName (COMMA columnName)* RPAREN)?
    | DEFAULT literal
    ;

// ======================================
// Cursor Manipulation & Variable Declarations
// ======================================
cursorStatement
    : declareStatement
    | openCursor
    | fetchCursor
    | closeCursor
    | deallocateCursor
    ;

declareStatement
    : DECLARE USER_VAR (AS? dataType)? (EQ expression)?  // variable declaration: DECLARE @var AS INT = 5
    | DECLARE identifier CURSOR FOR selectStatement  // cursor declaration
    ;

openCursor
    : OPEN identifier
    ;

fetchCursor
    : FETCH NEXT FROM identifier INTO columnName (COMMA columnName)*
    ;

closeCursor
    : CLOSE identifier
    ;

deallocateCursor
    : DEALLOCATE identifier
    ;

// ======================================
// Common Table Expression (CTE)
// ======================================
cteStatement
    : WITH cteDefinition (COMMA cteDefinition)* selectStatement
    ;

cteDefinition
    : identifier (LPAREN columnName (COMMA columnName)* RPAREN)? AS LPAREN selectStatement RPAREN
    ;

// ======================================
// Expressions (with precedence)
// ======================================
expression
    : logicalExpression
    ;

logicalExpression
    : relationalExpression ((AND | OR) relationalExpression)*
    ;

relationalExpression
    : additiveExpression
      ( (EQ | NEQ | LT | LTE | GT | GTE) additiveExpression
      | IS NOT? NULL
      | NOT? IN LPAREN (expression (COMMA expression)* | selectStatement) RPAREN
      | NOT? LIKE additiveExpression
      | NOT? BETWEEN additiveExpression AND additiveExpression
      | NOT? EXISTS LPAREN selectStatement RPAREN
      )?
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((STAR | SLASH | PERCENT_OP) unaryExpression)*
    ;

unaryExpression
    : MINUS unaryExpression
    | NOT unaryExpression
    | EXISTS LPAREN selectStatement RPAREN
    | primary
    ;

primary
    : literal
    | caseExpression
    | USER_VAR
    | SYSTEM_VAR
    | LPAREN selectStatement RPAREN  // subquery
    | LPAREN expression RPAREN
    | aggregateFunction
    | identifierOrFunction
    ;

// Aggregate functions (COUNT, SUM, AVG, MIN, MAX)
aggregateFunction
    : (COUNT | SUM | AVG | MIN | MAX) LPAREN (STAR | DISTINCT? expression) RPAREN
    ;

identifierOrFunction
    : columnName (LPAREN (expression (COMMA expression)*)? RPAREN)?  // column or function call
    ;

caseExpression
    : CASE expression? whenClause+ (ELSE expression)? END
    ;

whenClause
    : WHEN expression THEN expression
    ;

// ======================================
// Literals
// ======================================
literal
    : INT
    | DECIMAL
    | FLOAT
    | STRING
    | HEX_STRING
    | BIT_STRING
    | TRUE
    | FALSE
    | NULL
    ;

// ======================================
// Identifiers
// ======================================
identifier
    : ID
    | BRACKETED_ID
    | DQUOTE_ID
    ;

tableName
    : identifier (DOT identifier (DOT identifier)?)?  // supports: table, schema.table, server.database.schema.table
    ;

columnName
    : identifier (DOT identifier)?  // supports: column, table.column
    ;
