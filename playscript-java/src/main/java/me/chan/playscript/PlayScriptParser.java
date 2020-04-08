// Generated from E:/ideaws/compiler-geektime/playscript-java/src/main/java/me/chan/playscript\PlayScript.g4 by ANTLR 4.8

package me.chan.playscript;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, FUNCTION=51, STRING=52, DECIMAL_LITERAL=53, HEX_LITERAL=54, 
		OCT_LITERAL=55, BINARY_LITERAL=56, FLOAT_LITERAL=57, HEX_FLOAT_LITERAL=58, 
		BOOL_LITERAL=59, CHAR_LITERAL=60, STRING_LITERAL=61, NULL_LITERAL=62, 
		LPAREN=63, RPAREN=64, LBRACE=65, RBRACE=66, LBRACK=67, RBRACK=68, SEMI=69, 
		COMMA=70, DOT=71, ASSIGN=72, GT=73, LT=74, BANG=75, TILDE=76, QUESTION=77, 
		COLON=78, EQUAL=79, LE=80, GE=81, NOTEQUAL=82, AND=83, OR=84, INC=85, 
		DEC=86, ADD=87, SUB=88, MUL=89, DIV=90, BITAND=91, BITOR=92, CARET=93, 
		MOD=94, ADD_ASSIGN=95, SUB_ASSIGN=96, MUL_ASSIGN=97, DIV_ASSIGN=98, AND_ASSIGN=99, 
		OR_ASSIGN=100, XOR_ASSIGN=101, MOD_ASSIGN=102, LSHIFT_ASSIGN=103, RSHIFT_ASSIGN=104, 
		URSHIFT_ASSIGN=105, ARROW=106, COLONCOLON=107, AT=108, ELLIPSIS=109, WS=110, 
		COMMENT=111, LINE_COMMENT=112, IDENTIFIER=113, DENTIFIER=114;
	public static final int
		RULE_classDeclaration = 0, RULE_classBody = 1, RULE_classBodyDeclaration = 2, 
		RULE_memberDeclaration = 3, RULE_functionDeclaration = 4, RULE_typeTypeOrVoid = 5, 
		RULE_qualifiedNameList = 6, RULE_qualifiedName = 7, RULE_formalParameterList = 8, 
		RULE_formalParameter = 9, RULE_formalParameters = 10, RULE_lastFormalParameter = 11, 
		RULE_variableModifier = 12, RULE_variableDeclarators = 13, RULE_variableDeclarator = 14, 
		RULE_variableDeclaratorId = 15, RULE_variableInitializer = 16, RULE_arrayInitializer = 17, 
		RULE_classOrInterfaceType = 18, RULE_typeArgument = 19, RULE_fieldDeclaration = 20, 
		RULE_constructorDeclaration = 21, RULE_functionBody = 22, RULE_literal = 23, 
		RULE_integerLiteral = 24, RULE_floatLiteral = 25, RULE_prog = 26, RULE_block = 27, 
		RULE_blockStatements = 28, RULE_blockStatement = 29, RULE_statement = 30, 
		RULE_switchBlockStatementGroup = 31, RULE_switchLabel = 32, RULE_forControl = 33, 
		RULE_forInit = 34, RULE_enhancedForControl = 35, RULE_parExpression = 36, 
		RULE_expressionList = 37, RULE_functionCall = 38, RULE_expression = 39, 
		RULE_primary = 40, RULE_typeList = 41, RULE_typeType = 42, RULE_functionType = 43, 
		RULE_primitiveType = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"classDeclaration", "classBody", "classBodyDeclaration", "memberDeclaration", 
			"functionDeclaration", "typeTypeOrVoid", "qualifiedNameList", "qualifiedName", 
			"formalParameterList", "formalParameter", "formalParameters", "lastFormalParameter", 
			"variableModifier", "variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"fieldDeclaration", "constructorDeclaration", "functionBody", "literal", 
			"integerLiteral", "floatLiteral", "prog", "block", "blockStatements", 
			"blockStatement", "statement", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "forInit", "enhancedForControl", "parExpression", "expressionList", 
			"functionCall", "expression", "primary", "typeList", "typeType", "functionType", 
			"primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'function'", 
			"'string'", null, null, null, null, null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "FUNCTION", 
			"STRING", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
			"FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER", "DENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PlayScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PlayScriptParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(PlayScriptParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(PlayScriptParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CLASS);
			setState(91);
			match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(92);
				match(EXTENDS);
				setState(93);
				typeType();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(96);
				match(IMPLEMENTS);
				setState(97);
				typeList();
				}
			}

			setState(100);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LBRACE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << FUNCTION) | (1L << STRING))) != 0) || _la==SEMI || _la==IDENTIFIER) {
				{
				{
				setState(103);
				classBodyDeclaration();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBodyDeclaration);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(SEMI);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case FUNCTION:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_memberDeclaration);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PlayScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PlayScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PlayScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PlayScriptParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(PlayScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(120);
				typeTypeOrVoid();
				}
				break;
			}
			setState(123);
			match(IDENTIFIER);
			setState(124);
			formalParameters();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(125);
				match(LBRACK);
				setState(126);
				match(RBRACK);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(132);
				match(THROWS);
				setState(133);
				qualifiedNameList();
				}
			}

			setState(136);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PlayScriptParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeTypeOrVoid);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case FUNCTION:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			qualifiedName();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(144);
				qualifiedName();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlayScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlayScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PlayScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PlayScriptParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDENTIFIER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(151);
				match(DOT);
				setState(152);
				match(IDENTIFIER);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				formalParameter();
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159);
						match(COMMA);
						setState(160);
						formalParameter();
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(166);
					match(COMMA);
					setState(167);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(173);
				variableModifier();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			typeType();
			setState(180);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LPAREN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << FUNCTION) | (1L << STRING))) != 0) || _la==IDENTIFIER) {
				{
				setState(183);
				formalParameterList();
				}
			}

			setState(186);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(PlayScriptParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(188);
				variableModifier();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			typeType();
			setState(195);
			match(ELLIPSIS);
			setState(196);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(PlayScriptParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			typeType();
			setState(201);
			variableDeclarator();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				variableDeclarator();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PlayScriptParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			variableDeclaratorId();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(210);
				match(ASSIGN);
				setState(211);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(PlayScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PlayScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PlayScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PlayScriptParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IDENTIFIER);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(215);
				match(LBRACK);
				setState(216);
				match(RBRACK);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				arrayInitializer();
				}
				break;
			case SUPER:
			case THIS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LBRACE);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(227);
				variableInitializer();
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						match(COMMA);
						setState(229);
						variableInitializer();
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(235);
					match(COMMA);
					}
				}

				}
			}

			setState(240);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlayScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlayScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PlayScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PlayScriptParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(IDENTIFIER);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					match(DOT);
					setState(244);
					match(IDENTIFIER);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(PlayScriptParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(PlayScriptParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(PlayScriptParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArgument);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case FUNCTION:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(QUESTION);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(252);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(253);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			variableDeclarators();
			setState(259);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(PlayScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IDENTIFIER);
			setState(262);
			formalParameters();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(263);
				match(THROWS);
				setState(264);
				qualifiedNameList();
				}
			}

			setState(267);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBody);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(PlayScriptParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PlayScriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(PlayScriptParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(PlayScriptParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(PlayScriptParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(PlayScriptParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(PlayScriptParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(PlayScriptParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(PlayScriptParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(PlayScriptParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(LBRACE);
			setState(288);
			blockStatements();
			setState(289);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << FUNCTION) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(291);
				blockStatement();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockStatement);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				variableDeclarators();
				setState(298);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(PlayScriptParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PlayScriptParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(PlayScriptParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(PlayScriptParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(PlayScriptParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public TerminalNode SWITCH() { return getToken(PlayScriptParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(PlayScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(PlayScriptParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(PlayScriptParser.CONTINUE, 0); }
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(IF);
				setState(307);
				parExpression();
				setState(308);
				statement();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(309);
					match(ELSE);
					setState(310);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(FOR);
				setState(314);
				match(LPAREN);
				setState(315);
				forControl();
				setState(316);
				match(RPAREN);
				setState(317);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(WHILE);
				setState(320);
				parExpression();
				setState(321);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(DO);
				setState(324);
				statement();
				setState(325);
				match(WHILE);
				setState(326);
				parExpression();
				setState(327);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				match(SWITCH);
				setState(330);
				parExpression();
				setState(331);
				match(LBRACE);
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(338);
					switchLabel();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(RBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(RETURN);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(347);
					expression(0);
					}
				}

				setState(350);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(351);
				match(BREAK);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(352);
					match(IDENTIFIER);
					}
				}

				setState(355);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(356);
				match(CONTINUE);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(357);
					match(IDENTIFIER);
					}
				}

				setState(360);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(361);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(362);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(363);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(365);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(366);
				match(COLON);
				setState(367);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				switchLabel();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				blockStatement();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << FUNCTION) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(PlayScriptParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(PlayScriptParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchLabel);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(CASE);
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(381);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(382);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(385);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(DEFAULT);
				setState(387);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(PlayScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PlayScriptParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forControl);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << FUNCTION) | (1L << STRING) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(391);
					forInit();
					}
				}

				setState(394);
				match(SEMI);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(395);
					expression(0);
					}
				}

				setState(398);
				match(SEMI);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(399);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forInit);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				variableDeclarators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			typeType();
			setState(409);
			variableDeclaratorId();
			setState(410);
			match(COLON);
			setState(411);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LPAREN);
			setState(414);
			expression(0);
			setState(415);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			expression(0);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				expression(0);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(PlayScriptParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(PlayScriptParser.SUPER, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionCall);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(IDENTIFIER);
				setState(426);
				match(LPAREN);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(427);
					expressionList();
					}
				}

				setState(430);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(THIS);
				setState(432);
				match(LPAREN);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(433);
					expressionList();
					}
				}

				setState(436);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(SUPER);
				setState(438);
				match(LPAREN);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BANG - 75)) | (1L << (TILDE - 75)) | (1L << (INC - 75)) | (1L << (DEC - 75)) | (1L << (ADD - 75)) | (1L << (SUB - 75)) | (1L << (IDENTIFIER - 75)))) != 0)) {
					{
					setState(439);
					expressionList();
					}
				}

				setState(442);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PlayScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PlayScriptParser.SUB, 0); }
		public TerminalNode INC() { return getToken(PlayScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(PlayScriptParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(PlayScriptParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(PlayScriptParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(PlayScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PlayScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayScriptParser.MOD, 0); }
		public TerminalNode EQUAL() { return getToken(PlayScriptParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PlayScriptParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(PlayScriptParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(PlayScriptParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(PlayScriptParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(PlayScriptParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayScriptParser.OR, 0); }
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(PlayScriptParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(PlayScriptParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(PlayScriptParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PlayScriptParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(PlayScriptParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PlayScriptParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(PlayScriptParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(PlayScriptParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(PlayScriptParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(PlayScriptParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(PlayScriptParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(PlayScriptParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PlayScriptParser.MOD_ASSIGN, 0); }
		public TerminalNode DENTIFIER() { return getToken(PlayScriptParser.DENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(PlayScriptParser.THIS, 0); }
		public TerminalNode LBRACK() { return getToken(PlayScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PlayScriptParser.RBRACK, 0); }
		public List<TerminalNode> LT() { return getTokens(PlayScriptParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PlayScriptParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PlayScriptParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PlayScriptParser.GT, i);
		}
		public TerminalNode LE() { return getToken(PlayScriptParser.LE, 0); }
		public TerminalNode GE() { return getToken(PlayScriptParser.GE, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(PlayScriptParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(446);
				primary();
				}
				break;
			case 2:
				{
				setState(447);
				functionCall();
				}
				break;
			case 3:
				{
				setState(448);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INC - 85)) | (1L << (DEC - 85)) | (1L << (ADD - 85)) | (1L << (SUB - 85)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				expression(15);
				}
				break;
			case 4:
				{
				setState(450);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(451);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(455);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(456);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(458);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(459);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(461);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(462);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(464);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(465);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(466);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(467);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(468);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(470);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(471);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(473);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(474);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(475);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(476);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(477);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(479);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(480);
						expression(0);
						setState(481);
						match(COLON);
						setState(482);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(484);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(485);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ADD_ASSIGN - 72)) | (1L << (SUB_ASSIGN - 72)) | (1L << (MUL_ASSIGN - 72)) | (1L << (DIV_ASSIGN - 72)) | (1L << (AND_ASSIGN - 72)) | (1L << (OR_ASSIGN - 72)) | (1L << (XOR_ASSIGN - 72)) | (1L << (MOD_ASSIGN - 72)) | (1L << (LSHIFT_ASSIGN - 72)) | (1L << (RSHIFT_ASSIGN - 72)) | (1L << (URSHIFT_ASSIGN - 72)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(486);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(488);
						((ExpressionContext)_localctx).bop = matchWildcard();
						setState(492);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(489);
							match(DENTIFIER);
							}
							break;
						case 2:
							{
							setState(490);
							functionCall();
							}
							break;
						case 3:
							{
							setState(491);
							match(THIS);
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(494);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(495);
						match(LBRACK);
						setState(496);
						expression(0);
						setState(497);
						match(RBRACK);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(500);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(509);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(502);
							match(LT);
							setState(503);
							match(LT);
							}
							break;
						case 2:
							{
							setState(504);
							match(GT);
							setState(505);
							match(GT);
							setState(506);
							match(GT);
							}
							break;
						case 3:
							{
							setState(507);
							match(GT);
							setState(508);
							match(GT);
							}
							break;
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(511);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(512);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (GT - 73)) | (1L << (LT - 73)) | (1L << (LE - 73)) | (1L << (GE - 73)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(514);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(515);
						typeType();
						}
						break;
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(PlayScriptParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(PlayScriptParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(LPAREN);
				setState(522);
				expression(0);
				setState(523);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				match(SUPER);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			typeType();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(532);
				match(COMMA);
				setState(533);
				typeType();
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PlayScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PlayScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PlayScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PlayScriptParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(539);
				classOrInterfaceType();
				}
				break;
			case FUNCTION:
				{
				setState(540);
				functionType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				{
				setState(541);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(544);
					match(LBRACK);
					setState(545);
					match(RBRACK);
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PlayScriptParser.FUNCTION, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(FUNCTION);
			setState(552);
			typeTypeOrVoid();
			setState(553);
			match(LPAREN);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << FUNCTION) | (1L << STRING))) != 0) || _la==IDENTIFIER) {
				{
				setState(554);
				typeList();
				}
			}

			setState(557);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PlayScriptParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(PlayScriptParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(PlayScriptParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(PlayScriptParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(PlayScriptParser.INT, 0); }
		public TerminalNode LONG() { return getToken(PlayScriptParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(PlayScriptParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(PlayScriptParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(PlayScriptParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 16);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u0234\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\5\2a\n\2\3\2\3\2\5\2e\n\2\3\2\3\2\3\3"+
		"\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\4\3\4\5\4t\n\4\3\5\3\5\3\5\5\5"+
		"y\n\5\3\6\5\6|\n\6\3\6\3\6\3\6\3\6\7\6\u0082\n\6\f\6\16\6\u0085\13\6\3"+
		"\6\3\6\5\6\u0089\n\6\3\6\3\6\3\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\7\b\u0094"+
		"\n\b\f\b\16\b\u0097\13\b\3\t\3\t\3\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t"+
		"\3\n\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\n\3\n\5\n\u00ab\n\n\3"+
		"\n\5\n\u00ae\n\n\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13"+
		"\3\13\3\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00cf\n\17\f\17"+
		"\16\17\u00d2\13\17\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\21\7\21"+
		"\u00dc\n\21\f\21\16\21\u00df\13\21\3\22\3\22\5\22\u00e3\n\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec\13\23\3\23\5\23\u00ef\n\23"+
		"\5\23\u00f1\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb"+
		"\13\24\3\25\3\25\3\25\3\25\5\25\u0101\n\25\5\25\u0103\n\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\27\3\27\3\30\3\30\5\30\u0112"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u011a\n\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\7\36\u0127\n\36\f\36\16\36\u012a\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0132\n\37\3 \3 \3 \3 \3 \3 \5"+
		" \u013a\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \7 \u0150\n \f \16 \u0153\13 \3 \7 \u0156\n \f \16 \u0159\13 \3 \3 \3"+
		" \3 \5 \u015f\n \3 \3 \3 \5 \u0164\n \3 \3 \3 \5 \u0169\n \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0173\n \3!\6!\u0176\n!\r!\16!\u0177\3!\6!\u017b\n!\r"+
		"!\16!\u017c\3\"\3\"\3\"\5\"\u0182\n\"\3\"\3\"\3\"\5\"\u0187\n\"\3#\3#"+
		"\5#\u018b\n#\3#\3#\5#\u018f\n#\3#\3#\5#\u0193\n#\5#\u0195\n#\3$\3$\5$"+
		"\u0199\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u01a7\n\'\f\'\16"+
		"\'\u01aa\13\'\3(\3(\3(\5(\u01af\n(\3(\3(\3(\3(\5(\u01b5\n(\3(\3(\3(\3"+
		"(\5(\u01bb\n(\3(\5(\u01be\n(\3)\3)\3)\3)\3)\3)\3)\5)\u01c7\n)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01ef\n)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0200\n)\3)\3)\3)\3)\3)\7)\u0207\n)\f)\16"+
		")\u020a\13)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0214\n*\3+\3+\3+\7+\u0219\n+\f"+
		"+\16+\u021c\13+\3,\3,\3,\5,\u0221\n,\3,\3,\7,\u0225\n,\f,\16,\u0228\13"+
		",\3-\3-\3-\3-\5-\u022e\n-\3-\3-\3.\3.\3.\2\3P/\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\16\4\2\23\23"+
		"**\3\2\67:\3\2;<\3\2WZ\3\2MN\4\2[\\``\3\2YZ\4\2QQTT\4\2JJak\3\2WX\4\2"+
		"KLRS\13\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\66\66\2\u026d\2\\\3"+
		"\2\2\2\4h\3\2\2\2\6s\3\2\2\2\bx\3\2\2\2\n{\3\2\2\2\f\u008e\3\2\2\2\16"+
		"\u0090\3\2\2\2\20\u0098\3\2\2\2\22\u00ad\3\2\2\2\24\u00b2\3\2\2\2\26\u00b8"+
		"\3\2\2\2\30\u00c1\3\2\2\2\32\u00c8\3\2\2\2\34\u00ca\3\2\2\2\36\u00d3\3"+
		"\2\2\2 \u00d8\3\2\2\2\"\u00e2\3\2\2\2$\u00e4\3\2\2\2&\u00f4\3\2\2\2(\u0102"+
		"\3\2\2\2*\u0104\3\2\2\2,\u0107\3\2\2\2.\u0111\3\2\2\2\60\u0119\3\2\2\2"+
		"\62\u011b\3\2\2\2\64\u011d\3\2\2\2\66\u011f\3\2\2\28\u0121\3\2\2\2:\u0128"+
		"\3\2\2\2<\u0131\3\2\2\2>\u0172\3\2\2\2@\u0175\3\2\2\2B\u0186\3\2\2\2D"+
		"\u0194\3\2\2\2F\u0198\3\2\2\2H\u019a\3\2\2\2J\u019f\3\2\2\2L\u01a3\3\2"+
		"\2\2N\u01bd\3\2\2\2P\u01c6\3\2\2\2R\u0213\3\2\2\2T\u0215\3\2\2\2V\u0220"+
		"\3\2\2\2X\u0229\3\2\2\2Z\u0231\3\2\2\2\\]\7\13\2\2]`\7s\2\2^_\7\23\2\2"+
		"_a\5V,\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2bc\7\32\2\2ce\5T+\2db\3\2\2\2de"+
		"\3\2\2\2ef\3\2\2\2fg\5\4\3\2g\3\3\2\2\2hl\7C\2\2ik\5\6\4\2ji\3\2\2\2k"+
		"n\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7D\2\2p\5\3\2\2\2"+
		"qt\7G\2\2rt\5\b\5\2sq\3\2\2\2sr\3\2\2\2t\7\3\2\2\2uy\5\n\6\2vy\5*\26\2"+
		"wy\5\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\t\3\2\2\2z|\5\f\7\2{z\3\2\2"+
		"\2{|\3\2\2\2|}\3\2\2\2}~\7s\2\2~\u0083\5\26\f\2\177\u0080\7E\2\2\u0080"+
		"\u0082\7F\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087"+
		"\7/\2\2\u0087\u0089\5\16\b\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\5.\30\2\u008b\13\3\2\2\2\u008c\u008f\5V,\2"+
		"\u008d\u008f\7\62\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\r"+
		"\3\2\2\2\u0090\u0095\5\20\t\2\u0091\u0092\7H\2\2\u0092\u0094\5\20\t\2"+
		"\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\17\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009d\7s\2\2\u0099"+
		"\u009a\7I\2\2\u009a\u009c\7s\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\21\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a5\5\24\13\2\u00a1\u00a2\7H\2\2\u00a2\u00a4\5\24\13"+
		"\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7H\2\2\u00a9"+
		"\u00ab\5\30\r\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00ae\5\30\r\2\u00ad\u00a0\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\23\3\2\2\2\u00af\u00b1\5\32\16\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\5V,\2\u00b6\u00b7\5 \21\2\u00b7\25\3\2\2\2"+
		"\u00b8\u00ba\7A\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7B\2\2\u00bd\27\3\2\2\2\u00be"+
		"\u00c0\5\32\16\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\5V,\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\5 \21\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00c9\7\24\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\5V,\2\u00cb\u00d0\5\36\20"+
		"\2\u00cc\u00cd\7H\2\2\u00cd\u00cf\5\36\20\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\35\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\5 \21\2\u00d4\u00d5\7J\2\2\u00d5\u00d7"+
		"\5\"\22\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\37\3\2\2\2\u00d8"+
		"\u00dd\7s\2\2\u00d9\u00da\7E\2\2\u00da\u00dc\7F\2\2\u00db\u00d9\3\2\2"+
		"\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de!"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\5$\23\2\u00e1\u00e3\5P)\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00f0\7C\2\2\u00e5"+
		"\u00ea\5\"\22\2\u00e6\u00e7\7H\2\2\u00e7\u00e9\5\"\22\2\u00e8\u00e6\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7H\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7D\2\2\u00f3%\3\2\2\2\u00f4"+
		"\u00f9\7s\2\2\u00f5\u00f6\7I\2\2\u00f6\u00f8\7s\2\2\u00f7\u00f5\3\2\2"+
		"\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\'"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0103\5V,\2\u00fd\u0100\7O\2\2\u00fe"+
		"\u00ff\t\2\2\2\u00ff\u0101\5V,\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2"+
		"\2\u0101\u0103\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0103)"+
		"\3\2\2\2\u0104\u0105\5\34\17\2\u0105\u0106\7G\2\2\u0106+\3\2\2\2\u0107"+
		"\u0108\7s\2\2\u0108\u010b\5\26\f\2\u0109\u010a\7/\2\2\u010a\u010c\5\16"+
		"\b\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\58\35\2\u010e-\3\2\2\2\u010f\u0112\58\35\2\u0110\u0112\7G\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112/\3\2\2\2\u0113\u011a\5\62\32"+
		"\2\u0114\u011a\5\64\33\2\u0115\u011a\7>\2\2\u0116\u011a\7?\2\2\u0117\u011a"+
		"\7=\2\2\u0118\u011a\7@\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\61\3\2\2\2\u011b\u011c\t\3\2\2\u011c\63\3\2\2\2\u011d\u011e"+
		"\t\4\2\2\u011e\65\3\2\2\2\u011f\u0120\5:\36\2\u0120\67\3\2\2\2\u0121\u0122"+
		"\7C\2\2\u0122\u0123\5:\36\2\u0123\u0124\7D\2\2\u01249\3\2\2\2\u0125\u0127"+
		"\5<\37\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129;\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\5\34\17"+
		"\2\u012c\u012d\7G\2\2\u012d\u0132\3\2\2\2\u012e\u0132\5> \2\u012f\u0132"+
		"\5\n\6\2\u0130\u0132\5\2\2\2\u0131\u012b\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132=\3\2\2\2\u0133\u0173\58\35\2"+
		"\u0134\u0135\7\30\2\2\u0135\u0136\5J&\2\u0136\u0139\5> \2\u0137\u0138"+
		"\7\21\2\2\u0138\u013a\5> \2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0173\3\2\2\2\u013b\u013c\7\27\2\2\u013c\u013d\7A\2\2\u013d\u013e\5D"+
		"#\2\u013e\u013f\7B\2\2\u013f\u0140\5> \2\u0140\u0173\3\2\2\2\u0141\u0142"+
		"\7\64\2\2\u0142\u0143\5J&\2\u0143\u0144\5> \2\u0144\u0173\3\2\2\2\u0145"+
		"\u0146\7\17\2\2\u0146\u0147\5> \2\u0147\u0148\7\64\2\2\u0148\u0149\5J"+
		"&\2\u0149\u014a\7G\2\2\u014a\u0173\3\2\2\2\u014b\u014c\7+\2\2\u014c\u014d"+
		"\5J&\2\u014d\u0151\7C\2\2\u014e\u0150\5@!\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0157\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0154\u0156\5B\"\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7D\2\2\u015b\u0173\3\2\2\2\u015c"+
		"\u015e\7&\2\2\u015d\u015f\5P)\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2"+
		"\2\u015f\u0160\3\2\2\2\u0160\u0173\7G\2\2\u0161\u0163\7\6\2\2\u0162\u0164"+
		"\7s\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0173\7G\2\2\u0166\u0168\7\r\2\2\u0167\u0169\7s\2\2\u0168\u0167\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0173\7G\2\2\u016b\u0173"+
		"\7G\2\2\u016c\u016d\5P)\2\u016d\u016e\7G\2\2\u016e\u0173\3\2\2\2\u016f"+
		"\u0170\7s\2\2\u0170\u0171\7P\2\2\u0171\u0173\5> \2\u0172\u0133\3\2\2\2"+
		"\u0172\u0134\3\2\2\2\u0172\u013b\3\2\2\2\u0172\u0141\3\2\2\2\u0172\u0145"+
		"\3\2\2\2\u0172\u014b\3\2\2\2\u0172\u015c\3\2\2\2\u0172\u0161\3\2\2\2\u0172"+
		"\u0166\3\2\2\2\u0172\u016b\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u016f\3\2"+
		"\2\2\u0173?\3\2\2\2\u0174\u0176\5B\"\2\u0175\u0174\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u017b\5<\37\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017dA\3\2\2\2\u017e\u0181\7\b\2\2\u017f\u0182"+
		"\5P)\2\u0180\u0182\7s\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0187\7P\2\2\u0184\u0185\7\16\2\2\u0185\u0187\7P"+
		"\2\2\u0186\u017e\3\2\2\2\u0186\u0184\3\2\2\2\u0187C\3\2\2\2\u0188\u0195"+
		"\5H%\2\u0189\u018b\5F$\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\7G\2\2\u018d\u018f\5P)\2\u018e\u018d\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\7G\2\2\u0191\u0193"+
		"\5L\'\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0188\3\2\2\2\u0194\u018a\3\2\2\2\u0195E\3\2\2\2\u0196\u0199\5\34\17"+
		"\2\u0197\u0199\5L\'\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199G\3"+
		"\2\2\2\u019a\u019b\5V,\2\u019b\u019c\5 \21\2\u019c\u019d\7P\2\2\u019d"+
		"\u019e\5P)\2\u019eI\3\2\2\2\u019f\u01a0\7A\2\2\u01a0\u01a1\5P)\2\u01a1"+
		"\u01a2\7B\2\2\u01a2K\3\2\2\2\u01a3\u01a8\5P)\2\u01a4\u01a5\7H\2\2\u01a5"+
		"\u01a7\5P)\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9M\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\7s\2\2\u01ac\u01ae\7A\2\2\u01ad\u01af\5L\'\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01be\7B\2\2\u01b1\u01b2\7-\2"+
		"\2\u01b2\u01b4\7A\2\2\u01b3\u01b5\5L\'\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01be\7B\2\2\u01b7\u01b8\7*\2\2\u01b8"+
		"\u01ba\7A\2\2\u01b9\u01bb\5L\'\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2"+
		"\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\7B\2\2\u01bd\u01ab\3\2\2\2\u01bd\u01b1"+
		"\3\2\2\2\u01bd\u01b7\3\2\2\2\u01beO\3\2\2\2\u01bf\u01c0\b)\1\2\u01c0\u01c7"+
		"\5R*\2\u01c1\u01c7\5N(\2\u01c2\u01c3\t\5\2\2\u01c3\u01c7\5P)\21\u01c4"+
		"\u01c5\t\6\2\2\u01c5\u01c7\5P)\20\u01c6\u01bf\3\2\2\2\u01c6\u01c1\3\2"+
		"\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u0208\3\2\2\2\u01c8"+
		"\u01c9\f\17\2\2\u01c9\u01ca\t\7\2\2\u01ca\u0207\5P)\20\u01cb\u01cc\f\16"+
		"\2\2\u01cc\u01cd\t\b\2\2\u01cd\u0207\5P)\17\u01ce\u01cf\f\n\2\2\u01cf"+
		"\u01d0\t\t\2\2\u01d0\u0207\5P)\13\u01d1\u01d2\f\t\2\2\u01d2\u01d3\7]\2"+
		"\2\u01d3\u0207\5P)\n\u01d4\u01d5\f\b\2\2\u01d5\u01d6\7_\2\2\u01d6\u0207"+
		"\5P)\t\u01d7\u01d8\f\7\2\2\u01d8\u01d9\7^\2\2\u01d9\u0207\5P)\b\u01da"+
		"\u01db\f\6\2\2\u01db\u01dc\7U\2\2\u01dc\u0207\5P)\7\u01dd\u01de\f\5\2"+
		"\2\u01de\u01df\7V\2\2\u01df\u0207\5P)\6\u01e0\u01e1\f\4\2\2\u01e1\u01e2"+
		"\7O\2\2\u01e2\u01e3\5P)\2\u01e3\u01e4\7P\2\2\u01e4\u01e5\5P)\5\u01e5\u0207"+
		"\3\2\2\2\u01e6\u01e7\f\3\2\2\u01e7\u01e8\t\n\2\2\u01e8\u0207\5P)\3\u01e9"+
		"\u01ea\f\25\2\2\u01ea\u01ee\13\2\2\2\u01eb\u01ef\7t\2\2\u01ec\u01ef\5"+
		"N(\2\u01ed\u01ef\7-\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u0207\3\2\2\2\u01f0\u01f1\f\24\2\2\u01f1\u01f2\7"+
		"E\2\2\u01f2\u01f3\5P)\2\u01f3\u01f4\7F\2\2\u01f4\u0207\3\2\2\2\u01f5\u01f6"+
		"\f\22\2\2\u01f6\u0207\t\13\2\2\u01f7\u01ff\f\r\2\2\u01f8\u01f9\7L\2\2"+
		"\u01f9\u0200\7L\2\2\u01fa\u01fb\7K\2\2\u01fb\u01fc\7K\2\2\u01fc\u0200"+
		"\7K\2\2\u01fd\u01fe\7K\2\2\u01fe\u0200\7K\2\2\u01ff\u01f8\3\2\2\2\u01ff"+
		"\u01fa\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0207\3\2\2\2\u0201\u0202\f\f"+
		"\2\2\u0202\u0207\t\f\2\2\u0203\u0204\f\13\2\2\u0204\u0205\7\34\2\2\u0205"+
		"\u0207\5V,\2\u0206\u01c8\3\2\2\2\u0206\u01cb\3\2\2\2\u0206\u01ce\3\2\2"+
		"\2\u0206\u01d1\3\2\2\2\u0206\u01d4\3\2\2\2\u0206\u01d7\3\2\2\2\u0206\u01da"+
		"\3\2\2\2\u0206\u01dd\3\2\2\2\u0206\u01e0\3\2\2\2\u0206\u01e6\3\2\2\2\u0206"+
		"\u01e9\3\2\2\2\u0206\u01f0\3\2\2\2\u0206\u01f5\3\2\2\2\u0206\u01f7\3\2"+
		"\2\2\u0206\u0201\3\2\2\2\u0206\u0203\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209Q\3\2\2\2\u020a\u0208\3\2\2\2"+
		"\u020b\u020c\7A\2\2\u020c\u020d\5P)\2\u020d\u020e\7B\2\2\u020e\u0214\3"+
		"\2\2\2\u020f\u0214\7-\2\2\u0210\u0214\7*\2\2\u0211\u0214\5\60\31\2\u0212"+
		"\u0214\7s\2\2\u0213\u020b\3\2\2\2\u0213\u020f\3\2\2\2\u0213\u0210\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214S\3\2\2\2\u0215\u021a"+
		"\5V,\2\u0216\u0217\7H\2\2\u0217\u0219\5V,\2\u0218\u0216\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021bU\3\2\2\2"+
		"\u021c\u021a\3\2\2\2\u021d\u0221\5&\24\2\u021e\u0221\5X-\2\u021f\u0221"+
		"\5Z.\2\u0220\u021d\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221"+
		"\u0226\3\2\2\2\u0222\u0223\7E\2\2\u0223\u0225\7F\2\2\u0224\u0222\3\2\2"+
		"\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227W"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7\65\2\2\u022a\u022b\5\f\7\2"+
		"\u022b\u022d\7A\2\2\u022c\u022e\5T+\2\u022d\u022c\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7B\2\2\u0230Y\3\2\2\2\u0231\u0232"+
		"\t\r\2\2\u0232[\3\2\2\2A`dlsx{\u0083\u0088\u008e\u0095\u009d\u00a5\u00aa"+
		"\u00ad\u00b2\u00ba\u00c1\u00d0\u00d6\u00dd\u00e2\u00ea\u00ee\u00f0\u00f9"+
		"\u0100\u0102\u010b\u0111\u0119\u0128\u0131\u0139\u0151\u0157\u015e\u0163"+
		"\u0168\u0172\u0177\u017c\u0181\u0186\u018a\u018e\u0192\u0194\u0198\u01a8"+
		"\u01ae\u01b4\u01ba\u01bd\u01c6\u01ee\u01ff\u0206\u0208\u0213\u021a\u0220"+
		"\u0226\u022d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}