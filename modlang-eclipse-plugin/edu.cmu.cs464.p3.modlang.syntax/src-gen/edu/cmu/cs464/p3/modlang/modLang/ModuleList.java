/**
 */
package edu.cmu.cs464.p3.modlang.modLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getOpen <em>Open</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getSingle <em>Single</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getContext <em>Context</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModuleList()
 * @model
 * @generated
 */
public interface ModuleList extends EObject
{
  /**
   * Returns the value of the '<em><b>Open</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open</em>' containment reference.
   * @see #setOpen(Module)
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModuleList_Open()
   * @model containment="true"
   * @generated
   */
  Module getOpen();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getOpen <em>Open</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open</em>' containment reference.
   * @see #getOpen()
   * @generated
   */
  void setOpen(Module value);

  /**
   * Returns the value of the '<em><b>Single</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single</em>' containment reference.
   * @see #setSingle(Module)
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModuleList_Single()
   * @model containment="true"
   * @generated
   */
  Module getSingle();

  /**
   * Sets the value of the '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getSingle <em>Single</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single</em>' containment reference.
   * @see #getSingle()
   * @generated
   */
  void setSingle(Module value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.cs464.p3.modlang.modLang.ModuleList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' containment reference list.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModuleList_Context()
   * @model containment="true"
   * @generated
   */
  EList<ModuleList> getContext();

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.cs464.p3.modlang.modLang.ModuleList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference list.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModLangPackage#getModuleList_Def()
   * @model containment="true"
   * @generated
   */
  EList<ModuleList> getDef();

} // ModuleList
