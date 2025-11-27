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

ADD         : A D D;
ALL         : A L L;
ALTER       : A L T E R;
AND         : A N D;
ANY         : A N Y;
AS          : A S;
ASC         : A S C;
BETWEEN     : B E T W E E N;
BY          : B Y;
CASE        : C A S E;
CHECK       : C H E C K;
COLUMN      : C O L U M N;
CONSTRAINT  : C O N S T R A I N T;
CREATE      : C R E A T E;
DATABASE    : D A T A B A S E;
DEFAULT     : D E F A U L T;
DELETE      : D E L E T E;
DESC        : D E S C;
DISTINCT    : D I S T I N C T;
DROP        : D R O P;
ELSE        : E L S E;
END         : E N D;
EXISTS      : E X I S T S;
FALSE       : F A L S E;
FOREIGN     : F O R E I G N;
FROM        : F R O M;
GROUP       : G R O U P;
HAVING      : H A V I N G;
IN          : I N;
INDEX       : I N D E X;
INNER       : I N N E R;
INSERT      : I N S E R T;
INTO        : I N T O;
IS          : I S;
JOIN        : J O I N;
KEY         : K E Y;
LEFT        : L E F T;
LIKE        : L I K E;
LIMIT       : L I M I T;
NOT         : N O T;
NULL        : N U L L;
ON          : O N;
OR          : O R;
ORDER       : O R D E R;
OUTER       : O U T E R;
PRIMARY     : P R I M A R Y;
REFERENCES  : R E F E R E N C E S;
RIGHT       : R I G H T;
SELECT      : S E L E C T;
SET         : S E T;
TABLE       : T A B L E;
THEN        : T H E N;
TRUE        : T R U E;
UNION       : U N I O N;
UNIQUE      : U N I Q U E;
UPDATE      : U P D A T E;
VALUES      : V A L U E S;
WHERE       : W H E R E;


// --------------------------------------
// Symbols
// --------------------------------------

ASSIGN      : ':=';
COMMA       : ',';
CONCAT      : '||';
DOT         : '.';
EQ          : '=';
GTE         : '>=';
GT          : '>';
LBRACKET    : '[';
LPAREN      : '(';
LTE         : '<=';
LT          : '<';
MINUS       : '-';
NEQ         : '<>' | '!=';
PERCENT     : '%';
PLUS        : '+';
RBRACKET    : ']';
RPAREN      : ')';
SEMI        : ';';
SLASH       : '/';
STAR        : '*';


// --------------------------------------
// Identifiers
// --------------------------------------

ID : LETTER (LETTER | DIGIT)*;


// --------------------------------------
// Literals
// --------------------------------------

HEX_STRING
    : '0' [xX] [0-9A-Fa-f]+ ( '\\' [ \t]* [\r\n] [0-9A-Fa-f]+ )*
    ;

BIT_STRING : B '\'' [01]+ '\'';

INT : DIGIT+;

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
