/**
 */
package edu.cmu.cs464.p3.modlang.modLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Prefix#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getPrefix()
 * @model
 * @generated
 */
public interface Prefix extends EObject
{
  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference.
   * @see #setSpec(Spec)
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getPrefix_Spec()
   * @model containment="true"
   * @generated
   */
  Spec getSpec();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.Prefix#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(Spec value);

} // Prefix
