package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConfiguratorModel'", "'{'", "'parameters'", "','", "'}'", "'constraints'", "'enums'", "'Parameter'", "'('", "'maxChosenValues'", "':'", "'minChosenValues'", "'enum'", "')'", "'children'", "'['", "']'", "'if'", "'then'", "'Enum'", "';'", "'-'", "'value'", "'.'", "'E'", "'e'", "'ParameterIdentifier'", "'parameter'", "'&&'", "'||'", "'!||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ConfiguratorModel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfiguratorModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleConfiguratorModel returns [EObject current=null] : iv_ruleConfiguratorModel= ruleConfiguratorModel EOF ;
    public final EObject entryRuleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguratorModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleConfiguratorModel= ruleConfiguratorModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleConfiguratorModel= ruleConfiguratorModel EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel75);
            iv_ruleConfiguratorModel=ruleConfiguratorModel();

            state._fsp--;

             current =iv_ruleConfiguratorModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguratorModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguratorModel"


    // $ANTLR start "ruleConfiguratorModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleConfiguratorModel returns [EObject current=null] : ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_constraints_14_0 = null;

        EObject lv_constraints_16_0 = null;

        EObject lv_enums_20_0 = null;

        EObject lv_enums_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfiguratorModelAccess().getConfiguratorModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConfiguratorModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getConfiguratorModelAccess().getConfiguratorModelKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfiguratorModel152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel164); 

                	newLeafNode(otherlv_3, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:1: (otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:3: otherlv_4= 'parameters' otherlv_5= '{' ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) ) (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )* otherlv_11= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfiguratorModel177); 

                        	newLeafNode(otherlv_4, grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel189); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ( ( (lv_parameters_6_0= ruleParameter2 ) ) | ( (lv_parameters_7_0= ruleParameter3 ) ) )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==18) ) {
                        int LA1_1 = input.LA(2);

                        if ( (LA1_1==RULE_STRING) ) {
                            int LA1_2 = input.LA(3);

                            if ( (LA1_2==19) ) {
                                int LA1_4 = input.LA(4);

                                if ( (LA1_4==20) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_4==25) ) {
                                    alt1=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 4, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 2, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_1==RULE_ID) ) {
                            int LA1_3 = input.LA(3);

                            if ( (LA1_3==19) ) {
                                int LA1_4 = input.LA(4);

                                if ( (LA1_4==20) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_4==25) ) {
                                    alt1=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 4, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:2: ( (lv_parameters_6_0= ruleParameter2 ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:2: ( (lv_parameters_6_0= ruleParameter2 ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:122:1: (lv_parameters_6_0= ruleParameter2 )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:122:1: (lv_parameters_6_0= ruleParameter2 )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:123:3: lv_parameters_6_0= ruleParameter2
                            {
                             
                            	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleParameter2_in_ruleConfiguratorModel211);
                            lv_parameters_6_0=ruleParameter2();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_6_0, 
                                    		"Parameter2");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:6: ( (lv_parameters_7_0= ruleParameter3 ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:6: ( (lv_parameters_7_0= ruleParameter3 ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:141:1: (lv_parameters_7_0= ruleParameter3 )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:141:1: (lv_parameters_7_0= ruleParameter3 )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:3: lv_parameters_7_0= ruleParameter3
                            {
                             
                            	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleParameter3_in_ruleConfiguratorModel238);
                            lv_parameters_7_0=ruleParameter3();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"Parameter3");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:3: (otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:5: otherlv_8= ',' ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel252); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:1: ( ( (lv_parameters_9_0= ruleParameter2 ) ) | ( (lv_parameters_10_0= ruleParameter3 ) ) )
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0==18) ) {
                    	        int LA2_1 = input.LA(2);

                    	        if ( (LA2_1==RULE_STRING) ) {
                    	            int LA2_2 = input.LA(3);

                    	            if ( (LA2_2==19) ) {
                    	                int LA2_4 = input.LA(4);

                    	                if ( (LA2_4==25) ) {
                    	                    alt2=2;
                    	                }
                    	                else if ( (LA2_4==20) ) {
                    	                    alt2=1;
                    	                }
                    	                else {
                    	                    NoViableAltException nvae =
                    	                        new NoViableAltException("", 2, 4, input);

                    	                    throw nvae;
                    	                }
                    	            }
                    	            else {
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 2, 2, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else if ( (LA2_1==RULE_ID) ) {
                    	            int LA2_3 = input.LA(3);

                    	            if ( (LA2_3==19) ) {
                    	                int LA2_4 = input.LA(4);

                    	                if ( (LA2_4==25) ) {
                    	                    alt2=2;
                    	                }
                    	                else if ( (LA2_4==20) ) {
                    	                    alt2=1;
                    	                }
                    	                else {
                    	                    NoViableAltException nvae =
                    	                        new NoViableAltException("", 2, 4, input);

                    	                    throw nvae;
                    	                }
                    	            }
                    	            else {
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 2, 3, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 2, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 2, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:2: ( (lv_parameters_9_0= ruleParameter2 ) )
                    	            {
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:2: ( (lv_parameters_9_0= ruleParameter2 ) )
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:1: (lv_parameters_9_0= ruleParameter2 )
                    	            {
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:1: (lv_parameters_9_0= ruleParameter2 )
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:3: lv_parameters_9_0= ruleParameter2
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_3_1_0_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleParameter2_in_ruleConfiguratorModel274);
                    	            lv_parameters_9_0=ruleParameter2();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"parameters",
                    	                    		lv_parameters_9_0, 
                    	                    		"Parameter2");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:181:6: ( (lv_parameters_10_0= ruleParameter3 ) )
                    	            {
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:181:6: ( (lv_parameters_10_0= ruleParameter3 ) )
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:182:1: (lv_parameters_10_0= ruleParameter3 )
                    	            {
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:182:1: (lv_parameters_10_0= ruleParameter3 )
                    	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:3: lv_parameters_10_0= ruleParameter3
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleParameter3_in_ruleConfiguratorModel301);
                    	            lv_parameters_10_0=ruleParameter3();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"parameters",
                    	                    		lv_parameters_10_0, 
                    	                    		"Parameter3");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel316); 

                        	newLeafNode(otherlv_11, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:3: (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:5: otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfiguratorModel331); 

                        	newLeafNode(otherlv_12, grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel343); 

                        	newLeafNode(otherlv_13, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:1: ( (lv_constraints_14_0= ruleConstraint ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_constraints_14_0= ruleConstraint )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_constraints_14_0= ruleConstraint )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:3: lv_constraints_14_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleConfiguratorModel364);
                    lv_constraints_14_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_14_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:2: (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:4: otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel377); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ( (lv_constraints_16_0= ruleConstraint ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_constraints_16_0= ruleConstraint )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_constraints_16_0= ruleConstraint )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:3: lv_constraints_16_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleConfiguratorModel398);
                    	    lv_constraints_16_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_16_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel412); 

                        	newLeafNode(otherlv_17, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:3: (otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:5: otherlv_18= 'enums' otherlv_19= '{' ( (lv_enums_20_0= ruleEnum ) ) (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConfiguratorModel427); 

                        	newLeafNode(otherlv_18, grammarAccess.getConfiguratorModelAccess().getEnumsKeyword_6_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel439); 

                        	newLeafNode(otherlv_19, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:1: ( (lv_enums_20_0= ruleEnum ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:1: (lv_enums_20_0= ruleEnum )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:1: (lv_enums_20_0= ruleEnum )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:265:3: lv_enums_20_0= ruleEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_ruleConfiguratorModel460);
                    lv_enums_20_0=ruleEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"enums",
                            		lv_enums_20_0, 
                            		"Enum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:2: (otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:4: otherlv_21= ',' ( (lv_enums_22_0= ruleEnum ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel473); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: ( (lv_enums_22_0= ruleEnum ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: (lv_enums_22_0= ruleEnum )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: (lv_enums_22_0= ruleEnum )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:3: lv_enums_22_0= ruleEnum
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_ruleConfiguratorModel494);
                    	    lv_enums_22_0=ruleEnum();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"enums",
                    	            		lv_enums_22_0, 
                    	            		"Enum");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel508); 

                        	newLeafNode(otherlv_23, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel522); 

                	newLeafNode(otherlv_24, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguratorModel"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:320:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue558);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:328:1: ruleValue returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DoubleLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:28: ( (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:1: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:1: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==EOF||LA9_2==14||LA9_2==31) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==34) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==34) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||LA9_2==14||LA9_2==31) ) {
                    alt9=1;
                }
                else if ( (LA9_2==34) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:5: this_IntLiteral_0= ruleIntLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntLiteralParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_ruleValue615);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;

                     
                            current = this_IntLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:5: this_DoubleLiteral_1= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_ruleValue642);
                    this_DoubleLiteral_1=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:5: this_StringLiteral_2= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleValue669);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_ruleValue696);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:380:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:381:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression731);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:1: ruleExpression returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression | this_IntLiteral_1= ruleIntLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_StringLiteral_3= ruleStringLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_ParameterIdentifier_5= ruleParameterIdentifier ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_BooleanLiteral_4 = null;

        EObject this_ParameterIdentifier_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:28: ( (this_BinaryExpression_0= ruleBinaryExpression | this_IntLiteral_1= ruleIntLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_StringLiteral_3= ruleStringLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_ParameterIdentifier_5= ruleParameterIdentifier ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:1: (this_BinaryExpression_0= ruleBinaryExpression | this_IntLiteral_1= ruleIntLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_StringLiteral_3= ruleStringLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_ParameterIdentifier_5= ruleParameterIdentifier )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:1: (this_BinaryExpression_0= ruleBinaryExpression | this_IntLiteral_1= ruleIntLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_StringLiteral_3= ruleStringLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_ParameterIdentifier_5= ruleParameterIdentifier )
            int alt10=6;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:5: this_BinaryExpression_0= ruleBinaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_ruleExpression788);
                    this_BinaryExpression_0=ruleBinaryExpression();

                    state._fsp--;

                     
                            current = this_BinaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:403:5: this_IntLiteral_1= ruleIntLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_ruleExpression815);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;

                     
                            current = this_IntLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:5: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getDoubleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_ruleExpression842);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleExpression869);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:5: this_BooleanLiteral_4= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBooleanLiteralParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_ruleExpression896);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:5: this_ParameterIdentifier_5= ruleParameterIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getParameterIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_ruleExpression923);
                    this_ParameterIdentifier_5=ruleParameterIdentifier();

                    state._fsp--;

                     
                            current = this_ParameterIdentifier_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString959);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString970); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1010); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1036); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter2"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:1: entryRuleParameter2 returns [EObject current=null] : iv_ruleParameter2= ruleParameter2 EOF ;
    public final EObject entryRuleParameter2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter2 = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:2: (iv_ruleParameter2= ruleParameter2 EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:2: iv_ruleParameter2= ruleParameter2 EOF
            {
             newCompositeNode(grammarAccess.getParameter2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter2_in_entryRuleParameter21081);
            iv_ruleParameter2=ruleParameter2();

            state._fsp--;

             current =iv_ruleParameter2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter21091); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter2"


    // $ANTLR start "ruleParameter2"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:1: ruleParameter2 returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) ) ) otherlv_7= ',' (otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) ) ) otherlv_11= ',' (otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) ) )? otherlv_15= ')' ) ;
    public final EObject ruleParameter2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_maxChosenValues_6_0 = null;

        AntlrDatatypeRuleToken lv_minChosenValues_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:28: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) ) ) otherlv_7= ',' (otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) ) ) otherlv_11= ',' (otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) ) )? otherlv_15= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) ) ) otherlv_7= ',' (otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) ) ) otherlv_11= ',' (otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) ) )? otherlv_15= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) ) ) otherlv_7= ',' (otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) ) ) otherlv_11= ',' (otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) ) )? otherlv_15= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:2: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) ) ) otherlv_7= ',' (otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) ) ) otherlv_11= ',' (otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) ) )? otherlv_15= ')'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameter2Access().getParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter21137); 

                	newLeafNode(otherlv_1, grammarAccess.getParameter2Access().getParameterKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:518:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameter2Access().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter21158);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameter2Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParameter21170); 

                	newLeafNode(otherlv_3, grammarAccess.getParameter2Access().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: (otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:3: otherlv_4= 'maxChosenValues' otherlv_5= ':' ( (lv_maxChosenValues_6_0= ruleEInt ) )
            {
            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleParameter21183); 

                	newLeafNode(otherlv_4, grammarAccess.getParameter2Access().getMaxChosenValuesKeyword_4_0());
                
            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter21195); 

                	newLeafNode(otherlv_5, grammarAccess.getParameter2Access().getColonKeyword_4_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:1: ( (lv_maxChosenValues_6_0= ruleEInt ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:1: (lv_maxChosenValues_6_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:1: (lv_maxChosenValues_6_0= ruleEInt )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:550:3: lv_maxChosenValues_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getParameter2Access().getMaxChosenValuesEIntParserRuleCall_4_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParameter21216);
            lv_maxChosenValues_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameter2Rule());
            	        }
                   		set(
                   			current, 
                   			"maxChosenValues",
                    		lv_maxChosenValues_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameter21229); 

                	newLeafNode(otherlv_7, grammarAccess.getParameter2Access().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:570:1: (otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:570:3: otherlv_8= 'minChosenValues' otherlv_9= ':' ( (lv_minChosenValues_10_0= ruleEInt ) )
            {
            otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter21242); 

                	newLeafNode(otherlv_8, grammarAccess.getParameter2Access().getMinChosenValuesKeyword_6_0());
                
            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter21254); 

                	newLeafNode(otherlv_9, grammarAccess.getParameter2Access().getColonKeyword_6_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:1: ( (lv_minChosenValues_10_0= ruleEInt ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: (lv_minChosenValues_10_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: (lv_minChosenValues_10_0= ruleEInt )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:3: lv_minChosenValues_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getParameter2Access().getMinChosenValuesEIntParserRuleCall_6_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParameter21275);
            lv_minChosenValues_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameter2Rule());
            	        }
                   		set(
                   			current, 
                   			"minChosenValues",
                    		lv_minChosenValues_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameter21288); 

                	newLeafNode(otherlv_11, grammarAccess.getParameter2Access().getCommaKeyword_7());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:1: (otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:3: otherlv_12= 'enum' otherlv_13= ':' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParameter21301); 

                        	newLeafNode(otherlv_12, grammarAccess.getParameter2Access().getEnumKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter21313); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameter2Access().getColonKeyword_8_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:608:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameter2Rule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getParameter2Access().getEnumEnumCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter21336);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter21350); 

                	newLeafNode(otherlv_15, grammarAccess.getParameter2Access().getRightParenthesisKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter2"


    // $ANTLR start "entryRuleParameter3"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:1: entryRuleParameter3 returns [EObject current=null] : iv_ruleParameter3= ruleParameter3 EOF ;
    public final EObject entryRuleParameter3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter3 = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:2: (iv_ruleParameter3= ruleParameter3 EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:2: iv_ruleParameter3= ruleParameter3 EOF
            {
             newCompositeNode(grammarAccess.getParameter3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter3_in_entryRuleParameter31386);
            iv_ruleParameter3=ruleParameter3();

            state._fsp--;

             current =iv_ruleParameter3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter31396); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter3"


    // $ANTLR start "ruleParameter3"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:644:1: ruleParameter3 returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' ) otherlv_11= ')' ) ;
    public final EObject ruleParameter3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:28: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' ) otherlv_11= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' ) otherlv_11= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' ) otherlv_11= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:2: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' (otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' ) otherlv_11= ')'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameter3Access().getParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter31442); 

                	newLeafNode(otherlv_1, grammarAccess.getParameter3Access().getParameterKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameter3Access().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter31463);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameter3Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParameter31475); 

                	newLeafNode(otherlv_3, grammarAccess.getParameter3Access().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:680:1: (otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:680:3: otherlv_4= 'children' otherlv_5= ':' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']'
            {
            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter31488); 

                	newLeafNode(otherlv_4, grammarAccess.getParameter3Access().getChildrenKeyword_4_0());
                
            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter31500); 

                	newLeafNode(otherlv_5, grammarAccess.getParameter3Access().getColonKeyword_4_1());
                
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleParameter31512); 

                	newLeafNode(otherlv_6, grammarAccess.getParameter3Access().getLeftSquareBracketKeyword_4_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameter3Rule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter31535);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameter31548); 

            	        	newLeafNode(otherlv_8, grammarAccess.getParameter3Access().getCommaKeyword_4_4_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:711:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getParameter3Rule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter31571);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleParameter31585); 

                	newLeafNode(otherlv_10, grammarAccess.getParameter3Access().getRightSquareBracketKeyword_4_5());
                

            }

            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter31598); 

                	newLeafNode(otherlv_11, grammarAccess.getParameter3Access().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter3"


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint1634);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint1644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:1: ruleConstraint returns [EObject current=null] : ( () (otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) ) ) (otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:28: ( ( () (otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) ) ) (otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: ( () (otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) ) ) (otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: ( () (otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) ) ) (otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:2: () (otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) ) ) (otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstraintAccess().getConstraintAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:2: (otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:4: otherlv_1= 'if' ( (lv_if_2_0= ruleBinaryExpression ) )
            {
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleConstraint1691); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getIfKeyword_1_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: ( (lv_if_2_0= ruleBinaryExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:1: (lv_if_2_0= ruleBinaryExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:1: (lv_if_2_0= ruleBinaryExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:767:3: lv_if_2_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getIfBinaryExpressionParserRuleCall_1_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_ruleConstraint1712);
            lv_if_2_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"if",
                    		lv_if_2_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:3: (otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:5: otherlv_3= 'then' ( (lv_then_4_0= ruleBinaryExpression ) )
            {
            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleConstraint1726); 

                	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getThenKeyword_2_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:1: ( (lv_then_4_0= ruleBinaryExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_then_4_0= ruleBinaryExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_then_4_0= ruleBinaryExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:3: lv_then_4_0= ruleBinaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getThenBinaryExpressionParserRuleCall_2_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_ruleConstraint1747);
            lv_then_4_0=ruleBinaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"then",
                    		lv_then_4_0, 
                    		"BinaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum1784);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum1794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:822:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_values_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleValue ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_values_3_0 = null;

        EObject lv_values_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:825:28: ( (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_values_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleValue ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:1: (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_values_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleValue ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:1: (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_values_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleValue ) ) )* otherlv_6= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:3: otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_values_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleValue ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEnum1831); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnum1852);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEnum1864); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: ( (lv_values_3_0= ruleValue ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:1: (lv_values_3_0= ruleValue )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:1: (lv_values_3_0= ruleValue )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:3: lv_values_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleEnum1885);
            lv_values_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:2: (otherlv_4= ',' ( (lv_values_5_0= ruleValue ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:4: otherlv_4= ',' ( (lv_values_5_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEnum1898); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:1: ( (lv_values_5_0= ruleValue ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:1: (lv_values_5_0= ruleValue )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:1: (lv_values_5_0= ruleValue )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:3: lv_values_5_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleEnum1919);
            	    lv_values_5_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEnum1933); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:904:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:906:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1970);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:913:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEInt2020); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2037); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:938:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:939:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:940:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2082);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntLiteral2092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:947:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) )? ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:28: ( ( () ( (lv_value_1_0= ruleEInt ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:1: ( () ( (lv_value_1_0= ruleEInt ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:1: ( () ( (lv_value_1_0= ruleEInt ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:2: () ( (lv_value_1_0= ruleEInt ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: ( (lv_value_1_0= ruleEInt ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: (lv_value_1_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: (lv_value_1_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:959:3: lv_value_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntLiteralAccess().getValueEIntParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntLiteral2147);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:985:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral2184);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleLiteral2194); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: ruleDoubleLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEDouble ) )? ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:28: ( ( () ( (lv_value_1_0= ruleEDouble ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:1: ( () ( (lv_value_1_0= ruleEDouble ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:1: ( () ( (lv_value_1_0= ruleEDouble ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:2: () ( (lv_value_1_0= ruleEDouble ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleLiteralAccess().getDoubleLiteralAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:2: ( (lv_value_1_0= ruleEDouble ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==32||LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: (lv_value_1_0= ruleEDouble )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: (lv_value_1_0= ruleEDouble )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:3: lv_value_1_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoubleLiteralAccess().getValueEDoubleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDoubleLiteral2249);
                    lv_value_1_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2286);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral2296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) )? ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:28: ( ( () ( (lv_value_1_0= ruleEString ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: ( () ( (lv_value_1_0= ruleEString ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: ( () ( (lv_value_1_0= ruleEString ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:2: () ( (lv_value_1_0= ruleEString ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1047:2: ( (lv_value_1_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1048:1: (lv_value_1_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1048:1: (lv_value_1_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:3: lv_value_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringLiteral2351);
                    lv_value_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2388);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral2398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:28: ( ( () ( (lv_value_1_0= 'value' ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:1: ( () ( (lv_value_1_0= 'value' ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:1: ( () ( (lv_value_1_0= 'value' ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:2: () ( (lv_value_1_0= 'value' ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:2: ( (lv_value_1_0= 'value' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:1: (lv_value_1_0= 'value' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:1: (lv_value_1_0= 'value' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:3: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBooleanLiteral2450); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueValueKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, "value");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1117:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2501);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1127:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble2551); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:3: (this_INT_1= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2569); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble2589); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2604); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=35 && LA24_0<=36)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:2: (kw= 'E' | kw= 'e' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==35) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==36) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:2: kw= 'E'
                            {
                            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDouble2624); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1162:2: kw= 'e'
                            {
                            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEDouble2643); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1167:2: (kw= '-' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:2: kw= '-'
                            {
                            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble2658); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2675); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleBinaryExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:2: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression2724);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryExpression2734); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:1: ruleBinaryExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1202:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleExpression ) ) otherlv_4= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryExpression2771); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1207:1: ( (lv_leftOperand_1_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: (lv_leftOperand_1_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: (lv_leftOperand_1_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:3: lv_leftOperand_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftOperandExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBinaryExpression2792);
            lv_leftOperand_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:2: ( (lv_operator_2_0= ruleBinaryOperator ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: (lv_operator_2_0= ruleBinaryOperator )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: (lv_operator_2_0= ruleBinaryOperator )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:3: lv_operator_2_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_ruleBinaryExpression2813);
            lv_operator_2_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:2: ( (lv_rightOperand_3_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:1: (lv_rightOperand_3_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:1: (lv_rightOperand_3_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:3: lv_rightOperand_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightOperandExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBinaryExpression2834);
            lv_rightOperand_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBinaryExpression2846); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleParameterIdentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:1: entryRuleParameterIdentifier returns [EObject current=null] : iv_ruleParameterIdentifier= ruleParameterIdentifier EOF ;
    public final EObject entryRuleParameterIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIdentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:2: (iv_ruleParameterIdentifier= ruleParameterIdentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:2: iv_ruleParameterIdentifier= ruleParameterIdentifier EOF
            {
             newCompositeNode(grammarAccess.getParameterIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier2882);
            iv_ruleParameterIdentifier=ruleParameterIdentifier();

            state._fsp--;

             current =iv_ruleParameterIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterIdentifier2892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterIdentifier"


    // $ANTLR start "ruleParameterIdentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:1: ruleParameterIdentifier returns [EObject current=null] : (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:28: ( (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:1: (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:1: (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:3: otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleParameterIdentifier2929); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterIdentifierAccess().getParameterIdentifierKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterIdentifier2941); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterIdentifierAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleParameterIdentifier2953); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterIdentifierAccess().getParameterKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterIdentifier2976);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParameterIdentifier2988); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterIdentifierAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterIdentifier"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) ) ;
    public final Enumerator ruleBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) )
            int alt25=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
                {
                alt25=4;
                }
                break;
            case 43:
                {
                alt25=5;
                }
                break;
            case 44:
                {
                alt25=6;
                }
                break;
            case 45:
                {
                alt25=7;
                }
                break;
            case 46:
                {
                alt25=8;
                }
                break;
            case 47:
                {
                alt25=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:2: (enumLiteral_0= '&&' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:2: (enumLiteral_0= '&&' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBinaryOperator3038); 

                            current = grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:6: (enumLiteral_1= '||' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:6: (enumLiteral_1= '||' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBinaryOperator3055); 

                            current = grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:6: (enumLiteral_2= '!||' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:6: (enumLiteral_2= '!||' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:8: enumLiteral_2= '!||'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBinaryOperator3072); 

                            current = grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:6: (enumLiteral_3= '==' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:6: (enumLiteral_3= '==' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:8: enumLiteral_3= '=='
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBinaryOperator3089); 

                            current = grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:6: (enumLiteral_4= '!=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:6: (enumLiteral_4= '!=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:8: enumLiteral_4= '!='
                    {
                    enumLiteral_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBinaryOperator3106); 

                            current = grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:6: (enumLiteral_5= '>' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:6: (enumLiteral_5= '>' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:8: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBinaryOperator3123); 

                            current = grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:6: (enumLiteral_6= '<' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:6: (enumLiteral_6= '<' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:8: enumLiteral_6= '<'
                    {
                    enumLiteral_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBinaryOperator3140); 

                            current = grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:6: (enumLiteral_7= '>=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:6: (enumLiteral_7= '>=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:8: enumLiteral_7= '>='
                    {
                    enumLiteral_7=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBinaryOperator3157); 

                            current = grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:6: (enumLiteral_8= '<=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:6: (enumLiteral_8= '<=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:8: enumLiteral_8= '<='
                    {
                    enumLiteral_8=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleBinaryOperator3174); 

                            current = grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperator"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\23\uffff";
    static final String DFA10_eofS =
        "\1\4\2\uffff\1\16\17\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\1\6\1\30\17\uffff";
    static final String DFA10_maxS =
        "\1\57\1\uffff\1\42\1\57\17\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\2\uffff\13\2\1\3\1\4\1\5\1\6";
    static final String DFA10_specialS =
        "\23\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\20\1\3\14\uffff\1\1\4\uffff\1\16\7\uffff\1\2\1\21\1\17\2"+
            "\uffff\1\22\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "\1\3\33\uffff\1\17",
            "\1\16\11\uffff\1\17\4\uffff\11\16",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "392:1: (this_BinaryExpression_0= ruleBinaryExpression | this_IntLiteral_1= ruleIntLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_StringLiteral_3= ruleStringLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_ParameterIdentifier_5= ruleParameterIdentifier )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguratorModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfiguratorModel131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfiguratorModel152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel164 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleConfiguratorModel177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel189 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleParameter2_in_ruleConfiguratorModel211 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_ruleParameter3_in_ruleConfiguratorModel238 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel252 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleParameter2_in_ruleConfiguratorModel274 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_ruleParameter3_in_ruleConfiguratorModel301 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel316 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_ruleConfiguratorModel331 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel343 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleConfiguratorModel364 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel377 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleConfiguratorModel398 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel412 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleConfiguratorModel427 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel439 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleEnum_in_ruleConfiguratorModel460 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel473 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleEnum_in_ruleConfiguratorModel494 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel508 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_ruleValue615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_ruleValue642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValue669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleValue696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleExpression788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_ruleExpression815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_ruleExpression842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleExpression896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_ruleExpression923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter2_in_entryRuleParameter21081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter21091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParameter21137 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter21158 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleParameter21170 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleParameter21183 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter21195 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParameter21216 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParameter21229 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParameter21242 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter21254 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParameter21275 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParameter21288 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleParameter21301 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter21313 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter21336 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParameter21350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter3_in_entryRuleParameter31386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter31396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParameter31442 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter31463 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleParameter31475 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParameter31488 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter31500 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleParameter31512 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter31535 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleParameter31548 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter31571 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleParameter31585 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParameter31598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleConstraint1691 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleConstraint1712 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleConstraint1726 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_ruleConstraint1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEnum1831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnum1852 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEnum1864 = new BitSet(new long[]{0x0000000700000070L});
        public static final BitSet FOLLOW_ruleValue_in_ruleEnum1885 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_14_in_ruleEnum1898 = new BitSet(new long[]{0x0000000700000070L});
        public static final BitSet FOLLOW_ruleValue_in_ruleEnum1919 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_31_in_ruleEnum1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1970 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEInt2020 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntLiteral2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral2184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDoubleLiteral2249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringLiteral2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleBooleanLiteral2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEDouble2551 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2569 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleEDouble2589 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2604 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_ruleEDouble2624 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_36_in_ruleEDouble2643 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_32_in_ruleEDouble2658 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression2724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpression2734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleBinaryExpression2771 = new BitSet(new long[]{0x0000002700080070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBinaryExpression2792 = new BitSet(new long[]{0x0000FF8000000000L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryExpression2813 = new BitSet(new long[]{0x0000002700080070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBinaryExpression2834 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBinaryExpression2846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier2882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterIdentifier2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleParameterIdentifier2929 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterIdentifier2941 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleParameterIdentifier2953 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterIdentifier2976 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParameterIdentifier2988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBinaryOperator3038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleBinaryOperator3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleBinaryOperator3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBinaryOperator3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBinaryOperator3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBinaryOperator3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleBinaryOperator3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleBinaryOperator3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleBinaryOperator3174 = new BitSet(new long[]{0x0000000000000002L});
    }


}