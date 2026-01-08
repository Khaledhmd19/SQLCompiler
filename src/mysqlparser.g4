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

// SELECT
selectStatement
    : selectClause fromClause? whereClause? groupByClause? orderByClause?
    ;

selectClause
    : SELECT selectList
    ;

selectList
    : STAR
    | selectItem (COMMA selectItem)*
    ;

selectItem
    : expression (AS? ID)?
    ;

fromClause
    : FROM tableSource (COMMA tableSource)*
    ;

tableSource
    : tableName (AS? ID)?
    ;

whereClause
    : WHERE expression
    ;

groupByClause
    : GROUP BY expression (COMMA expression)*
    ;

orderByClause
    : ORDER BY expression (COMMA expression)* (ASC | DESC)?
    ;

// INSERT
insertStatement
    : INSERT INTO tableName
      LPAREN columnName (COMMA columnName)* RPAREN
      VALUES
      LPAREN expression (COMMA expression)* RPAREN
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
    : CREATE TABLE tableName LPAREN columnDef (COMMA columnDef)* RPAREN
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
    : columnName dataType
    ;

dataType
    : ID           // INT, VARCHAR, DATE, etc.
    ;

// ======================================
// Cursor Manipulation Statements
// ======================================
cursorStatement
    : declareCursor
    | openCursor
    | fetchCursor
    | closeCursor
    | deallocateCursor
    ;

declareCursor
    : DECLARE ID CURSOR FOR selectStatement
    ;

openCursor
    : OPEN ID
    ;

fetchCursor
    : FETCH NEXT FROM ID INTO columnName (COMMA columnName)*
    ;

closeCursor
    : CLOSE ID
    ;

deallocateCursor
    : DEALLOCATE ID
    ;

// ======================================
// Common Table Expression (CTE)
// ======================================
cteStatement
    : WITH cteDefinition selectStatement
    ;

cteDefinition
    : ID (LPAREN columnName (COMMA columnName)* RPAREN)? AS LPAREN selectStatement RPAREN
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
    : additiveExpression ((EQ | NEQ | LT | LTE | GT | GTE) additiveExpression)?
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((STAR | SLASH | PERCENT) unaryExpression)*
    ;

unaryExpression
    : MINUS unaryExpression
    | primary
    ;

primary
    : literal
    | columnName
    | tableName
    | USER_VAR
    | SYSTEM_VAR
    | LPAREN expression RPAREN
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
    ;

tableName
    : identifier
    ;

columnName
    : identifier
    ;