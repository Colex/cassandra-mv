// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g 2013-12-08 22:32:42

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CliLexer extends Lexer {
    public static final int NODE_DESCRIBE=5;
    public static final int NODE_THRIFT_GET_WITH_CONDITIONS=18;
    public static final int NODE_TRACE_NEXT_QUERY=8;
    public static final int TTL=89;
    public static final int TRACE=57;
    public static final int NODE_SHOW_KEYSPACES=15;
    public static final int CONDITION=43;
    public static final int COUNT=80;
    public static final int DecimalDigit=114;
    public static final int EOF=-1;
    public static final int Identifier=86;
    public static final int NODE_UPDATE_COLUMN_FAMILY=29;
    public static final int NODE_CREATE_INDEX_VIEW=36;
    public static final int SingleStringCharacter=106;
    public static final int NODE_USE_TABLE=7;
    public static final int NODE_DEL_KEYSPACE=26;
    public static final int CREATE=69;
    public static final int NODE_CONNECT=4;
    public static final int CONNECT=54;
    public static final int NODE_CREATE_JOIN=35;
    public static final int INCR=77;
    public static final int SingleEscapeCharacter=111;
    public static final int FAMILY=73;
    public static final int GET=76;
    public static final int COMMENT=117;
    public static final int SHOW=65;
    public static final int ARRAY=45;
    public static final int NODE_ADD_KEYSPACE=25;
    public static final int EXIT=63;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int NODE_COLUMNS=50;
    public static final int T__136=136;
    public static final int NODE_THRIFT_DEL=21;
    public static final int VIEW=93;
    public static final int IntegerNegativeLiteral=97;
    public static final int ON=95;
    public static final int COLUMN_FAMILY=48;
    public static final int SEMICOLON=53;
    public static final int NODE_DROP_INDEX=34;
    public static final int KEYSPACES=66;
    public static final int CONDITIONS=44;
    public static final int FILE=101;
    public static final int OF=92;
    public static final int LIST=81;
    public static final int NODE_LIMIT=49;
    public static final int NODE_DESCRIBE_CLUSTER=6;
    public static final int IP_ADDRESS=99;
    public static final int T__126=126;
    public static final int NODE_THRIFT_SET=19;
    public static final int NODE_NO_OP=12;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int NODE_ID_LIST=38;
    public static final int WS=116;
    public static final int T__129=129;
    public static final int ASSUME=83;
    public static final int NODE_THRIFT_COUNT=20;
    public static final int DESCRIBE=62;
    public static final int Alnum=105;
    public static final int QUERY=59;
    public static final int CharacterEscapeSequence=108;
    public static final int NODE_SHOW_CLUSTER_NAME=13;
    public static final int USE=56;
    public static final int NODE_THRIFT_DECR=23;
    public static final int FUNCTION_CALL=42;
    public static final int T__130=130;
    public static final int EscapeSequence=107;
    public static final int Letter=103;
    public static final int DoubleLiteral=98;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int HELP=55;
    public static final int HexEscapeSequence=109;
    public static final int NODE_EXIT=10;
    public static final int LIMIT=102;
    public static final int T__118=118;
    public static final int DEL=79;
    public static final int T__119=119;
    public static final int NODE_SHOW_SCHEMA=16;
    public static final int T__124=124;
    public static final int UPDATE=71;
    public static final int T__123=123;
    public static final int NODE_LIST=30;
    public static final int NODE_UPDATE_KEYSPACE=28;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int NODE_NEW_CF_ACCESS=39;
    public static final int AND=96;
    public static final int CONSISTENCYLEVEL=84;
    public static final int HexDigit=115;
    public static final int QUIT=64;
    public static final int NODE_TRUNCATE=31;
    public static final int INDEX=75;
    public static final int NODE_SHOW_VERSION=14;
    public static final int VIEW2=94;
    public static final int NODE_NEW_KEYSPACE_ACCESS=40;
    public static final int NODE_REVERSED=51;
    public static final int TRUNCATE=82;
    public static final int COLUMN=72;
    public static final int NEXT=58;
    public static final int EscapeCharacter=113;
    public static final int PAIR=47;
    public static final int NODE_CONSISTENCY_LEVEL=33;
    public static final int WITH=88;
    public static final int BY=90;
    public static final int UnicodeEscapeSequence=110;
    public static final int NODE_SET_TRACE_PROBABILITY=9;
    public static final int HASH=46;
    public static final int SET=60;
    public static final int API_VERSION=68;
    public static final int Digit=104;
    public static final int NODE_ASSUME=32;
    public static final int CONVERT_TO_TYPE=41;
    public static final int JOIN=91;
    public static final int NODE_THRIFT_GET=17;
    public static final int NODE_KEY_RANGE=52;
    public static final int NODE_DEL_COLUMN_FAMILY=27;
    public static final int KEYSPACE=70;
    public static final int StringLiteral=87;
    public static final int NODE_HELP=11;
    public static final int IntegerPositiveLiteral=85;
    public static final int CONFIG=100;
    public static final int SCHEMA=67;
    public static final int DROP=74;
    public static final int NonEscapeCharacter=112;
    public static final int DECR=78;
    public static final int NODE_ADD_COLUMN_FAMILY=24;
    public static final int PROBABILITY=61;
    public static final int NODE_THRIFT_INCR=22;
    public static final int NODE_COLUMN_ACCESS=37;

        public void reportError(RecognitionException e) 
        {
            StringBuilder errorMessage = new StringBuilder("Syntax error at position " + e.charPositionInLine + ": ");

            if (e instanceof NoViableAltException)
            {
                int index = e.charPositionInLine;
                String error = this.input.substring(index, index);
                String statement = this.input.substring(0, this.input.size() - 1);

                errorMessage.append("unexpected \"" + error + "\" for `" + statement + "`.");
            }
            else
            {
                errorMessage.append(this.getErrorMessage(e, this.getTokenNames()));
            }

            throw new RuntimeException(errorMessage.toString());
        }


    // delegates
    // delegators

    public CliLexer() {;} 
    public CliLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CliLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g"; }

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:28:8: ( '/' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:28:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:29:8: ( 'CLUSTER' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:29:10: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:30:8: ( 'CLUSTER NAME' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:30:10: 'CLUSTER NAME'
            {
            match("CLUSTER NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:31:8: ( '?' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:31:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:32:8: ( 'AS' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:32:10: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:33:8: ( 'WHERE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:33:10: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:34:8: ( '=' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:34:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:35:8: ( '>' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:35:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:36:8: ( '<' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:36:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:37:8: ( '>=' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:37:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:38:8: ( '<=' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:38:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:39:8: ( '.' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:39:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:40:8: ( '[' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:40:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:41:8: ( ',' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:41:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:42:8: ( ']' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:42:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:43:8: ( '{' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:43:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:44:8: ( '}' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:44:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:45:8: ( ':' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:45:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:46:8: ( 'COLUMNS' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:46:10: 'COLUMNS'
            {
            match("COLUMNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:47:8: ( 'REVERSED' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:47:10: 'REVERSED'
            {
            match("REVERSED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:48:8: ( '(' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:48:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:49:8: ( ')' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:49:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "CONFIG"
    public final void mCONFIG() throws RecognitionException {
        try {
            int _type = CONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:612:7: ( 'CONFIG' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:612:14: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONFIG"

    // $ANTLR start "CONNECT"
    public final void mCONNECT() throws RecognitionException {
        try {
            int _type = CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:613:8: ( 'CONNECT' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:613:14: 'CONNECT'
            {
            match("CONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:614:6: ( 'COUNT' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:614:14: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "DEL"
    public final void mDEL() throws RecognitionException {
        try {
            int _type = DEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:615:4: ( 'DEL' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:615:14: 'DEL'
            {
            match("DEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEL"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:616:9: ( 'DESCRIBE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:616:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:617:4: ( 'USE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:617:14: 'USE'
            {
            match("USE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "TRACE"
    public final void mTRACE() throws RecognitionException {
        try {
            int _type = TRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:618:6: ( 'TRACE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:618:14: 'TRACE'
            {
            match("TRACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRACE"

    // $ANTLR start "PROBABILITY"
    public final void mPROBABILITY() throws RecognitionException {
        try {
            int _type = PROBABILITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:619:12: ( 'PROBABILITY' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:619:14: 'PROBABILITY'
            {
            match("PROBABILITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROBABILITY"

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:620:5: ( 'NEXT' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:620:14: 'NEXT'
            {
            match("NEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXT"

    // $ANTLR start "QUERY"
    public final void mQUERY() throws RecognitionException {
        try {
            int _type = QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:621:6: ( 'QUERY' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:621:14: 'QUERY'
            {
            match("QUERY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUERY"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:622:4: ( 'GET' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:622:14: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "HELP"
    public final void mHELP() throws RecognitionException {
        try {
            int _type = HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:623:5: ( 'HELP' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:623:14: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HELP"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:624:5: ( 'EXIT' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:624:14: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:625:5: ( 'FILE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:625:14: 'FILE'
            {
            match("FILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILE"

    // $ANTLR start "QUIT"
    public final void mQUIT() throws RecognitionException {
        try {
            int _type = QUIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:626:5: ( 'QUIT' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:626:14: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUIT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:627:4: ( 'SET' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:627:14: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "INCR"
    public final void mINCR() throws RecognitionException {
        try {
            int _type = INCR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:628:5: ( 'INCR' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:628:14: 'INCR'
            {
            match("INCR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCR"

    // $ANTLR start "DECR"
    public final void mDECR() throws RecognitionException {
        try {
            int _type = DECR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:629:5: ( 'DECR' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:629:14: 'DECR'
            {
            match("DECR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECR"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:630:5: ( 'SHOW' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:630:14: 'SHOW'
            {
            match("SHOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHOW"

    // $ANTLR start "KEYSPACE"
    public final void mKEYSPACE() throws RecognitionException {
        try {
            int _type = KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:631:9: ( 'KEYSPACE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:631:14: 'KEYSPACE'
            {
            match("KEYSPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSPACE"

    // $ANTLR start "KEYSPACES"
    public final void mKEYSPACES() throws RecognitionException {
        try {
            int _type = KEYSPACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:632:10: ( 'KEYSPACES' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:632:14: 'KEYSPACES'
            {
            match("KEYSPACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSPACES"

    // $ANTLR start "API_VERSION"
    public final void mAPI_VERSION() throws RecognitionException {
        try {
            int _type = API_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:633:12: ( 'API VERSION' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:633:14: 'API VERSION'
            {
            match("API VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "API_VERSION"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:634:7: ( 'CREATE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:634:14: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:635:5: ( 'DROP' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:635:14: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "COLUMN"
    public final void mCOLUMN() throws RecognitionException {
        try {
            int _type = COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:636:7: ( 'COLUMN' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:636:14: 'COLUMN'
            {
            match("COLUMN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLUMN"

    // $ANTLR start "FAMILY"
    public final void mFAMILY() throws RecognitionException {
        try {
            int _type = FAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:637:7: ( 'FAMILY' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:637:14: 'FAMILY'
            {
            match("FAMILY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FAMILY"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:638:5: ( 'WITH' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:638:14: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:639:3: ( 'BY' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:639:14: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:640:4: ( 'AND' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:640:14: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:641:7: ( 'UPDATE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:641:14: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:642:5: ( 'LIST' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:642:14: 'LIST'
            {
            match("LIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:643:6: ( 'LIMIT' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:643:14: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "TRUNCATE"
    public final void mTRUNCATE() throws RecognitionException {
        try {
            int _type = TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:644:9: ( 'TRUNCATE' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:644:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUNCATE"

    // $ANTLR start "ASSUME"
    public final void mASSUME() throws RecognitionException {
        try {
            int _type = ASSUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:645:7: ( 'ASSUME' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:645:14: 'ASSUME'
            {
            match("ASSUME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSUME"

    // $ANTLR start "TTL"
    public final void mTTL() throws RecognitionException {
        try {
            int _type = TTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:646:4: ( 'TTL' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:646:14: 'TTL'
            {
            match("TTL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TTL"

    // $ANTLR start "CONSISTENCYLEVEL"
    public final void mCONSISTENCYLEVEL() throws RecognitionException {
        try {
            int _type = CONSISTENCYLEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:647:17: ( 'CONSISTENCYLEVEL' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:647:21: 'CONSISTENCYLEVEL'
            {
            match("CONSISTENCYLEVEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSISTENCYLEVEL"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:648:6: ( 'INDEX' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:648:14: 'INDEX'
            {
            match("INDEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:649:3: ( 'ON' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:649:14: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:650:7: ( 'SCHEMA' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:650:14: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:653:5: ( 'JOIN' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:653:13: 'JOIN'
            {
            match("JOIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:654:3: ( 'OF' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:654:13: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "VIEW"
    public final void mVIEW() throws RecognitionException {
        try {
            int _type = VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:655:5: ( 'VIEW' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:655:13: 'VIEW'
            {
            match("VIEW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIEW"

    // $ANTLR start "IP_ADDRESS"
    public final void mIP_ADDRESS() throws RecognitionException {
        try {
            int _type = IP_ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:658:5: ( IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:658:7: IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral
            {
            mIntegerPositiveLiteral(); 
            match('.'); 
            mIntegerPositiveLiteral(); 
            match('.'); 
            mIntegerPositiveLiteral(); 
            match('.'); 
            mIntegerPositiveLiteral(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP_ADDRESS"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:664:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:670:5: ( '0' .. '9' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:670:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Alnum"
    public final void mAlnum() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:675:5: ( Letter | Digit )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Alnum"

    // $ANTLR start "IntegerPositiveLiteral"
    public final void mIntegerPositiveLiteral() throws RecognitionException {
        try {
            int _type = IntegerPositiveLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:681:4: ( ( Digit )+ )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:681:6: ( Digit )+
            {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:681:6: ( Digit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:681:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerPositiveLiteral"

    // $ANTLR start "IntegerNegativeLiteral"
    public final void mIntegerNegativeLiteral() throws RecognitionException {
        try {
            int _type = IntegerNegativeLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:685:4: ( '-' ( Digit )+ )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:685:6: '-' ( Digit )+
            {
            match('-'); 
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:685:10: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:685:10: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerNegativeLiteral"

    // $ANTLR start "DoubleLiteral"
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:4: ( ( Digit )+ ( '.' ( Digit )+ )? | ' ' '.' ( Digit )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0==' ') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:6: ( Digit )+ ( '.' ( Digit )+ )?
                    {
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:6: ( Digit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:6: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:13: ( '.' ( Digit )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:14: '.' ( Digit )+
                            {
                            match('.'); 
                            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:18: ( Digit )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:689:18: Digit
                            	    {
                            	    mDigit(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:690:6: ' ' '.' ( Digit )+
                    {
                    match(' '); 
                    match('.'); 
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:690:14: ( Digit )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:690:14: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DoubleLiteral"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:694:5: ( ( Letter | Alnum ) ( Alnum | '_' | '-' )* )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:694:7: ( Letter | Alnum ) ( Alnum | '_' | '-' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:694:24: ( Alnum | '_' | '-' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='-'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:699:5: ( '\\'' ( SingleStringCharacter )* '\\'' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:699:7: '\\'' ( SingleStringCharacter )* '\\''
            {
            match('\''); 
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:699:12: ( SingleStringCharacter )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:699:12: SingleStringCharacter
            	    {
            	    mSingleStringCharacter(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "SingleStringCharacter"
    public final void mSingleStringCharacter() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:703:5: (~ ( '\\'' | '\\\\' ) | '\\\\' EscapeSequence )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='\\') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:703:7: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:704:7: '\\\\' EscapeSequence
                    {
                    match('\\'); 
                    mEscapeSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "SingleStringCharacter"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:708:5: ( CharacterEscapeSequence | '0' | HexEscapeSequence | UnicodeEscapeSequence )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='\u0000' && LA11_0<='/')||(LA11_0>=':' && LA11_0<='t')||(LA11_0>='v' && LA11_0<='w')||(LA11_0>='y' && LA11_0<='\uFFFF')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='0') ) {
                alt11=2;
            }
            else if ( (LA11_0=='x') ) {
                alt11=3;
            }
            else if ( (LA11_0=='u') ) {
                alt11=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:708:7: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:709:7: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 3 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:710:7: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 

                    }
                    break;
                case 4 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:711:7: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "CharacterEscapeSequence"
    public final void mCharacterEscapeSequence() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:715:5: ( SingleEscapeCharacter | NonEscapeCharacter )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"'||LA12_0=='\''||LA12_0=='\\'||LA12_0=='b'||LA12_0=='f'||LA12_0=='n'||LA12_0=='r'||LA12_0=='t'||LA12_0=='v') ) {
                alt12=1;
            }
            else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='/')||(LA12_0>=':' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='a')||(LA12_0>='c' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='q')||LA12_0=='s'||LA12_0=='w'||(LA12_0>='y' && LA12_0<='\uFFFF')) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:715:7: SingleEscapeCharacter
                    {
                    mSingleEscapeCharacter(); 

                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:716:7: NonEscapeCharacter
                    {
                    mNonEscapeCharacter(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "CharacterEscapeSequence"

    // $ANTLR start "NonEscapeCharacter"
    public final void mNonEscapeCharacter() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:720:5: (~ ( EscapeCharacter ) )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:720:7: ~ ( EscapeCharacter )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='a')||(input.LA(1)>='c' && input.LA(1)<='e')||(input.LA(1)>='g' && input.LA(1)<='m')||(input.LA(1)>='o' && input.LA(1)<='q')||input.LA(1)=='s'||input.LA(1)=='w'||(input.LA(1)>='y' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NonEscapeCharacter"

    // $ANTLR start "SingleEscapeCharacter"
    public final void mSingleEscapeCharacter() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:724:5: ( '\\'' | '\"' | '\\\\' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SingleEscapeCharacter"

    // $ANTLR start "EscapeCharacter"
    public final void mEscapeCharacter() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:728:5: ( SingleEscapeCharacter | DecimalDigit | 'x' | 'u' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case '\"':
            case '\'':
            case '\\':
            case 'b':
            case 'f':
            case 'n':
            case 'r':
            case 't':
            case 'v':
                {
                alt13=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt13=2;
                }
                break;
            case 'x':
                {
                alt13=3;
                }
                break;
            case 'u':
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:728:7: SingleEscapeCharacter
                    {
                    mSingleEscapeCharacter(); 

                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:729:7: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 3 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:730:7: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 4 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:731:7: 'u'
                    {
                    match('u'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeCharacter"

    // $ANTLR start "HexEscapeSequence"
    public final void mHexEscapeSequence() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:735:5: ( 'x' HexDigit HexDigit )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:735:7: 'x' HexDigit HexDigit
            {
            match('x'); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HexEscapeSequence"

    // $ANTLR start "UnicodeEscapeSequence"
    public final void mUnicodeEscapeSequence() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:739:5: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:739:7: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscapeSequence"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:5: ( DecimalDigit | ( 'a' .. 'f' ) | ( 'A' .. 'F' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt14=1;
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt14=2;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:7: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:22: ( 'a' .. 'f' )
                    {
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:22: ( 'a' .. 'f' )
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:23: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:35: ( 'A' .. 'F' )
                    {
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:35: ( 'A' .. 'F' )
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:743:36: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "DecimalDigit"
    public final void mDecimalDigit() throws RecognitionException {
        try {
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:747:5: ( ( '0' .. '9' ) )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:747:7: ( '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DecimalDigit"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:755:5: ( ';' )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:755:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:759:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:759:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:763:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='-') ) {
                alt17=1;
            }
            else if ( (LA17_0=='/') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:763:7: '--' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("--"); 

                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:763:12: (~ ( '\\n' | '\\r' ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:763:13: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:764:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:764:12: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='*') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='/') ) {
                                alt16=2;
                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:764:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("*/"); 

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:8: ( T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | CONFIG | CONNECT | COUNT | DEL | DESCRIBE | USE | TRACE | PROBABILITY | NEXT | QUERY | GET | HELP | EXIT | FILE | QUIT | SET | INCR | DECR | SHOW | KEYSPACE | KEYSPACES | API_VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | BY | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | CONSISTENCYLEVEL | INDEX | ON | SCHEMA | JOIN | OF | VIEW | IP_ADDRESS | IntegerPositiveLiteral | IntegerNegativeLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT )
        int alt18=73;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:10: T__118
                {
                mT__118(); 

                }
                break;
            case 2 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:17: T__119
                {
                mT__119(); 

                }
                break;
            case 3 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:24: T__120
                {
                mT__120(); 

                }
                break;
            case 4 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:31: T__121
                {
                mT__121(); 

                }
                break;
            case 5 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:38: T__122
                {
                mT__122(); 

                }
                break;
            case 6 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:45: T__123
                {
                mT__123(); 

                }
                break;
            case 7 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:52: T__124
                {
                mT__124(); 

                }
                break;
            case 8 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:59: T__125
                {
                mT__125(); 

                }
                break;
            case 9 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:66: T__126
                {
                mT__126(); 

                }
                break;
            case 10 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:73: T__127
                {
                mT__127(); 

                }
                break;
            case 11 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:80: T__128
                {
                mT__128(); 

                }
                break;
            case 12 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:87: T__129
                {
                mT__129(); 

                }
                break;
            case 13 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:94: T__130
                {
                mT__130(); 

                }
                break;
            case 14 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:101: T__131
                {
                mT__131(); 

                }
                break;
            case 15 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:108: T__132
                {
                mT__132(); 

                }
                break;
            case 16 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:115: T__133
                {
                mT__133(); 

                }
                break;
            case 17 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:122: T__134
                {
                mT__134(); 

                }
                break;
            case 18 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:129: T__135
                {
                mT__135(); 

                }
                break;
            case 19 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:136: T__136
                {
                mT__136(); 

                }
                break;
            case 20 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:143: T__137
                {
                mT__137(); 

                }
                break;
            case 21 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:150: T__138
                {
                mT__138(); 

                }
                break;
            case 22 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:157: T__139
                {
                mT__139(); 

                }
                break;
            case 23 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:164: CONFIG
                {
                mCONFIG(); 

                }
                break;
            case 24 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:171: CONNECT
                {
                mCONNECT(); 

                }
                break;
            case 25 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:179: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 26 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:185: DEL
                {
                mDEL(); 

                }
                break;
            case 27 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:189: DESCRIBE
                {
                mDESCRIBE(); 

                }
                break;
            case 28 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:198: USE
                {
                mUSE(); 

                }
                break;
            case 29 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:202: TRACE
                {
                mTRACE(); 

                }
                break;
            case 30 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:208: PROBABILITY
                {
                mPROBABILITY(); 

                }
                break;
            case 31 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:220: NEXT
                {
                mNEXT(); 

                }
                break;
            case 32 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:225: QUERY
                {
                mQUERY(); 

                }
                break;
            case 33 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:231: GET
                {
                mGET(); 

                }
                break;
            case 34 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:235: HELP
                {
                mHELP(); 

                }
                break;
            case 35 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:240: EXIT
                {
                mEXIT(); 

                }
                break;
            case 36 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:245: FILE
                {
                mFILE(); 

                }
                break;
            case 37 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:250: QUIT
                {
                mQUIT(); 

                }
                break;
            case 38 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:255: SET
                {
                mSET(); 

                }
                break;
            case 39 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:259: INCR
                {
                mINCR(); 

                }
                break;
            case 40 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:264: DECR
                {
                mDECR(); 

                }
                break;
            case 41 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:269: SHOW
                {
                mSHOW(); 

                }
                break;
            case 42 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:274: KEYSPACE
                {
                mKEYSPACE(); 

                }
                break;
            case 43 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:283: KEYSPACES
                {
                mKEYSPACES(); 

                }
                break;
            case 44 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:293: API_VERSION
                {
                mAPI_VERSION(); 

                }
                break;
            case 45 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:305: CREATE
                {
                mCREATE(); 

                }
                break;
            case 46 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:312: DROP
                {
                mDROP(); 

                }
                break;
            case 47 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:317: COLUMN
                {
                mCOLUMN(); 

                }
                break;
            case 48 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:324: FAMILY
                {
                mFAMILY(); 

                }
                break;
            case 49 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:331: WITH
                {
                mWITH(); 

                }
                break;
            case 50 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:336: BY
                {
                mBY(); 

                }
                break;
            case 51 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:339: AND
                {
                mAND(); 

                }
                break;
            case 52 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:343: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 53 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:350: LIST
                {
                mLIST(); 

                }
                break;
            case 54 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:355: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 55 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:361: TRUNCATE
                {
                mTRUNCATE(); 

                }
                break;
            case 56 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:370: ASSUME
                {
                mASSUME(); 

                }
                break;
            case 57 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:377: TTL
                {
                mTTL(); 

                }
                break;
            case 58 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:381: CONSISTENCYLEVEL
                {
                mCONSISTENCYLEVEL(); 

                }
                break;
            case 59 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:398: INDEX
                {
                mINDEX(); 

                }
                break;
            case 60 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:404: ON
                {
                mON(); 

                }
                break;
            case 61 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:407: SCHEMA
                {
                mSCHEMA(); 

                }
                break;
            case 62 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:414: JOIN
                {
                mJOIN(); 

                }
                break;
            case 63 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:419: OF
                {
                mOF(); 

                }
                break;
            case 64 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:422: VIEW
                {
                mVIEW(); 

                }
                break;
            case 65 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:427: IP_ADDRESS
                {
                mIP_ADDRESS(); 

                }
                break;
            case 66 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:438: IntegerPositiveLiteral
                {
                mIntegerPositiveLiteral(); 

                }
                break;
            case 67 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:461: IntegerNegativeLiteral
                {
                mIntegerNegativeLiteral(); 

                }
                break;
            case 68 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:484: DoubleLiteral
                {
                mDoubleLiteral(); 

                }
                break;
            case 69 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:498: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 70 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:509: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 71 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:523: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 72 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:533: WS
                {
                mWS(); 

                }
                break;
            case 73 :
                // /home/alex/workspace/cassandra-mv/src/java/org/apache/cassandra/cli/Cli.g:1:536: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\55\1\50\1\uffff\2\50\1\uffff\1\67\1\71\7\uffff\1\50\2"+
        "\uffff\22\50\1\124\1\uffff\1\53\6\uffff\3\50\1\137\4\50\4\uffff"+
        "\24\50\1\175\1\50\1\u0080\1\u0081\2\50\2\uffff\1\124\2\uffff\6\50"+
        "\1\uffff\1\50\1\u008e\3\50\1\u0092\3\50\1\u0096\3\50\1\u009a\4\50"+
        "\1\u009f\4\50\1\u00a4\5\50\1\uffff\2\50\2\uffff\2\50\1\130\10\50"+
        "\2\uffff\1\50\1\u00b8\1\50\1\uffff\1\50\1\u00bb\1\u00bc\1\uffff"+
        "\3\50\1\uffff\1\50\1\u00c1\1\50\1\u00c3\1\uffff\1\u00c4\1\u00c5"+
        "\1\u00c6\1\50\1\uffff\1\u00c8\1\50\1\u00ca\2\50\1\u00cd\1\50\1\u00cf"+
        "\1\u00d0\1\uffff\5\50\1\u00d6\2\50\1\u00d9\1\uffff\2\50\2\uffff"+
        "\1\50\1\u00dd\2\50\1\uffff\1\u00e0\4\uffff\1\50\1\uffff\1\50\1\uffff"+
        "\1\u00e3\1\50\1\uffff\1\u00e5\2\uffff\1\50\1\u00e8\1\u00e9\2\50"+
        "\1\uffff\1\u00ec\1\u00ed\1\uffff\2\50\1\u00f0\1\uffff\2\50\1\uffff"+
        "\1\u00f3\1\u00f4\1\uffff\1\50\1\uffff\1\u00f7\1\u00f8\2\uffff\1"+
        "\u00f9\1\50\2\uffff\2\50\1\uffff\2\50\2\uffff\1\50\4\uffff\1\50"+
        "\1\u0101\1\u0102\1\u0103\1\50\1\u0106\1\50\3\uffff\1\50\1\u0109"+
        "\1\uffff\2\50\1\uffff\1\50\1\u010d\1\50\1\uffff\3\50\1\u0112\1\uffff";
    static final String DFA18_eofS =
        "\u0113\uffff";
    static final String DFA18_minS =
        "\1\11\1\52\1\114\1\uffff\1\116\1\110\1\uffff\2\75\7\uffff\1\105"+
        "\2\uffff\1\105\1\120\2\122\1\105\1\125\2\105\1\130\1\101\1\103\1"+
        "\116\1\105\1\131\1\111\1\106\1\117\1\111\2\55\1\56\6\uffff\1\125"+
        "\1\114\1\105\1\55\1\111\1\104\1\105\1\124\4\uffff\1\126\1\103\1"+
        "\117\1\105\1\104\1\101\1\114\1\117\1\130\1\105\1\124\1\114\1\111"+
        "\1\114\1\115\1\124\1\117\1\110\1\103\1\131\1\55\1\115\2\55\1\111"+
        "\1\105\1\uffff\1\60\1\55\2\uffff\1\123\1\125\1\106\1\116\1\101\1"+
        "\125\1\uffff\1\40\1\55\1\122\1\110\1\105\1\55\1\103\1\122\1\120"+
        "\1\55\1\101\1\103\1\116\1\55\1\102\1\124\1\122\1\124\1\55\1\120"+
        "\1\124\1\105\1\111\1\55\1\127\1\105\1\122\1\105\1\123\1\uffff\1"+
        "\124\1\111\2\uffff\1\116\1\127\1\56\1\124\1\115\1\111\1\105\1\111"+
        "\2\124\1\115\2\uffff\1\105\1\55\1\122\1\uffff\1\122\2\55\1\uffff"+
        "\1\124\1\105\1\103\1\uffff\1\101\1\55\1\131\1\55\1\uffff\3\55\1"+
        "\114\1\uffff\1\55\1\115\1\55\1\130\1\120\1\55\1\124\2\55\1\uffff"+
        "\1\105\1\116\1\107\1\103\1\123\1\55\2\105\1\55\1\uffff\1\123\1\111"+
        "\2\uffff\1\105\1\55\1\101\1\102\1\uffff\1\55\4\uffff\1\131\1\uffff"+
        "\1\101\1\uffff\1\55\1\101\1\uffff\1\55\2\uffff\1\122\2\55\2\124"+
        "\1\uffff\2\55\1\uffff\1\105\1\102\1\55\1\uffff\1\124\1\111\1\uffff"+
        "\2\55\1\uffff\1\103\1\uffff\1\40\1\55\2\uffff\1\55\1\105\2\uffff"+
        "\1\104\1\105\1\uffff\1\105\1\114\2\uffff\1\105\4\uffff\1\116\3\55"+
        "\1\111\1\55\1\103\3\uffff\1\124\1\55\1\uffff\2\131\1\uffff\1\114"+
        "\1\55\1\105\1\uffff\1\126\1\105\1\114\1\55\1\uffff";
    static final String DFA18_maxS =
        "\1\175\1\52\1\122\1\uffff\1\123\1\111\1\uffff\2\75\7\uffff\1\105"+
        "\2\uffff\1\122\1\123\1\124\1\122\1\105\1\125\2\105\1\130\1\111\1"+
        "\110\1\116\1\105\1\131\1\111\1\116\1\117\1\111\1\172\1\71\1\56\6"+
        "\uffff\2\125\1\105\1\172\1\111\1\104\1\105\1\124\4\uffff\1\126\1"+
        "\123\1\117\1\105\1\104\1\125\1\114\1\117\1\130\1\111\1\124\1\114"+
        "\1\111\1\114\1\115\1\124\1\117\1\110\1\104\1\131\1\172\1\123\2\172"+
        "\1\111\1\105\1\uffff\1\71\1\172\2\uffff\1\123\1\125\1\123\1\116"+
        "\1\101\1\125\1\uffff\1\40\1\172\1\122\1\110\1\105\1\172\1\103\1"+
        "\122\1\120\1\172\1\101\1\103\1\116\1\172\1\102\1\124\1\122\1\124"+
        "\1\172\1\120\1\124\1\105\1\111\1\172\1\127\1\105\1\122\1\105\1\123"+
        "\1\uffff\1\124\1\111\2\uffff\1\116\1\127\1\71\1\124\1\115\1\111"+
        "\1\105\1\111\2\124\1\115\2\uffff\1\105\1\172\1\122\1\uffff\1\122"+
        "\2\172\1\uffff\1\124\1\105\1\103\1\uffff\1\101\1\172\1\131\1\172"+
        "\1\uffff\3\172\1\114\1\uffff\1\172\1\115\1\172\1\130\1\120\1\172"+
        "\1\124\2\172\1\uffff\1\105\1\116\1\107\1\103\1\123\1\172\2\105\1"+
        "\172\1\uffff\1\123\1\111\2\uffff\1\105\1\172\1\101\1\102\1\uffff"+
        "\1\172\4\uffff\1\131\1\uffff\1\101\1\uffff\1\172\1\101\1\uffff\1"+
        "\172\2\uffff\1\122\2\172\2\124\1\uffff\2\172\1\uffff\1\105\1\102"+
        "\1\172\1\uffff\1\124\1\111\1\uffff\2\172\1\uffff\1\103\1\uffff\2"+
        "\172\2\uffff\1\172\1\105\2\uffff\1\104\1\105\1\uffff\1\105\1\114"+
        "\2\uffff\1\105\4\uffff\1\116\3\172\1\111\1\172\1\103\3\uffff\1\124"+
        "\1\172\1\uffff\2\131\1\uffff\1\114\1\172\1\105\1\uffff\1\126\1\105"+
        "\1\114\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\4\2\uffff\1\7\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1"+
        "\22\1\uffff\1\25\1\26\25\uffff\1\105\1\106\1\107\1\110\1\111\1\1"+
        "\10\uffff\1\12\1\10\1\13\1\11\32\uffff\1\102\2\uffff\1\103\1\104"+
        "\6\uffff\1\5\35\uffff\1\62\2\uffff\1\74\1\77\13\uffff\1\54\1\63"+
        "\3\uffff\1\32\3\uffff\1\34\3\uffff\1\71\4\uffff\1\41\4\uffff\1\46"+
        "\11\uffff\1\101\11\uffff\1\61\2\uffff\1\50\1\56\4\uffff\1\37\1\uffff"+
        "\1\45\1\42\1\43\1\44\1\uffff\1\51\1\uffff\1\47\2\uffff\1\65\1\uffff"+
        "\1\76\1\100\5\uffff\1\31\2\uffff\1\6\3\uffff\1\35\2\uffff\1\40\2"+
        "\uffff\1\73\1\uffff\1\66\2\uffff\1\57\1\27\2\uffff\1\55\1\70\2\uffff"+
        "\1\64\2\uffff\1\60\1\75\1\uffff\1\3\1\2\1\23\1\30\7\uffff\1\24\1"+
        "\33\1\67\2\uffff\1\52\2\uffff\1\53\3\uffff\1\36\4\uffff\1\72";
    static final String DFA18_specialS =
        "\u0113\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\47\6\uffff\1\51\1\21\1\22\2\uffff"+
            "\1\13\1\46\1\11\1\1\12\45\1\17\1\52\1\10\1\6\1\7\1\3\1\uffff"+
            "\1\4\1\40\1\2\1\23\1\33\1\34\1\31\1\32\1\36\1\43\1\37\1\41\1"+
            "\50\1\27\1\42\1\26\1\30\1\20\1\35\1\25\1\24\1\44\1\5\3\50\1"+
            "\12\1\uffff\1\14\3\uffff\32\50\1\15\1\uffff\1\16",
            "\1\54",
            "\1\56\2\uffff\1\57\2\uffff\1\60",
            "",
            "\1\63\1\uffff\1\62\2\uffff\1\61",
            "\1\64\1\65",
            "",
            "\1\66",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "\1\73\14\uffff\1\74",
            "\1\76\2\uffff\1\75",
            "\1\77\1\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\110\7\uffff\1\107",
            "\1\113\1\uffff\1\111\2\uffff\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\50\1\125\1\uffff\12\126\7\uffff\32\50\4\uffff\1\50\1\uffff"+
            "\32\50",
            "\1\54\2\uffff\12\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\1\132\1\uffff\1\133\6\uffff\1\134",
            "\1\135",
            "\1\50\2\uffff\12\50\7\uffff\22\50\1\136\7\50\4\uffff\1\50\1"+
            "\uffff\32\50",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\147\10\uffff\1\145\6\uffff\1\146",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\23\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\3\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\1\173",
            "\1\174",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\177\5\uffff\1\176",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\u0084",
            "\1\50\1\125\1\uffff\12\126\7\uffff\32\50\4\uffff\1\50\1\uffff"+
            "\32\50",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\7\uffff\1\u0088\4\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\1\uffff\12\u0084",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c2",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c7",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c9",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cb",
            "\1\u00cc",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ce",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d7",
            "\1\u00d8",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00da",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e4",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00e6",
            "\1\50\2\uffff\12\50\7\uffff\22\50\1\u00e7\7\50\4\uffff\1\50"+
            "\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00f5",
            "",
            "\1\u00f6\14\uffff\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00fa",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "",
            "\1\u00ff",
            "",
            "",
            "",
            "",
            "\1\u0100",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0104",
            "\1\50\2\uffff\12\50\7\uffff\22\50\1\u0105\7\50\4\uffff\1\50"+
            "\1\uffff\32\50",
            "\1\u0107",
            "",
            "",
            "",
            "\1\u0108",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\50\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | CONFIG | CONNECT | COUNT | DEL | DESCRIBE | USE | TRACE | PROBABILITY | NEXT | QUERY | GET | HELP | EXIT | FILE | QUIT | SET | INCR | DECR | SHOW | KEYSPACE | KEYSPACES | API_VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | BY | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | CONSISTENCYLEVEL | INDEX | ON | SCHEMA | JOIN | OF | VIEW | IP_ADDRESS | IntegerPositiveLiteral | IntegerNegativeLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT );";
        }
    }
 

}