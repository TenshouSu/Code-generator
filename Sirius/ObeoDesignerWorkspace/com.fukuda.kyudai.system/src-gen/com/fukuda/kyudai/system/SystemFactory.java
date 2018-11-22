/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.fukuda.kyudai.system.SystemPackage
 * @generated
 */
public interface SystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemFactory eINSTANCE = com.fukuda.kyudai.system.impl.SystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>system</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>system</em>'.
	 * @generated
	 */
	system createsystem();

	/**
	 * Returns a new object of class '<em>domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>domain</em>'.
	 * @generated
	 */
	domain createdomain();

	/**
	 * Returns a new object of class '<em>temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>temperature</em>'.
	 * @generated
	 */
	temperature createtemperature();

	/**
	 * Returns a new object of class '<em>local</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>local</em>'.
	 * @generated
	 */
	local createlocal();

	/**
	 * Returns a new object of class '<em>dht11 temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dht11 temperature</em>'.
	 * @generated
	 */
	dht11_temperature createdht11_temperature();

	/**
	 * Returns a new object of class '<em>amazon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>amazon</em>'.
	 * @generated
	 */
	amazon createamazon();

	/**
	 * Returns a new object of class '<em>anonymization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>anonymization</em>'.
	 * @generated
	 */
	anonymization createanonymization();

	/**
	 * Returns a new object of class '<em>data average</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>data average</em>'.
	 * @generated
	 */
	data_average createdata_average();

	/**
	 * Returns a new object of class '<em>encryption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>encryption</em>'.
	 * @generated
	 */
	encryption createencryption();

	/**
	 * Returns a new object of class '<em>data deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>data deletion</em>'.
	 * @generated
	 */
	data_deletion createdata_deletion();

	/**
	 * Returns a new object of class '<em>verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>verification</em>'.
	 * @generated
	 */
	verification createverification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemPackage getSystemPackage();

} //SystemFactory
