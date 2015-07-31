/**
 */
package edu.cmu.cs464.p3.modlang.modLang.impl;

import edu.cmu.cs464.p3.modlang.modLang.ModLangPackage;
import edu.cmu.cs464.p3.modlang.modLang.Module;
import edu.cmu.cs464.p3.modlang.modLang.ModuleList;

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
 * An implementation of the model object '<em><b>Module List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl#getContext <em>Context</em>}</li>
 *   <li>{@link edu.cmu.cs464.p3.modlang.modLang.impl.ModuleListImpl#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleListImpl extends MinimalEObjectImpl.Container implements ModuleList
{
  /**
   * The cached value of the '{@link #getOpen() <em>Open</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpen()
   * @generated
   * @ordered
   */
  protected Module open;

  /**
   * The cached value of the '{@link #getSingle() <em>Single</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingle()
   * @generated
   * @ordered
   */
  protected Module single;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected EList<ModuleList> context;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected EList<ModuleList> def;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleListImpl()
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
    return ModLangPackage.Literals.MODULE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module getOpen()
  {
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpen(Module newOpen, NotificationChain msgs)
  {
    Module oldOpen = open;
    open = newOpen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE_LIST__OPEN, oldOpen, newOpen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpen(Module newOpen)
  {
    if (newOpen != open)
    {
      NotificationChain msgs = null;
      if (open != null)
        msgs = ((InternalEObject)open).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE_LIST__OPEN, null, msgs);
      if (newOpen != null)
        msgs = ((InternalEObject)newOpen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE_LIST__OPEN, null, msgs);
      msgs = basicSetOpen(newOpen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE_LIST__OPEN, newOpen, newOpen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module getSingle()
  {
    return single;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingle(Module newSingle, NotificationChain msgs)
  {
    Module oldSingle = single;
    single = newSingle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE_LIST__SINGLE, oldSingle, newSingle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingle(Module newSingle)
  {
    if (newSingle != single)
    {
      NotificationChain msgs = null;
      if (single != null)
        msgs = ((InternalEObject)single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE_LIST__SINGLE, null, msgs);
      if (newSingle != null)
        msgs = ((InternalEObject)newSingle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModLangPackage.MODULE_LIST__SINGLE, null, msgs);
      msgs = basicSetSingle(newSingle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModLangPackage.MODULE_LIST__SINGLE, newSingle, newSingle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModuleList> getContext()
  {
    if (context == null)
    {
      context = new EObjectContainmentEList<ModuleList>(ModuleList.class, this, ModLangPackage.MODULE_LIST__CONTEXT);
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModuleList> getDef()
  {
    if (def == null)
    {
      def = new EObjectContainmentEList<ModuleList>(ModuleList.class, this, ModLangPackage.MODULE_LIST__DEF);
    }
    return def;
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
      case ModLangPackage.MODULE_LIST__OPEN:
        return basicSetOpen(null, msgs);
      case ModLangPackage.MODULE_LIST__SINGLE:
        return basicSetSingle(null, msgs);
      case ModLangPackage.MODULE_LIST__CONTEXT:
        return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
      case ModLangPackage.MODULE_LIST__DEF:
        return ((InternalEList<?>)getDef()).basicRemove(otherEnd, msgs);
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
      case ModLangPackage.MODULE_LIST__OPEN:
        return getOpen();
      case ModLangPackage.MODULE_LIST__SINGLE:
        return getSingle();
      case ModLangPackage.MODULE_LIST__CONTEXT:
        return getContext();
      case ModLangPackage.MODULE_LIST__DEF:
        return getDef();
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
      case ModLangPackage.MODULE_LIST__OPEN:
        setOpen((Module)newValue);
        return;
      case ModLangPackage.MODULE_LIST__SINGLE:
        setSingle((Module)newValue);
        return;
      case ModLangPackage.MODULE_LIST__CONTEXT:
        getContext().clear();
        getContext().addAll((Collection<? extends ModuleList>)newValue);
        return;
      case ModLangPackage.MODULE_LIST__DEF:
        getDef().clear();
        getDef().addAll((Collection<? extends ModuleList>)newValue);
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
      case ModLangPackage.MODULE_LIST__OPEN:
        setOpen((Module)null);
        return;
      case ModLangPackage.MODULE_LIST__SINGLE:
        setSingle((Module)null);
        return;
      case ModLangPackage.MODULE_LIST__CONTEXT:
        getContext().clear();
        return;
      case ModLangPackage.MODULE_LIST__DEF:
        getDef().clear();
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
      case ModLangPackage.MODULE_LIST__OPEN:
        return open != null;
      case ModLangPackage.MODULE_LIST__SINGLE:
        return single != null;
      case ModLangPackage.MODULE_LIST__CONTEXT:
        return context != null && !context.isEmpty();
      case ModLangPackage.MODULE_LIST__DEF:
        return def != null && !def.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModuleListImpl
