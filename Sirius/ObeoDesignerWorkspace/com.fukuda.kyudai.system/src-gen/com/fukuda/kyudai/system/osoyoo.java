/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>osoyoo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.osoyoo#getName <em>Name</em>}</li>
 *   <li>{@link com.fukuda.kyudai.system.osoyoo#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see com.fukuda.kyudai.system.SystemPackage#getosoyoo()
 * @model abstract="true"
 * @generated
 */
public interface osoyoo extends EObject {
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
	 * @see com.fukuda.kyudai.system.SystemPackage#getosoyoo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.fukuda.kyudai.system.osoyoo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see com.fukuda.kyudai.system.SystemPackage#getosoyoo_Interval()
	 * @model
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link com.fukuda.kyudai.system.osoyoo#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

} // osoyoo
