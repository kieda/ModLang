/**
 */
package edu.cmu.cs464.p3.modlang.modLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Module#getPf <em>Pf</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Module#getMl <em>Ml</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Module#getSpec <em>Spec</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Module#getMod <em>Mod</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.Module#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Pf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pf</em>' containment reference.
   * @see #setPf(Prefix)
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModule_Pf()
   * @model containment="true"
   * @generated
   */
  Prefix getPf();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getPf <em>Pf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pf</em>' containment reference.
   * @see #getPf()
   * @generated
   */
  void setPf(Prefix value);

  /**
   * Returns the value of the '<em><b>Ml</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.cs464.p3.modlang.modLang.ModuleList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ml</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ml</em>' containment reference list.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModule_Ml()
   * @model containment="true"
   * @generated
   */
  EList<ModuleList> getMl();

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
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModule_Spec()
   * @model containment="true"
   * @generated
   */
  Spec getSpec();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(Spec value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(Module)
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModule_Mod()
   * @model containment="true"
   * @generated
   */
  Module getMod();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(Module value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModule_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Module
