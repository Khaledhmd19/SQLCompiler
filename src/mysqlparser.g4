parser grammar mysqlparser;

@header {
package parser;
}

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
    ;

// SELECT
selectStatement
    : SELECT selectList fromClause? whereClause? groupByClause? orderByClause?
    ;

selectList
    : STAR
    | selectItem (COMMA selectItem)*
    ;

selectItem
    : expression (AS? ID)?
    ;

fromClause
    : FROM tableName (COMMA tableName)*
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
    : DELETE FROM tableName whereClause?
    ;

// TRUNCATE
truncateStatement
    : TRUNCATE TABLE tableName
    ;

// ======================================
// DDL Statements
// ======================================
ddlStatement
    : createStatement
    | alterStatement
    | dropStatement
    ;

createStatement
    : CREATE TABLE tableName
      LPAREN columnDef (COMMA columnDef)* RPAREN
    ;

alterStatement
    : ALTER TABLE tableName alterAction+
    ;

alterAction
    : ADD columnDef
    | DROP columnName
    ;

dropStatement
    : DROP TABLE tableName
    ;

columnDef
    : columnName dataType
    ;

dataType
    : INT_TYPE
    | VARCHAR_TYPE
    ;

// ======================================
// Expressions (precedence-safe)
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
    : unaryExpression ((STAR | SLASH | PERCENT_OP) unaryExpression)*
    ;

unaryExpression
    : MINUS unaryExpression
    | primary
    ;

primary
    : literal
    | ID
    | USER_VAR
    | SYSTEM_VAR
    | LPAREN expression RPAREN
    ;

// ======================================
// Literals
// ======================================
literal
    : INT_LITERAL
    | DECIMAL_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;

// ======================================
// Identifiers
// ======================================
tableName
    : ID
    ;

columnName
    : ID
    ;
