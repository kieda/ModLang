/**
 */
package edu.cmu.cs464.p3.modlang.modLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Spec#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getSpec()
 * @model
 * @generated
 */
public interface Spec extends Prefix
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute list.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getSpec_Path()
   * @model unique="false"
   * @generated
   */
  EList<String> getPath();

} // Spec
