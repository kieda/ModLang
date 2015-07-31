/*
 * generated by Xtext
 */
package edu.cmu.cs464.p3.modlang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ModLangGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cModulesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cModulesModuleListParserRuleCall_0 = (RuleCall)cModulesAssignment.eContents().get(0);
		
		//Model:
		//	modules+=ModuleList*;
		@Override public ParserRule getRule() { return rule; }

		//modules+=ModuleList*
		public Assignment getModulesAssignment() { return cModulesAssignment; }

		//ModuleList
		public RuleCall getModulesModuleListParserRuleCall_0() { return cModulesModuleListParserRuleCall_0; }
	}

	public class PrefixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Prefix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cSpecAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cSpecSpecParserRuleCall_0_2_0 = (RuleCall)cSpecAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cSpecParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Prefix:
		//	"<" ">" spec=Spec | ID Spec;
		@Override public ParserRule getRule() { return rule; }

		//"<" ">" spec=Spec | ID Spec
		public Alternatives getAlternatives() { return cAlternatives; }

		//"<" ">" spec=Spec
		public Group getGroup_0() { return cGroup_0; }

		//"<"
		public Keyword getLessThanSignKeyword_0_0() { return cLessThanSignKeyword_0_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_0_1() { return cGreaterThanSignKeyword_0_1; }

		//spec=Spec
		public Assignment getSpecAssignment_0_2() { return cSpecAssignment_0_2; }

		//Spec
		public RuleCall getSpecSpecParserRuleCall_0_2_0() { return cSpecSpecParserRuleCall_0_2_0; }

		//ID Spec
		public Group getGroup_1() { return cGroup_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_0() { return cIDTerminalRuleCall_1_0; }

		//Spec
		public RuleCall getSpecParserRuleCall_1_1() { return cSpecParserRuleCall_1_1; }
	}

	public class SpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Spec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSpecAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cPathAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cPathFullStopKeyword_1_0_0 = (Keyword)cPathAssignment_1_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Spec:
		//	{Spec} (path+="." ID)*;
		@Override public ParserRule getRule() { return rule; }

		//{Spec} (path+="." ID)*
		public Group getGroup() { return cGroup; }

		//{Spec}
		public Action getSpecAction_0() { return cSpecAction_0; }

		//(path+="." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//path+="."
		public Assignment getPathAssignment_1_0() { return cPathAssignment_1_0; }

		//"."
		public Keyword getPathFullStopKeyword_1_0_0() { return cPathFullStopKeyword_1_0_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Module");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPfAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cPfPrefixParserRuleCall_0_0 = (RuleCall)cPfAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cPfAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cPfPrefixParserRuleCall_1_0_0 = (RuleCall)cPfAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cHasKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cMlAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cMlModuleListParserRuleCall_1_2_1_0 = (RuleCall)cMlAssignment_1_2_1.eContents().get(0);
		private final Keyword cEndKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Assignment cSpecAssignment_1_2_3 = (Assignment)cGroup_1_2.eContents().get(3);
		private final RuleCall cSpecSpecParserRuleCall_1_2_3_0 = (RuleCall)cSpecAssignment_1_2_3.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Assignment cPfAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cPfPrefixParserRuleCall_2_0_0 = (RuleCall)cPfAssignment_2_0.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cModAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cModModuleParserRuleCall_2_2_0 = (RuleCall)cModAssignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Assignment cIdAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cIdIDTerminalRuleCall_3_0_0 = (RuleCall)cIdAssignment_3_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cModAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cModModuleParserRuleCall_3_2_0 = (RuleCall)cModAssignment_3_2.eContents().get(0);
		
		//Module:
		//	pf=Prefix | pf=Prefix ":" ("has" ml+=ModuleList* "end" spec=Spec) | pf=Prefix ":" mod=Module | id=ID "=" mod=Module;
		@Override public ParserRule getRule() { return rule; }

		//pf=Prefix | pf=Prefix ":" ("has" ml+=ModuleList* "end" spec=Spec) | pf=Prefix ":" mod=Module | id=ID "=" mod=Module
		public Alternatives getAlternatives() { return cAlternatives; }

		//pf=Prefix
		public Assignment getPfAssignment_0() { return cPfAssignment_0; }

		//Prefix
		public RuleCall getPfPrefixParserRuleCall_0_0() { return cPfPrefixParserRuleCall_0_0; }

		//pf=Prefix ":" ("has" ml+=ModuleList* "end" spec=Spec)
		public Group getGroup_1() { return cGroup_1; }

		//pf=Prefix
		public Assignment getPfAssignment_1_0() { return cPfAssignment_1_0; }

		//Prefix
		public RuleCall getPfPrefixParserRuleCall_1_0_0() { return cPfPrefixParserRuleCall_1_0_0; }

		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }

		//"has" ml+=ModuleList* "end" spec=Spec
		public Group getGroup_1_2() { return cGroup_1_2; }

		//"has"
		public Keyword getHasKeyword_1_2_0() { return cHasKeyword_1_2_0; }

		//ml+=ModuleList*
		public Assignment getMlAssignment_1_2_1() { return cMlAssignment_1_2_1; }

		//ModuleList
		public RuleCall getMlModuleListParserRuleCall_1_2_1_0() { return cMlModuleListParserRuleCall_1_2_1_0; }

		//"end"
		public Keyword getEndKeyword_1_2_2() { return cEndKeyword_1_2_2; }

		//spec=Spec
		public Assignment getSpecAssignment_1_2_3() { return cSpecAssignment_1_2_3; }

		//Spec
		public RuleCall getSpecSpecParserRuleCall_1_2_3_0() { return cSpecSpecParserRuleCall_1_2_3_0; }

		//pf=Prefix ":" mod=Module
		public Group getGroup_2() { return cGroup_2; }

		//pf=Prefix
		public Assignment getPfAssignment_2_0() { return cPfAssignment_2_0; }

		//Prefix
		public RuleCall getPfPrefixParserRuleCall_2_0_0() { return cPfPrefixParserRuleCall_2_0_0; }

		//":"
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }

		//mod=Module
		public Assignment getModAssignment_2_2() { return cModAssignment_2_2; }

		//Module
		public RuleCall getModModuleParserRuleCall_2_2_0() { return cModModuleParserRuleCall_2_2_0; }

		//id=ID "=" mod=Module
		public Group getGroup_3() { return cGroup_3; }

		//id=ID
		public Assignment getIdAssignment_3_0() { return cIdAssignment_3_0; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_3_0_0() { return cIdIDTerminalRuleCall_3_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_3_1() { return cEqualsSignKeyword_3_1; }

		//mod=Module
		public Assignment getModAssignment_3_2() { return cModAssignment_3_2; }

		//Module
		public RuleCall getModModuleParserRuleCall_3_2_0() { return cModModuleParserRuleCall_3_2_0; }
	}

	public class ModuleListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModuleList");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cModuleListAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cOpenKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cOpenAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cOpenModuleParserRuleCall_0_2_0 = (RuleCall)cOpenAssignment_0_2.eContents().get(0);
		private final Assignment cSingleAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSingleModuleParserRuleCall_1_0 = (RuleCall)cSingleAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cImportKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cContextAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cContextModuleListParserRuleCall_2_1_0 = (RuleCall)cContextAssignment_2_1.eContents().get(0);
		private final Keyword cInKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cDefAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cDefModuleListParserRuleCall_2_3_0 = (RuleCall)cDefAssignment_2_3.eContents().get(0);
		private final Keyword cEndKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		
		//ModuleList:
		//	{ModuleList} "open" open=Module | single=Module | "import" context+=ModuleList* "in" def+=ModuleList* "end";
		@Override public ParserRule getRule() { return rule; }

		//{ModuleList} "open" open=Module | single=Module | "import" context+=ModuleList* "in" def+=ModuleList* "end"
		public Alternatives getAlternatives() { return cAlternatives; }

		//{ModuleList} "open" open=Module
		public Group getGroup_0() { return cGroup_0; }

		//{ModuleList}
		public Action getModuleListAction_0_0() { return cModuleListAction_0_0; }

		//"open"
		public Keyword getOpenKeyword_0_1() { return cOpenKeyword_0_1; }

		//open=Module
		public Assignment getOpenAssignment_0_2() { return cOpenAssignment_0_2; }

		//Module
		public RuleCall getOpenModuleParserRuleCall_0_2_0() { return cOpenModuleParserRuleCall_0_2_0; }

		//single=Module
		public Assignment getSingleAssignment_1() { return cSingleAssignment_1; }

		//Module
		public RuleCall getSingleModuleParserRuleCall_1_0() { return cSingleModuleParserRuleCall_1_0; }

		//"import" context+=ModuleList* "in" def+=ModuleList* "end"
		public Group getGroup_2() { return cGroup_2; }

		//"import"
		public Keyword getImportKeyword_2_0() { return cImportKeyword_2_0; }

		//context+=ModuleList*
		public Assignment getContextAssignment_2_1() { return cContextAssignment_2_1; }

		//ModuleList
		public RuleCall getContextModuleListParserRuleCall_2_1_0() { return cContextModuleListParserRuleCall_2_1_0; }

		//"in"
		public Keyword getInKeyword_2_2() { return cInKeyword_2_2; }

		//def+=ModuleList*
		public Assignment getDefAssignment_2_3() { return cDefAssignment_2_3; }

		//ModuleList
		public RuleCall getDefModuleListParserRuleCall_2_3_0() { return cDefModuleListParserRuleCall_2_3_0; }

		//"end"
		public Keyword getEndKeyword_2_4() { return cEndKeyword_2_4; }
	}
	
	
	private final ModelElements pModel;
	private final PrefixElements pPrefix;
	private final SpecElements pSpec;
	private final ModuleElements pModule;
	private final ModuleListElements pModuleList;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ModLangGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPrefix = new PrefixElements();
		this.pSpec = new SpecElements();
		this.pModule = new ModuleElements();
		this.pModuleList = new ModuleListElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("edu.cmu.cs464.p3.modlang.ModLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	modules+=ModuleList*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Prefix:
	//	"<" ">" spec=Spec | ID Spec;
	public PrefixElements getPrefixAccess() {
		return pPrefix;
	}
	
	public ParserRule getPrefixRule() {
		return getPrefixAccess().getRule();
	}

	//Spec:
	//	{Spec} (path+="." ID)*;
	public SpecElements getSpecAccess() {
		return pSpec;
	}
	
	public ParserRule getSpecRule() {
		return getSpecAccess().getRule();
	}

	//Module:
	//	pf=Prefix | pf=Prefix ":" ("has" ml+=ModuleList* "end" spec=Spec) | pf=Prefix ":" mod=Module | id=ID "=" mod=Module;
	public ModuleElements getModuleAccess() {
		return pModule;
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}

	//ModuleList:
	//	{ModuleList} "open" open=Module | single=Module | "import" context+=ModuleList* "in" def+=ModuleList* "end";
	public ModuleListElements getModuleListAccess() {
		return pModuleList;
	}
	
	public ParserRule getModuleListRule() {
		return getModuleListAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}