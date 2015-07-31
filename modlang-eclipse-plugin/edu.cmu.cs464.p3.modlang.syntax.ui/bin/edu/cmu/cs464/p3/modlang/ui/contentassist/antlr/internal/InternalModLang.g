/*
 * generated by Xtext
 */
grammar InternalModLang;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package edu.cmu.cs464.p3.modlang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getModulesAssignment()); }
(rule__Model__ModulesAssignment)*
{ after(grammarAccess.getModelAccess().getModulesAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePrefix
entryRulePrefix 
:
{ before(grammarAccess.getPrefixRule()); }
	 rulePrefix
{ after(grammarAccess.getPrefixRule()); } 
	 EOF 
;

// Rule Prefix
rulePrefix
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPrefixAccess().getAlternatives()); }
(rule__Prefix__Alternatives)
{ after(grammarAccess.getPrefixAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSpec
entryRuleSpec 
:
{ before(grammarAccess.getSpecRule()); }
	 ruleSpec
{ after(grammarAccess.getSpecRule()); } 
	 EOF 
;

// Rule Spec
ruleSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSpecAccess().getGroup()); }
(rule__Spec__Group__0)
{ after(grammarAccess.getSpecAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModule
entryRuleModule 
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;

// Rule Module
ruleModule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleAccess().getAlternatives()); }
(rule__Module__Alternatives)
{ after(grammarAccess.getModuleAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModuleList
entryRuleModuleList 
:
{ before(grammarAccess.getModuleListRule()); }
	 ruleModuleList
{ after(grammarAccess.getModuleListRule()); } 
	 EOF 
;

// Rule ModuleList
ruleModuleList
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleListAccess().getAlternatives()); }
(rule__ModuleList__Alternatives)
{ after(grammarAccess.getModuleListAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Prefix__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getGroup_0()); }
(rule__Prefix__Group_0__0)
{ after(grammarAccess.getPrefixAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getPrefixAccess().getGroup_1()); }
(rule__Prefix__Group_1__0)
{ after(grammarAccess.getPrefixAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPfAssignment_0()); }
(rule__Module__PfAssignment_0)
{ after(grammarAccess.getModuleAccess().getPfAssignment_0()); }
)

    |(
{ before(grammarAccess.getModuleAccess().getGroup_1()); }
(rule__Module__Group_1__0)
{ after(grammarAccess.getModuleAccess().getGroup_1()); }
)

    |(
{ before(grammarAccess.getModuleAccess().getGroup_2()); }
(rule__Module__Group_2__0)
{ after(grammarAccess.getModuleAccess().getGroup_2()); }
)

    |(
{ before(grammarAccess.getModuleAccess().getGroup_3()); }
(rule__Module__Group_3__0)
{ after(grammarAccess.getModuleAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getGroup_0()); }
(rule__ModuleList__Group_0__0)
{ after(grammarAccess.getModuleListAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getModuleListAccess().getSingleAssignment_1()); }
(rule__ModuleList__SingleAssignment_1)
{ after(grammarAccess.getModuleListAccess().getSingleAssignment_1()); }
)

    |(
{ before(grammarAccess.getModuleListAccess().getGroup_2()); }
(rule__ModuleList__Group_2__0)
{ after(grammarAccess.getModuleListAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Prefix__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Prefix__Group_0__0__Impl
	rule__Prefix__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Prefix__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getLessThanSignKeyword_0_0()); }

	'<' 

{ after(grammarAccess.getPrefixAccess().getLessThanSignKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Prefix__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Prefix__Group_0__1__Impl
	rule__Prefix__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Prefix__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getGreaterThanSignKeyword_0_1()); }

	'>' 

{ after(grammarAccess.getPrefixAccess().getGreaterThanSignKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Prefix__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Prefix__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Prefix__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getSpecAssignment_0_2()); }
(rule__Prefix__SpecAssignment_0_2)
{ after(grammarAccess.getPrefixAccess().getSpecAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Prefix__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Prefix__Group_1__0__Impl
	rule__Prefix__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Prefix__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getIDTerminalRuleCall_1_0()); }
	RULE_ID
{ after(grammarAccess.getPrefixAccess().getIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Prefix__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Prefix__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Prefix__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getSpecParserRuleCall_1_1()); }
	ruleSpec
{ after(grammarAccess.getPrefixAccess().getSpecParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Spec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group__0__Impl
	rule__Spec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getSpecAction_0()); }
(

)
{ after(grammarAccess.getSpecAccess().getSpecAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getGroup_1()); }
(rule__Spec__Group_1__0)*
{ after(grammarAccess.getSpecAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Spec__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group_1__0__Impl
	rule__Spec__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getPathAssignment_1_0()); }
(rule__Spec__PathAssignment_1_0)
{ after(grammarAccess.getSpecAccess().getPathAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Module__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1__0__Impl
	rule__Module__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPfAssignment_1_0()); }
(rule__Module__PfAssignment_1_0)
{ after(grammarAccess.getModuleAccess().getPfAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1__1__Impl
	rule__Module__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getColonKeyword_1_1()); }

	':' 

{ after(grammarAccess.getModuleAccess().getColonKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_1_2()); }
(rule__Module__Group_1_2__0)
{ after(grammarAccess.getModuleAccess().getGroup_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Module__Group_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1_2__0__Impl
	rule__Module__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getHasKeyword_1_2_0()); }

	'has' 

{ after(grammarAccess.getModuleAccess().getHasKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1_2__1__Impl
	rule__Module__Group_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getMlAssignment_1_2_1()); }
(rule__Module__MlAssignment_1_2_1)*
{ after(grammarAccess.getModuleAccess().getMlAssignment_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_1_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1_2__2__Impl
	rule__Module__Group_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getEndKeyword_1_2_2()); }

	'end' 

{ after(grammarAccess.getModuleAccess().getEndKeyword_1_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_1_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_1_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getSpecAssignment_1_2_3()); }
(rule__Module__SpecAssignment_1_2_3)
{ after(grammarAccess.getModuleAccess().getSpecAssignment_1_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Module__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__0__Impl
	rule__Module__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPfAssignment_2_0()); }
(rule__Module__PfAssignment_2_0)
{ after(grammarAccess.getModuleAccess().getPfAssignment_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__1__Impl
	rule__Module__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getColonKeyword_2_1()); }

	':' 

{ after(grammarAccess.getModuleAccess().getColonKeyword_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModAssignment_2_2()); }
(rule__Module__ModAssignment_2_2)
{ after(grammarAccess.getModuleAccess().getModAssignment_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Module__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_3__0__Impl
	rule__Module__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getIdAssignment_3_0()); }
(rule__Module__IdAssignment_3_0)
{ after(grammarAccess.getModuleAccess().getIdAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_3__1__Impl
	rule__Module__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getEqualsSignKeyword_3_1()); }

	'=' 

{ after(grammarAccess.getModuleAccess().getEqualsSignKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModAssignment_3_2()); }
(rule__Module__ModAssignment_3_2)
{ after(grammarAccess.getModuleAccess().getModAssignment_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ModuleList__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_0__0__Impl
	rule__ModuleList__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getModuleListAction_0_0()); }
(

)
{ after(grammarAccess.getModuleListAccess().getModuleListAction_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleList__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_0__1__Impl
	rule__ModuleList__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getOpenKeyword_0_1()); }

	'open' 

{ after(grammarAccess.getModuleListAccess().getOpenKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleList__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getOpenAssignment_0_2()); }
(rule__ModuleList__OpenAssignment_0_2)
{ after(grammarAccess.getModuleListAccess().getOpenAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ModuleList__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_2__0__Impl
	rule__ModuleList__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getImportKeyword_2_0()); }

	'import' 

{ after(grammarAccess.getModuleListAccess().getImportKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleList__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_2__1__Impl
	rule__ModuleList__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getContextAssignment_2_1()); }
(rule__ModuleList__ContextAssignment_2_1)*
{ after(grammarAccess.getModuleListAccess().getContextAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleList__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_2__2__Impl
	rule__ModuleList__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getInKeyword_2_2()); }

	'in' 

{ after(grammarAccess.getModuleListAccess().getInKeyword_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleList__Group_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_2__3__Impl
	rule__ModuleList__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getDefAssignment_2_3()); }
(rule__ModuleList__DefAssignment_2_3)*
{ after(grammarAccess.getModuleListAccess().getDefAssignment_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleList__Group_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleList__Group_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__Group_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getEndKeyword_2_4()); }

	'end' 

{ after(grammarAccess.getModuleListAccess().getEndKeyword_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}













rule__Model__ModulesAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getModulesModuleListParserRuleCall_0()); }
	ruleModuleList{ after(grammarAccess.getModelAccess().getModulesModuleListParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Prefix__SpecAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0()); }
	ruleSpec{ after(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__PathAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); }
