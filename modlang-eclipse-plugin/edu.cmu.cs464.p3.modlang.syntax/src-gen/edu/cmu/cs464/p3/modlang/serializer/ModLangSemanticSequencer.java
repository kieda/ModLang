/*
 * generated by Xtext
 */
package edu.cmu.cs464.p3.modlang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.cs464.p3.modlang.modLang.ModLangPackage;
import edu.cmu.cs464.p3.modlang.modLang.Model;
import edu.cmu.cs464.p3.modlang.modLang.Module;
import edu.cmu.cs464.p3.modlang.modLang.ModuleList;
import edu.cmu.cs464.p3.modlang.modLang.Prefix;
import edu.cmu.cs464.p3.modlang.modLang.Spec;
import edu.cmu.cs464.p3.modlang.services.ModLangGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ModLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ModLangGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModLangPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ModLangPackage.MODULE:
				sequence_Module(context, (Module) semanticObject); 
				return; 
			case ModLangPackage.MODULE_LIST:
				sequence_ModuleList(context, (ModuleList) semanticObject); 
				return; 
			case ModLangPackage.PREFIX:
				sequence_Prefix(context, (Prefix) semanticObject); 
				return; 
			case ModLangPackage.SPEC:
				sequence_Spec(context, (Spec) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     modules+=ModuleList*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     open=Module
	 */
	protected void sequence_ModuleList(EObject context, ModuleList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pf=Prefix | (pf=Prefix ml+=ModuleList* spec=Spec) | (pf=Prefix mod=Module) | (id=ID mod=Module))
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     spec=Spec
	 */
	protected void sequence_Prefix(EObject context, Prefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModLangPackage.Literals.PREFIX__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModLangPackage.Literals.PREFIX__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixAccess().getSpecSpecParserRuleCall_0_2_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (path+='.'*)
	 */
	protected void sequence_Spec(EObject context, Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
