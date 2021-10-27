grammar Expr;

startRule: prog EOF;

prog: line+;

line: expr comment? NEWLINE;

expr:
	parents_expr
	| expr MUL_DEV expr
	| expr PLUS_MINUS expr
	| NUMBER;

parents_expr: '(' expr ')';

MUL_DEV: ('*' | '/');

PLUS_MINUS: ('+' | '-');

NUMBER: ('-' | '+')? [0-9]+ ('.' [0-9]+)?;

NEWLINE: '\r'? '\n';

WHITESPACE: [ \t]+ -> skip;

comment: '//' WORD+;

WORD: ALPHABET+;

ALPHABET: [a-zA-Z.,];