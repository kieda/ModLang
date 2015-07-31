package edu.cmu.cs464.p3.modlang.ui.contentassist.antlr.internal; 

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
import edu.cmu.cs464.p3.modlang.services.ModLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "':'", "'has'", "'end'", "'='", "'open'", "'import'", "'in'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalModLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModLangParser.tokenNames; }
    public String getGrammarFileName() { return "../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g"; }


     
     	private ModLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ModLangGrammarAccess grammarAccess) {
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
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:61:1: ( ruleModel EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:69:1: ruleModel : ( ( rule__Model__ModulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:73:2: ( ( ( rule__Model__ModulesAssignment )* ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:74:1: ( ( rule__Model__ModulesAssignment )* )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:74:1: ( ( rule__Model__ModulesAssignment )* )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:75:1: ( rule__Model__ModulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getModulesAssignment()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:76:1: ( rule__Model__ModulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:76:2: rule__Model__ModulesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ModulesAssignment_in_ruleModel94);
            	    rule__Model__ModulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getModulesAssignment()); 

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


    // $ANTLR start "entryRulePrefix"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:88:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:89:1: ( rulePrefix EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:90:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix122);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix129); 

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:97:1: rulePrefix : ( ( rule__Prefix__Alternatives ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:101:2: ( ( ( rule__Prefix__Alternatives ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:102:1: ( ( rule__Prefix__Alternatives ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:102:1: ( ( rule__Prefix__Alternatives ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:103:1: ( rule__Prefix__Alternatives )
            {
             before(grammarAccess.getPrefixAccess().getAlternatives()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:104:1: ( rule__Prefix__Alternatives )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:104:2: rule__Prefix__Alternatives
            {
            pushFollow(FOLLOW_rule__Prefix__Alternatives_in_rulePrefix155);
            rule__Prefix__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleSpec"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:116:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:117:1: ( ruleSpec EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:118:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec182);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec189); 

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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:125:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:129:2: ( ( ( rule__Spec__Group__0 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:130:1: ( ( rule__Spec__Group__0 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:130:1: ( ( rule__Spec__Group__0 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:131:1: ( rule__Spec__Group__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:132:1: ( rule__Spec__Group__0 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:132:2: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_rule__Spec__Group__0_in_ruleSpec215);
            rule__Spec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleModule"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:144:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:145:1: ( ruleModule EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:146:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule242);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule249); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:153:1: ruleModule : ( ( rule__Module__Alternatives ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:157:2: ( ( ( rule__Module__Alternatives ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:158:1: ( ( rule__Module__Alternatives ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:158:1: ( ( rule__Module__Alternatives ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:159:1: ( rule__Module__Alternatives )
            {
             before(grammarAccess.getModuleAccess().getAlternatives()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:160:1: ( rule__Module__Alternatives )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:160:2: rule__Module__Alternatives
            {
            pushFollow(FOLLOW_rule__Module__Alternatives_in_ruleModule275);
            rule__Module__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleList"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:172:1: entryRuleModuleList : ruleModuleList EOF ;
    public final void entryRuleModuleList() throws RecognitionException {
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:173:1: ( ruleModuleList EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:174:1: ruleModuleList EOF
            {
             before(grammarAccess.getModuleListRule()); 
            pushFollow(FOLLOW_ruleModuleList_in_entryRuleModuleList302);
            ruleModuleList();

            state._fsp--;

             after(grammarAccess.getModuleListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleList309); 

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
    // $ANTLR end "entryRuleModuleList"


    // $ANTLR start "ruleModuleList"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:181:1: ruleModuleList : ( ( rule__ModuleList__Alternatives ) ) ;
    public final void ruleModuleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:185:2: ( ( ( rule__ModuleList__Alternatives ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:186:1: ( ( rule__ModuleList__Alternatives ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:186:1: ( ( rule__ModuleList__Alternatives ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:187:1: ( rule__ModuleList__Alternatives )
            {
             before(grammarAccess.getModuleListAccess().getAlternatives()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:188:1: ( rule__ModuleList__Alternatives )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:188:2: rule__ModuleList__Alternatives
            {
            pushFollow(FOLLOW_rule__ModuleList__Alternatives_in_ruleModuleList335);
            rule__ModuleList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModuleListAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModuleList"


    // $ANTLR start "rule__Prefix__Alternatives"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:200:1: rule__Prefix__Alternatives : ( ( ( rule__Prefix__Group_0__0 ) ) | ( ( rule__Prefix__Group_1__0 ) ) );
    public final void rule__Prefix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:204:1: ( ( ( rule__Prefix__Group_0__0 ) ) | ( ( rule__Prefix__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:205:1: ( ( rule__Prefix__Group_0__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:205:1: ( ( rule__Prefix__Group_0__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:206:1: ( rule__Prefix__Group_0__0 )
                    {
                     before(grammarAccess.getPrefixAccess().getGroup_0()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:207:1: ( rule__Prefix__Group_0__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:207:2: rule__Prefix__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Prefix__Group_0__0_in_rule__Prefix__Alternatives371);
                    rule__Prefix__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrefixAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:211:6: ( ( rule__Prefix__Group_1__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:211:6: ( ( rule__Prefix__Group_1__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:212:1: ( rule__Prefix__Group_1__0 )
                    {
                     before(grammarAccess.getPrefixAccess().getGroup_1()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:213:1: ( rule__Prefix__Group_1__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:213:2: rule__Prefix__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Prefix__Group_1__0_in_rule__Prefix__Alternatives389);
                    rule__Prefix__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrefixAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Prefix__Alternatives"


    // $ANTLR start "rule__Module__Alternatives"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:222:1: rule__Module__Alternatives : ( ( ( rule__Module__PfAssignment_0 ) ) | ( ( rule__Module__Group_1__0 ) ) | ( ( rule__Module__Group_2__0 ) ) | ( ( rule__Module__Group_3__0 ) ) );
    public final void rule__Module__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:226:1: ( ( ( rule__Module__PfAssignment_0 ) ) | ( ( rule__Module__Group_1__0 ) ) | ( ( rule__Module__Group_2__0 ) ) | ( ( rule__Module__Group_3__0 ) ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:227:1: ( ( rule__Module__PfAssignment_0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:227:1: ( ( rule__Module__PfAssignment_0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:228:1: ( rule__Module__PfAssignment_0 )
                    {
                     before(grammarAccess.getModuleAccess().getPfAssignment_0()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:229:1: ( rule__Module__PfAssignment_0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:229:2: rule__Module__PfAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Module__PfAssignment_0_in_rule__Module__Alternatives422);
                    rule__Module__PfAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getPfAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:233:6: ( ( rule__Module__Group_1__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:233:6: ( ( rule__Module__Group_1__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:234:1: ( rule__Module__Group_1__0 )
                    {
                     before(grammarAccess.getModuleAccess().getGroup_1()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:235:1: ( rule__Module__Group_1__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:235:2: rule__Module__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_1__0_in_rule__Module__Alternatives440);
                    rule__Module__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:239:6: ( ( rule__Module__Group_2__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:239:6: ( ( rule__Module__Group_2__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:240:1: ( rule__Module__Group_2__0 )
                    {
                     before(grammarAccess.getModuleAccess().getGroup_2()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:241:1: ( rule__Module__Group_2__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:241:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Alternatives458);
                    rule__Module__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:245:6: ( ( rule__Module__Group_3__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:245:6: ( ( rule__Module__Group_3__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:246:1: ( rule__Module__Group_3__0 )
                    {
                     before(grammarAccess.getModuleAccess().getGroup_3()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:247:1: ( rule__Module__Group_3__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:247:2: rule__Module__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_3__0_in_rule__Module__Alternatives476);
                    rule__Module__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Module__Alternatives"


    // $ANTLR start "rule__ModuleList__Alternatives"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:256:1: rule__ModuleList__Alternatives : ( ( ( rule__ModuleList__Group_0__0 ) ) | ( ( rule__ModuleList__SingleAssignment_1 ) ) | ( ( rule__ModuleList__Group_2__0 ) ) );
    public final void rule__ModuleList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:260:1: ( ( ( rule__ModuleList__Group_0__0 ) ) | ( ( rule__ModuleList__SingleAssignment_1 ) ) | ( ( rule__ModuleList__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
            case 11:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:261:1: ( ( rule__ModuleList__Group_0__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:261:1: ( ( rule__ModuleList__Group_0__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:262:1: ( rule__ModuleList__Group_0__0 )
                    {
                     before(grammarAccess.getModuleListAccess().getGroup_0()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:263:1: ( rule__ModuleList__Group_0__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:263:2: rule__ModuleList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ModuleList__Group_0__0_in_rule__ModuleList__Alternatives509);
                    rule__ModuleList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:267:6: ( ( rule__ModuleList__SingleAssignment_1 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:267:6: ( ( rule__ModuleList__SingleAssignment_1 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:268:1: ( rule__ModuleList__SingleAssignment_1 )
                    {
                     before(grammarAccess.getModuleListAccess().getSingleAssignment_1()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:269:1: ( rule__ModuleList__SingleAssignment_1 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:269:2: rule__ModuleList__SingleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ModuleList__SingleAssignment_1_in_rule__ModuleList__Alternatives527);
                    rule__ModuleList__SingleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleListAccess().getSingleAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:273:6: ( ( rule__ModuleList__Group_2__0 ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:273:6: ( ( rule__ModuleList__Group_2__0 ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:274:1: ( rule__ModuleList__Group_2__0 )
                    {
                     before(grammarAccess.getModuleListAccess().getGroup_2()); 
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:275:1: ( rule__ModuleList__Group_2__0 )
                    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:275:2: rule__ModuleList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ModuleList__Group_2__0_in_rule__ModuleList__Alternatives545);
                    rule__ModuleList__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleListAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ModuleList__Alternatives"


    // $ANTLR start "rule__Prefix__Group_0__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:286:1: rule__Prefix__Group_0__0 : rule__Prefix__Group_0__0__Impl rule__Prefix__Group_0__1 ;
    public final void rule__Prefix__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:290:1: ( rule__Prefix__Group_0__0__Impl rule__Prefix__Group_0__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:291:2: rule__Prefix__Group_0__0__Impl rule__Prefix__Group_0__1
            {
            pushFollow(FOLLOW_rule__Prefix__Group_0__0__Impl_in_rule__Prefix__Group_0__0576);
            rule__Prefix__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group_0__1_in_rule__Prefix__Group_0__0579);
            rule__Prefix__Group_0__1();

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
    // $ANTLR end "rule__Prefix__Group_0__0"


    // $ANTLR start "rule__Prefix__Group_0__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:298:1: rule__Prefix__Group_0__0__Impl : ( '<' ) ;
    public final void rule__Prefix__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:302:1: ( ( '<' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:303:1: ( '<' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:303:1: ( '<' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:304:1: '<'
            {
             before(grammarAccess.getPrefixAccess().getLessThanSignKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Prefix__Group_0__0__Impl607); 
             after(grammarAccess.getPrefixAccess().getLessThanSignKeyword_0_0()); 

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
    // $ANTLR end "rule__Prefix__Group_0__0__Impl"


    // $ANTLR start "rule__Prefix__Group_0__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:317:1: rule__Prefix__Group_0__1 : rule__Prefix__Group_0__1__Impl rule__Prefix__Group_0__2 ;
    public final void rule__Prefix__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:321:1: ( rule__Prefix__Group_0__1__Impl rule__Prefix__Group_0__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:322:2: rule__Prefix__Group_0__1__Impl rule__Prefix__Group_0__2
            {
            pushFollow(FOLLOW_rule__Prefix__Group_0__1__Impl_in_rule__Prefix__Group_0__1638);
            rule__Prefix__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group_0__2_in_rule__Prefix__Group_0__1641);
            rule__Prefix__Group_0__2();

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
    // $ANTLR end "rule__Prefix__Group_0__1"


    // $ANTLR start "rule__Prefix__Group_0__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:329:1: rule__Prefix__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Prefix__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:333:1: ( ( '>' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:334:1: ( '>' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:334:1: ( '>' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:335:1: '>'
            {
             before(grammarAccess.getPrefixAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,12,FOLLOW_12_in_rule__Prefix__Group_0__1__Impl669); 
             after(grammarAccess.getPrefixAccess().getGreaterThanSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Prefix__Group_0__1__Impl"


    // $ANTLR start "rule__Prefix__Group_0__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:348:1: rule__Prefix__Group_0__2 : rule__Prefix__Group_0__2__Impl ;
    public final void rule__Prefix__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:352:1: ( rule__Prefix__Group_0__2__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:353:2: rule__Prefix__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Prefix__Group_0__2__Impl_in_rule__Prefix__Group_0__2700);
            rule__Prefix__Group_0__2__Impl();

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
    // $ANTLR end "rule__Prefix__Group_0__2"


    // $ANTLR start "rule__Prefix__Group_0__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:359:1: rule__Prefix__Group_0__2__Impl : ( ( rule__Prefix__SpecAssignment_0_2 ) ) ;
    public final void rule__Prefix__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:363:1: ( ( ( rule__Prefix__SpecAssignment_0_2 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:364:1: ( ( rule__Prefix__SpecAssignment_0_2 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:364:1: ( ( rule__Prefix__SpecAssignment_0_2 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:365:1: ( rule__Prefix__SpecAssignment_0_2 )
            {
             before(grammarAccess.getPrefixAccess().getSpecAssignment_0_2()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:366:1: ( rule__Prefix__SpecAssignment_0_2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:366:2: rule__Prefix__SpecAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Prefix__SpecAssignment_0_2_in_rule__Prefix__Group_0__2__Impl727);
            rule__Prefix__SpecAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getSpecAssignment_0_2()); 

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
    // $ANTLR end "rule__Prefix__Group_0__2__Impl"


    // $ANTLR start "rule__Prefix__Group_1__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:382:1: rule__Prefix__Group_1__0 : rule__Prefix__Group_1__0__Impl rule__Prefix__Group_1__1 ;
    public final void rule__Prefix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:386:1: ( rule__Prefix__Group_1__0__Impl rule__Prefix__Group_1__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:387:2: rule__Prefix__Group_1__0__Impl rule__Prefix__Group_1__1
            {
            pushFollow(FOLLOW_rule__Prefix__Group_1__0__Impl_in_rule__Prefix__Group_1__0763);
            rule__Prefix__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group_1__1_in_rule__Prefix__Group_1__0766);
            rule__Prefix__Group_1__1();

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
    // $ANTLR end "rule__Prefix__Group_1__0"


    // $ANTLR start "rule__Prefix__Group_1__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:394:1: rule__Prefix__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Prefix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:398:1: ( ( RULE_ID ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:399:1: ( RULE_ID )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:399:1: ( RULE_ID )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:400:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__Group_1__0__Impl793); 
             after(grammarAccess.getPrefixAccess().getIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Prefix__Group_1__0__Impl"


    // $ANTLR start "rule__Prefix__Group_1__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:411:1: rule__Prefix__Group_1__1 : rule__Prefix__Group_1__1__Impl ;
    public final void rule__Prefix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:415:1: ( rule__Prefix__Group_1__1__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:416:2: rule__Prefix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Prefix__Group_1__1__Impl_in_rule__Prefix__Group_1__1822);
            rule__Prefix__Group_1__1__Impl();

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
    // $ANTLR end "rule__Prefix__Group_1__1"


    // $ANTLR start "rule__Prefix__Group_1__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:422:1: rule__Prefix__Group_1__1__Impl : ( ruleSpec ) ;
    public final void rule__Prefix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:426:1: ( ( ruleSpec ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:427:1: ( ruleSpec )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:427:1: ( ruleSpec )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:428:1: ruleSpec
            {
             before(grammarAccess.getPrefixAccess().getSpecParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSpec_in_rule__Prefix__Group_1__1__Impl849);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getSpecParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Prefix__Group_1__1__Impl"


    // $ANTLR start "rule__Spec__Group__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:443:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:447:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:448:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0882);
            rule__Spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0885);
            rule__Spec__Group__1();

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
    // $ANTLR end "rule__Spec__Group__0"


    // $ANTLR start "rule__Spec__Group__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:455:1: rule__Spec__Group__0__Impl : ( () ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:459:1: ( ( () ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:460:1: ( () )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:460:1: ( () )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:461:1: ()
            {
             before(grammarAccess.getSpecAccess().getSpecAction_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:462:1: ()
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:464:1: 
            {
            }

             after(grammarAccess.getSpecAccess().getSpecAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0__Impl"


    // $ANTLR start "rule__Spec__Group__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:474:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:478:1: ( rule__Spec__Group__1__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:479:2: rule__Spec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1943);
            rule__Spec__Group__1__Impl();

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
    // $ANTLR end "rule__Spec__Group__1"


    // $ANTLR start "rule__Spec__Group__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:485:1: rule__Spec__Group__1__Impl : ( ( rule__Spec__Group_1__0 )* ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:489:1: ( ( ( rule__Spec__Group_1__0 )* ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:490:1: ( ( rule__Spec__Group_1__0 )* )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:490:1: ( ( rule__Spec__Group_1__0 )* )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:491:1: ( rule__Spec__Group_1__0 )*
            {
             before(grammarAccess.getSpecAccess().getGroup_1()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:492:1: ( rule__Spec__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:492:2: rule__Spec__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Spec__Group_1__0_in_rule__Spec__Group__1__Impl970);
            	    rule__Spec__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Spec__Group__1__Impl"


    // $ANTLR start "rule__Spec__Group_1__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:506:1: rule__Spec__Group_1__0 : rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1 ;
    public final void rule__Spec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:510:1: ( rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:511:2: rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1
            {
            pushFollow(FOLLOW_rule__Spec__Group_1__0__Impl_in_rule__Spec__Group_1__01005);
            rule__Spec__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group_1__1_in_rule__Spec__Group_1__01008);
            rule__Spec__Group_1__1();

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
    // $ANTLR end "rule__Spec__Group_1__0"


    // $ANTLR start "rule__Spec__Group_1__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:518:1: rule__Spec__Group_1__0__Impl : ( ( rule__Spec__PathAssignment_1_0 ) ) ;
    public final void rule__Spec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:522:1: ( ( ( rule__Spec__PathAssignment_1_0 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:523:1: ( ( rule__Spec__PathAssignment_1_0 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:523:1: ( ( rule__Spec__PathAssignment_1_0 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:524:1: ( rule__Spec__PathAssignment_1_0 )
            {
             before(grammarAccess.getSpecAccess().getPathAssignment_1_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:525:1: ( rule__Spec__PathAssignment_1_0 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:525:2: rule__Spec__PathAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Spec__PathAssignment_1_0_in_rule__Spec__Group_1__0__Impl1035);
            rule__Spec__PathAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getPathAssignment_1_0()); 

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
    // $ANTLR end "rule__Spec__Group_1__0__Impl"


    // $ANTLR start "rule__Spec__Group_1__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:535:1: rule__Spec__Group_1__1 : rule__Spec__Group_1__1__Impl ;
    public final void rule__Spec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:539:1: ( rule__Spec__Group_1__1__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:540:2: rule__Spec__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group_1__1__Impl_in_rule__Spec__Group_1__11065);
            rule__Spec__Group_1__1__Impl();

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
    // $ANTLR end "rule__Spec__Group_1__1"


    // $ANTLR start "rule__Spec__Group_1__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:546:1: rule__Spec__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:550:1: ( ( RULE_ID ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:551:1: ( RULE_ID )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:551:1: ( RULE_ID )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:552:1: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spec__Group_1__1__Impl1092); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Spec__Group_1__1__Impl"


    // $ANTLR start "rule__Module__Group_1__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:567:1: rule__Module__Group_1__0 : rule__Module__Group_1__0__Impl rule__Module__Group_1__1 ;
    public final void rule__Module__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:571:1: ( rule__Module__Group_1__0__Impl rule__Module__Group_1__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:572:2: rule__Module__Group_1__0__Impl rule__Module__Group_1__1
            {
            pushFollow(FOLLOW_rule__Module__Group_1__0__Impl_in_rule__Module__Group_1__01125);
            rule__Module__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_1__1_in_rule__Module__Group_1__01128);
            rule__Module__Group_1__1();

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
    // $ANTLR end "rule__Module__Group_1__0"


    // $ANTLR start "rule__Module__Group_1__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:579:1: rule__Module__Group_1__0__Impl : ( ( rule__Module__PfAssignment_1_0 ) ) ;
    public final void rule__Module__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:583:1: ( ( ( rule__Module__PfAssignment_1_0 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:584:1: ( ( rule__Module__PfAssignment_1_0 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:584:1: ( ( rule__Module__PfAssignment_1_0 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:585:1: ( rule__Module__PfAssignment_1_0 )
            {
             before(grammarAccess.getModuleAccess().getPfAssignment_1_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:586:1: ( rule__Module__PfAssignment_1_0 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:586:2: rule__Module__PfAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Module__PfAssignment_1_0_in_rule__Module__Group_1__0__Impl1155);
            rule__Module__PfAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getPfAssignment_1_0()); 

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
    // $ANTLR end "rule__Module__Group_1__0__Impl"


    // $ANTLR start "rule__Module__Group_1__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:596:1: rule__Module__Group_1__1 : rule__Module__Group_1__1__Impl rule__Module__Group_1__2 ;
    public final void rule__Module__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:600:1: ( rule__Module__Group_1__1__Impl rule__Module__Group_1__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:601:2: rule__Module__Group_1__1__Impl rule__Module__Group_1__2
            {
            pushFollow(FOLLOW_rule__Module__Group_1__1__Impl_in_rule__Module__Group_1__11185);
            rule__Module__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_1__2_in_rule__Module__Group_1__11188);
            rule__Module__Group_1__2();

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
    // $ANTLR end "rule__Module__Group_1__1"


    // $ANTLR start "rule__Module__Group_1__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:608:1: rule__Module__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Module__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:612:1: ( ( ':' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:613:1: ( ':' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:613:1: ( ':' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:614:1: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_1_1()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group_1__1__Impl1216); 
             after(grammarAccess.getModuleAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__Module__Group_1__1__Impl"


    // $ANTLR start "rule__Module__Group_1__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:627:1: rule__Module__Group_1__2 : rule__Module__Group_1__2__Impl ;
    public final void rule__Module__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:631:1: ( rule__Module__Group_1__2__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:632:2: rule__Module__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_1__2__Impl_in_rule__Module__Group_1__21247);
            rule__Module__Group_1__2__Impl();

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
    // $ANTLR end "rule__Module__Group_1__2"


    // $ANTLR start "rule__Module__Group_1__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:638:1: rule__Module__Group_1__2__Impl : ( ( rule__Module__Group_1_2__0 ) ) ;
    public final void rule__Module__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:642:1: ( ( ( rule__Module__Group_1_2__0 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:643:1: ( ( rule__Module__Group_1_2__0 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:643:1: ( ( rule__Module__Group_1_2__0 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:644:1: ( rule__Module__Group_1_2__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup_1_2()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:645:1: ( rule__Module__Group_1_2__0 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:645:2: rule__Module__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__Module__Group_1_2__0_in_rule__Module__Group_1__2__Impl1274);
            rule__Module__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Module__Group_1__2__Impl"


    // $ANTLR start "rule__Module__Group_1_2__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:661:1: rule__Module__Group_1_2__0 : rule__Module__Group_1_2__0__Impl rule__Module__Group_1_2__1 ;
    public final void rule__Module__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:665:1: ( rule__Module__Group_1_2__0__Impl rule__Module__Group_1_2__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:666:2: rule__Module__Group_1_2__0__Impl rule__Module__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_1_2__0__Impl_in_rule__Module__Group_1_2__01310);
            rule__Module__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_1_2__1_in_rule__Module__Group_1_2__01313);
            rule__Module__Group_1_2__1();

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
    // $ANTLR end "rule__Module__Group_1_2__0"


    // $ANTLR start "rule__Module__Group_1_2__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:673:1: rule__Module__Group_1_2__0__Impl : ( 'has' ) ;
    public final void rule__Module__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:677:1: ( ( 'has' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:678:1: ( 'has' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:678:1: ( 'has' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:679:1: 'has'
            {
             before(grammarAccess.getModuleAccess().getHasKeyword_1_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group_1_2__0__Impl1341); 
             after(grammarAccess.getModuleAccess().getHasKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Module__Group_1_2__0__Impl"


    // $ANTLR start "rule__Module__Group_1_2__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:692:1: rule__Module__Group_1_2__1 : rule__Module__Group_1_2__1__Impl rule__Module__Group_1_2__2 ;
    public final void rule__Module__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:696:1: ( rule__Module__Group_1_2__1__Impl rule__Module__Group_1_2__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:697:2: rule__Module__Group_1_2__1__Impl rule__Module__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_1_2__1__Impl_in_rule__Module__Group_1_2__11372);
            rule__Module__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_1_2__2_in_rule__Module__Group_1_2__11375);
            rule__Module__Group_1_2__2();

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
    // $ANTLR end "rule__Module__Group_1_2__1"


    // $ANTLR start "rule__Module__Group_1_2__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:704:1: rule__Module__Group_1_2__1__Impl : ( ( rule__Module__MlAssignment_1_2_1 )* ) ;
    public final void rule__Module__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:708:1: ( ( ( rule__Module__MlAssignment_1_2_1 )* ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:709:1: ( ( rule__Module__MlAssignment_1_2_1 )* )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:709:1: ( ( rule__Module__MlAssignment_1_2_1 )* )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:710:1: ( rule__Module__MlAssignment_1_2_1 )*
            {
             before(grammarAccess.getModuleAccess().getMlAssignment_1_2_1()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:711:1: ( rule__Module__MlAssignment_1_2_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==11||(LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:711:2: rule__Module__MlAssignment_1_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Module__MlAssignment_1_2_1_in_rule__Module__Group_1_2__1__Impl1402);
            	    rule__Module__MlAssignment_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getMlAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Module__Group_1_2__1__Impl"


    // $ANTLR start "rule__Module__Group_1_2__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:721:1: rule__Module__Group_1_2__2 : rule__Module__Group_1_2__2__Impl rule__Module__Group_1_2__3 ;
    public final void rule__Module__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:725:1: ( rule__Module__Group_1_2__2__Impl rule__Module__Group_1_2__3 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:726:2: rule__Module__Group_1_2__2__Impl rule__Module__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Module__Group_1_2__2__Impl_in_rule__Module__Group_1_2__21433);
            rule__Module__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_1_2__3_in_rule__Module__Group_1_2__21436);
            rule__Module__Group_1_2__3();

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
    // $ANTLR end "rule__Module__Group_1_2__2"


    // $ANTLR start "rule__Module__Group_1_2__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:733:1: rule__Module__Group_1_2__2__Impl : ( 'end' ) ;
    public final void rule__Module__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:737:1: ( ( 'end' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:738:1: ( 'end' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:738:1: ( 'end' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:739:1: 'end'
            {
             before(grammarAccess.getModuleAccess().getEndKeyword_1_2_2()); 
            match(input,15,FOLLOW_15_in_rule__Module__Group_1_2__2__Impl1464); 
             after(grammarAccess.getModuleAccess().getEndKeyword_1_2_2()); 

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
    // $ANTLR end "rule__Module__Group_1_2__2__Impl"


    // $ANTLR start "rule__Module__Group_1_2__3"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:752:1: rule__Module__Group_1_2__3 : rule__Module__Group_1_2__3__Impl ;
    public final void rule__Module__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:756:1: ( rule__Module__Group_1_2__3__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:757:2: rule__Module__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_1_2__3__Impl_in_rule__Module__Group_1_2__31495);
            rule__Module__Group_1_2__3__Impl();

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
    // $ANTLR end "rule__Module__Group_1_2__3"


    // $ANTLR start "rule__Module__Group_1_2__3__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:763:1: rule__Module__Group_1_2__3__Impl : ( ( rule__Module__SpecAssignment_1_2_3 ) ) ;
    public final void rule__Module__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:767:1: ( ( ( rule__Module__SpecAssignment_1_2_3 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:768:1: ( ( rule__Module__SpecAssignment_1_2_3 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:768:1: ( ( rule__Module__SpecAssignment_1_2_3 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:769:1: ( rule__Module__SpecAssignment_1_2_3 )
            {
             before(grammarAccess.getModuleAccess().getSpecAssignment_1_2_3()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:770:1: ( rule__Module__SpecAssignment_1_2_3 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:770:2: rule__Module__SpecAssignment_1_2_3
            {
            pushFollow(FOLLOW_rule__Module__SpecAssignment_1_2_3_in_rule__Module__Group_1_2__3__Impl1522);
            rule__Module__SpecAssignment_1_2_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSpecAssignment_1_2_3()); 

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
    // $ANTLR end "rule__Module__Group_1_2__3__Impl"


    // $ANTLR start "rule__Module__Group_2__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:788:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:792:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:793:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__01560);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__01563);
            rule__Module__Group_2__1();

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
    // $ANTLR end "rule__Module__Group_2__0"


    // $ANTLR start "rule__Module__Group_2__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:800:1: rule__Module__Group_2__0__Impl : ( ( rule__Module__PfAssignment_2_0 ) ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:804:1: ( ( ( rule__Module__PfAssignment_2_0 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:805:1: ( ( rule__Module__PfAssignment_2_0 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:805:1: ( ( rule__Module__PfAssignment_2_0 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:806:1: ( rule__Module__PfAssignment_2_0 )
            {
             before(grammarAccess.getModuleAccess().getPfAssignment_2_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:807:1: ( rule__Module__PfAssignment_2_0 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:807:2: rule__Module__PfAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Module__PfAssignment_2_0_in_rule__Module__Group_2__0__Impl1590);
            rule__Module__PfAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getPfAssignment_2_0()); 

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
    // $ANTLR end "rule__Module__Group_2__0__Impl"


    // $ANTLR start "rule__Module__Group_2__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:817:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:821:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:822:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__11620);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__11623);
            rule__Module__Group_2__2();

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
    // $ANTLR end "rule__Module__Group_2__1"


    // $ANTLR start "rule__Module__Group_2__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:829:1: rule__Module__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:833:1: ( ( ':' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:834:1: ( ':' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:834:1: ( ':' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:835:1: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_2_1()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group_2__1__Impl1651); 
             after(grammarAccess.getModuleAccess().getColonKeyword_2_1()); 

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
    // $ANTLR end "rule__Module__Group_2__1__Impl"


    // $ANTLR start "rule__Module__Group_2__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:848:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:852:1: ( rule__Module__Group_2__2__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:853:2: rule__Module__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__21682);
            rule__Module__Group_2__2__Impl();

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
    // $ANTLR end "rule__Module__Group_2__2"


    // $ANTLR start "rule__Module__Group_2__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:859:1: rule__Module__Group_2__2__Impl : ( ( rule__Module__ModAssignment_2_2 ) ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:863:1: ( ( ( rule__Module__ModAssignment_2_2 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:864:1: ( ( rule__Module__ModAssignment_2_2 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:864:1: ( ( rule__Module__ModAssignment_2_2 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:865:1: ( rule__Module__ModAssignment_2_2 )
            {
             before(grammarAccess.getModuleAccess().getModAssignment_2_2()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:866:1: ( rule__Module__ModAssignment_2_2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:866:2: rule__Module__ModAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Module__ModAssignment_2_2_in_rule__Module__Group_2__2__Impl1709);
            rule__Module__ModAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getModAssignment_2_2()); 

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
    // $ANTLR end "rule__Module__Group_2__2__Impl"


    // $ANTLR start "rule__Module__Group_3__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:882:1: rule__Module__Group_3__0 : rule__Module__Group_3__0__Impl rule__Module__Group_3__1 ;
    public final void rule__Module__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:886:1: ( rule__Module__Group_3__0__Impl rule__Module__Group_3__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:887:2: rule__Module__Group_3__0__Impl rule__Module__Group_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__01745);
            rule__Module__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__01748);
            rule__Module__Group_3__1();

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
    // $ANTLR end "rule__Module__Group_3__0"


    // $ANTLR start "rule__Module__Group_3__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:894:1: rule__Module__Group_3__0__Impl : ( ( rule__Module__IdAssignment_3_0 ) ) ;
    public final void rule__Module__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:898:1: ( ( ( rule__Module__IdAssignment_3_0 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:899:1: ( ( rule__Module__IdAssignment_3_0 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:899:1: ( ( rule__Module__IdAssignment_3_0 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:900:1: ( rule__Module__IdAssignment_3_0 )
            {
             before(grammarAccess.getModuleAccess().getIdAssignment_3_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:901:1: ( rule__Module__IdAssignment_3_0 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:901:2: rule__Module__IdAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Module__IdAssignment_3_0_in_rule__Module__Group_3__0__Impl1775);
            rule__Module__IdAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getIdAssignment_3_0()); 

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
    // $ANTLR end "rule__Module__Group_3__0__Impl"


    // $ANTLR start "rule__Module__Group_3__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:911:1: rule__Module__Group_3__1 : rule__Module__Group_3__1__Impl rule__Module__Group_3__2 ;
    public final void rule__Module__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:915:1: ( rule__Module__Group_3__1__Impl rule__Module__Group_3__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:916:2: rule__Module__Group_3__1__Impl rule__Module__Group_3__2
            {
            pushFollow(FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__11805);
            rule__Module__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3__2_in_rule__Module__Group_3__11808);
            rule__Module__Group_3__2();

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
    // $ANTLR end "rule__Module__Group_3__1"


    // $ANTLR start "rule__Module__Group_3__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:923:1: rule__Module__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Module__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:927:1: ( ( '=' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:928:1: ( '=' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:928:1: ( '=' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:929:1: '='
            {
             before(grammarAccess.getModuleAccess().getEqualsSignKeyword_3_1()); 
            match(input,16,FOLLOW_16_in_rule__Module__Group_3__1__Impl1836); 
             after(grammarAccess.getModuleAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Module__Group_3__1__Impl"


    // $ANTLR start "rule__Module__Group_3__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:942:1: rule__Module__Group_3__2 : rule__Module__Group_3__2__Impl ;
    public final void rule__Module__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:946:1: ( rule__Module__Group_3__2__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:947:2: rule__Module__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3__2__Impl_in_rule__Module__Group_3__21867);
            rule__Module__Group_3__2__Impl();

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
    // $ANTLR end "rule__Module__Group_3__2"


    // $ANTLR start "rule__Module__Group_3__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:953:1: rule__Module__Group_3__2__Impl : ( ( rule__Module__ModAssignment_3_2 ) ) ;
    public final void rule__Module__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:957:1: ( ( ( rule__Module__ModAssignment_3_2 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:958:1: ( ( rule__Module__ModAssignment_3_2 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:958:1: ( ( rule__Module__ModAssignment_3_2 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:959:1: ( rule__Module__ModAssignment_3_2 )
            {
             before(grammarAccess.getModuleAccess().getModAssignment_3_2()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:960:1: ( rule__Module__ModAssignment_3_2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:960:2: rule__Module__ModAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Module__ModAssignment_3_2_in_rule__Module__Group_3__2__Impl1894);
            rule__Module__ModAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getModAssignment_3_2()); 

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
    // $ANTLR end "rule__Module__Group_3__2__Impl"


    // $ANTLR start "rule__ModuleList__Group_0__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:976:1: rule__ModuleList__Group_0__0 : rule__ModuleList__Group_0__0__Impl rule__ModuleList__Group_0__1 ;
    public final void rule__ModuleList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:980:1: ( rule__ModuleList__Group_0__0__Impl rule__ModuleList__Group_0__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:981:2: rule__ModuleList__Group_0__0__Impl rule__ModuleList__Group_0__1
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_0__0__Impl_in_rule__ModuleList__Group_0__01930);
            rule__ModuleList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleList__Group_0__1_in_rule__ModuleList__Group_0__01933);
            rule__ModuleList__Group_0__1();

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
    // $ANTLR end "rule__ModuleList__Group_0__0"


    // $ANTLR start "rule__ModuleList__Group_0__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:988:1: rule__ModuleList__Group_0__0__Impl : ( () ) ;
    public final void rule__ModuleList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:992:1: ( ( () ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:993:1: ( () )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:993:1: ( () )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:994:1: ()
            {
             before(grammarAccess.getModuleListAccess().getModuleListAction_0_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:995:1: ()
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:997:1: 
            {
            }

             after(grammarAccess.getModuleListAccess().getModuleListAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleList__Group_0__0__Impl"


    // $ANTLR start "rule__ModuleList__Group_0__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1007:1: rule__ModuleList__Group_0__1 : rule__ModuleList__Group_0__1__Impl rule__ModuleList__Group_0__2 ;
    public final void rule__ModuleList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1011:1: ( rule__ModuleList__Group_0__1__Impl rule__ModuleList__Group_0__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1012:2: rule__ModuleList__Group_0__1__Impl rule__ModuleList__Group_0__2
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_0__1__Impl_in_rule__ModuleList__Group_0__11991);
            rule__ModuleList__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleList__Group_0__2_in_rule__ModuleList__Group_0__11994);
            rule__ModuleList__Group_0__2();

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
    // $ANTLR end "rule__ModuleList__Group_0__1"


    // $ANTLR start "rule__ModuleList__Group_0__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1019:1: rule__ModuleList__Group_0__1__Impl : ( 'open' ) ;
    public final void rule__ModuleList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1023:1: ( ( 'open' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1024:1: ( 'open' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1024:1: ( 'open' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1025:1: 'open'
            {
             before(grammarAccess.getModuleListAccess().getOpenKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__ModuleList__Group_0__1__Impl2022); 
             after(grammarAccess.getModuleListAccess().getOpenKeyword_0_1()); 

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
    // $ANTLR end "rule__ModuleList__Group_0__1__Impl"


    // $ANTLR start "rule__ModuleList__Group_0__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1038:1: rule__ModuleList__Group_0__2 : rule__ModuleList__Group_0__2__Impl ;
    public final void rule__ModuleList__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1042:1: ( rule__ModuleList__Group_0__2__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1043:2: rule__ModuleList__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_0__2__Impl_in_rule__ModuleList__Group_0__22053);
            rule__ModuleList__Group_0__2__Impl();

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
    // $ANTLR end "rule__ModuleList__Group_0__2"


    // $ANTLR start "rule__ModuleList__Group_0__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1049:1: rule__ModuleList__Group_0__2__Impl : ( ( rule__ModuleList__OpenAssignment_0_2 ) ) ;
    public final void rule__ModuleList__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1053:1: ( ( ( rule__ModuleList__OpenAssignment_0_2 ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1054:1: ( ( rule__ModuleList__OpenAssignment_0_2 ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1054:1: ( ( rule__ModuleList__OpenAssignment_0_2 ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1055:1: ( rule__ModuleList__OpenAssignment_0_2 )
            {
             before(grammarAccess.getModuleListAccess().getOpenAssignment_0_2()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1056:1: ( rule__ModuleList__OpenAssignment_0_2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1056:2: rule__ModuleList__OpenAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ModuleList__OpenAssignment_0_2_in_rule__ModuleList__Group_0__2__Impl2080);
            rule__ModuleList__OpenAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleListAccess().getOpenAssignment_0_2()); 

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
    // $ANTLR end "rule__ModuleList__Group_0__2__Impl"


    // $ANTLR start "rule__ModuleList__Group_2__0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1072:1: rule__ModuleList__Group_2__0 : rule__ModuleList__Group_2__0__Impl rule__ModuleList__Group_2__1 ;
    public final void rule__ModuleList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1076:1: ( rule__ModuleList__Group_2__0__Impl rule__ModuleList__Group_2__1 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1077:2: rule__ModuleList__Group_2__0__Impl rule__ModuleList__Group_2__1
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_2__0__Impl_in_rule__ModuleList__Group_2__02116);
            rule__ModuleList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleList__Group_2__1_in_rule__ModuleList__Group_2__02119);
            rule__ModuleList__Group_2__1();

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
    // $ANTLR end "rule__ModuleList__Group_2__0"


    // $ANTLR start "rule__ModuleList__Group_2__0__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1084:1: rule__ModuleList__Group_2__0__Impl : ( 'import' ) ;
    public final void rule__ModuleList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1088:1: ( ( 'import' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1089:1: ( 'import' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1089:1: ( 'import' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1090:1: 'import'
            {
             before(grammarAccess.getModuleListAccess().getImportKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__ModuleList__Group_2__0__Impl2147); 
             after(grammarAccess.getModuleListAccess().getImportKeyword_2_0()); 

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
    // $ANTLR end "rule__ModuleList__Group_2__0__Impl"


    // $ANTLR start "rule__ModuleList__Group_2__1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1103:1: rule__ModuleList__Group_2__1 : rule__ModuleList__Group_2__1__Impl rule__ModuleList__Group_2__2 ;
    public final void rule__ModuleList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1107:1: ( rule__ModuleList__Group_2__1__Impl rule__ModuleList__Group_2__2 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1108:2: rule__ModuleList__Group_2__1__Impl rule__ModuleList__Group_2__2
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_2__1__Impl_in_rule__ModuleList__Group_2__12178);
            rule__ModuleList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleList__Group_2__2_in_rule__ModuleList__Group_2__12181);
            rule__ModuleList__Group_2__2();

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
    // $ANTLR end "rule__ModuleList__Group_2__1"


    // $ANTLR start "rule__ModuleList__Group_2__1__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1115:1: rule__ModuleList__Group_2__1__Impl : ( ( rule__ModuleList__ContextAssignment_2_1 )* ) ;
    public final void rule__ModuleList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1119:1: ( ( ( rule__ModuleList__ContextAssignment_2_1 )* ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1120:1: ( ( rule__ModuleList__ContextAssignment_2_1 )* )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1120:1: ( ( rule__ModuleList__ContextAssignment_2_1 )* )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1121:1: ( rule__ModuleList__ContextAssignment_2_1 )*
            {
             before(grammarAccess.getModuleListAccess().getContextAssignment_2_1()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1122:1: ( rule__ModuleList__ContextAssignment_2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==11||(LA7_0>=17 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1122:2: rule__ModuleList__ContextAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ModuleList__ContextAssignment_2_1_in_rule__ModuleList__Group_2__1__Impl2208);
            	    rule__ModuleList__ContextAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModuleListAccess().getContextAssignment_2_1()); 

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
    // $ANTLR end "rule__ModuleList__Group_2__1__Impl"


    // $ANTLR start "rule__ModuleList__Group_2__2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1132:1: rule__ModuleList__Group_2__2 : rule__ModuleList__Group_2__2__Impl rule__ModuleList__Group_2__3 ;
    public final void rule__ModuleList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1136:1: ( rule__ModuleList__Group_2__2__Impl rule__ModuleList__Group_2__3 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1137:2: rule__ModuleList__Group_2__2__Impl rule__ModuleList__Group_2__3
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_2__2__Impl_in_rule__ModuleList__Group_2__22239);
            rule__ModuleList__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleList__Group_2__3_in_rule__ModuleList__Group_2__22242);
            rule__ModuleList__Group_2__3();

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
    // $ANTLR end "rule__ModuleList__Group_2__2"


    // $ANTLR start "rule__ModuleList__Group_2__2__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1144:1: rule__ModuleList__Group_2__2__Impl : ( 'in' ) ;
    public final void rule__ModuleList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1148:1: ( ( 'in' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1149:1: ( 'in' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1149:1: ( 'in' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1150:1: 'in'
            {
             before(grammarAccess.getModuleListAccess().getInKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__ModuleList__Group_2__2__Impl2270); 
             after(grammarAccess.getModuleListAccess().getInKeyword_2_2()); 

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
    // $ANTLR end "rule__ModuleList__Group_2__2__Impl"


    // $ANTLR start "rule__ModuleList__Group_2__3"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1163:1: rule__ModuleList__Group_2__3 : rule__ModuleList__Group_2__3__Impl rule__ModuleList__Group_2__4 ;
    public final void rule__ModuleList__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1167:1: ( rule__ModuleList__Group_2__3__Impl rule__ModuleList__Group_2__4 )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1168:2: rule__ModuleList__Group_2__3__Impl rule__ModuleList__Group_2__4
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_2__3__Impl_in_rule__ModuleList__Group_2__32301);
            rule__ModuleList__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleList__Group_2__4_in_rule__ModuleList__Group_2__32304);
            rule__ModuleList__Group_2__4();

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
    // $ANTLR end "rule__ModuleList__Group_2__3"


    // $ANTLR start "rule__ModuleList__Group_2__3__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1175:1: rule__ModuleList__Group_2__3__Impl : ( ( rule__ModuleList__DefAssignment_2_3 )* ) ;
    public final void rule__ModuleList__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1179:1: ( ( ( rule__ModuleList__DefAssignment_2_3 )* ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1180:1: ( ( rule__ModuleList__DefAssignment_2_3 )* )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1180:1: ( ( rule__ModuleList__DefAssignment_2_3 )* )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1181:1: ( rule__ModuleList__DefAssignment_2_3 )*
            {
             before(grammarAccess.getModuleListAccess().getDefAssignment_2_3()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1182:1: ( rule__ModuleList__DefAssignment_2_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==11||(LA8_0>=17 && LA8_0<=18)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1182:2: rule__ModuleList__DefAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__ModuleList__DefAssignment_2_3_in_rule__ModuleList__Group_2__3__Impl2331);
            	    rule__ModuleList__DefAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleListAccess().getDefAssignment_2_3()); 

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
    // $ANTLR end "rule__ModuleList__Group_2__3__Impl"


    // $ANTLR start "rule__ModuleList__Group_2__4"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1192:1: rule__ModuleList__Group_2__4 : rule__ModuleList__Group_2__4__Impl ;
    public final void rule__ModuleList__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1196:1: ( rule__ModuleList__Group_2__4__Impl )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1197:2: rule__ModuleList__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__ModuleList__Group_2__4__Impl_in_rule__ModuleList__Group_2__42362);
            rule__ModuleList__Group_2__4__Impl();

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
    // $ANTLR end "rule__ModuleList__Group_2__4"


    // $ANTLR start "rule__ModuleList__Group_2__4__Impl"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1203:1: rule__ModuleList__Group_2__4__Impl : ( 'end' ) ;
    public final void rule__ModuleList__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1207:1: ( ( 'end' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1208:1: ( 'end' )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1208:1: ( 'end' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1209:1: 'end'
            {
             before(grammarAccess.getModuleListAccess().getEndKeyword_2_4()); 
            match(input,15,FOLLOW_15_in_rule__ModuleList__Group_2__4__Impl2390); 
             after(grammarAccess.getModuleListAccess().getEndKeyword_2_4()); 

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
    // $ANTLR end "rule__ModuleList__Group_2__4__Impl"


    // $ANTLR start "rule__Model__ModulesAssignment"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1233:1: rule__Model__ModulesAssignment : ( ruleModuleList ) ;
    public final void rule__Model__ModulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1237:1: ( ( ruleModuleList ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1238:1: ( ruleModuleList )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1238:1: ( ruleModuleList )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1239:1: ruleModuleList
            {
             before(grammarAccess.getModelAccess().getModulesModuleListParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModuleList_in_rule__Model__ModulesAssignment2436);
            ruleModuleList();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModulesModuleListParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ModulesAssignment"


    // $ANTLR start "rule__Prefix__SpecAssignment_0_2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1248:1: rule__Prefix__SpecAssignment_0_2 : ( ruleSpec ) ;
    public final void rule__Prefix__SpecAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1252:1: ( ( ruleSpec ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1253:1: ( ruleSpec )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1253:1: ( ruleSpec )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1254:1: ruleSpec
            {
             before(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleSpec_in_rule__Prefix__SpecAssignment_0_22467);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Prefix__SpecAssignment_0_2"


    // $ANTLR start "rule__Spec__PathAssignment_1_0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1263:1: rule__Spec__PathAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Spec__PathAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1267:1: ( ( ( '.' ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1268:1: ( ( '.' ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1268:1: ( ( '.' ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1269:1: ( '.' )
            {
             before(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); 
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1270:1: ( '.' )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1271:1: '.'
            {
             before(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Spec__PathAssignment_1_02503); 
             after(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); 

            }

             after(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Spec__PathAssignment_1_0"


    // $ANTLR start "rule__Module__PfAssignment_0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1286:1: rule__Module__PfAssignment_0 : ( rulePrefix ) ;
    public final void rule__Module__PfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1290:1: ( ( rulePrefix ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1291:1: ( rulePrefix )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1291:1: ( rulePrefix )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1292:1: rulePrefix
            {
             before(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Module__PfAssignment_02542);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Module__PfAssignment_0"


    // $ANTLR start "rule__Module__PfAssignment_1_0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1301:1: rule__Module__PfAssignment_1_0 : ( rulePrefix ) ;
    public final void rule__Module__PfAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1305:1: ( ( rulePrefix ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1306:1: ( rulePrefix )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1306:1: ( rulePrefix )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1307:1: rulePrefix
            {
             before(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Module__PfAssignment_1_02573);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Module__PfAssignment_1_0"


    // $ANTLR start "rule__Module__MlAssignment_1_2_1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1316:1: rule__Module__MlAssignment_1_2_1 : ( ruleModuleList ) ;
    public final void rule__Module__MlAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1320:1: ( ( ruleModuleList ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1321:1: ( ruleModuleList )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1321:1: ( ruleModuleList )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1322:1: ruleModuleList
            {
             before(grammarAccess.getModuleAccess().getMlModuleListParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleModuleList_in_rule__Module__MlAssignment_1_2_12604);
            ruleModuleList();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getMlModuleListParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Module__MlAssignment_1_2_1"


    // $ANTLR start "rule__Module__SpecAssignment_1_2_3"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1331:1: rule__Module__SpecAssignment_1_2_3 : ( ruleSpec ) ;
    public final void rule__Module__SpecAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1335:1: ( ( ruleSpec ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1336:1: ( ruleSpec )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1336:1: ( ruleSpec )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1337:1: ruleSpec
            {
             before(grammarAccess.getModuleAccess().getSpecSpecParserRuleCall_1_2_3_0()); 
            pushFollow(FOLLOW_ruleSpec_in_rule__Module__SpecAssignment_1_2_32635);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getSpecSpecParserRuleCall_1_2_3_0()); 

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
    // $ANTLR end "rule__Module__SpecAssignment_1_2_3"


    // $ANTLR start "rule__Module__PfAssignment_2_0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1346:1: rule__Module__PfAssignment_2_0 : ( rulePrefix ) ;
    public final void rule__Module__PfAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1350:1: ( ( rulePrefix ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1351:1: ( rulePrefix )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1351:1: ( rulePrefix )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1352:1: rulePrefix
            {
             before(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Module__PfAssignment_2_02666);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Module__PfAssignment_2_0"


    // $ANTLR start "rule__Module__ModAssignment_2_2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1361:1: rule__Module__ModAssignment_2_2 : ( ruleModule ) ;
    public final void rule__Module__ModAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1365:1: ( ( ruleModule ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1366:1: ( ruleModule )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1366:1: ( ruleModule )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1367:1: ruleModule
            {
             before(grammarAccess.getModuleAccess().getModModuleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Module__ModAssignment_2_22697);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getModModuleParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Module__ModAssignment_2_2"


    // $ANTLR start "rule__Module__IdAssignment_3_0"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1376:1: rule__Module__IdAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Module__IdAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1380:1: ( ( RULE_ID ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1381:1: ( RULE_ID )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1381:1: ( RULE_ID )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1382:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getIdIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__IdAssignment_3_02728); 
             after(grammarAccess.getModuleAccess().getIdIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Module__IdAssignment_3_0"


    // $ANTLR start "rule__Module__ModAssignment_3_2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1391:1: rule__Module__ModAssignment_3_2 : ( ruleModule ) ;
    public final void rule__Module__ModAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1395:1: ( ( ruleModule ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1396:1: ( ruleModule )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1396:1: ( ruleModule )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1397:1: ruleModule
            {
             before(grammarAccess.getModuleAccess().getModModuleParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Module__ModAssignment_3_22759);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getModModuleParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Module__ModAssignment_3_2"


    // $ANTLR start "rule__ModuleList__OpenAssignment_0_2"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1406:1: rule__ModuleList__OpenAssignment_0_2 : ( ruleModule ) ;
    public final void rule__ModuleList__OpenAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1410:1: ( ( ruleModule ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1411:1: ( ruleModule )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1411:1: ( ruleModule )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1412:1: ruleModule
            {
             before(grammarAccess.getModuleListAccess().getOpenModuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__ModuleList__OpenAssignment_0_22790);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleListAccess().getOpenModuleParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__ModuleList__OpenAssignment_0_2"


    // $ANTLR start "rule__ModuleList__SingleAssignment_1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1421:1: rule__ModuleList__SingleAssignment_1 : ( ruleModule ) ;
    public final void rule__ModuleList__SingleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1425:1: ( ( ruleModule ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1426:1: ( ruleModule )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1426:1: ( ruleModule )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1427:1: ruleModule
            {
             before(grammarAccess.getModuleListAccess().getSingleModuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__ModuleList__SingleAssignment_12821);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleListAccess().getSingleModuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ModuleList__SingleAssignment_1"


    // $ANTLR start "rule__ModuleList__ContextAssignment_2_1"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1436:1: rule__ModuleList__ContextAssignment_2_1 : ( ruleModuleList ) ;
    public final void rule__ModuleList__ContextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1440:1: ( ( ruleModuleList ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1441:1: ( ruleModuleList )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1441:1: ( ruleModuleList )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1442:1: ruleModuleList
            {
             before(grammarAccess.getModuleListAccess().getContextModuleListParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleModuleList_in_rule__ModuleList__ContextAssignment_2_12852);
            ruleModuleList();

            state._fsp--;

             after(grammarAccess.getModuleListAccess().getContextModuleListParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ModuleList__ContextAssignment_2_1"


    // $ANTLR start "rule__ModuleList__DefAssignment_2_3"
    // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1451:1: rule__ModuleList__DefAssignment_2_3 : ( ruleModuleList ) ;
    public final void rule__ModuleList__DefAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1455:1: ( ( ruleModuleList ) )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1456:1: ( ruleModuleList )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1456:1: ( ruleModuleList )
            // ../edu.cmu.cs464.p3.modlang.syntax.ui/src-gen/edu/cmu/cs464/p3/modlang/ui/contentassist/antlr/internal/InternalModLang.g:1457:1: ruleModuleList
            {
             before(grammarAccess.getModuleListAccess().getDefModuleListParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleModuleList_in_rule__ModuleList__DefAssignment_2_32883);
            ruleModuleList();

            state._fsp--;

             after(grammarAccess.getModuleListAccess().getDefModuleListParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__ModuleList__DefAssignment_2_3"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\2\uffff\2\7\5\uffff\1\7\2\uffff\1\7";
    static final String DFA3_minS =
        "\1\4\1\14\4\4\2\uffff\2\4\2\uffff\1\4";
    static final String DFA3_maxS =
        "\1\13\1\14\2\24\1\4\1\16\2\uffff\1\4\1\24\2\uffff\1\24";
    static final String DFA3_acceptS =
        "\6\uffff\1\4\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\6\uffff\1\1",
            "\1\3",
            "\1\7\6\uffff\1\7\1\uffff\1\5\1\uffff\1\7\1\6\3\7\1\4",
            "\1\7\6\uffff\1\7\1\uffff\1\5\1\uffff\1\7\1\uffff\3\7\1\10",
            "\1\11",
            "\1\13\6\uffff\1\13\2\uffff\1\12",
            "",
            "",
            "\1\14",
            "\1\7\6\uffff\1\7\1\uffff\1\5\1\uffff\1\7\1\uffff\3\7\1\4",
            "",
            "",
            "\1\7\6\uffff\1\7\1\uffff\1\5\1\uffff\1\7\1\uffff\3\7\1\10"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "222:1: rule__Module__Alternatives : ( ( ( rule__Module__PfAssignment_0 ) ) | ( ( rule__Module__Group_1__0 ) ) | ( ( rule__Module__Group_2__0 ) ) | ( ( rule__Module__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModulesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000060812L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Alternatives_in_rulePrefix155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0_in_ruleSpec215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Alternatives_in_ruleModule275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_entryRuleModuleList302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleList309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Alternatives_in_ruleModuleList335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_0__0_in_rule__Prefix__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_1__0_in_rule__Prefix__Alternatives389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PfAssignment_0_in_rule__Module__Alternatives422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1__0_in_rule__Module__Alternatives440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Alternatives458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0_in_rule__Module__Alternatives476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_0__0_in_rule__ModuleList__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__SingleAssignment_1_in_rule__ModuleList__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__0_in_rule__ModuleList__Alternatives545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_0__0__Impl_in_rule__Prefix__Group_0__0576 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Prefix__Group_0__1_in_rule__Prefix__Group_0__0579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Prefix__Group_0__0__Impl607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_0__1__Impl_in_rule__Prefix__Group_0__1638 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Prefix__Group_0__2_in_rule__Prefix__Group_0__1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Prefix__Group_0__1__Impl669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_0__2__Impl_in_rule__Prefix__Group_0__2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__SpecAssignment_0_2_in_rule__Prefix__Group_0__2__Impl727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_1__0__Impl_in_rule__Prefix__Group_1__0763 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Prefix__Group_1__1_in_rule__Prefix__Group_1__0766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__Group_1__0__Impl793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group_1__1__Impl_in_rule__Prefix__Group_1__1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_rule__Prefix__Group_1__1__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0882 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__0_in_rule__Spec__Group__1__Impl970 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__0__Impl_in_rule__Spec__Group_1__01005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__1_in_rule__Spec__Group_1__01008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__PathAssignment_1_0_in_rule__Spec__Group_1__0__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__1__Impl_in_rule__Spec__Group_1__11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spec__Group_1__1__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1__0__Impl_in_rule__Module__Group_1__01125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group_1__1_in_rule__Module__Group_1__01128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PfAssignment_1_0_in_rule__Module__Group_1__0__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1__1__Impl_in_rule__Module__Group_1__11185 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Module__Group_1__2_in_rule__Module__Group_1__11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group_1__1__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1__2__Impl_in_rule__Module__Group_1__21247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__0_in_rule__Module__Group_1__2__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__0__Impl_in_rule__Module__Group_1_2__01310 = new BitSet(new long[]{0x0000000000068810L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__1_in_rule__Module__Group_1_2__01313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group_1_2__0__Impl1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__1__Impl_in_rule__Module__Group_1_2__11372 = new BitSet(new long[]{0x0000000000068810L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__2_in_rule__Module__Group_1_2__11375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__MlAssignment_1_2_1_in_rule__Module__Group_1_2__1__Impl1402 = new BitSet(new long[]{0x0000000000060812L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__2__Impl_in_rule__Module__Group_1_2__21433 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__3_in_rule__Module__Group_1_2__21436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Module__Group_1_2__2__Impl1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1_2__3__Impl_in_rule__Module__Group_1_2__31495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__SpecAssignment_1_2_3_in_rule__Module__Group_1_2__3__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__01560 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__01563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PfAssignment_2_0_in_rule__Module__Group_2__0__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__11620 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group_2__1__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__21682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ModAssignment_2_2_in_rule__Module__Group_2__2__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__01745 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__01748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__IdAssignment_3_0_in_rule__Module__Group_3__0__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__11805 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Module__Group_3__2_in_rule__Module__Group_3__11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Module__Group_3__1__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__2__Impl_in_rule__Module__Group_3__21867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ModAssignment_3_2_in_rule__Module__Group_3__2__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_0__0__Impl_in_rule__ModuleList__Group_0__01930 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_0__1_in_rule__ModuleList__Group_0__01933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_0__1__Impl_in_rule__ModuleList__Group_0__11991 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_0__2_in_rule__ModuleList__Group_0__11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModuleList__Group_0__1__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_0__2__Impl_in_rule__ModuleList__Group_0__22053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__OpenAssignment_0_2_in_rule__ModuleList__Group_0__2__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__0__Impl_in_rule__ModuleList__Group_2__02116 = new BitSet(new long[]{0x00000000000E0810L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__1_in_rule__ModuleList__Group_2__02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ModuleList__Group_2__0__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__1__Impl_in_rule__ModuleList__Group_2__12178 = new BitSet(new long[]{0x00000000000E0810L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__2_in_rule__ModuleList__Group_2__12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__ContextAssignment_2_1_in_rule__ModuleList__Group_2__1__Impl2208 = new BitSet(new long[]{0x0000000000060812L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__2__Impl_in_rule__ModuleList__Group_2__22239 = new BitSet(new long[]{0x0000000000068810L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__3_in_rule__ModuleList__Group_2__22242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ModuleList__Group_2__2__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__3__Impl_in_rule__ModuleList__Group_2__32301 = new BitSet(new long[]{0x0000000000068810L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__4_in_rule__ModuleList__Group_2__32304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleList__DefAssignment_2_3_in_rule__ModuleList__Group_2__3__Impl2331 = new BitSet(new long[]{0x0000000000060812L});
    public static final BitSet FOLLOW_rule__ModuleList__Group_2__4__Impl_in_rule__ModuleList__Group_2__42362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModuleList__Group_2__4__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_rule__Model__ModulesAssignment2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_rule__Prefix__SpecAssignment_0_22467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Spec__PathAssignment_1_02503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Module__PfAssignment_02542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Module__PfAssignment_1_02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_rule__Module__MlAssignment_1_2_12604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_rule__Module__SpecAssignment_1_2_32635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Module__PfAssignment_2_02666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Module__ModAssignment_2_22697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__IdAssignment_3_02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Module__ModAssignment_3_22759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ModuleList__OpenAssignment_0_22790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ModuleList__SingleAssignment_12821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_rule__ModuleList__ContextAssignment_2_12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_rule__ModuleList__DefAssignment_2_32883 = new BitSet(new long[]{0x0000000000000002L});

}