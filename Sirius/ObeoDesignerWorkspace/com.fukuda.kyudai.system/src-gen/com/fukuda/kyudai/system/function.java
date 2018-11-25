/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.function#getName <em>Name</em>}</li>
 *   <li>{@link com.fukuda.kyudai.system.function#getReprocess <em>Reprocess</em>}</li>
 * </ul>
 *
 * @see com.fukuda.kyudai.system.SystemPackage#getfunction()
 * @model abstract="true"
 * @generated
 */
public interface function extends EObject {
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
	 * @see com.fukuda.kyudai.system.SystemPackage#getfunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.fukuda.kyudai.system.function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reprocess</b></em>' reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reprocess</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reprocess</em>' reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#getfunction_Reprocess()
	 * @model
	 * @generated
	 */
	EList<function> getReprocess();

} // function
