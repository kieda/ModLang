/**
 */
package edu.cmu.cs464.p3.modlang.modLang.impl;

import edu.cmu.cs464.p3.modlang.modLang.ModLangPackage;
import edu.cmu.cs464.p3.modlang.modLang.Module;
import edu.cmu.cs464.p3.modlang.modLang.ModuleList;
import edu.cmu.cs464.p3.modlang.modLang.Prefix;
import edu.cmu.cs464.p3.modlang.modLang.Spec;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl#getPf <em>Pf</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl#getMl <em>Ml</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The cached value of the '{@link #getPf() <em>Pf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPf()
   * @generated
   * @ordered
   */
  protected Prefix pf;

  /**
   * The cached value of the '{@link #getMl() <em>Ml</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMl()
   * @generated
   * @ordered
   */
  protected EList<ModuleList> ml;

  /**
   * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpec()
   * @generated
   * @ordered
   */
  protected Spec spec;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected Module mod;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModLangPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix getPf()
  {
    return pf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPf(Prefix newPf, NotificationChain msgs)
  {
    Prefix oldPf = pf;
    pf = newPf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__PF, oldPf, newPf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPf(Prefix newPf)
  {
    if (newPf != pf)
    {
      NotificationChain msgs = null;
      if (pf != null)
        msgs = ((InternalEObject)pf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE__PF, null, msgs);
      if (newPf != null)
        msgs = ((InternalEObject)newPf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE__PF, null, msgs);
      msgs = basicSetPf(newPf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__PF, newPf, newPf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModuleList> getMl()
  {
    if (ml == null)
    {
      ml = new EObjectContainmentEList<ModuleList>(ModuleList.class, this, ModLangPackage.MODULE__ML);
    }
    return ml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spec getSpec()
  {
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpec(Spec newSpec, NotificationChain msgs)
  {
    Spec oldSpec = spec;
    spec = newSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__SPEC, oldSpec, newSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpec(Spec newSpec)
  {
    if (newSpec != spec)
    {
      NotificationChain msgs = null;
      if (spec != null)
        msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE__SPEC, null, msgs);
      if (newSpec != null)
        msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE__SPEC, null, msgs);
      msgs = basicSetSpec(newSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__SPEC, newSpec, newSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMod(Module newMod, NotificationChain msgs)
  {
    Module oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__MOD, oldMod, newMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(Module newMod)
  {
    if (newMod != mod)
    {
      NotificationChain msgs = null;
      if (mod != null)
        msgs = ((InternalEObject)mod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE__MOD, null, msgs);
      if (newMod != null)
        msgs = ((InternalEObject)newMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE__MOD, null, msgs);
      msgs = basicSetMod(newMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__MOD, newMod, newMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModLangPackage.MODULE__PF:
        return basicSetPf(null, msgs);
      case ModLangPackage.MODULE__ML:
        return ((InternalEList<?>)getMl()).basicRemove(otherEnd, msgs);
      case ModLangPackage.MODULE__SPEC:
        return basicSetSpec(null, msgs);
      case ModLangPackage.MODULE__MOD:
        return basicSetMod(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModLangPackage.MODULE__PF:
        return getPf();
      case ModLangPackage.MODULE__ML:
        return getMl();
      case ModLangPackage.MODULE__SPEC:
        return getSpec();
      case ModLangPackage.MODULE__MOD:
        return getMod();
      case ModLangPackage.MODULE__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModLangPackage.MODULE__PF:
        setPf((Prefix)newValue);
        return;
      case ModLangPackage.MODULE__ML:
        getMl().clear();
        getMl().addAll((Collection<? extends ModuleList>)newValue);
        return;
      case ModLangPackage.MODULE__SPEC:
        setSpec((Spec)newValue);
        return;
      case ModLangPackage.MODULE__MOD:
        setMod((Module)newValue);
        return;
      case ModLangPackage.MODULE__ID:
        setId((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModLangPackage.MODULE__PF:
        setPf((Prefix)null);
        return;
      case ModLangPackage.MODULE__ML:
        getMl().clear();
        return;
      case ModLangPackage.MODULE__SPEC:
        setSpec((Spec)null);
        return;
      case ModLangPackage.MODULE__MOD:
        setMod((Module)null);
        return;
      case ModLangPackage.MODULE__ID:
        setId(ID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModLangPackage.MODULE__PF:
        return pf != null;
      case ModLangPackage.MODULE__ML:
        return ml != null && !ml.isEmpty();
      case ModLangPackage.MODULE__SPEC:
        return spec != null;
      case ModLangPackage.MODULE__MOD:
        return mod != null;
      case ModLangPackage.MODULE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
