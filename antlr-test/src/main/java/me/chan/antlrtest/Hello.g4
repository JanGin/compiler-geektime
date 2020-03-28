lexer grammar Hello;

//每个词法规则首字母需要大写

//关键字
If:  'if'|'如果';
Int: 'int'|'整形';


IntLiteral: [0-9]+;
//StringLiteral: '"' .*? '"';

StringLiteral: '"' (~["\\\r\n] | EscapeSequence)* '"';
fragment EscapeSequence : '\\' [btnfr"'\\] | '\\' ([0-3]? [0-7])? [0-7] | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit ;
fragment HexDigit : [0-9a-fA-F] ;

AssignmentOP: '=';
RelationalOP: '>'|'大于'|'>='|'大于等于'|'<'|'小于'|'<='|'小于等于';
Star: '*';
Plus: '+';
Sharp: '#';
SemiColon: ';';
Dot: '.';
Comm: ',';
LeftBracket : '[';
RightBracket: ']';
LeftBrace: '{';
RightBrace: '}';
LeftParen: '(';
RightParen: ')';

//变量标识
Id : [a-zA-Z_] ([a-zA-Z_] | [0-9])*;

//空白字符
Whitespace: [ \t]+ -> skip;
Newline: ( '\r' '\n'?|'\n')-> skip;

