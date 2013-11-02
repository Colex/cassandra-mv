// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g 2013-10-30 14:10:21

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE", "NODE_DESCRIBE_CLUSTER", "NODE_USE_TABLE", "NODE_TRACE_NEXT_QUERY", "NODE_SET_TRACE_PROBABILITY", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_KEYSPACES", "NODE_SHOW_SCHEMA", "NODE_THRIFT_GET", "NODE_THRIFT_GET_WITH_CONDITIONS", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_THRIFT_INCR", "NODE_THRIFT_DECR", "NODE_ADD_COLUMN_FAMILY", "NODE_ADD_KEYSPACE", "NODE_DEL_KEYSPACE", "NODE_DEL_COLUMN_FAMILY", "NODE_UPDATE_KEYSPACE", "NODE_UPDATE_COLUMN_FAMILY", "NODE_LIST", "NODE_TRUNCATE", "NODE_ASSUME", "NODE_CONSISTENCY_LEVEL", "NODE_DROP_INDEX", "NODE_CREATE_JOIN", "NODE_CREATE_INDEX_VIEW", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "NODE_NEW_CF_ACCESS", "NODE_NEW_KEYSPACE_ACCESS", "CONVERT_TO_TYPE", "FUNCTION_CALL", "CONDITION", "CONDITIONS", "ARRAY", "HASH", "PAIR", "COLUMN_FAMILY", "NODE_LIMIT", "NODE_COLUMNS", "NODE_REVERSED", "NODE_KEY_RANGE", "SEMICOLON", "CONNECT", "HELP", "USE", "TRACE", "NEXT", "QUERY", "SET", "PROBABILITY", "DESCRIBE", "EXIT", "QUIT", "SHOW", "KEYSPACES", "SCHEMA", "API_VERSION", "CREATE", "KEYSPACE", "UPDATE", "COLUMN", "FAMILY", "DROP", "INDEX", "GET", "INCR", "DECR", "DEL", "COUNT", "LIST", "TRUNCATE", "ASSUME", "CONSISTENCYLEVEL", "IntegerPositiveLiteral", "Identifier", "StringLiteral", "WITH", "TTL", "BY", "JOIN", "OF", "VIEW", "VIEW2", "ON", "AND", "IntegerNegativeLiteral", "DoubleLiteral", "IP_ADDRESS", "CONFIG", "FILE", "LIMIT", "Letter", "Digit", "Alnum", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "WS", "COMMENT", "'/'", "'CLUSTER'", "'CLUSTER NAME'", "'?'", "'AS'", "'WHERE'", "'='", "'>'", "'<'", "'>='", "'<='", "'.'", "'['", "','", "']'", "'{'", "'}'", "':'", "'COLUMNS'", "'REVERSED'", "'('", "')'"
    };
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
    public static final int INCR=77;
    public static final int NODE_CREATE_JOIN=35;
    public static final int CONNECT=54;
    public static final int SingleEscapeCharacter=111;
    public static final int FAMILY=73;
    public static final int GET=76;
    public static final int COMMENT=117;
    public static final int SHOW=65;
    public static final int ARRAY=45;
    public static final int NODE_ADD_KEYSPACE=25;
    public static final int T__139=139;
    public static final int EXIT=63;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int NODE_COLUMNS=50;
    public static final int VIEW=93;
    public static final int NODE_THRIFT_DEL=21;
    public static final int IntegerNegativeLiteral=97;
    public static final int ON=95;
    public static final int COLUMN_FAMILY=48;
    public static final int NODE_DROP_INDEX=34;
    public static final int SEMICOLON=53;
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
    public static final int T__122=122;
    public static final int NODE_UPDATE_KEYSPACE=28;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int AND=96;
    public static final int NODE_NEW_CF_ACCESS=39;
    public static final int CONSISTENCYLEVEL=84;
    public static final int HexDigit=115;
    public static final int QUIT=64;
    public static final int INDEX=75;
    public static final int NODE_TRUNCATE=31;
    public static final int NODE_SHOW_VERSION=14;
    public static final int VIEW2=94;
    public static final int NODE_NEW_KEYSPACE_ACCESS=40;
    public static final int NODE_REVERSED=51;
    public static final int TRUNCATE=82;
    public static final int COLUMN=72;
    public static final int EscapeCharacter=113;
    public static final int NEXT=58;
    public static final int PAIR=47;
    public static final int NODE_CONSISTENCY_LEVEL=33;
    public static final int WITH=88;
    public static final int BY=90;
    public static final int UnicodeEscapeSequence=110;
    public static final int NODE_SET_TRACE_PROBABILITY=9;
    public static final int HASH=46;
    public static final int SET=60;
    public static final int Digit=104;
    public static final int API_VERSION=68;
    public static final int NODE_ASSUME=32;
    public static final int CONVERT_TO_TYPE=41;
    public static final int JOIN=91;
    public static final int NODE_THRIFT_GET=17;
    public static final int KEYSPACE=70;
    public static final int NODE_DEL_COLUMN_FAMILY=27;
    public static final int NODE_KEY_RANGE=52;
    public static final int StringLiteral=87;
    public static final int NODE_HELP=11;
    public static final int CONFIG=100;
    public static final int IntegerPositiveLiteral=85;
    public static final int SCHEMA=67;
    public static final int DROP=74;
    public static final int NonEscapeCharacter=112;
    public static final int DECR=78;
    public static final int NODE_ADD_COLUMN_FAMILY=24;
    public static final int PROBABILITY=61;
    public static final int NODE_THRIFT_INCR=22;
    public static final int NODE_COLUMN_ACCESS=37;

    // delegates
    // delegators


        public CliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliParser.tokenNames; }
    public String getGrammarFileName() { return "/home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g"; }


        public void reportError(RecognitionException e) 
        {
            String errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());

            throw new RuntimeException(errorMessage);
        }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:140:1: root : statement ( SEMICOLON )? EOF -> statement ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.statement_return statement1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:140:5: ( statement ( SEMICOLON )? EOF -> statement )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:140:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root476);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:140:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:32: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:142:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | traceNextQuery | setTraceProbability | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | addJoinStatement | addIndexViewStatement | addIndexViewStatement2 | -> ^( NODE_NO_OP ) );
    public final CliParser.statement_return statement() throws RecognitionException {
        CliParser.statement_return retval = new CliParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStatement_return connectStatement4 = null;

        CliParser.exitStatement_return exitStatement5 = null;

        CliParser.countStatement_return countStatement6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.describeCluster_return describeCluster8 = null;

        CliParser.addKeyspace_return addKeyspace9 = null;

        CliParser.addColumnFamily_return addColumnFamily10 = null;

        CliParser.updateKeyspace_return updateKeyspace11 = null;

        CliParser.updateColumnFamily_return updateColumnFamily12 = null;

        CliParser.delColumnFamily_return delColumnFamily13 = null;

        CliParser.delKeyspace_return delKeyspace14 = null;

        CliParser.useKeyspace_return useKeyspace15 = null;

        CliParser.traceNextQuery_return traceNextQuery16 = null;

        CliParser.setTraceProbability_return setTraceProbability17 = null;

        CliParser.delStatement_return delStatement18 = null;

        CliParser.getStatement_return getStatement19 = null;

        CliParser.helpStatement_return helpStatement20 = null;

        CliParser.setStatement_return setStatement21 = null;

        CliParser.incrStatement_return incrStatement22 = null;

        CliParser.showStatement_return showStatement23 = null;

        CliParser.listStatement_return listStatement24 = null;

        CliParser.truncateStatement_return truncateStatement25 = null;

        CliParser.assumeStatement_return assumeStatement26 = null;

        CliParser.consistencyLevelStatement_return consistencyLevelStatement27 = null;

        CliParser.dropIndex_return dropIndex28 = null;

        CliParser.addJoinStatement_return addJoinStatement29 = null;

        CliParser.addIndexViewStatement_return addIndexViewStatement30 = null;

        CliParser.addIndexViewStatement2_return addIndexViewStatement231 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:143:5: ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | traceNextQuery | setTraceProbability | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | addJoinStatement | addIndexViewStatement | addIndexViewStatement2 | -> ^( NODE_NO_OP ) )
            int alt2=29;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:143:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement497);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:144:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement505);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:145:7: countStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStatement_in_statement513);
                    countStatement6=countStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStatement6.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:146:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_statement521);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:147:7: describeCluster
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeCluster_in_statement529);
                    describeCluster8=describeCluster();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeCluster8.getTree());

                    }
                    break;
                case 6 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:148:7: addKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addKeyspace_in_statement537);
                    addKeyspace9=addKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addKeyspace9.getTree());

                    }
                    break;
                case 7 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:149:7: addColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addColumnFamily_in_statement545);
                    addColumnFamily10=addColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addColumnFamily10.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:150:7: updateKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateKeyspace_in_statement553);
                    updateKeyspace11=updateKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateKeyspace11.getTree());

                    }
                    break;
                case 9 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:151:7: updateColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateColumnFamily_in_statement561);
                    updateColumnFamily12=updateColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateColumnFamily12.getTree());

                    }
                    break;
                case 10 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:152:7: delColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delColumnFamily_in_statement569);
                    delColumnFamily13=delColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delColumnFamily13.getTree());

                    }
                    break;
                case 11 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:153:7: delKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delKeyspace_in_statement577);
                    delKeyspace14=delKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delKeyspace14.getTree());

                    }
                    break;
                case 12 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:154:7: useKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useKeyspace_in_statement585);
                    useKeyspace15=useKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useKeyspace15.getTree());

                    }
                    break;
                case 13 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:155:7: traceNextQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_traceNextQuery_in_statement593);
                    traceNextQuery16=traceNextQuery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, traceNextQuery16.getTree());

                    }
                    break;
                case 14 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:156:7: setTraceProbability
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setTraceProbability_in_statement601);
                    setTraceProbability17=setTraceProbability();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setTraceProbability17.getTree());

                    }
                    break;
                case 15 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:157:7: delStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStatement_in_statement609);
                    delStatement18=delStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStatement18.getTree());

                    }
                    break;
                case 16 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:158:7: getStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStatement_in_statement617);
                    getStatement19=getStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStatement19.getTree());

                    }
                    break;
                case 17 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:159:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement625);
                    helpStatement20=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement20.getTree());

                    }
                    break;
                case 18 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:160:7: setStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStatement_in_statement633);
                    setStatement21=setStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStatement21.getTree());

                    }
                    break;
                case 19 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:161:7: incrStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_incrStatement_in_statement641);
                    incrStatement22=incrStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incrStatement22.getTree());

                    }
                    break;
                case 20 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:162:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement649);
                    showStatement23=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement23.getTree());

                    }
                    break;
                case 21 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:163:7: listStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listStatement_in_statement657);
                    listStatement24=listStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listStatement24.getTree());

                    }
                    break;
                case 22 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:164:7: truncateStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_truncateStatement_in_statement665);
                    truncateStatement25=truncateStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, truncateStatement25.getTree());

                    }
                    break;
                case 23 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:165:7: assumeStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assumeStatement_in_statement673);
                    assumeStatement26=assumeStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assumeStatement26.getTree());

                    }
                    break;
                case 24 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:166:7: consistencyLevelStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_consistencyLevelStatement_in_statement681);
                    consistencyLevelStatement27=consistencyLevelStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, consistencyLevelStatement27.getTree());

                    }
                    break;
                case 25 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:167:7: dropIndex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dropIndex_in_statement689);
                    dropIndex28=dropIndex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dropIndex28.getTree());

                    }
                    break;
                case 26 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:170:7: addJoinStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addJoinStatement_in_statement703);
                    addJoinStatement29=addJoinStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addJoinStatement29.getTree());

                    }
                    break;
                case 27 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:171:7: addIndexViewStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addIndexViewStatement_in_statement711);
                    addIndexViewStatement30=addIndexViewStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addIndexViewStatement30.getTree());

                    }
                    break;
                case 28 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:172:7: addIndexViewStatement2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addIndexViewStatement2_in_statement719);
                    addIndexViewStatement231=addIndexViewStatement2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addIndexViewStatement231.getTree());

                    }
                    break;
                case 29 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:174:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 174:7: -> ^( NODE_NO_OP )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:174:10: ^( NODE_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NO_OP, "NODE_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class connectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:177:1: connectStatement : ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) );
    public final CliParser.connectStatement_return connectStatement() throws RecognitionException {
        CliParser.connectStatement_return retval = new CliParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT32=null;
        Token char_literal34=null;
        Token CONNECT38=null;
        Token char_literal40=null;
        CliParser.host_return host33 = null;

        CliParser.port_return port35 = null;

        CliParser.username_return username36 = null;

        CliParser.password_return password37 = null;

        CliParser.ip_address_return ip_address39 = null;

        CliParser.port_return port41 = null;

        CliParser.username_return username42 = null;

        CliParser.password_return password43 = null;


        CommonTree CONNECT32_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree CONNECT38_tree=null;
        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:178:5: ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONNECT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Identifier) ) {
                    alt5=1;
                }
                else if ( (LA5_1==IP_ADDRESS) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:178:7: CONNECT host '/' port ( username password )?
                    {
                    CONNECT32=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT32);

                    pushFollow(FOLLOW_host_in_connectStatement751);
                    host33=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host33.getTree());
                    char_literal34=(Token)match(input,118,FOLLOW_118_in_connectStatement753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal34);

                    pushFollow(FOLLOW_port_in_connectStatement755);
                    port35=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port35.getTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:178:29: ( username password )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:178:30: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement758);
                            username36=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username36.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement760);
                            password37=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password37.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: host, port, password, username
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 179:9: -> ^( NODE_CONNECT host port ( username password )? )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:179:12: ^( NODE_CONNECT host port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:179:37: ( username password )?
                        if ( stream_password.hasNext()||stream_username.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_password.reset();
                        stream_username.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:180:7: CONNECT ip_address '/' port ( username password )?
                    {
                    CONNECT38=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT38);

                    pushFollow(FOLLOW_ip_address_in_connectStatement797);
                    ip_address39=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address39.getTree());
                    char_literal40=(Token)match(input,118,FOLLOW_118_in_connectStatement799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal40);

                    pushFollow(FOLLOW_port_in_connectStatement801);
                    port41=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port41.getTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:180:35: ( username password )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identifier) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:180:36: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement804);
                            username42=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username42.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement806);
                            password43=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password43.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: port, ip_address, username, password
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 181:9: -> ^( NODE_CONNECT ip_address port ( username password )? )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:181:12: ^( NODE_CONNECT ip_address port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:181:43: ( username password )?
                        if ( stream_username.hasNext()||stream_password.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_username.reset();
                        stream_password.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStatement"

    public static class helpStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:184:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP TRACE NEXT QUERY -> ^( NODE_HELP NODE_TRACE_NEXT_QUERY ) | HELP SET TRACE PROBABILITY -> ^( NODE_HELP NODE_SET_TRACE_PROBABILITY ) | HELP DESCRIBE -> ^( NODE_HELP NODE_DESCRIBE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStatement_return helpStatement() throws RecognitionException {
        CliParser.helpStatement_return retval = new CliParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP44=null;
        Token HELP45=null;
        Token HELP46=null;
        Token CONNECT47=null;
        Token HELP48=null;
        Token USE49=null;
        Token HELP50=null;
        Token TRACE51=null;
        Token NEXT52=null;
        Token QUERY53=null;
        Token HELP54=null;
        Token SET55=null;
        Token TRACE56=null;
        Token PROBABILITY57=null;
        Token HELP58=null;
        Token DESCRIBE59=null;
        Token HELP60=null;
        Token DESCRIBE61=null;
        Token string_literal62=null;
        Token HELP63=null;
        Token EXIT64=null;
        Token HELP65=null;
        Token QUIT66=null;
        Token HELP67=null;
        Token SHOW68=null;
        Token string_literal69=null;
        Token HELP70=null;
        Token SHOW71=null;
        Token KEYSPACES72=null;
        Token HELP73=null;
        Token SHOW74=null;
        Token SCHEMA75=null;
        Token HELP76=null;
        Token SHOW77=null;
        Token API_VERSION78=null;
        Token HELP79=null;
        Token CREATE80=null;
        Token KEYSPACE81=null;
        Token HELP82=null;
        Token UPDATE83=null;
        Token KEYSPACE84=null;
        Token HELP85=null;
        Token CREATE86=null;
        Token COLUMN87=null;
        Token FAMILY88=null;
        Token HELP89=null;
        Token UPDATE90=null;
        Token COLUMN91=null;
        Token FAMILY92=null;
        Token HELP93=null;
        Token DROP94=null;
        Token KEYSPACE95=null;
        Token HELP96=null;
        Token DROP97=null;
        Token COLUMN98=null;
        Token FAMILY99=null;
        Token HELP100=null;
        Token DROP101=null;
        Token INDEX102=null;
        Token HELP103=null;
        Token GET104=null;
        Token HELP105=null;
        Token SET106=null;
        Token HELP107=null;
        Token INCR108=null;
        Token HELP109=null;
        Token DECR110=null;
        Token HELP111=null;
        Token DEL112=null;
        Token HELP113=null;
        Token COUNT114=null;
        Token HELP115=null;
        Token LIST116=null;
        Token HELP117=null;
        Token TRUNCATE118=null;
        Token HELP119=null;
        Token ASSUME120=null;
        Token HELP121=null;
        Token CONSISTENCYLEVEL122=null;
        Token HELP123=null;
        Token char_literal124=null;

        CommonTree HELP44_tree=null;
        CommonTree HELP45_tree=null;
        CommonTree HELP46_tree=null;
        CommonTree CONNECT47_tree=null;
        CommonTree HELP48_tree=null;
        CommonTree USE49_tree=null;
        CommonTree HELP50_tree=null;
        CommonTree TRACE51_tree=null;
        CommonTree NEXT52_tree=null;
        CommonTree QUERY53_tree=null;
        CommonTree HELP54_tree=null;
        CommonTree SET55_tree=null;
        CommonTree TRACE56_tree=null;
        CommonTree PROBABILITY57_tree=null;
        CommonTree HELP58_tree=null;
        CommonTree DESCRIBE59_tree=null;
        CommonTree HELP60_tree=null;
        CommonTree DESCRIBE61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree HELP63_tree=null;
        CommonTree EXIT64_tree=null;
        CommonTree HELP65_tree=null;
        CommonTree QUIT66_tree=null;
        CommonTree HELP67_tree=null;
        CommonTree SHOW68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree HELP70_tree=null;
        CommonTree SHOW71_tree=null;
        CommonTree KEYSPACES72_tree=null;
        CommonTree HELP73_tree=null;
        CommonTree SHOW74_tree=null;
        CommonTree SCHEMA75_tree=null;
        CommonTree HELP76_tree=null;
        CommonTree SHOW77_tree=null;
        CommonTree API_VERSION78_tree=null;
        CommonTree HELP79_tree=null;
        CommonTree CREATE80_tree=null;
        CommonTree KEYSPACE81_tree=null;
        CommonTree HELP82_tree=null;
        CommonTree UPDATE83_tree=null;
        CommonTree KEYSPACE84_tree=null;
        CommonTree HELP85_tree=null;
        CommonTree CREATE86_tree=null;
        CommonTree COLUMN87_tree=null;
        CommonTree FAMILY88_tree=null;
        CommonTree HELP89_tree=null;
        CommonTree UPDATE90_tree=null;
        CommonTree COLUMN91_tree=null;
        CommonTree FAMILY92_tree=null;
        CommonTree HELP93_tree=null;
        CommonTree DROP94_tree=null;
        CommonTree KEYSPACE95_tree=null;
        CommonTree HELP96_tree=null;
        CommonTree DROP97_tree=null;
        CommonTree COLUMN98_tree=null;
        CommonTree FAMILY99_tree=null;
        CommonTree HELP100_tree=null;
        CommonTree DROP101_tree=null;
        CommonTree INDEX102_tree=null;
        CommonTree HELP103_tree=null;
        CommonTree GET104_tree=null;
        CommonTree HELP105_tree=null;
        CommonTree SET106_tree=null;
        CommonTree HELP107_tree=null;
        CommonTree INCR108_tree=null;
        CommonTree HELP109_tree=null;
        CommonTree DECR110_tree=null;
        CommonTree HELP111_tree=null;
        CommonTree DEL112_tree=null;
        CommonTree HELP113_tree=null;
        CommonTree COUNT114_tree=null;
        CommonTree HELP115_tree=null;
        CommonTree LIST116_tree=null;
        CommonTree HELP117_tree=null;
        CommonTree TRUNCATE118_tree=null;
        CommonTree HELP119_tree=null;
        CommonTree ASSUME120_tree=null;
        CommonTree HELP121_tree=null;
        CommonTree CONSISTENCYLEVEL122_tree=null;
        CommonTree HELP123_tree=null;
        CommonTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_TRACE=new RewriteRuleTokenStream(adaptor,"token TRACE");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_QUERY=new RewriteRuleTokenStream(adaptor,"token QUERY");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_PROBABILITY=new RewriteRuleTokenStream(adaptor,"token PROBABILITY");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:185:5: ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP TRACE NEXT QUERY -> ^( NODE_HELP NODE_TRACE_NEXT_QUERY ) | HELP SET TRACE PROBABILITY -> ^( NODE_HELP NODE_SET_TRACE_PROBABILITY ) | HELP DESCRIBE -> ^( NODE_HELP NODE_DESCRIBE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt6=32;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:185:7: HELP HELP
                    {
                    HELP44=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP44);

                    HELP45=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:9: -> ^( NODE_HELP NODE_HELP )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:186:12: ^( NODE_HELP NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:187:7: HELP CONNECT
                    {
                    HELP46=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP46);

                    CONNECT47=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:9: -> ^( NODE_HELP NODE_CONNECT )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:188:12: ^( NODE_HELP NODE_CONNECT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:189:7: HELP USE
                    {
                    HELP48=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP48);

                    USE49=(Token)match(input,USE,FOLLOW_USE_in_helpStatement906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(USE49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:9: -> ^( NODE_HELP NODE_USE_TABLE )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:190:12: ^( NODE_HELP NODE_USE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:191:7: HELP TRACE NEXT QUERY
                    {
                    HELP50=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP50);

                    TRACE51=(Token)match(input,TRACE,FOLLOW_TRACE_in_helpStatement933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRACE.add(TRACE51);

                    NEXT52=(Token)match(input,NEXT,FOLLOW_NEXT_in_helpStatement935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT52);

                    QUERY53=(Token)match(input,QUERY,FOLLOW_QUERY_in_helpStatement937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUERY.add(QUERY53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:9: -> ^( NODE_HELP NODE_TRACE_NEXT_QUERY )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:192:12: ^( NODE_HELP NODE_TRACE_NEXT_QUERY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_TRACE_NEXT_QUERY, "NODE_TRACE_NEXT_QUERY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:193:7: HELP SET TRACE PROBABILITY
                    {
                    HELP54=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP54);

                    SET55=(Token)match(input,SET,FOLLOW_SET_in_helpStatement963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET55);

                    TRACE56=(Token)match(input,TRACE,FOLLOW_TRACE_in_helpStatement965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRACE.add(TRACE56);

                    PROBABILITY57=(Token)match(input,PROBABILITY,FOLLOW_PROBABILITY_in_helpStatement967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROBABILITY.add(PROBABILITY57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:9: -> ^( NODE_HELP NODE_SET_TRACE_PROBABILITY )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:194:12: ^( NODE_HELP NODE_SET_TRACE_PROBABILITY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SET_TRACE_PROBABILITY, "NODE_SET_TRACE_PROBABILITY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:195:7: HELP DESCRIBE
                    {
                    HELP58=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP58);

                    DESCRIBE59=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:9: -> ^( NODE_HELP NODE_DESCRIBE )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:196:12: ^( NODE_HELP NODE_DESCRIBE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE, "NODE_DESCRIBE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:197:7: HELP DESCRIBE 'CLUSTER'
                    {
                    HELP60=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP60);

                    DESCRIBE61=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement1019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE61);

                    string_literal62=(Token)match(input,119,FOLLOW_119_in_helpStatement1021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(string_literal62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:9: -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:198:12: ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:199:7: HELP EXIT
                    {
                    HELP63=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP63);

                    EXIT64=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement1047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:200:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:201:7: HELP QUIT
                    {
                    HELP65=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP65);

                    QUIT66=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement1074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:202:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:203:7: HELP SHOW 'CLUSTER NAME'
                    {
                    HELP67=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP67);

                    SHOW68=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW68);

                    string_literal69=(Token)match(input,120,FOLLOW_120_in_helpStatement1103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(string_literal69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:9: -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:204:12: ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:205:7: HELP SHOW KEYSPACES
                    {
                    HELP70=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP70);

                    SHOW71=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW71);

                    KEYSPACES72=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_helpStatement1131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:9: -> ^( NODE_HELP NODE_SHOW_KEYSPACES )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:12: ^( NODE_HELP NODE_SHOW_KEYSPACES )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:207:7: HELP SHOW SCHEMA
                    {
                    HELP73=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP73);

                    SHOW74=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW74);

                    SCHEMA75=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_helpStatement1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCHEMA.add(SCHEMA75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:13: -> ^( NODE_HELP NODE_SHOW_SCHEMA )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:208:16: ^( NODE_HELP NODE_SHOW_SCHEMA )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_SCHEMA, "NODE_SHOW_SCHEMA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:209:7: HELP SHOW API_VERSION
                    {
                    HELP76=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP76);

                    SHOW77=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW77);

                    API_VERSION78=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_helpStatement1192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:9: -> ^( NODE_HELP NODE_SHOW_VERSION )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:210:12: ^( NODE_HELP NODE_SHOW_VERSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:211:7: HELP CREATE KEYSPACE
                    {
                    HELP79=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP79);

                    CREATE80=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE80);

                    KEYSPACE81=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( NODE_HELP NODE_ADD_KEYSPACE )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:212:12: ^( NODE_HELP NODE_ADD_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:213:7: HELP UPDATE KEYSPACE
                    {
                    HELP82=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP82);

                    UPDATE83=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE83);

                    KEYSPACE84=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:214:12: ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:215:7: HELP CREATE COLUMN FAMILY
                    {
                    HELP85=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP85);

                    CREATE86=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE86);

                    COLUMN87=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN87);

                    FAMILY88=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:216:12: ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:217:7: HELP UPDATE COLUMN FAMILY
                    {
                    HELP89=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP89);

                    UPDATE90=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE90);

                    COLUMN91=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN91);

                    FAMILY92=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:218:12: ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:219:7: HELP DROP KEYSPACE
                    {
                    HELP93=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP93);

                    DROP94=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP94);

                    KEYSPACE95=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:9: -> ^( NODE_HELP NODE_DEL_KEYSPACE )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:220:12: ^( NODE_HELP NODE_DEL_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:221:7: HELP DROP COLUMN FAMILY
                    {
                    HELP96=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP96);

                    DROP97=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP97);

                    COLUMN98=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN98);

                    FAMILY99=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:9: -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:222:12: ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:223:7: HELP DROP INDEX
                    {
                    HELP100=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP100);

                    DROP101=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP101);

                    INDEX102=(Token)match(input,INDEX,FOLLOW_INDEX_in_helpStatement1398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INDEX.add(INDEX102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 224:9: -> ^( NODE_HELP NODE_DROP_INDEX )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:224:12: ^( NODE_HELP NODE_DROP_INDEX )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DROP_INDEX, "NODE_DROP_INDEX"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:225:7: HELP GET
                    {
                    HELP103=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP103);

                    GET104=(Token)match(input,GET,FOLLOW_GET_in_helpStatement1424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:9: -> ^( NODE_HELP NODE_THRIFT_GET )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:226:12: ^( NODE_HELP NODE_THRIFT_GET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:227:7: HELP SET
                    {
                    HELP105=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP105);

                    SET106=(Token)match(input,SET,FOLLOW_SET_in_helpStatement1451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:9: -> ^( NODE_HELP NODE_THRIFT_SET )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:228:12: ^( NODE_HELP NODE_THRIFT_SET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:229:7: HELP INCR
                    {
                    HELP107=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP107);

                    INCR108=(Token)match(input,INCR,FOLLOW_INCR_in_helpStatement1478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCR.add(INCR108);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:9: -> ^( NODE_HELP NODE_THRIFT_INCR )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:230:12: ^( NODE_HELP NODE_THRIFT_INCR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_INCR, "NODE_THRIFT_INCR"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:231:7: HELP DECR
                    {
                    HELP109=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP109);

                    DECR110=(Token)match(input,DECR,FOLLOW_DECR_in_helpStatement1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECR.add(DECR110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:9: -> ^( NODE_HELP NODE_THRIFT_DECR )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:232:12: ^( NODE_HELP NODE_THRIFT_DECR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DECR, "NODE_THRIFT_DECR"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:233:7: HELP DEL
                    {
                    HELP111=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP111);

                    DEL112=(Token)match(input,DEL,FOLLOW_DEL_in_helpStatement1530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEL.add(DEL112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:9: -> ^( NODE_HELP NODE_THRIFT_DEL )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:234:12: ^( NODE_HELP NODE_THRIFT_DEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:235:7: HELP COUNT
                    {
                    HELP113=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP113);

                    COUNT114=(Token)match(input,COUNT,FOLLOW_COUNT_in_helpStatement1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COUNT.add(COUNT114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:9: -> ^( NODE_HELP NODE_THRIFT_COUNT )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:236:12: ^( NODE_HELP NODE_THRIFT_COUNT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:237:7: HELP LIST
                    {
                    HELP115=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP115);

                    LIST116=(Token)match(input,LIST,FOLLOW_LIST_in_helpStatement1584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST.add(LIST116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:9: -> ^( NODE_HELP NODE_LIST )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:238:12: ^( NODE_HELP NODE_LIST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:239:7: HELP TRUNCATE
                    {
                    HELP117=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP117);

                    TRUNCATE118=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_helpStatement1611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 240:9: -> ^( NODE_HELP NODE_TRUNCATE )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:240:12: ^( NODE_HELP NODE_TRUNCATE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:241:7: HELP ASSUME
                    {
                    HELP119=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP119);

                    ASSUME120=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_helpStatement1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 242:9: -> ^( NODE_HELP NODE_ASSUME )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:242:12: ^( NODE_HELP NODE_ASSUME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:243:7: HELP CONSISTENCYLEVEL
                    {
                    HELP121=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP121);

                    CONSISTENCYLEVEL122=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_helpStatement1663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 244:9: -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:244:12: ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:245:7: HELP
                    {
                    HELP123=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 246:9: -> ^( NODE_HELP )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:246:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 32 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:247:7: '?'
                    {
                    char_literal124=(Token)match(input,121,FOLLOW_121_in_helpStatement1710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(char_literal124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:9: -> ^( NODE_HELP )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:248:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStatement"

    public static class exitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:251:1: exitStatement : ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStatement_return exitStatement() throws RecognitionException {
        CliParser.exitStatement_return retval = new CliParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT125=null;
        Token EXIT126=null;

        CommonTree QUIT125_tree=null;
        CommonTree EXIT126_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:252:5: ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUIT) ) {
                alt7=1;
            }
            else if ( (LA7_0==EXIT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:252:7: QUIT
                    {
                    QUIT125=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement1745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 252:12: -> ^( NODE_EXIT )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:252:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:253:7: EXIT
                    {
                    EXIT126=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 253:12: -> ^( NODE_EXIT )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:253:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStatement"

    public static class getStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:256:1: getStatement : ( GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? ) );
    public final CliParser.getStatement_return getStatement() throws RecognitionException {
        CliParser.getStatement_return retval = new CliParser.getStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token GET127=null;
        Token string_literal129=null;
        Token string_literal131=null;
        Token GET132=null;
        Token string_literal134=null;
        Token string_literal136=null;
        Token string_literal138=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr128 = null;

        CliParser.typeIdentifier_return typeIdentifier130 = null;

        CliParser.columnFamily_return columnFamily133 = null;

        CliParser.getCondition_return getCondition135 = null;

        CliParser.getCondition_return getCondition137 = null;


        CommonTree limit_tree=null;
        CommonTree GET127_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree GET132_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree string_literal138_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_getCondition=new RewriteRuleSubtreeStream(adaptor,"rule getCondition");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:257:5: ( GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GET) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=IntegerPositiveLiteral && LA12_1<=StringLiteral)||LA12_1==IntegerNegativeLiteral) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==130) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==123) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:257:7: GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    {
                    GET127=(Token)match(input,GET,FOLLOW_GET_in_getStatement1782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET127);

                    pushFollow(FOLLOW_columnFamilyExpr_in_getStatement1784);
                    columnFamilyExpr128=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr128.getTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:257:28: ( 'AS' typeIdentifier )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==122) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:257:29: 'AS' typeIdentifier
                            {
                            string_literal129=(Token)match(input,122,FOLLOW_122_in_getStatement1787); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_122.add(string_literal129);

                            pushFollow(FOLLOW_typeIdentifier_in_getStatement1789);
                            typeIdentifier130=typeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeIdentifier.add(typeIdentifier130.getTree());

                            }
                            break;

                    }

                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:257:51: ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==LIMIT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:257:52: 'LIMIT' limit= IntegerPositiveLiteral
                            {
                            string_literal131=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1794); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal131);

                            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_getStatement1798); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: limit, typeIdentifier, columnFamilyExpr
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 258:9: -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:258:12: ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:258:47: ( ^( CONVERT_TO_TYPE typeIdentifier ) )?
                        if ( stream_typeIdentifier.hasNext() ) {
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:258:49: ^( CONVERT_TO_TYPE typeIdentifier )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONVERT_TO_TYPE, "CONVERT_TO_TYPE"), root_2);

                            adaptor.addChild(root_2, stream_typeIdentifier.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_typeIdentifier.reset();
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:258:86: ( ^( NODE_LIMIT $limit) )?
                        if ( stream_limit.hasNext() ) {
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:258:86: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:259:7: GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    {
                    GET132=(Token)match(input,GET,FOLLOW_GET_in_getStatement1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET132);

                    pushFollow(FOLLOW_columnFamily_in_getStatement1845);
                    columnFamily133=columnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily133.getTree());
                    string_literal134=(Token)match(input,123,FOLLOW_123_in_getStatement1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(string_literal134);

                    pushFollow(FOLLOW_getCondition_in_getStatement1849);
                    getCondition135=getCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_getCondition.add(getCondition135.getTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:259:45: ( 'AND' getCondition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==AND) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:259:46: 'AND' getCondition
                    	    {
                    	    string_literal136=(Token)match(input,AND,FOLLOW_AND_in_getStatement1852); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(string_literal136);

                    	    pushFollow(FOLLOW_getCondition_in_getStatement1854);
                    	    getCondition137=getCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_getCondition.add(getCondition137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:259:67: ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LIMIT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:259:68: 'LIMIT' limit= IntegerPositiveLiteral
                            {
                            string_literal138=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal138);

                            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_getStatement1863); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: limit, getCondition, columnFamily
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 260:9: -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:260:12: ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET_WITH_CONDITIONS, "NODE_THRIFT_GET_WITH_CONDITIONS"), root_1);

                        adaptor.addChild(root_1, stream_columnFamily.nextTree());
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:260:59: ^( CONDITIONS ( getCondition )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITIONS, "CONDITIONS"), root_2);

                        if ( !(stream_getCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_getCondition.hasNext() ) {
                            adaptor.addChild(root_2, stream_getCondition.nextTree());

                        }
                        stream_getCondition.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:260:87: ( ^( NODE_LIMIT $limit) )?
                        if ( stream_limit.hasNext() ) {
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:260:87: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getStatement"

    public static class getCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getCondition"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:263:1: getCondition : columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) ;
    public final CliParser.getCondition_return getCondition() throws RecognitionException {
        CliParser.getCondition_return retval = new CliParser.getCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.columnOrSuperColumn_return columnOrSuperColumn139 = null;

        CliParser.operator_return operator140 = null;

        CliParser.value_return value141 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:264:5: ( columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:264:7: columnOrSuperColumn operator value
            {
            pushFollow(FOLLOW_columnOrSuperColumn_in_getCondition1914);
            columnOrSuperColumn139=columnOrSuperColumn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(columnOrSuperColumn139.getTree());
            pushFollow(FOLLOW_operator_in_getCondition1916);
            operator140=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator140.getTree());
            pushFollow(FOLLOW_value_in_getCondition1918);
            value141=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value141.getTree());


            // AST REWRITE
            // elements: columnOrSuperColumn, operator, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:9: -> ^( CONDITION operator columnOrSuperColumn value )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:265:12: ^( CONDITION operator columnOrSuperColumn value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_operator.nextTree());
                adaptor.addChild(root_1, stream_columnOrSuperColumn.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getCondition"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:268:1: operator : ( '=' | '>' | '<' | '>=' | '<=' );
    public final CliParser.operator_return operator() throws RecognitionException {
        CliParser.operator_return retval = new CliParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set142=null;

        CommonTree set142_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:269:5: ( '=' | '>' | '<' | '>=' | '<=' )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set142=(Token)input.LT(1);
            if ( (input.LA(1)>=124 && input.LA(1)<=128) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set142));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class typeIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdentifier"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:272:1: typeIdentifier : ( Identifier | StringLiteral | IntegerPositiveLiteral );
    public final CliParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CliParser.typeIdentifier_return retval = new CliParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set143=null;

        CommonTree set143_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:273:5: ( Identifier | StringLiteral | IntegerPositiveLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set143=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set143));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"

    public static class setStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:276:1: setStatement : SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) ;
    public final CliParser.setStatement_return setStatement() throws RecognitionException {
        CliParser.setStatement_return retval = new CliParser.setStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ttlValue=null;
        Token SET144=null;
        Token char_literal146=null;
        Token WITH147=null;
        Token TTL148=null;
        Token char_literal149=null;
        CliParser.value_return objectValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr145 = null;


        CommonTree ttlValue_tree=null;
        CommonTree SET144_tree=null;
        CommonTree char_literal146_tree=null;
        CommonTree WITH147_tree=null;
        CommonTree TTL148_tree=null;
        CommonTree char_literal149_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleTokenStream stream_TTL=new RewriteRuleTokenStream(adaptor,"token TTL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:277:5: ( SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:277:7: SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )?
            {
            SET144=(Token)match(input,SET,FOLLOW_SET_in_setStatement2014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET144);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStatement2016);
            columnFamilyExpr145=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr145.getTree());
            char_literal146=(Token)match(input,124,FOLLOW_124_in_setStatement2018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(char_literal146);

            pushFollow(FOLLOW_value_in_setStatement2022);
            objectValue=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(objectValue.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:277:50: ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WITH) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:277:51: WITH TTL '=' ttlValue= IntegerPositiveLiteral
                    {
                    WITH147=(Token)match(input,WITH,FOLLOW_WITH_in_setStatement2025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH147);

                    TTL148=(Token)match(input,TTL,FOLLOW_TTL_in_setStatement2027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TTL.add(TTL148);

                    char_literal149=(Token)match(input,124,FOLLOW_124_in_setStatement2029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(char_literal149);

                    ttlValue=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_setStatement2033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(ttlValue);


                    }
                    break;

            }



            // AST REWRITE
            // elements: objectValue, ttlValue, columnFamilyExpr
            // token labels: ttlValue
            // rule labels: retval, objectValue
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_ttlValue=new RewriteRuleTokenStream(adaptor,"token ttlValue",ttlValue);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_objectValue=new RewriteRuleSubtreeStream(adaptor,"rule objectValue",objectValue!=null?objectValue.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:9: -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:278:12: ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_objectValue.nextTree());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:278:60: ( $ttlValue)?
                if ( stream_ttlValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_ttlValue.nextNode());

                }
                stream_ttlValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setStatement"

    public static class incrStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incrStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:281:1: incrStatement : ( INCR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? ) | DECR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? ) );
    public final CliParser.incrStatement_return incrStatement() throws RecognitionException {
        CliParser.incrStatement_return retval = new CliParser.incrStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INCR150=null;
        Token BY152=null;
        Token DECR153=null;
        Token BY155=null;
        CliParser.incrementValue_return byValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr151 = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr154 = null;


        CommonTree INCR150_tree=null;
        CommonTree BY152_tree=null;
        CommonTree DECR153_tree=null;
        CommonTree BY155_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_incrementValue=new RewriteRuleSubtreeStream(adaptor,"rule incrementValue");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:282:5: ( INCR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? ) | DECR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INCR) ) {
                alt16=1;
            }
            else if ( (LA16_0==DECR) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:282:7: INCR columnFamilyExpr ( BY byValue= incrementValue )?
                    {
                    INCR150=(Token)match(input,INCR,FOLLOW_INCR_in_incrStatement2079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCR.add(INCR150);

                    pushFollow(FOLLOW_columnFamilyExpr_in_incrStatement2081);
                    columnFamilyExpr151=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr151.getTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:282:29: ( BY byValue= incrementValue )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==BY) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:282:30: BY byValue= incrementValue
                            {
                            BY152=(Token)match(input,BY,FOLLOW_BY_in_incrStatement2084); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BY.add(BY152);

                            pushFollow(FOLLOW_incrementValue_in_incrStatement2088);
                            byValue=incrementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incrementValue.add(byValue.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: columnFamilyExpr, byValue
                    // token labels: 
                    // rule labels: retval, byValue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_byValue=new RewriteRuleSubtreeStream(adaptor,"rule byValue",byValue!=null?byValue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 283:9: -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:283:12: ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_INCR, "NODE_THRIFT_INCR"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:283:48: ( $byValue)?
                        if ( stream_byValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_byValue.nextTree());

                        }
                        stream_byValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:284:7: DECR columnFamilyExpr ( BY byValue= incrementValue )?
                    {
                    DECR153=(Token)match(input,DECR,FOLLOW_DECR_in_incrStatement2122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECR.add(DECR153);

                    pushFollow(FOLLOW_columnFamilyExpr_in_incrStatement2124);
                    columnFamilyExpr154=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr154.getTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:284:29: ( BY byValue= incrementValue )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==BY) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:284:30: BY byValue= incrementValue
                            {
                            BY155=(Token)match(input,BY,FOLLOW_BY_in_incrStatement2127); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BY.add(BY155);

                            pushFollow(FOLLOW_incrementValue_in_incrStatement2131);
                            byValue=incrementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incrementValue.add(byValue.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: byValue, columnFamilyExpr
                    // token labels: 
                    // rule labels: retval, byValue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_byValue=new RewriteRuleSubtreeStream(adaptor,"rule byValue",byValue!=null?byValue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 285:9: -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? )
                    {
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:285:12: ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DECR, "NODE_THRIFT_DECR"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:285:48: ( $byValue)?
                        if ( stream_byValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_byValue.nextTree());

                        }
                        stream_byValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incrStatement"

    public static class countStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "countStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:288:1: countStatement : COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStatement_return countStatement() throws RecognitionException {
        CliParser.countStatement_return retval = new CliParser.countStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COUNT156=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr157 = null;


        CommonTree COUNT156_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:289:5: ( COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:289:7: COUNT columnFamilyExpr
            {
            COUNT156=(Token)match(input,COUNT,FOLLOW_COUNT_in_countStatement2174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT156);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStatement2176);
            columnFamilyExpr157=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr157.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 290:9: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:290:12: ^( NODE_THRIFT_COUNT columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "countStatement"

    public static class delStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:293:1: delStatement : DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStatement_return delStatement() throws RecognitionException {
        CliParser.delStatement_return retval = new CliParser.delStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEL158=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr159 = null;


        CommonTree DEL158_tree=null;
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:294:5: ( DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:294:7: DEL columnFamilyExpr
            {
            DEL158=(Token)match(input,DEL,FOLLOW_DEL_in_delStatement2210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEL.add(DEL158);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStatement2212);
            columnFamilyExpr159=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr159.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 295:9: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:295:12: ^( NODE_THRIFT_DEL columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delStatement"

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:298:1: showStatement : ( showClusterName | showVersion | showKeyspaces | showSchema );
    public final CliParser.showStatement_return showStatement() throws RecognitionException {
        CliParser.showStatement_return retval = new CliParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName160 = null;

        CliParser.showVersion_return showVersion161 = null;

        CliParser.showKeyspaces_return showKeyspaces162 = null;

        CliParser.showSchema_return showSchema163 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:299:5: ( showClusterName | showVersion | showKeyspaces | showSchema )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case 120:
                    {
                    alt17=1;
                    }
                    break;
                case API_VERSION:
                    {
                    alt17=2;
                    }
                    break;
                case KEYSPACES:
                    {
                    alt17=3;
                    }
                    break;
                case SCHEMA:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:299:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStatement2246);
                    showClusterName160=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName160.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:300:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStatement2254);
                    showVersion161=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion161.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:301:7: showKeyspaces
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showKeyspaces_in_showStatement2262);
                    showKeyspaces162=showKeyspaces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showKeyspaces162.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:302:7: showSchema
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showSchema_in_showStatement2270);
                    showSchema163=showSchema();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showSchema163.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStatement"

    public static class addJoinStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addJoinStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:306:1: addJoinStatement : CREATE JOIN matView= columnFamily OF famA= columnFamily '.' keyA= rowKey 'AND' famB= columnFamily -> ^( NODE_CREATE_JOIN $matView $famA $keyA $famB) ;
    public final CliParser.addJoinStatement_return addJoinStatement() throws RecognitionException {
        CliParser.addJoinStatement_return retval = new CliParser.addJoinStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE164=null;
        Token JOIN165=null;
        Token OF166=null;
        Token char_literal167=null;
        Token string_literal168=null;
        CliParser.columnFamily_return matView = null;

        CliParser.columnFamily_return famA = null;

        CliParser.rowKey_return keyA = null;

        CliParser.columnFamily_return famB = null;


        CommonTree CREATE164_tree=null;
        CommonTree JOIN165_tree=null;
        CommonTree OF166_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree string_literal168_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:307:5: ( CREATE JOIN matView= columnFamily OF famA= columnFamily '.' keyA= rowKey 'AND' famB= columnFamily -> ^( NODE_CREATE_JOIN $matView $famA $keyA $famB) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:307:7: CREATE JOIN matView= columnFamily OF famA= columnFamily '.' keyA= rowKey 'AND' famB= columnFamily
            {
            CREATE164=(Token)match(input,CREATE,FOLLOW_CREATE_in_addJoinStatement2288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE164);

            JOIN165=(Token)match(input,JOIN,FOLLOW_JOIN_in_addJoinStatement2290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_JOIN.add(JOIN165);

            pushFollow(FOLLOW_columnFamily_in_addJoinStatement2294);
            matView=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(matView.getTree());
            OF166=(Token)match(input,OF,FOLLOW_OF_in_addJoinStatement2296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF166);

            pushFollow(FOLLOW_columnFamily_in_addJoinStatement2300);
            famA=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(famA.getTree());
            char_literal167=(Token)match(input,129,FOLLOW_129_in_addJoinStatement2302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal167);

            pushFollow(FOLLOW_rowKey_in_addJoinStatement2306);
            keyA=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(keyA.getTree());
            string_literal168=(Token)match(input,AND,FOLLOW_AND_in_addJoinStatement2308); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AND.add(string_literal168);

            pushFollow(FOLLOW_columnFamily_in_addJoinStatement2312);
            famB=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(famB.getTree());


            // AST REWRITE
            // elements: matView, famB, keyA, famA
            // token labels: 
            // rule labels: keyA, retval, famA, matView, famB
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_keyA=new RewriteRuleSubtreeStream(adaptor,"rule keyA",keyA!=null?keyA.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_famA=new RewriteRuleSubtreeStream(adaptor,"rule famA",famA!=null?famA.tree:null);
            RewriteRuleSubtreeStream stream_matView=new RewriteRuleSubtreeStream(adaptor,"rule matView",matView!=null?matView.tree:null);
            RewriteRuleSubtreeStream stream_famB=new RewriteRuleSubtreeStream(adaptor,"rule famB",famB!=null?famB.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:9: -> ^( NODE_CREATE_JOIN $matView $famA $keyA $famB)
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:308:12: ^( NODE_CREATE_JOIN $matView $famA $keyA $famB)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CREATE_JOIN, "NODE_CREATE_JOIN"), root_1);

                adaptor.addChild(root_1, stream_matView.nextTree());
                adaptor.addChild(root_1, stream_famA.nextTree());
                adaptor.addChild(root_1, stream_keyA.nextTree());
                adaptor.addChild(root_1, stream_famB.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addJoinStatement"

    public static class addIndexViewStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addIndexViewStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:311:1: addIndexViewStatement : CREATE INDEX VIEW columnFamily OF singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' ( 'AND' singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' )* -> ^( NODE_CREATE_INDEX_VIEW columnFamily ( singleColumnFamilyExpr )+ ( rowKey )+ ) ;
    public final CliParser.addIndexViewStatement_return addIndexViewStatement() throws RecognitionException {
        CliParser.addIndexViewStatement_return retval = new CliParser.addIndexViewStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE169=null;
        Token INDEX170=null;
        Token VIEW171=null;
        Token OF173=null;
        Token char_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token string_literal180=null;
        Token char_literal182=null;
        Token char_literal184=null;
        Token char_literal186=null;
        CliParser.columnFamily_return columnFamily172 = null;

        CliParser.singleColumnFamilyExpr_return singleColumnFamilyExpr174 = null;

        CliParser.rowKey_return rowKey176 = null;

        CliParser.rowKey_return rowKey178 = null;

        CliParser.singleColumnFamilyExpr_return singleColumnFamilyExpr181 = null;

        CliParser.rowKey_return rowKey183 = null;

        CliParser.rowKey_return rowKey185 = null;


        CommonTree CREATE169_tree=null;
        CommonTree INDEX170_tree=null;
        CommonTree VIEW171_tree=null;
        CommonTree OF173_tree=null;
        CommonTree char_literal175_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree string_literal180_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree char_literal184_tree=null;
        CommonTree char_literal186_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_singleColumnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule singleColumnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:5: ( CREATE INDEX VIEW columnFamily OF singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' ( 'AND' singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' )* -> ^( NODE_CREATE_INDEX_VIEW columnFamily ( singleColumnFamilyExpr )+ ( rowKey )+ ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:7: CREATE INDEX VIEW columnFamily OF singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' ( 'AND' singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' )*
            {
            CREATE169=(Token)match(input,CREATE,FOLLOW_CREATE_in_addIndexViewStatement2355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE169);

            INDEX170=(Token)match(input,INDEX,FOLLOW_INDEX_in_addIndexViewStatement2357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDEX.add(INDEX170);

            VIEW171=(Token)match(input,VIEW,FOLLOW_VIEW_in_addIndexViewStatement2359); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VIEW.add(VIEW171);

            pushFollow(FOLLOW_columnFamily_in_addIndexViewStatement2361);
            columnFamily172=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily172.getTree());
            OF173=(Token)match(input,OF,FOLLOW_OF_in_addIndexViewStatement2363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF173);

            pushFollow(FOLLOW_singleColumnFamilyExpr_in_addIndexViewStatement2365);
            singleColumnFamilyExpr174=singleColumnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_singleColumnFamilyExpr.add(singleColumnFamilyExpr174.getTree());
            char_literal175=(Token)match(input,130,FOLLOW_130_in_addIndexViewStatement2367); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(char_literal175);

            pushFollow(FOLLOW_rowKey_in_addIndexViewStatement2369);
            rowKey176=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey176.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:75: ( ',' rowKey )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==131) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:76: ',' rowKey
            	    {
            	    char_literal177=(Token)match(input,131,FOLLOW_131_in_addIndexViewStatement2372); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_131.add(char_literal177);

            	    pushFollow(FOLLOW_rowKey_in_addIndexViewStatement2374);
            	    rowKey178=rowKey();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rowKey.add(rowKey178.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            char_literal179=(Token)match(input,132,FOLLOW_132_in_addIndexViewStatement2378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(char_literal179);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:93: ( 'AND' singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:94: 'AND' singleColumnFamilyExpr '[' rowKey ( ',' rowKey )* ']'
            	    {
            	    string_literal180=(Token)match(input,AND,FOLLOW_AND_in_addIndexViewStatement2381); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(string_literal180);

            	    pushFollow(FOLLOW_singleColumnFamilyExpr_in_addIndexViewStatement2383);
            	    singleColumnFamilyExpr181=singleColumnFamilyExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_singleColumnFamilyExpr.add(singleColumnFamilyExpr181.getTree());
            	    char_literal182=(Token)match(input,130,FOLLOW_130_in_addIndexViewStatement2385); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_130.add(char_literal182);

            	    pushFollow(FOLLOW_rowKey_in_addIndexViewStatement2387);
            	    rowKey183=rowKey();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rowKey.add(rowKey183.getTree());
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:134: ( ',' rowKey )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==131) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:312:135: ',' rowKey
            	    	    {
            	    	    char_literal184=(Token)match(input,131,FOLLOW_131_in_addIndexViewStatement2390); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_131.add(char_literal184);

            	    	    pushFollow(FOLLOW_rowKey_in_addIndexViewStatement2392);
            	    	    rowKey185=rowKey();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_rowKey.add(rowKey185.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    char_literal186=(Token)match(input,132,FOLLOW_132_in_addIndexViewStatement2396); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_132.add(char_literal186);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: rowKey, columnFamily, singleColumnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 313:9: -> ^( NODE_CREATE_INDEX_VIEW columnFamily ( singleColumnFamilyExpr )+ ( rowKey )+ )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:313:12: ^( NODE_CREATE_INDEX_VIEW columnFamily ( singleColumnFamilyExpr )+ ( rowKey )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CREATE_INDEX_VIEW, "NODE_CREATE_INDEX_VIEW"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                if ( !(stream_singleColumnFamilyExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_singleColumnFamilyExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_singleColumnFamilyExpr.nextTree());

                }
                stream_singleColumnFamilyExpr.reset();
                if ( !(stream_rowKey.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rowKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_rowKey.nextTree());

                }
                stream_rowKey.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addIndexViewStatement"

    public static class addIndexViewStatement2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addIndexViewStatement2"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:316:1: addIndexViewStatement2 : CREATE INDEX VIEW2 viewName= columnFamily OF colFam= columnFamily '.' rowKey -> ^( NODE_CREATE_INDEX_VIEW $viewName $colFam rowKey ) ;
    public final CliParser.addIndexViewStatement2_return addIndexViewStatement2() throws RecognitionException {
        CliParser.addIndexViewStatement2_return retval = new CliParser.addIndexViewStatement2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE187=null;
        Token INDEX188=null;
        Token VIEW2189=null;
        Token OF190=null;
        Token char_literal191=null;
        CliParser.columnFamily_return viewName = null;

        CliParser.columnFamily_return colFam = null;

        CliParser.rowKey_return rowKey192 = null;


        CommonTree CREATE187_tree=null;
        CommonTree INDEX188_tree=null;
        CommonTree VIEW2189_tree=null;
        CommonTree OF190_tree=null;
        CommonTree char_literal191_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_VIEW2=new RewriteRuleTokenStream(adaptor,"token VIEW2");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:317:2: ( CREATE INDEX VIEW2 viewName= columnFamily OF colFam= columnFamily '.' rowKey -> ^( NODE_CREATE_INDEX_VIEW $viewName $colFam rowKey ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:317:4: CREATE INDEX VIEW2 viewName= columnFamily OF colFam= columnFamily '.' rowKey
            {
            CREATE187=(Token)match(input,CREATE,FOLLOW_CREATE_in_addIndexViewStatement22434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE187);

            INDEX188=(Token)match(input,INDEX,FOLLOW_INDEX_in_addIndexViewStatement22436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDEX.add(INDEX188);

            VIEW2189=(Token)match(input,VIEW2,FOLLOW_VIEW2_in_addIndexViewStatement22438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VIEW2.add(VIEW2189);

            pushFollow(FOLLOW_columnFamily_in_addIndexViewStatement22442);
            viewName=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(viewName.getTree());
            OF190=(Token)match(input,OF,FOLLOW_OF_in_addIndexViewStatement22444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF190);

            pushFollow(FOLLOW_columnFamily_in_addIndexViewStatement22448);
            colFam=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(colFam.getTree());
            char_literal191=(Token)match(input,129,FOLLOW_129_in_addIndexViewStatement22450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal191);

            pushFollow(FOLLOW_rowKey_in_addIndexViewStatement22452);
            rowKey192=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey192.getTree());


            // AST REWRITE
            // elements: rowKey, colFam, viewName
            // token labels: 
            // rule labels: retval, viewName, colFam
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_viewName=new RewriteRuleSubtreeStream(adaptor,"rule viewName",viewName!=null?viewName.tree:null);
            RewriteRuleSubtreeStream stream_colFam=new RewriteRuleSubtreeStream(adaptor,"rule colFam",colFam!=null?colFam.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 318:3: -> ^( NODE_CREATE_INDEX_VIEW $viewName $colFam rowKey )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:318:6: ^( NODE_CREATE_INDEX_VIEW $viewName $colFam rowKey )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CREATE_INDEX_VIEW, "NODE_CREATE_INDEX_VIEW"), root_1);

                adaptor.addChild(root_1, stream_viewName.nextTree());
                adaptor.addChild(root_1, stream_colFam.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addIndexViewStatement2"

    public static class listStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:321:1: listStatement : LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? ) ;
    public final CliParser.listStatement_return listStatement() throws RecognitionException {
        CliParser.listStatement_return retval = new CliParser.listStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LIST193=null;
        CliParser.columnFamily_return columnFamily194 = null;

        CliParser.keyRangeExpr_return keyRangeExpr195 = null;

        CliParser.rowLimitExpr_return rowLimitExpr196 = null;

        CliParser.columnLimitExpr_return columnLimitExpr197 = null;


        CommonTree LIST193_tree=null;
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleSubtreeStream stream_rowLimitExpr=new RewriteRuleSubtreeStream(adaptor,"rule rowLimitExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_columnLimitExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnLimitExpr");
        RewriteRuleSubtreeStream stream_keyRangeExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyRangeExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:322:5: ( LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:322:7: LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )?
            {
            LIST193=(Token)match(input,LIST,FOLLOW_LIST_in_listStatement2482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIST.add(LIST193);

            pushFollow(FOLLOW_columnFamily_in_listStatement2484);
            columnFamily194=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily194.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:322:25: ( keyRangeExpr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==130) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: keyRangeExpr
                    {
                    pushFollow(FOLLOW_keyRangeExpr_in_listStatement2486);
                    keyRangeExpr195=keyRangeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyRangeExpr.add(keyRangeExpr195.getTree());

                    }
                    break;

            }

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:322:39: ( rowLimitExpr )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LIMIT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: rowLimitExpr
                    {
                    pushFollow(FOLLOW_rowLimitExpr_in_listStatement2489);
                    rowLimitExpr196=rowLimitExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rowLimitExpr.add(rowLimitExpr196.getTree());

                    }
                    break;

            }

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:322:53: ( columnLimitExpr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==136) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: columnLimitExpr
                    {
                    pushFollow(FOLLOW_columnLimitExpr_in_listStatement2492);
                    columnLimitExpr197=columnLimitExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnLimitExpr.add(columnLimitExpr197.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: columnLimitExpr, keyRangeExpr, rowLimitExpr, columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 323:9: -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:323:12: ^( NODE_LIST columnFamily ( keyRangeExpr )? ( rowLimitExpr )? ( columnLimitExpr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:323:37: ( keyRangeExpr )?
                if ( stream_keyRangeExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyRangeExpr.nextTree());

                }
                stream_keyRangeExpr.reset();
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:323:51: ( rowLimitExpr )?
                if ( stream_rowLimitExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_rowLimitExpr.nextTree());

                }
                stream_rowLimitExpr.reset();
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:323:65: ( columnLimitExpr )?
                if ( stream_columnLimitExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnLimitExpr.nextTree());

                }
                stream_columnLimitExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listStatement"

    public static class truncateStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "truncateStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:326:1: truncateStatement : TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) ;
    public final CliParser.truncateStatement_return truncateStatement() throws RecognitionException {
        CliParser.truncateStatement_return retval = new CliParser.truncateStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUNCATE198=null;
        CliParser.columnFamily_return columnFamily199 = null;


        CommonTree TRUNCATE198_tree=null;
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:327:5: ( TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:327:7: TRUNCATE columnFamily
            {
            TRUNCATE198=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_truncateStatement2535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE198);

            pushFollow(FOLLOW_columnFamily_in_truncateStatement2537);
            columnFamily199=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily199.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 328:9: -> ^( NODE_TRUNCATE columnFamily )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:328:12: ^( NODE_TRUNCATE columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "truncateStatement"

    public static class assumeStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assumeStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:331:1: assumeStatement : ASSUME columnFamily assumptionElement= Identifier 'AS' entityName -> ^( NODE_ASSUME columnFamily $assumptionElement entityName ) ;
    public final CliParser.assumeStatement_return assumeStatement() throws RecognitionException {
        CliParser.assumeStatement_return retval = new CliParser.assumeStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token assumptionElement=null;
        Token ASSUME200=null;
        Token string_literal202=null;
        CliParser.columnFamily_return columnFamily201 = null;

        CliParser.entityName_return entityName203 = null;


        CommonTree assumptionElement_tree=null;
        CommonTree ASSUME200_tree=null;
        CommonTree string_literal202_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:332:5: ( ASSUME columnFamily assumptionElement= Identifier 'AS' entityName -> ^( NODE_ASSUME columnFamily $assumptionElement entityName ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:332:7: ASSUME columnFamily assumptionElement= Identifier 'AS' entityName
            {
            ASSUME200=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStatement2570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME200);

            pushFollow(FOLLOW_columnFamily_in_assumeStatement2572);
            columnFamily201=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily201.getTree());
            assumptionElement=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement2576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(assumptionElement);

            string_literal202=(Token)match(input,122,FOLLOW_122_in_assumeStatement2578); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(string_literal202);

            pushFollow(FOLLOW_entityName_in_assumeStatement2580);
            entityName203=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_entityName.add(entityName203.getTree());


            // AST REWRITE
            // elements: columnFamily, entityName, assumptionElement
            // token labels: assumptionElement
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_assumptionElement=new RewriteRuleTokenStream(adaptor,"token assumptionElement",assumptionElement);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 333:9: -> ^( NODE_ASSUME columnFamily $assumptionElement entityName )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:333:12: ^( NODE_ASSUME columnFamily $assumptionElement entityName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_assumptionElement.nextNode());
                adaptor.addChild(root_1, stream_entityName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assumeStatement"

    public static class consistencyLevelStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consistencyLevelStatement"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:336:1: consistencyLevelStatement : CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) ;
    public final CliParser.consistencyLevelStatement_return consistencyLevelStatement() throws RecognitionException {
        CliParser.consistencyLevelStatement_return retval = new CliParser.consistencyLevelStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token defaultType=null;
        Token CONSISTENCYLEVEL204=null;
        Token string_literal205=null;

        CommonTree defaultType_tree=null;
        CommonTree CONSISTENCYLEVEL204_tree=null;
        CommonTree string_literal205_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:337:5: ( CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:337:7: CONSISTENCYLEVEL 'AS' defaultType= Identifier
            {
            CONSISTENCYLEVEL204=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement2618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL204);

            string_literal205=(Token)match(input,122,FOLLOW_122_in_consistencyLevelStatement2620); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(string_literal205);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_consistencyLevelStatement2624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: defaultType
            // token labels: defaultType
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 338:9: -> ^( NODE_CONSISTENCY_LEVEL $defaultType)
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:338:12: ^( NODE_CONSISTENCY_LEVEL $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"), root_1);

                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consistencyLevelStatement"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:341:1: showClusterName : SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW206=null;
        Token string_literal207=null;

        CommonTree SHOW206_tree=null;
        CommonTree string_literal207_tree=null;
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:342:5: ( SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:342:7: SHOW 'CLUSTER NAME'
            {
            SHOW206=(Token)match(input,SHOW,FOLLOW_SHOW_in_showClusterName2658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW206);

            string_literal207=(Token)match(input,120,FOLLOW_120_in_showClusterName2660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(string_literal207);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:9: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:343:12: ^( NODE_SHOW_CLUSTER_NAME )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showClusterName"

    public static class addKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addKeyspace"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:346:1: addKeyspace : CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.addKeyspace_return addKeyspace() throws RecognitionException {
        CliParser.addKeyspace_return retval = new CliParser.addKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE208=null;
        Token KEYSPACE209=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr210 = null;


        CommonTree CREATE208_tree=null;
        CommonTree KEYSPACE209_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:347:5: ( CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:347:7: CREATE KEYSPACE keyValuePairExpr
            {
            CREATE208=(Token)match(input,CREATE,FOLLOW_CREATE_in_addKeyspace2691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE208);

            KEYSPACE209=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_addKeyspace2693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE209);

            pushFollow(FOLLOW_keyValuePairExpr_in_addKeyspace2695);
            keyValuePairExpr210=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr210.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 348:9: -> ^( NODE_ADD_KEYSPACE keyValuePairExpr )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:348:12: ^( NODE_ADD_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addKeyspace"

    public static class addColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addColumnFamily"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:351:1: addColumnFamily : CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.addColumnFamily_return addColumnFamily() throws RecognitionException {
        CliParser.addColumnFamily_return retval = new CliParser.addColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE211=null;
        Token COLUMN212=null;
        Token FAMILY213=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr214 = null;


        CommonTree CREATE211_tree=null;
        CommonTree COLUMN212_tree=null;
        CommonTree FAMILY213_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:352:5: ( CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:352:7: CREATE COLUMN FAMILY keyValuePairExpr
            {
            CREATE211=(Token)match(input,CREATE,FOLLOW_CREATE_in_addColumnFamily2729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE211);

            COLUMN212=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_addColumnFamily2731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN212);

            FAMILY213=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_addColumnFamily2733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY213);

            pushFollow(FOLLOW_keyValuePairExpr_in_addColumnFamily2735);
            keyValuePairExpr214=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr214.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 353:9: -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:353:12: ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addColumnFamily"

    public static class updateKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateKeyspace"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:356:1: updateKeyspace : UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.updateKeyspace_return updateKeyspace() throws RecognitionException {
        CliParser.updateKeyspace_return retval = new CliParser.updateKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE215=null;
        Token KEYSPACE216=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr217 = null;


        CommonTree UPDATE215_tree=null;
        CommonTree KEYSPACE216_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:357:5: ( UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:357:7: UPDATE KEYSPACE keyValuePairExpr
            {
            UPDATE215=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateKeyspace2769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE215);

            KEYSPACE216=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_updateKeyspace2771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE216);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateKeyspace2773);
            keyValuePairExpr217=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr217.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 358:9: -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:358:12: ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateKeyspace"

    public static class updateColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnFamily"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:361:1: updateColumnFamily : UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.updateColumnFamily_return updateColumnFamily() throws RecognitionException {
        CliParser.updateColumnFamily_return retval = new CliParser.updateColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE218=null;
        Token COLUMN219=null;
        Token FAMILY220=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr221 = null;


        CommonTree UPDATE218_tree=null;
        CommonTree COLUMN219_tree=null;
        CommonTree FAMILY220_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:362:5: ( UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:362:7: UPDATE COLUMN FAMILY keyValuePairExpr
            {
            UPDATE218=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateColumnFamily2806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE218);

            COLUMN219=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_updateColumnFamily2808); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN219);

            FAMILY220=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_updateColumnFamily2810); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY220);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateColumnFamily2812);
            keyValuePairExpr221=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr221.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 363:9: -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:363:12: ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnFamily"

    public static class delKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delKeyspace"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:366:1: delKeyspace : DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) ;
    public final CliParser.delKeyspace_return delKeyspace() throws RecognitionException {
        CliParser.delKeyspace_return retval = new CliParser.delKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP222=null;
        Token KEYSPACE223=null;
        CliParser.keyspace_return keyspace224 = null;


        CommonTree DROP222_tree=null;
        CommonTree KEYSPACE223_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:367:5: ( DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:367:7: DROP KEYSPACE keyspace
            {
            DROP222=(Token)match(input,DROP,FOLLOW_DROP_in_delKeyspace2845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP222);

            KEYSPACE223=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_delKeyspace2847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE223);

            pushFollow(FOLLOW_keyspace_in_delKeyspace2849);
            keyspace224=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace224.getTree());


            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:9: -> ^( NODE_DEL_KEYSPACE keyspace )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:368:12: ^( NODE_DEL_KEYSPACE keyspace )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delKeyspace"

    public static class delColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delColumnFamily"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:371:1: delColumnFamily : DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) ;
    public final CliParser.delColumnFamily_return delColumnFamily() throws RecognitionException {
        CliParser.delColumnFamily_return retval = new CliParser.delColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP225=null;
        Token COLUMN226=null;
        Token FAMILY227=null;
        CliParser.columnFamily_return columnFamily228 = null;


        CommonTree DROP225_tree=null;
        CommonTree COLUMN226_tree=null;
        CommonTree FAMILY227_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:372:5: ( DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:372:7: DROP COLUMN FAMILY columnFamily
            {
            DROP225=(Token)match(input,DROP,FOLLOW_DROP_in_delColumnFamily2883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP225);

            COLUMN226=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_delColumnFamily2885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN226);

            FAMILY227=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_delColumnFamily2887); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY227);

            pushFollow(FOLLOW_columnFamily_in_delColumnFamily2889);
            columnFamily228=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily228.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 373:9: -> ^( NODE_DEL_COLUMN_FAMILY columnFamily )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:373:12: ^( NODE_DEL_COLUMN_FAMILY columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delColumnFamily"

    public static class dropIndex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dropIndex"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:376:1: dropIndex : DROP INDEX ON columnFamily '.' columnName -> ^( NODE_DROP_INDEX columnFamily columnName ) ;
    public final CliParser.dropIndex_return dropIndex() throws RecognitionException {
        CliParser.dropIndex_return retval = new CliParser.dropIndex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP229=null;
        Token INDEX230=null;
        Token ON231=null;
        Token char_literal233=null;
        CliParser.columnFamily_return columnFamily232 = null;

        CliParser.columnName_return columnName234 = null;


        CommonTree DROP229_tree=null;
        CommonTree INDEX230_tree=null;
        CommonTree ON231_tree=null;
        CommonTree char_literal233_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_columnName=new RewriteRuleSubtreeStream(adaptor,"rule columnName");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:377:5: ( DROP INDEX ON columnFamily '.' columnName -> ^( NODE_DROP_INDEX columnFamily columnName ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:377:7: DROP INDEX ON columnFamily '.' columnName
            {
            DROP229=(Token)match(input,DROP,FOLLOW_DROP_in_dropIndex2923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP229);

            INDEX230=(Token)match(input,INDEX,FOLLOW_INDEX_in_dropIndex2925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDEX.add(INDEX230);

            ON231=(Token)match(input,ON,FOLLOW_ON_in_dropIndex2927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ON.add(ON231);

            pushFollow(FOLLOW_columnFamily_in_dropIndex2929);
            columnFamily232=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily232.getTree());
            char_literal233=(Token)match(input,129,FOLLOW_129_in_dropIndex2931); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal233);

            pushFollow(FOLLOW_columnName_in_dropIndex2933);
            columnName234=columnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnName.add(columnName234.getTree());


            // AST REWRITE
            // elements: columnFamily, columnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 378:9: -> ^( NODE_DROP_INDEX columnFamily columnName )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:378:12: ^( NODE_DROP_INDEX columnFamily columnName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DROP_INDEX, "NODE_DROP_INDEX"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_columnName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dropIndex"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:381:1: showVersion : SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW235=null;
        Token API_VERSION236=null;

        CommonTree SHOW235_tree=null;
        CommonTree API_VERSION236_tree=null;
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:382:5: ( SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:382:7: SHOW API_VERSION
            {
            SHOW235=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion2968); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW235);

            API_VERSION236=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_showVersion2970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION236);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 383:9: -> ^( NODE_SHOW_VERSION )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:383:12: ^( NODE_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class showKeyspaces_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showKeyspaces"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:386:1: showKeyspaces : SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) ;
    public final CliParser.showKeyspaces_return showKeyspaces() throws RecognitionException {
        CliParser.showKeyspaces_return retval = new CliParser.showKeyspaces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW237=null;
        Token KEYSPACES238=null;

        CommonTree SHOW237_tree=null;
        CommonTree KEYSPACES238_tree=null;
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:387:5: ( SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:387:7: SHOW KEYSPACES
            {
            SHOW237=(Token)match(input,SHOW,FOLLOW_SHOW_in_showKeyspaces3001); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW237);

            KEYSPACES238=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_showKeyspaces3003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES238);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 388:9: -> ^( NODE_SHOW_KEYSPACES )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:388:12: ^( NODE_SHOW_KEYSPACES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showKeyspaces"

    public static class showSchema_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showSchema"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:391:1: showSchema : SHOW SCHEMA ( keyspace )? -> ^( NODE_SHOW_SCHEMA ( keyspace )? ) ;
    public final CliParser.showSchema_return showSchema() throws RecognitionException {
        CliParser.showSchema_return retval = new CliParser.showSchema_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW239=null;
        Token SCHEMA240=null;
        CliParser.keyspace_return keyspace241 = null;


        CommonTree SHOW239_tree=null;
        CommonTree SCHEMA240_tree=null;
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:392:5: ( SHOW SCHEMA ( keyspace )? -> ^( NODE_SHOW_SCHEMA ( keyspace )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:392:7: SHOW SCHEMA ( keyspace )?
            {
            SHOW239=(Token)match(input,SHOW,FOLLOW_SHOW_in_showSchema3035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW239);

            SCHEMA240=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_showSchema3037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SCHEMA.add(SCHEMA240);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:392:19: ( keyspace )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=IntegerPositiveLiteral && LA24_0<=StringLiteral)||LA24_0==IntegerNegativeLiteral) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:392:20: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_showSchema3040);
                    keyspace241=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace241.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 393:9: -> ^( NODE_SHOW_SCHEMA ( keyspace )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:393:12: ^( NODE_SHOW_SCHEMA ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_SCHEMA, "NODE_SHOW_SCHEMA"), root_1);

                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:393:31: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showSchema"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:396:1: describeTable : DESCRIBE ( keyspace )? -> ^( NODE_DESCRIBE ( keyspace )? ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE242=null;
        CliParser.keyspace_return keyspace243 = null;


        CommonTree DESCRIBE242_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:397:5: ( DESCRIBE ( keyspace )? -> ^( NODE_DESCRIBE ( keyspace )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:397:7: DESCRIBE ( keyspace )?
            {
            DESCRIBE242=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeTable3078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE242);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:397:16: ( keyspace )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=IntegerPositiveLiteral && LA25_0<=StringLiteral)||LA25_0==IntegerNegativeLiteral) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:397:17: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_describeTable3081);
                    keyspace243=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace243.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 398:9: -> ^( NODE_DESCRIBE ( keyspace )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:398:12: ^( NODE_DESCRIBE ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE, "NODE_DESCRIBE"), root_1);

                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:398:28: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeTable"

    public static class describeCluster_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeCluster"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:401:1: describeCluster : DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) ;
    public final CliParser.describeCluster_return describeCluster() throws RecognitionException {
        CliParser.describeCluster_return retval = new CliParser.describeCluster_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE244=null;
        Token string_literal245=null;

        CommonTree DESCRIBE244_tree=null;
        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:402:5: ( DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:402:7: DESCRIBE 'CLUSTER'
            {
            DESCRIBE244=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeCluster3123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE244);

            string_literal245=(Token)match(input,119,FOLLOW_119_in_describeCluster3125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(string_literal245);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 403:9: -> ^( NODE_DESCRIBE_CLUSTER )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:403:12: ^( NODE_DESCRIBE_CLUSTER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeCluster"

    public static class useKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useKeyspace"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:406:1: useKeyspace : USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) ;
    public final CliParser.useKeyspace_return useKeyspace() throws RecognitionException {
        CliParser.useKeyspace_return retval = new CliParser.useKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USE246=null;
        CliParser.keyspace_return keyspace247 = null;

        CliParser.username_return username248 = null;

        CliParser.password_return password249 = null;


        CommonTree USE246_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:407:5: ( USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:407:7: USE keyspace ( username )? ( password )?
            {
            USE246=(Token)match(input,USE,FOLLOW_USE_in_useKeyspace3156); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE246);

            pushFollow(FOLLOW_keyspace_in_useKeyspace3158);
            keyspace247=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace247.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:407:20: ( username )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Identifier) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:407:22: username
                    {
                    pushFollow(FOLLOW_username_in_useKeyspace3162);
                    username248=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username248.getTree());

                    }
                    break;

            }

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:407:34: ( password )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==StringLiteral) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:407:36: password
                    {
                    pushFollow(FOLLOW_password_in_useKeyspace3169);
                    password249=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password249.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: password, username, keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 408:9: -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:408:12: ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:408:38: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:408:52: ( password )?
                if ( stream_password.hasNext() ) {
                    adaptor.addChild(root_1, stream_password.nextTree());

                }
                stream_password.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "useKeyspace"

    public static class traceNextQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "traceNextQuery"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:411:1: traceNextQuery : TRACE NEXT QUERY -> ^( NODE_TRACE_NEXT_QUERY ) ;
    public final CliParser.traceNextQuery_return traceNextQuery() throws RecognitionException {
        CliParser.traceNextQuery_return retval = new CliParser.traceNextQuery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRACE250=null;
        Token NEXT251=null;
        Token QUERY252=null;

        CommonTree TRACE250_tree=null;
        CommonTree NEXT251_tree=null;
        CommonTree QUERY252_tree=null;
        RewriteRuleTokenStream stream_QUERY=new RewriteRuleTokenStream(adaptor,"token QUERY");
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_TRACE=new RewriteRuleTokenStream(adaptor,"token TRACE");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:412:5: ( TRACE NEXT QUERY -> ^( NODE_TRACE_NEXT_QUERY ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:412:7: TRACE NEXT QUERY
            {
            TRACE250=(Token)match(input,TRACE,FOLLOW_TRACE_in_traceNextQuery3224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRACE.add(TRACE250);

            NEXT251=(Token)match(input,NEXT,FOLLOW_NEXT_in_traceNextQuery3226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEXT.add(NEXT251);

            QUERY252=(Token)match(input,QUERY,FOLLOW_QUERY_in_traceNextQuery3228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_QUERY.add(QUERY252);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 413:9: -> ^( NODE_TRACE_NEXT_QUERY )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:413:12: ^( NODE_TRACE_NEXT_QUERY )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_TRACE_NEXT_QUERY, "NODE_TRACE_NEXT_QUERY"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "traceNextQuery"

    public static class setTraceProbability_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setTraceProbability"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:416:1: setTraceProbability : SET TRACE PROBABILITY tracingProbability -> ^( NODE_SET_TRACE_PROBABILITY tracingProbability ) ;
    public final CliParser.setTraceProbability_return setTraceProbability() throws RecognitionException {
        CliParser.setTraceProbability_return retval = new CliParser.setTraceProbability_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SET253=null;
        Token TRACE254=null;
        Token PROBABILITY255=null;
        CliParser.tracingProbability_return tracingProbability256 = null;


        CommonTree SET253_tree=null;
        CommonTree TRACE254_tree=null;
        CommonTree PROBABILITY255_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_PROBABILITY=new RewriteRuleTokenStream(adaptor,"token PROBABILITY");
        RewriteRuleTokenStream stream_TRACE=new RewriteRuleTokenStream(adaptor,"token TRACE");
        RewriteRuleSubtreeStream stream_tracingProbability=new RewriteRuleSubtreeStream(adaptor,"rule tracingProbability");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:417:5: ( SET TRACE PROBABILITY tracingProbability -> ^( NODE_SET_TRACE_PROBABILITY tracingProbability ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:417:7: SET TRACE PROBABILITY tracingProbability
            {
            SET253=(Token)match(input,SET,FOLLOW_SET_in_setTraceProbability3259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET253);

            TRACE254=(Token)match(input,TRACE,FOLLOW_TRACE_in_setTraceProbability3261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRACE.add(TRACE254);

            PROBABILITY255=(Token)match(input,PROBABILITY,FOLLOW_PROBABILITY_in_setTraceProbability3263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROBABILITY.add(PROBABILITY255);

            pushFollow(FOLLOW_tracingProbability_in_setTraceProbability3265);
            tracingProbability256=tracingProbability();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tracingProbability.add(tracingProbability256.getTree());


            // AST REWRITE
            // elements: tracingProbability
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 418:9: -> ^( NODE_SET_TRACE_PROBABILITY tracingProbability )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:418:12: ^( NODE_SET_TRACE_PROBABILITY tracingProbability )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SET_TRACE_PROBABILITY, "NODE_SET_TRACE_PROBABILITY"), root_1);

                adaptor.addChild(root_1, stream_tracingProbability.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setTraceProbability"

    public static class keyValuePairExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePairExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:421:1: keyValuePairExpr : entityName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* ) ;
    public final CliParser.keyValuePairExpr_return keyValuePairExpr() throws RecognitionException {
        CliParser.keyValuePairExpr_return retval = new CliParser.keyValuePairExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND258=null;
        Token WITH259=null;
        CliParser.entityName_return entityName257 = null;

        CliParser.keyValuePair_return keyValuePair260 = null;


        CommonTree AND258_tree=null;
        CommonTree WITH259_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_keyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePair");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:5: ( entityName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:7: entityName ( ( AND | WITH ) keyValuePair )*
            {
            pushFollow(FOLLOW_entityName_in_keyValuePairExpr3298);
            entityName257=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_entityName.add(entityName257.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:18: ( ( AND | WITH ) keyValuePair )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==WITH||LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:20: ( AND | WITH ) keyValuePair
            	    {
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:20: ( AND | WITH )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==AND) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==WITH) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:21: AND
            	            {
            	            AND258=(Token)match(input,AND,FOLLOW_AND_in_keyValuePairExpr3303); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AND.add(AND258);


            	            }
            	            break;
            	        case 2 :
            	            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:422:27: WITH
            	            {
            	            WITH259=(Token)match(input,WITH,FOLLOW_WITH_in_keyValuePairExpr3307); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_WITH.add(WITH259);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_keyValuePair_in_keyValuePairExpr3310);
            	    keyValuePair260=keyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_keyValuePair.add(keyValuePair260.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



            // AST REWRITE
            // elements: entityName, keyValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 423:9: -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:423:12: ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NEW_KEYSPACE_ACCESS, "NODE_NEW_KEYSPACE_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_entityName.nextTree());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:423:50: ( keyValuePair )*
                while ( stream_keyValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyValuePair.nextTree());

                }
                stream_keyValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePairExpr"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:426:1: keyValuePair : attr_name '=' attrValue -> attr_name attrValue ;
    public final CliParser.keyValuePair_return keyValuePair() throws RecognitionException {
        CliParser.keyValuePair_return retval = new CliParser.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal262=null;
        CliParser.attr_name_return attr_name261 = null;

        CliParser.attrValue_return attrValue263 = null;


        CommonTree char_literal262_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_attr_name=new RewriteRuleSubtreeStream(adaptor,"rule attr_name");
        RewriteRuleSubtreeStream stream_attrValue=new RewriteRuleSubtreeStream(adaptor,"rule attrValue");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:427:5: ( attr_name '=' attrValue -> attr_name attrValue )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:427:7: attr_name '=' attrValue
            {
            pushFollow(FOLLOW_attr_name_in_keyValuePair3367);
            attr_name261=attr_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attr_name.add(attr_name261.getTree());
            char_literal262=(Token)match(input,124,FOLLOW_124_in_keyValuePair3369); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(char_literal262);

            pushFollow(FOLLOW_attrValue_in_keyValuePair3371);
            attrValue263=attrValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attrValue.add(attrValue263.getTree());


            // AST REWRITE
            // elements: attrValue, attr_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 428:9: -> attr_name attrValue
            {
                adaptor.addChild(root_0, stream_attr_name.nextTree());
                adaptor.addChild(root_0, stream_attrValue.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class attrValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValue"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:431:1: attrValue : ( arrayConstruct | hashConstruct | attrValueString | attrValueInt | attrValueDouble );
    public final CliParser.attrValue_return attrValue() throws RecognitionException {
        CliParser.attrValue_return retval = new CliParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.arrayConstruct_return arrayConstruct264 = null;

        CliParser.hashConstruct_return hashConstruct265 = null;

        CliParser.attrValueString_return attrValueString266 = null;

        CliParser.attrValueInt_return attrValueInt267 = null;

        CliParser.attrValueDouble_return attrValueDouble268 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:432:5: ( arrayConstruct | hashConstruct | attrValueString | attrValueInt | attrValueDouble )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt30=1;
                }
                break;
            case 133:
                {
                alt30=2;
                }
                break;
            case Identifier:
            case StringLiteral:
                {
                alt30=3;
                }
                break;
            case IntegerPositiveLiteral:
            case IntegerNegativeLiteral:
                {
                alt30=4;
                }
                break;
            case DoubleLiteral:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:432:7: arrayConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayConstruct_in_attrValue3403);
                    arrayConstruct264=arrayConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayConstruct264.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:433:7: hashConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hashConstruct_in_attrValue3411);
                    hashConstruct265=hashConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hashConstruct265.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:434:7: attrValueString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueString_in_attrValue3419);
                    attrValueString266=attrValueString();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueString266.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:435:7: attrValueInt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueInt_in_attrValue3427);
                    attrValueInt267=attrValueInt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueInt267.getTree());

                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:436:7: attrValueDouble
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueDouble_in_attrValue3435);
                    attrValueDouble268=attrValueDouble();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueDouble268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValue"

    public static class arrayConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayConstruct"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:440:1: arrayConstruct : '[' ( hashConstruct ( ',' )? )* ']' -> ^( ARRAY ( hashConstruct )* ) ;
    public final CliParser.arrayConstruct_return arrayConstruct() throws RecognitionException {
        CliParser.arrayConstruct_return retval = new CliParser.arrayConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal269=null;
        Token char_literal271=null;
        Token char_literal272=null;
        CliParser.hashConstruct_return hashConstruct270 = null;


        CommonTree char_literal269_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree char_literal272_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_hashConstruct=new RewriteRuleSubtreeStream(adaptor,"rule hashConstruct");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:441:5: ( '[' ( hashConstruct ( ',' )? )* ']' -> ^( ARRAY ( hashConstruct )* ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:441:7: '[' ( hashConstruct ( ',' )? )* ']'
            {
            char_literal269=(Token)match(input,130,FOLLOW_130_in_arrayConstruct3454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(char_literal269);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:441:11: ( hashConstruct ( ',' )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==133) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:441:12: hashConstruct ( ',' )?
            	    {
            	    pushFollow(FOLLOW_hashConstruct_in_arrayConstruct3457);
            	    hashConstruct270=hashConstruct();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashConstruct.add(hashConstruct270.getTree());
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:441:26: ( ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==131) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: ','
            	            {
            	            char_literal271=(Token)match(input,131,FOLLOW_131_in_arrayConstruct3459); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_131.add(char_literal271);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            char_literal272=(Token)match(input,132,FOLLOW_132_in_arrayConstruct3464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(char_literal272);



            // AST REWRITE
            // elements: hashConstruct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 442:9: -> ^( ARRAY ( hashConstruct )* )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:442:12: ^( ARRAY ( hashConstruct )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:442:20: ( hashConstruct )*
                while ( stream_hashConstruct.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashConstruct.nextTree());

                }
                stream_hashConstruct.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayConstruct"

    public static class hashConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashConstruct"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:445:1: hashConstruct : '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) ;
    public final CliParser.hashConstruct_return hashConstruct() throws RecognitionException {
        CliParser.hashConstruct_return retval = new CliParser.hashConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal273=null;
        Token char_literal275=null;
        Token char_literal277=null;
        CliParser.hashElementPair_return hashElementPair274 = null;

        CliParser.hashElementPair_return hashElementPair276 = null;


        CommonTree char_literal273_tree=null;
        CommonTree char_literal275_tree=null;
        CommonTree char_literal277_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_hashElementPair=new RewriteRuleSubtreeStream(adaptor,"rule hashElementPair");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:446:5: ( '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:446:7: '{' hashElementPair ( ',' hashElementPair )* '}'
            {
            char_literal273=(Token)match(input,133,FOLLOW_133_in_hashConstruct3502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_133.add(char_literal273);

            pushFollow(FOLLOW_hashElementPair_in_hashConstruct3504);
            hashElementPair274=hashElementPair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair274.getTree());
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:446:27: ( ',' hashElementPair )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==131) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:446:28: ',' hashElementPair
            	    {
            	    char_literal275=(Token)match(input,131,FOLLOW_131_in_hashConstruct3507); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_131.add(char_literal275);

            	    pushFollow(FOLLOW_hashElementPair_in_hashConstruct3509);
            	    hashElementPair276=hashElementPair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair276.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            char_literal277=(Token)match(input,134,FOLLOW_134_in_hashConstruct3513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_134.add(char_literal277);



            // AST REWRITE
            // elements: hashElementPair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 447:9: -> ^( HASH ( hashElementPair )+ )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:447:12: ^( HASH ( hashElementPair )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HASH, "HASH"), root_1);

                if ( !(stream_hashElementPair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashElementPair.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashElementPair.nextTree());

                }
                stream_hashElementPair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashConstruct"

    public static class hashElementPair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashElementPair"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:450:1: hashElementPair : rowKey ':' rowValue -> ^( PAIR rowKey rowValue ) ;
    public final CliParser.hashElementPair_return hashElementPair() throws RecognitionException {
        CliParser.hashElementPair_return retval = new CliParser.hashElementPair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal279=null;
        CliParser.rowKey_return rowKey278 = null;

        CliParser.rowValue_return rowValue280 = null;


        CommonTree char_literal279_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_rowValue=new RewriteRuleSubtreeStream(adaptor,"rule rowValue");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:451:5: ( rowKey ':' rowValue -> ^( PAIR rowKey rowValue ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:451:7: rowKey ':' rowValue
            {
            pushFollow(FOLLOW_rowKey_in_hashElementPair3549);
            rowKey278=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey278.getTree());
            char_literal279=(Token)match(input,135,FOLLOW_135_in_hashElementPair3551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_135.add(char_literal279);

            pushFollow(FOLLOW_rowValue_in_hashElementPair3553);
            rowValue280=rowValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowValue.add(rowValue280.getTree());


            // AST REWRITE
            // elements: rowKey, rowValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 452:9: -> ^( PAIR rowKey rowValue )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:452:12: ^( PAIR rowKey rowValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_rowKey.nextTree());
                adaptor.addChild(root_1, stream_rowValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashElementPair"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:455:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal282=null;
        Token char_literal284=null;
        Token char_literal285=null;
        Token char_literal286=null;
        Token char_literal287=null;
        Token char_literal288=null;
        CliParser.columnOrSuperColumn_return column = null;

        CliParser.columnOrSuperColumn_return super_column = null;

        CliParser.columnFamily_return columnFamily281 = null;

        CliParser.rowKey_return rowKey283 = null;


        CommonTree char_literal282_tree=null;
        CommonTree char_literal284_tree=null;
        CommonTree char_literal285_tree=null;
        CommonTree char_literal286_tree=null;
        CommonTree char_literal287_tree=null;
        CommonTree char_literal288_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:456:5: ( columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:456:7: columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr3588);
            columnFamily281=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily281.getTree());
            char_literal282=(Token)match(input,130,FOLLOW_130_in_columnFamilyExpr3590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(char_literal282);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr3592);
            rowKey283=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey283.getTree());
            char_literal284=(Token)match(input,132,FOLLOW_132_in_columnFamilyExpr3594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(char_literal284);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:457:9: ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==130) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:457:11: '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )?
                    {
                    char_literal285=(Token)match(input,130,FOLLOW_130_in_columnFamilyExpr3607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(char_literal285);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3611);
                    column=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(column.getTree());
                    char_literal286=(Token)match(input,132,FOLLOW_132_in_columnFamilyExpr3613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal286);

                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:458:13: ( '[' super_column= columnOrSuperColumn ']' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==130) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:458:14: '[' super_column= columnOrSuperColumn ']'
                            {
                            char_literal287=(Token)match(input,130,FOLLOW_130_in_columnFamilyExpr3629); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_130.add(char_literal287);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3633);
                            super_column=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(super_column.getTree());
                            char_literal288=(Token)match(input,132,FOLLOW_132_in_columnFamilyExpr3635); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_132.add(char_literal288);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: column, rowKey, columnFamily, super_column
            // token labels: 
            // rule labels: retval, column, super_column
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column",column!=null?column.tree:null);
            RewriteRuleSubtreeStream stream_super_column=new RewriteRuleSubtreeStream(adaptor,"rule super_column",super_column!=null?super_column.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 460:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:460:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:460:51: ( $column ( $super_column)? )?
                if ( stream_column.hasNext()||stream_super_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_column.nextTree());
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:460:60: ( $super_column)?
                    if ( stream_super_column.hasNext() ) {
                        adaptor.addChild(root_1, stream_super_column.nextTree());

                    }
                    stream_super_column.reset();

                }
                stream_column.reset();
                stream_super_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamilyExpr"

    public static class keyRangeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyRangeExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:463:1: keyRangeExpr : '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']' -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? ) ;
    public final CliParser.keyRangeExpr_return keyRangeExpr() throws RecognitionException {
        CliParser.keyRangeExpr_return retval = new CliParser.keyRangeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal289=null;
        Token char_literal290=null;
        Token char_literal291=null;
        CliParser.entityName_return startKey = null;

        CliParser.entityName_return endKey = null;


        CommonTree char_literal289_tree=null;
        CommonTree char_literal290_tree=null;
        CommonTree char_literal291_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:464:5: ( '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']' -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:464:10: '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']'
            {
            char_literal289=(Token)match(input,130,FOLLOW_130_in_keyRangeExpr3698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(char_literal289);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:464:14: ( (startKey= entityName )? ':' (endKey= entityName )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=IntegerPositiveLiteral && LA38_0<=StringLiteral)||LA38_0==IntegerNegativeLiteral||LA38_0==135) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:464:16: (startKey= entityName )? ':' (endKey= entityName )?
                    {
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:464:24: (startKey= entityName )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=IntegerPositiveLiteral && LA36_0<=StringLiteral)||LA36_0==IntegerNegativeLiteral) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: startKey= entityName
                            {
                            pushFollow(FOLLOW_entityName_in_keyRangeExpr3704);
                            startKey=entityName();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_entityName.add(startKey.getTree());

                            }
                            break;

                    }

                    char_literal290=(Token)match(input,135,FOLLOW_135_in_keyRangeExpr3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_135.add(char_literal290);

                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:464:47: (endKey= entityName )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=IntegerPositiveLiteral && LA37_0<=StringLiteral)||LA37_0==IntegerNegativeLiteral) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: endKey= entityName
                            {
                            pushFollow(FOLLOW_entityName_in_keyRangeExpr3711);
                            endKey=entityName();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_entityName.add(endKey.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal291=(Token)match(input,132,FOLLOW_132_in_keyRangeExpr3717); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(char_literal291);



            // AST REWRITE
            // elements: startKey, endKey
            // token labels: 
            // rule labels: endKey, retval, startKey
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_endKey=new RewriteRuleSubtreeStream(adaptor,"rule endKey",endKey!=null?endKey.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_startKey=new RewriteRuleSubtreeStream(adaptor,"rule startKey",startKey!=null?startKey.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 465:7: -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:465:10: ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_KEY_RANGE, "NODE_KEY_RANGE"), root_1);

                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:465:27: ( $startKey)?
                if ( stream_startKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_startKey.nextTree());

                }
                stream_startKey.reset();
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:465:38: ( $endKey)?
                if ( stream_endKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_endKey.nextTree());

                }
                stream_endKey.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyRangeExpr"

    public static class rowLimitExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowLimitExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:468:1: rowLimitExpr : 'LIMIT' limit= IntegerPositiveLiteral -> ^( NODE_LIMIT $limit) ;
    public final CliParser.rowLimitExpr_return rowLimitExpr() throws RecognitionException {
        CliParser.rowLimitExpr_return retval = new CliParser.rowLimitExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token string_literal292=null;

        CommonTree limit_tree=null;
        CommonTree string_literal292_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:469:5: ( 'LIMIT' limit= IntegerPositiveLiteral -> ^( NODE_LIMIT $limit) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:469:7: 'LIMIT' limit= IntegerPositiveLiteral
            {
            string_literal292=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_rowLimitExpr3754); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal292);

            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowLimitExpr3758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);



            // AST REWRITE
            // elements: limit
            // token labels: limit
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 470:9: -> ^( NODE_LIMIT $limit)
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:470:12: ^( NODE_LIMIT $limit)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_1);

                adaptor.addChild(root_1, stream_limit.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowLimitExpr"

    public static class columnLimitExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnLimitExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:473:1: columnLimitExpr : 'COLUMNS' columns= IntegerPositiveLiteral ( reversedExpr )? -> ^( NODE_COLUMNS $columns ( reversedExpr )? ) ;
    public final CliParser.columnLimitExpr_return columnLimitExpr() throws RecognitionException {
        CliParser.columnLimitExpr_return retval = new CliParser.columnLimitExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token columns=null;
        Token string_literal293=null;
        CliParser.reversedExpr_return reversedExpr294 = null;


        CommonTree columns_tree=null;
        CommonTree string_literal293_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_reversedExpr=new RewriteRuleSubtreeStream(adaptor,"rule reversedExpr");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:474:5: ( 'COLUMNS' columns= IntegerPositiveLiteral ( reversedExpr )? -> ^( NODE_COLUMNS $columns ( reversedExpr )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:474:7: 'COLUMNS' columns= IntegerPositiveLiteral ( reversedExpr )?
            {
            string_literal293=(Token)match(input,136,FOLLOW_136_in_columnLimitExpr3792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(string_literal293);

            columns=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_columnLimitExpr3796); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(columns);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:474:48: ( reversedExpr )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==137) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: reversedExpr
                    {
                    pushFollow(FOLLOW_reversedExpr_in_columnLimitExpr3798);
                    reversedExpr294=reversedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_reversedExpr.add(reversedExpr294.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: reversedExpr, columns
            // token labels: columns
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_columns=new RewriteRuleTokenStream(adaptor,"token columns",columns);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 475:9: -> ^( NODE_COLUMNS $columns ( reversedExpr )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:475:12: ^( NODE_COLUMNS $columns ( reversedExpr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMNS, "NODE_COLUMNS"), root_1);

                adaptor.addChild(root_1, stream_columns.nextNode());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:475:36: ( reversedExpr )?
                if ( stream_reversedExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_reversedExpr.nextTree());

                }
                stream_reversedExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnLimitExpr"

    public static class reversedExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reversedExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:478:1: reversedExpr : 'REVERSED' -> ^( NODE_REVERSED ) ;
    public final CliParser.reversedExpr_return reversedExpr() throws RecognitionException {
        CliParser.reversedExpr_return retval = new CliParser.reversedExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal295=null;

        CommonTree string_literal295_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:479:5: ( 'REVERSED' -> ^( NODE_REVERSED ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:479:7: 'REVERSED'
            {
            string_literal295=(Token)match(input,137,FOLLOW_137_in_reversedExpr3836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_137.add(string_literal295);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 480:9: -> ^( NODE_REVERSED )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:480:12: ^( NODE_REVERSED )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_REVERSED, "NODE_REVERSED"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reversedExpr"

    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnName"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:483:1: columnName : entityName ;
    public final CliParser.columnName_return columnName() throws RecognitionException {
        CliParser.columnName_return retval = new CliParser.columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName296 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:484:2: ( entityName )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:484:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_columnName3864);
            entityName296=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName296.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnName"

    public static class attr_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_name"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:487:1: attr_name : Identifier ;
    public final CliParser.attr_name_return attr_name() throws RecognitionException {
        CliParser.attr_name_return retval = new CliParser.attr_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier297=null;

        CommonTree Identifier297_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:488:5: ( Identifier )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:488:7: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier297=(Token)match(input,Identifier,FOLLOW_Identifier_in_attr_name3878); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier297_tree = (CommonTree)adaptor.create(Identifier297);
            adaptor.addChild(root_0, Identifier297_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_name"

    public static class attrValueString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueString"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:491:1: attrValueString : ( Identifier | StringLiteral ) ;
    public final CliParser.attrValueString_return attrValueString() throws RecognitionException {
        CliParser.attrValueString_return retval = new CliParser.attrValueString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set298=null;

        CommonTree set298_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:492:5: ( ( Identifier | StringLiteral ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:492:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set298=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set298));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueString"

    public static class attrValueInt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueInt"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:495:1: attrValueInt : ( IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.attrValueInt_return attrValueInt() throws RecognitionException {
        CliParser.attrValueInt_return retval = new CliParser.attrValueInt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set299=null;

        CommonTree set299_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:496:5: ( IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set299=(Token)input.LT(1);
            if ( input.LA(1)==IntegerPositiveLiteral||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set299));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueInt"

    public static class attrValueDouble_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueDouble"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:500:1: attrValueDouble : DoubleLiteral ;
    public final CliParser.attrValueDouble_return attrValueDouble() throws RecognitionException {
        CliParser.attrValueDouble_return retval = new CliParser.attrValueDouble_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral300=null;

        CommonTree DoubleLiteral300_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:501:5: ( DoubleLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:501:7: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral300=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_attrValueDouble3947); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral300_tree = (CommonTree)adaptor.create(DoubleLiteral300);
            adaptor.addChild(root_0, DoubleLiteral300_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueDouble"

    public static class keyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspace"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:504:1: keyspace : entityName ;
    public final CliParser.keyspace_return keyspace() throws RecognitionException {
        CliParser.keyspace_return retval = new CliParser.keyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName301 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:505:2: ( entityName )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:505:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_keyspace3963);
            entityName301=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName301.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspace"

    public static class replica_placement_strategy_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replica_placement_strategy"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:508:1: replica_placement_strategy : StringLiteral ;
    public final CliParser.replica_placement_strategy_return replica_placement_strategy() throws RecognitionException {
        CliParser.replica_placement_strategy_return retval = new CliParser.replica_placement_strategy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral302=null;

        CommonTree StringLiteral302_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:509:5: ( StringLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:509:7: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral302=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_replica_placement_strategy3977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral302_tree = (CommonTree)adaptor.create(StringLiteral302);
            adaptor.addChild(root_0, StringLiteral302_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replica_placement_strategy"

    public static class keyspaceNewName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspaceNewName"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:512:1: keyspaceNewName : entityName ;
    public final CliParser.keyspaceNewName_return keyspaceNewName() throws RecognitionException {
        CliParser.keyspaceNewName_return retval = new CliParser.keyspaceNewName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName303 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:513:2: ( entityName )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:513:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_keyspaceNewName3991);
            entityName303=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName303.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspaceNewName"

    public static class comparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparator"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:516:1: comparator : StringLiteral ;
    public final CliParser.comparator_return comparator() throws RecognitionException {
        CliParser.comparator_return retval = new CliParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral304=null;

        CommonTree StringLiteral304_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:517:5: ( StringLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:517:7: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral304=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_comparator4005); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral304_tree = (CommonTree)adaptor.create(StringLiteral304);
            adaptor.addChild(root_0, StringLiteral304_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparator"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:520:1: command : Identifier ;
    public final CliParser.command_return command() throws RecognitionException {
        CliParser.command_return retval = new CliParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier305=null;

        CommonTree Identifier305_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:520:9: ( Identifier )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:520:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier305=(Token)match(input,Identifier,FOLLOW_Identifier_in_command4024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier305_tree = (CommonTree)adaptor.create(Identifier305);
            adaptor.addChild(root_0, Identifier305_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class newColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newColumnFamily"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:523:1: newColumnFamily : entityName ;
    public final CliParser.newColumnFamily_return newColumnFamily() throws RecognitionException {
        CliParser.newColumnFamily_return retval = new CliParser.newColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName306 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:524:2: ( entityName )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:524:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_newColumnFamily4038);
            entityName306=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName306.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newColumnFamily"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:527:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier307=null;

        CommonTree Identifier307_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:527:9: ( Identifier )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:527:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier307=(Token)match(input,Identifier,FOLLOW_Identifier_in_username4047); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier307_tree = (CommonTree)adaptor.create(Identifier307);
            adaptor.addChild(root_0, Identifier307_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:530:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral308=null;

        CommonTree StringLiteral308_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:530:9: ( StringLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:530:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral308=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password4059); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral308_tree = (CommonTree)adaptor.create(StringLiteral308);
            adaptor.addChild(root_0, StringLiteral308_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "password"

    public static class columnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamily"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:533:1: columnFamily : entityName ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName309 = null;



        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:534:3: ( entityName )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:534:5: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_columnFamily4074);
            entityName309=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName309.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamily"

    public static class singleColumnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "singleColumnFamilyExpr"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:537:1: singleColumnFamilyExpr : entityName -> ^( COLUMN_FAMILY entityName ) ;
    public final CliParser.singleColumnFamilyExpr_return singleColumnFamilyExpr() throws RecognitionException {
        CliParser.singleColumnFamilyExpr_return retval = new CliParser.singleColumnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName310 = null;


        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:538:3: ( entityName -> ^( COLUMN_FAMILY entityName ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:538:5: entityName
            {
            pushFollow(FOLLOW_entityName_in_singleColumnFamilyExpr4087);
            entityName310=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_entityName.add(entityName310.getTree());


            // AST REWRITE
            // elements: entityName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 539:5: -> ^( COLUMN_FAMILY entityName )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:539:8: ^( COLUMN_FAMILY entityName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN_FAMILY, "COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_entityName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "singleColumnFamilyExpr"

    public static class entityName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityName"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:542:1: entityName : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral ) ;
    public final CliParser.entityName_return entityName() throws RecognitionException {
        CliParser.entityName_return retval = new CliParser.entityName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set311=null;

        CommonTree set311_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:543:3: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:543:5: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set311=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral)||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set311));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityName"

    public static class rowKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowKey"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:546:1: rowKey : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall ) ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier312=null;
        Token StringLiteral313=null;
        Token IntegerPositiveLiteral314=null;
        Token IntegerNegativeLiteral315=null;
        CliParser.functionCall_return functionCall316 = null;


        CommonTree Identifier312_tree=null;
        CommonTree StringLiteral313_tree=null;
        CommonTree IntegerPositiveLiteral314_tree=null;
        CommonTree IntegerNegativeLiteral315_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:5: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall )
            int alt40=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==138) ) {
                    alt40=5;
                }
                else if ( (LA40_1==EOF||LA40_1==SEMICOLON||LA40_1==AND||(LA40_1>=131 && LA40_1<=132)||LA40_1==135) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt40=2;
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt40=3;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:9: Identifier
                    {
                    Identifier312=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowKey4144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier312_tree = (CommonTree)adaptor.create(Identifier312);
                    adaptor.addChild(root_0, Identifier312_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:22: StringLiteral
                    {
                    StringLiteral313=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey4148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral313_tree = (CommonTree)adaptor.create(StringLiteral313);
                    adaptor.addChild(root_0, StringLiteral313_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:38: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral314=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowKey4152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral314_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral314);
                    adaptor.addChild(root_0, IntegerPositiveLiteral314_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:63: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral315=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_rowKey4156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral315_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral315);
                    adaptor.addChild(root_0, IntegerNegativeLiteral315_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:547:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowKey4160);
                    functionCall316=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall316.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowKey"

    public static class rowValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowValue"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:550:1: rowValue : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct ) ;
    public final CliParser.rowValue_return rowValue() throws RecognitionException {
        CliParser.rowValue_return retval = new CliParser.rowValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier317=null;
        Token StringLiteral318=null;
        Token IntegerPositiveLiteral319=null;
        Token IntegerNegativeLiteral320=null;
        CliParser.functionCall_return functionCall321 = null;

        CliParser.hashConstruct_return hashConstruct322 = null;


        CommonTree Identifier317_tree=null;
        CommonTree StringLiteral318_tree=null;
        CommonTree IntegerPositiveLiteral319_tree=null;
        CommonTree IntegerNegativeLiteral320_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:5: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall | hashConstruct )
            int alt41=6;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==138) ) {
                    alt41=5;
                }
                else if ( (LA41_1==EOF||LA41_1==131||LA41_1==134) ) {
                    alt41=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt41=2;
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt41=3;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt41=4;
                }
                break;
            case 133:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:9: Identifier
                    {
                    Identifier317=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowValue4182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier317_tree = (CommonTree)adaptor.create(Identifier317);
                    adaptor.addChild(root_0, Identifier317_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:22: StringLiteral
                    {
                    StringLiteral318=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowValue4186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral318_tree = (CommonTree)adaptor.create(StringLiteral318);
                    adaptor.addChild(root_0, StringLiteral318_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:38: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral319=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowValue4190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral319_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral319);
                    adaptor.addChild(root_0, IntegerPositiveLiteral319_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:63: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral320=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_rowValue4194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral320_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral320);
                    adaptor.addChild(root_0, IntegerNegativeLiteral320_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowValue4198);
                    functionCall321=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall321.getTree());

                    }
                    break;
                case 6 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:551:103: hashConstruct
                    {
                    pushFollow(FOLLOW_hashConstruct_in_rowValue4202);
                    hashConstruct322=hashConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hashConstruct322.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowValue"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:554:1: value : ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier323=null;
        Token IntegerPositiveLiteral324=null;
        Token IntegerNegativeLiteral325=null;
        Token StringLiteral326=null;
        CliParser.functionCall_return functionCall327 = null;


        CommonTree Identifier323_tree=null;
        CommonTree IntegerPositiveLiteral324_tree=null;
        CommonTree IntegerNegativeLiteral325_tree=null;
        CommonTree StringLiteral326_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:5: ( ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            int alt42=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==138) ) {
                    alt42=5;
                }
                else if ( (LA42_1==EOF||LA42_1==SEMICOLON||LA42_1==WITH||LA42_1==AND||LA42_1==LIMIT) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt42=2;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt42=3;
                }
                break;
            case StringLiteral:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:8: Identifier
                    {
                    Identifier323=(Token)match(input,Identifier,FOLLOW_Identifier_in_value4224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier323_tree = (CommonTree)adaptor.create(Identifier323);
                    adaptor.addChild(root_0, Identifier323_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:21: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral324=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_value4228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral324_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral324);
                    adaptor.addChild(root_0, IntegerPositiveLiteral324_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:46: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral325=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_value4232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral325_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral325);
                    adaptor.addChild(root_0, IntegerNegativeLiteral325_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:71: StringLiteral
                    {
                    StringLiteral326=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value4236); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral326_tree = (CommonTree)adaptor.create(StringLiteral326);
                    adaptor.addChild(root_0, StringLiteral326_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:555:87: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_value4240);
                    functionCall327=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall327.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:558:1: functionCall : functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) ;
    public final CliParser.functionCall_return functionCall() throws RecognitionException {
        CliParser.functionCall_return retval = new CliParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token char_literal328=null;
        Token char_literal330=null;
        CliParser.functionArgument_return functionArgument329 = null;


        CommonTree functionName_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree char_literal330_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:559:5: (functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:559:7: functionName= Identifier '(' ( functionArgument )? ')'
            {
            functionName=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall4261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(functionName);

            char_literal328=(Token)match(input,138,FOLLOW_138_in_functionCall4263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_138.add(char_literal328);

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:559:35: ( functionArgument )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=IntegerPositiveLiteral && LA43_0<=StringLiteral)||LA43_0==IntegerNegativeLiteral) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: functionArgument
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall4265);
                    functionArgument329=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument329.getTree());

                    }
                    break;

            }

            char_literal330=(Token)match(input,139,FOLLOW_139_in_functionCall4268); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_139.add(char_literal330);



            // AST REWRITE
            // elements: functionName, functionArgument
            // token labels: functionName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 560:9: -> ^( FUNCTION_CALL $functionName ( functionArgument )? )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:560:12: ^( FUNCTION_CALL $functionName ( functionArgument )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextNode());
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:560:42: ( functionArgument )?
                if ( stream_functionArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionArgument.nextTree());

                }
                stream_functionArgument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class functionArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionArgument"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:563:1: functionArgument : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.functionArgument_return functionArgument() throws RecognitionException {
        CliParser.functionArgument_return retval = new CliParser.functionArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set331=null;

        CommonTree set331_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:564:5: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set331=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral)||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set331));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgument"

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:567:1: columnOrSuperColumn : ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier332=null;
        Token IntegerPositiveLiteral333=null;
        Token IntegerNegativeLiteral334=null;
        Token StringLiteral335=null;
        CliParser.functionCall_return functionCall336 = null;


        CommonTree Identifier332_tree=null;
        CommonTree IntegerPositiveLiteral333_tree=null;
        CommonTree IntegerNegativeLiteral334_tree=null;
        CommonTree StringLiteral335_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:5: ( ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            int alt44=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==138) ) {
                    alt44=5;
                }
                else if ( ((LA44_1>=124 && LA44_1<=128)||LA44_1==132) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt44=2;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt44=3;
                }
                break;
            case StringLiteral:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:8: Identifier
                    {
                    Identifier332=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnOrSuperColumn4336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier332_tree = (CommonTree)adaptor.create(Identifier332);
                    adaptor.addChild(root_0, Identifier332_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:21: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral333=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_columnOrSuperColumn4340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral333_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral333);
                    adaptor.addChild(root_0, IntegerPositiveLiteral333_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:46: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral334=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_columnOrSuperColumn4344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral334_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral334);
                    adaptor.addChild(root_0, IntegerNegativeLiteral334_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:71: StringLiteral
                    {
                    StringLiteral335=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn4348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral335_tree = (CommonTree)adaptor.create(StringLiteral335);
                    adaptor.addChild(root_0, StringLiteral335_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:568:87: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_columnOrSuperColumn4352);
                    functionCall336=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall336.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnOrSuperColumn"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:571:1: host : host_name -> ^( NODE_ID_LIST host_name ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.host_name_return host_name337 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:572:5: ( host_name -> ^( NODE_ID_LIST host_name ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:572:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host4374);
            host_name337=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name337.getTree());


            // AST REWRITE
            // elements: host_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 573:9: -> ^( NODE_ID_LIST host_name )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:573:12: ^( NODE_ID_LIST host_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_host_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class host_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host_name"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:576:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliParser.host_name_return host_name() throws RecognitionException {
        CliParser.host_name_return retval = new CliParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier338=null;
        Token char_literal339=null;
        Token Identifier340=null;

        CommonTree Identifier338_tree=null;
        CommonTree char_literal339_tree=null;
        CommonTree Identifier340_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:577:5: ( Identifier ( '.' Identifier )* )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:577:7: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier338=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name4407); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier338_tree = (CommonTree)adaptor.create(Identifier338);
            adaptor.addChild(root_0, Identifier338_tree);
            }
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:577:18: ( '.' Identifier )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==129) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:577:19: '.' Identifier
            	    {
            	    char_literal339=(Token)match(input,129,FOLLOW_129_in_host_name4410); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal339_tree = (CommonTree)adaptor.create(char_literal339);
            	    adaptor.addChild(root_0, char_literal339_tree);
            	    }
            	    Identifier340=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name4412); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier340_tree = (CommonTree)adaptor.create(Identifier340);
            	    adaptor.addChild(root_0, Identifier340_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host_name"

    public static class ip_address_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_address"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:580:1: ip_address : IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) ;
    public final CliParser.ip_address_return ip_address() throws RecognitionException {
        CliParser.ip_address_return retval = new CliParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS341=null;

        CommonTree IP_ADDRESS341_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:581:5: ( IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:581:7: IP_ADDRESS
            {
            IP_ADDRESS341=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address4435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS341);



            // AST REWRITE
            // elements: IP_ADDRESS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 582:9: -> ^( NODE_ID_LIST IP_ADDRESS )
            {
                // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:582:12: ^( NODE_ID_LIST IP_ADDRESS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_IP_ADDRESS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip_address"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:585:1: port : IntegerPositiveLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerPositiveLiteral342=null;

        CommonTree IntegerPositiveLiteral342_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:586:5: ( IntegerPositiveLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:586:7: IntegerPositiveLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerPositiveLiteral342=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_port4473); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerPositiveLiteral342_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral342);
            adaptor.addChild(root_0, IntegerPositiveLiteral342_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    public static class incrementValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incrementValue"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:589:1: incrementValue : ( IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.incrementValue_return incrementValue() throws RecognitionException {
        CliParser.incrementValue_return retval = new CliParser.incrementValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set343=null;

        CommonTree set343_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:590:5: ( IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set343=(Token)input.LT(1);
            if ( input.LA(1)==IntegerPositiveLiteral||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set343));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incrementValue"

    public static class traceSessionId_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "traceSessionId"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:594:1: traceSessionId : Identifier ;
    public final CliParser.traceSessionId_return traceSessionId() throws RecognitionException {
        CliParser.traceSessionId_return retval = new CliParser.traceSessionId_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier344=null;

        CommonTree Identifier344_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:595:5: ( Identifier )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:595:7: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier344=(Token)match(input,Identifier,FOLLOW_Identifier_in_traceSessionId4515); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier344_tree = (CommonTree)adaptor.create(Identifier344);
            adaptor.addChild(root_0, Identifier344_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "traceSessionId"

    public static class tracingProbability_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tracingProbability"
    // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:598:1: tracingProbability : DoubleLiteral ;
    public final CliParser.tracingProbability_return tracingProbability() throws RecognitionException {
        CliParser.tracingProbability_return retval = new CliParser.tracingProbability_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral345=null;

        CommonTree DoubleLiteral345_tree=null;

        try {
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:599:5: ( DoubleLiteral )
            // /home/alex/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:599:7: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral345=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_tracingProbability4532); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral345_tree = (CommonTree)adaptor.create(DoubleLiteral345);
            adaptor.addChild(root_0, DoubleLiteral345_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tracingProbability"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\44\uffff";
    static final String DFA2_eofS =
        "\1\24\3\uffff\1\26\37\uffff";
    static final String DFA2_minS =
        "\1\65\3\uffff\1\65\3\106\2\uffff\1\71\17\uffff\1\135\11\uffff";
    static final String DFA2_maxS =
        "\1\171\3\uffff\1\167\1\133\1\110\1\113\2\uffff\1\141\17\uffff\1"+
        "\136\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\14\1\15\1\uffff\1\17\1\20\1\21\1"+
        "\23\1\24\1\25\1\26\1\27\1\30\1\35\1\5\1\4\1\6\1\7\1\32\1\uffff\1"+
        "\10\1\11\1\12\1\13\1\31\1\16\1\22\1\33\1\34";
    static final String DFA2_specialS =
        "\44\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\24\1\1\1\15\1\10\1\11\2\uffff\1\12\1\uffff\1\4\2\2\1\17\3"+
            "\uffff\1\5\1\uffff\1\6\2\uffff\1\7\1\uffff\1\14\2\16\1\13\1"+
            "\3\1\20\1\21\1\22\1\23\44\uffff\1\15",
            "",
            "",
            "",
            "\1\26\37\uffff\3\26\11\uffff\1\26\25\uffff\1\25",
            "\1\27\1\uffff\1\30\2\uffff\1\32\17\uffff\1\31",
            "\1\33\1\uffff\1\34",
            "\1\36\1\uffff\1\35\2\uffff\1\37",
            "",
            "",
            "\1\40\33\uffff\3\41\11\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "142:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | traceNextQuery | setTraceProbability | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | addJoinStatement | addIndexViewStatement | addIndexViewStatement2 | -> ^( NODE_NO_OP ) );";
        }
    }
    static final String DFA6_eotS =
        "\50\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\30\5\uffff\1\32\1\34\37\uffff";
    static final String DFA6_minS =
        "\1\67\1\65\5\uffff\2\65\2\uffff\1\102\3\106\31\uffff";
    static final String DFA6_maxS =
        "\1\171\1\124\5\uffff\1\71\1\167\2\uffff\1\170\2\110\1\113\31\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\40\1\1\1\2\1\3\1\4\2\uffff\1\10\1\11\4\uffff\1\25\1\27"+
        "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\5\1\26\1\7\1\6\1\12\1"+
        "\13\1\14\1\15\1\16\1\20\1\17\1\21\1\22\1\23\1\24";
    static final String DFA6_specialS =
        "\50\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\101\uffff\1\2",
            "\1\30\1\4\1\3\1\5\1\6\2\uffff\1\7\1\uffff\1\10\1\11\1\12\1"+
            "\13\3\uffff\1\14\1\uffff\1\15\2\uffff\1\16\1\uffff\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "",
            "",
            "",
            "",
            "",
            "\1\32\3\uffff\1\31",
            "\1\34\101\uffff\1\33",
            "",
            "",
            "\1\36\1\37\1\40\63\uffff\1\35",
            "\1\41\1\uffff\1\42",
            "\1\43\1\uffff\1\44",
            "\1\45\1\uffff\1\46\2\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "184:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP TRACE NEXT QUERY -> ^( NODE_HELP NODE_TRACE_NEXT_QUERY ) | HELP SET TRACE PROBABILITY -> ^( NODE_HELP NODE_SET_TRACE_PROBABILITY ) | HELP DESCRIBE -> ^( NODE_HELP NODE_DESCRIBE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_root476 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStatement_in_statement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_statement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeCluster_in_statement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addKeyspace_in_statement537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addColumnFamily_in_statement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateKeyspace_in_statement553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnFamily_in_statement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delColumnFamily_in_statement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delKeyspace_in_statement577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useKeyspace_in_statement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_traceNextQuery_in_statement593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTraceProbability_in_statement601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStatement_in_statement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStatement_in_statement617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_statement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrStatement_in_statement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listStatement_in_statement657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_statement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStatement_in_statement673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consistencyLevelStatement_in_statement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndex_in_statement689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addJoinStatement_in_statement703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addIndexViewStatement_in_statement711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addIndexViewStatement2_in_statement719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_host_in_connectStatement751 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_connectStatement753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_port_in_connectStatement755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_username_in_connectStatement758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_password_in_connectStatement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement795 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement797 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_connectStatement799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_port_in_connectStatement801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_username_in_connectStatement804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_password_in_connectStatement806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement850 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement877 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement904 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_USE_in_helpStatement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement931 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TRACE_in_helpStatement933 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NEXT_in_helpStatement935 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_QUERY_in_helpStatement937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement961 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SET_in_helpStatement963 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TRACE_in_helpStatement965 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_PROBABILITY_in_helpStatement967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement991 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1017 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement1019 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_helpStatement1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1045 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1101 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_helpStatement1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYSPACES_in_helpStatement1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_in_helpStatement1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_API_VERSION_in_helpStatement1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_INDEX_in_helpStatement1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_GET_in_helpStatement1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1449 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SET_in_helpStatement1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_INCR_in_helpStatement1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_DECR_in_helpStatement1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DEL_in_helpStatement1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_COUNT_in_helpStatement1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_LIST_in_helpStatement1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TRUNCATE_in_helpStatement1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ASSUME_in_helpStatement1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_helpStatement1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_helpStatement1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStatement1784 = new BitSet(new long[]{0x0000000000000002L,0x0400004000000000L});
    public static final BitSet FOLLOW_122_in_getStatement1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_typeIdentifier_in_getStatement1789 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_getStatement1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_getStatement1845 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_getStatement1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1849 = new BitSet(new long[]{0x0000000000000002L,0x0000004100000000L});
    public static final BitSet FOLLOW_AND_in_getStatement1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1854 = new BitSet(new long[]{0x0000000000000002L,0x0000004100000000L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_getStatement1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_getCondition1914 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operator_in_getCondition1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_value_in_getCondition1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setStatement2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStatement2016 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_setStatement2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_value_in_setStatement2022 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_WITH_in_setStatement2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TTL_in_setStatement2027 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_setStatement2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_setStatement2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_incrStatement2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_incrStatement2081 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_BY_in_incrStatement2084 = new BitSet(new long[]{0x0000000000000000L,0x0000000200200000L});
    public static final BitSet FOLLOW_incrementValue_in_incrStatement2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_incrStatement2122 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_incrStatement2124 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_BY_in_incrStatement2127 = new BitSet(new long[]{0x0000000000000000L,0x0000000200200000L});
    public static final BitSet FOLLOW_incrementValue_in_incrStatement2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_countStatement2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStatement2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEL_in_delStatement2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStatement2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStatement2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showKeyspaces_in_showStatement2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showSchema_in_showStatement2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addJoinStatement2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_JOIN_in_addJoinStatement2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_addJoinStatement2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_OF_in_addJoinStatement2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_addJoinStatement2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_addJoinStatement2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_addJoinStatement2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_addJoinStatement2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_addJoinStatement2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addIndexViewStatement2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_INDEX_in_addIndexViewStatement2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_VIEW_in_addIndexViewStatement2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_addIndexViewStatement2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_OF_in_addIndexViewStatement2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_singleColumnFamilyExpr_in_addIndexViewStatement2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_addIndexViewStatement2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_addIndexViewStatement2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_addIndexViewStatement2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_addIndexViewStatement2374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_132_in_addIndexViewStatement2378 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_addIndexViewStatement2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_singleColumnFamilyExpr_in_addIndexViewStatement2383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_addIndexViewStatement2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_addIndexViewStatement2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_addIndexViewStatement2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_addIndexViewStatement2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_132_in_addIndexViewStatement2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_CREATE_in_addIndexViewStatement22434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_INDEX_in_addIndexViewStatement22436 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_VIEW2_in_addIndexViewStatement22438 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_addIndexViewStatement22442 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_OF_in_addIndexViewStatement22444 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_addIndexViewStatement22448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_addIndexViewStatement22450 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_addIndexViewStatement22452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_listStatement2482 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_listStatement2484 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_keyRangeExpr_in_listStatement2486 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rowLimitExpr_in_listStatement2489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_columnLimitExpr_in_listStatement2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATE_in_truncateStatement2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_truncateStatement2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStatement2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_assumeStatement2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement2576 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_assumeStatement2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_entityName_in_assumeStatement2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement2618 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_consistencyLevelStatement2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_Identifier_in_consistencyLevelStatement2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showClusterName2658 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_showClusterName2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addKeyspace2691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYSPACE_in_addKeyspace2693 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addKeyspace2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addColumnFamily2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLUMN_in_addColumnFamily2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FAMILY_in_addColumnFamily2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addColumnFamily2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateKeyspace2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYSPACE_in_updateKeyspace2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateKeyspace2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateColumnFamily2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLUMN_in_updateColumnFamily2808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FAMILY_in_updateColumnFamily2810 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateColumnFamily2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delKeyspace2845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYSPACE_in_delKeyspace2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyspace_in_delKeyspace2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delColumnFamily2883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLUMN_in_delColumnFamily2885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FAMILY_in_delColumnFamily2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_delColumnFamily2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_dropIndex2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_INDEX_in_dropIndex2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ON_in_dropIndex2927 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnFamily_in_dropIndex2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_dropIndex2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnName_in_dropIndex2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_API_VERSION_in_showVersion2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showKeyspaces3001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYSPACES_in_showKeyspaces3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showSchema3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_in_showSchema3037 = new BitSet(new long[]{0x0000000000000002L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyspace_in_showSchema3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeTable3078 = new BitSet(new long[]{0x0000000000000002L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyspace_in_describeTable3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeCluster3123 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_describeCluster3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useKeyspace3156 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_keyspace_in_useKeyspace3158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_username_in_useKeyspace3162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_password_in_useKeyspace3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACE_in_traceNextQuery3224 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NEXT_in_traceNextQuery3226 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_QUERY_in_traceNextQuery3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setTraceProbability3259 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TRACE_in_setTraceProbability3261 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_PROBABILITY_in_setTraceProbability3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_tracingProbability_in_setTraceProbability3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyValuePairExpr3298 = new BitSet(new long[]{0x0000000000000002L,0x0000000101000000L});
    public static final BitSet FOLLOW_AND_in_keyValuePairExpr3303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_WITH_in_keyValuePairExpr3307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_keyValuePair_in_keyValuePairExpr3310 = new BitSet(new long[]{0x0000000000000002L,0x0000000101000000L});
    public static final BitSet FOLLOW_attr_name_in_keyValuePair3367 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_keyValuePair3369 = new BitSet(new long[]{0x0000000000000000L,0x0000000600E00000L,0x0000000000000024L});
    public static final BitSet FOLLOW_attrValue_in_keyValuePair3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayConstruct_in_attrValue3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashConstruct_in_attrValue3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueString_in_attrValue3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueInt_in_attrValue3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueDouble_in_attrValue3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_arrayConstruct3454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_hashConstruct_in_arrayConstruct3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_131_in_arrayConstruct3459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_132_in_arrayConstruct3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_hashConstruct3502 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct3504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_131_in_hashConstruct3507 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct3509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_134_in_hashConstruct3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowKey_in_hashElementPair3549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_hashElementPair3551 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rowValue_in_hashElementPair3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_columnFamilyExpr3590 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr3592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_columnFamilyExpr3594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_columnFamilyExpr3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_columnFamilyExpr3613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_columnFamilyExpr3629 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_columnFamilyExpr3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_keyRangeExpr3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L,0x0000000000000090L});
    public static final BitSet FOLLOW_entityName_in_keyRangeExpr3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_keyRangeExpr3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L,0x0000000000000010L});
    public static final BitSet FOLLOW_entityName_in_keyRangeExpr3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_keyRangeExpr3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_rowLimitExpr3754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowLimitExpr3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_columnLimitExpr3792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_columnLimitExpr3796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_reversedExpr_in_columnLimitExpr3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_reversedExpr3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_columnName3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_attr_name3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueString3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueInt0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_attrValueDouble3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyspace3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_replica_placement_strategy3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyspaceNewName3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_comparator4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_newColumnFamily4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_columnFamily4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_singleColumnFamilyExpr4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_entityName4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowKey4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowKey4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_rowKey4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowKey4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowValue4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowValue4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowValue4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_rowValue4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowValue4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashConstruct_in_rowValue4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_value4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_value4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_value4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_value4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall4261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_functionCall4263 = new BitSet(new long[]{0x0000000000000000L,0x0000000200E00000L,0x0000000000000800L});
    public static final BitSet FOLLOW_functionArgument_in_functionCall4265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_functionCall4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionArgument0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnOrSuperColumn4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_columnOrSuperColumn4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_columnOrSuperColumn4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_columnOrSuperColumn4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name4407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_host_name4410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_Identifier_in_host_name4412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_port4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrementValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_traceSessionId4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_tracingProbability4532 = new BitSet(new long[]{0x0000000000000002L});

}