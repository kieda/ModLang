/**
 */
package edu.cmu.cs464.p3.modlang.modLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Model#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.cs464.p3.modlang.modLang.ModuleList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModel_Modules()
   * @model containment="true"
   * @generated
   */
  EList<ModuleList> getModules();

} // Model
