/**
 */
package com.fukuda.kyudai.system.util;

import com.fukuda.kyudai.system.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.fukuda.kyudai.system.SystemPackage
 * @generated
 */
public class SystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SystemPackage.SYSTEM: {
			system system = (system) theEObject;
			T result = casesystem(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.SENSOR: {
			sensor sensor = (sensor) theEObject;
			T result = casesensor(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.FUNCTION: {
			function function = (function) theEObject;
			T result = casefunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.DOMAIN: {
			domain domain = (domain) theEObject;
			T result = casedomain(domain);
			if (result == null)
				result = casefunction(domain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.LOCAL_STORE: {
			local_store local_store = (local_store) theEObject;
			T result = caselocal_store(local_store);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.TEMPERATURE: {
			temperature temperature = (temperature) theEObject;
			T result = casetemperature(temperature);
			if (result == null)
				result = casesensor(temperature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.OSOYOO: {
			osoyoo osoyoo = (osoyoo) theEObject;
			T result = caseosoyoo(osoyoo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.LOCAL: {
			local local = (local) theEObject;
			T result = caselocal(local);
			if (result == null)
				result = caselocal_store(local);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.DHT11_TEMPERATURE: {
			dht11_temperature dht11_temperature = (dht11_temperature) theEObject;
			T result = casedht11_temperature(dht11_temperature);
			if (result == null)
				result = caseosoyoo(dht11_temperature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.TRUST: {
			trust trust = (trust) theEObject;
			T result = casetrust(trust);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.AMAZON: {
			amazon amazon = (amazon) theEObject;
			T result = caseamazon(amazon);
			if (result == null)
				result = casetrust(amazon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.ANONYMIZATION: {
			anonymization anonymization = (anonymization) theEObject;
			T result = caseanonymization(anonymization);
			if (result == null)
				result = casefunction(anonymization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.AVERAGE: {
			average average = (average) theEObject;
			T result = caseaverage(average);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.DATA_AVERAGE: {
			data_average data_average = (data_average) theEObject;
			T result = casedata_average(data_average);
			if (result == null)
				result = caseaverage(data_average);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.ENCRYPTION: {
			encryption encryption = (encryption) theEObject;
			T result = caseencryption(encryption);
			if (result == null)
				result = casefunction(encryption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.DATA_DELETION: {
			data_deletion data_deletion = (data_deletion) theEObject;
			T result = casedata_deletion(data_deletion);
			if (result == null)
				result = casefunction(data_deletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SystemPackage.VERIFICATION: {
			verification verification = (verification) theEObject;
			T result = caseverification(verification);
			if (result == null)
				result = casefunction(verification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>system</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>system</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesystem(system object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesensor(sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefunction(function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedomain(domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>local store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>local store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselocal_store(local_store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperature(temperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>osoyoo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>osoyoo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseosoyoo(osoyoo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselocal(local object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dht11 temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dht11 temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedht11_temperature(dht11_temperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>trust</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>trust</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetrust(trust object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>amazon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>amazon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseamazon(amazon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>anonymization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>anonymization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseanonymization(anonymization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>average</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>average</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaverage(average object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>data average</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>data average</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedata_average(data_average object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>encryption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>encryption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseencryption(encryption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>data deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>data deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedata_deletion(data_deletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseverification(verification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SystemSwitch
