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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'true'", "'false'", "'&&'", "'||'", "'!||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'Model'", "'{'", "'}'", "','", "'ConfiguratorModel'", "'parameters'", "'constraints'", "'Parameter'", "'('", "')'", "':'", "'minChosenValues'", "'maxChosenValues'", "'-'", "'['", "']'", "'int'", "'double'", "'String'", "' '", "'boolean'", "'.'"
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleConstraint EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint121);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint128); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Constraint__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Constraint__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Constraint__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Constraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint154);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType188); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleLiteral EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral241);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral248); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Literal__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Literal__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Literal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Alternatives_in_ruleLiteral274);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleConfiguratorModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleConfiguratorModel : ruleConfiguratorModel EOF ;
    public final void entryRuleConfiguratorModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleConfiguratorModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleConfiguratorModel EOF
            {
             before(grammarAccess.getConfiguratorModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel301);
            ruleConfiguratorModel();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguratorModel308); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleConfiguratorModel : ( ( rule__ConfiguratorModel__Group__0 ) ) ;
    public final void ruleConfiguratorModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__ConfiguratorModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ConfiguratorModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ConfiguratorModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__ConfiguratorModel__Group__0 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__ConfiguratorModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__ConfiguratorModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__0_in_ruleConfiguratorModel334);
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString368); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString394);
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


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleParameter EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter421);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter428); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Parameter__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter454);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleEInt EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt481);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt488); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt514);
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


    // $ANTLR start "entryRuleEnum"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleEnum EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum541);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum548); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Enum__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Enum__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Enum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__0_in_ruleEnum574);
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


    // $ANTLR start "entryRuleInteger"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleInteger EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger601);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger608); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleInteger : ( ( rule__Integer__Alternatives ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__Integer__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Integer__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Integer__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__Integer__Alternatives )
            {
             before(grammarAccess.getIntegerAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Integer__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__Integer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Alternatives_in_ruleInteger634);
            rule__Integer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleDouble EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble661);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble668); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleDouble : ( ( rule__Double__Alternatives ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Double__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Double__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Double__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Double__Alternatives )
            {
             before(grammarAccess.getDoubleAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Double__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Double__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Double__Alternatives_in_ruleDouble694);
            rule__Double__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0721);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0728); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleString0 : ( ( rule__String0__Alternatives ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__String0__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__String0__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__String0__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__String0__Alternatives )
            {
             before(grammarAccess.getString0Access().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__String0__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__String0__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Alternatives_in_ruleString0754);
            rule__String0__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getAlternatives()); 

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleBoolean EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean781);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean788); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Boolean__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Boolean__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Boolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean814);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBoolean"


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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleEBoolean EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean901);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean908); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean934);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleBinaryConstraint"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleBinaryConstraint : ruleBinaryConstraint EOF ;
    public final void entryRuleBinaryConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleBinaryConstraint EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleBinaryConstraint EOF
            {
             before(grammarAccess.getBinaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint961);
            ruleBinaryConstraint();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryConstraint968); 

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
    // $ANTLR end "entryRuleBinaryConstraint"


    // $ANTLR start "ruleBinaryConstraint"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleBinaryConstraint : ( ( rule__BinaryConstraint__Group__0 ) ) ;
    public final void ruleBinaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__BinaryConstraint__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__BinaryConstraint__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__BinaryConstraint__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__BinaryConstraint__Group__0 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__BinaryConstraint__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__BinaryConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__0_in_ruleBinaryConstraint994);
            rule__BinaryConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryConstraint"


    // $ANTLR start "entryRuleParameterIdentifier"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuleParameterIdentifier : ruleParameterIdentifier EOF ;
    public final void entryRuleParameterIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruleParameterIdentifier EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruleParameterIdentifier EOF
            {
             before(grammarAccess.getParameterIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier1021);
            ruleParameterIdentifier();

            state._fsp--;

             after(grammarAccess.getParameterIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterIdentifier1028); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruleParameterIdentifier : ( ( rule__ParameterIdentifier__ParameterAssignment ) ) ;
    public final void ruleParameterIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( ( rule__ParameterIdentifier__ParameterAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__ParameterIdentifier__ParameterAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__ParameterIdentifier__ParameterAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__ParameterIdentifier__ParameterAssignment )
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__ParameterIdentifier__ParameterAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__ParameterIdentifier__ParameterAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterIdentifier__ParameterAssignment_in_ruleParameterIdentifier1054);
            rule__ParameterIdentifier__ParameterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterIdentifierAccess().getParameterAssignment()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( ( rule__BinaryOperator__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:544:1: ( rule__BinaryOperator__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:544:2: rule__BinaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1091);
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


    // $ANTLR start "rule__Constraint__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: rule__Constraint__Alternatives : ( ( ruleBinaryConstraint ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleBoolean ) | ( ruleParameterIdentifier ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( ( ruleBinaryConstraint ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleBoolean ) | ( ruleParameterIdentifier ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==RULE_INT) ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4==EOF||(LA1_4>=15 && LA1_4<=23)||(LA1_4>=26 && LA1_4<=27)||LA1_4==33) ) {
                        alt1=2;
                    }
                    else if ( (LA1_4==45) ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_3==45) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==EOF||(LA1_4>=15 && LA1_4<=23)||(LA1_4>=26 && LA1_4<=27)||LA1_4==33) ) {
                    alt1=2;
                }
                else if ( (LA1_4==45) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case 41:
            case 45:
                {
                alt1=3;
                }
                break;
            case 42:
            case 43:
                {
                alt1=4;
                }
                break;
            case 13:
            case 14:
            case 44:
                {
                alt1=5;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( ruleBinaryConstraint )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( ruleBinaryConstraint )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ruleBinaryConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getBinaryConstraintParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_rule__Constraint__Alternatives1126);
                    ruleBinaryConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getBinaryConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:6: ( ruleInteger )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:6: ( ruleInteger )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ruleInteger
                    {
                     before(grammarAccess.getConstraintAccess().getIntegerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Constraint__Alternatives1143);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getIntegerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:6: ( ruleDouble )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:6: ( ruleDouble )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ruleDouble
                    {
                     before(grammarAccess.getConstraintAccess().getDoubleParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rule__Constraint__Alternatives1160);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getDoubleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:6: ( ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:6: ( ruleString0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ruleString0
                    {
                     before(grammarAccess.getConstraintAccess().getString0ParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Constraint__Alternatives1177);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getString0ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:6: ( ruleBoolean )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:6: ( ruleBoolean )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ruleBoolean
                    {
                     before(grammarAccess.getConstraintAccess().getBooleanParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Constraint__Alternatives1194);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:6: ( ruleParameterIdentifier )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:6: ( ruleParameterIdentifier )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ruleParameterIdentifier
                    {
                     before(grammarAccess.getConstraintAccess().getParameterIdentifierParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterIdentifier_in_rule__Constraint__Alternatives1211);
                    ruleParameterIdentifier();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getParameterIdentifierParserRuleCall_5()); 

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
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: rule__Type__Alternatives : ( ( ruleEnum ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleBoolean ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( ( ruleEnum ) | ( ruleInteger ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleBoolean ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_INT) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==45) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==EOF||(LA2_4>=26 && LA2_4<=27)) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_3==45) ) {
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

                if ( (LA2_4==45) ) {
                    alt2=3;
                }
                else if ( (LA2_4==EOF||(LA2_4>=26 && LA2_4<=27)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 41:
            case 45:
                {
                alt2=3;
                }
                break;
            case 42:
            case 43:
                {
                alt2=4;
                }
                break;
            case 13:
            case 14:
            case 44:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ruleEnum )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ruleEnum )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ruleEnum
                    {
                     before(grammarAccess.getTypeAccess().getEnumParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_rule__Type__Alternatives1243);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:6: ( ruleInteger )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:6: ( ruleInteger )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ruleInteger
                    {
                     before(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Type__Alternatives1260);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:6: ( ruleDouble )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:6: ( ruleDouble )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ruleDouble
                    {
                     before(grammarAccess.getTypeAccess().getDoubleParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rule__Type__Alternatives1277);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:6: ( ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:6: ( ruleString0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Type__Alternatives1294);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:6: ( ruleBoolean )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:6: ( ruleBoolean )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ruleBoolean
                    {
                     before(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Type__Alternatives1311);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: rule__Literal__Alternatives : ( ( ruleInteger ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleBoolean ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( ( ruleInteger ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleBoolean ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_INT) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==45) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==EOF||LA3_3==27||LA3_3==39) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_2==45) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==45) ) {
                    alt3=2;
                }
                else if ( (LA3_3==EOF||LA3_3==27||LA3_3==39) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
            case 45:
                {
                alt3=2;
                }
                break;
            case 42:
            case 43:
                {
                alt3=3;
                }
                break;
            case 13:
            case 14:
            case 44:
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ruleInteger )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ruleInteger )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ruleInteger
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Literal__Alternatives1343);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:6: ( ruleDouble )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:6: ( ruleDouble )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: ruleDouble
                    {
                     before(grammarAccess.getLiteralAccess().getDoubleParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rule__Literal__Alternatives1360);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getDoubleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:6: ( ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:6: ( ruleString0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ruleString0
                    {
                     before(grammarAccess.getLiteralAccess().getString0ParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Literal__Alternatives1377);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getString0ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:6: ( ruleBoolean )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:6: ( ruleBoolean )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ruleBoolean
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Literal__Alternatives1394);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanParserRuleCall_3()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1426); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1443); 
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


    // $ANTLR start "rule__Integer__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: rule__Integer__Alternatives : ( ( ( rule__Integer__Group_0__0 ) ) | ( ( rule__Integer__ValueAssignment_1 ) ) );
    public final void rule__Integer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( ( ( rule__Integer__Group_0__0 ) ) | ( ( rule__Integer__ValueAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( ( rule__Integer__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( ( rule__Integer__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( rule__Integer__Group_0__0 )
                    {
                     before(grammarAccess.getIntegerAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( rule__Integer__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:2: rule__Integer__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Integer__Group_0__0_in_rule__Integer__Alternatives1475);
                    rule__Integer__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:6: ( ( rule__Integer__ValueAssignment_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:6: ( ( rule__Integer__ValueAssignment_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( rule__Integer__ValueAssignment_1 )
                    {
                     before(grammarAccess.getIntegerAccess().getValueAssignment_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( rule__Integer__ValueAssignment_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:2: rule__Integer__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Integer__ValueAssignment_1_in_rule__Integer__Alternatives1493);
                    rule__Integer__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Integer__Alternatives"


    // $ANTLR start "rule__Double__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: rule__Double__Alternatives : ( ( ( rule__Double__Group_0__0 ) ) | ( ( rule__Double__ValueAssignment_1 ) ) );
    public final void rule__Double__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( ( ( rule__Double__Group_0__0 ) ) | ( ( rule__Double__ValueAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT||LA6_0==37||LA6_0==45) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( ( rule__Double__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( ( rule__Double__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:1: ( rule__Double__Group_0__0 )
                    {
                     before(grammarAccess.getDoubleAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__Double__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:2: rule__Double__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Double__Group_0__0_in_rule__Double__Alternatives1526);
                    rule__Double__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:6: ( ( rule__Double__ValueAssignment_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:6: ( ( rule__Double__ValueAssignment_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__Double__ValueAssignment_1 )
                    {
                     before(grammarAccess.getDoubleAccess().getValueAssignment_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( rule__Double__ValueAssignment_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:2: rule__Double__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Double__ValueAssignment_1_in_rule__Double__Alternatives1544);
                    rule__Double__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoubleAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Double__Alternatives"


    // $ANTLR start "rule__String0__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: rule__String0__Alternatives : ( ( ( rule__String0__Group_0__0 ) ) | ( ( rule__String0__Group_1__0 ) ) );
    public final void rule__String0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( ( ( rule__String0__Group_0__0 ) ) | ( ( rule__String0__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            else if ( (LA7_0==43) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__String0__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__String0__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__String0__Group_0__0 )
                    {
                     before(grammarAccess.getString0Access().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__String0__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:2: rule__String0__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__String0__Group_0__0_in_rule__String0__Alternatives1577);
                    rule__String0__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getString0Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:752:6: ( ( rule__String0__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:752:6: ( ( rule__String0__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( rule__String0__Group_1__0 )
                    {
                     before(grammarAccess.getString0Access().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( rule__String0__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:2: rule__String0__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__String0__Group_1__0_in_rule__String0__Alternatives1595);
                    rule__String0__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getString0Access().getGroup_1()); 

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
    // $ANTLR end "rule__String0__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: rule__Boolean__Alternatives : ( ( ( rule__Boolean__Group_0__0 ) ) | ( ( rule__Boolean__ValueAssignment_1 ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( ( rule__Boolean__Group_0__0 ) ) | ( ( rule__Boolean__ValueAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=13 && LA8_0<=14)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( rule__Boolean__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( rule__Boolean__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( rule__Boolean__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( rule__Boolean__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:2: rule__Boolean__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Boolean__Group_0__0_in_rule__Boolean__Alternatives1628);
                    rule__Boolean__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:6: ( ( rule__Boolean__ValueAssignment_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:6: ( ( rule__Boolean__ValueAssignment_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__Boolean__ValueAssignment_1 )
                    {
                     before(grammarAccess.getBooleanAccess().getValueAssignment_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__Boolean__ValueAssignment_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:2: rule__Boolean__ValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Boolean__ValueAssignment_1_in_rule__Boolean__Alternatives1646);
                    rule__Boolean__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ( 'E' ) | ( 'e' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_01680); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_01700); 
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( 'true' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( 'true' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EBoolean__Alternatives1735); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:6: ( 'false' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:6: ( 'false' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__EBoolean__Alternatives1755); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: rule__BinaryOperator__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) | ( ( '!||' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( ( ( '&&' ) ) | ( ( '||' ) ) | ( ( '!||' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            case 18:
                {
                alt11=4;
                }
                break;
            case 19:
                {
                alt11=5;
                }
                break;
            case 20:
                {
                alt11=6;
                }
                break;
            case 21:
                {
                alt11=7;
                }
                break;
            case 22:
                {
                alt11=8;
                }
                break;
            case 23:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( ( '&&' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( ( '&&' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( '&&' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( '&&' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:3: '&&'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BinaryOperator__Alternatives1790); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:6: ( ( '||' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:6: ( ( '||' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( '||' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( '||' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:3: '||'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__BinaryOperator__Alternatives1811); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:6: ( ( '!||' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:6: ( ( '!||' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( '!||' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( '!||' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:3: '!||'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperator__Alternatives1832); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getXOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:6: ( ( '==' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:6: ( ( '==' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( '==' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( '==' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:3: '=='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperator__Alternatives1853); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:6: ( ( '!=' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:6: ( ( '!=' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( '!=' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( '!=' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:3: '!='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperator__Alternatives1874); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getNOTEQUALSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:6: ( ( '>' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: ( '>' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( '>' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:3: '>'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__BinaryOperator__Alternatives1895); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getGTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( ( '<' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( '<' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( '<' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:3: '<'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__BinaryOperator__Alternatives1916); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getLTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:6: ( ( '>=' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:6: ( ( '>=' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( '>=' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( '>=' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:3: '>='
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__BinaryOperator__Alternatives1937); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getGTEQEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:6: ( ( '<=' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:6: ( ( '<=' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( '<=' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getLTEQEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( '<=' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:3: '<='
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__BinaryOperator__Alternatives1958); 

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


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01991);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01994);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( 'Model' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( 'Model' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Model__Group__0__Impl2022); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12053);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12056);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Model__Group__1__Impl2084); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22115);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22118);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Model__Group__2__Impl2146); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32177);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32180);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: rule__Model__Group__3__Impl : ( ( rule__Model__ConfiguratorModelsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ( ( ( rule__Model__ConfiguratorModelsAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ( rule__Model__ConfiguratorModelsAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ( rule__Model__ConfiguratorModelsAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( rule__Model__ConfiguratorModelsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getConfiguratorModelsAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( rule__Model__ConfiguratorModelsAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:2: rule__Model__ConfiguratorModelsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ConfiguratorModelsAssignment_3_in_rule__Model__Group__3__Impl2207);
            rule__Model__ConfiguratorModelsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfiguratorModelsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42237);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42240);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ( ( ( rule__Model__Group_4__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( ( rule__Model__Group_4__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( ( rule__Model__Group_4__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( rule__Model__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:2: rule__Model__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl2267);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52298);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52301);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Model__Group__5__Impl2329); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( rule__Model__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:2: rule__Model__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62360);
            rule__Model__Group__6__Impl();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Model__Group__6__Impl2388); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__02433);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__02436);
            rule__Model__Group_4__1();

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
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: rule__Model__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Model__Group_4__0__Impl2464); 
             after(grammarAccess.getModelAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( rule__Model__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__12495);
            rule__Model__Group_4__1__Impl();

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
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__ConfiguratorModelsAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( ( ( rule__Model__ConfiguratorModelsAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( ( rule__Model__ConfiguratorModelsAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( ( rule__Model__ConfiguratorModelsAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ( rule__Model__ConfiguratorModelsAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getConfiguratorModelsAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( rule__Model__ConfiguratorModelsAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:2: rule__Model__ConfiguratorModelsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ConfiguratorModelsAssignment_4_1_in_rule__Model__Group_4__1__Impl2522);
            rule__Model__ConfiguratorModelsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfiguratorModelsAssignment_4_1()); 

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
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__ConfiguratorModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: rule__ConfiguratorModel__Group__0 : rule__ConfiguratorModel__Group__0__Impl rule__ConfiguratorModel__Group__1 ;
    public final void rule__ConfiguratorModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( rule__ConfiguratorModel__Group__0__Impl rule__ConfiguratorModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:2: rule__ConfiguratorModel__Group__0__Impl rule__ConfiguratorModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__0__Impl_in_rule__ConfiguratorModel__Group__02556);
            rule__ConfiguratorModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__1_in_rule__ConfiguratorModel__Group__02559);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: rule__ConfiguratorModel__Group__0__Impl : ( () ) ;
    public final void rule__ConfiguratorModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ()
            {
             before(grammarAccess.getConfiguratorModelAccess().getConfiguratorModelAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: rule__ConfiguratorModel__Group__1 : rule__ConfiguratorModel__Group__1__Impl rule__ConfiguratorModel__Group__2 ;
    public final void rule__ConfiguratorModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( rule__ConfiguratorModel__Group__1__Impl rule__ConfiguratorModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:2: rule__ConfiguratorModel__Group__1__Impl rule__ConfiguratorModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__1__Impl_in_rule__ConfiguratorModel__Group__12617);
            rule__ConfiguratorModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__2_in_rule__ConfiguratorModel__Group__12620);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: rule__ConfiguratorModel__Group__1__Impl : ( 'ConfiguratorModel' ) ;
    public final void rule__ConfiguratorModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ( ( 'ConfiguratorModel' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: ( 'ConfiguratorModel' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: ( 'ConfiguratorModel' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: 'ConfiguratorModel'
            {
             before(grammarAccess.getConfiguratorModelAccess().getConfiguratorModelKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ConfiguratorModel__Group__1__Impl2648); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: rule__ConfiguratorModel__Group__2 : rule__ConfiguratorModel__Group__2__Impl rule__ConfiguratorModel__Group__3 ;
    public final void rule__ConfiguratorModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( rule__ConfiguratorModel__Group__2__Impl rule__ConfiguratorModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:2: rule__ConfiguratorModel__Group__2__Impl rule__ConfiguratorModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__2__Impl_in_rule__ConfiguratorModel__Group__22679);
            rule__ConfiguratorModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__3_in_rule__ConfiguratorModel__Group__22682);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: rule__ConfiguratorModel__Group__2__Impl : ( ( rule__ConfiguratorModel__NameAssignment_2 ) ) ;
    public final void rule__ConfiguratorModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:1: ( ( ( rule__ConfiguratorModel__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( ( rule__ConfiguratorModel__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( ( rule__ConfiguratorModel__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( rule__ConfiguratorModel__NameAssignment_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: ( rule__ConfiguratorModel__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:2: rule__ConfiguratorModel__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__NameAssignment_2_in_rule__ConfiguratorModel__Group__2__Impl2709);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: rule__ConfiguratorModel__Group__3 : rule__ConfiguratorModel__Group__3__Impl rule__ConfiguratorModel__Group__4 ;
    public final void rule__ConfiguratorModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: ( rule__ConfiguratorModel__Group__3__Impl rule__ConfiguratorModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:2: rule__ConfiguratorModel__Group__3__Impl rule__ConfiguratorModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__3__Impl_in_rule__ConfiguratorModel__Group__32739);
            rule__ConfiguratorModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__4_in_rule__ConfiguratorModel__Group__32742);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: rule__ConfiguratorModel__Group__3__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConfiguratorModel__Group__3__Impl2770); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: rule__ConfiguratorModel__Group__4 : rule__ConfiguratorModel__Group__4__Impl rule__ConfiguratorModel__Group__5 ;
    public final void rule__ConfiguratorModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( rule__ConfiguratorModel__Group__4__Impl rule__ConfiguratorModel__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:2: rule__ConfiguratorModel__Group__4__Impl rule__ConfiguratorModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__4__Impl_in_rule__ConfiguratorModel__Group__42801);
            rule__ConfiguratorModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__5_in_rule__ConfiguratorModel__Group__42804);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: rule__ConfiguratorModel__Group__4__Impl : ( ( rule__ConfiguratorModel__Group_4__0 )? ) ;
    public final void rule__ConfiguratorModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( ( ( rule__ConfiguratorModel__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( ( rule__ConfiguratorModel__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( ( rule__ConfiguratorModel__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( rule__ConfiguratorModel__Group_4__0 )?
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( rule__ConfiguratorModel__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:2: rule__ConfiguratorModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__0_in_rule__ConfiguratorModel__Group__4__Impl2831);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: rule__ConfiguratorModel__Group__5 : rule__ConfiguratorModel__Group__5__Impl rule__ConfiguratorModel__Group__6 ;
    public final void rule__ConfiguratorModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: ( rule__ConfiguratorModel__Group__5__Impl rule__ConfiguratorModel__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:2: rule__ConfiguratorModel__Group__5__Impl rule__ConfiguratorModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__5__Impl_in_rule__ConfiguratorModel__Group__52862);
            rule__ConfiguratorModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__6_in_rule__ConfiguratorModel__Group__52865);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: rule__ConfiguratorModel__Group__5__Impl : ( ( rule__ConfiguratorModel__Group_5__0 )? ) ;
    public final void rule__ConfiguratorModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ( ( ( rule__ConfiguratorModel__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( ( rule__ConfiguratorModel__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( ( rule__ConfiguratorModel__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( rule__ConfiguratorModel__Group_5__0 )?
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( rule__ConfiguratorModel__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:2: rule__ConfiguratorModel__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__0_in_rule__ConfiguratorModel__Group__5__Impl2892);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: rule__ConfiguratorModel__Group__6 : rule__ConfiguratorModel__Group__6__Impl ;
    public final void rule__ConfiguratorModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: ( rule__ConfiguratorModel__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:2: rule__ConfiguratorModel__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group__6__Impl_in_rule__ConfiguratorModel__Group__62923);
            rule__ConfiguratorModel__Group__6__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: rule__ConfiguratorModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConfiguratorModel__Group__6__Impl2951); 
             after(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__ConfiguratorModel__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: rule__ConfiguratorModel__Group_4__0 : rule__ConfiguratorModel__Group_4__0__Impl rule__ConfiguratorModel__Group_4__1 ;
    public final void rule__ConfiguratorModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__ConfiguratorModel__Group_4__0__Impl rule__ConfiguratorModel__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:2: rule__ConfiguratorModel__Group_4__0__Impl rule__ConfiguratorModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__0__Impl_in_rule__ConfiguratorModel__Group_4__02996);
            rule__ConfiguratorModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__1_in_rule__ConfiguratorModel__Group_4__02999);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__ConfiguratorModel__Group_4__0__Impl : ( 'parameters' ) ;
    public final void rule__ConfiguratorModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( ( 'parameters' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( 'parameters' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( 'parameters' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: 'parameters'
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ConfiguratorModel__Group_4__0__Impl3027); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: rule__ConfiguratorModel__Group_4__1 : rule__ConfiguratorModel__Group_4__1__Impl rule__ConfiguratorModel__Group_4__2 ;
    public final void rule__ConfiguratorModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: ( rule__ConfiguratorModel__Group_4__1__Impl rule__ConfiguratorModel__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:2: rule__ConfiguratorModel__Group_4__1__Impl rule__ConfiguratorModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__1__Impl_in_rule__ConfiguratorModel__Group_4__13058);
            rule__ConfiguratorModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__2_in_rule__ConfiguratorModel__Group_4__13061);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: rule__ConfiguratorModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConfiguratorModel__Group_4__1__Impl3089); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: rule__ConfiguratorModel__Group_4__2 : rule__ConfiguratorModel__Group_4__2__Impl rule__ConfiguratorModel__Group_4__3 ;
    public final void rule__ConfiguratorModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( rule__ConfiguratorModel__Group_4__2__Impl rule__ConfiguratorModel__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:2: rule__ConfiguratorModel__Group_4__2__Impl rule__ConfiguratorModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__2__Impl_in_rule__ConfiguratorModel__Group_4__23120);
            rule__ConfiguratorModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__3_in_rule__ConfiguratorModel__Group_4__23123);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: rule__ConfiguratorModel__Group_4__2__Impl : ( ( rule__ConfiguratorModel__ParametersAssignment_4_2 ) ) ;
    public final void rule__ConfiguratorModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( ( ( rule__ConfiguratorModel__ParametersAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( rule__ConfiguratorModel__ParametersAssignment_4_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( rule__ConfiguratorModel__ParametersAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:2: rule__ConfiguratorModel__ParametersAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_2_in_rule__ConfiguratorModel__Group_4__2__Impl3150);
            rule__ConfiguratorModel__ParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_2()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: rule__ConfiguratorModel__Group_4__3 : rule__ConfiguratorModel__Group_4__3__Impl rule__ConfiguratorModel__Group_4__4 ;
    public final void rule__ConfiguratorModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ( rule__ConfiguratorModel__Group_4__3__Impl rule__ConfiguratorModel__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:2: rule__ConfiguratorModel__Group_4__3__Impl rule__ConfiguratorModel__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__3__Impl_in_rule__ConfiguratorModel__Group_4__33180);
            rule__ConfiguratorModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__4_in_rule__ConfiguratorModel__Group_4__33183);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: rule__ConfiguratorModel__Group_4__3__Impl : ( ( rule__ConfiguratorModel__Group_4_3__0 )* ) ;
    public final void rule__ConfiguratorModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( ( ( rule__ConfiguratorModel__Group_4_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ( rule__ConfiguratorModel__Group_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ( rule__ConfiguratorModel__Group_4_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( rule__ConfiguratorModel__Group_4_3__0 )*
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( rule__ConfiguratorModel__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:2: rule__ConfiguratorModel__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__0_in_rule__ConfiguratorModel__Group_4__3__Impl3210);
            	    rule__ConfiguratorModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: rule__ConfiguratorModel__Group_4__4 : rule__ConfiguratorModel__Group_4__4__Impl ;
    public final void rule__ConfiguratorModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( rule__ConfiguratorModel__Group_4__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:2: rule__ConfiguratorModel__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4__4__Impl_in_rule__ConfiguratorModel__Group_4__43241);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: rule__ConfiguratorModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConfiguratorModel__Group_4__4__Impl3269); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: rule__ConfiguratorModel__Group_4_3__0 : rule__ConfiguratorModel__Group_4_3__0__Impl rule__ConfiguratorModel__Group_4_3__1 ;
    public final void rule__ConfiguratorModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: ( rule__ConfiguratorModel__Group_4_3__0__Impl rule__ConfiguratorModel__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:2: rule__ConfiguratorModel__Group_4_3__0__Impl rule__ConfiguratorModel__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__0__Impl_in_rule__ConfiguratorModel__Group_4_3__03310);
            rule__ConfiguratorModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__1_in_rule__ConfiguratorModel__Group_4_3__03313);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: rule__ConfiguratorModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ConfiguratorModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ','
            {
             before(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ConfiguratorModel__Group_4_3__0__Impl3341); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__ConfiguratorModel__Group_4_3__1 : rule__ConfiguratorModel__Group_4_3__1__Impl ;
    public final void rule__ConfiguratorModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( rule__ConfiguratorModel__Group_4_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:2: rule__ConfiguratorModel__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_4_3__1__Impl_in_rule__ConfiguratorModel__Group_4_3__13372);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: rule__ConfiguratorModel__Group_4_3__1__Impl : ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1 ) ) ;
    public final void rule__ConfiguratorModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( ( rule__ConfiguratorModel__ParametersAssignment_4_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( rule__ConfiguratorModel__ParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( rule__ConfiguratorModel__ParametersAssignment_4_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:2: rule__ConfiguratorModel__ParametersAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_3_1_in_rule__ConfiguratorModel__Group_4_3__1__Impl3399);
            rule__ConfiguratorModel__ParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorModelAccess().getParametersAssignment_4_3_1()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: rule__ConfiguratorModel__Group_5__0 : rule__ConfiguratorModel__Group_5__0__Impl rule__ConfiguratorModel__Group_5__1 ;
    public final void rule__ConfiguratorModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__ConfiguratorModel__Group_5__0__Impl rule__ConfiguratorModel__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:2: rule__ConfiguratorModel__Group_5__0__Impl rule__ConfiguratorModel__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__0__Impl_in_rule__ConfiguratorModel__Group_5__03433);
            rule__ConfiguratorModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__1_in_rule__ConfiguratorModel__Group_5__03436);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: rule__ConfiguratorModel__Group_5__0__Impl : ( 'constraints' ) ;
    public final void rule__ConfiguratorModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ( 'constraints' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( 'constraints' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( 'constraints' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: 'constraints'
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsKeyword_5_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ConfiguratorModel__Group_5__0__Impl3464); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: rule__ConfiguratorModel__Group_5__1 : rule__ConfiguratorModel__Group_5__1__Impl rule__ConfiguratorModel__Group_5__2 ;
    public final void rule__ConfiguratorModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( rule__ConfiguratorModel__Group_5__1__Impl rule__ConfiguratorModel__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:2: rule__ConfiguratorModel__Group_5__1__Impl rule__ConfiguratorModel__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__1__Impl_in_rule__ConfiguratorModel__Group_5__13495);
            rule__ConfiguratorModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__2_in_rule__ConfiguratorModel__Group_5__13498);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: rule__ConfiguratorModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ConfiguratorModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: '{'
            {
             before(grammarAccess.getConfiguratorModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConfiguratorModel__Group_5__1__Impl3526); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: rule__ConfiguratorModel__Group_5__2 : rule__ConfiguratorModel__Group_5__2__Impl rule__ConfiguratorModel__Group_5__3 ;
    public final void rule__ConfiguratorModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( rule__ConfiguratorModel__Group_5__2__Impl rule__ConfiguratorModel__Group_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:2: rule__ConfiguratorModel__Group_5__2__Impl rule__ConfiguratorModel__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__2__Impl_in_rule__ConfiguratorModel__Group_5__23557);
            rule__ConfiguratorModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__3_in_rule__ConfiguratorModel__Group_5__23560);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: rule__ConfiguratorModel__Group_5__2__Impl : ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) ) ;
    public final void rule__ConfiguratorModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsAssignment_5_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__ConfiguratorModel__ConstraintsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_2_in_rule__ConfiguratorModel__Group_5__2__Impl3587);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: rule__ConfiguratorModel__Group_5__3 : rule__ConfiguratorModel__Group_5__3__Impl rule__ConfiguratorModel__Group_5__4 ;
    public final void rule__ConfiguratorModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( rule__ConfiguratorModel__Group_5__3__Impl rule__ConfiguratorModel__Group_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:2: rule__ConfiguratorModel__Group_5__3__Impl rule__ConfiguratorModel__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__3__Impl_in_rule__ConfiguratorModel__Group_5__33617);
            rule__ConfiguratorModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__4_in_rule__ConfiguratorModel__Group_5__33620);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__ConfiguratorModel__Group_5__3__Impl : ( ( rule__ConfiguratorModel__Group_5_3__0 )* ) ;
    public final void rule__ConfiguratorModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( ( ( rule__ConfiguratorModel__Group_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( ( rule__ConfiguratorModel__Group_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( ( rule__ConfiguratorModel__Group_5_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: ( rule__ConfiguratorModel__Group_5_3__0 )*
            {
             before(grammarAccess.getConfiguratorModelAccess().getGroup_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:1: ( rule__ConfiguratorModel__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:2: rule__ConfiguratorModel__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__0_in_rule__ConfiguratorModel__Group_5__3__Impl3647);
            	    rule__ConfiguratorModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__ConfiguratorModel__Group_5__4 : rule__ConfiguratorModel__Group_5__4__Impl ;
    public final void rule__ConfiguratorModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( rule__ConfiguratorModel__Group_5__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:2: rule__ConfiguratorModel__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5__4__Impl_in_rule__ConfiguratorModel__Group_5__43678);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: rule__ConfiguratorModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ConfiguratorModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: '}'
            {
             before(grammarAccess.getConfiguratorModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConfiguratorModel__Group_5__4__Impl3706); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: rule__ConfiguratorModel__Group_5_3__0 : rule__ConfiguratorModel__Group_5_3__0__Impl rule__ConfiguratorModel__Group_5_3__1 ;
    public final void rule__ConfiguratorModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( rule__ConfiguratorModel__Group_5_3__0__Impl rule__ConfiguratorModel__Group_5_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:2: rule__ConfiguratorModel__Group_5_3__0__Impl rule__ConfiguratorModel__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__0__Impl_in_rule__ConfiguratorModel__Group_5_3__03747);
            rule__ConfiguratorModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__1_in_rule__ConfiguratorModel__Group_5_3__03750);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: rule__ConfiguratorModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ConfiguratorModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: ','
            {
             before(grammarAccess.getConfiguratorModelAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ConfiguratorModel__Group_5_3__0__Impl3778); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: rule__ConfiguratorModel__Group_5_3__1 : rule__ConfiguratorModel__Group_5_3__1__Impl ;
    public final void rule__ConfiguratorModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: ( rule__ConfiguratorModel__Group_5_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:2: rule__ConfiguratorModel__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__Group_5_3__1__Impl_in_rule__ConfiguratorModel__Group_5_3__13809);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__ConfiguratorModel__Group_5_3__1__Impl : ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) ) ;
    public final void rule__ConfiguratorModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 )
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsAssignment_5_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:2: rule__ConfiguratorModel__ConstraintsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_3_1_in_rule__ConfiguratorModel__Group_5_3__1__Impl3836);
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


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03870);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03873);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( ( 'Parameter' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( 'Parameter' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( 'Parameter' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Parameter__Group__0__Impl3901); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13932);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13935);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3962);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23992);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__23995);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: rule__Parameter__Group__2__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Parameter__Group__2__Impl4023); 
             after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34054);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__34057);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( ( ( rule__Parameter__Group_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ( ( rule__Parameter__Group_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ( ( rule__Parameter__Group_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: ( rule__Parameter__Group_3__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: ( rule__Parameter__Group_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:2: rule__Parameter__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl4084);
            rule__Parameter__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__44114);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__5_in_rule__Parameter__Group__44117);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: rule__Parameter__Group__4__Impl : ( ',' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Parameter__Group__4__Impl4145); 
             after(grammarAccess.getParameterAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__5__Impl_in_rule__Parameter__Group__54176);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__6_in_rule__Parameter__Group__54179);
            rule__Parameter__Group__6();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__Group_5__0 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( ( ( rule__Parameter__Group_5__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( rule__Parameter__Group_5__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( rule__Parameter__Group_5__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( rule__Parameter__Group_5__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( rule__Parameter__Group_5__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:2: rule__Parameter__Group_5__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_5__0_in_rule__Parameter__Group__5__Impl4206);
            rule__Parameter__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__6__Impl_in_rule__Parameter__Group__64236);
            rule__Parameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__7_in_rule__Parameter__Group__64239);
            rule__Parameter__Group__7();

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
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: rule__Parameter__Group__6__Impl : ( ',' ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Parameter__Group__6__Impl4267); 
             after(grammarAccess.getParameterAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl rule__Parameter__Group__8 ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( rule__Parameter__Group__7__Impl rule__Parameter__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:2: rule__Parameter__Group__7__Impl rule__Parameter__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__7__Impl_in_rule__Parameter__Group__74298);
            rule__Parameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__8_in_rule__Parameter__Group__74301);
            rule__Parameter__Group__8();

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
    // $ANTLR end "rule__Parameter__Group__7"


    // $ANTLR start "rule__Parameter__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: rule__Parameter__Group__7__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Parameter__Group__7__Impl4329); 
             after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Parameter__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: rule__Parameter__Group__8 : rule__Parameter__Group__8__Impl rule__Parameter__Group__9 ;
    public final void rule__Parameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( rule__Parameter__Group__8__Impl rule__Parameter__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:2: rule__Parameter__Group__8__Impl rule__Parameter__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__8__Impl_in_rule__Parameter__Group__84360);
            rule__Parameter__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__9_in_rule__Parameter__Group__84363);
            rule__Parameter__Group__9();

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
    // $ANTLR end "rule__Parameter__Group__8"


    // $ANTLR start "rule__Parameter__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: rule__Parameter__Group__8__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_8()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Parameter__Group__8__Impl4391); 
             after(grammarAccess.getParameterAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Parameter__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: rule__Parameter__Group__9 : rule__Parameter__Group__9__Impl ;
    public final void rule__Parameter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( rule__Parameter__Group__9__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:2: rule__Parameter__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__9__Impl_in_rule__Parameter__Group__94422);
            rule__Parameter__Group__9__Impl();

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
    // $ANTLR end "rule__Parameter__Group__9"


    // $ANTLR start "rule__Parameter__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: rule__Parameter__Group__9__Impl : ( ( rule__Parameter__TypeAssignment_9 ) ) ;
    public final void rule__Parameter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( ( ( rule__Parameter__TypeAssignment_9 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( ( rule__Parameter__TypeAssignment_9 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( ( rule__Parameter__TypeAssignment_9 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( rule__Parameter__TypeAssignment_9 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_9()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( rule__Parameter__TypeAssignment_9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:2: rule__Parameter__TypeAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__TypeAssignment_9_in_rule__Parameter__Group__9__Impl4449);
            rule__Parameter__TypeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_9()); 

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
    // $ANTLR end "rule__Parameter__Group__9__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__04499);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__04502);
            rule__Parameter__Group_3__1();

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
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: rule__Parameter__Group_3__0__Impl : ( 'minChosenValues' ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( ( 'minChosenValues' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( 'minChosenValues' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( 'minChosenValues' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: 'minChosenValues'
            {
             before(grammarAccess.getParameterAccess().getMinChosenValuesKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Parameter__Group_3__0__Impl4530); 
             after(grammarAccess.getParameterAccess().getMinChosenValuesKeyword_3_0()); 

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
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: ( rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:2: rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__14561);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__14564);
            rule__Parameter__Group_3__2();

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
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: rule__Parameter__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Parameter__Group_3__1__Impl4592); 
             after(grammarAccess.getParameterAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: rule__Parameter__Group_3__2 : rule__Parameter__Group_3__2__Impl ;
    public final void rule__Parameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: ( rule__Parameter__Group_3__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:2: rule__Parameter__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__24623);
            rule__Parameter__Group_3__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group_3__2"


    // $ANTLR start "rule__Parameter__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: rule__Parameter__Group_3__2__Impl : ( ( rule__Parameter__MinChosenValuesAssignment_3_2 ) ) ;
    public final void rule__Parameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ( ( rule__Parameter__MinChosenValuesAssignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( ( rule__Parameter__MinChosenValuesAssignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( ( rule__Parameter__MinChosenValuesAssignment_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( rule__Parameter__MinChosenValuesAssignment_3_2 )
            {
             before(grammarAccess.getParameterAccess().getMinChosenValuesAssignment_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( rule__Parameter__MinChosenValuesAssignment_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:2: rule__Parameter__MinChosenValuesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__MinChosenValuesAssignment_3_2_in_rule__Parameter__Group_3__2__Impl4650);
            rule__Parameter__MinChosenValuesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getMinChosenValuesAssignment_3_2()); 

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
    // $ANTLR end "rule__Parameter__Group_3__2__Impl"


    // $ANTLR start "rule__Parameter__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: rule__Parameter__Group_5__0 : rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 ;
    public final void rule__Parameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: ( rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:2: rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_5__0__Impl_in_rule__Parameter__Group_5__04686);
            rule__Parameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_5__1_in_rule__Parameter__Group_5__04689);
            rule__Parameter__Group_5__1();

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
    // $ANTLR end "rule__Parameter__Group_5__0"


    // $ANTLR start "rule__Parameter__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: rule__Parameter__Group_5__0__Impl : ( 'maxChosenValues' ) ;
    public final void rule__Parameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ( ( 'maxChosenValues' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: ( 'maxChosenValues' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: ( 'maxChosenValues' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: 'maxChosenValues'
            {
             before(grammarAccess.getParameterAccess().getMaxChosenValuesKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Parameter__Group_5__0__Impl4717); 
             after(grammarAccess.getParameterAccess().getMaxChosenValuesKeyword_5_0()); 

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
    // $ANTLR end "rule__Parameter__Group_5__0__Impl"


    // $ANTLR start "rule__Parameter__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: rule__Parameter__Group_5__1 : rule__Parameter__Group_5__1__Impl rule__Parameter__Group_5__2 ;
    public final void rule__Parameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( rule__Parameter__Group_5__1__Impl rule__Parameter__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:2: rule__Parameter__Group_5__1__Impl rule__Parameter__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_5__1__Impl_in_rule__Parameter__Group_5__14748);
            rule__Parameter__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_5__2_in_rule__Parameter__Group_5__14751);
            rule__Parameter__Group_5__2();

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
    // $ANTLR end "rule__Parameter__Group_5__1"


    // $ANTLR start "rule__Parameter__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: rule__Parameter__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_5_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Parameter__Group_5__1__Impl4779); 
             after(grammarAccess.getParameterAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end "rule__Parameter__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group_5__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: rule__Parameter__Group_5__2 : rule__Parameter__Group_5__2__Impl ;
    public final void rule__Parameter__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: ( rule__Parameter__Group_5__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:2: rule__Parameter__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_5__2__Impl_in_rule__Parameter__Group_5__24810);
            rule__Parameter__Group_5__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group_5__2"


    // $ANTLR start "rule__Parameter__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: rule__Parameter__Group_5__2__Impl : ( ( rule__Parameter__MaxChosenValuesAssignment_5_2 ) ) ;
    public final void rule__Parameter__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( ( ( rule__Parameter__MaxChosenValuesAssignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: ( ( rule__Parameter__MaxChosenValuesAssignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: ( ( rule__Parameter__MaxChosenValuesAssignment_5_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( rule__Parameter__MaxChosenValuesAssignment_5_2 )
            {
             before(grammarAccess.getParameterAccess().getMaxChosenValuesAssignment_5_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( rule__Parameter__MaxChosenValuesAssignment_5_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:2: rule__Parameter__MaxChosenValuesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__MaxChosenValuesAssignment_5_2_in_rule__Parameter__Group_5__2__Impl4837);
            rule__Parameter__MaxChosenValuesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getMaxChosenValuesAssignment_5_2()); 

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
    // $ANTLR end "rule__Parameter__Group_5__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04873);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04876);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:2: '-'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__EInt__Group__0__Impl4905); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14938);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4965); 
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


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04998);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05001);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: rule__Enum__Group__0__Impl : ( '[' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( '[' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: '['
            {
             before(grammarAccess.getEnumAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Enum__Group__0__Impl5029); 
             after(grammarAccess.getEnumAccess().getLeftSquareBracketKeyword_0()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__15060);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__15063);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__ValuesAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( ( ( rule__Enum__ValuesAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__Enum__ValuesAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__Enum__ValuesAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( rule__Enum__ValuesAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__Enum__ValuesAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:2: rule__Enum__ValuesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__ValuesAssignment_1_in_rule__Enum__Group__1__Impl5090);
            rule__Enum__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getValuesAssignment_1()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__25120);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__25123);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ( ( rule__Enum__Group_2__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ( rule__Enum__Group_2__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ( rule__Enum__Group_2__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( rule__Enum__Group_2__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( rule__Enum__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:2: rule__Enum__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl5150);
            	    rule__Enum__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_2()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__Enum__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:2: rule__Enum__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__35181);
            rule__Enum__Group__3__Impl();

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: rule__Enum__Group__3__Impl : ( ']' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( ']' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ']'
            {
             before(grammarAccess.getEnumAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Enum__Group__3__Impl5209); 
             after(grammarAccess.getEnumAccess().getRightSquareBracketKeyword_3()); 

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


    // $ANTLR start "rule__Enum__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__05248);
            rule__Enum__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__05251);
            rule__Enum__Group_2__1();

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
    // $ANTLR end "rule__Enum__Group_2__0"


    // $ANTLR start "rule__Enum__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__Enum__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Enum__Group_2__0__Impl5279); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Enum__Group_2__0__Impl"


    // $ANTLR start "rule__Enum__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( rule__Enum__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:2: rule__Enum__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__15310);
            rule__Enum__Group_2__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_2__1"


    // $ANTLR start "rule__Enum__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__ValuesAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: ( ( ( rule__Enum__ValuesAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ( rule__Enum__ValuesAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ( rule__Enum__ValuesAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( rule__Enum__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getEnumAccess().getValuesAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: ( rule__Enum__ValuesAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:2: rule__Enum__ValuesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enum__ValuesAssignment_2_1_in_rule__Enum__Group_2__1__Impl5337);
            rule__Enum__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__Enum__Group_2__1__Impl"


    // $ANTLR start "rule__Integer__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: rule__Integer__Group_0__0 : rule__Integer__Group_0__0__Impl rule__Integer__Group_0__1 ;
    public final void rule__Integer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( rule__Integer__Group_0__0__Impl rule__Integer__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:2: rule__Integer__Group_0__0__Impl rule__Integer__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group_0__0__Impl_in_rule__Integer__Group_0__05371);
            rule__Integer__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group_0__1_in_rule__Integer__Group_0__05374);
            rule__Integer__Group_0__1();

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
    // $ANTLR end "rule__Integer__Group_0__0"


    // $ANTLR start "rule__Integer__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: rule__Integer__Group_0__0__Impl : ( () ) ;
    public final void rule__Integer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_0__0__Impl"


    // $ANTLR start "rule__Integer__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: rule__Integer__Group_0__1 : rule__Integer__Group_0__1__Impl ;
    public final void rule__Integer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( rule__Integer__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:2: rule__Integer__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group_0__1__Impl_in_rule__Integer__Group_0__15432);
            rule__Integer__Group_0__1__Impl();

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
    // $ANTLR end "rule__Integer__Group_0__1"


    // $ANTLR start "rule__Integer__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: rule__Integer__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Integer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( ( 'int' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( 'int' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( 'int' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: 'int'
            {
             before(grammarAccess.getIntegerAccess().getIntKeyword_0_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Integer__Group_0__1__Impl5460); 
             after(grammarAccess.getIntegerAccess().getIntKeyword_0_1()); 

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
    // $ANTLR end "rule__Integer__Group_0__1__Impl"


    // $ANTLR start "rule__Double__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: rule__Double__Group_0__0 : rule__Double__Group_0__0__Impl rule__Double__Group_0__1 ;
    public final void rule__Double__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ( rule__Double__Group_0__0__Impl rule__Double__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:2: rule__Double__Group_0__0__Impl rule__Double__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Double__Group_0__0__Impl_in_rule__Double__Group_0__05495);
            rule__Double__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Double__Group_0__1_in_rule__Double__Group_0__05498);
            rule__Double__Group_0__1();

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
    // $ANTLR end "rule__Double__Group_0__0"


    // $ANTLR start "rule__Double__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: rule__Double__Group_0__0__Impl : ( () ) ;
    public final void rule__Double__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: ()
            {
             before(grammarAccess.getDoubleAccess().getDoubleAction_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: 
            {
            }

             after(grammarAccess.getDoubleAccess().getDoubleAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_0__0__Impl"


    // $ANTLR start "rule__Double__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: rule__Double__Group_0__1 : rule__Double__Group_0__1__Impl ;
    public final void rule__Double__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( rule__Double__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:2: rule__Double__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Double__Group_0__1__Impl_in_rule__Double__Group_0__15556);
            rule__Double__Group_0__1__Impl();

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
    // $ANTLR end "rule__Double__Group_0__1"


    // $ANTLR start "rule__Double__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: rule__Double__Group_0__1__Impl : ( 'double' ) ;
    public final void rule__Double__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( ( 'double' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( 'double' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( 'double' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: 'double'
            {
             before(grammarAccess.getDoubleAccess().getDoubleKeyword_0_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Double__Group_0__1__Impl5584); 
             after(grammarAccess.getDoubleAccess().getDoubleKeyword_0_1()); 

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
    // $ANTLR end "rule__Double__Group_0__1__Impl"


    // $ANTLR start "rule__String0__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: rule__String0__Group_0__0 : rule__String0__Group_0__0__Impl rule__String0__Group_0__1 ;
    public final void rule__String0__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ( rule__String0__Group_0__0__Impl rule__String0__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:2: rule__String0__Group_0__0__Impl rule__String0__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Group_0__0__Impl_in_rule__String0__Group_0__05619);
            rule__String0__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__String0__Group_0__1_in_rule__String0__Group_0__05622);
            rule__String0__Group_0__1();

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
    // $ANTLR end "rule__String0__Group_0__0"


    // $ANTLR start "rule__String0__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: rule__String0__Group_0__0__Impl : ( () ) ;
    public final void rule__String0__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group_0__0__Impl"


    // $ANTLR start "rule__String0__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: rule__String0__Group_0__1 : rule__String0__Group_0__1__Impl ;
    public final void rule__String0__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: ( rule__String0__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:2: rule__String0__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Group_0__1__Impl_in_rule__String0__Group_0__15680);
            rule__String0__Group_0__1__Impl();

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
    // $ANTLR end "rule__String0__Group_0__1"


    // $ANTLR start "rule__String0__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: rule__String0__Group_0__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: ( ( 'String' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( 'String' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( 'String' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_0_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__String0__Group_0__1__Impl5708); 
             after(grammarAccess.getString0Access().getStringKeyword_0_1()); 

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
    // $ANTLR end "rule__String0__Group_0__1__Impl"


    // $ANTLR start "rule__String0__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: rule__String0__Group_1__0 : rule__String0__Group_1__0__Impl rule__String0__Group_1__1 ;
    public final void rule__String0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: ( rule__String0__Group_1__0__Impl rule__String0__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:2: rule__String0__Group_1__0__Impl rule__String0__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Group_1__0__Impl_in_rule__String0__Group_1__05743);
            rule__String0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__String0__Group_1__1_in_rule__String0__Group_1__05746);
            rule__String0__Group_1__1();

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
    // $ANTLR end "rule__String0__Group_1__0"


    // $ANTLR start "rule__String0__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: rule__String0__Group_1__0__Impl : ( ' ' ) ;
    public final void rule__String0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( ( ' ' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ' ' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ' ' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ' '
            {
             before(grammarAccess.getString0Access().getSpaceKeyword_1_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__String0__Group_1__0__Impl5774); 
             after(grammarAccess.getString0Access().getSpaceKeyword_1_0()); 

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
    // $ANTLR end "rule__String0__Group_1__0__Impl"


    // $ANTLR start "rule__String0__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: rule__String0__Group_1__1 : rule__String0__Group_1__1__Impl ;
    public final void rule__String0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: ( rule__String0__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:2: rule__String0__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Group_1__1__Impl_in_rule__String0__Group_1__15805);
            rule__String0__Group_1__1__Impl();

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
    // $ANTLR end "rule__String0__Group_1__1"


    // $ANTLR start "rule__String0__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: rule__String0__Group_1__1__Impl : ( ( rule__String0__ValueAssignment_1_1 ) ) ;
    public final void rule__String0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( ( ( rule__String0__ValueAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( ( rule__String0__ValueAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( ( rule__String0__ValueAssignment_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( rule__String0__ValueAssignment_1_1 )
            {
             before(grammarAccess.getString0Access().getValueAssignment_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( rule__String0__ValueAssignment_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:2: rule__String0__ValueAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__ValueAssignment_1_1_in_rule__String0__Group_1__1__Impl5832);
            rule__String0__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__String0__Group_1__1__Impl"


    // $ANTLR start "rule__Boolean__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: rule__Boolean__Group_0__0 : rule__Boolean__Group_0__0__Impl rule__Boolean__Group_0__1 ;
    public final void rule__Boolean__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ( rule__Boolean__Group_0__0__Impl rule__Boolean__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:2: rule__Boolean__Group_0__0__Impl rule__Boolean__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__Group_0__0__Impl_in_rule__Boolean__Group_0__05866);
            rule__Boolean__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Boolean__Group_0__1_in_rule__Boolean__Group_0__05869);
            rule__Boolean__Group_0__1();

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
    // $ANTLR end "rule__Boolean__Group_0__0"


    // $ANTLR start "rule__Boolean__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: rule__Boolean__Group_0__0__Impl : ( () ) ;
    public final void rule__Boolean__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group_0__0__Impl"


    // $ANTLR start "rule__Boolean__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: rule__Boolean__Group_0__1 : rule__Boolean__Group_0__1__Impl ;
    public final void rule__Boolean__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: ( rule__Boolean__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:2: rule__Boolean__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Boolean__Group_0__1__Impl_in_rule__Boolean__Group_0__15927);
            rule__Boolean__Group_0__1__Impl();

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
    // $ANTLR end "rule__Boolean__Group_0__1"


    // $ANTLR start "rule__Boolean__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: rule__Boolean__Group_0__1__Impl : ( 'boolean' ) ;
    public final void rule__Boolean__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( ( 'boolean' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( 'boolean' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( 'boolean' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: 'boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_0_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Boolean__Group_0__1__Impl5955); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword_0_1()); 

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
    // $ANTLR end "rule__Boolean__Group_0__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05990);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05993);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:2: '-'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__EDouble__Group__0__Impl6022); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__16055);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__16058);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( RULE_INT )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl6086); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__26117);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__26120);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__EDouble__Group__2__Impl6148); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__36179);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__36182);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl6209); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__46238);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( rule__EDouble__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl6265);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__06306);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__06309);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl6336);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__16366);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__16369);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:2: '-'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__EDouble__Group_4__1__Impl6398); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__26431);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl6458); 
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


    // $ANTLR start "rule__BinaryConstraint__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3212:1: rule__BinaryConstraint__Group__0 : rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1 ;
    public final void rule__BinaryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: ( rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:2: rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__0__Impl_in_rule__BinaryConstraint__Group__06493);
            rule__BinaryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__1_in_rule__BinaryConstraint__Group__06496);
            rule__BinaryConstraint__Group__1();

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
    // $ANTLR end "rule__BinaryConstraint__Group__0"


    // $ANTLR start "rule__BinaryConstraint__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: rule__BinaryConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: '('
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BinaryConstraint__Group__0__Impl6524); 
             after(grammarAccess.getBinaryConstraintAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__0__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: rule__BinaryConstraint__Group__1 : rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2 ;
    public final void rule__BinaryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: ( rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:2: rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__1__Impl_in_rule__BinaryConstraint__Group__16555);
            rule__BinaryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__2_in_rule__BinaryConstraint__Group__16558);
            rule__BinaryConstraint__Group__2();

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
    // $ANTLR end "rule__BinaryConstraint__Group__1"


    // $ANTLR start "rule__BinaryConstraint__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: rule__BinaryConstraint__Group__1__Impl : ( ( rule__BinaryConstraint__LeftOperandAssignment_1 ) ) ;
    public final void rule__BinaryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( ( ( rule__BinaryConstraint__LeftOperandAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: ( ( rule__BinaryConstraint__LeftOperandAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: ( ( rule__BinaryConstraint__LeftOperandAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: ( rule__BinaryConstraint__LeftOperandAssignment_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftOperandAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: ( rule__BinaryConstraint__LeftOperandAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:2: rule__BinaryConstraint__LeftOperandAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftOperandAssignment_1_in_rule__BinaryConstraint__Group__1__Impl6585);
            rule__BinaryConstraint__LeftOperandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftOperandAssignment_1()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__1__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: rule__BinaryConstraint__Group__2 : rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3 ;
    public final void rule__BinaryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:2: rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__2__Impl_in_rule__BinaryConstraint__Group__26615);
            rule__BinaryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__3_in_rule__BinaryConstraint__Group__26618);
            rule__BinaryConstraint__Group__3();

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
    // $ANTLR end "rule__BinaryConstraint__Group__2"


    // $ANTLR start "rule__BinaryConstraint__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:1: rule__BinaryConstraint__Group__2__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_2 ) ) ;
    public final void rule__BinaryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( ( rule__BinaryConstraint__OperatorAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( ( rule__BinaryConstraint__OperatorAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: ( rule__BinaryConstraint__OperatorAssignment_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: ( rule__BinaryConstraint__OperatorAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:2: rule__BinaryConstraint__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_2_in_rule__BinaryConstraint__Group__2__Impl6645);
            rule__BinaryConstraint__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_2()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__2__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:1: rule__BinaryConstraint__Group__3 : rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4 ;
    public final void rule__BinaryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: ( rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:2: rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__3__Impl_in_rule__BinaryConstraint__Group__36675);
            rule__BinaryConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__4_in_rule__BinaryConstraint__Group__36678);
            rule__BinaryConstraint__Group__4();

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
    // $ANTLR end "rule__BinaryConstraint__Group__3"


    // $ANTLR start "rule__BinaryConstraint__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: rule__BinaryConstraint__Group__3__Impl : ( ( rule__BinaryConstraint__RightOperandAssignment_3 ) ) ;
    public final void rule__BinaryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:1: ( ( ( rule__BinaryConstraint__RightOperandAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( ( rule__BinaryConstraint__RightOperandAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( ( rule__BinaryConstraint__RightOperandAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: ( rule__BinaryConstraint__RightOperandAssignment_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightOperandAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( rule__BinaryConstraint__RightOperandAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:2: rule__BinaryConstraint__RightOperandAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightOperandAssignment_3_in_rule__BinaryConstraint__Group__3__Impl6705);
            rule__BinaryConstraint__RightOperandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getRightOperandAssignment_3()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__3__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: rule__BinaryConstraint__Group__4 : rule__BinaryConstraint__Group__4__Impl ;
    public final void rule__BinaryConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( rule__BinaryConstraint__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:2: rule__BinaryConstraint__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__4__Impl_in_rule__BinaryConstraint__Group__46735);
            rule__BinaryConstraint__Group__4__Impl();

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
    // $ANTLR end "rule__BinaryConstraint__Group__4"


    // $ANTLR start "rule__BinaryConstraint__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: rule__BinaryConstraint__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ')'
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__BinaryConstraint__Group__4__Impl6763); 
             after(grammarAccess.getBinaryConstraintAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__4__Impl"


    // $ANTLR start "rule__Model__ConfiguratorModelsAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: rule__Model__ConfiguratorModelsAssignment_3 : ( ruleConfiguratorModel ) ;
    public final void rule__Model__ConfiguratorModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: ( ( ruleConfiguratorModel ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( ruleConfiguratorModel )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( ruleConfiguratorModel )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ruleConfiguratorModel
            {
             before(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_rule__Model__ConfiguratorModelsAssignment_36809);
            ruleConfiguratorModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ConfiguratorModelsAssignment_3"


    // $ANTLR start "rule__Model__ConfiguratorModelsAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: rule__Model__ConfiguratorModelsAssignment_4_1 : ( ruleConfiguratorModel ) ;
    public final void rule__Model__ConfiguratorModelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( ( ruleConfiguratorModel ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( ruleConfiguratorModel )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( ruleConfiguratorModel )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ruleConfiguratorModel
            {
             before(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguratorModel_in_rule__Model__ConfiguratorModelsAssignment_4_16840);
            ruleConfiguratorModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfiguratorModelsConfiguratorModelParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Model__ConfiguratorModelsAssignment_4_1"


    // $ANTLR start "rule__ConfiguratorModel__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: rule__ConfiguratorModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConfiguratorModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ruleEString
            {
             before(grammarAccess.getConfiguratorModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfiguratorModel__NameAssignment_26871);
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


    // $ANTLR start "rule__ConfiguratorModel__ParametersAssignment_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: rule__ConfiguratorModel__ParametersAssignment_4_2 : ( ruleParameter ) ;
    public final void rule__ConfiguratorModel__ParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: ( ( ruleParameter ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( ruleParameter )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( ruleParameter )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ruleParameter
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__ConfiguratorModel__ParametersAssignment_4_26902);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ConfiguratorModel__ParametersAssignment_4_2"


    // $ANTLR start "rule__ConfiguratorModel__ParametersAssignment_4_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: rule__ConfiguratorModel__ParametersAssignment_4_3_1 : ( ruleParameter ) ;
    public final void rule__ConfiguratorModel__ParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: ( ( ruleParameter ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( ruleParameter )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( ruleParameter )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:1: ruleParameter
            {
             before(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__ConfiguratorModel__ParametersAssignment_4_3_16933);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConfiguratorModelAccess().getParametersParameterParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__ConfiguratorModel__ParametersAssignment_4_3_1"


    // $ANTLR start "rule__ConfiguratorModel__ConstraintsAssignment_5_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: rule__ConfiguratorModel__ConstraintsAssignment_5_2 : ( ruleConstraint ) ;
    public final void rule__ConfiguratorModel__ConstraintsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ( ruleConstraint ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( ruleConstraint )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( ruleConstraint )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: ruleConstraint
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_26964);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: rule__ConfiguratorModel__ConstraintsAssignment_5_3_1 : ( ruleConstraint ) ;
    public final void rule__ConfiguratorModel__ConstraintsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: ( ( ruleConstraint ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( ruleConstraint )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( ruleConstraint )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ruleConstraint
            {
             before(grammarAccess.getConfiguratorModelAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_3_16995);
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


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_17026);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__MinChosenValuesAssignment_3_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:1: rule__Parameter__MinChosenValuesAssignment_3_2 : ( ruleEInt ) ;
    public final void rule__Parameter__MinChosenValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: ruleEInt
            {
             before(grammarAccess.getParameterAccess().getMinChosenValuesEIntParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Parameter__MinChosenValuesAssignment_3_27057);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getMinChosenValuesEIntParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Parameter__MinChosenValuesAssignment_3_2"


    // $ANTLR start "rule__Parameter__MaxChosenValuesAssignment_5_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Parameter__MaxChosenValuesAssignment_5_2 : ( ruleEInt ) ;
    public final void rule__Parameter__MaxChosenValuesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ruleEInt
            {
             before(grammarAccess.getParameterAccess().getMaxChosenValuesEIntParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Parameter__MaxChosenValuesAssignment_5_27088);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getMaxChosenValuesEIntParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Parameter__MaxChosenValuesAssignment_5_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: rule__Parameter__TypeAssignment_9 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:1: ( ( ruleType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: ( ruleType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: ( ruleType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_97119);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_9"


    // $ANTLR start "rule__Enum__ValuesAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: rule__Enum__ValuesAssignment_1 : ( ruleLiteral ) ;
    public final void rule__Enum__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( ( ruleLiteral ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ruleLiteral )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ruleLiteral )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ruleLiteral
            {
             before(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enum__ValuesAssignment_17150);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enum__ValuesAssignment_1"


    // $ANTLR start "rule__Enum__ValuesAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: rule__Enum__ValuesAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__Enum__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( ( ruleLiteral ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( ruleLiteral )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( ruleLiteral )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ruleLiteral
            {
             before(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enum__ValuesAssignment_2_17181);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getValuesLiteralParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Enum__ValuesAssignment_2_1"


    // $ANTLR start "rule__Integer__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: rule__Integer__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__Integer__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ruleEInt
            {
             before(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment_17212);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Integer__ValueAssignment_1"


    // $ANTLR start "rule__Double__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__Double__ValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Double__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( ( ruleEDouble ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ruleEDouble )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ruleEDouble )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ruleEDouble
            {
             before(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Double__ValueAssignment_17243);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleAccess().getValueEDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Double__ValueAssignment_1"


    // $ANTLR start "rule__String0__ValueAssignment_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: rule__String0__ValueAssignment_1_1 : ( ruleEString ) ;
    public final void rule__String0__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ruleEString
            {
             before(grammarAccess.getString0Access().getValueEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__String0__ValueAssignment_1_17274);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getString0Access().getValueEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__String0__ValueAssignment_1_1"


    // $ANTLR start "rule__Boolean__ValueAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: rule__Boolean__ValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__Boolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ( ruleEBoolean )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment_17305);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanAccess().getValueEBooleanParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Boolean__ValueAssignment_1"


    // $ANTLR start "rule__BinaryConstraint__LeftOperandAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3626:1: rule__BinaryConstraint__LeftOperandAssignment_1 : ( ruleConstraint ) ;
    public final void rule__BinaryConstraint__LeftOperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( ( ruleConstraint ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( ruleConstraint )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( ruleConstraint )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ruleConstraint
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftOperandConstraintParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__BinaryConstraint__LeftOperandAssignment_17336);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getLeftOperandConstraintParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__LeftOperandAssignment_1"


    // $ANTLR start "rule__BinaryConstraint__OperatorAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: rule__BinaryConstraint__OperatorAssignment_2 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( ( ruleBinaryOperator ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( ruleBinaryOperator )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( ruleBinaryOperator )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_rule__BinaryConstraint__OperatorAssignment_27367);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__OperatorAssignment_2"


    // $ANTLR start "rule__BinaryConstraint__RightOperandAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: rule__BinaryConstraint__RightOperandAssignment_3 : ( ruleConstraint ) ;
    public final void rule__BinaryConstraint__RightOperandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( ( ruleConstraint ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ruleConstraint )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ruleConstraint )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ruleConstraint
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightOperandConstraintParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__BinaryConstraint__RightOperandAssignment_37398);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getRightOperandConstraintParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__RightOperandAssignment_3"


    // $ANTLR start "rule__ParameterIdentifier__ParameterAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3671:1: rule__ParameterIdentifier__ParameterAssignment : ( ( ruleEString ) ) ;
    public final void rule__ParameterIdentifier__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ruleEString )
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ruleEString
            {
             before(grammarAccess.getParameterIdentifierAccess().getParameterParameterEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParameterIdentifier__ParameterAssignment7433);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterIdentifierAccess().getParameterParameterEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getParameterIdentifierAccess().getParameterParameterCrossReference_0()); 

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
    // $ANTLR end "rule__ParameterIdentifier__ParameterAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_entryRuleConfiguratorModel301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguratorModel308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__0_in_ruleConfiguratorModel334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Alternatives_in_ruleInteger634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__Alternatives_in_ruleDouble694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Alternatives_in_ruleString0754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryConstraint968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__0_in_ruleBinaryConstraint994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_entryRuleParameterIdentifier1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterIdentifier1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterIdentifier__ParameterAssignment_in_ruleParameterIdentifier1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_rule__Constraint__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Constraint__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rule__Constraint__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Constraint__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Constraint__Alternatives1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterIdentifier_in_rule__Constraint__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_rule__Type__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Type__Alternatives1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rule__Type__Alternatives1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Type__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Type__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Literal__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rule__Literal__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Literal__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Literal__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group_0__0_in_rule__Integer__Alternatives1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__ValueAssignment_1_in_rule__Integer__Alternatives1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__Group_0__0_in_rule__Double__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__ValueAssignment_1_in_rule__Double__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Group_0__0_in_rule__String0__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Group_1__0_in_rule__String0__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__Group_0__0_in_rule__Boolean__Alternatives1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_1_in_rule__Boolean__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_01680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_01700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EBoolean__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BinaryOperator__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BinaryOperator__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperator__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperator__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperator__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BinaryOperator__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BinaryOperator__Alternatives1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BinaryOperator__Alternatives1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BinaryOperator__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01991 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Model__Group__0__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12053 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Model__Group__1__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22115 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Model__Group__2__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32177 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ConfiguratorModelsAssignment_3_in_rule__Model__Group__3__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42237 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl2267 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52298 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Model__Group__5__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Model__Group__6__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__02433 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__02436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Model__Group_4__0__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__12495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ConfiguratorModelsAssignment_4_1_in_rule__Model__Group_4__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__0__Impl_in_rule__ConfiguratorModel__Group__02556 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__1_in_rule__ConfiguratorModel__Group__02559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__1__Impl_in_rule__ConfiguratorModel__Group__12617 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__2_in_rule__ConfiguratorModel__Group__12620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ConfiguratorModel__Group__1__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__2__Impl_in_rule__ConfiguratorModel__Group__22679 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__3_in_rule__ConfiguratorModel__Group__22682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__NameAssignment_2_in_rule__ConfiguratorModel__Group__2__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__3__Impl_in_rule__ConfiguratorModel__Group__32739 = new BitSet(new long[]{0x0000000064000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__4_in_rule__ConfiguratorModel__Group__32742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConfiguratorModel__Group__3__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__4__Impl_in_rule__ConfiguratorModel__Group__42801 = new BitSet(new long[]{0x0000000064000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__5_in_rule__ConfiguratorModel__Group__42804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__0_in_rule__ConfiguratorModel__Group__4__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__5__Impl_in_rule__ConfiguratorModel__Group__52862 = new BitSet(new long[]{0x0000000064000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__6_in_rule__ConfiguratorModel__Group__52865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__0_in_rule__ConfiguratorModel__Group__5__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group__6__Impl_in_rule__ConfiguratorModel__Group__62923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConfiguratorModel__Group__6__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__0__Impl_in_rule__ConfiguratorModel__Group_4__02996 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__1_in_rule__ConfiguratorModel__Group_4__02999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ConfiguratorModel__Group_4__0__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__1__Impl_in_rule__ConfiguratorModel__Group_4__13058 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__2_in_rule__ConfiguratorModel__Group_4__13061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConfiguratorModel__Group_4__1__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__2__Impl_in_rule__ConfiguratorModel__Group_4__23120 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__3_in_rule__ConfiguratorModel__Group_4__23123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_2_in_rule__ConfiguratorModel__Group_4__2__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__3__Impl_in_rule__ConfiguratorModel__Group_4__33180 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__4_in_rule__ConfiguratorModel__Group_4__33183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__0_in_rule__ConfiguratorModel__Group_4__3__Impl3210 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4__4__Impl_in_rule__ConfiguratorModel__Group_4__43241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConfiguratorModel__Group_4__4__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__0__Impl_in_rule__ConfiguratorModel__Group_4_3__03310 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__1_in_rule__ConfiguratorModel__Group_4_3__03313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ConfiguratorModel__Group_4_3__0__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_4_3__1__Impl_in_rule__ConfiguratorModel__Group_4_3__13372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ParametersAssignment_4_3_1_in_rule__ConfiguratorModel__Group_4_3__1__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__0__Impl_in_rule__ConfiguratorModel__Group_5__03433 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__1_in_rule__ConfiguratorModel__Group_5__03436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ConfiguratorModel__Group_5__0__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__1__Impl_in_rule__ConfiguratorModel__Group_5__13495 = new BitSet(new long[]{0x00003F2100006070L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__2_in_rule__ConfiguratorModel__Group_5__13498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConfiguratorModel__Group_5__1__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__2__Impl_in_rule__ConfiguratorModel__Group_5__23557 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__3_in_rule__ConfiguratorModel__Group_5__23560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_2_in_rule__ConfiguratorModel__Group_5__2__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__3__Impl_in_rule__ConfiguratorModel__Group_5__33617 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__4_in_rule__ConfiguratorModel__Group_5__33620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__0_in_rule__ConfiguratorModel__Group_5__3__Impl3647 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5__4__Impl_in_rule__ConfiguratorModel__Group_5__43678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConfiguratorModel__Group_5__4__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__0__Impl_in_rule__ConfiguratorModel__Group_5_3__03747 = new BitSet(new long[]{0x00003F2100006070L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__1_in_rule__ConfiguratorModel__Group_5_3__03750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ConfiguratorModel__Group_5_3__0__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__Group_5_3__1__Impl_in_rule__ConfiguratorModel__Group_5_3__13809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfiguratorModel__ConstraintsAssignment_5_3_1_in_rule__ConfiguratorModel__Group_5_3__1__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03870 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Parameter__Group__0__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13932 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23992 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__23995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Parameter__Group__2__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34054 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__34057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__44114 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__5_in_rule__Parameter__Group__44117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Parameter__Group__4__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__5__Impl_in_rule__Parameter__Group__54176 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__6_in_rule__Parameter__Group__54179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_5__0_in_rule__Parameter__Group__5__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__6__Impl_in_rule__Parameter__Group__64236 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__7_in_rule__Parameter__Group__64239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Parameter__Group__6__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__7__Impl_in_rule__Parameter__Group__74298 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__8_in_rule__Parameter__Group__74301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Parameter__Group__7__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__8__Impl_in_rule__Parameter__Group__84360 = new BitSet(new long[]{0x00003F6000006040L});
        public static final BitSet FOLLOW_rule__Parameter__Group__9_in_rule__Parameter__Group__84363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Parameter__Group__8__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__9__Impl_in_rule__Parameter__Group__94422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_9_in_rule__Parameter__Group__9__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__04499 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__04502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Parameter__Group_3__0__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__14561 = new BitSet(new long[]{0x0000012000000040L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__14564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Parameter__Group_3__1__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__24623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__MinChosenValuesAssignment_3_2_in_rule__Parameter__Group_3__2__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_5__0__Impl_in_rule__Parameter__Group_5__04686 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group_5__1_in_rule__Parameter__Group_5__04689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Parameter__Group_5__0__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_5__1__Impl_in_rule__Parameter__Group_5__14748 = new BitSet(new long[]{0x0000012000000040L});
        public static final BitSet FOLLOW_rule__Parameter__Group_5__2_in_rule__Parameter__Group_5__14751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Parameter__Group_5__1__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_5__2__Impl_in_rule__Parameter__Group_5__24810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__MaxChosenValuesAssignment_5_2_in_rule__Parameter__Group_5__2__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04873 = new BitSet(new long[]{0x0000012000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EInt__Group__0__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04998 = new BitSet(new long[]{0x00003F2000006040L});
        public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Enum__Group__0__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__15060 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__15063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__ValuesAssignment_1_in_rule__Enum__Group__1__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__25120 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__25123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl5150 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__35181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Enum__Group__3__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__05248 = new BitSet(new long[]{0x00003F2000006040L});
        public static final BitSet FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__05251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Enum__Group_2__0__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__15310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enum__ValuesAssignment_2_1_in_rule__Enum__Group_2__1__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group_0__0__Impl_in_rule__Integer__Group_0__05371 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Integer__Group_0__1_in_rule__Integer__Group_0__05374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group_0__1__Impl_in_rule__Integer__Group_0__15432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Integer__Group_0__1__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__Group_0__0__Impl_in_rule__Double__Group_0__05495 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Double__Group_0__1_in_rule__Double__Group_0__05498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Double__Group_0__1__Impl_in_rule__Double__Group_0__15556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Double__Group_0__1__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Group_0__0__Impl_in_rule__String0__Group_0__05619 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__String0__Group_0__1_in_rule__String0__Group_0__05622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Group_0__1__Impl_in_rule__String0__Group_0__15680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__String0__Group_0__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Group_1__0__Impl_in_rule__String0__Group_1__05743 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__String0__Group_1__1_in_rule__String0__Group_1__05746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__String0__Group_1__0__Impl5774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Group_1__1__Impl_in_rule__String0__Group_1__15805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__ValueAssignment_1_1_in_rule__String0__Group_1__1__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__Group_0__0__Impl_in_rule__Boolean__Group_0__05866 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Boolean__Group_0__1_in_rule__Boolean__Group_0__05869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Boolean__Group_0__1__Impl_in_rule__Boolean__Group_0__15927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Boolean__Group_0__1__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05990 = new BitSet(new long[]{0x0000222000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EDouble__Group__0__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__16055 = new BitSet(new long[]{0x0000222000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__16058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl6086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__26117 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__26120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__EDouble__Group__2__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__36179 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__36182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__46238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__06306 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__06309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__16366 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__16369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EDouble__Group_4__1__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__26431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl6458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__0__Impl_in_rule__BinaryConstraint__Group__06493 = new BitSet(new long[]{0x00003F2100006070L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__1_in_rule__BinaryConstraint__Group__06496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BinaryConstraint__Group__0__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__1__Impl_in_rule__BinaryConstraint__Group__16555 = new BitSet(new long[]{0x0000000000FF8000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__2_in_rule__BinaryConstraint__Group__16558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftOperandAssignment_1_in_rule__BinaryConstraint__Group__1__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__2__Impl_in_rule__BinaryConstraint__Group__26615 = new BitSet(new long[]{0x00003F2100006070L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__3_in_rule__BinaryConstraint__Group__26618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_2_in_rule__BinaryConstraint__Group__2__Impl6645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__3__Impl_in_rule__BinaryConstraint__Group__36675 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__4_in_rule__BinaryConstraint__Group__36678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightOperandAssignment_3_in_rule__BinaryConstraint__Group__3__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__4__Impl_in_rule__BinaryConstraint__Group__46735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__BinaryConstraint__Group__4__Impl6763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_rule__Model__ConfiguratorModelsAssignment_36809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguratorModel_in_rule__Model__ConfiguratorModelsAssignment_4_16840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfiguratorModel__NameAssignment_26871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__ConfiguratorModel__ParametersAssignment_4_26902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__ConfiguratorModel__ParametersAssignment_4_3_16933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_26964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__ConfiguratorModel__ConstraintsAssignment_5_3_16995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_17026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Parameter__MinChosenValuesAssignment_3_27057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Parameter__MaxChosenValuesAssignment_5_27088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_97119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enum__ValuesAssignment_17150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enum__ValuesAssignment_2_17181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Integer__ValueAssignment_17212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Double__ValueAssignment_17243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__String0__ValueAssignment_1_17274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Boolean__ValueAssignment_17305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__BinaryConstraint__LeftOperandAssignment_17336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryConstraint__OperatorAssignment_27367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__BinaryConstraint__RightOperandAssignment_37398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParameterIdentifier__ParameterAssignment7433 = new BitSet(new long[]{0x0000000000000002L});
    }


}