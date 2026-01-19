lexer grammar mysqllexer;

@header {
package parser;
}


// --------------------------------------
// Fragments
// --------------------------------------
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

fragment LETTER : [a-zA-Z_];
fragment DIGIT  : [0-9];

// --------------------------------------
// Keywords (case-insensitive)
// --------------------------------------

// DML
SELECT      : S E L E C T;
INSERT      : I N S E R T;
UPDATE      : U P D A T E;
DELETE      : D E L E T E;
MERGE       : M E R G E;
INTO        : I N T O;
VALUES      : V A L U E S;
SET         : S E T;
FROM        : F R O M;
WHERE       : W H E R E;
JOIN        : J O I N;
ON          : O N;
GROUP       : G R O U P;
BY          : B Y;
ORDER       : O R D E R;
HAVING      : H A V I N G;
DISTINCT    : D I S T I N C T;
TOP         : T O P;
PERCENT     : P E R C E N T;
AS          : A S;

// DDL
CREATE      : C R E A T E;
ALTER       : A L T E R;
DROP        : D R O P;
TRUNCATE    : T R U N C A T E;
TABLE       : T A B L E;
VIEW        : V I E W;
INDEX       : I N D E X;
PRIMARY     : P R I M A R Y;
UNIQUE      : U N I Q U E;
CONSTRAINT  : C O N S T R A I N T;
REFERENCES  : R E F E R E N C E S;
DATABASE    : D A T A B A S E;

// Boolean & logic
AND         : A N D;
OR          : O R;
NOT         : N O T;
TRUE        : T R U E;
FALSE       : F A L S E;
NULL        : N U L L;

// Other
LIKE        : L I K E;
IN          : I N;
BETWEEN     : B E T W E E N;

// Data types (SQL Server)
INT_TYPE        : I N T;
VARCHAR_TYPE    : V A R C H A R;

// --------------------------------------
// Symbols
// --------------------------------------

COMMA       : ',';
DOT         : '.';
EQ          : '=';
NEQ         : '<>' | '!=';
GT          : '>';
GTE         : '>=';
LT          : '<';
LTE         : '<=';
PLUS        : '+';
MINUS       : '-';
STAR        : '*';
SLASH       : '/';
LPAREN      : '(';
RPAREN      : ')';
SEMI        : ';';

// --------------------------------------
// Identifiers
// --------------------------------------

BRACKETED_ID : '[' ~[\]]+ ']';
DQUOTE_ID    : '"' ( '""' | ~'"' )* '"';

ID : LETTER (LETTER | DIGIT)*;

// --------------------------------------
// Literals
// --------------------------------------

INT_LITERAL
    : DIGIT+
    ;

DECIMAL_LITERAL
    : DIGIT+ '.' DIGIT+
    ;

FLOAT_LITERAL
    : DIGIT+ ('.' DIGIT+)? [eE] [+-]? DIGIT+
    ;

STRING_LITERAL
    : '\'' ( '\'\'' | ~'\'' )* '\''
    ;

// --------------------------------------
// Variables (T-SQL)
// --------------------------------------

USER_VAR
    : '@' LETTER (LETTER | DIGIT)*
    ;

SYSTEM_VAR
    : '@@' [a-zA-Z0-9_.]+
    ;

// --------------------------------------
// Whitespace & comments
// --------------------------------------

WS : [ \t\r\n]+ -> skip;

LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

// -------- NESTED BLOCK COMMENTS --------

BLOCK_COMMENT_START
    : '/*' -> pushMode(COMMENT), skip
    ;

mode COMMENT;

COMMENT_START
    : '/*' -> pushMode(COMMENT), skip
    ;

COMMENT_END
    : '*/' -> popMode, skip
    ;

COMMENT_TEXT
    : . -> skip
    ;
