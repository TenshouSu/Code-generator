/**
 */
package com.fukuda.kyudai.system.impl;

import com.fukuda.kyudai.system.SystemPackage;
import com.fukuda.kyudai.system.domain;
import com.fukuda.kyudai.system.local_store;
import com.fukuda.kyudai.system.trust;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.impl.domainImpl#getLocal_store <em>Local store</em>}</li>
 *   <li>{@link com.fukuda.kyudai.system.impl.domainImpl#getTrust <em>Trust</em>}</li>
 * </ul>
 *
 * @generated
 */
public class domainImpl extends functionImpl implements domain {
	/**
	 * The cached value of the '{@link #getLocal_store() <em>Local store</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_store()
	 * @generated
	 * @ordered
	 */
	protected EList<local_store> local_store;

	/**
	 * The cached value of the '{@link #getTrust() <em>Trust</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrust()
	 * @generated
	 * @ordered
	 */
	protected EList<trust> trust;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected domainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<local_store> getLocal_store() {
		if (local_store == null) {
			local_store = new EObjectContainmentEList<local_store>(local_store.class, this,
					SystemPackage.DOMAIN__LOCAL_STORE);
		}
		return local_store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<trust> getTrust() {
		if (trust == null) {
			trust = new EObjectContainmentEList<trust>(trust.class, this, SystemPackage.DOMAIN__TRUST);
		}
		return trust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemPackage.DOMAIN__LOCAL_STORE:
			return ((InternalEList<?>) getLocal_store()).basicRemove(otherEnd, msgs);
		case SystemPackage.DOMAIN__TRUST:
			return ((InternalEList<?>) getTrust()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemPackage.DOMAIN__LOCAL_STORE:
			return getLocal_store();
		case SystemPackage.DOMAIN__TRUST:
			return getTrust();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemPackage.DOMAIN__LOCAL_STORE:
			getLocal_store().clear();
			getLocal_store().addAll((Collection<? extends local_store>) newValue);
			return;
		case SystemPackage.DOMAIN__TRUST:
			getTrust().clear();
			getTrust().addAll((Collection<? extends trust>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case SystemPackage.DOMAIN__LOCAL_STORE:
			getLocal_store().clear();
			return;
		case SystemPackage.DOMAIN__TRUST:
			getTrust().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SystemPackage.DOMAIN__LOCAL_STORE:
			return local_store != null && !local_store.isEmpty();
		case SystemPackage.DOMAIN__TRUST:
			return trust != null && !trust.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //domainImpl
