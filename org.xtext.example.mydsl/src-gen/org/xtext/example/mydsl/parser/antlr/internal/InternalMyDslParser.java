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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "','", "'}'", "'ConfiguratorModel'", "'parameters'", "'constraints'", "'Parameter'", "'('", "'minChosenValues'", "':'", "'maxChosenValues'", "')'", "'-'", "'['", "']'", "'int'", "'double'", "'String'", "'String.'", "'boolean'", "'.'", "'E'", "'e'", "'true'", "'false'", "'&&'", "'||'", "'!||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
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
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= '{' ( (lv_configuratorModels_3_0= ruleConfiguratorModel ) ) (otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) ) )* otherlv_6= '}' otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_configuratorModels_3_0 = null;

        EObject lv_configuratorModels_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= '{' ( (lv_configuratorModels_3_0= ruleConfiguratorModel ) ) (otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) ) )* otherlv_6= '}' otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= '{' ( (lv_configuratorModels_3_0= ruleConfiguratorModel ) ) (otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) ) )* otherlv_6= '}' otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Model' otherlv_1= '{' otherlv_2= '{' ( (lv_configuratorModels_3_0= ruleConfiguratorModel ) ) (otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) ) )* otherlv_6= '}' otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:3: otherlv_0= 'Model' otherlv_1= '{' otherlv_2= '{' ( (lv_configuratorModels_3_0= ruleConfiguratorModel ) ) (otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) ) )* otherlv_6= '}' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel146); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: ( (lv_configuratorModels_3_0= ruleConfiguratorModel ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: (lv_configuratorModels_3_0= ruleConfiguratorModel )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: (lv_configuratorModels_3_0= ruleConfiguratorModel )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:3: lv_configuratorModels_3_0= ruleConfiguratorModel
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_ruleModel167);
            lv_configuratorModels_3_0=ruleConfiguratorModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"configuratorModels",
                    		lv_configuratorModels_3_0, 
                    		"ConfiguratorModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:2: (otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:4: otherlv_4= ',' ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel180); 

            	        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ( (lv_configuratorModels_5_0= ruleConfiguratorModel ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_configuratorModels_5_0= ruleConfiguratorModel )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_configuratorModels_5_0= ruleConfiguratorModel )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:3: lv_configuratorModels_5_0= ruleConfiguratorModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_ruleModel201);
            	    lv_configuratorModels_5_0=ruleConfiguratorModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"configuratorModels",
            	            		lv_configuratorModels_5_0, 
            	            		"ConfiguratorModel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel215); 

                	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel227); 

                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:150:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint263);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint273); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:1: ruleConstraint returns [EObject current=null] : (this_BinaryConstraint_0= ruleBinaryConstraint | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean | this_ParameterIdentifier_5= ruleParameterIdentifier ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryConstraint_0 = null;

        EObject this_Integer_1 = null;

        EObject this_Double_2 = null;

        EObject this_Stringg_3 = null;

        EObject this_Boolean_4 = null;

        EObject this_ParameterIdentifier_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:28: ( (this_BinaryConstraint_0= ruleBinaryConstraint | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean | this_ParameterIdentifier_5= ruleParameterIdentifier ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean | this_ParameterIdentifier_5= ruleParameterIdentifier )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean | this_ParameterIdentifier_5= ruleParameterIdentifier )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_INT) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==32) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==EOF||(LA2_4>=13 && LA2_4<=14)||LA2_4==23||(LA2_4>=37 && LA2_4<=45)) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_3==32) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==32) ) {
                    alt2=3;
                }
                else if ( (LA2_4==EOF||(LA2_4>=13 && LA2_4<=14)||LA2_4==23||(LA2_4>=37 && LA2_4<=45)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 32:
                {
                alt2=3;
                }
                break;
            case 29:
            case 30:
                {
                alt2=4;
                }
                break;
            case 31:
            case 35:
            case 36:
                {
                alt2=5;
                }
                break;
            case RULE_ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:5: this_BinaryConstraint_0= ruleBinaryConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBinaryConstraintParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_ruleConstraint320);
                    this_BinaryConstraint_0=ruleBinaryConstraint();

                    state._fsp--;

                     
                            current = this_BinaryConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:5: this_Integer_1= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getIntegerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleConstraint347);
                    this_Integer_1=ruleInteger();

                    state._fsp--;

                     
                            current = this_Integer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:5: this_Double_2= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDoubleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_ruleConstraint374);
                    this_Double_2=ruleDouble();

                    state._fsp--;

                     
                            current = this_Double_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:5: this_Stringg_3= ruleStringg
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getStringgParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringg_in_ruleConstraint401);
                    this_Stringg_3=ruleStringg();

                    state._fsp--;

                     
                            current = this_Stringg_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:5: this_Boolean_4= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBooleanParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleConstraint428);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:5: this_ParameterIdentifier_5= ruleParameterIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getParameterIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_ruleConstraint455);
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType490);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType500); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:1: ruleType returns [EObject current=null] : (this_Enum_0= ruleEnum | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_Integer_1 = null;

        EObject this_Double_2 = null;

        EObject this_Stringg_3 = null;

        EObject this_Boolean_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:28: ( (this_Enum_0= ruleEnum | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:1: (this_Enum_0= ruleEnum | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:1: (this_Enum_0= ruleEnum | this_Integer_1= ruleInteger | this_Double_2= ruleDouble | this_Stringg_3= ruleStringg | this_Boolean_4= ruleBoolean )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_INT) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==EOF||(LA3_4>=12 && LA3_4<=14)) ) {
                        alt3=2;
                    }
                    else if ( (LA3_4==32) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_3==32) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==EOF||(LA3_4>=12 && LA3_4<=14)) ) {
                    alt3=2;
                }
                else if ( (LA3_4==32) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 32:
                {
                alt3=3;
                }
                break;
            case 29:
            case 30:
                {
                alt3=4;
                }
                break;
            case 31:
            case 35:
            case 36:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:5: this_Enum_0= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_ruleType547);
                    this_Enum_0=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:253:5: this_Integer_1= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleType574);
                    this_Integer_1=ruleInteger();

                    state._fsp--;

                     
                            current = this_Integer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:5: this_Double_2= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_ruleType601);
                    this_Double_2=ruleDouble();

                    state._fsp--;

                     
                            current = this_Double_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:5: this_Stringg_3= ruleStringg
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringgParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringg_in_ruleType628);
                    this_Stringg_3=ruleStringg();

                    state._fsp--;

                     
                            current = this_Stringg_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:5: this_Boolean_4= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleType655);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_4; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral690);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral700); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:308:1: ruleLiteral returns [EObject current=null] : (this_Integer_0= ruleInteger | this_Double_1= ruleDouble | this_Stringg_2= ruleStringg | this_Boolean_3= ruleBoolean ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Integer_0 = null;

        EObject this_Double_1 = null;

        EObject this_Stringg_2 = null;

        EObject this_Boolean_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:28: ( (this_Integer_0= ruleInteger | this_Double_1= ruleDouble | this_Stringg_2= ruleStringg | this_Boolean_3= ruleBoolean ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (this_Integer_0= ruleInteger | this_Double_1= ruleDouble | this_Stringg_2= ruleStringg | this_Boolean_3= ruleBoolean )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (this_Integer_0= ruleInteger | this_Double_1= ruleDouble | this_Stringg_2= ruleStringg | this_Boolean_3= ruleBoolean )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_INT) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==32) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==EOF||LA4_3==13||LA4_3==26) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==32) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==32) ) {
                    alt4=2;
                }
                else if ( (LA4_3==EOF||LA4_3==13||LA4_3==26) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 32:
                {
                alt4=2;
                }
                break;
            case 29:
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
            case 35:
            case 36:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:5: this_Integer_0= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getIntegerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleLiteral747);
                    this_Integer_0=ruleInteger();

                    state._fsp--;

                     
                            current = this_Integer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:323:5: this_Double_1= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getDoubleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_ruleLiteral774);
                    this_Double_1=ruleDouble();

                    state._fsp--;

                     
                            current = this_Double_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:5: this_Stringg_2= ruleStringg
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringgParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringg_in_ruleLiteral801);
                    this_Stringg_2=ruleStringg();

                    state._fsp--;

                     
                            current = this_Stringg_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:5: this_Boolean_3= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleLiteral828);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_3; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleConfiguratorModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: entryRuleConfiguratorModel returns [EObject current=null] : iv_ruleConfiguratorModel= ruleConfiguratorModel EOF ;
    public final EObject entryRuleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguratorModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:2: (iv_ruleConfiguratorModel= ruleConfiguratorModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:2: iv_ruleConfiguratorModel= ruleConfiguratorModel EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel863);
            iv_ruleConfiguratorModel=ruleConfiguratorModel();

            state._fsp--;

             current =iv_ruleConfiguratorModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguratorModel873); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: ruleConfiguratorModel returns [EObject current=null] : ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_constraints_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:371:28: ( ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: ( () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:2: () otherlv_1= 'ConfiguratorModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfiguratorModelAccess().getConfiguratorModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel919); 

                	newLeafNode(otherlv_1, grammarAccess.getConfiguratorModelAccess().getConfiguratorModelKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfiguratorModel940);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel952); 

                	newLeafNode(otherlv_3, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:1: (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:3: otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfiguratorModel965); 

                        	newLeafNode(otherlv_4, grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel977); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:412:1: ( (lv_parameters_6_0= ruleParameter ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:1: (lv_parameters_6_0= ruleParameter )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:1: (lv_parameters_6_0= ruleParameter )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:3: lv_parameters_6_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleConfiguratorModel998);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_6_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfiguratorModel1011); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: ( (lv_parameters_8_0= ruleParameter ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:1: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:1: (lv_parameters_8_0= ruleParameter )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:3: lv_parameters_8_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleConfiguratorModel1032);
                    	    lv_parameters_8_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel1046); 

                        	newLeafNode(otherlv_9, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:456:3: (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:456:5: otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConfiguratorModel1061); 

                        	newLeafNode(otherlv_10, grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel1073); 

                        	newLeafNode(otherlv_11, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: ( (lv_constraints_12_0= ruleConstraint ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_constraints_12_0= ruleConstraint )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_constraints_12_0= ruleConstraint )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:3: lv_constraints_12_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleConfiguratorModel1094);
                    lv_constraints_12_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_12_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:2: (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:4: otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfiguratorModel1107); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:486:1: ( (lv_constraints_14_0= ruleConstraint ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (lv_constraints_14_0= ruleConstraint )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (lv_constraints_14_0= ruleConstraint )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:3: lv_constraints_14_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleConfiguratorModel1128);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel1142); 

                        	newLeafNode(otherlv_15, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel1156); 

                	newLeafNode(otherlv_16, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1193);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1204); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1244); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1270); 

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


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1315);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1325); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' (otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) ) ) otherlv_6= ',' (otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) ) ) otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) (otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_minChosenValues_5_0 = null;

        AntlrDatatypeRuleToken lv_maxChosenValues_9_0 = null;

        EObject lv_type_12_0 = null;

        EObject lv_children_14_0 = null;

        EObject lv_children_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:28: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' (otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) ) ) otherlv_6= ',' (otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) ) ) otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) (otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:1: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' (otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) ) ) otherlv_6= ',' (otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) ) ) otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) (otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:1: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' (otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) ) ) otherlv_6= ',' (otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) ) ) otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) (otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' (otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) ) ) otherlv_6= ',' (otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) ) ) otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) (otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter1362); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter1383);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParameter1395); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:1: (otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:3: otherlv_3= 'minChosenValues' otherlv_4= ':' ( (lv_minChosenValues_5_0= ruleEInt ) )
            {
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleParameter1408); 

                	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getMinChosenValuesKeyword_3_0());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter1420); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_3_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: ( (lv_minChosenValues_5_0= ruleEInt ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_minChosenValues_5_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_minChosenValues_5_0= ruleEInt )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:3: lv_minChosenValues_5_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getMinChosenValuesEIntParserRuleCall_3_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParameter1441);
            lv_minChosenValues_5_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"minChosenValues",
                    		lv_minChosenValues_5_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter1454); 

                	newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:1: (otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:3: otherlv_7= 'maxChosenValues' otherlv_8= ':' ( (lv_maxChosenValues_9_0= ruleEInt ) )
            {
            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter1467); 

                	newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getMaxChosenValuesKeyword_5_0());
                
            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter1479); 

                	newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getColonKeyword_5_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:633:1: ( (lv_maxChosenValues_9_0= ruleEInt ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:1: (lv_maxChosenValues_9_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:1: (lv_maxChosenValues_9_0= ruleEInt )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:3: lv_maxChosenValues_9_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getMaxChosenValuesEIntParserRuleCall_5_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParameter1500);
            lv_maxChosenValues_9_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"maxChosenValues",
                    		lv_maxChosenValues_9_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParameter1513); 

                	newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getRightParenthesisKeyword_6());
                
            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter1525); 

                	newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getColonKeyword_7());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: ( (lv_type_12_0= ruleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:1: (lv_type_12_0= ruleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:1: (lv_type_12_0= ruleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:3: lv_type_12_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleParameter1546);
            lv_type_12_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_12_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:2: (otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:4: otherlv_13= '{' ( (lv_children_14_0= ruleParameter ) ) (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter1559); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:1: ( (lv_children_14_0= ruleParameter ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:1: (lv_children_14_0= ruleParameter )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:1: (lv_children_14_0= ruleParameter )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:3: lv_children_14_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getChildrenParameterParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameter1580);
                    lv_children_14_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"children",
                            		lv_children_14_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:2: (otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:4: otherlv_15= ',' ( (lv_children_16_0= ruleParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter1593); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getParameterAccess().getCommaKeyword_9_2_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: ( (lv_children_16_0= ruleParameter ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:1: (lv_children_16_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:1: (lv_children_16_0= ruleParameter )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:3: lv_children_16_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getChildrenParameterParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameter1614);
                    	    lv_children_16_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_16_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameter1628); 

                        	newLeafNode(otherlv_17, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_9_3());
                        

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1667);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1678); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:747:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt1717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1734); 

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


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:767:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:768:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum1779);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum1789); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:1: ruleEnum returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:1: (otherlv_0= '[' ( (lv_values_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:1: (otherlv_0= '[' ( (lv_values_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:3: otherlv_0= '[' ( (lv_values_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnum1826); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:1: ( (lv_values_1_0= ruleLiteral ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:1: (lv_values_1_0= ruleLiteral )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:1: (lv_values_1_0= ruleLiteral )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:3: lv_values_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleEnum1847);
            lv_values_1_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:2: (otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:4: otherlv_2= ',' ( (lv_values_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnum1860); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:1: ( (lv_values_3_0= ruleLiteral ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:1: (lv_values_3_0= ruleLiteral )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:1: (lv_values_3_0= ruleLiteral )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:3: lv_values_3_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleEnum1881);
            	    lv_values_3_0=ruleLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"Literal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEnum1895); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightSquareBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleInteger"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1931);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1941); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:845:1: ruleInteger returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:848:28: ( ( ( () otherlv_1= 'int' ) | ( (lv_value_2_0= ruleEInt ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:1: ( ( () otherlv_1= 'int' ) | ( (lv_value_2_0= ruleEInt ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:1: ( ( () otherlv_1= 'int' ) | ( (lv_value_2_0= ruleEInt ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT||LA14_0==24) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:2: ( () otherlv_1= 'int' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:2: ( () otherlv_1= 'int' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:3: () otherlv_1= 'int'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getIntegerAccess().getIntegerAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInteger1988); 

                        	newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:6: ( (lv_value_2_0= ruleEInt ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:6: ( (lv_value_2_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:1: (lv_value_2_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:1: (lv_value_2_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:862:3: lv_value_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInteger2016);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:2: (iv_ruleDouble= ruleDouble EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble2052);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble2062); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: ruleDouble returns [EObject current=null] : ( ( () otherlv_1= 'double' ) | ( (lv_value_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:898:28: ( ( ( () otherlv_1= 'double' ) | ( (lv_value_2_0= ruleEDouble ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:1: ( ( () otherlv_1= 'double' ) | ( (lv_value_2_0= ruleEDouble ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:1: ( ( () otherlv_1= 'double' ) | ( (lv_value_2_0= ruleEDouble ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT||LA15_0==24||LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:2: ( () otherlv_1= 'double' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:2: ( () otherlv_1= 'double' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:3: () otherlv_1= 'double'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:900:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDoubleAccess().getDoubleAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDouble2109); 

                        	newLeafNode(otherlv_1, grammarAccess.getDoubleAccess().getDoubleKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:6: ( (lv_value_2_0= ruleEDouble ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:6: ( (lv_value_2_0= ruleEDouble ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: (lv_value_2_0= ruleEDouble )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: (lv_value_2_0= ruleEDouble )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:3: lv_value_2_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDouble2137);
                    lv_value_2_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDoubleRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleStringg"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:1: entryRuleStringg returns [EObject current=null] : iv_ruleStringg= ruleStringg EOF ;
    public final EObject entryRuleStringg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringg = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:937:2: (iv_ruleStringg= ruleStringg EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:938:2: iv_ruleStringg= ruleStringg EOF
            {
             newCompositeNode(grammarAccess.getStringgRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringg_in_entryRuleStringg2173);
            iv_ruleStringg=ruleStringg();

            state._fsp--;

             current =iv_ruleStringg; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringg2183); 

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
    // $ANTLR end "entryRuleStringg"


    // $ANTLR start "ruleStringg"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: ruleStringg returns [EObject current=null] : ( ( () otherlv_1= 'String' ) | (otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) ) ) ) ;
    public final EObject ruleStringg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:28: ( ( ( () otherlv_1= 'String' ) | (otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:1: ( ( () otherlv_1= 'String' ) | (otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:1: ( ( () otherlv_1= 'String' ) | (otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:2: ( () otherlv_1= 'String' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:2: ( () otherlv_1= 'String' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:3: () otherlv_1= 'String'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringgAccess().getStringgAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStringg2230); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringgAccess().getStringKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:6: (otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:6: (otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:8: otherlv_2= 'String.' ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleStringg2250); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringgAccess().getStringKeyword_1_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: ( (lv_value_3_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_value_3_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_value_3_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:3: lv_value_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringgAccess().getValueEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringg2271);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringgRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleStringg"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean2308);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean2318); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:999:1: ruleBoolean returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( (lv_value_2_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:28: ( ( ( () otherlv_1= 'boolean' ) | ( (lv_value_2_0= ruleEBoolean ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: ( ( () otherlv_1= 'boolean' ) | ( (lv_value_2_0= ruleEBoolean ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: ( ( () otherlv_1= 'boolean' ) | ( (lv_value_2_0= ruleEBoolean ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=35 && LA17_0<=36)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:2: ( () otherlv_1= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:2: ( () otherlv_1= 'boolean' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:3: () otherlv_1= 'boolean'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBooleanAccess().getBooleanAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBoolean2365); 

                        	newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:6: ( (lv_value_2_0= ruleEBoolean ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:6: ( (lv_value_2_0= ruleEBoolean ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:1: (lv_value_2_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:1: (lv_value_2_0= ruleEBoolean )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1016:3: lv_value_2_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBoolean2393);
                    lv_value_2_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2430);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2441); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble2480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:3: (this_INT_1= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2498); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble2518); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2533); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=34)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:2: (kw= 'E' | kw= 'e' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==33) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==34) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:2: kw= 'E'
                            {
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEDouble2553); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:2: kw= 'e'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble2572); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:2: (kw= '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==24) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:2: kw= '-'
                            {
                            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble2587); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2604); 

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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2652);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2663); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:1: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1127:2: kw= 'true'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEBoolean2701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:2: kw= 'false'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEBoolean2720); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleBinaryConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:1: entryRuleBinaryConstraint returns [EObject current=null] : iv_ruleBinaryConstraint= ruleBinaryConstraint EOF ;
    public final EObject entryRuleBinaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:2: (iv_ruleBinaryConstraint= ruleBinaryConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:2: iv_ruleBinaryConstraint= ruleBinaryConstraint EOF
            {
             newCompositeNode(grammarAccess.getBinaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint2760);
            iv_ruleBinaryConstraint=ruleBinaryConstraint();

            state._fsp--;

             current =iv_ruleBinaryConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryConstraint2770); 

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
    // $ANTLR end "entryRuleBinaryConstraint"


    // $ANTLR start "ruleBinaryConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:1: ruleBinaryConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleConstraint ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleConstraint ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleConstraint ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleConstraint ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleConstraint ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleConstraint ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleConstraint ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleConstraint ) ) otherlv_4= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleConstraint ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightOperand_3_0= ruleConstraint ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryConstraint2807); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryConstraintAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:1: ( (lv_leftOperand_1_0= ruleConstraint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: (lv_leftOperand_1_0= ruleConstraint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: (lv_leftOperand_1_0= ruleConstraint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1166:3: lv_leftOperand_1_0= ruleConstraint
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getLeftOperandConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleBinaryConstraint2828);
            lv_leftOperand_1_0=ruleConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_1_0, 
                    		"Constraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1182:2: ( (lv_operator_2_0= ruleBinaryOperator ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1183:1: (lv_operator_2_0= ruleBinaryOperator )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1183:1: (lv_operator_2_0= ruleBinaryOperator )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:3: lv_operator_2_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_ruleBinaryConstraint2849);
            lv_operator_2_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:2: ( (lv_rightOperand_3_0= ruleConstraint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:1: (lv_rightOperand_3_0= ruleConstraint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:1: (lv_rightOperand_3_0= ruleConstraint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1202:3: lv_rightOperand_3_0= ruleConstraint
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getRightOperandConstraintParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleBinaryConstraint2870);
            lv_rightOperand_3_0=ruleConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"Constraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryConstraint2882); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryConstraintAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleBinaryConstraint"


    // $ANTLR start "entryRuleParameterIdentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:1: entryRuleParameterIdentifier returns [EObject current=null] : iv_ruleParameterIdentifier= ruleParameterIdentifier EOF ;
    public final EObject entryRuleParameterIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIdentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:2: (iv_ruleParameterIdentifier= ruleParameterIdentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1232:2: iv_ruleParameterIdentifier= ruleParameterIdentifier EOF
            {
             newCompositeNode(grammarAccess.getParameterIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier2918);
            iv_ruleParameterIdentifier=ruleParameterIdentifier();

            state._fsp--;

             current =iv_ruleParameterIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterIdentifier2928); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: ruleParameterIdentifier returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterIdentifier2972); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_0()); 
            	

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
    // $ANTLR end "ruleParameterIdentifier"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) | (enumLiteral_2= '!||' ) | (enumLiteral_3= '==' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '<' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<=' ) )
            int alt24=9;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 39:
                {
                alt24=3;
                }
                break;
            case 40:
                {
                alt24=4;
                }
                break;
            case 41:
                {
                alt24=5;
                }
                break;
            case 42:
                {
                alt24=6;
                }
                break;
            case 43:
                {
                alt24=7;
                }
                break;
            case 44:
                {
                alt24=8;
                }
                break;
            case 45:
                {
                alt24=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:2: (enumLiteral_0= '&&' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:2: (enumLiteral_0= '&&' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBinaryOperator3021); 

                            current = grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:6: (enumLiteral_1= '||' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:6: (enumLiteral_1= '||' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBinaryOperator3038); 

                            current = grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:6: (enumLiteral_2= '!||' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:6: (enumLiteral_2= '!||' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:8: enumLiteral_2= '!||'
                    {
                    enumLiteral_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBinaryOperator3055); 

                            current = grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:6: (enumLiteral_3= '==' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:6: (enumLiteral_3= '==' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:8: enumLiteral_3= '=='
                    {
                    enumLiteral_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBinaryOperator3072); 

                            current = grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1291:6: (enumLiteral_4= '!=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1291:6: (enumLiteral_4= '!=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1291:8: enumLiteral_4= '!='
                    {
                    enumLiteral_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBinaryOperator3089); 

                            current = grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:6: (enumLiteral_5= '>' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:6: (enumLiteral_5= '>' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:8: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBinaryOperator3106); 

                            current = grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:6: (enumLiteral_6= '<' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:6: (enumLiteral_6= '<' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:8: enumLiteral_6= '<'
                    {
                    enumLiteral_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBinaryOperator3123); 

                            current = grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:6: (enumLiteral_7= '>=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:6: (enumLiteral_7= '>=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:8: enumLiteral_7= '>='
                    {
                    enumLiteral_7=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBinaryOperator3140); 

                            current = grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:6: (enumLiteral_8= '<=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:6: (enumLiteral_8= '<=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:8: enumLiteral_8= '<='
                    {
                    enumLiteral_8=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBinaryOperator3157); 

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel146 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_ruleModel167 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel180 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_ruleModel201 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleModel215 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleModel227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_ruleConstraint320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleConstraint347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_ruleConstraint374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringg_in_ruleConstraint401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleConstraint428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_ruleConstraint455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_ruleType547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleType574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_ruleType601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringg_in_ruleType628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleType655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleLiteral747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_ruleLiteral774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringg_in_ruleLiteral801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleLiteral828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguratorModel873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfiguratorModel940 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel952 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_16_in_ruleConfiguratorModel965 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel977 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleConfiguratorModel998 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleConfiguratorModel1011 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleConfiguratorModel1032 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel1046 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleConfiguratorModel1061 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel1073 = new BitSet(new long[]{0x00000019F9080060L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleConfiguratorModel1094 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleConfiguratorModel1107 = new BitSet(new long[]{0x00000019F9080060L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleConfiguratorModel1128 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel1142 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel1156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleParameter1362 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter1383 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleParameter1395 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleParameter1408 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter1420 = new BitSet(new long[]{0x0000000009000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParameter1441 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParameter1454 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParameter1467 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter1479 = new BitSet(new long[]{0x0000000009000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParameter1500 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleParameter1513 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter1525 = new BitSet(new long[]{0x00000019FB000040L});
        public static final BitSet FOLLOW_ruleType_in_ruleParameter1546 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleParameter1559 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameter1580 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleParameter1593 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameter1614 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleParameter1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt1717 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1779 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum1789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnum1826 = new BitSet(new long[]{0x00000019F9000040L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleEnum1847 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_13_in_ruleEnum1860 = new BitSet(new long[]{0x00000019F9000040L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleEnum1881 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_26_in_ruleEnum1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleInteger1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInteger2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble2052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDouble2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDouble2137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringg_in_entryRuleStringg2173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringg2183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleStringg2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleStringg2250 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringg2271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleBoolean2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBoolean2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEDouble2480 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2498 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleEDouble2518 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2533 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_33_in_ruleEDouble2553 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_34_in_ruleEDouble2572 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_24_in_ruleEDouble2587 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEBoolean2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEBoolean2720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint2760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryConstraint2770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleBinaryConstraint2807 = new BitSet(new long[]{0x00000019F9080060L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleBinaryConstraint2828 = new BitSet(new long[]{0x00003FE000000000L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryConstraint2849 = new BitSet(new long[]{0x00000019F9080060L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleBinaryConstraint2870 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleBinaryConstraint2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier2918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterIdentifier2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterIdentifier2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleBinaryOperator3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleBinaryOperator3038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBinaryOperator3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleBinaryOperator3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleBinaryOperator3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBinaryOperator3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBinaryOperator3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBinaryOperator3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleBinaryOperator3157 = new BitSet(new long[]{0x0000000000000002L});
    }


}