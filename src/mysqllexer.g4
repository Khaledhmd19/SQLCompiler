lexer grammar mysqllexer;

// keywords
ADD: [aA][dD][dD];
ALL: [aA][lL][lL];
ALTER: [aA][lL][tT][eE][rR];
AND: [aA][nN][dD];
ANY: [aA][nN][yY];
AS: [aA][sS];
ASC: [aA][sS][cC];
BETWEEN: [bB][eE][tT][wW][eE][eE][nN];
BY: [bB][yY];
CASE: [cC][aA][sS][eE];
CHECK: [cC][hH][eE][cC][kK];
COLUMN: [cC][oO][lL][uU][mM][nN];
CONSTRAINT: [cC][oO][nN][sS][tT][rR][aA][iI][nN][tT];
CREATE: [cC][rR][eE][aA][tT][eE];
DATABASE: [dD][aA][tT][aA][bB][aA][sS][eE];
DEFAULT: [dD][eE][fF][aA][uU][lL][tT];
DELETE: [dD][eE][lL][eE][tT][eE];
DESC: [dD][eE][sS][cC];
DISTINCT: [dD][iI][sS][tT][iI][nN][cC][tT];
DROP: [dD][rR][oO][pP];
ELSE: [eE][lL][sS][eE];
END: [eE][nN][dD];
EXISTS: [eE][xX][iI][sS][tT][sS];
FALSE: [fF][aA][lL][sS][eE];
FOREIGN: [fF][oO][rR][eE][iI][gG][nN];
FROM: [fF][rR][oO][mM];
GROUP: [gG][rR][oO][uU][pP];
HAVING: [hH][aA][vV][iI][nN][gG];
IN: [iI][nN];
INDEX: [iI][nN][dD][eE][xX];
INNER: [iI][nN][nN][eE][rR];
INSERT: [iI][nN][sS][eE][rR][tT];
INTO: [iI][nN][tT][oO];
IS: [iI][sS];
JOIN: [jJ][oO][iI][nN];
KEY: [kK][eE][yY];
LEFT: [lL][eE][fF][tT];
LIKE: [lL][iI][kK][eE];
LIMIT: [lL][iI][mM][iI][tT];
NOT: [nN][oO][tT];
NULL: [nN][uU][lL][lL];
ON: [oO][nN];
OR: [oO][rR];
ORDER: [oO][rR][dD][eE][rR];
OUTER: [oO][uU][tT][eE][rR];
PRIMARY: [pP][rR][iI][mM][aA][rR][yY];
REFERENCES: [rR][eE][fF][eE][rR][eE][nN][cC][eE][sS];
RIGHT: [rR][iI][gG][hH][tT];
SELECT: [sS][eE][lL][eE][cC][tT];
SET: [sS][eE][tT];
TABLE: [tT][aA][bB][lL][eE];
THEN: [tT][hH][eE][nN];
TRUE: [tT][rR][uU][eE];
UNION: [uU][nN][iI][oO][nN];
UNIQUE: [uU][nN][iI][qQ][uU][eE];
UPDATE: [uU][pP][dD][aA][tT][eE];
VALUES: [vV][aA][lL][uU][eE][sS];
WHERE: [wW][hH][eE][rR][eE];

//symbols
ASSIGN: ':=';
COMMA: ',';
CONCAT: '||';
DOT: '.';
EQ: '=';
GTE: '>=';
GT: '>';
LBRACKET: '[';
LPAREN: '(';
LTE: '<=';
LT: '<';
MINUS: '-';
NEQ: '<>' | '!=';
PERCENT: '%';
PLUS: '+';
RBRACKET: ']';
RPAREN: ')';
SEMI: ';';
SLASH: '/';
STAR: '*';

//identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;

//litirals
INT: [0-9]+;

DECIMAL
    : [0-9]+ '.' [0-9]+
    ;

FLOAT
    : [0-9]+ ('.' [0-9]+)? [eE] [+-]? [0-9]+
    ;

STRING
    : '\'' ( '\'\'' | ~'\'' )* '\''
    ;

HEX_STRING
: [xX] '\'' [0-9A-Fa-f]+ '\''
;

BIT_STRING : [bB] '\'' [01]+ '\'' ;


//whitespace
WS: [ \t\r\n]+ -> skip;

//comments
LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

USER_VAR
    : '@' [a-zA-Z_][a-zA-Z0-9_]*       // @var
    | '@' '`' ~'`'+ '`'               // @`var name`
    ;

SYSTEM_VAR : '@@' [a-zA-Z0-9_.]+ ;
