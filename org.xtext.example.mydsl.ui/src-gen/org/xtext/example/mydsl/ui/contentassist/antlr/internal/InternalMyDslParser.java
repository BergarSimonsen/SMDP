package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'&&'", "'||'", "'!||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'ConfiguratorModel'", "'{'", "'}'", "'parameters'", "','", "'constraints'", "'enums'", "'Parameter'", "'('", "')'", "'maxChosenValues'", "':'", "'minChosenValues'", "'enum'", "'children'", "'['", "']'", "'if'", "'then'", "'Enum'", "';'", "'-'", "'.'", "'ParameterIdentifier'", "'parameter'", "'value'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleConfiguratorModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleConfiguratorModel : ruleConfiguratorModel EOF ;
    public final void entryRuleConfiguratorModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleConfiguratorModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleConfiguratorModel EOF
            {
             before(grammarAccess.getConfiguratorModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel61);
            ruleConfiguratorModel();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguratorModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguratorModel"


    // $ANTLR start "ruleConfiguratorModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleConfiguratorModel : ( ( rule__ConfiguratorModel__Group__0 ) ) ;
    public final void ruleConfiguratorModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__ConfiguratorModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__ConfiguratorModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__ConfiguratorModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__ConfiguratorModel__Group__0 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__ConfiguratorModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__ConfiguratorModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__0_in_ruleConfiguratorModel94);
            rule__ConfiguratorModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguratorModel"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleValue EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue121);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Value__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Value__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Value__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Alternatives_in_ruleValue154);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleExpression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression181);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Expression__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression214);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleParameter2 : ruleParameter2 EOF ;
    public final void entryRuleParameter2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleParameter2 EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleParameter2 EOF
            {
             before(grammarAccess.getParameter2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter2_in_entryRuleParameter2301);
            ruleParameter2();

            state._fsp--;

             after(grammarAccess.getParameter2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter2308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter2"


    // $ANTLR start "ruleParameter2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleParameter2 : ( ( rule__Parameter2__Group__0 ) ) ;
    public final void ruleParameter2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Parameter2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Parameter2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Parameter2__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Parameter2__Group__0 )
            {
             before(grammarAccess.getParameter2Access().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Parameter2__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Parameter2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__0_in_ruleParameter2334);
            rule__Parameter2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter2"


    // $ANTLR start "entryRuleParameter3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleParameter3 : ruleParameter3 EOF ;
    public final void entryRuleParameter3() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleParameter3 EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleParameter3 EOF
            {
             before(grammarAccess.getParameter3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter3_in_entryRuleParameter3361);
            ruleParameter3();

            state._fsp--;

             after(grammarAccess.getParameter3Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter3368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter3"


    // $ANTLR start "ruleParameter3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleParameter3 : ( ( rule__Parameter3__Group__0 ) ) ;
    public final void ruleParameter3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Parameter3__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Parameter3__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Parameter3__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Parameter3__Group__0 )
            {
             before(grammarAccess.getParameter3Access().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Parameter3__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Parameter3__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__0_in_ruleParameter3394);
            rule__Parameter3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter3"


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleConstraint EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint421);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Constraint__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Constraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0_in_ruleConstraint454);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleEnum EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum481);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Enum__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Enum__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Enum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__0_in_ruleEnum514);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleEInt EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt541);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt574);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleIntLiteral EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral601);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntLiteral608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleIntLiteral : ( ( rule__IntLiteral__Group__0 ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__IntLiteral__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__IntLiteral__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__IntLiteral__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__IntLiteral__Group__0 )
            {
             before(grammarAccess.getIntLiteralAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__IntLiteral__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__IntLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntLiteral__Group__0_in_ruleIntLiteral634);
            rule__IntLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleDoubleLiteral EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleDoubleLiteral EOF
            {
             before(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral661);
            ruleDoubleLiteral();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleLiteral668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__Group__0 ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__DoubleLiteral__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__DoubleLiteral__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__DoubleLiteral__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__DoubleLiteral__Group__0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__DoubleLiteral__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__DoubleLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral694);
            rule__DoubleLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleStringLiteral EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral721);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__StringLiteral__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__StringLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral754);
            rule__StringLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleBooleanLiteral EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral781);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__BooleanLiteral__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral814);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleEDouble EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble841);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__EDouble__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble874);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleBinaryExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ( ruleBinaryExpression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression903);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryExpression910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__BinaryExpression__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( rule__BinaryExpression__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:2: rule__BinaryExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__0_in_ruleBinaryExpression936);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleParameterIdentifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: entryRuleParameterIdentifier : ruleParameterIdentifier EOF ;
    public final void entryRuleParameterIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( ruleParameterIdentifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ruleParameterIdentifier EOF
            {
             before(grammarAccess.getParameterIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier963);
            ruleParameterIdentifier();

            state._fsp--;

             after(grammarAccess.getParameterIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterIdentifier970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterIdentifier"


    // $ANTLR start "ruleParameterIdentifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ruleParameterIdentifier : ( ( rule__ParameterIdentifier__Group__0 ) ) ;
    public final void ruleParameterIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:2: ( ( ( rule__ParameterIdentifier__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__ParameterIdentifier__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__ParameterIdentifier__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__ParameterIdentifier__Group__0 )
            {
             before(grammarAccess.getParameterIdentifierAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__ParameterIdentifier__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__ParameterIdentifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__0_in_ruleParameterIdentifier996);
            rule__ParameterIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterIdentifier"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( ( rule__BinaryOperator__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ( rule__BinaryOperator__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:2: rule__BinaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1033);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "rule__ConfiguratorModel__Alternatives_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: rule__ConfiguratorModel__Alternatives_4_2 : ( ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_0 ) ) | ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_1 ) ) );
    public final void rule__ConfiguratorModel__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_0 ) ) | ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==30) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==32) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==36) ) {
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

                    if ( (LA1_3==30) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==32) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==36) ) {
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( rule__ConfiguratorModel__ParametersAssignment_4_2_0 )
                    {
                     before(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_2_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( rule__ConfiguratorModel__ParametersAssignment_4_2_0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:2: rule__ConfiguratorModel__ParametersAssignment_4_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_2_0_in_rule__ConfiguratorModel__Alternatives_4_21068);
                    rule__ConfiguratorModel__ParametersAssignment_4_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:6: ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:6: ( ( rule__ConfiguratorModel__ParametersAssignment_4_2_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ( rule__ConfiguratorModel__ParametersAssignment_4_2_1 )
                    {
                     before(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_2_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( rule__ConfiguratorModel__ParametersAssignment_4_2_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:2: rule__ConfiguratorModel__ParametersAssignment_4_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_2_1_in_rule__ConfiguratorModel__Alternatives_4_21086);
                    rule__ConfiguratorModel__ParametersAssignment_4_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Alternatives_4_2"


    // $ANTLR start "rule__ConfiguratorModel__Alternatives_4_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: rule__ConfiguratorModel__Alternatives_4_3_1 : ( ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 ) ) | ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 ) ) );
    public final void rule__ConfiguratorModel__Alternatives_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 ) ) | ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==30) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==32) ) {
                            alt2=1;
                        }
                        else if ( (LA2_4==36) ) {
                            alt2=2;
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

                    if ( (LA2_3==30) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==32) ) {
                            alt2=1;
                        }
                        else if ( (LA2_4==36) ) {
                            alt2=2;
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 )
                    {
                     before(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_3_1_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:2: rule__ConfiguratorModel__ParametersAssignment_4_3_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_3_1_0_in_rule__ConfiguratorModel__Alternatives_4_3_11119);
                    rule__ConfiguratorModel__ParametersAssignment_4_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:562:6: ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:562:6: ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 )
                    {
                     before(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_3_1_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:2: rule__ConfiguratorModel__ParametersAssignment_4_3_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_3_1_1_in_rule__ConfiguratorModel__Alternatives_4_3_11137);
                    rule__ConfiguratorModel__ParametersAssignment_4_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Alternatives_4_3_1"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: rule__Value__Alternatives : ( ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==EOF||LA3_2==26||LA3_2==42) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==44) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==44) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==26||LA3_2==42) ) {
                    alt3=1;
                }
                else if ( (LA3_2==44) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=1;
                }
                break;
            case 42:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            case 47:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ruleIntLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ruleIntLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ruleIntLiteral
                    {
                     before(grammarAccess.getValueAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_rule__Value__Alternatives1170);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:6: ( ruleDoubleLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:6: ( ruleDoubleLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ruleDoubleLiteral
                    {
                     before(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_rule__Value__Alternatives1187);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:6: ( ruleStringLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:6: ( ruleStringLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ruleStringLiteral
                    {
                     before(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rule__Value__Alternatives1204);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:6: ( ruleBooleanLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:6: ( ruleBooleanLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_rule__Value__Alternatives1221);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: rule__Expression__Alternatives : ( ( ruleBinaryExpression ) | ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleParameterIdentifier ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( ( ruleBinaryExpression ) | ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleParameterIdentifier ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ruleBinaryExpression )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ruleBinaryExpression )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ruleBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_rule__Expression__Alternatives1253);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:6: ( ruleIntLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:6: ( ruleIntLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ruleIntLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_rule__Expression__Alternatives1270);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:6: ( ruleDoubleLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:6: ( ruleDoubleLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ruleDoubleLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getDoubleLiteralParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_rule__Expression__Alternatives1287);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDoubleLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:6: ( ruleStringLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:6: ( ruleStringLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ruleStringLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives1304);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:6: ( ruleBooleanLiteral )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:6: ( ruleBooleanLiteral )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getBooleanLiteralParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_rule__Expression__Alternatives1321);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBooleanLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:6: ( ruleParameterIdentifier )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:6: ( ruleParameterIdentifier )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: ruleParameterIdentifier
                    {
                     before(grammarAccess.getExpressionAccess().getParameterIdentifierParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_rule__Expression__Alternatives1338);
                    ruleParameterIdentifier();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getParameterIdentifierParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1370); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1387); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_01420); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_01440); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: rule__BinaryOperator__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) | ( ( '!||' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ( ( '&&' ) ) | ( ( '||' ) ) | ( ( '!||' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            case 20:
                {
                alt7=8;
                }
                break;
            case 21:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( '&&' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( '&&' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( '&&' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( '&&' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:3: '&&'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__BinaryOperator__Alternatives1476); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:6: ( ( '||' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:6: ( ( '||' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( '||' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( '||' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:716:3: '||'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__BinaryOperator__Alternatives1497); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:6: ( ( '!||' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:6: ( ( '!||' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ( '!||' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( '!||' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:3: '!||'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BinaryOperator__Alternatives1518); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:6: ( ( '==' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:6: ( ( '==' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( '==' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( '==' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:3: '=='
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__BinaryOperator__Alternatives1539); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( '!=' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( '!=' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( '!=' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( '!=' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:3: '!='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperator__Alternatives1560); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:6: ( ( '>' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( '>' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( '>' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:744:3: '>'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperator__Alternatives1581); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( '<' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( '<' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( '<' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:3: '<'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperator__Alternatives1602); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:6: ( ( '>=' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:6: ( ( '>=' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( '>=' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( '>=' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:758:3: '>='
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__BinaryOperator__Alternatives1623); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:6: ( ( '<=' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:6: ( ( '<=' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( '<=' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( '<=' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:3: '<='
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__BinaryOperator__Alternatives1644); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__ConfiguratorModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: rule__ConfiguratorModel__Group__0 : rule__ConfiguratorModel__Group__0__Impl rule__ConfiguratorModel__Group__1 ;
    public final void rule__ConfiguratorModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( rule__ConfiguratorModel__Group__0__Impl rule__ConfiguratorModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:2: rule__ConfiguratorModel__Group__0__Impl rule__ConfiguratorModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__0__Impl_in_rule__ConfiguratorModel__Group__01677);
            rule__ConfiguratorModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__1_in_rule__ConfiguratorModel__Group__01680);
            rule__ConfiguratorModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__0"


    // $ANTLR start "rule__ConfiguratorModel__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: rule__ConfiguratorModel__Group__0__Impl : ( () ) ;
    public final void rule__ConfiguratorModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ()
            {
             before(grammarAccess.getConfiguratorModelAccess().getConfiguratorModelAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: 
            {
            }

             after(grammarAccess.getConfiguratorModelAccess().getConfiguratorModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: rule__ConfiguratorModel__Group__1 : rule__ConfiguratorModel__Group__1__Impl rule__ConfiguratorModel__Group__2 ;
    public final void rule__ConfiguratorModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( rule__ConfiguratorModel__Group__1__Impl rule__ConfiguratorModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:813:2: rule__ConfiguratorModel__Group__1__Impl rule__ConfiguratorModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__1__Impl_in_rule__ConfiguratorModel__Group__11738);
            rule__ConfiguratorModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__2_in_rule__ConfiguratorModel__Group__11741);
            rule__ConfiguratorModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__1"


    // $ANTLR start "rule__ConfiguratorModel__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: rule__ConfiguratorModel__Group__1__Impl : ( 'ConfiguratorModel' ) ;
    public final void rule__ConfiguratorModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( ( 'ConfiguratorModel' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( 'ConfiguratorModel' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( 'ConfiguratorModel' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: 'ConfiguratorModel'
            {
             before(grammarAccess.getConfiguratorModelAccess().getConfiguratorModelKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ConfiguratorModel__Group__1__Impl1769); 
             after(grammarAccess.getConfiguratorModelAccess().getConfiguratorModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: rule__ConfiguratorModel__Group__2 : rule__ConfiguratorModel__Group__2__Impl rule__ConfiguratorModel__Group__3 ;
    public final void rule__ConfiguratorModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__ConfiguratorModel__Group__2__Impl rule__ConfiguratorModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: rule__ConfiguratorModel__Group__2__Impl rule__ConfiguratorModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__2__Impl_in_rule__ConfiguratorModel__Group__21800);
            rule__ConfiguratorModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__3_in_rule__ConfiguratorModel__Group__21803);
            rule__ConfiguratorModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__2"


    // $ANTLR start "rule__ConfiguratorModel__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: rule__ConfiguratorModel__Group__2__Impl : ( ( rule__ConfiguratorModel__NameAssignment_2 ) ) ;
    public final void rule__ConfiguratorModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ( ( rule__ConfiguratorModel__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( rule__ConfiguratorModel__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( rule__ConfiguratorModel__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( rule__ConfiguratorModel__NameAssignment_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__ConfiguratorModel__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:2: rule__ConfiguratorModel__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__NameAssignment_2_in_rule__ConfiguratorModel__Group__2__Impl1830);
            rule__ConfiguratorModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__2__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: rule__ConfiguratorModel__Group__3 : rule__ConfiguratorModel__Group__3__Impl rule__ConfiguratorModel__Group__4 ;
    public final void rule__ConfiguratorModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( rule__ConfiguratorModel__Group__3__Impl rule__ConfiguratorModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:2: rule__ConfiguratorModel__Group__3__Impl rule__ConfiguratorModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__3__Impl_in_rule__ConfiguratorModel__Group__31860);
            rule__ConfiguratorModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__4_in_rule__ConfiguratorModel__Group__31863);
            rule__ConfiguratorModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__3"


    // $ANTLR start "rule__ConfiguratorModel__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: rule__ConfiguratorModel__Group__3__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ConfiguratorModel__Group__3__Impl1891); 
             after(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__3__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: rule__ConfiguratorModel__Group__4 : rule__ConfiguratorModel__Group__4__Impl rule__ConfiguratorModel__Group__5 ;
    public final void rule__ConfiguratorModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( rule__ConfiguratorModel__Group__4__Impl rule__ConfiguratorModel__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:2: rule__ConfiguratorModel__Group__4__Impl rule__ConfiguratorModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__4__Impl_in_rule__ConfiguratorModel__Group__41922);
            rule__ConfiguratorModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__5_in_rule__ConfiguratorModel__Group__41925);
            rule__ConfiguratorModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__4"


    // $ANTLR start "rule__ConfiguratorModel__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: rule__ConfiguratorModel__Group__4__Impl : ( ( rule__ConfiguratorModel__Group_4__0 )? ) ;
    public final void rule__ConfiguratorModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( ( ( rule__ConfiguratorModel__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( ( rule__ConfiguratorModel__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( ( rule__ConfiguratorModel__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( rule__ConfiguratorModel__Group_4__0 )?
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( rule__ConfiguratorModel__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:2: rule__ConfiguratorModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__0_in_rule__ConfiguratorModel__Group__4__Impl1952);
                    rule__ConfiguratorModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguratorModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__4__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: rule__ConfiguratorModel__Group__5 : rule__ConfiguratorModel__Group__5__Impl rule__ConfiguratorModel__Group__6 ;
    public final void rule__ConfiguratorModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( rule__ConfiguratorModel__Group__5__Impl rule__ConfiguratorModel__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:2: rule__ConfiguratorModel__Group__5__Impl rule__ConfiguratorModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__5__Impl_in_rule__ConfiguratorModel__Group__51983);
            rule__ConfiguratorModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__6_in_rule__ConfiguratorModel__Group__51986);
            rule__ConfiguratorModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__5"


    // $ANTLR start "rule__ConfiguratorModel__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: rule__ConfiguratorModel__Group__5__Impl : ( ( rule__ConfiguratorModel__Group_5__0 )? ) ;
    public final void rule__ConfiguratorModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( ( rule__ConfiguratorModel__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( ( rule__ConfiguratorModel__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( ( rule__ConfiguratorModel__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( rule__ConfiguratorModel__Group_5__0 )?
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( rule__ConfiguratorModel__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:2: rule__ConfiguratorModel__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__0_in_rule__ConfiguratorModel__Group__5__Impl2013);
                    rule__ConfiguratorModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguratorModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__5__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: rule__ConfiguratorModel__Group__6 : rule__ConfiguratorModel__Group__6__Impl rule__ConfiguratorModel__Group__7 ;
    public final void rule__ConfiguratorModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( rule__ConfiguratorModel__Group__6__Impl rule__ConfiguratorModel__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:2: rule__ConfiguratorModel__Group__6__Impl rule__ConfiguratorModel__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__6__Impl_in_rule__ConfiguratorModel__Group__62044);
            rule__ConfiguratorModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__7_in_rule__ConfiguratorModel__Group__62047);
            rule__ConfiguratorModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__6"


    // $ANTLR start "rule__ConfiguratorModel__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: rule__ConfiguratorModel__Group__6__Impl : ( ( rule__ConfiguratorModel__Group_6__0 )? ) ;
    public final void rule__ConfiguratorModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( ( rule__ConfiguratorModel__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( ( rule__ConfiguratorModel__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( ( rule__ConfiguratorModel__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: ( rule__ConfiguratorModel__Group_6__0 )?
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( rule__ConfiguratorModel__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:2: rule__ConfiguratorModel__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__0_in_rule__ConfiguratorModel__Group__6__Impl2074);
                    rule__ConfiguratorModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguratorModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__6__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: rule__ConfiguratorModel__Group__7 : rule__ConfiguratorModel__Group__7__Impl ;
    public final void rule__ConfiguratorModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__ConfiguratorModel__Group__7__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:2: rule__ConfiguratorModel__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__7__Impl_in_rule__ConfiguratorModel__Group__72105);
            rule__ConfiguratorModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__7"


    // $ANTLR start "rule__ConfiguratorModel__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: rule__ConfiguratorModel__Group__7__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ConfiguratorModel__Group__7__Impl2133); 
             after(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group__7__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: rule__ConfiguratorModel__Group_4__0 : rule__ConfiguratorModel__Group_4__0__Impl rule__ConfiguratorModel__Group_4__1 ;
    public final void rule__ConfiguratorModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( rule__ConfiguratorModel__Group_4__0__Impl rule__ConfiguratorModel__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:2: rule__ConfiguratorModel__Group_4__0__Impl rule__ConfiguratorModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__0__Impl_in_rule__ConfiguratorModel__Group_4__02180);
            rule__ConfiguratorModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__1_in_rule__ConfiguratorModel__Group_4__02183);
            rule__ConfiguratorModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__0"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: rule__ConfiguratorModel__Group_4__0__Impl : ( 'parameters' ) ;
    public final void rule__ConfiguratorModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( ( 'parameters' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( 'parameters' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( 'parameters' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: 'parameters'
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConfiguratorModel__Group_4__0__Impl2211); 
             after(grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: rule__ConfiguratorModel__Group_4__1 : rule__ConfiguratorModel__Group_4__1__Impl rule__ConfiguratorModel__Group_4__2 ;
    public final void rule__ConfiguratorModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( rule__ConfiguratorModel__Group_4__1__Impl rule__ConfiguratorModel__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:2: rule__ConfiguratorModel__Group_4__1__Impl rule__ConfiguratorModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__1__Impl_in_rule__ConfiguratorModel__Group_4__12242);
            rule__ConfiguratorModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__2_in_rule__ConfiguratorModel__Group_4__12245);
            rule__ConfiguratorModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__1"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: rule__ConfiguratorModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ConfiguratorModel__Group_4__1__Impl2273); 
             after(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: rule__ConfiguratorModel__Group_4__2 : rule__ConfiguratorModel__Group_4__2__Impl rule__ConfiguratorModel__Group_4__3 ;
    public final void rule__ConfiguratorModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( rule__ConfiguratorModel__Group_4__2__Impl rule__ConfiguratorModel__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:2: rule__ConfiguratorModel__Group_4__2__Impl rule__ConfiguratorModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__2__Impl_in_rule__ConfiguratorModel__Group_4__22304);
            rule__ConfiguratorModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__3_in_rule__ConfiguratorModel__Group_4__22307);
            rule__ConfiguratorModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__2"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: rule__ConfiguratorModel__Group_4__2__Impl : ( ( rule__ConfiguratorModel__Alternatives_4_2 ) ) ;
    public final void rule__ConfiguratorModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ( ( rule__ConfiguratorModel__Alternatives_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( ( rule__ConfiguratorModel__Alternatives_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( ( rule__ConfiguratorModel__Alternatives_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( rule__ConfiguratorModel__Alternatives_4_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getAlternatives_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( rule__ConfiguratorModel__Alternatives_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:2: rule__ConfiguratorModel__Alternatives_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Alternatives_4_2_in_rule__ConfiguratorModel__Group_4__2__Impl2334);
            rule__ConfiguratorModel__Alternatives_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getAlternatives_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__2__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: rule__ConfiguratorModel__Group_4__3 : rule__ConfiguratorModel__Group_4__3__Impl rule__ConfiguratorModel__Group_4__4 ;
    public final void rule__ConfiguratorModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( rule__ConfiguratorModel__Group_4__3__Impl rule__ConfiguratorModel__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:2: rule__ConfiguratorModel__Group_4__3__Impl rule__ConfiguratorModel__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__3__Impl_in_rule__ConfiguratorModel__Group_4__32364);
            rule__ConfiguratorModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__4_in_rule__ConfiguratorModel__Group_4__32367);
            rule__ConfiguratorModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__3"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: rule__ConfiguratorModel__Group_4__3__Impl : ( ( rule__ConfiguratorModel__Group_4_3__0 )* ) ;
    public final void rule__ConfiguratorModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ( ( rule__ConfiguratorModel__Group_4_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( rule__ConfiguratorModel__Group_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( rule__ConfiguratorModel__Group_4_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( rule__ConfiguratorModel__Group_4_3__0 )*
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( rule__ConfiguratorModel__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:2: rule__ConfiguratorModel__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__0_in_rule__ConfiguratorModel__Group_4__3__Impl2394);
            	    rule__ConfiguratorModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConfiguratorModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__3__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: rule__ConfiguratorModel__Group_4__4 : rule__ConfiguratorModel__Group_4__4__Impl ;
    public final void rule__ConfiguratorModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( rule__ConfiguratorModel__Group_4__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:2: rule__ConfiguratorModel__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__4__Impl_in_rule__ConfiguratorModel__Group_4__42425);
            rule__ConfiguratorModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__4"


    // $ANTLR start "rule__ConfiguratorModel__Group_4__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__ConfiguratorModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ConfiguratorModel__Group_4__4__Impl2453); 
             after(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4__4__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: rule__ConfiguratorModel__Group_4_3__0 : rule__ConfiguratorModel__Group_4_3__0__Impl rule__ConfiguratorModel__Group_4_3__1 ;
    public final void rule__ConfiguratorModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( rule__ConfiguratorModel__Group_4_3__0__Impl rule__ConfiguratorModel__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:2: rule__ConfiguratorModel__Group_4_3__0__Impl rule__ConfiguratorModel__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__0__Impl_in_rule__ConfiguratorModel__Group_4_3__02494);
            rule__ConfiguratorModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__1_in_rule__ConfiguratorModel__Group_4_3__02497);
            rule__ConfiguratorModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4_3__0"


    // $ANTLR start "rule__ConfiguratorModel__Group_4_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: rule__ConfiguratorModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ConfiguratorModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ','
            {
             before(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConfiguratorModel__Group_4_3__0__Impl2525); 
             after(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_4_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: rule__ConfiguratorModel__Group_4_3__1 : rule__ConfiguratorModel__Group_4_3__1__Impl ;
    public final void rule__ConfiguratorModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( rule__ConfiguratorModel__Group_4_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:2: rule__ConfiguratorModel__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__1__Impl_in_rule__ConfiguratorModel__Group_4_3__12556);
            rule__ConfiguratorModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4_3__1"


    // $ANTLR start "rule__ConfiguratorModel__Group_4_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: rule__ConfiguratorModel__Group_4_3__1__Impl : ( ( rule__ConfiguratorModel__Alternatives_4_3_1 ) ) ;
    public final void rule__ConfiguratorModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ( ( rule__ConfiguratorModel__Alternatives_4_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ( ( rule__ConfiguratorModel__Alternatives_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ( ( rule__ConfiguratorModel__Alternatives_4_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ( rule__ConfiguratorModel__Alternatives_4_3_1 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getAlternatives_4_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( rule__ConfiguratorModel__Alternatives_4_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:2: rule__ConfiguratorModel__Alternatives_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Alternatives_4_3_1_in_rule__ConfiguratorModel__Group_4_3__1__Impl2583);
            rule__ConfiguratorModel__Alternatives_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getAlternatives_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: rule__ConfiguratorModel__Group_5__0 : rule__ConfiguratorModel__Group_5__0__Impl rule__ConfiguratorModel__Group_5__1 ;
    public final void rule__ConfiguratorModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( rule__ConfiguratorModel__Group_5__0__Impl rule__ConfiguratorModel__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:2: rule__ConfiguratorModel__Group_5__0__Impl rule__ConfiguratorModel__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__0__Impl_in_rule__ConfiguratorModel__Group_5__02617);
            rule__ConfiguratorModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__1_in_rule__ConfiguratorModel__Group_5__02620);
            rule__ConfiguratorModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__0"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: rule__ConfiguratorModel__Group_5__0__Impl : ( 'constraints' ) ;
    public final void rule__ConfiguratorModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( ( 'constraints' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( 'constraints' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( 'constraints' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: 'constraints'
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ConfiguratorModel__Group_5__0__Impl2648); 
             after(grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: rule__ConfiguratorModel__Group_5__1 : rule__ConfiguratorModel__Group_5__1__Impl rule__ConfiguratorModel__Group_5__2 ;
    public final void rule__ConfiguratorModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( rule__ConfiguratorModel__Group_5__1__Impl rule__ConfiguratorModel__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:2: rule__ConfiguratorModel__Group_5__1__Impl rule__ConfiguratorModel__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__1__Impl_in_rule__ConfiguratorModel__Group_5__12679);
            rule__ConfiguratorModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__2_in_rule__ConfiguratorModel__Group_5__12682);
            rule__ConfiguratorModel__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__1"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: rule__ConfiguratorModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ConfiguratorModel__Group_5__1__Impl2710); 
             after(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__ConfiguratorModel__Group_5__2 : rule__ConfiguratorModel__Group_5__2__Impl rule__ConfiguratorModel__Group_5__3 ;
    public final void rule__ConfiguratorModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( rule__ConfiguratorModel__Group_5__2__Impl rule__ConfiguratorModel__Group_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:2: rule__ConfiguratorModel__Group_5__2__Impl rule__ConfiguratorModel__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__2__Impl_in_rule__ConfiguratorModel__Group_5__22741);
            rule__ConfiguratorModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__3_in_rule__ConfiguratorModel__Group_5__22744);
            rule__ConfiguratorModel__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__2"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: rule__ConfiguratorModel__Group_5__2__Impl : ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) ) ;
    public final void rule__ConfiguratorModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsAssignment_5_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:2: rule__ConfiguratorModel__ConstraintsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_2_in_rule__ConfiguratorModel__Group_5__2__Impl2771);
            rule__ConfiguratorModel__ConstraintsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getConstraintsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__2__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__ConfiguratorModel__Group_5__3 : rule__ConfiguratorModel__Group_5__3__Impl rule__ConfiguratorModel__Group_5__4 ;
    public final void rule__ConfiguratorModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__ConfiguratorModel__Group_5__3__Impl rule__ConfiguratorModel__Group_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__ConfiguratorModel__Group_5__3__Impl rule__ConfiguratorModel__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__3__Impl_in_rule__ConfiguratorModel__Group_5__32801);
            rule__ConfiguratorModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__4_in_rule__ConfiguratorModel__Group_5__32804);
            rule__ConfiguratorModel__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__3"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__ConfiguratorModel__Group_5__3__Impl : ( ( rule__ConfiguratorModel__Group_5_3__0 )* ) ;
    public final void rule__ConfiguratorModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ( ( rule__ConfiguratorModel__Group_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__ConfiguratorModel__Group_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__ConfiguratorModel__Group_5_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__ConfiguratorModel__Group_5_3__0 )*
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( rule__ConfiguratorModel__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__ConfiguratorModel__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__0_in_rule__ConfiguratorModel__Group_5__3__Impl2831);
            	    rule__ConfiguratorModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getConfiguratorModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__3__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__ConfiguratorModel__Group_5__4 : rule__ConfiguratorModel__Group_5__4__Impl ;
    public final void rule__ConfiguratorModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__ConfiguratorModel__Group_5__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__ConfiguratorModel__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__4__Impl_in_rule__ConfiguratorModel__Group_5__42862);
            rule__ConfiguratorModel__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__4"


    // $ANTLR start "rule__ConfiguratorModel__Group_5__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__ConfiguratorModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ConfiguratorModel__Group_5__4__Impl2890); 
             after(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5__4__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:1: rule__ConfiguratorModel__Group_5_3__0 : rule__ConfiguratorModel__Group_5_3__0__Impl rule__ConfiguratorModel__Group_5_3__1 ;
    public final void rule__ConfiguratorModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: ( rule__ConfiguratorModel__Group_5_3__0__Impl rule__ConfiguratorModel__Group_5_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:2: rule__ConfiguratorModel__Group_5_3__0__Impl rule__ConfiguratorModel__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__0__Impl_in_rule__ConfiguratorModel__Group_5_3__02931);
            rule__ConfiguratorModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__1_in_rule__ConfiguratorModel__Group_5_3__02934);
            rule__ConfiguratorModel__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5_3__0"


    // $ANTLR start "rule__ConfiguratorModel__Group_5_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: rule__ConfiguratorModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ConfiguratorModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: ','
            {
             before(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConfiguratorModel__Group_5_3__0__Impl2962); 
             after(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_5_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: rule__ConfiguratorModel__Group_5_3__1 : rule__ConfiguratorModel__Group_5_3__1__Impl ;
    public final void rule__ConfiguratorModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( rule__ConfiguratorModel__Group_5_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:2: rule__ConfiguratorModel__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__1__Impl_in_rule__ConfiguratorModel__Group_5_3__12993);
            rule__ConfiguratorModel__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5_3__1"


    // $ANTLR start "rule__ConfiguratorModel__Group_5_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: rule__ConfiguratorModel__Group_5_3__1__Impl : ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) ) ;
    public final void rule__ConfiguratorModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:1: ( ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsAssignment_5_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:2: rule__ConfiguratorModel__ConstraintsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_3_1_in_rule__ConfiguratorModel__Group_5_3__1__Impl3020);
            rule__ConfiguratorModel__ConstraintsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getConstraintsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: rule__ConfiguratorModel__Group_6__0 : rule__ConfiguratorModel__Group_6__0__Impl rule__ConfiguratorModel__Group_6__1 ;
    public final void rule__ConfiguratorModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( rule__ConfiguratorModel__Group_6__0__Impl rule__ConfiguratorModel__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:2: rule__ConfiguratorModel__Group_6__0__Impl rule__ConfiguratorModel__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__0__Impl_in_rule__ConfiguratorModel__Group_6__03054);
            rule__ConfiguratorModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__1_in_rule__ConfiguratorModel__Group_6__03057);
            rule__ConfiguratorModel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__0"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: rule__ConfiguratorModel__Group_6__0__Impl : ( 'enums' ) ;
    public final void rule__ConfiguratorModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( ( 'enums' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( 'enums' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( 'enums' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: 'enums'
            {
             before(grammarAccess.getConfiguratorModelAccess().getEnumsKeyword_6_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ConfiguratorModel__Group_6__0__Impl3085); 
             after(grammarAccess.getConfiguratorModelAccess().getEnumsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: rule__ConfiguratorModel__Group_6__1 : rule__ConfiguratorModel__Group_6__1__Impl rule__ConfiguratorModel__Group_6__2 ;
    public final void rule__ConfiguratorModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( rule__ConfiguratorModel__Group_6__1__Impl rule__ConfiguratorModel__Group_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:2: rule__ConfiguratorModel__Group_6__1__Impl rule__ConfiguratorModel__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__1__Impl_in_rule__ConfiguratorModel__Group_6__13116);
            rule__ConfiguratorModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__2_in_rule__ConfiguratorModel__Group_6__13119);
            rule__ConfiguratorModel__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__1"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: rule__ConfiguratorModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ConfiguratorModel__Group_6__1__Impl3147); 
             after(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: rule__ConfiguratorModel__Group_6__2 : rule__ConfiguratorModel__Group_6__2__Impl rule__ConfiguratorModel__Group_6__3 ;
    public final void rule__ConfiguratorModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( rule__ConfiguratorModel__Group_6__2__Impl rule__ConfiguratorModel__Group_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:2: rule__ConfiguratorModel__Group_6__2__Impl rule__ConfiguratorModel__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__2__Impl_in_rule__ConfiguratorModel__Group_6__23178);
            rule__ConfiguratorModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__3_in_rule__ConfiguratorModel__Group_6__23181);
            rule__ConfiguratorModel__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__2"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: rule__ConfiguratorModel__Group_6__2__Impl : ( ( rule__ConfiguratorModel__EnumsAssignment_6_2 ) ) ;
    public final void rule__ConfiguratorModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( ( ( rule__ConfiguratorModel__EnumsAssignment_6_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( ( rule__ConfiguratorModel__EnumsAssignment_6_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( ( rule__ConfiguratorModel__EnumsAssignment_6_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( rule__ConfiguratorModel__EnumsAssignment_6_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getEnumsAssignment_6_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( rule__ConfiguratorModel__EnumsAssignment_6_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:2: rule__ConfiguratorModel__EnumsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__EnumsAssignment_6_2_in_rule__ConfiguratorModel__Group_6__2__Impl3208);
            rule__ConfiguratorModel__EnumsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getEnumsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__2__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: rule__ConfiguratorModel__Group_6__3 : rule__ConfiguratorModel__Group_6__3__Impl rule__ConfiguratorModel__Group_6__4 ;
    public final void rule__ConfiguratorModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: ( rule__ConfiguratorModel__Group_6__3__Impl rule__ConfiguratorModel__Group_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:2: rule__ConfiguratorModel__Group_6__3__Impl rule__ConfiguratorModel__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__3__Impl_in_rule__ConfiguratorModel__Group_6__33238);
            rule__ConfiguratorModel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__4_in_rule__ConfiguratorModel__Group_6__33241);
            rule__ConfiguratorModel__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__3"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__ConfiguratorModel__Group_6__3__Impl : ( ( rule__ConfiguratorModel__Group_6_3__0 )* ) ;
    public final void rule__ConfiguratorModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( ( ( rule__ConfiguratorModel__Group_6_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__ConfiguratorModel__Group_6_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__ConfiguratorModel__Group_6_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( rule__ConfiguratorModel__Group_6_3__0 )*
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( rule__ConfiguratorModel__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:2: rule__ConfiguratorModel__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6_3__0_in_rule__ConfiguratorModel__Group_6__3__Impl3268);
            	    rule__ConfiguratorModel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getConfiguratorModelAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__3__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__ConfiguratorModel__Group_6__4 : rule__ConfiguratorModel__Group_6__4__Impl ;
    public final void rule__ConfiguratorModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( rule__ConfiguratorModel__Group_6__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:2: rule__ConfiguratorModel__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6__4__Impl_in_rule__ConfiguratorModel__Group_6__43299);
            rule__ConfiguratorModel__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__4"


    // $ANTLR start "rule__ConfiguratorModel__Group_6__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: rule__ConfiguratorModel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ConfiguratorModel__Group_6__4__Impl3327); 
             after(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6__4__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__ConfiguratorModel__Group_6_3__0 : rule__ConfiguratorModel__Group_6_3__0__Impl rule__ConfiguratorModel__Group_6_3__1 ;
    public final void rule__ConfiguratorModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( rule__ConfiguratorModel__Group_6_3__0__Impl rule__ConfiguratorModel__Group_6_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:2: rule__ConfiguratorModel__Group_6_3__0__Impl rule__ConfiguratorModel__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6_3__0__Impl_in_rule__ConfiguratorModel__Group_6_3__03368);
            rule__ConfiguratorModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6_3__1_in_rule__ConfiguratorModel__Group_6_3__03371);
            rule__ConfiguratorModel__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6_3__0"


    // $ANTLR start "rule__ConfiguratorModel__Group_6_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: rule__ConfiguratorModel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ConfiguratorModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ','
            {
             before(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_6_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConfiguratorModel__Group_6_3__0__Impl3399); 
             after(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6_3__0__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group_6_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: rule__ConfiguratorModel__Group_6_3__1 : rule__ConfiguratorModel__Group_6_3__1__Impl ;
    public final void rule__ConfiguratorModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( rule__ConfiguratorModel__Group_6_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:2: rule__ConfiguratorModel__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_6_3__1__Impl_in_rule__ConfiguratorModel__Group_6_3__13430);
            rule__ConfiguratorModel__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6_3__1"


    // $ANTLR start "rule__ConfiguratorModel__Group_6_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: rule__ConfiguratorModel__Group_6_3__1__Impl : ( ( rule__ConfiguratorModel__EnumsAssignment_6_3_1 ) ) ;
    public final void rule__ConfiguratorModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( ( rule__ConfiguratorModel__EnumsAssignment_6_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( ( rule__ConfiguratorModel__EnumsAssignment_6_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( ( rule__ConfiguratorModel__EnumsAssignment_6_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( rule__ConfiguratorModel__EnumsAssignment_6_3_1 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getEnumsAssignment_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: ( rule__ConfiguratorModel__EnumsAssignment_6_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:2: rule__ConfiguratorModel__EnumsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__EnumsAssignment_6_3_1_in_rule__ConfiguratorModel__Group_6_3__1__Impl3457);
            rule__ConfiguratorModel__EnumsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getEnumsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__Group_6_3__1__Impl"


    // $ANTLR start "rule__Parameter2__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: rule__Parameter2__Group__0 : rule__Parameter2__Group__0__Impl rule__Parameter2__Group__1 ;
    public final void rule__Parameter2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( rule__Parameter2__Group__0__Impl rule__Parameter2__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:2: rule__Parameter2__Group__0__Impl rule__Parameter2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__0__Impl_in_rule__Parameter2__Group__03491);
            rule__Parameter2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__1_in_rule__Parameter2__Group__03494);
            rule__Parameter2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__0"


    // $ANTLR start "rule__Parameter2__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: rule__Parameter2__Group__0__Impl : ( () ) ;
    public final void rule__Parameter2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: ()
            {
             before(grammarAccess.getParameter2Access().getParameterAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: 
            {
            }

             after(grammarAccess.getParameter2Access().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__0__Impl"


    // $ANTLR start "rule__Parameter2__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: rule__Parameter2__Group__1 : rule__Parameter2__Group__1__Impl rule__Parameter2__Group__2 ;
    public final void rule__Parameter2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( rule__Parameter2__Group__1__Impl rule__Parameter2__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:2: rule__Parameter2__Group__1__Impl rule__Parameter2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__1__Impl_in_rule__Parameter2__Group__13552);
            rule__Parameter2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__2_in_rule__Parameter2__Group__13555);
            rule__Parameter2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__1"


    // $ANTLR start "rule__Parameter2__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: rule__Parameter2__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: ( ( 'Parameter' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( 'Parameter' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( 'Parameter' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: 'Parameter'
            {
             before(grammarAccess.getParameter2Access().getParameterKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Parameter2__Group__1__Impl3583); 
             after(grammarAccess.getParameter2Access().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__1__Impl"


    // $ANTLR start "rule__Parameter2__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Parameter2__Group__2 : rule__Parameter2__Group__2__Impl rule__Parameter2__Group__3 ;
    public final void rule__Parameter2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( rule__Parameter2__Group__2__Impl rule__Parameter2__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:2: rule__Parameter2__Group__2__Impl rule__Parameter2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__2__Impl_in_rule__Parameter2__Group__23614);
            rule__Parameter2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__3_in_rule__Parameter2__Group__23617);
            rule__Parameter2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__2"


    // $ANTLR start "rule__Parameter2__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: rule__Parameter2__Group__2__Impl : ( ( rule__Parameter2__NameAssignment_2 ) ) ;
    public final void rule__Parameter2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( ( rule__Parameter2__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( ( rule__Parameter2__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( ( rule__Parameter2__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__Parameter2__NameAssignment_2 )
            {
             before(grammarAccess.getParameter2Access().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: ( rule__Parameter2__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:2: rule__Parameter2__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__NameAssignment_2_in_rule__Parameter2__Group__2__Impl3644);
            rule__Parameter2__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__2__Impl"


    // $ANTLR start "rule__Parameter2__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: rule__Parameter2__Group__3 : rule__Parameter2__Group__3__Impl rule__Parameter2__Group__4 ;
    public final void rule__Parameter2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: ( rule__Parameter2__Group__3__Impl rule__Parameter2__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:2: rule__Parameter2__Group__3__Impl rule__Parameter2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__3__Impl_in_rule__Parameter2__Group__33674);
            rule__Parameter2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__4_in_rule__Parameter2__Group__33677);
            rule__Parameter2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__3"


    // $ANTLR start "rule__Parameter2__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: rule__Parameter2__Group__3__Impl : ( '(' ) ;
    public final void rule__Parameter2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: '('
            {
             before(grammarAccess.getParameter2Access().getLeftParenthesisKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Parameter2__Group__3__Impl3705); 
             after(grammarAccess.getParameter2Access().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__3__Impl"


    // $ANTLR start "rule__Parameter2__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: rule__Parameter2__Group__4 : rule__Parameter2__Group__4__Impl rule__Parameter2__Group__5 ;
    public final void rule__Parameter2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: ( rule__Parameter2__Group__4__Impl rule__Parameter2__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:2: rule__Parameter2__Group__4__Impl rule__Parameter2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__4__Impl_in_rule__Parameter2__Group__43736);
            rule__Parameter2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__5_in_rule__Parameter2__Group__43739);
            rule__Parameter2__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__4"


    // $ANTLR start "rule__Parameter2__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: rule__Parameter2__Group__4__Impl : ( ( rule__Parameter2__Group_4__0 ) ) ;
    public final void rule__Parameter2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: ( ( ( rule__Parameter2__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( rule__Parameter2__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( rule__Parameter2__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( rule__Parameter2__Group_4__0 )
            {
             before(grammarAccess.getParameter2Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ( rule__Parameter2__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:2: rule__Parameter2__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_4__0_in_rule__Parameter2__Group__4__Impl3766);
            rule__Parameter2__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__4__Impl"


    // $ANTLR start "rule__Parameter2__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: rule__Parameter2__Group__5 : rule__Parameter2__Group__5__Impl rule__Parameter2__Group__6 ;
    public final void rule__Parameter2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( rule__Parameter2__Group__5__Impl rule__Parameter2__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:2: rule__Parameter2__Group__5__Impl rule__Parameter2__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__5__Impl_in_rule__Parameter2__Group__53796);
            rule__Parameter2__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__6_in_rule__Parameter2__Group__53799);
            rule__Parameter2__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__5"


    // $ANTLR start "rule__Parameter2__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: rule__Parameter2__Group__5__Impl : ( ',' ) ;
    public final void rule__Parameter2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: ','
            {
             before(grammarAccess.getParameter2Access().getCommaKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Parameter2__Group__5__Impl3827); 
             after(grammarAccess.getParameter2Access().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__5__Impl"


    // $ANTLR start "rule__Parameter2__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: rule__Parameter2__Group__6 : rule__Parameter2__Group__6__Impl rule__Parameter2__Group__7 ;
    public final void rule__Parameter2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( rule__Parameter2__Group__6__Impl rule__Parameter2__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:2: rule__Parameter2__Group__6__Impl rule__Parameter2__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__6__Impl_in_rule__Parameter2__Group__63858);
            rule__Parameter2__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__7_in_rule__Parameter2__Group__63861);
            rule__Parameter2__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__6"


    // $ANTLR start "rule__Parameter2__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: rule__Parameter2__Group__6__Impl : ( ( rule__Parameter2__Group_6__0 ) ) ;
    public final void rule__Parameter2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( ( ( rule__Parameter2__Group_6__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( ( rule__Parameter2__Group_6__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( ( rule__Parameter2__Group_6__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( rule__Parameter2__Group_6__0 )
            {
             before(grammarAccess.getParameter2Access().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( rule__Parameter2__Group_6__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:2: rule__Parameter2__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_6__0_in_rule__Parameter2__Group__6__Impl3888);
            rule__Parameter2__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__6__Impl"


    // $ANTLR start "rule__Parameter2__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: rule__Parameter2__Group__7 : rule__Parameter2__Group__7__Impl rule__Parameter2__Group__8 ;
    public final void rule__Parameter2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( rule__Parameter2__Group__7__Impl rule__Parameter2__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:2: rule__Parameter2__Group__7__Impl rule__Parameter2__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__7__Impl_in_rule__Parameter2__Group__73918);
            rule__Parameter2__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__8_in_rule__Parameter2__Group__73921);
            rule__Parameter2__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__7"


    // $ANTLR start "rule__Parameter2__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: rule__Parameter2__Group__7__Impl : ( ',' ) ;
    public final void rule__Parameter2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ','
            {
             before(grammarAccess.getParameter2Access().getCommaKeyword_7()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Parameter2__Group__7__Impl3949); 
             after(grammarAccess.getParameter2Access().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__7__Impl"


    // $ANTLR start "rule__Parameter2__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: rule__Parameter2__Group__8 : rule__Parameter2__Group__8__Impl rule__Parameter2__Group__9 ;
    public final void rule__Parameter2__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( rule__Parameter2__Group__8__Impl rule__Parameter2__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:2: rule__Parameter2__Group__8__Impl rule__Parameter2__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__8__Impl_in_rule__Parameter2__Group__83980);
            rule__Parameter2__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__9_in_rule__Parameter2__Group__83983);
            rule__Parameter2__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__8"


    // $ANTLR start "rule__Parameter2__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: rule__Parameter2__Group__8__Impl : ( ( rule__Parameter2__Group_8__0 )? ) ;
    public final void rule__Parameter2__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: ( ( ( rule__Parameter2__Group_8__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ( rule__Parameter2__Group_8__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ( rule__Parameter2__Group_8__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( rule__Parameter2__Group_8__0 )?
            {
             before(grammarAccess.getParameter2Access().getGroup_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( rule__Parameter2__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:2: rule__Parameter2__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_8__0_in_rule__Parameter2__Group__8__Impl4010);
                    rule__Parameter2__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameter2Access().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__8__Impl"


    // $ANTLR start "rule__Parameter2__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:1: rule__Parameter2__Group__9 : rule__Parameter2__Group__9__Impl ;
    public final void rule__Parameter2__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ( rule__Parameter2__Group__9__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:2: rule__Parameter2__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group__9__Impl_in_rule__Parameter2__Group__94041);
            rule__Parameter2__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__9"


    // $ANTLR start "rule__Parameter2__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: rule__Parameter2__Group__9__Impl : ( ')' ) ;
    public final void rule__Parameter2__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: ')'
            {
             before(grammarAccess.getParameter2Access().getRightParenthesisKeyword_9()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Parameter2__Group__9__Impl4069); 
             after(grammarAccess.getParameter2Access().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group__9__Impl"


    // $ANTLR start "rule__Parameter2__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: rule__Parameter2__Group_4__0 : rule__Parameter2__Group_4__0__Impl rule__Parameter2__Group_4__1 ;
    public final void rule__Parameter2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( rule__Parameter2__Group_4__0__Impl rule__Parameter2__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:2: rule__Parameter2__Group_4__0__Impl rule__Parameter2__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_4__0__Impl_in_rule__Parameter2__Group_4__04120);
            rule__Parameter2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_4__1_in_rule__Parameter2__Group_4__04123);
            rule__Parameter2__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_4__0"


    // $ANTLR start "rule__Parameter2__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: rule__Parameter2__Group_4__0__Impl : ( 'maxChosenValues' ) ;
    public final void rule__Parameter2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( ( 'maxChosenValues' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( 'maxChosenValues' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( 'maxChosenValues' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: 'maxChosenValues'
            {
             before(grammarAccess.getParameter2Access().getMaxChosenValuesKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Parameter2__Group_4__0__Impl4151); 
             after(grammarAccess.getParameter2Access().getMaxChosenValuesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_4__0__Impl"


    // $ANTLR start "rule__Parameter2__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: rule__Parameter2__Group_4__1 : rule__Parameter2__Group_4__1__Impl rule__Parameter2__Group_4__2 ;
    public final void rule__Parameter2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( rule__Parameter2__Group_4__1__Impl rule__Parameter2__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:2: rule__Parameter2__Group_4__1__Impl rule__Parameter2__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_4__1__Impl_in_rule__Parameter2__Group_4__14182);
            rule__Parameter2__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_4__2_in_rule__Parameter2__Group_4__14185);
            rule__Parameter2__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_4__1"


    // $ANTLR start "rule__Parameter2__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: rule__Parameter2__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Parameter2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ':'
            {
             before(grammarAccess.getParameter2Access().getColonKeyword_4_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter2__Group_4__1__Impl4213); 
             after(grammarAccess.getParameter2Access().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter2__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: rule__Parameter2__Group_4__2 : rule__Parameter2__Group_4__2__Impl ;
    public final void rule__Parameter2__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( rule__Parameter2__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:2: rule__Parameter2__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_4__2__Impl_in_rule__Parameter2__Group_4__24244);
            rule__Parameter2__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_4__2"


    // $ANTLR start "rule__Parameter2__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: rule__Parameter2__Group_4__2__Impl : ( ( rule__Parameter2__MaxChosenValuesAssignment_4_2 ) ) ;
    public final void rule__Parameter2__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ( ( rule__Parameter2__MaxChosenValuesAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( ( rule__Parameter2__MaxChosenValuesAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( ( rule__Parameter2__MaxChosenValuesAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( rule__Parameter2__MaxChosenValuesAssignment_4_2 )
            {
             before(grammarAccess.getParameter2Access().getMaxChosenValuesAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( rule__Parameter2__MaxChosenValuesAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:2: rule__Parameter2__MaxChosenValuesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__MaxChosenValuesAssignment_4_2_in_rule__Parameter2__Group_4__2__Impl4271);
            rule__Parameter2__MaxChosenValuesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getMaxChosenValuesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_4__2__Impl"


    // $ANTLR start "rule__Parameter2__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: rule__Parameter2__Group_6__0 : rule__Parameter2__Group_6__0__Impl rule__Parameter2__Group_6__1 ;
    public final void rule__Parameter2__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( rule__Parameter2__Group_6__0__Impl rule__Parameter2__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:2: rule__Parameter2__Group_6__0__Impl rule__Parameter2__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_6__0__Impl_in_rule__Parameter2__Group_6__04307);
            rule__Parameter2__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_6__1_in_rule__Parameter2__Group_6__04310);
            rule__Parameter2__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_6__0"


    // $ANTLR start "rule__Parameter2__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: rule__Parameter2__Group_6__0__Impl : ( 'minChosenValues' ) ;
    public final void rule__Parameter2__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( ( 'minChosenValues' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( 'minChosenValues' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( 'minChosenValues' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: 'minChosenValues'
            {
             before(grammarAccess.getParameter2Access().getMinChosenValuesKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Parameter2__Group_6__0__Impl4338); 
             after(grammarAccess.getParameter2Access().getMinChosenValuesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_6__0__Impl"


    // $ANTLR start "rule__Parameter2__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: rule__Parameter2__Group_6__1 : rule__Parameter2__Group_6__1__Impl rule__Parameter2__Group_6__2 ;
    public final void rule__Parameter2__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ( rule__Parameter2__Group_6__1__Impl rule__Parameter2__Group_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:2: rule__Parameter2__Group_6__1__Impl rule__Parameter2__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_6__1__Impl_in_rule__Parameter2__Group_6__14369);
            rule__Parameter2__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_6__2_in_rule__Parameter2__Group_6__14372);
            rule__Parameter2__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_6__1"


    // $ANTLR start "rule__Parameter2__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: rule__Parameter2__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Parameter2__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ':'
            {
             before(grammarAccess.getParameter2Access().getColonKeyword_6_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter2__Group_6__1__Impl4400); 
             after(grammarAccess.getParameter2Access().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_6__1__Impl"


    // $ANTLR start "rule__Parameter2__Group_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__Parameter2__Group_6__2 : rule__Parameter2__Group_6__2__Impl ;
    public final void rule__Parameter2__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( rule__Parameter2__Group_6__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:2: rule__Parameter2__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_6__2__Impl_in_rule__Parameter2__Group_6__24431);
            rule__Parameter2__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_6__2"


    // $ANTLR start "rule__Parameter2__Group_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: rule__Parameter2__Group_6__2__Impl : ( ( rule__Parameter2__MinChosenValuesAssignment_6_2 ) ) ;
    public final void rule__Parameter2__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( ( ( rule__Parameter2__MinChosenValuesAssignment_6_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( ( rule__Parameter2__MinChosenValuesAssignment_6_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( ( rule__Parameter2__MinChosenValuesAssignment_6_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: ( rule__Parameter2__MinChosenValuesAssignment_6_2 )
            {
             before(grammarAccess.getParameter2Access().getMinChosenValuesAssignment_6_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: ( rule__Parameter2__MinChosenValuesAssignment_6_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:2: rule__Parameter2__MinChosenValuesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__MinChosenValuesAssignment_6_2_in_rule__Parameter2__Group_6__2__Impl4458);
            rule__Parameter2__MinChosenValuesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getMinChosenValuesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_6__2__Impl"


    // $ANTLR start "rule__Parameter2__Group_8__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: rule__Parameter2__Group_8__0 : rule__Parameter2__Group_8__0__Impl rule__Parameter2__Group_8__1 ;
    public final void rule__Parameter2__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( rule__Parameter2__Group_8__0__Impl rule__Parameter2__Group_8__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:2: rule__Parameter2__Group_8__0__Impl rule__Parameter2__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_8__0__Impl_in_rule__Parameter2__Group_8__04494);
            rule__Parameter2__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_8__1_in_rule__Parameter2__Group_8__04497);
            rule__Parameter2__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_8__0"


    // $ANTLR start "rule__Parameter2__Group_8__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: rule__Parameter2__Group_8__0__Impl : ( 'enum' ) ;
    public final void rule__Parameter2__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( ( 'enum' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( 'enum' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( 'enum' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: 'enum'
            {
             before(grammarAccess.getParameter2Access().getEnumKeyword_8_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Parameter2__Group_8__0__Impl4525); 
             after(grammarAccess.getParameter2Access().getEnumKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_8__0__Impl"


    // $ANTLR start "rule__Parameter2__Group_8__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: rule__Parameter2__Group_8__1 : rule__Parameter2__Group_8__1__Impl rule__Parameter2__Group_8__2 ;
    public final void rule__Parameter2__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( rule__Parameter2__Group_8__1__Impl rule__Parameter2__Group_8__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:2: rule__Parameter2__Group_8__1__Impl rule__Parameter2__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_8__1__Impl_in_rule__Parameter2__Group_8__14556);
            rule__Parameter2__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_8__2_in_rule__Parameter2__Group_8__14559);
            rule__Parameter2__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_8__1"


    // $ANTLR start "rule__Parameter2__Group_8__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: rule__Parameter2__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Parameter2__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: ':'
            {
             before(grammarAccess.getParameter2Access().getColonKeyword_8_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter2__Group_8__1__Impl4587); 
             after(grammarAccess.getParameter2Access().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_8__1__Impl"


    // $ANTLR start "rule__Parameter2__Group_8__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: rule__Parameter2__Group_8__2 : rule__Parameter2__Group_8__2__Impl ;
    public final void rule__Parameter2__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( rule__Parameter2__Group_8__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:2: rule__Parameter2__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__Group_8__2__Impl_in_rule__Parameter2__Group_8__24618);
            rule__Parameter2__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_8__2"


    // $ANTLR start "rule__Parameter2__Group_8__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: rule__Parameter2__Group_8__2__Impl : ( ( rule__Parameter2__EnumAssignment_8_2 ) ) ;
    public final void rule__Parameter2__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( ( ( rule__Parameter2__EnumAssignment_8_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: ( ( rule__Parameter2__EnumAssignment_8_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: ( ( rule__Parameter2__EnumAssignment_8_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: ( rule__Parameter2__EnumAssignment_8_2 )
            {
             before(grammarAccess.getParameter2Access().getEnumAssignment_8_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( rule__Parameter2__EnumAssignment_8_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:2: rule__Parameter2__EnumAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter2__EnumAssignment_8_2_in_rule__Parameter2__Group_8__2__Impl4645);
            rule__Parameter2__EnumAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getParameter2Access().getEnumAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__Group_8__2__Impl"


    // $ANTLR start "rule__Parameter3__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: rule__Parameter3__Group__0 : rule__Parameter3__Group__0__Impl rule__Parameter3__Group__1 ;
    public final void rule__Parameter3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: ( rule__Parameter3__Group__0__Impl rule__Parameter3__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:2: rule__Parameter3__Group__0__Impl rule__Parameter3__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__0__Impl_in_rule__Parameter3__Group__04681);
            rule__Parameter3__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__1_in_rule__Parameter3__Group__04684);
            rule__Parameter3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__0"


    // $ANTLR start "rule__Parameter3__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: rule__Parameter3__Group__0__Impl : ( () ) ;
    public final void rule__Parameter3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: ()
            {
             before(grammarAccess.getParameter3Access().getParameterAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: 
            {
            }

             after(grammarAccess.getParameter3Access().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__0__Impl"


    // $ANTLR start "rule__Parameter3__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: rule__Parameter3__Group__1 : rule__Parameter3__Group__1__Impl rule__Parameter3__Group__2 ;
    public final void rule__Parameter3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( rule__Parameter3__Group__1__Impl rule__Parameter3__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:2: rule__Parameter3__Group__1__Impl rule__Parameter3__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__1__Impl_in_rule__Parameter3__Group__14742);
            rule__Parameter3__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__2_in_rule__Parameter3__Group__14745);
            rule__Parameter3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__1"


    // $ANTLR start "rule__Parameter3__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: rule__Parameter3__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: ( ( 'Parameter' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( 'Parameter' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( 'Parameter' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: 'Parameter'
            {
             before(grammarAccess.getParameter3Access().getParameterKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Parameter3__Group__1__Impl4773); 
             after(grammarAccess.getParameter3Access().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__1__Impl"


    // $ANTLR start "rule__Parameter3__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: rule__Parameter3__Group__2 : rule__Parameter3__Group__2__Impl rule__Parameter3__Group__3 ;
    public final void rule__Parameter3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: ( rule__Parameter3__Group__2__Impl rule__Parameter3__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:2: rule__Parameter3__Group__2__Impl rule__Parameter3__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__2__Impl_in_rule__Parameter3__Group__24804);
            rule__Parameter3__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__3_in_rule__Parameter3__Group__24807);
            rule__Parameter3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__2"


    // $ANTLR start "rule__Parameter3__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: rule__Parameter3__Group__2__Impl : ( ( rule__Parameter3__NameAssignment_2 ) ) ;
    public final void rule__Parameter3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( ( ( rule__Parameter3__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( ( rule__Parameter3__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( ( rule__Parameter3__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( rule__Parameter3__NameAssignment_2 )
            {
             before(grammarAccess.getParameter3Access().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: ( rule__Parameter3__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:2: rule__Parameter3__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__NameAssignment_2_in_rule__Parameter3__Group__2__Impl4834);
            rule__Parameter3__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameter3Access().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__2__Impl"


    // $ANTLR start "rule__Parameter3__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: rule__Parameter3__Group__3 : rule__Parameter3__Group__3__Impl rule__Parameter3__Group__4 ;
    public final void rule__Parameter3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( rule__Parameter3__Group__3__Impl rule__Parameter3__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:2: rule__Parameter3__Group__3__Impl rule__Parameter3__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__3__Impl_in_rule__Parameter3__Group__34864);
            rule__Parameter3__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__4_in_rule__Parameter3__Group__34867);
            rule__Parameter3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__3"


    // $ANTLR start "rule__Parameter3__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: rule__Parameter3__Group__3__Impl : ( '(' ) ;
    public final void rule__Parameter3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: '('
            {
             before(grammarAccess.getParameter3Access().getLeftParenthesisKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Parameter3__Group__3__Impl4895); 
             after(grammarAccess.getParameter3Access().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__3__Impl"


    // $ANTLR start "rule__Parameter3__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: rule__Parameter3__Group__4 : rule__Parameter3__Group__4__Impl rule__Parameter3__Group__5 ;
    public final void rule__Parameter3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( rule__Parameter3__Group__4__Impl rule__Parameter3__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:2: rule__Parameter3__Group__4__Impl rule__Parameter3__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__4__Impl_in_rule__Parameter3__Group__44926);
            rule__Parameter3__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__5_in_rule__Parameter3__Group__44929);
            rule__Parameter3__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__4"


    // $ANTLR start "rule__Parameter3__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: rule__Parameter3__Group__4__Impl : ( ( rule__Parameter3__Group_4__0 ) ) ;
    public final void rule__Parameter3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( ( ( rule__Parameter3__Group_4__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( ( rule__Parameter3__Group_4__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( ( rule__Parameter3__Group_4__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( rule__Parameter3__Group_4__0 )
            {
             before(grammarAccess.getParameter3Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( rule__Parameter3__Group_4__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:2: rule__Parameter3__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__0_in_rule__Parameter3__Group__4__Impl4956);
            rule__Parameter3__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter3Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__4__Impl"


    // $ANTLR start "rule__Parameter3__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__Parameter3__Group__5 : rule__Parameter3__Group__5__Impl ;
    public final void rule__Parameter3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( rule__Parameter3__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:2: rule__Parameter3__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group__5__Impl_in_rule__Parameter3__Group__54986);
            rule__Parameter3__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__5"


    // $ANTLR start "rule__Parameter3__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rule__Parameter3__Group__5__Impl : ( ')' ) ;
    public final void rule__Parameter3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ')'
            {
             before(grammarAccess.getParameter3Access().getRightParenthesisKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Parameter3__Group__5__Impl5014); 
             after(grammarAccess.getParameter3Access().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group__5__Impl"


    // $ANTLR start "rule__Parameter3__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: rule__Parameter3__Group_4__0 : rule__Parameter3__Group_4__0__Impl rule__Parameter3__Group_4__1 ;
    public final void rule__Parameter3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( rule__Parameter3__Group_4__0__Impl rule__Parameter3__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:2: rule__Parameter3__Group_4__0__Impl rule__Parameter3__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__0__Impl_in_rule__Parameter3__Group_4__05057);
            rule__Parameter3__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__1_in_rule__Parameter3__Group_4__05060);
            rule__Parameter3__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__0"


    // $ANTLR start "rule__Parameter3__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: rule__Parameter3__Group_4__0__Impl : ( 'children' ) ;
    public final void rule__Parameter3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( ( 'children' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( 'children' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( 'children' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: 'children'
            {
             before(grammarAccess.getParameter3Access().getChildrenKeyword_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Parameter3__Group_4__0__Impl5088); 
             after(grammarAccess.getParameter3Access().getChildrenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__0__Impl"


    // $ANTLR start "rule__Parameter3__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__Parameter3__Group_4__1 : rule__Parameter3__Group_4__1__Impl rule__Parameter3__Group_4__2 ;
    public final void rule__Parameter3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( rule__Parameter3__Group_4__1__Impl rule__Parameter3__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:2: rule__Parameter3__Group_4__1__Impl rule__Parameter3__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__1__Impl_in_rule__Parameter3__Group_4__15119);
            rule__Parameter3__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__2_in_rule__Parameter3__Group_4__15122);
            rule__Parameter3__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__1"


    // $ANTLR start "rule__Parameter3__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: rule__Parameter3__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Parameter3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ':'
            {
             before(grammarAccess.getParameter3Access().getColonKeyword_4_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter3__Group_4__1__Impl5150); 
             after(grammarAccess.getParameter3Access().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter3__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: rule__Parameter3__Group_4__2 : rule__Parameter3__Group_4__2__Impl rule__Parameter3__Group_4__3 ;
    public final void rule__Parameter3__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: ( rule__Parameter3__Group_4__2__Impl rule__Parameter3__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:2: rule__Parameter3__Group_4__2__Impl rule__Parameter3__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__2__Impl_in_rule__Parameter3__Group_4__25181);
            rule__Parameter3__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__3_in_rule__Parameter3__Group_4__25184);
            rule__Parameter3__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__2"


    // $ANTLR start "rule__Parameter3__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: rule__Parameter3__Group_4__2__Impl : ( '[' ) ;
    public final void rule__Parameter3__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: '['
            {
             before(grammarAccess.getParameter3Access().getLeftSquareBracketKeyword_4_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Parameter3__Group_4__2__Impl5212); 
             after(grammarAccess.getParameter3Access().getLeftSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__2__Impl"


    // $ANTLR start "rule__Parameter3__Group_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: rule__Parameter3__Group_4__3 : rule__Parameter3__Group_4__3__Impl rule__Parameter3__Group_4__4 ;
    public final void rule__Parameter3__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: ( rule__Parameter3__Group_4__3__Impl rule__Parameter3__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:2: rule__Parameter3__Group_4__3__Impl rule__Parameter3__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__3__Impl_in_rule__Parameter3__Group_4__35243);
            rule__Parameter3__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__4_in_rule__Parameter3__Group_4__35246);
            rule__Parameter3__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__3"


    // $ANTLR start "rule__Parameter3__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: rule__Parameter3__Group_4__3__Impl : ( ( rule__Parameter3__ChildrenAssignment_4_3 ) ) ;
    public final void rule__Parameter3__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: ( ( ( rule__Parameter3__ChildrenAssignment_4_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( ( rule__Parameter3__ChildrenAssignment_4_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( ( rule__Parameter3__ChildrenAssignment_4_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( rule__Parameter3__ChildrenAssignment_4_3 )
            {
             before(grammarAccess.getParameter3Access().getChildrenAssignment_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( rule__Parameter3__ChildrenAssignment_4_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:2: rule__Parameter3__ChildrenAssignment_4_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__ChildrenAssignment_4_3_in_rule__Parameter3__Group_4__3__Impl5273);
            rule__Parameter3__ChildrenAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getParameter3Access().getChildrenAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__3__Impl"


    // $ANTLR start "rule__Parameter3__Group_4__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: rule__Parameter3__Group_4__4 : rule__Parameter3__Group_4__4__Impl rule__Parameter3__Group_4__5 ;
    public final void rule__Parameter3__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ( rule__Parameter3__Group_4__4__Impl rule__Parameter3__Group_4__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:2: rule__Parameter3__Group_4__4__Impl rule__Parameter3__Group_4__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__4__Impl_in_rule__Parameter3__Group_4__45303);
            rule__Parameter3__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__5_in_rule__Parameter3__Group_4__45306);
            rule__Parameter3__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__4"


    // $ANTLR start "rule__Parameter3__Group_4__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: rule__Parameter3__Group_4__4__Impl : ( ( rule__Parameter3__Group_4_4__0 )* ) ;
    public final void rule__Parameter3__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( ( rule__Parameter3__Group_4_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( ( rule__Parameter3__Group_4_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( ( rule__Parameter3__Group_4_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( rule__Parameter3__Group_4_4__0 )*
            {
             before(grammarAccess.getParameter3Access().getGroup_4_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__Parameter3__Group_4_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:2: rule__Parameter3__Group_4_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4_4__0_in_rule__Parameter3__Group_4__4__Impl5333);
            	    rule__Parameter3__Group_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getParameter3Access().getGroup_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__4__Impl"


    // $ANTLR start "rule__Parameter3__Group_4__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: rule__Parameter3__Group_4__5 : rule__Parameter3__Group_4__5__Impl ;
    public final void rule__Parameter3__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ( rule__Parameter3__Group_4__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:2: rule__Parameter3__Group_4__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4__5__Impl_in_rule__Parameter3__Group_4__55364);
            rule__Parameter3__Group_4__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__5"


    // $ANTLR start "rule__Parameter3__Group_4__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__Parameter3__Group_4__5__Impl : ( ']' ) ;
    public final void rule__Parameter3__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ']'
            {
             before(grammarAccess.getParameter3Access().getRightSquareBracketKeyword_4_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Parameter3__Group_4__5__Impl5392); 
             after(grammarAccess.getParameter3Access().getRightSquareBracketKeyword_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4__5__Impl"


    // $ANTLR start "rule__Parameter3__Group_4_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: rule__Parameter3__Group_4_4__0 : rule__Parameter3__Group_4_4__0__Impl rule__Parameter3__Group_4_4__1 ;
    public final void rule__Parameter3__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( rule__Parameter3__Group_4_4__0__Impl rule__Parameter3__Group_4_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:2: rule__Parameter3__Group_4_4__0__Impl rule__Parameter3__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4_4__0__Impl_in_rule__Parameter3__Group_4_4__05435);
            rule__Parameter3__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4_4__1_in_rule__Parameter3__Group_4_4__05438);
            rule__Parameter3__Group_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4_4__0"


    // $ANTLR start "rule__Parameter3__Group_4_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: rule__Parameter3__Group_4_4__0__Impl : ( ',' ) ;
    public final void rule__Parameter3__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ','
            {
             before(grammarAccess.getParameter3Access().getCommaKeyword_4_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Parameter3__Group_4_4__0__Impl5466); 
             after(grammarAccess.getParameter3Access().getCommaKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4_4__0__Impl"


    // $ANTLR start "rule__Parameter3__Group_4_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: rule__Parameter3__Group_4_4__1 : rule__Parameter3__Group_4_4__1__Impl ;
    public final void rule__Parameter3__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: ( rule__Parameter3__Group_4_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:2: rule__Parameter3__Group_4_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__Group_4_4__1__Impl_in_rule__Parameter3__Group_4_4__15497);
            rule__Parameter3__Group_4_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4_4__1"


    // $ANTLR start "rule__Parameter3__Group_4_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: rule__Parameter3__Group_4_4__1__Impl : ( ( rule__Parameter3__ChildrenAssignment_4_4_1 ) ) ;
    public final void rule__Parameter3__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: ( ( ( rule__Parameter3__ChildrenAssignment_4_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( ( rule__Parameter3__ChildrenAssignment_4_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( ( rule__Parameter3__ChildrenAssignment_4_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( rule__Parameter3__ChildrenAssignment_4_4_1 )
            {
             before(grammarAccess.getParameter3Access().getChildrenAssignment_4_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( rule__Parameter3__ChildrenAssignment_4_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:2: rule__Parameter3__ChildrenAssignment_4_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter3__ChildrenAssignment_4_4_1_in_rule__Parameter3__Group_4_4__1__Impl5524);
            rule__Parameter3__ChildrenAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameter3Access().getChildrenAssignment_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__Group_4_4__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__05558);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__05561);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__Constraint__Group__0__Impl : ( () ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ()
            {
             before(grammarAccess.getConstraintAccess().getConstraintAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: 
            {
            }

             after(grammarAccess.getConstraintAccess().getConstraintAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2794:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__15619);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__15622);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Group_1__0 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( ( ( rule__Constraint__Group_1__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:1: ( ( rule__Constraint__Group_1__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:1: ( ( rule__Constraint__Group_1__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( rule__Constraint__Group_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: ( rule__Constraint__Group_1__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:2: rule__Constraint__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_1__0_in_rule__Constraint__Group__1__Impl5649);
            rule__Constraint__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( rule__Constraint__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__25679);
            rule__Constraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__Group_2__0 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( ( ( rule__Constraint__Group_2__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( ( rule__Constraint__Group_2__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( ( rule__Constraint__Group_2__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: ( rule__Constraint__Group_2__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: ( rule__Constraint__Group_2__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:2: rule__Constraint__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_2__0_in_rule__Constraint__Group__2__Impl5706);
            rule__Constraint__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_1__0__Impl_in_rule__Constraint__Group_1__05742);
            rule__Constraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_1__1_in_rule__Constraint__Group_1__05745);
            rule__Constraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__0"


    // $ANTLR start "rule__Constraint__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: rule__Constraint__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( ( 'if' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: ( 'if' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: ( 'if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: 'if'
            {
             before(grammarAccess.getConstraintAccess().getIfKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Constraint__Group_1__0__Impl5773); 
             after(grammarAccess.getConstraintAccess().getIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( rule__Constraint__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:2: rule__Constraint__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_1__1__Impl_in_rule__Constraint__Group_1__15804);
            rule__Constraint__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__1"


    // $ANTLR start "rule__Constraint__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: rule__Constraint__Group_1__1__Impl : ( ( rule__Constraint__IfAssignment_1_1 ) ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ( ( ( rule__Constraint__IfAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:1: ( ( rule__Constraint__IfAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:1: ( ( rule__Constraint__IfAssignment_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: ( rule__Constraint__IfAssignment_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getIfAssignment_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: ( rule__Constraint__IfAssignment_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:2: rule__Constraint__IfAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__IfAssignment_1_1_in_rule__Constraint__Group_1__1__Impl5831);
            rule__Constraint__IfAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getIfAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: rule__Constraint__Group_2__0 : rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1 ;
    public final void rule__Constraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: ( rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:2: rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_2__0__Impl_in_rule__Constraint__Group_2__05865);
            rule__Constraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_2__1_in_rule__Constraint__Group_2__05868);
            rule__Constraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__0"


    // $ANTLR start "rule__Constraint__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: rule__Constraint__Group_2__0__Impl : ( 'then' ) ;
    public final void rule__Constraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2932:1: ( ( 'then' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:1: ( 'then' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:1: ( 'then' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: 'then'
            {
             before(grammarAccess.getConstraintAccess().getThenKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Constraint__Group_2__0__Impl5896); 
             after(grammarAccess.getConstraintAccess().getThenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__0__Impl"


    // $ANTLR start "rule__Constraint__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: rule__Constraint__Group_2__1 : rule__Constraint__Group_2__1__Impl ;
    public final void rule__Constraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2951:1: ( rule__Constraint__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:2: rule__Constraint__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group_2__1__Impl_in_rule__Constraint__Group_2__15927);
            rule__Constraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__1"


    // $ANTLR start "rule__Constraint__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: rule__Constraint__Group_2__1__Impl : ( ( rule__Constraint__ThenAssignment_2_1 ) ) ;
    public final void rule__Constraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2962:1: ( ( ( rule__Constraint__ThenAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2963:1: ( ( rule__Constraint__ThenAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2963:1: ( ( rule__Constraint__ThenAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( rule__Constraint__ThenAssignment_2_1 )
            {
             before(grammarAccess.getConstraintAccess().getThenAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: ( rule__Constraint__ThenAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:2: rule__Constraint__ThenAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__ThenAssignment_2_1_in_rule__Constraint__Group_2__1__Impl5954);
            rule__Constraint__ThenAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getThenAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__05988);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05991);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ( ( 'Enum' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: ( 'Enum' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: ( 'Enum' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Enum__Group__0__Impl6019); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__16050);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__16053);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: ( rule__Enum__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl6080);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__26110);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__26113);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: rule__Enum__Group__2__Impl : ( ':' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ':'
            {
             before(grammarAccess.getEnumAccess().getColonKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Enum__Group__2__Impl6141); 
             after(grammarAccess.getEnumAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__36172);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__36175);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ValuesAssignment_3 ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( ( ( rule__Enum__ValuesAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: ( ( rule__Enum__ValuesAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: ( ( rule__Enum__ValuesAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: ( rule__Enum__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getValuesAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: ( rule__Enum__ValuesAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:2: rule__Enum__ValuesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__ValuesAssignment_3_in_rule__Enum__Group__3__Impl6202);
            rule__Enum__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__46232);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__46235);
            rule__Enum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ( ( rule__Enum__Group_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ( ( rule__Enum__Group_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ( ( rule__Enum__Group_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: ( rule__Enum__Group_4__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: ( rule__Enum__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:2: rule__Enum__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl6262);
            	    rule__Enum__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( rule__Enum__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__56293);
            rule__Enum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: rule__Enum__Group__5__Impl : ( ';' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ';'
            {
             before(grammarAccess.getEnumAccess().getSemicolonKeyword_5()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Enum__Group__5__Impl6321); 
             after(grammarAccess.getEnumAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__06364);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__06367);
            rule__Enum__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0"


    // $ANTLR start "rule__Enum__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: rule__Enum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Enum__Group_4__0__Impl6395); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0__Impl"


    // $ANTLR start "rule__Enum__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ( rule__Enum__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__16426);
            rule__Enum__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1"


    // $ANTLR start "rule__Enum__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3212:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__ValuesAssignment_4_1 ) ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: ( ( ( rule__Enum__ValuesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( ( rule__Enum__ValuesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( ( rule__Enum__ValuesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( rule__Enum__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumAccess().getValuesAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( rule__Enum__ValuesAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:2: rule__Enum__ValuesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__ValuesAssignment_4_1_in_rule__Enum__Group_4__1__Impl6453);
            rule__Enum__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06487);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06490);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:2: '-'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__EInt__Group__0__Impl6519); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16552);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6579); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__IntLiteral__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: rule__IntLiteral__Group__0 : rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 ;
    public final void rule__IntLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:1: ( rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:2: rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntLiteral__Group__0__Impl_in_rule__IntLiteral__Group__06612);
            rule__IntLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntLiteral__Group__1_in_rule__IntLiteral__Group__06615);
            rule__IntLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__0"


    // $ANTLR start "rule__IntLiteral__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: rule__IntLiteral__Group__0__Impl : ( () ) ;
    public final void rule__IntLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ()
            {
             before(grammarAccess.getIntLiteralAccess().getIntLiteralAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:1: 
            {
            }

             after(grammarAccess.getIntLiteralAccess().getIntLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__0__Impl"


    // $ANTLR start "rule__IntLiteral__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: rule__IntLiteral__Group__1 : rule__IntLiteral__Group__1__Impl ;
    public final void rule__IntLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: ( rule__IntLiteral__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:2: rule__IntLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntLiteral__Group__1__Impl_in_rule__IntLiteral__Group__16673);
            rule__IntLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__1"


    // $ANTLR start "rule__IntLiteral__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: rule__IntLiteral__Group__1__Impl : ( ( rule__IntLiteral__ValueAssignment_1 )? ) ;
    public final void rule__IntLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( ( ( rule__IntLiteral__ValueAssignment_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:1: ( ( rule__IntLiteral__ValueAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:1: ( ( rule__IntLiteral__ValueAssignment_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( rule__IntLiteral__ValueAssignment_1 )?
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__IntLiteral__ValueAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT||LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:2: rule__IntLiteral__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntLiteral__ValueAssignment_1_in_rule__IntLiteral__Group__1__Impl6700);
                    rule__IntLiteral__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__06735);
            rule__DoubleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__06738);
            rule__DoubleLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__0"


    // $ANTLR start "rule__DoubleLiteral__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: rule__DoubleLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ()
            {
             before(grammarAccess.getDoubleLiteralAccess().getDoubleLiteralAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: 
            {
            }

             after(grammarAccess.getDoubleLiteralAccess().getDoubleLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__0__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3394:1: ( rule__DoubleLiteral__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:2: rule__DoubleLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__16796);
            rule__DoubleLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__1"


    // $ANTLR start "rule__DoubleLiteral__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: rule__DoubleLiteral__Group__1__Impl : ( ( rule__DoubleLiteral__ValueAssignment_1 )? ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: ( ( ( rule__DoubleLiteral__ValueAssignment_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( ( rule__DoubleLiteral__ValueAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( ( rule__DoubleLiteral__ValueAssignment_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( rule__DoubleLiteral__ValueAssignment_1 )?
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( rule__DoubleLiteral__ValueAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||(LA19_0>=43 && LA19_0<=44)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:2: rule__DoubleLiteral__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DoubleLiteral__ValueAssignment_1_in_rule__DoubleLiteral__Group__1__Impl6823);
                    rule__DoubleLiteral__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__06858);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__06861);
            rule__StringLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: 
            {
            }

             after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__16919);
            rule__StringLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3464:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 )? ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: ( ( ( rule__StringLiteral__ValueAssignment_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( ( rule__StringLiteral__ValueAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( ( rule__StringLiteral__ValueAssignment_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:1: ( rule__StringLiteral__ValueAssignment_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: ( rule__StringLiteral__ValueAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:2: rule__StringLiteral__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl6946);
                    rule__StringLiteral__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__06981);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__06984);
            rule__BooleanLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:1: ( rule__BooleanLiteral__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__17042);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__ValueAssignment_1 )? ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: ( ( ( rule__BooleanLiteral__ValueAssignment_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: ( ( rule__BooleanLiteral__ValueAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: ( ( rule__BooleanLiteral__ValueAssignment_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( rule__BooleanLiteral__ValueAssignment_1 )?
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( rule__BooleanLiteral__ValueAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:2: rule__BooleanLiteral__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl7069);
                    rule__BooleanLiteral__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3548:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__07104);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__07107);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:2: '-'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__EDouble__Group__0__Impl7136); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__17169);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__17172);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3591:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( ( RULE_INT )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl7200); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3608:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__27231);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__27234);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3626:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__EDouble__Group__2__Impl7262); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__37293);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__37296);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl7323); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__47352);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3683:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3685:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3686:1: ( rule__EDouble__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=12)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3686:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl7379);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__07420);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__07423);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl7450);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__17480);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__17483);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3753:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:2: '-'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__EDouble__Group_4__1__Impl7512); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__27545);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3781:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl7572); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__0__Impl_in_rule__BinaryExpression__Group__07607);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__1_in_rule__BinaryExpression__Group__07610);
            rule__BinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3812:1: rule__BinaryExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:1: '('
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BinaryExpression__Group__0__Impl7638); 
             after(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__1__Impl_in_rule__BinaryExpression__Group__17669);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__2_in_rule__BinaryExpression__Group__17672);
            rule__BinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__LeftOperandAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ( ( ( rule__BinaryExpression__LeftOperandAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( rule__BinaryExpression__LeftOperandAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( rule__BinaryExpression__LeftOperandAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( rule__BinaryExpression__LeftOperandAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftOperandAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__BinaryExpression__LeftOperandAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:2: rule__BinaryExpression__LeftOperandAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__LeftOperandAssignment_1_in_rule__BinaryExpression__Group__1__Impl7699);
            rule__BinaryExpression__LeftOperandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLeftOperandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: ( rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:2: rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__2__Impl_in_rule__BinaryExpression__Group__27729);
            rule__BinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__3_in_rule__BinaryExpression__Group__27732);
            rule__BinaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__OperatorAssignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: ( ( ( rule__BinaryExpression__OperatorAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: ( ( rule__BinaryExpression__OperatorAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: ( ( rule__BinaryExpression__OperatorAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( rule__BinaryExpression__OperatorAssignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( rule__BinaryExpression__OperatorAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:2: rule__BinaryExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__OperatorAssignment_2_in_rule__BinaryExpression__Group__2__Impl7759);
            rule__BinaryExpression__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__BinaryExpression__Group__3 : rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 ;
    public final void rule__BinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:2: rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__3__Impl_in_rule__BinaryExpression__Group__37789);
            rule__BinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__4_in_rule__BinaryExpression__Group__37792);
            rule__BinaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3"


    // $ANTLR start "rule__BinaryExpression__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: rule__BinaryExpression__Group__3__Impl : ( ( rule__BinaryExpression__RightOperandAssignment_3 ) ) ;
    public final void rule__BinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: ( ( ( rule__BinaryExpression__RightOperandAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: ( ( rule__BinaryExpression__RightOperandAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: ( ( rule__BinaryExpression__RightOperandAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3907:1: ( rule__BinaryExpression__RightOperandAssignment_3 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightOperandAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:1: ( rule__BinaryExpression__RightOperandAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:2: rule__BinaryExpression__RightOperandAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__RightOperandAssignment_3_in_rule__BinaryExpression__Group__3__Impl7819);
            rule__BinaryExpression__RightOperandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getRightOperandAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__BinaryExpression__Group__4 : rule__BinaryExpression__Group__4__Impl ;
    public final void rule__BinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( rule__BinaryExpression__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:2: rule__BinaryExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExpression__Group__4__Impl_in_rule__BinaryExpression__Group__47849);
            rule__BinaryExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4"


    // $ANTLR start "rule__BinaryExpression__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: rule__BinaryExpression__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: ')'
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BinaryExpression__Group__4__Impl7877); 
             after(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__ParameterIdentifier__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: rule__ParameterIdentifier__Group__0 : rule__ParameterIdentifier__Group__0__Impl rule__ParameterIdentifier__Group__1 ;
    public final void rule__ParameterIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3962:1: ( rule__ParameterIdentifier__Group__0__Impl rule__ParameterIdentifier__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:2: rule__ParameterIdentifier__Group__0__Impl rule__ParameterIdentifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__0__Impl_in_rule__ParameterIdentifier__Group__07918);
            rule__ParameterIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__1_in_rule__ParameterIdentifier__Group__07921);
            rule__ParameterIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__0"


    // $ANTLR start "rule__ParameterIdentifier__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: rule__ParameterIdentifier__Group__0__Impl : ( 'ParameterIdentifier' ) ;
    public final void rule__ParameterIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ( ( 'ParameterIdentifier' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( 'ParameterIdentifier' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( 'ParameterIdentifier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:1: 'ParameterIdentifier'
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterIdentifierKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__ParameterIdentifier__Group__0__Impl7949); 
             after(grammarAccess.getParameterIdentifierAccess().getParameterIdentifierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__0__Impl"


    // $ANTLR start "rule__ParameterIdentifier__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__ParameterIdentifier__Group__1 : rule__ParameterIdentifier__Group__1__Impl rule__ParameterIdentifier__Group__2 ;
    public final void rule__ParameterIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( rule__ParameterIdentifier__Group__1__Impl rule__ParameterIdentifier__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:2: rule__ParameterIdentifier__Group__1__Impl rule__ParameterIdentifier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__1__Impl_in_rule__ParameterIdentifier__Group__17980);
            rule__ParameterIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__2_in_rule__ParameterIdentifier__Group__17983);
            rule__ParameterIdentifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__1"


    // $ANTLR start "rule__ParameterIdentifier__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: rule__ParameterIdentifier__Group__1__Impl : ( '{' ) ;
    public final void rule__ParameterIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: '{'
            {
             before(grammarAccess.getParameterIdentifierAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ParameterIdentifier__Group__1__Impl8011); 
             after(grammarAccess.getParameterIdentifierAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__1__Impl"


    // $ANTLR start "rule__ParameterIdentifier__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: rule__ParameterIdentifier__Group__2 : rule__ParameterIdentifier__Group__2__Impl rule__ParameterIdentifier__Group__3 ;
    public final void rule__ParameterIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( rule__ParameterIdentifier__Group__2__Impl rule__ParameterIdentifier__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:2: rule__ParameterIdentifier__Group__2__Impl rule__ParameterIdentifier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__2__Impl_in_rule__ParameterIdentifier__Group__28042);
            rule__ParameterIdentifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__3_in_rule__ParameterIdentifier__Group__28045);
            rule__ParameterIdentifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__2"


    // $ANTLR start "rule__ParameterIdentifier__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: rule__ParameterIdentifier__Group__2__Impl : ( 'parameter' ) ;
    public final void rule__ParameterIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( ( 'parameter' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( 'parameter' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( 'parameter' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: 'parameter'
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterKeyword_2()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__ParameterIdentifier__Group__2__Impl8073); 
             after(grammarAccess.getParameterIdentifierAccess().getParameterKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__2__Impl"


    // $ANTLR start "rule__ParameterIdentifier__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: rule__ParameterIdentifier__Group__3 : rule__ParameterIdentifier__Group__3__Impl rule__ParameterIdentifier__Group__4 ;
    public final void rule__ParameterIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( rule__ParameterIdentifier__Group__3__Impl rule__ParameterIdentifier__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:2: rule__ParameterIdentifier__Group__3__Impl rule__ParameterIdentifier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__3__Impl_in_rule__ParameterIdentifier__Group__38104);
            rule__ParameterIdentifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__4_in_rule__ParameterIdentifier__Group__38107);
            rule__ParameterIdentifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__3"


    // $ANTLR start "rule__ParameterIdentifier__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: rule__ParameterIdentifier__Group__3__Impl : ( ( rule__ParameterIdentifier__ParameterAssignment_3 ) ) ;
    public final void rule__ParameterIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: ( ( ( rule__ParameterIdentifier__ParameterAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( ( rule__ParameterIdentifier__ParameterAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( ( rule__ParameterIdentifier__ParameterAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: ( rule__ParameterIdentifier__ParameterAssignment_3 )
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( rule__ParameterIdentifier__ParameterAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:2: rule__ParameterIdentifier__ParameterAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__ParameterAssignment_3_in_rule__ParameterIdentifier__Group__3__Impl8134);
            rule__ParameterIdentifier__ParameterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterIdentifierAccess().getParameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__3__Impl"


    // $ANTLR start "rule__ParameterIdentifier__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: rule__ParameterIdentifier__Group__4 : rule__ParameterIdentifier__Group__4__Impl ;
    public final void rule__ParameterIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( rule__ParameterIdentifier__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:2: rule__ParameterIdentifier__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__Group__4__Impl_in_rule__ParameterIdentifier__Group__48164);
            rule__ParameterIdentifier__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__4"


    // $ANTLR start "rule__ParameterIdentifier__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: rule__ParameterIdentifier__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4095:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: '}'
            {
             before(grammarAccess.getParameterIdentifierAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ParameterIdentifier__Group__4__Impl8192); 
             after(grammarAccess.getParameterIdentifierAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__Group__4__Impl"


    // $ANTLR start "rule__ConfiguratorModel__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: rule__ConfiguratorModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConfiguratorModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ruleEString
            {
             before(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfiguratorModel__NameAssignment_28238);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__NameAssignment_2"


    // $ANTLR start "rule__ConfiguratorModel__ParametersAssignment_4_2_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: rule__ConfiguratorModel__ParametersAssignment_4_2_0 : ( ruleParameter2 ) ;
    public final void rule__ConfiguratorModel__ParametersAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ( ( ruleParameter2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: ( ruleParameter2 )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: ( ruleParameter2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: ruleParameter2
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter2_in_rule__ConfiguratorModel__ParametersAssignment_4_2_08269);
            ruleParameter2();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__ParametersAssignment_4_2_0"


    // $ANTLR start "rule__ConfiguratorModel__ParametersAssignment_4_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: rule__ConfiguratorModel__ParametersAssignment_4_2_1 : ( ruleParameter3 ) ;
    public final void rule__ConfiguratorModel__ParametersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: ( ( ruleParameter3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: ( ruleParameter3 )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: ( ruleParameter3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: ruleParameter3
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter3_in_rule__ConfiguratorModel__ParametersAssignment_4_2_18300);
            ruleParameter3();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__ParametersAssignment_4_2_1"


    // $ANTLR start "rule__ConfiguratorModel__ParametersAssignment_4_3_1_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: rule__ConfiguratorModel__ParametersAssignment_4_3_1_0 : ( ruleParameter2 ) ;
    public final void rule__ConfiguratorModel__ParametersAssignment_4_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ( ( ruleParameter2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( ruleParameter2 )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( ruleParameter2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: ruleParameter2
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_3_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter2_in_rule__ConfiguratorModel__ParametersAssignment_4_3_1_08331);
            ruleParameter2();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getParametersParameter2ParserRuleCall_4_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__ParametersAssignment_4_3_1_0"


    // $ANTLR start "rule__ConfiguratorModel__ParametersAssignment_4_3_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: rule__ConfiguratorModel__ParametersAssignment_4_3_1_1 : ( ruleParameter3 ) ;
    public final void rule__ConfiguratorModel__ParametersAssignment_4_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4185:1: ( ( ruleParameter3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( ruleParameter3 )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( ruleParameter3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ruleParameter3
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter3_in_rule__ConfiguratorModel__ParametersAssignment_4_3_1_18362);
            ruleParameter3();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getParametersParameter3ParserRuleCall_4_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__ParametersAssignment_4_3_1_1"


    // $ANTLR start "rule__ConfiguratorModel__ConstraintsAssignment_5_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: rule__ConfiguratorModel__ConstraintsAssignment_5_2 : ( ruleConstraint ) ;
    public final void rule__ConfiguratorModel__ConstraintsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: ( ( ruleConstraint ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: ( ruleConstraint )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: ( ruleConstraint )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4202:1: ruleConstraint
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_28393);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__ConstraintsAssignment_5_2"


    // $ANTLR start "rule__ConfiguratorModel__ConstraintsAssignment_5_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 : ( ruleConstraint ) ;
    public final void rule__ConfiguratorModel__ConstraintsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( ( ruleConstraint ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ( ruleConstraint )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ( ruleConstraint )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:1: ruleConstraint
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_3_18424);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__ConstraintsAssignment_5_3_1"


    // $ANTLR start "rule__ConfiguratorModel__EnumsAssignment_6_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: rule__ConfiguratorModel__EnumsAssignment_6_2 : ( ruleEnum ) ;
    public final void rule__ConfiguratorModel__EnumsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:1: ( ( ruleEnum ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: ( ruleEnum )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: ( ruleEnum )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: ruleEnum
            {
             before(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_rule__ConfiguratorModel__EnumsAssignment_6_28455);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__EnumsAssignment_6_2"


    // $ANTLR start "rule__ConfiguratorModel__EnumsAssignment_6_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: rule__ConfiguratorModel__EnumsAssignment_6_3_1 : ( ruleEnum ) ;
    public final void rule__ConfiguratorModel__EnumsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( ( ruleEnum ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ruleEnum )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ruleEnum )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: ruleEnum
            {
             before(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_rule__ConfiguratorModel__EnumsAssignment_6_3_18486);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getEnumsEnumParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguratorModel__EnumsAssignment_6_3_1"


    // $ANTLR start "rule__Parameter2__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: rule__Parameter2__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:1: ruleEString
            {
             before(grammarAccess.getParameter2Access().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter2__NameAssignment_28517);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameter2Access().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__NameAssignment_2"


    // $ANTLR start "rule__Parameter2__MaxChosenValuesAssignment_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: rule__Parameter2__MaxChosenValuesAssignment_4_2 : ( ruleEInt ) ;
    public final void rule__Parameter2__MaxChosenValuesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: ruleEInt
            {
             before(grammarAccess.getParameter2Access().getMaxChosenValuesEIntParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Parameter2__MaxChosenValuesAssignment_4_28548);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getParameter2Access().getMaxChosenValuesEIntParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__MaxChosenValuesAssignment_4_2"


    // $ANTLR start "rule__Parameter2__MinChosenValuesAssignment_6_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: rule__Parameter2__MinChosenValuesAssignment_6_2 : ( ruleEInt ) ;
    public final void rule__Parameter2__MinChosenValuesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: ruleEInt
            {
             before(grammarAccess.getParameter2Access().getMinChosenValuesEIntParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Parameter2__MinChosenValuesAssignment_6_28579);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getParameter2Access().getMinChosenValuesEIntParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__MinChosenValuesAssignment_6_2"


    // $ANTLR start "rule__Parameter2__EnumAssignment_8_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: rule__Parameter2__EnumAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__Parameter2__EnumAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: ( ruleEString )
            {
             before(grammarAccess.getParameter2Access().getEnumEnumCrossReference_8_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4309:1: ruleEString
            {
             before(grammarAccess.getParameter2Access().getEnumEnumEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter2__EnumAssignment_8_28614);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameter2Access().getEnumEnumEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getParameter2Access().getEnumEnumCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter2__EnumAssignment_8_2"


    // $ANTLR start "rule__Parameter3__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: rule__Parameter3__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter3__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: ruleEString
            {
             before(grammarAccess.getParameter3Access().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter3__NameAssignment_28649);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameter3Access().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__NameAssignment_2"


    // $ANTLR start "rule__Parameter3__ChildrenAssignment_4_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: rule__Parameter3__ChildrenAssignment_4_3 : ( ( ruleEString ) ) ;
    public final void rule__Parameter3__ChildrenAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ( ruleEString )
            {
             before(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ruleEString
            {
             before(grammarAccess.getParameter3Access().getChildrenParameterEStringParserRuleCall_4_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter3__ChildrenAssignment_4_38684);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameter3Access().getChildrenParameterEStringParserRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__ChildrenAssignment_4_3"


    // $ANTLR start "rule__Parameter3__ChildrenAssignment_4_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Parameter3__ChildrenAssignment_4_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Parameter3__ChildrenAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:1: ( ruleEString )
            {
             before(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4361:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4362:1: ruleEString
            {
             before(grammarAccess.getParameter3Access().getChildrenParameterEStringParserRuleCall_4_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter3__ChildrenAssignment_4_4_18723);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameter3Access().getChildrenParameterEStringParserRuleCall_4_4_1_0_1()); 

            }

             after(grammarAccess.getParameter3Access().getChildrenParameterCrossReference_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter3__ChildrenAssignment_4_4_1"


    // $ANTLR start "rule__Constraint__IfAssignment_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4373:1: rule__Constraint__IfAssignment_1_1 : ( ruleBinaryExpression ) ;
    public final void rule__Constraint__IfAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( ( ruleBinaryExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:1: ( ruleBinaryExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:1: ( ruleBinaryExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: ruleBinaryExpression
            {
             before(grammarAccess.getConstraintAccess().getIfBinaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_rule__Constraint__IfAssignment_1_18758);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getIfBinaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__IfAssignment_1_1"


    // $ANTLR start "rule__Constraint__ThenAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: rule__Constraint__ThenAssignment_2_1 : ( ruleBinaryExpression ) ;
    public final void rule__Constraint__ThenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:1: ( ( ruleBinaryExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:1: ( ruleBinaryExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:1: ( ruleBinaryExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4394:1: ruleBinaryExpression
            {
             before(grammarAccess.getConstraintAccess().getThenBinaryExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExpression_in_rule__Constraint__ThenAssignment_2_18789);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getThenBinaryExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ThenAssignment_2_1"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: rule__Enum__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4407:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4409:1: ruleEString
            {
             before(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Enum__NameAssignment_18820);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__ValuesAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: rule__Enum__ValuesAssignment_3 : ( ruleValue ) ;
    public final void rule__Enum__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: ( ( ruleValue ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:1: ( ruleValue )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:1: ( ruleValue )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: ruleValue
            {
             before(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_rule__Enum__ValuesAssignment_38851);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__ValuesAssignment_3"


    // $ANTLR start "rule__Enum__ValuesAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:1: rule__Enum__ValuesAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Enum__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: ( ( ruleValue ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( ruleValue )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( ruleValue )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ruleValue
            {
             before(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_rule__Enum__ValuesAssignment_4_18882);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getValuesValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__ValuesAssignment_4_1"


    // $ANTLR start "rule__IntLiteral__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: rule__IntLiteral__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__IntLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ruleEInt
            {
             before(grammarAccess.getIntLiteralAccess().getValueEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntLiteral__ValueAssignment_18913);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntLiteralAccess().getValueEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment_1"


    // $ANTLR start "rule__DoubleLiteral__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: rule__DoubleLiteral__ValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DoubleLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( ( ruleEDouble ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ruleEDouble )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ruleEDouble )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ruleEDouble
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__DoubleLiteral__ValueAssignment_18944);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralAccess().getValueEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: rule__StringLiteral__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4482:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ruleEString
            {
             before(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringLiteral__ValueAssignment_18975);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: rule__BooleanLiteral__ValueAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( ( 'value' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( ( 'value' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( ( 'value' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ( 'value' )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueValueKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( 'value' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: 'value'
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueValueKeyword_1_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__BooleanLiteral__ValueAssignment_19011); 
             after(grammarAccess.getBooleanLiteralAccess().getValueValueKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanLiteralAccess().getValueValueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment_1"


    // $ANTLR start "rule__BinaryExpression__LeftOperandAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: rule__BinaryExpression__LeftOperandAssignment_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__LeftOperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( ruleExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: ruleExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftOperandExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__BinaryExpression__LeftOperandAssignment_19050);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getLeftOperandExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__LeftOperandAssignment_1"


    // $ANTLR start "rule__BinaryExpression__OperatorAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: rule__BinaryExpression__OperatorAssignment_2 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( ( ruleBinaryOperator ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( ruleBinaryOperator )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( ruleBinaryOperator )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_rule__BinaryExpression__OperatorAssignment_29081);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperatorAssignment_2"


    // $ANTLR start "rule__BinaryExpression__RightOperandAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4546:1: rule__BinaryExpression__RightOperandAssignment_3 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__RightOperandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( ruleExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ruleExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightOperandExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__BinaryExpression__RightOperandAssignment_39112);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getRightOperandExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__RightOperandAssignment_3"


    // $ANTLR start "rule__ParameterIdentifier__ParameterAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: rule__ParameterIdentifier__ParameterAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ParameterIdentifier__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( ruleEString )
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ruleEString
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterParameterEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParameterIdentifier__ParameterAssignment_39147);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterIdentifierAccess().getParameterParameterEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIdentifier__ParameterAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\23\uffff";
    static final String DFA4_eofS =
        "\1\4\2\uffff\1\16\17\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\1\6\1\15\17\uffff";
    static final String DFA4_maxS =
        "\1\57\1\uffff\2\54\17\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\13\2\1\3\1\4\1\5\1\6";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\20\1\3\6\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\10\uffff\1\1\1\16\13\uffff\1\2\1\17\1\22\1\uffff\1\21",
            "",
            "\1\3\45\uffff\1\17",
            "\11\16\11\uffff\1\16\14\uffff\1\17",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "607:1: rule__Expression__Alternatives : ( ( ruleBinaryExpression ) | ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleParameterIdentifier ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguratorModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__0_in_ruleConfiguratorModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter2_in_entryRuleParameter2301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__0_in_ruleParameter2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter3_in_entryRuleParameter3361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__0_in_ruleParameter3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntLiteral__Group__0_in_ruleIntLiteral634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0_in_ruleDoubleLiteral694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_entryRuleBinaryExpression903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpression910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__0_in_ruleBinaryExpression936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterIdentifier970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__0_in_ruleParameterIdentifier996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_2_0_in_rule__ConfiguratorModel__Alternatives_4_21068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_2_1_in_rule__ConfiguratorModel__Alternatives_4_21086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_3_1_0_in_rule__ConfiguratorModel__Alternatives_4_3_11119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_3_1_1_in_rule__ConfiguratorModel__Alternatives_4_3_11137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Value__Alternatives1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_rule__Value__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Value__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Value__Alternatives1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__Expression__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Expression__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_rule__Expression__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Expression__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_rule__Expression__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_01420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_01440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BinaryOperator__Alternatives1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BinaryOperator__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BinaryOperator__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BinaryOperator__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperator__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperator__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperator__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BinaryOperator__Alternatives1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BinaryOperator__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__0__Impl_in_rule__ConfiguratorModel__Group__01677 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__1_in_rule__ConfiguratorModel__Group__01680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__1__Impl_in_rule__ConfiguratorModel__Group__11738 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__2_in_rule__ConfiguratorModel__Group__11741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ConfiguratorModel__Group__1__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__2__Impl_in_rule__ConfiguratorModel__Group__21800 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__3_in_rule__ConfiguratorModel__Group__21803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__NameAssignment_2_in_rule__ConfiguratorModel__Group__2__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__3__Impl_in_rule__ConfiguratorModel__Group__31860 = new BitSet(new long[]{0x000000001B000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__4_in_rule__ConfiguratorModel__Group__31863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ConfiguratorModel__Group__3__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__4__Impl_in_rule__ConfiguratorModel__Group__41922 = new BitSet(new long[]{0x000000001B000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__5_in_rule__ConfiguratorModel__Group__41925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__0_in_rule__ConfiguratorModel__Group__4__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__5__Impl_in_rule__ConfiguratorModel__Group__51983 = new BitSet(new long[]{0x000000001B000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__6_in_rule__ConfiguratorModel__Group__51986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__0_in_rule__ConfiguratorModel__Group__5__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__6__Impl_in_rule__ConfiguratorModel__Group__62044 = new BitSet(new long[]{0x000000001B000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__7_in_rule__ConfiguratorModel__Group__62047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__0_in_rule__ConfiguratorModel__Group__6__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__7__Impl_in_rule__ConfiguratorModel__Group__72105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ConfiguratorModel__Group__7__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__0__Impl_in_rule__ConfiguratorModel__Group_4__02180 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__1_in_rule__ConfiguratorModel__Group_4__02183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConfiguratorModel__Group_4__0__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__1__Impl_in_rule__ConfiguratorModel__Group_4__12242 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__2_in_rule__ConfiguratorModel__Group_4__12245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ConfiguratorModel__Group_4__1__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__2__Impl_in_rule__ConfiguratorModel__Group_4__22304 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__3_in_rule__ConfiguratorModel__Group_4__22307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Alternatives_4_2_in_rule__ConfiguratorModel__Group_4__2__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__3__Impl_in_rule__ConfiguratorModel__Group_4__32364 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__4_in_rule__ConfiguratorModel__Group_4__32367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__0_in_rule__ConfiguratorModel__Group_4__3__Impl2394 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__4__Impl_in_rule__ConfiguratorModel__Group_4__42425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ConfiguratorModel__Group_4__4__Impl2453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__0__Impl_in_rule__ConfiguratorModel__Group_4_3__02494 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__1_in_rule__ConfiguratorModel__Group_4_3__02497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConfiguratorModel__Group_4_3__0__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__1__Impl_in_rule__ConfiguratorModel__Group_4_3__12556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Alternatives_4_3_1_in_rule__ConfiguratorModel__Group_4_3__1__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__0__Impl_in_rule__ConfiguratorModel__Group_5__02617 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__1_in_rule__ConfiguratorModel__Group_5__02620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ConfiguratorModel__Group_5__0__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__1__Impl_in_rule__ConfiguratorModel__Group_5__12679 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__2_in_rule__ConfiguratorModel__Group_5__12682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ConfiguratorModel__Group_5__1__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__2__Impl_in_rule__ConfiguratorModel__Group_5__22741 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__3_in_rule__ConfiguratorModel__Group_5__22744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_2_in_rule__ConfiguratorModel__Group_5__2__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__3__Impl_in_rule__ConfiguratorModel__Group_5__32801 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__4_in_rule__ConfiguratorModel__Group_5__32804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__0_in_rule__ConfiguratorModel__Group_5__3__Impl2831 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__4__Impl_in_rule__ConfiguratorModel__Group_5__42862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ConfiguratorModel__Group_5__4__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__0__Impl_in_rule__ConfiguratorModel__Group_5_3__02931 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__1_in_rule__ConfiguratorModel__Group_5_3__02934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConfiguratorModel__Group_5_3__0__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__1__Impl_in_rule__ConfiguratorModel__Group_5_3__12993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_3_1_in_rule__ConfiguratorModel__Group_5_3__1__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__0__Impl_in_rule__ConfiguratorModel__Group_6__03054 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__1_in_rule__ConfiguratorModel__Group_6__03057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ConfiguratorModel__Group_6__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__1__Impl_in_rule__ConfiguratorModel__Group_6__13116 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__2_in_rule__ConfiguratorModel__Group_6__13119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ConfiguratorModel__Group_6__1__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__2__Impl_in_rule__ConfiguratorModel__Group_6__23178 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__3_in_rule__ConfiguratorModel__Group_6__23181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__EnumsAssignment_6_2_in_rule__ConfiguratorModel__Group_6__2__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__3__Impl_in_rule__ConfiguratorModel__Group_6__33238 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__4_in_rule__ConfiguratorModel__Group_6__33241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6_3__0_in_rule__ConfiguratorModel__Group_6__3__Impl3268 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6__4__Impl_in_rule__ConfiguratorModel__Group_6__43299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ConfiguratorModel__Group_6__4__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6_3__0__Impl_in_rule__ConfiguratorModel__Group_6_3__03368 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6_3__1_in_rule__ConfiguratorModel__Group_6_3__03371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConfiguratorModel__Group_6_3__0__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_6_3__1__Impl_in_rule__ConfiguratorModel__Group_6_3__13430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__EnumsAssignment_6_3_1_in_rule__ConfiguratorModel__Group_6_3__1__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__0__Impl_in_rule__Parameter2__Group__03491 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__1_in_rule__Parameter2__Group__03494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__1__Impl_in_rule__Parameter2__Group__13552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__2_in_rule__Parameter2__Group__13555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Parameter2__Group__1__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__2__Impl_in_rule__Parameter2__Group__23614 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__3_in_rule__Parameter2__Group__23617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__NameAssignment_2_in_rule__Parameter2__Group__2__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__3__Impl_in_rule__Parameter2__Group__33674 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__4_in_rule__Parameter2__Group__33677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Parameter2__Group__3__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__4__Impl_in_rule__Parameter2__Group__43736 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__5_in_rule__Parameter2__Group__43739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_4__0_in_rule__Parameter2__Group__4__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__5__Impl_in_rule__Parameter2__Group__53796 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__6_in_rule__Parameter2__Group__53799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Parameter2__Group__5__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__6__Impl_in_rule__Parameter2__Group__63858 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__7_in_rule__Parameter2__Group__63861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_6__0_in_rule__Parameter2__Group__6__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__7__Impl_in_rule__Parameter2__Group__73918 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__8_in_rule__Parameter2__Group__73921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Parameter2__Group__7__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__8__Impl_in_rule__Parameter2__Group__83980 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__9_in_rule__Parameter2__Group__83983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_8__0_in_rule__Parameter2__Group__8__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group__9__Impl_in_rule__Parameter2__Group__94041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Parameter2__Group__9__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_4__0__Impl_in_rule__Parameter2__Group_4__04120 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_4__1_in_rule__Parameter2__Group_4__04123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Parameter2__Group_4__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_4__1__Impl_in_rule__Parameter2__Group_4__14182 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_4__2_in_rule__Parameter2__Group_4__14185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter2__Group_4__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_4__2__Impl_in_rule__Parameter2__Group_4__24244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__MaxChosenValuesAssignment_4_2_in_rule__Parameter2__Group_4__2__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_6__0__Impl_in_rule__Parameter2__Group_6__04307 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_6__1_in_rule__Parameter2__Group_6__04310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Parameter2__Group_6__0__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_6__1__Impl_in_rule__Parameter2__Group_6__14369 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_6__2_in_rule__Parameter2__Group_6__14372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter2__Group_6__1__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_6__2__Impl_in_rule__Parameter2__Group_6__24431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__MinChosenValuesAssignment_6_2_in_rule__Parameter2__Group_6__2__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_8__0__Impl_in_rule__Parameter2__Group_8__04494 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_8__1_in_rule__Parameter2__Group_8__04497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Parameter2__Group_8__0__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_8__1__Impl_in_rule__Parameter2__Group_8__14556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_8__2_in_rule__Parameter2__Group_8__14559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter2__Group_8__1__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__Group_8__2__Impl_in_rule__Parameter2__Group_8__24618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter2__EnumAssignment_8_2_in_rule__Parameter2__Group_8__2__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__0__Impl_in_rule__Parameter3__Group__04681 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__1_in_rule__Parameter3__Group__04684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__1__Impl_in_rule__Parameter3__Group__14742 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__2_in_rule__Parameter3__Group__14745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Parameter3__Group__1__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__2__Impl_in_rule__Parameter3__Group__24804 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__3_in_rule__Parameter3__Group__24807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__NameAssignment_2_in_rule__Parameter3__Group__2__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__3__Impl_in_rule__Parameter3__Group__34864 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__4_in_rule__Parameter3__Group__34867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Parameter3__Group__3__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__4__Impl_in_rule__Parameter3__Group__44926 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__5_in_rule__Parameter3__Group__44929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__0_in_rule__Parameter3__Group__4__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group__5__Impl_in_rule__Parameter3__Group__54986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Parameter3__Group__5__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__0__Impl_in_rule__Parameter3__Group_4__05057 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__1_in_rule__Parameter3__Group_4__05060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Parameter3__Group_4__0__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__1__Impl_in_rule__Parameter3__Group_4__15119 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__2_in_rule__Parameter3__Group_4__15122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter3__Group_4__1__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__2__Impl_in_rule__Parameter3__Group_4__25181 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__3_in_rule__Parameter3__Group_4__25184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Parameter3__Group_4__2__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__3__Impl_in_rule__Parameter3__Group_4__35243 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__4_in_rule__Parameter3__Group_4__35246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__ChildrenAssignment_4_3_in_rule__Parameter3__Group_4__3__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__4__Impl_in_rule__Parameter3__Group_4__45303 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__5_in_rule__Parameter3__Group_4__45306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4_4__0_in_rule__Parameter3__Group_4__4__Impl5333 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4__5__Impl_in_rule__Parameter3__Group_4__55364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Parameter3__Group_4__5__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4_4__0__Impl_in_rule__Parameter3__Group_4_4__05435 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4_4__1_in_rule__Parameter3__Group_4_4__05438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Parameter3__Group_4_4__0__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__Group_4_4__1__Impl_in_rule__Parameter3__Group_4_4__15497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter3__ChildrenAssignment_4_4_1_in_rule__Parameter3__Group_4_4__1__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__05558 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__05561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__15619 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__15622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_1__0_in_rule__Constraint__Group__1__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__25679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_2__0_in_rule__Constraint__Group__2__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_1__0__Impl_in_rule__Constraint__Group_1__05742 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Constraint__Group_1__1_in_rule__Constraint__Group_1__05745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Constraint__Group_1__0__Impl5773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_1__1__Impl_in_rule__Constraint__Group_1__15804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__IfAssignment_1_1_in_rule__Constraint__Group_1__1__Impl5831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_2__0__Impl_in_rule__Constraint__Group_2__05865 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Constraint__Group_2__1_in_rule__Constraint__Group_2__05868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Constraint__Group_2__0__Impl5896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group_2__1__Impl_in_rule__Constraint__Group_2__15927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__ThenAssignment_2_1_in_rule__Constraint__Group_2__1__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__05988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Enum__Group__0__Impl6019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__16050 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__16053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__26110 = new BitSet(new long[]{0x0000980000000070L});
        public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__26113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Enum__Group__2__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__36172 = new BitSet(new long[]{0x0000040004000000L});
        public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__36175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__ValuesAssignment_3_in_rule__Enum__Group__3__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__46232 = new BitSet(new long[]{0x0000040004000000L});
        public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__46235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl6262 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__56293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Enum__Group__5__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__06364 = new BitSet(new long[]{0x0000980000000070L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__06367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Enum__Group_4__0__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__16426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__ValuesAssignment_4_1_in_rule__Enum__Group_4__1__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06487 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__EInt__Group__0__Impl6519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntLiteral__Group__0__Impl_in_rule__IntLiteral__Group__06612 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__IntLiteral__Group__1_in_rule__IntLiteral__Group__06615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntLiteral__Group__1__Impl_in_rule__IntLiteral__Group__16673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_1_in_rule__IntLiteral__Group__1__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleLiteral__Group__0__Impl_in_rule__DoubleLiteral__Group__06735 = new BitSet(new long[]{0x0000180000000040L});
        public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1_in_rule__DoubleLiteral__Group__06738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleLiteral__Group__1__Impl_in_rule__DoubleLiteral__Group__16796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleLiteral__ValueAssignment_1_in_rule__DoubleLiteral__Group__1__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__06858 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__06861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__16919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__06981 = new BitSet(new long[]{0x0000980000000070L});
        public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__06984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__17042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl7069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__07104 = new BitSet(new long[]{0x0000180000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__07107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__EDouble__Group__0__Impl7136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__17169 = new BitSet(new long[]{0x0000180000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__17172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl7200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__27231 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__27234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__EDouble__Group__2__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__37293 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__37296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl7323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__47352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl7379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__07420 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__07423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl7450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__17480 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__17483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__EDouble__Group_4__1__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__27545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__0__Impl_in_rule__BinaryExpression__Group__07607 = new BitSet(new long[]{0x0000B80040000070L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__1_in_rule__BinaryExpression__Group__07610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BinaryExpression__Group__0__Impl7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__1__Impl_in_rule__BinaryExpression__Group__17669 = new BitSet(new long[]{0x00000000003FE000L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__2_in_rule__BinaryExpression__Group__17672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__LeftOperandAssignment_1_in_rule__BinaryExpression__Group__1__Impl7699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__2__Impl_in_rule__BinaryExpression__Group__27729 = new BitSet(new long[]{0x0000B80040000070L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__3_in_rule__BinaryExpression__Group__27732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__OperatorAssignment_2_in_rule__BinaryExpression__Group__2__Impl7759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__3__Impl_in_rule__BinaryExpression__Group__37789 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__4_in_rule__BinaryExpression__Group__37792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__RightOperandAssignment_3_in_rule__BinaryExpression__Group__3__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExpression__Group__4__Impl_in_rule__BinaryExpression__Group__47849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BinaryExpression__Group__4__Impl7877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__0__Impl_in_rule__ParameterIdentifier__Group__07918 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__1_in_rule__ParameterIdentifier__Group__07921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__ParameterIdentifier__Group__0__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__1__Impl_in_rule__ParameterIdentifier__Group__17980 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__2_in_rule__ParameterIdentifier__Group__17983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ParameterIdentifier__Group__1__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__2__Impl_in_rule__ParameterIdentifier__Group__28042 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__3_in_rule__ParameterIdentifier__Group__28045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__ParameterIdentifier__Group__2__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__3__Impl_in_rule__ParameterIdentifier__Group__38104 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__4_in_rule__ParameterIdentifier__Group__38107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__ParameterAssignment_3_in_rule__ParameterIdentifier__Group__3__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__Group__4__Impl_in_rule__ParameterIdentifier__Group__48164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ParameterIdentifier__Group__4__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfiguratorModel__NameAssignment_28238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter2_in_rule__ConfiguratorModel__ParametersAssignment_4_2_08269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter3_in_rule__ConfiguratorModel__ParametersAssignment_4_2_18300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter2_in_rule__ConfiguratorModel__ParametersAssignment_4_3_1_08331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter3_in_rule__ConfiguratorModel__ParametersAssignment_4_3_1_18362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_28393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_3_18424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_rule__ConfiguratorModel__EnumsAssignment_6_28455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_rule__ConfiguratorModel__EnumsAssignment_6_3_18486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter2__NameAssignment_28517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Parameter2__MaxChosenValuesAssignment_4_28548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Parameter2__MinChosenValuesAssignment_6_28579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter2__EnumAssignment_8_28614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter3__NameAssignment_28649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter3__ChildrenAssignment_4_38684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter3__ChildrenAssignment_4_4_18723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__Constraint__IfAssignment_1_18758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExpression_in_rule__Constraint__ThenAssignment_2_18789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Enum__NameAssignment_18820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_rule__Enum__ValuesAssignment_38851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_rule__Enum__ValuesAssignment_4_18882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntLiteral__ValueAssignment_18913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__DoubleLiteral__ValueAssignment_18944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringLiteral__ValueAssignment_18975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__BooleanLiteral__ValueAssignment_19011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__BinaryExpression__LeftOperandAssignment_19050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryExpression__OperatorAssignment_29081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__BinaryExpression__RightOperandAssignment_39112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParameterIdentifier__ParameterAssignment_39147 = new BitSet(new long[]{0x0000000000000002L});
    }


}