(
{ before(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); }

	'.' 

{ after(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); }
)

{ after(grammarAccess.getSpecAccess().getPathFullStopKeyword_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PfAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_0_0()); }
	rulePrefix{ after(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PfAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_1_0_0()); }
	rulePrefix{ after(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__MlAssignment_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getMlModuleListParserRuleCall_1_2_1_0()); }
	ruleModuleList{ after(grammarAccess.getModuleAccess().getMlModuleListParserRuleCall_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__SpecAssignment_1_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getSpecSpecParserRuleCall_1_2_3_0()); }
	ruleSpec{ after(grammarAccess.getModuleAccess().getSpecSpecParserRuleCall_1_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PfAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_2_0_0()); }
	rulePrefix{ after(grammarAccess.getModuleAccess().getPfPrefixParserRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ModAssignment_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModModuleParserRuleCall_2_2_0()); }
	ruleModule{ after(grammarAccess.getModuleAccess().getModModuleParserRuleCall_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__IdAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getIdIDTerminalRuleCall_3_0_0()); }
	RULE_ID{ after(grammarAccess.getModuleAccess().getIdIDTerminalRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ModAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModModuleParserRuleCall_3_2_0()); }
	ruleModule{ after(grammarAccess.getModuleAccess().getModModuleParserRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__OpenAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getOpenModuleParserRuleCall_0_2_0()); }
	ruleModule{ after(grammarAccess.getModuleListAccess().getOpenModuleParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__SingleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getSingleModuleParserRuleCall_1_0()); }
	ruleModule{ after(grammarAccess.getModuleListAccess().getSingleModuleParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__ContextAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getContextModuleListParserRuleCall_2_1_0()); }
	ruleModuleList{ after(grammarAccess.getModuleListAccess().getContextModuleListParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleList__DefAssignment_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleListAccess().getDefModuleListParserRuleCall_2_3_0()); }
	ruleModuleList{ after(grammarAccess.getModuleListAccess().getDefModuleListParserRuleCall_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


