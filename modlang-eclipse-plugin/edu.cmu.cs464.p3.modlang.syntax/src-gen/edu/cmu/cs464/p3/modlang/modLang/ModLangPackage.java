/**
 */
package edu.cmu.cs464.p3.modlang.modLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.cmu.cs464.p3.modlang.modLang.ModLangFactory
 * @model kind="package"
 * @generated
 */
public interface ModLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "modLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cmu.edu/cs464/p3/modlang/ModLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "modLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModLangPackage eINSTANCE = edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModelImpl
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.PrefixImpl
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 1;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__SPEC = 0;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.SpecImpl
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 2;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__SPEC = PREFIX__SPEC;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__PATH = PREFIX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = PREFIX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getModule()
   * @generated
   */
  int MODULE = 3;

  /**
   * The feature id for the '<em><b>Pf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PF = 0;

  /**
   * The feature id for the '<em><b>Ml</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ML = 1;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__SPEC = 2;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MOD = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ID = 4;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl <em>Module List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl
   * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getModuleList()
   * @generated
   */
  int MODULE_LIST = 4;

  /**
   * The feature id for the '<em><b>Open</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_LIST__OPEN = 0;

  /**
   * The feature id for the '<em><b>Single</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_LIST__SINGLE = 1;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_LIST__CONTEXT = 2;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_LIST__DEF = 3;

  /**
   * The number of structural features of the '<em>Module List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_LIST_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link edu.cmu.cs464.p3.modlang.modLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.cs464.p3.modlang.modLang.Model#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Model#getModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Modules();

  /**
   * Returns the meta object for class '{@link edu.cmu.cs464.p3.modlang.modLang.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.cs464.p3.modlang.modLang.Prefix#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Prefix#getSpec()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_Spec();

  /**
   * Returns the meta object for class '{@link edu.cmu.cs464.p3.modlang.modLang.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.cs464.p3.modlang.modLang.Spec#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Path</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Spec#getPath()
   * @see #getSpec()
   * @generated
   */
  EAttribute getSpec_Path();

  /**
   * Returns the meta object for class '{@link edu.cmu.cs464.p3.modlang.modLang.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getPf <em>Pf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pf</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Module#getPf()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Pf();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getMl <em>Ml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ml</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Module#getMl()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Ml();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Module#getSpec()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Spec();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Module#getMod()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Mod();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.cs464.p3.modlang.modLang.Module#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.Module#getId()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Id();

  /**
   * Returns the meta object for class '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList <em>Module List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module List</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModuleList
   * @generated
   */
  EClass getModuleList();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Open</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModuleList#getOpen()
   * @see #getModuleList()
   * @generated
   */
  EReference getModuleList_Open();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getSingle <em>Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModuleList#getSingle()
   * @see #getModuleList()
   * @generated
   */
  EReference getModuleList_Single();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Context</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModuleList#getContext()
   * @see #getModuleList()
   * @generated
   */
  EReference getModuleList_Context();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.cs464.p3.modlang.modLang.ModuleList#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Def</em>'.
   * @see edu.cmu.cs464.p3.modlang.modLang.ModuleList#getDef()
   * @see #getModuleList()
   * @generated
   */
  EReference getModuleList_Def();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModLangFactory getModLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModelImpl
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULES = eINSTANCE.getModel_Modules();

    /**
     * The meta object literal for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.PrefixImpl
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__SPEC = eINSTANCE.getPrefix_Spec();

    /**
     * The meta object literal for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.SpecImpl
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC__PATH = eINSTANCE.getSpec_Path();

    /**
     * The meta object literal for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Pf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PF = eINSTANCE.getModule_Pf();

    /**
     * The meta object literal for the '<em><b>Ml</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__ML = eINSTANCE.getModule_Ml();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__SPEC = eINSTANCE.getModule_Spec();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MOD = eINSTANCE.getModule_Mod();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__ID = eINSTANCE.getModule_Id();

    /**
     * The meta object literal for the '{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl <em>Module List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl
     * @see edu.cmu.cs464.p3.modlang.modLang.impl.ModLangPackageImpl#getModuleList()
     * @generated
     */
    EClass MODULE_LIST = eINSTANCE.getModuleList();

    /**
     * The meta object literal for the '<em><b>Open</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_LIST__OPEN = eINSTANCE.getModuleList_Open();

    /**
     * The meta object literal for the '<em><b>Single</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_LIST__SINGLE = eINSTANCE.getModuleList_Single();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_LIST__CONTEXT = eINSTANCE.getModuleList_Context();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_LIST__DEF = eINSTANCE.getModuleList_Def();

  }

} //ModLangPackage
