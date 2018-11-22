/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>system</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.system#getName <em>Name</em>}</li>
 *   <li>{@link com.fukuda.kyudai.system.system#getFunction <em>Function</em>}</li>
 *   <li>{@link com.fukuda.kyudai.system.system#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see com.fukuda.kyudai.system.SystemPackage#getsystem()
 * @model
 * @generated
 */
public interface system extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.fukuda.kyudai.system.SystemPackage#getsystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.fukuda.kyudai.system.system#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#getsystem_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<function> getFunction();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#getsystem_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<sensor> getSensor();

} // system
