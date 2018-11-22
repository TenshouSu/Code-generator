/**
 */
package com.fukuda.kyudai.system.impl;

import com.fukuda.kyudai.system.SystemPackage;
import com.fukuda.kyudai.system.osoyoo;
import com.fukuda.kyudai.system.temperature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.impl.temperatureImpl#getOsoyoo <em>Osoyoo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class temperatureImpl extends sensorImpl implements temperature {
	/**
	 * The cached value of the '{@link #getOsoyoo() <em>Osoyoo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsoyoo()
	 * @generated
	 * @ordered
	 */
	protected EList<osoyoo> osoyoo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected temperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.TEMPERATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<osoyoo> getOsoyoo() {
		if (osoyoo == null) {
			osoyoo = new EObjectContainmentEList<osoyoo>(osoyoo.class, this, SystemPackage.TEMPERATURE__OSOYOO);
		}
		return osoyoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemPackage.TEMPERATURE__OSOYOO:
			return ((InternalEList<?>) getOsoyoo()).basicRemove(otherEnd, msgs);
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
		case SystemPackage.TEMPERATURE__OSOYOO:
			return getOsoyoo();
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
		case SystemPackage.TEMPERATURE__OSOYOO:
			getOsoyoo().clear();
			getOsoyoo().addAll((Collection<? extends osoyoo>) newValue);
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
		case SystemPackage.TEMPERATURE__OSOYOO:
			getOsoyoo().clear();
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
		case SystemPackage.TEMPERATURE__OSOYOO:
			return osoyoo != null && !osoyoo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //temperatureImpl
