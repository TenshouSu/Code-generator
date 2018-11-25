/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.domain#getLocal_store <em>Local store</em>}</li>
 *   <li>{@link com.fukuda.kyudai.system.domain#getTrust <em>Trust</em>}</li>
 * </ul>
 *
 * @see com.fukuda.kyudai.system.SystemPackage#getdomain()
 * @model
 * @generated
 */
public interface domain extends function {
	/**
	 * Returns the value of the '<em><b>Local store</b></em>' containment reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.local_store}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local store</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local store</em>' containment reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#getdomain_Local_store()
	 * @model containment="true"
	 * @generated
	 */
	EList<local_store> getLocal_store();

	/**
	 * Returns the value of the '<em><b>Trust</b></em>' containment reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.trust}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust</em>' containment reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#getdomain_Trust()
	 * @model containment="true"
	 * @generated
	 */
	EList<trust> getTrust();

} // domain
