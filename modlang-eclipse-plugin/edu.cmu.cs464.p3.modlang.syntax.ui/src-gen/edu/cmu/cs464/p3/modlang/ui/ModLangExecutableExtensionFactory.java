/*
 * generated by Xtext
 */
package edu.cmu.cs464.p3.modlang.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import edu.cmu.cs464.p3.modlang.ui.internal.ModLangActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ModLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ModLangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ModLangActivator.getInstance().getInjector(ModLangActivator.EDU_CMU_CS464_P3_MODLANG_MODLANG);
	}
	
}
