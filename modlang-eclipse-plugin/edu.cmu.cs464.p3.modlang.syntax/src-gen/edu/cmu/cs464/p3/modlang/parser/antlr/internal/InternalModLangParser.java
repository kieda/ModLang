package edu.cmu.cs464.p3.modlang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.cmu.cs464.p3.modlang.services.ModLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'.'", "':'", "'has'", "'end'", "'='", "'open'", "'import'", "'in'"
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
    public String getGrammarFileName() { return "../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g"; }



     	private ModLangGrammarAccess grammarAccess;
     	
        public InternalModLangParser(TokenStream input, ModLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ModLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:76:1: ruleModel returns [EObject current=null] : ( (lv_modules_0_0= ruleModuleList ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_0_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:79:28: ( ( (lv_modules_0_0= ruleModuleList ) )* )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:80:1: ( (lv_modules_0_0= ruleModuleList ) )*
            {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:80:1: ( (lv_modules_0_0= ruleModuleList ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:81:1: (lv_modules_0_0= ruleModuleList )
            	    {
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:81:1: (lv_modules_0_0= ruleModuleList )
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:82:3: lv_modules_0_0= ruleModuleList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getModulesModuleListParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModuleList_in_ruleModel130);
            	    lv_modules_0_0=ruleModuleList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modules",
            	            		lv_modules_0_0, 
            	            		"ModuleList");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRulePrefix"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:106:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:107:2: (iv_rulePrefix= rulePrefix EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:108:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix166);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix176); 

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:115:1: rulePrefix returns [EObject current=null] : ( (otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) ) ) | (this_ID_3= RULE_ID this_Spec_4= ruleSpec ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_ID_3=null;
        EObject lv_spec_2_0 = null;

        EObject this_Spec_4 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:118:28: ( ( (otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) ) ) | (this_ID_3= RULE_ID this_Spec_4= ruleSpec ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:119:1: ( (otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) ) ) | (this_ID_3= RULE_ID this_Spec_4= ruleSpec ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:119:1: ( (otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) ) ) | (this_ID_3= RULE_ID this_Spec_4= ruleSpec ) )
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
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:119:2: (otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:119:2: (otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:119:4: otherlv_0= '<' otherlv_1= '>' ( (lv_spec_2_0= ruleSpec ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePrefix214); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getLessThanSignKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePrefix226); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getGreaterThanSignKeyword_0_1());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:127:1: ( (lv_spec_2_0= ruleSpec ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:128:1: (lv_spec_2_0= ruleSpec )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:128:1: (lv_spec_2_0= ruleSpec )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:129:3: lv_spec_2_0= ruleSpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSpec_in_rulePrefix247);
                    lv_spec_2_0=ruleSpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrefixRule());
                    	        }
                           		set(
                           			current, 
                           			"spec",
                            		lv_spec_2_0, 
                            		"Spec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:146:6: (this_ID_3= RULE_ID this_Spec_4= ruleSpec )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:146:6: (this_ID_3= RULE_ID this_Spec_4= ruleSpec )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:146:7: this_ID_3= RULE_ID this_Spec_4= ruleSpec
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrefix266); 
                     
                        newLeafNode(this_ID_3, grammarAccess.getPrefixAccess().getIDTerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getPrefixAccess().getSpecParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSpec_in_rulePrefix287);
                    this_Spec_4=ruleSpec();

                    state._fsp--;

                     
                            current = this_Spec_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleSpec"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:167:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:168:2: (iv_ruleSpec= ruleSpec EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:169:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec323);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec333); 

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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:176:1: ruleSpec returns [EObject current=null] : ( () ( ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID )* ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token lv_path_1_0=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:179:28: ( ( () ( ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:180:1: ( () ( ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:180:1: ( () ( ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID )* )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:180:2: () ( ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID )*
            {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:180:2: ()
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:181:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSpecAccess().getSpecAction_0(),
                        current);
                

            }

            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:186:2: ( ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:186:3: ( (lv_path_1_0= '.' ) ) this_ID_2= RULE_ID
            	    {
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:186:3: ( (lv_path_1_0= '.' ) )
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:187:1: (lv_path_1_0= '.' )
            	    {
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:187:1: (lv_path_1_0= '.' )
            	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:188:3: lv_path_1_0= '.'
            	    {
            	    lv_path_1_0=(Token)match(input,13,FOLLOW_13_in_ruleSpec386); 

            	            newLeafNode(lv_path_1_0, grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSpecRule());
            	    	        }
            	           		addWithLastConsumed(current, "path", lv_path_1_0, ".");
            	    	    

            	    }


            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpec410); 
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleModule"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:213:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:214:2: (iv_ruleModule= ruleModule EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:215:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule447);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule457); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:222:1: ruleModule returns [EObject current=null] : ( ( (lv_pf_0_0= rulePrefix ) ) | ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) ) | ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) ) | ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        EObject lv_pf_0_0 = null;

        EObject lv_pf_1_0 = null;

        EObject lv_ml_4_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_pf_7_0 = null;

        EObject lv_mod_9_0 = null;

        EObject lv_mod_12_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:225:28: ( ( ( (lv_pf_0_0= rulePrefix ) ) | ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) ) | ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) ) | ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:226:1: ( ( (lv_pf_0_0= rulePrefix ) ) | ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) ) | ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) ) | ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:226:1: ( ( (lv_pf_0_0= rulePrefix ) ) | ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) ) | ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) ) | ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:226:2: ( (lv_pf_0_0= rulePrefix ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:226:2: ( (lv_pf_0_0= rulePrefix ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:227:1: (lv_pf_0_0= rulePrefix )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:227:1: (lv_pf_0_0= rulePrefix )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:228:3: lv_pf_0_0= rulePrefix
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrefix_in_ruleModule503);
                    lv_pf_0_0=rulePrefix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"pf",
                            		lv_pf_0_0, 
                            		"Prefix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:245:6: ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:245:6: ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:245:7: ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:245:7: ( (lv_pf_1_0= rulePrefix ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:246:1: (lv_pf_1_0= rulePrefix )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:246:1: (lv_pf_1_0= rulePrefix )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:247:3: lv_pf_1_0= rulePrefix
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrefix_in_ruleModule531);
                    lv_pf_1_0=rulePrefix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"pf",
                            		lv_pf_1_0, 
                            		"Prefix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModule543); 

                        	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getColonKeyword_1_1());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:267:1: (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:267:3: otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModule556); 

                        	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getHasKeyword_1_2_0());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:271:1: ( (lv_ml_4_0= ruleModuleList ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==11||(LA4_0>=18 && LA4_0<=19)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:272:1: (lv_ml_4_0= ruleModuleList )
                    	    {
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:272:1: (lv_ml_4_0= ruleModuleList )
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:273:3: lv_ml_4_0= ruleModuleList
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getMlModuleListParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleList_in_ruleModule577);
                    	    lv_ml_4_0=ruleModuleList();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ml",
                    	            		lv_ml_4_0, 
                    	            		"ModuleList");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleModule590); 

                        	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getEndKeyword_1_2_2());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:293:1: ( (lv_spec_6_0= ruleSpec ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:294:1: (lv_spec_6_0= ruleSpec )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:294:1: (lv_spec_6_0= ruleSpec )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:295:3: lv_spec_6_0= ruleSpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getSpecSpecParserRuleCall_1_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSpec_in_ruleModule611);
                    lv_spec_6_0=ruleSpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"spec",
                            		lv_spec_6_0, 
                            		"Spec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:312:6: ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:312:6: ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:312:7: ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:312:7: ( (lv_pf_7_0= rulePrefix ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:313:1: (lv_pf_7_0= rulePrefix )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:313:1: (lv_pf_7_0= rulePrefix )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:314:3: lv_pf_7_0= rulePrefix
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrefix_in_ruleModule641);
                    lv_pf_7_0=rulePrefix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"pf",
                            		lv_pf_7_0, 
                            		"Prefix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleModule653); 

                        	newLeafNode(otherlv_8, grammarAccess.getModuleAccess().getColonKeyword_2_1());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:334:1: ( (lv_mod_9_0= ruleModule ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:335:1: (lv_mod_9_0= ruleModule )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:335:1: (lv_mod_9_0= ruleModule )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:336:3: lv_mod_9_0= ruleModule
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getModModuleParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModule_in_ruleModule674);
                    lv_mod_9_0=ruleModule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"mod",
                            		lv_mod_9_0, 
                            		"Module");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:353:6: ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:353:6: ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:353:7: ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:353:7: ( (lv_id_10_0= RULE_ID ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:354:1: (lv_id_10_0= RULE_ID )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:354:1: (lv_id_10_0= RULE_ID )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:355:3: lv_id_10_0= RULE_ID
                    {
                    lv_id_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule699); 

                    			newLeafNode(lv_id_10_0, grammarAccess.getModuleAccess().getIdIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleModule716); 

                        	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getEqualsSignKeyword_3_1());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:375:1: ( (lv_mod_12_0= ruleModule ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:376:1: (lv_mod_12_0= ruleModule )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:376:1: (lv_mod_12_0= ruleModule )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:377:3: lv_mod_12_0= ruleModule
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getModModuleParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModule_in_ruleModule737);
                    lv_mod_12_0=ruleModule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"mod",
                            		lv_mod_12_0, 
                            		"Module");
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleList"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:401:1: entryRuleModuleList returns [EObject current=null] : iv_ruleModuleList= ruleModuleList EOF ;
    public final EObject entryRuleModuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleList = null;


        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:402:2: (iv_ruleModuleList= ruleModuleList EOF )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:403:2: iv_ruleModuleList= ruleModuleList EOF
            {
             newCompositeNode(grammarAccess.getModuleListRule()); 
            pushFollow(FOLLOW_ruleModuleList_in_entryRuleModuleList774);
            iv_ruleModuleList=ruleModuleList();

            state._fsp--;

             current =iv_ruleModuleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleList784); 

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
    // $ANTLR end "entryRuleModuleList"


    // $ANTLR start "ruleModuleList"
    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:410:1: ruleModuleList returns [EObject current=null] : ( ( () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) ) ) | ( (lv_single_3_0= ruleModule ) ) | (otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end' ) ) ;
    public final EObject ruleModuleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_open_2_0 = null;

        EObject lv_single_3_0 = null;

        EObject lv_context_5_0 = null;

        EObject lv_def_7_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:413:28: ( ( ( () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) ) ) | ( (lv_single_3_0= ruleModule ) ) | (otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end' ) ) )
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:414:1: ( ( () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) ) ) | ( (lv_single_3_0= ruleModule ) ) | (otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end' ) )
            {
            // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:414:1: ( ( () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) ) ) | ( (lv_single_3_0= ruleModule ) ) | (otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
            case 11:
                {
                alt8=2;
                }
                break;
            case 19:
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
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:414:2: ( () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:414:2: ( () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:414:3: () otherlv_1= 'open' ( (lv_open_2_0= ruleModule ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:414:3: ()
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:415:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getModuleListAccess().getModuleListAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleModuleList831); 

                        	newLeafNode(otherlv_1, grammarAccess.getModuleListAccess().getOpenKeyword_0_1());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:424:1: ( (lv_open_2_0= ruleModule ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:425:1: (lv_open_2_0= ruleModule )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:425:1: (lv_open_2_0= ruleModule )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:426:3: lv_open_2_0= ruleModule
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleListAccess().getOpenModuleParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModule_in_ruleModuleList852);
                    lv_open_2_0=ruleModule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleListRule());
                    	        }
                           		set(
                           			current, 
                           			"open",
                            		lv_open_2_0, 
                            		"Module");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:443:6: ( (lv_single_3_0= ruleModule ) )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:443:6: ( (lv_single_3_0= ruleModule ) )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:444:1: (lv_single_3_0= ruleModule )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:444:1: (lv_single_3_0= ruleModule )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:445:3: lv_single_3_0= ruleModule
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleListAccess().getSingleModuleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModule_in_ruleModuleList880);
                    lv_single_3_0=ruleModule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleListRule());
                    	        }
                           		set(
                           			current, 
                           			"single",
                            		lv_single_3_0, 
                            		"Module");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:462:6: (otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end' )
                    {
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:462:6: (otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end' )
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:462:8: otherlv_4= 'import' ( (lv_context_5_0= ruleModuleList ) )* otherlv_6= 'in' ( (lv_def_7_0= ruleModuleList ) )* otherlv_8= 'end'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleModuleList899); 

                        	newLeafNode(otherlv_4, grammarAccess.getModuleListAccess().getImportKeyword_2_0());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:466:1: ( (lv_context_5_0= ruleModuleList ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==11||(LA6_0>=18 && LA6_0<=19)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:467:1: (lv_context_5_0= ruleModuleList )
                    	    {
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:467:1: (lv_context_5_0= ruleModuleList )
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:468:3: lv_context_5_0= ruleModuleList
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleListAccess().getContextModuleListParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleList_in_ruleModuleList920);
                    	    lv_context_5_0=ruleModuleList();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"context",
                    	            		lv_context_5_0, 
                    	            		"ModuleList");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleModuleList933); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuleListAccess().getInKeyword_2_2());
                        
                    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:488:1: ( (lv_def_7_0= ruleModuleList ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==11||(LA7_0>=18 && LA7_0<=19)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:489:1: (lv_def_7_0= ruleModuleList )
                    	    {
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:489:1: (lv_def_7_0= ruleModuleList )
                    	    // ../edu.cmu.cs464.p3.modlang.syntax/src-gen/edu/cmu/cs464/p3/modlang/parser/antlr/internal/InternalModLang.g:490:3: lv_def_7_0= ruleModuleList
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleListAccess().getDefModuleListParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleList_in_ruleModuleList954);
                    	    lv_def_7_0=ruleModuleList();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"def",
                    	            		lv_def_7_0, 
                    	            		"ModuleList");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleModuleList967); 

                        	newLeafNode(otherlv_8, grammarAccess.getModuleListAccess().getEndKeyword_2_4());
                        

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
    // $ANTLR end "ruleModuleList"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\2\uffff\2\5\5\uffff\1\5\2\uffff\1\5";
    static final String DFA5_minS =
        "\1\4\1\14\3\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\4";
    static final String DFA5_maxS =
        "\1\13\1\14\2\24\1\4\1\uffff\1\17\1\uffff\1\4\1\24\2\uffff\1\24";
    static final String DFA5_acceptS =
        "\5\uffff\1\1\1\uffff\1\4\2\uffff\1\2\1\3\1\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\6\uffff\1\1",
            "\1\3",
            "\1\5\6\uffff\1\5\1\uffff\1\4\1\6\1\uffff\1\5\1\7\3\5",
            "\1\5\6\uffff\1\5\1\uffff\1\10\1\6\1\uffff\1\5\1\uffff\3\5",
            "\1\11",
            "",
            "\1\13\6\uffff\1\13\3\uffff\1\12",
            "",
            "\1\14",
            "\1\5\6\uffff\1\5\1\uffff\1\4\1\6\1\uffff\1\5\1\uffff\3\5",
            "",
            "",
            "\1\5\6\uffff\1\5\1\uffff\1\10\1\6\1\uffff\1\5\1\uffff\3\5"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "226:1: ( ( (lv_pf_0_0= rulePrefix ) ) | ( ( (lv_pf_1_0= rulePrefix ) ) otherlv_2= ':' (otherlv_3= 'has' ( (lv_ml_4_0= ruleModuleList ) )* otherlv_5= 'end' ( (lv_spec_6_0= ruleSpec ) ) ) ) | ( ( (lv_pf_7_0= rulePrefix ) ) otherlv_8= ':' ( (lv_mod_9_0= ruleModule ) ) ) | ( ( (lv_id_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_mod_12_0= ruleModule ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_ruleModel130 = new BitSet(new long[]{0x00000000000C0812L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePrefix214 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrefix226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSpec_in_rulePrefix247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrefix266 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSpec_in_rulePrefix287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSpec386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpec410 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModule503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModule531 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModule543 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule556 = new BitSet(new long[]{0x00000000000D0810L});
    public static final BitSet FOLLOW_ruleModuleList_in_ruleModule577 = new BitSet(new long[]{0x00000000000D0810L});
    public static final BitSet FOLLOW_16_in_ruleModule590 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleModule611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModule641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModule653 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModule674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule699 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModule716 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModule737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleList_in_entryRuleModuleList774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleList784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModuleList831 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModuleList852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModuleList880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModuleList899 = new BitSet(new long[]{0x00000000001C0810L});
    public static final BitSet FOLLOW_ruleModuleList_in_ruleModuleList920 = new BitSet(new long[]{0x00000000001C0810L});
    public static final BitSet FOLLOW_20_in_ruleModuleList933 = new BitSet(new long[]{0x00000000000D0810L});
    public static final BitSet FOLLOW_ruleModuleList_in_ruleModuleList954 = new BitSet(new long[]{0x00000000000D0810L});
    public static final BitSet FOLLOW_16_in_ruleModuleList967 = new BitSet(new long[]{0x0000000000000002L});

}