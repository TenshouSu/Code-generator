/**
 */
package com.fukuda.kyudai.system.impl;

import com.fukuda.kyudai.system.SystemPackage;
import com.fukuda.kyudai.system.anonymization;
import com.fukuda.kyudai.system.average;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>anonymization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.impl.anonymizationImpl#getAverage <em>Average</em>}</li>
 * </ul>
 *
 * @generated
 */
public class anonymizationImpl extends functionImpl implements anonymization {
	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected EList<average> average;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected anonymizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.ANONYMIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<average> getAverage() {
		if (average == null) {
			average = new EObjectContainmentEList<average>(average.class, this, SystemPackage.ANONYMIZATION__AVERAGE);
		}
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemPackage.ANONYMIZATION__AVERAGE:
			return ((InternalEList<?>) getAverage()).basicRemove(otherEnd, msgs);
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
		case SystemPackage.ANONYMIZATION__AVERAGE:
			return getAverage();
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
		case SystemPackage.ANONYMIZATION__AVERAGE:
			getAverage().clear();
			getAverage().addAll((Collection<? extends average>) newValue);
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
		case SystemPackage.ANONYMIZATION__AVERAGE:
			getAverage().clear();
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
		case SystemPackage.ANONYMIZATION__AVERAGE:
			return average != null && !average.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //anonymizationImpl
