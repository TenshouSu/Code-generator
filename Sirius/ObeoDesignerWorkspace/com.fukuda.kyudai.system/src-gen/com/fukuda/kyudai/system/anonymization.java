/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>anonymization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.anonymization#getAverage <em>Average</em>}</li>
 * </ul>
 *
 * @see com.fukuda.kyudai.system.SystemPackage#getanonymization()
 * @model
 * @generated
 */
public interface anonymization extends function {
	/**
	 * Returns the value of the '<em><b>Average</b></em>' containment reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.average}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' containment reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#getanonymization_Average()
	 * @model containment="true"
	 * @generated
	 */
	EList<average> getAverage();

} // anonymization
