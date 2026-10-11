// Generated from c:/Users/andre/repos/antlr-tester/src/AntlrTester.Json/antlr/Json.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_ARRAY=1, END_ARRAY=2, PROPERTY_NAME_START_END=3, BEGIN_OBJECT=4, 
		END_OBJECT=5, NUMBER_VALUE=6, STRING_VALUE=7, NAME_SEPARATOR=8, VALUE_SEPARATOR=9, 
		WS=10;
	public static final int
		RULE_jp_json_base = 0, RULE_jp_object = 1, RULE_jp_object_property = 2, 
		RULE_jp_object_property_key = 3, RULE_jp_object_property_value = 4, RULE_jp_array = 5, 
		RULE_jp_number_array = 6, RULE_jp_string_array = 7, RULE_jp_number_value = 8, 
		RULE_jp_string_value = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"jp_json_base", "jp_object", "jp_object_property", "jp_object_property_key", 
			"jp_object_property_value", "jp_array", "jp_number_array", "jp_string_array", 
			"jp_number_value", "jp_string_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", null, "'{'", "'}'", null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN_ARRAY", "END_ARRAY", "PROPERTY_NAME_START_END", "BEGIN_OBJECT", 
			"END_OBJECT", "NUMBER_VALUE", "STRING_VALUE", "NAME_SEPARATOR", "VALUE_SEPARATOR", 
			"WS"
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
	public String getGrammarFileName() { return "Json.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_json_baseContext extends ParserRuleContext {
		public Jp_objectContext jp_object() {
			return getRuleContext(Jp_objectContext.class,0);
		}
		public Jp_arrayContext jp_array() {
			return getRuleContext(Jp_arrayContext.class,0);
		}
		public Jp_json_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_json_base; }
	}

	public final Jp_json_baseContext jp_json_base() throws RecognitionException {
		Jp_json_baseContext _localctx = new Jp_json_baseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jp_json_base);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN_OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				jp_object();
				}
				break;
			case BEGIN_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				jp_array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_objectContext extends ParserRuleContext {
		public TerminalNode BEGIN_OBJECT() { return getToken(JsonParser.BEGIN_OBJECT, 0); }
		public TerminalNode END_OBJECT() { return getToken(JsonParser.END_OBJECT, 0); }
		public List<Jp_object_propertyContext> jp_object_property() {
			return getRuleContexts(Jp_object_propertyContext.class);
		}
		public Jp_object_propertyContext jp_object_property(int i) {
			return getRuleContext(Jp_object_propertyContext.class,i);
		}
		public List<TerminalNode> VALUE_SEPARATOR() { return getTokens(JsonParser.VALUE_SEPARATOR); }
		public TerminalNode VALUE_SEPARATOR(int i) {
			return getToken(JsonParser.VALUE_SEPARATOR, i);
		}
		public Jp_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_object; }
	}

	public final Jp_objectContext jp_object() throws RecognitionException {
		Jp_objectContext _localctx = new Jp_objectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jp_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(BEGIN_OBJECT);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				jp_object_property();
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE_SEPARATOR) {
					{
					setState(26);
					match(VALUE_SEPARATOR);
					}
				}

				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROPERTY_NAME_START_END );
			setState(33);
			match(END_OBJECT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_object_propertyContext extends ParserRuleContext {
		public Jp_object_property_keyContext jp_object_property_key() {
			return getRuleContext(Jp_object_property_keyContext.class,0);
		}
		public TerminalNode NAME_SEPARATOR() { return getToken(JsonParser.NAME_SEPARATOR, 0); }
		public Jp_object_property_valueContext jp_object_property_value() {
			return getRuleContext(Jp_object_property_valueContext.class,0);
		}
		public Jp_object_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_object_property; }
	}

	public final Jp_object_propertyContext jp_object_property() throws RecognitionException {
		Jp_object_propertyContext _localctx = new Jp_object_propertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jp_object_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			jp_object_property_key();
			setState(36);
			match(NAME_SEPARATOR);
			setState(37);
			jp_object_property_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_object_property_keyContext extends ParserRuleContext {
		public List<TerminalNode> PROPERTY_NAME_START_END() { return getTokens(JsonParser.PROPERTY_NAME_START_END); }
		public TerminalNode PROPERTY_NAME_START_END(int i) {
			return getToken(JsonParser.PROPERTY_NAME_START_END, i);
		}
		public TerminalNode STRING_VALUE() { return getToken(JsonParser.STRING_VALUE, 0); }
		public Jp_object_property_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_object_property_key; }
	}

	public final Jp_object_property_keyContext jp_object_property_key() throws RecognitionException {
		Jp_object_property_keyContext _localctx = new Jp_object_property_keyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jp_object_property_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(PROPERTY_NAME_START_END);
			setState(40);
			match(STRING_VALUE);
			setState(41);
			match(PROPERTY_NAME_START_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_object_property_valueContext extends ParserRuleContext {
		public List<TerminalNode> PROPERTY_NAME_START_END() { return getTokens(JsonParser.PROPERTY_NAME_START_END); }
		public TerminalNode PROPERTY_NAME_START_END(int i) {
			return getToken(JsonParser.PROPERTY_NAME_START_END, i);
		}
		public TerminalNode STRING_VALUE() { return getToken(JsonParser.STRING_VALUE, 0); }
		public Jp_object_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_object_property_value; }
	}

	public final Jp_object_property_valueContext jp_object_property_value() throws RecognitionException {
		Jp_object_property_valueContext _localctx = new Jp_object_property_valueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jp_object_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PROPERTY_NAME_START_END);
			setState(44);
			match(STRING_VALUE);
			setState(45);
			match(PROPERTY_NAME_START_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_arrayContext extends ParserRuleContext {
		public Jp_number_arrayContext jp_number_array() {
			return getRuleContext(Jp_number_arrayContext.class,0);
		}
		public Jp_string_arrayContext jp_string_array() {
			return getRuleContext(Jp_string_arrayContext.class,0);
		}
		public Jp_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_array; }
	}

	public final Jp_arrayContext jp_array() throws RecognitionException {
		Jp_arrayContext _localctx = new Jp_arrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jp_array);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				jp_number_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				jp_string_array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_number_arrayContext extends ParserRuleContext {
		public TerminalNode BEGIN_ARRAY() { return getToken(JsonParser.BEGIN_ARRAY, 0); }
		public TerminalNode END_ARRAY() { return getToken(JsonParser.END_ARRAY, 0); }
		public List<Jp_number_valueContext> jp_number_value() {
			return getRuleContexts(Jp_number_valueContext.class);
		}
		public Jp_number_valueContext jp_number_value(int i) {
			return getRuleContext(Jp_number_valueContext.class,i);
		}
		public Jp_number_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_number_array; }
	}

	public final Jp_number_arrayContext jp_number_array() throws RecognitionException {
		Jp_number_arrayContext _localctx = new Jp_number_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jp_number_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(BEGIN_ARRAY);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				jp_number_value();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER_VALUE );
			setState(57);
			match(END_ARRAY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_string_arrayContext extends ParserRuleContext {
		public TerminalNode BEGIN_ARRAY() { return getToken(JsonParser.BEGIN_ARRAY, 0); }
		public TerminalNode END_ARRAY() { return getToken(JsonParser.END_ARRAY, 0); }
		public List<TerminalNode> PROPERTY_NAME_START_END() { return getTokens(JsonParser.PROPERTY_NAME_START_END); }
		public TerminalNode PROPERTY_NAME_START_END(int i) {
			return getToken(JsonParser.PROPERTY_NAME_START_END, i);
		}
		public List<Jp_string_valueContext> jp_string_value() {
			return getRuleContexts(Jp_string_valueContext.class);
		}
		public Jp_string_valueContext jp_string_value(int i) {
			return getRuleContext(Jp_string_valueContext.class,i);
		}
		public Jp_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_string_array; }
	}

	public final Jp_string_arrayContext jp_string_array() throws RecognitionException {
		Jp_string_arrayContext _localctx = new Jp_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jp_string_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(BEGIN_ARRAY);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				match(PROPERTY_NAME_START_END);
				setState(61);
				jp_string_value();
				setState(62);
				match(PROPERTY_NAME_START_END);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROPERTY_NAME_START_END );
			setState(68);
			match(END_ARRAY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_number_valueContext extends ParserRuleContext {
		public TerminalNode NUMBER_VALUE() { return getToken(JsonParser.NUMBER_VALUE, 0); }
		public Jp_number_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_number_value; }
	}

	public final Jp_number_valueContext jp_number_value() throws RecognitionException {
		Jp_number_valueContext _localctx = new Jp_number_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jp_number_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(NUMBER_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jp_string_valueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(JsonParser.STRING_VALUE, 0); }
		public Jp_string_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jp_string_value; }
	}

	public final Jp_string_valueContext jp_string_value() throws RecognitionException {
		Jp_string_valueContext _localctx = new Jp_string_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jp_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING_VALUE);
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

	public static final String _serializedATN =
		"\u0004\u0001\nK\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0003\u0000\u0017\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001\u0004"+
		"\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u00052\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0004\u00066\b\u0006\u000b\u0006\f\u00067\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007A\b"+
		"\u0007\u000b\u0007\f\u0007B\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0000F\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u0018\u0001"+
		"\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000"+
		"\u0000\u0000\b+\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\f3"+
		"\u0001\u0000\u0000\u0000\u000e;\u0001\u0000\u0000\u0000\u0010F\u0001\u0000"+
		"\u0000\u0000\u0012H\u0001\u0000\u0000\u0000\u0014\u0017\u0003\u0002\u0001"+
		"\u0000\u0015\u0017\u0003\n\u0005\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0001\u0001\u0000\u0000\u0000"+
		"\u0018\u001d\u0005\u0004\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000"+
		"\u001a\u001c\u0005\t\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d"+
		"\u0019\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u0005\u0000\u0000\"\u0003\u0001\u0000\u0000"+
		"\u0000#$\u0003\u0006\u0003\u0000$%\u0005\b\u0000\u0000%&\u0003\b\u0004"+
		"\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000()\u0005"+
		"\u0007\u0000\u0000)*\u0005\u0003\u0000\u0000*\u0007\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0007\u0000\u0000-.\u0005\u0003"+
		"\u0000\u0000.\t\u0001\u0000\u0000\u0000/2\u0003\f\u0006\u000002\u0003"+
		"\u000e\u0007\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u0000"+
		"2\u000b\u0001\u0000\u0000\u000035\u0005\u0001\u0000\u000046\u0003\u0010"+
		"\b\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005"+
		"\u0002\u0000\u0000:\r\u0001\u0000\u0000\u0000;@\u0005\u0001\u0000\u0000"+
		"<=\u0005\u0003\u0000\u0000=>\u0003\u0012\t\u0000>?\u0005\u0003\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0002\u0000\u0000E\u000f\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0006\u0000\u0000G\u0011\u0001\u0000\u0000\u0000HI\u0005\u0007"+
		"\u0000\u0000I\u0013\u0001\u0000\u0000\u0000\u0006\u0016\u001b\u001f17"+
		"B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}