/**
 */
package com.fukuda.kyudai.system.util;

import com.fukuda.kyudai.system.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.fukuda.kyudai.system.SystemPackage
 * @generated
 */
public class SystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemSwitch<Adapter> modelSwitch = new SystemSwitch<Adapter>() {
		@Override
		public Adapter casesystem(system object) {
			return createsystemAdapter();
		}

		@Override
		public Adapter casesensor(sensor object) {
			return createsensorAdapter();
		}

		@Override
		public Adapter casefunction(function object) {
			return createfunctionAdapter();
		}

		@Override
		public Adapter casedomain(domain object) {
			return createdomainAdapter();
		}

		@Override
		public Adapter caselocal_store(local_store object) {
			return createlocal_storeAdapter();
		}

		@Override
		public Adapter casetemperature(temperature object) {
			return createtemperatureAdapter();
		}

		@Override
		public Adapter caseosoyoo(osoyoo object) {
			return createosoyooAdapter();
		}

		@Override
		public Adapter caselocal(local object) {
			return createlocalAdapter();
		}

		@Override
		public Adapter casedht11_temperature(dht11_temperature object) {
			return createdht11_temperatureAdapter();
		}

		@Override
		public Adapter casetrust(trust object) {
			return createtrustAdapter();
		}

		@Override
		public Adapter caseamazon(amazon object) {
			return createamazonAdapter();
		}

		@Override
		public Adapter caseanonymization(anonymization object) {
			return createanonymizationAdapter();
		}

		@Override
		public Adapter caseaverage(average object) {
			return createaverageAdapter();
		}

		@Override
		public Adapter casedata_average(data_average object) {
			return createdata_averageAdapter();
		}

		@Override
		public Adapter caseencryption(encryption object) {
			return createencryptionAdapter();
		}

		@Override
		public Adapter casedata_deletion(data_deletion object) {
			return createdata_deletionAdapter();
		}

		@Override
		public Adapter caseverification(verification object) {
			return createverificationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.system <em>system</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.system
	 * @generated
	 */
	public Adapter createsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.sensor <em>sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.sensor
	 * @generated
	 */
	public Adapter createsensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.function <em>function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.function
	 * @generated
	 */
	public Adapter createfunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.domain <em>domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.domain
	 * @generated
	 */
	public Adapter createdomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.local_store <em>local store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.local_store
	 * @generated
	 */
	public Adapter createlocal_storeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.temperature <em>temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.temperature
	 * @generated
	 */
	public Adapter createtemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.osoyoo <em>osoyoo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.osoyoo
	 * @generated
	 */
	public Adapter createosoyooAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.local <em>local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.local
	 * @generated
	 */
	public Adapter createlocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.dht11_temperature <em>dht11 temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.dht11_temperature
	 * @generated
	 */
	public Adapter createdht11_temperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.trust <em>trust</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.trust
	 * @generated
	 */
	public Adapter createtrustAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.amazon <em>amazon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.amazon
	 * @generated
	 */
	public Adapter createamazonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.anonymization <em>anonymization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.anonymization
	 * @generated
	 */
	public Adapter createanonymizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.average <em>average</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.average
	 * @generated
	 */
	public Adapter createaverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.data_average <em>data average</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.data_average
	 * @generated
	 */
	public Adapter createdata_averageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.encryption <em>encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.encryption
	 * @generated
	 */
	public Adapter createencryptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.data_deletion <em>data deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.data_deletion
	 * @generated
	 */
	public Adapter createdata_deletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.fukuda.kyudai.system.verification <em>verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.fukuda.kyudai.system.verification
	 * @generated
	 */
	public Adapter createverificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SystemAdapterFactory
