lexer grammar mysqllexer;

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
fragment SQ : '\'';


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
RENAME      : R E N A M E;
TABLE       : T A B L E;
VIEW        : V I E W;
INDEX       : I N D E X;
PRIMARY     : P R I M A R Y;
UNIQUE      : U N I Q U E;
CONSTRAINT  : C O N S T R A I N T;
REFERENCES  : R E F E R E N C E S;
DATABASE    : D A T A B A S E;

// Joins
INNER       : I N N E R;
LEFT        : L E F T;
RIGHT       : R I G H T;
FULL        : F U L L;
CROSS       : C R O S S;
OUTER       : O U T E R;

// Cursor Manipulation
DECLARE     : D E C L A R E;
CURSOR      : C U R S O R;
OPEN        : O P E N;
FETCH       : F E T C H;
CLOSE       : C L O S E;
DEALLOCATE  : D E A L L O C A T E;
NEXT        : N E X T;

// CTE
WITH        : W I T H;

// Boolean & logic
AND         : A N D;
OR          : O R;
NOT         : N O T;
TRUE        : T R U E;
FALSE       : F A L S E;
NULL        : N U L L;
EXISTS      : E X I S T S;

// Other
LIKE        : L I K E;
IN          : I N;
ALL         : A L L;
ANY         : A N Y;
BETWEEN     : B E T W E E N;
CASE        : C A S E;
WHEN        : W H E N;
THEN        : T H E N;
ELSE        : E L S E;
END         : E N D;
ASC         : A S C;
DESC        : D E S C;
USING        : U S I N G;
MATCHED        : M A T C H E D;
ADD        : A D D;
TO        : T O;
FOR        : F O R;
INT        : I N T;


// Aggregates / Functions
COUNT       : C O U N T;
SUM         : S U M;
AVG         : A V G;
MIN         : M I N;
MAX         : M A X;


// --------------------------------------
// Symbols
// --------------------------------------

ASSIGN      : ':=';
COMMA       : ',';
CONCAT      : '||';
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
PERCENT_OP  : '%';
LPAREN      : '(';
RPAREN      : ')';
LBRACKET    : '[';
RBRACKET    : ']';
SEMI        : ';';


// --------------------------------------
// Identifiers
// --------------------------------------

BRACKETED_ID : '[' ~[\]]* ']';

DQUOTE_ID : '"' ( '""' | ~'"' )* '"';

ID : LETTER (LETTER | DIGIT)*;


// --------------------------------------
// Literals
// --------------------------------------

HEX_STRING
    : '0' X [0-9A-Fa-f]+ ( '\\' [ \t]* [\r\n] [0-9A-Fa-f]+ )*
    ;

BIT_STRING : B '\'' [01]+ '\'';

INTEGER : DIGIT+;

DECIMAL : DIGIT+ '.' DIGIT+;

FLOAT : DIGIT+ ('.' DIGIT+)? [eE] [+-]? DIGIT+;

STRING
    : '\'' ( '\'\'' | ~'\'' )* '\''
    ;



// --------------------------------------
// Comments & whitespace
// --------------------------------------

WS : [ \t\r\n]+ -> skip;

LINE_COMMENT : '--' ~[\r\n]* -> skip;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;


// --------------------------------------
// Variables
// --------------------------------------

USER_VAR
    : '@' LETTER (LETTER | DIGIT)*
    | '@' '`' ~'`'+ '`'
    ;

SYSTEM_VAR : '@@' [a-zA-Z0-9_.]+;
