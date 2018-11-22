/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fukuda.kyudai.system.temperature#getOsoyoo <em>Osoyoo</em>}</li>
 * </ul>
 *
 * @see com.fukuda.kyudai.system.SystemPackage#gettemperature()
 * @model
 * @generated
 */
public interface temperature extends sensor {
	/**
	 * Returns the value of the '<em><b>Osoyoo</b></em>' containment reference list.
	 * The list contents are of type {@link com.fukuda.kyudai.system.osoyoo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osoyoo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osoyoo</em>' containment reference list.
	 * @see com.fukuda.kyudai.system.SystemPackage#gettemperature_Osoyoo()
	 * @model containment="true"
	 * @generated
	 */
	EList<osoyoo> getOsoyoo();

} // temperature
