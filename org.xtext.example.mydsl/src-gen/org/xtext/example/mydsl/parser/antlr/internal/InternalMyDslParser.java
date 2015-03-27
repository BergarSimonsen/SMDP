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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConfiguratorModel'", "'{'", "'Name'", "'parameters'", "','", "'}'", "'constraints'", "'categories'", "'required'", "'Parameter'", "'maxChosenValues'", "'paramType'", "'ParamCategory'", "'params'", "'-'", "'SimpleType'", "'Enum'", "'values'", "'Value'", "'BinaryConstraint'", "'operator'", "'leftOperand'", "'rightOperand'", "'UnaryConstraint'", "'operand'", "'ParameterIdentifier'", "'parameter'", "'INT'", "'BOOLEAN'", "'DOUBLE'", "'STRING'", "'AND'", "'OR'", "'XOR'", "'EQUALS'", "'NOTEQUALS'", "'GT'", "'LT'", "'GTEQ'", "'LTEQ'", "'NOT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleConfiguratorModel returns [EObject current=null] : ( () otherlv_1= 'ConfiguratorModel' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? (otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}' )? (otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_categories_19_0 = null;

        EObject lv_categories_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( () otherlv_1= 'ConfiguratorModel' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? (otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}' )? (otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () otherlv_1= 'ConfiguratorModel' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? (otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}' )? (otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( () otherlv_1= 'ConfiguratorModel' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? (otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}' )? (otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: () otherlv_1= 'ConfiguratorModel' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? (otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}' )? (otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}' )? otherlv_23= '}'
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
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:1: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:3: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfiguratorModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getConfiguratorModelAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:1: ( (lv_Name_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_Name_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_Name_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:101:3: lv_Name_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfiguratorModel177);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:4: (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:6: otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguratorModel192); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel204); 

                        	newLeafNode(otherlv_6, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( (lv_parameters_7_0= ruleParameter ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:1: (lv_parameters_7_0= ruleParameter )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:1: (lv_parameters_7_0= ruleParameter )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:127:3: lv_parameters_7_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleConfiguratorModel225);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_7_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel238); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:1: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:1: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:1: (lv_parameters_9_0= ruleParameter )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:3: lv_parameters_9_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleConfiguratorModel259);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_9_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfiguratorModel273); 

                        	newLeafNode(otherlv_10, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:169:3: (otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:169:5: otherlv_11= 'constraints' otherlv_12= '{' ( (lv_constraints_13_0= ruleConstraint ) ) (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConfiguratorModel288); 

                        	newLeafNode(otherlv_11, grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel300); 

                        	newLeafNode(otherlv_12, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:177:1: ( (lv_constraints_13_0= ruleConstraint ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:1: (lv_constraints_13_0= ruleConstraint )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:1: (lv_constraints_13_0= ruleConstraint )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:3: lv_constraints_13_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleConfiguratorModel321);
                    lv_constraints_13_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_13_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:195:2: (otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:195:4: otherlv_14= ',' ( (lv_constraints_15_0= ruleConstraint ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel334); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:1: (lv_constraints_15_0= ruleConstraint )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:1: (lv_constraints_15_0= ruleConstraint )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:201:3: lv_constraints_15_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleConfiguratorModel355);
                    	    lv_constraints_15_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_15_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfiguratorModel369); 

                        	newLeafNode(otherlv_16, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:3: (otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:5: otherlv_17= 'categories' otherlv_18= '{' ( (lv_categories_19_0= ruleParamCategory ) ) (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConfiguratorModel384); 

                        	newLeafNode(otherlv_17, grammarAccess.getConfiguratorModelAccess().getCategoriesKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguratorModel396); 

                        	newLeafNode(otherlv_18, grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:1: ( (lv_categories_19_0= ruleParamCategory ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_categories_19_0= ruleParamCategory )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_categories_19_0= ruleParamCategory )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:3: lv_categories_19_0= ruleParamCategory
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getCategoriesParamCategoryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParamCategory_in_ruleConfiguratorModel417);
                    lv_categories_19_0=ruleParamCategory();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	        }
                           		add(
                           			current, 
                           			"categories",
                            		lv_categories_19_0, 
                            		"ParamCategory");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:2: (otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:4: otherlv_20= ',' ( (lv_categories_21_0= ruleParamCategory ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfiguratorModel430); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getConfiguratorModelAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:1: ( (lv_categories_21_0= ruleParamCategory ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:252:1: (lv_categories_21_0= ruleParamCategory )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:252:1: (lv_categories_21_0= ruleParamCategory )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:253:3: lv_categories_21_0= ruleParamCategory
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorModelAccess().getCategoriesParamCategoryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParamCategory_in_ruleConfiguratorModel451);
                    	    lv_categories_21_0=ruleParamCategory();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"categories",
                    	            		lv_categories_21_0, 
                    	            		"ParamCategory");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfiguratorModel465); 

                        	newLeafNode(otherlv_22, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfiguratorModel479); 

                	newLeafNode(otherlv_23, grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint515);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint525); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:294:1: ruleConstraint returns [EObject current=null] : (this_BinaryConstraint_0= ruleBinaryConstraint | this_UnaryConstraint_1= ruleUnaryConstraint | this_ParameterIdentifier_2= ruleParameterIdentifier ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryConstraint_0 = null;

        EObject this_UnaryConstraint_1 = null;

        EObject this_ParameterIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:297:28: ( (this_BinaryConstraint_0= ruleBinaryConstraint | this_UnaryConstraint_1= ruleUnaryConstraint | this_ParameterIdentifier_2= ruleParameterIdentifier ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_UnaryConstraint_1= ruleUnaryConstraint | this_ParameterIdentifier_2= ruleParameterIdentifier )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_UnaryConstraint_1= ruleUnaryConstraint | this_ParameterIdentifier_2= ruleParameterIdentifier )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:5: this_BinaryConstraint_0= ruleBinaryConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBinaryConstraintParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_ruleConstraint572);
                    this_BinaryConstraint_0=ruleBinaryConstraint();

                    state._fsp--;

                     
                            current = this_BinaryConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:5: this_UnaryConstraint_1= ruleUnaryConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getUnaryConstraintParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_ruleConstraint599);
                    this_UnaryConstraint_1=ruleUnaryConstraint();

                    state._fsp--;

                     
                            current = this_UnaryConstraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:5: this_ParameterIdentifier_2= ruleParameterIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getParameterIdentifierParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_ruleConstraint626);
                    this_ParameterIdentifier_2=ruleParameterIdentifier();

                    state._fsp--;

                     
                            current = this_ParameterIdentifier_2; 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:336:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType661);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType671); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Enum_1= ruleEnum ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Enum_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:28: ( (this_SimpleType_0= ruleSimpleType | this_Enum_1= ruleEnum ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:1: (this_SimpleType_0= ruleSimpleType | this_Enum_1= ruleEnum )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:1: (this_SimpleType_0= ruleSimpleType | this_Enum_1= ruleEnum )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:349:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleType718);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:5: this_Enum_1= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_ruleType745);
                    this_Enum_1=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_1; 
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


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter780);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter790); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:1: ruleParameter returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )? otherlv_7= 'paramType' ( (lv_paramType_8_0= ruleType ) ) otherlv_9= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        AntlrDatatypeRuleToken lv_maxChosenValues_6_0 = null;

        EObject lv_paramType_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:28: ( ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )? otherlv_7= 'paramType' ( (lv_paramType_8_0= ruleType ) ) otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )? otherlv_7= 'paramType' ( (lv_paramType_8_0= ruleType ) ) otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )? otherlv_7= 'paramType' ( (lv_paramType_8_0= ruleType ) ) otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:2: ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )? otherlv_7= 'paramType' ( (lv_paramType_8_0= ruleType ) ) otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:2: ( (lv_required_0_0= 'required' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:389:1: (lv_required_0_0= 'required' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:389:1: (lv_required_0_0= 'required' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParameter833); 

                            newLeafNode(lv_required_0_0, grammarAccess.getParameterAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleParameter859); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter871); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:411:1: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:411:3: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter884); 

                        	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:415:1: ( (lv_Name_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:416:1: (lv_Name_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:416:1: (lv_Name_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:417:3: lv_Name_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter905);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:4: (otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:6: otherlv_5= 'maxChosenValues' ( (lv_maxChosenValues_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter920); 

                        	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getMaxChosenValuesKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( (lv_maxChosenValues_6_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: (lv_maxChosenValues_6_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: (lv_maxChosenValues_6_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:3: lv_maxChosenValues_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getMaxChosenValuesEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParameter941);
                    lv_maxChosenValues_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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
                    break;

            }

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter955); 

                	newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getParamTypeKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: ( (lv_paramType_8_0= ruleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: (lv_paramType_8_0= ruleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: (lv_paramType_8_0= ruleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:3: lv_paramType_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getParamTypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleParameter976);
            lv_paramType_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"paramType",
                    		lv_paramType_8_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameter988); 

                	newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:491:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1025);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1036); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:502:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:502:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:502:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1076); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1102); 

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


    // $ANTLR start "entryRuleParamCategory"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: entryRuleParamCategory returns [EObject current=null] : iv_ruleParamCategory= ruleParamCategory EOF ;
    public final EObject entryRuleParamCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCategory = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:2: (iv_ruleParamCategory= ruleParamCategory EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:2: iv_ruleParamCategory= ruleParamCategory EOF
            {
             newCompositeNode(grammarAccess.getParamCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParamCategory_in_entryRuleParamCategory1147);
            iv_ruleParamCategory=ruleParamCategory();

            state._fsp--;

             current =iv_ruleParamCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParamCategory1157); 

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
    // $ANTLR end "entryRuleParamCategory"


    // $ANTLR start "ruleParamCategory"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:1: ruleParamCategory returns [EObject current=null] : (otherlv_0= 'ParamCategory' otherlv_1= '{' (otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) )? otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleParamCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:28: ( (otherlv_0= 'ParamCategory' otherlv_1= '{' (otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) )? otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:538:1: (otherlv_0= 'ParamCategory' otherlv_1= '{' (otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) )? otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:538:1: (otherlv_0= 'ParamCategory' otherlv_1= '{' (otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) )? otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:538:3: otherlv_0= 'ParamCategory' otherlv_1= '{' (otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) )? otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParamCategory1194); 

                	newLeafNode(otherlv_0, grammarAccess.getParamCategoryAccess().getParamCategoryKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParamCategory1206); 

                	newLeafNode(otherlv_1, grammarAccess.getParamCategoryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:1: (otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:3: otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParamCategory1219); 

                        	newLeafNode(otherlv_2, grammarAccess.getParamCategoryAccess().getNameKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:550:1: ( (lv_Name_3_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:551:1: (lv_Name_3_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:551:1: (lv_Name_3_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:3: lv_Name_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamCategoryAccess().getNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParamCategory1240);
                    lv_Name_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamCategoryRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParamCategory1254); 

                	newLeafNode(otherlv_4, grammarAccess.getParamCategoryAccess().getParamsKeyword_3());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParamCategory1266); 

                	newLeafNode(otherlv_5, grammarAccess.getParamCategoryAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: ( (lv_params_6_0= ruleParameter ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: (lv_params_6_0= ruleParameter )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: (lv_params_6_0= ruleParameter )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:3: lv_params_6_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getParamCategoryAccess().getParamsParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParamCategory1287);
            lv_params_6_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamCategoryRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_6_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:4: otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParamCategory1300); 

            	        	newLeafNode(otherlv_7, grammarAccess.getParamCategoryAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: ( (lv_params_8_0= ruleParameter ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: (lv_params_8_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: (lv_params_8_0= ruleParameter )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:3: lv_params_8_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamCategoryAccess().getParamsParameterParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParamCategory1321);
            	    lv_params_8_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_8_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParamCategory1335); 

                	newLeafNode(otherlv_9, grammarAccess.getParamCategoryAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParamCategory1347); 

                	newLeafNode(otherlv_10, grammarAccess.getParamCategoryAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleParamCategory"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1386);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1397); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:2: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEInt1436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1453); 

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


    // $ANTLR start "entryRuleSimpleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_entryRuleSimpleType1498);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleType1508); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:1: ruleSimpleType returns [EObject current=null] : ( () otherlv_1= 'SimpleType' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_Name_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:680:28: ( ( () otherlv_1= 'SimpleType' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:1: ( () otherlv_1= 'SimpleType' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:1: ( () otherlv_1= 'SimpleType' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:2: () otherlv_1= 'SimpleType' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSimpleType1554); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleType1566); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:695:1: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:695:3: otherlv_3= 'Name' ( (lv_Name_4_0= ruleTypeName ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSimpleType1579); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleTypeAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ( (lv_Name_4_0= ruleTypeName ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: (lv_Name_4_0= ruleTypeName )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: (lv_Name_4_0= ruleTypeName )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:3: lv_Name_4_0= ruleTypeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTypeAccess().getNameTypeNameEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypeName_in_ruleSimpleType1600);
                    lv_Name_4_0=ruleTypeName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_4_0, 
                            		"TypeName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleType1614); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum1650);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum1660); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:28: ( (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:3: otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnum1697); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnum1709); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEnum1721); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getValuesKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnum1733); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:1: ( (lv_values_4_0= ruleValue ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:1: (lv_values_4_0= ruleValue )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:1: (lv_values_4_0= ruleValue )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:3: lv_values_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleEnum1754);
            lv_values_4_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_4_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:2: (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:4: otherlv_5= ',' ( (lv_values_6_0= ruleValue ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnum1767); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:1: ( (lv_values_6_0= ruleValue ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:1: (lv_values_6_0= ruleValue )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:1: (lv_values_6_0= ruleValue )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:3: lv_values_6_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleEnum1788);
            	    lv_values_6_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_6_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEnum1802); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEnum1814); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue1850);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue1860); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:823:1: ruleValue returns [EObject current=null] : ( () otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:28: ( ( () otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:1: ( () otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:1: ( () otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:2: () otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValueAccess().getValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleValue1906); 

                	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValue1927);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBinaryConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:863:1: entryRuleBinaryConstraint returns [EObject current=null] : iv_ruleBinaryConstraint= ruleBinaryConstraint EOF ;
    public final EObject entryRuleBinaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:2: (iv_ruleBinaryConstraint= ruleBinaryConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:865:2: iv_ruleBinaryConstraint= ruleBinaryConstraint EOF
            {
             newCompositeNode(grammarAccess.getBinaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint1963);
            iv_ruleBinaryConstraint=ruleBinaryConstraint();

            state._fsp--;

             current =iv_ruleBinaryConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryConstraint1973); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ruleBinaryConstraint returns [EObject current=null] : (otherlv_0= 'BinaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) )? otherlv_4= 'leftOperand' ( (lv_leftOperand_5_0= ruleConstraint ) ) otherlv_6= 'rightOperand' ( (lv_rightOperand_7_0= ruleConstraint ) ) otherlv_8= '}' ) ;
    public final EObject ruleBinaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_leftOperand_5_0 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:28: ( (otherlv_0= 'BinaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) )? otherlv_4= 'leftOperand' ( (lv_leftOperand_5_0= ruleConstraint ) ) otherlv_6= 'rightOperand' ( (lv_rightOperand_7_0= ruleConstraint ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:1: (otherlv_0= 'BinaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) )? otherlv_4= 'leftOperand' ( (lv_leftOperand_5_0= ruleConstraint ) ) otherlv_6= 'rightOperand' ( (lv_rightOperand_7_0= ruleConstraint ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:1: (otherlv_0= 'BinaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) )? otherlv_4= 'leftOperand' ( (lv_leftOperand_5_0= ruleConstraint ) ) otherlv_6= 'rightOperand' ( (lv_rightOperand_7_0= ruleConstraint ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:3: otherlv_0= 'BinaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) )? otherlv_4= 'leftOperand' ( (lv_leftOperand_5_0= ruleConstraint ) ) otherlv_6= 'rightOperand' ( (lv_rightOperand_7_0= ruleConstraint ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryConstraint2010); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryConstraintAccess().getBinaryConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBinaryConstraint2022); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:1: (otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:3: otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) )
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryConstraint2035); 

                        	newLeafNode(otherlv_2, grammarAccess.getBinaryConstraintAccess().getOperatorKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:1: ( (lv_operator_3_0= ruleBinaryOperator ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: (lv_operator_3_0= ruleBinaryOperator )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: (lv_operator_3_0= ruleBinaryOperator )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:3: lv_operator_3_0= ruleBinaryOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_ruleBinaryConstraint2056);
                    lv_operator_3_0=ruleBinaryOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_3_0, 
                            		"BinaryOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryConstraint2070); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryConstraintAccess().getLeftOperandKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:1: ( (lv_leftOperand_5_0= ruleConstraint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: (lv_leftOperand_5_0= ruleConstraint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: (lv_leftOperand_5_0= ruleConstraint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:3: lv_leftOperand_5_0= ruleConstraint
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getLeftOperandConstraintParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleBinaryConstraint2091);
            lv_leftOperand_5_0=ruleConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_5_0, 
                    		"Constraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryConstraint2103); 

                	newLeafNode(otherlv_6, grammarAccess.getBinaryConstraintAccess().getRightOperandKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:1: ( (lv_rightOperand_7_0= ruleConstraint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: (lv_rightOperand_7_0= ruleConstraint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: (lv_rightOperand_7_0= ruleConstraint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:3: lv_rightOperand_7_0= ruleConstraint
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getRightOperandConstraintParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleBinaryConstraint2124);
            lv_rightOperand_7_0=ruleConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_7_0, 
                    		"Constraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBinaryConstraint2136); 

                	newLeafNode(otherlv_8, grammarAccess.getBinaryConstraintAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleUnaryConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: entryRuleUnaryConstraint returns [EObject current=null] : iv_ruleUnaryConstraint= ruleUnaryConstraint EOF ;
    public final EObject entryRuleUnaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:2: (iv_ruleUnaryConstraint= ruleUnaryConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:2: iv_ruleUnaryConstraint= ruleUnaryConstraint EOF
            {
             newCompositeNode(grammarAccess.getUnaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint2172);
            iv_ruleUnaryConstraint=ruleUnaryConstraint();

            state._fsp--;

             current =iv_ruleUnaryConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryConstraint2182); 

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
    // $ANTLR end "entryRuleUnaryConstraint"


    // $ANTLR start "ruleUnaryConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:1: ruleUnaryConstraint returns [EObject current=null] : (otherlv_0= 'UnaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) )? otherlv_4= 'operand' ( (lv_operand_5_0= ruleConstraint ) ) otherlv_6= '}' ) ;
    public final EObject ruleUnaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_operand_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:28: ( (otherlv_0= 'UnaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) )? otherlv_4= 'operand' ( (lv_operand_5_0= ruleConstraint ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:1: (otherlv_0= 'UnaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) )? otherlv_4= 'operand' ( (lv_operand_5_0= ruleConstraint ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:1: (otherlv_0= 'UnaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) )? otherlv_4= 'operand' ( (lv_operand_5_0= ruleConstraint ) ) otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:3: otherlv_0= 'UnaryConstraint' otherlv_1= '{' (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) )? otherlv_4= 'operand' ( (lv_operand_5_0= ruleConstraint ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnaryConstraint2219); 

                	newLeafNode(otherlv_0, grammarAccess.getUnaryConstraintAccess().getUnaryConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUnaryConstraint2231); 

                	newLeafNode(otherlv_1, grammarAccess.getUnaryConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:1: (otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:3: otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) )
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUnaryConstraint2244); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryConstraintAccess().getOperatorKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: ( (lv_operator_3_0= ruleUnaryOperator ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: (lv_operator_3_0= ruleUnaryOperator )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: (lv_operator_3_0= ruleUnaryOperator )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:3: lv_operator_3_0= ruleUnaryOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryConstraint2265);
                    lv_operator_3_0=ruleUnaryOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_3_0, 
                            		"UnaryOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUnaryConstraint2279); 

                	newLeafNode(otherlv_4, grammarAccess.getUnaryConstraintAccess().getOperandKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:1: ( (lv_operand_5_0= ruleConstraint ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:1: (lv_operand_5_0= ruleConstraint )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:1: (lv_operand_5_0= ruleConstraint )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:3: lv_operand_5_0= ruleConstraint
            {
             
            	        newCompositeNode(grammarAccess.getUnaryConstraintAccess().getOperandConstraintParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleUnaryConstraint2300);
            lv_operand_5_0=ruleConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"operand",
                    		lv_operand_5_0, 
                    		"Constraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUnaryConstraint2312); 

                	newLeafNode(otherlv_6, grammarAccess.getUnaryConstraintAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleUnaryConstraint"


    // $ANTLR start "entryRuleParameterIdentifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: entryRuleParameterIdentifier returns [EObject current=null] : iv_ruleParameterIdentifier= ruleParameterIdentifier EOF ;
    public final EObject entryRuleParameterIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIdentifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:2: (iv_ruleParameterIdentifier= ruleParameterIdentifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:2: iv_ruleParameterIdentifier= ruleParameterIdentifier EOF
            {
             newCompositeNode(grammarAccess.getParameterIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier2348);
            iv_ruleParameterIdentifier=ruleParameterIdentifier();

            state._fsp--;

             current =iv_ruleParameterIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterIdentifier2358); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1048:1: ruleParameterIdentifier returns [EObject current=null] : (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:28: ( (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:1: (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:1: (otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:3: otherlv_0= 'ParameterIdentifier' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleParameterIdentifier2395); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterIdentifierAccess().getParameterIdentifierKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterIdentifier2407); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterIdentifierAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleParameterIdentifier2419); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterIdentifierAccess().getParameterKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterIdentifier2442);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameterIdentifier2454); 

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


    // $ANTLR start "ruleTypeName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: ruleTypeName returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleTypeName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:28: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'STRING' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'STRING' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'STRING' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            case 41:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:2: (enumLiteral_0= 'INT' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:2: (enumLiteral_0= 'INT' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTypeName2504); 

                            current = grammarAccess.getTypeNameAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeNameAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:6: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:6: (enumLiteral_1= 'BOOLEAN' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:8: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTypeName2521); 

                            current = grammarAccess.getTypeNameAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeNameAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1106:6: (enumLiteral_2= 'DOUBLE' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1106:6: (enumLiteral_2= 'DOUBLE' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1106:8: enumLiteral_2= 'DOUBLE'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTypeName2538); 

                            current = grammarAccess.getTypeNameAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeNameAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:6: (enumLiteral_3= 'STRING' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:6: (enumLiteral_3= 'STRING' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1112:8: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTypeName2555); 

                            current = grammarAccess.getTypeNameAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeNameAccess().getSTRINGEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'NOTEQUALS' ) | (enumLiteral_5= 'GT' ) | (enumLiteral_6= 'LT' ) | (enumLiteral_7= 'GTEQ' ) | (enumLiteral_8= 'LTEQ' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'NOTEQUALS' ) | (enumLiteral_5= 'GT' ) | (enumLiteral_6= 'LT' ) | (enumLiteral_7= 'GTEQ' ) | (enumLiteral_8= 'LTEQ' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'NOTEQUALS' ) | (enumLiteral_5= 'GT' ) | (enumLiteral_6= 'LT' ) | (enumLiteral_7= 'GTEQ' ) | (enumLiteral_8= 'LTEQ' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'NOTEQUALS' ) | (enumLiteral_5= 'GT' ) | (enumLiteral_6= 'LT' ) | (enumLiteral_7= 'GTEQ' ) | (enumLiteral_8= 'LTEQ' ) )
            int alt22=9;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            case 45:
                {
                alt22=4;
                }
                break;
            case 46:
                {
                alt22=5;
                }
                break;
            case 47:
                {
                alt22=6;
                }
                break;
            case 48:
                {
                alt22=7;
                }
                break;
            case 49:
                {
                alt22=8;
                }
                break;
            case 50:
                {
                alt22=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:2: (enumLiteral_0= 'AND' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBinaryOperator2600); 

                            current = grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:6: (enumLiteral_1= 'OR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBinaryOperator2617); 

                            current = grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:6: (enumLiteral_2= 'XOR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:6: (enumLiteral_2= 'XOR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:8: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBinaryOperator2634); 

                            current = grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1143:6: (enumLiteral_3= 'EQUALS' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1143:6: (enumLiteral_3= 'EQUALS' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1143:8: enumLiteral_3= 'EQUALS'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBinaryOperator2651); 

                            current = grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:6: (enumLiteral_4= 'NOTEQUALS' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:6: (enumLiteral_4= 'NOTEQUALS' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:8: enumLiteral_4= 'NOTEQUALS'
                    {
                    enumLiteral_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBinaryOperator2668); 

                            current = grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:6: (enumLiteral_5= 'GT' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:6: (enumLiteral_5= 'GT' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:8: enumLiteral_5= 'GT'
                    {
                    enumLiteral_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleBinaryOperator2685); 

                            current = grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:6: (enumLiteral_6= 'LT' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:6: (enumLiteral_6= 'LT' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:8: enumLiteral_6= 'LT'
                    {
                    enumLiteral_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBinaryOperator2702); 

                            current = grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1167:6: (enumLiteral_7= 'GTEQ' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1167:6: (enumLiteral_7= 'GTEQ' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1167:8: enumLiteral_7= 'GTEQ'
                    {
                    enumLiteral_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBinaryOperator2719); 

                            current = grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:6: (enumLiteral_8= 'LTEQ' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:6: (enumLiteral_8= 'LTEQ' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:8: enumLiteral_8= 'LTEQ'
                    {
                    enumLiteral_8=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleBinaryOperator2736); 

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


    // $ANTLR start "ruleUnaryOperator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1183:1: ruleUnaryOperator returns [Enumerator current=null] : (enumLiteral_0= 'NOT' ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1185:28: ( (enumLiteral_0= 'NOT' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:1: (enumLiteral_0= 'NOT' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:1: (enumLiteral_0= 'NOT' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:3: enumLiteral_0= 'NOT'
            {
            enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleUnaryOperator2780); 

                    current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleUnaryOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguratorModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfiguratorModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel143 = new BitSet(new long[]{0x0000000000076000L});
        public static final BitSet FOLLOW_13_in_ruleConfiguratorModel156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfiguratorModel177 = new BitSet(new long[]{0x0000000000074000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguratorModel192 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel204 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleConfiguratorModel225 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel238 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleConfiguratorModel259 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleConfiguratorModel273 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_17_in_ruleConfiguratorModel288 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel300 = new BitSet(new long[]{0x0000001440000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleConfiguratorModel321 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel334 = new BitSet(new long[]{0x0000001440000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleConfiguratorModel355 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleConfiguratorModel369 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleConfiguratorModel384 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguratorModel396 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleParamCategory_in_ruleConfiguratorModel417 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleConfiguratorModel430 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleParamCategory_in_ruleConfiguratorModel451 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleConfiguratorModel465 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConfiguratorModel479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_ruleConstraint572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_ruleConstraint599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_ruleConstraint626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleType718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_ruleType745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleParameter833 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleParameter859 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameter871 = new BitSet(new long[]{0x0000000000602000L});
        public static final BitSet FOLLOW_13_in_ruleParameter884 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter905 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleParameter920 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParameter941 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParameter955 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleParameter976 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParameter988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParamCategory_in_entryRuleParamCategory1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParamCategory1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleParamCategory1194 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParamCategory1206 = new BitSet(new long[]{0x0000000001002000L});
        public static final BitSet FOLLOW_13_in_ruleParamCategory1219 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParamCategory1240 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParamCategory1254 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParamCategory1266 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParamCategory1287 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleParamCategory1300 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParamCategory1321 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleParamCategory1335 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParamCategory1347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEInt1436 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSimpleType1554 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSimpleType1566 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleSimpleType1579 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleType1600 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSimpleType1614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnum1697 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnum1709 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEnum1721 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnum1733 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleValue_in_ruleEnum1754 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleEnum1767 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleValue_in_ruleEnum1788 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleEnum1802 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEnum1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleValue1906 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValue1927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint1963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryConstraint1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBinaryConstraint2010 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBinaryConstraint2022 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_31_in_ruleBinaryConstraint2035 = new BitSet(new long[]{0x0007FC0000000000L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryConstraint2056 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryConstraint2070 = new BitSet(new long[]{0x0000001440000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleBinaryConstraint2091 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryConstraint2103 = new BitSet(new long[]{0x0000001440000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleBinaryConstraint2124 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBinaryConstraint2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint2172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryConstraint2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnaryConstraint2219 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUnaryConstraint2231 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_31_in_ruleUnaryConstraint2244 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryConstraint2265 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleUnaryConstraint2279 = new BitSet(new long[]{0x0000001440000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleUnaryConstraint2300 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleUnaryConstraint2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier2348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterIdentifier2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleParameterIdentifier2395 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterIdentifier2407 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleParameterIdentifier2419 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterIdentifier2442 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParameterIdentifier2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleTypeName2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleTypeName2521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleTypeName2538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTypeName2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBinaryOperator2600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBinaryOperator2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBinaryOperator2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleBinaryOperator2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleBinaryOperator2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleBinaryOperator2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleBinaryOperator2702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleBinaryOperator2719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleBinaryOperator2736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleUnaryOperator2780 = new BitSet(new long[]{0x0000000000000002L});
    }


}