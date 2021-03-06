grammar Tex;

document: (command | units) (command | units | PARSEP)*;

command: BACKSLASH WORD cmdoptions? cmdparams?;
cmdoptions: '[' text ']';
cmdparams: '{' text '}';

units: unit+;
unit: text | mathexpr;

text: words+;
words: (NUM | WORD) PREP* | PREP;

mathexpr: '$' math '$';

math: '{' math* '}'
    | OP math CP
    | WORD
    | NUM
    | function
    | symbols
    | math OPERATION math
    | math rel math
    | math SUB math
    | math SUP math
    ;


OPERATION: '*' | '/' | '+' | '-';

function: lim | sum | frac | integral | min;

min: MIN math* | MIN SUB '{' math* '}' math*;

lim: LIM SUB '{' math* '}' '{' math* '}';
frac: FRAC '{' math* '}' '{' math* '}';

sum: SUM LIMITS? SUB '{' math* '}' '^' '{' math* '}' '{' math* '}';
integral: INT LIMITS? SUB '{' math* '}' '^' '{' math* '}';

symbols: TO | INFTY | PI;

OP: '(' | '[' | '\\{';
CP: ')' | ']' | '\\}';

NUM: DIGIT+;
WORD: (LETTER | DIGIT)+;
DIGIT: [0-9];
LETTER: [\u0400-\u04FFа-яА-ЯёЁa-zA-Z];
PARSEP: '\n'+;
PREP: [,.:;!?%];
SPACE: [\t\n\r ]+ -> skip;
SUB: '_';
SUP: '^';
rel: REL;
REL: '<' | '>' | '=' | '\\le' | '\\ge' | '\\ne';
BACKSLASH: '\\';

SUM: '\\sum';
FRAC: '\\frac';
SQRT: '\\sqrt';
INT: '\\int';
LIM: '\\lim';
TO: '\\to';
PI: '\\pi';
INFTY: '\\infty';
LIMITS: '\\limits';
MIN: '\\min';