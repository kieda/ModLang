/*
 * generated by Xtext
 */
grammar InternalModLang;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package edu.cmu.cs464.p3.modlang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getModulesModuleListParserRuleCall_0()); 
	    }
		lv_modules_0_0=ruleModuleList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"modules",
        		lv_modules_0_0, 
        		"ModuleList");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRulePrefix
entryRulePrefix returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrefixRule()); }
	 iv_rulePrefix=rulePrefix 
	 { $current=$iv_rulePrefix.current; } 
	 EOF 
;

// Rule Prefix
rulePrefix returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='<' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getLessThanSignKeyword_0_0());
    }
	otherlv_1='>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getGreaterThanSignKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0()); 
	    }
		lv_spec_2_0=ruleSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrefixRule());
	        }
       		set(
       			$current, 
       			"spec",
        		lv_spec_2_0, 
        		"Spec");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(this_ID_3=RULE_ID
    { 
    newLeafNode(this_ID_3, grammarAccess.getPrefixAccess().getIDTerminalRuleCall_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getPrefixAccess().getSpecParserRuleCall_1_1()); 
    }
    this_Spec_4=ruleSpec
    { 
        $current = $this_Spec_4.current; 
        afterParserOrEnumRuleCall();
    }
))
;





// Entry rule entryRuleSpec
entryRuleSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSpecRule()); }
	 iv_ruleSpec=ruleSpec 
	 { $current=$iv_ruleSpec.current; } 
	 EOF 
;

// Rule Spec
ruleSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSpecAccess().getSpecAction_0(),
            $current);
    }
)((
(
		lv_path_1_0=	'.' 
    {
        newLeafNode(lv_path_1_0, grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSpecRule());
	        }
       		addWithLastConsumed($current, "path", lv_path_1_0, ".");
	    }

)
)this_ID_2=RULE_ID
    { 
    newLeafNode(this_ID_2, grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
;





// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_0_0()); 
	    }
		lv_pf_0_0=rulePrefix		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"pf",
        		lv_pf_0_0, 
        		"Prefix");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_1_0_0()); 
	    }
		lv_pf_1_0=rulePrefix		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"pf",
        		lv_pf_1_0, 
        		"Prefix");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getColonKeyword_1_1());
    }
(	otherlv_3='has' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getHasKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getMlModuleListParserRuleCall_1_2_1_0()); 
	    }
		lv_ml_4_0=ruleModuleList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"ml",
        		lv_ml_4_0, 
        		"ModuleList");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='end' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getEndKeyword_1_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getSpecSpecParserRuleCall_1_2_3_0()); 
	    }
		lv_spec_6_0=ruleSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"spec",
        		lv_spec_6_0, 
        		"Spec");
	        afterParserOrEnumRuleCall();
	    }

)
)))
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_2_0_0()); 
	    }
		lv_pf_7_0=rulePrefix		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"pf",
        		lv_pf_7_0, 
        		"Prefix");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=':' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getModuleAccess().getColonKeyword_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getModModuleParserRuleCall_2_2_0()); 
	    }
		lv_mod_9_0=ruleModule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"mod",
        		lv_mod_9_0, 
        		"Module");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
(
		lv_id_10_0=RULE_ID
		{
			newLeafNode(lv_id_10_0, grammarAccess.getModuleAccess().getIdIDTerminalRuleCall_3_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_10_0, 
        		"ID");
	    }

)
)	otherlv_11='=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getEqualsSignKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getModModuleParserRuleCall_3_2_0()); 
	    }
		lv_mod_12_0=ruleModule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"mod",
        		lv_mod_12_0, 
        		"Module");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleModuleList
entryRuleModuleList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleListRule()); }
	 iv_ruleModuleList=ruleModuleList 
	 { $current=$iv_ruleModuleList.current; } 
	 EOF 
;

// Rule ModuleList
ruleModuleList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModuleListAccess().getModuleListAction_0_0(),
            $current);
    }
)	otherlv_1='open' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModuleListAccess().getOpenKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleListAccess().getOpenModuleParserRuleCall_0_2_0()); 
	    }
		lv_open_2_0=ruleModule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleListRule());
	        }
       		set(
       			$current, 
       			"open",
        		lv_open_2_0, 
        		"Module");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleListAccess().getSingleModuleParserRuleCall_1_0()); 
	    }
		lv_single_3_0=ruleModule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleListRule());
	        }
       		set(
       			$current, 
       			"single",
        		lv_single_3_0, 
        		"Module");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_4='import' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModuleListAccess().getImportKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleListAccess().getContextModuleListParserRuleCall_2_1_0()); 
	    }
		lv_context_5_0=ruleModuleList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleListRule());
	        }
       		add(
       			$current, 
       			"context",
        		lv_context_5_0, 
        		"ModuleList");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='in' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModuleListAccess().getInKeyword_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleListAccess().getDefModuleListParserRuleCall_2_3_0()); 
	    }
		lv_def_7_0=ruleModuleList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleListRule());
	        }
       		add(
       			$current, 
       			"def",
        		lv_def_7_0, 
        		"ModuleList");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='end' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getModuleListAccess().getEndKeyword_2_4());
    }
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


