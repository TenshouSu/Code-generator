/**
 */
package com.fukuda.kyudai.system.impl;

import com.fukuda.kyudai.system.SystemFactory;
import com.fukuda.kyudai.system.SystemPackage;
import com.fukuda.kyudai.system.amazon;
import com.fukuda.kyudai.system.anonymization;
import com.fukuda.kyudai.system.average;
import com.fukuda.kyudai.system.data_average;
import com.fukuda.kyudai.system.data_deletion;
import com.fukuda.kyudai.system.dht11_temperature;
import com.fukuda.kyudai.system.domain;
import com.fukuda.kyudai.system.encryption;
import com.fukuda.kyudai.system.function;
import com.fukuda.kyudai.system.local;
import com.fukuda.kyudai.system.local_store;
import com.fukuda.kyudai.system.osoyoo;
import com.fukuda.kyudai.system.sensor;
import com.fukuda.kyudai.system.system;
import com.fukuda.kyudai.system.temperature;
import com.fukuda.kyudai.system.trust;

import com.fukuda.kyudai.system.verification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemPackageImpl extends EPackageImpl implements SystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass local_storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osoyooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dht11_temperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_averageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_deletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.fukuda.kyudai.system.SystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemPackageImpl() {
		super(eNS_URI, SystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemPackage init() {
		if (isInited)
			return (SystemPackage) EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Obtain or create and register package
		SystemPackageImpl theSystemPackage = (SystemPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SystemPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSystemPackage.createPackageContents();

		// Initialize created meta-data
		theSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, theSystemPackage);
		return theSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsystem_Name() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsystem_Function() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsystem_Sensor() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsensor_Name() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsensor_Process() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfunction_Name() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfunction_Reprocess() {
		return (EReference) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdomain_Local_store() {
		return (EReference) domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdomain_Trust() {
		return (EReference) domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlocal_store() {
		return local_storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlocal_store_Name() {
		return (EAttribute) local_storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlocal_store_Path() {
		return (EAttribute) local_storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperature() {
		return temperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettemperature_Osoyoo() {
		return (EReference) temperatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getosoyoo() {
		return osoyooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getosoyoo_Name() {
		return (EAttribute) osoyooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getosoyoo_Interval() {
		return (EAttribute) osoyooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlocal() {
		return localEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdht11_temperature() {
		return dht11_temperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettrust() {
		return trustEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrust_Name() {
		return (EAttribute) trustEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrust_Id() {
		return (EAttribute) trustEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrust_Password() {
		return (EAttribute) trustEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrust_Protocol() {
		return (EAttribute) trustEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getamazon() {
		return amazonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getanonymization() {
		return anonymizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getanonymization_Average() {
		return (EReference) anonymizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaverage() {
		return averageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaverage_Name() {
		return (EAttribute) averageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaverage_Interval() {
		return (EAttribute) averageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdata_average() {
		return data_averageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getencryption() {
		return encryptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdata_deletion() {
		return data_deletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getverification() {
		return verificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactory getSystemFactory() {
		return (SystemFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__FUNCTION);
		createEReference(systemEClass, SYSTEM__SENSOR);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__NAME);
		createEReference(sensorEClass, SENSOR__PROCESS);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEReference(functionEClass, FUNCTION__REPROCESS);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__LOCAL_STORE);
		createEReference(domainEClass, DOMAIN__TRUST);

		local_storeEClass = createEClass(LOCAL_STORE);
		createEAttribute(local_storeEClass, LOCAL_STORE__NAME);
		createEAttribute(local_storeEClass, LOCAL_STORE__PATH);

		temperatureEClass = createEClass(TEMPERATURE);
		createEReference(temperatureEClass, TEMPERATURE__OSOYOO);

		osoyooEClass = createEClass(OSOYOO);
		createEAttribute(osoyooEClass, OSOYOO__NAME);
		createEAttribute(osoyooEClass, OSOYOO__INTERVAL);

		localEClass = createEClass(LOCAL);

		dht11_temperatureEClass = createEClass(DHT11_TEMPERATURE);

		trustEClass = createEClass(TRUST);
		createEAttribute(trustEClass, TRUST__NAME);
		createEAttribute(trustEClass, TRUST__ID);
		createEAttribute(trustEClass, TRUST__PASSWORD);
		createEAttribute(trustEClass, TRUST__PROTOCOL);

		amazonEClass = createEClass(AMAZON);

		anonymizationEClass = createEClass(ANONYMIZATION);
		createEReference(anonymizationEClass, ANONYMIZATION__AVERAGE);

		averageEClass = createEClass(AVERAGE);
		createEAttribute(averageEClass, AVERAGE__NAME);
		createEAttribute(averageEClass, AVERAGE__INTERVAL);

		data_averageEClass = createEClass(DATA_AVERAGE);

		encryptionEClass = createEClass(ENCRYPTION);

		data_deletionEClass = createEClass(DATA_DELETION);

		verificationEClass = createEClass(VERIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(this.getfunction());
		temperatureEClass.getESuperTypes().add(this.getsensor());
		localEClass.getESuperTypes().add(this.getlocal_store());
		dht11_temperatureEClass.getESuperTypes().add(this.getosoyoo());
		amazonEClass.getESuperTypes().add(this.gettrust());
		anonymizationEClass.getESuperTypes().add(this.getfunction());
		data_averageEClass.getESuperTypes().add(this.getaverage());
		encryptionEClass.getESuperTypes().add(this.getfunction());
		data_deletionEClass.getESuperTypes().add(this.getfunction());
		verificationEClass.getESuperTypes().add(this.getfunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, system.class, "system", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, system.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsystem_Function(), this.getfunction(), null, "function", null, 0, -1, system.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsystem_Sensor(), this.getsensor(), null, "sensor", null, 0, -1, system.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sensorEClass, sensor.class, "sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsensor_Name(), ecorePackage.getEString(), "name", null, 0, 1, sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsensor_Process(), this.getfunction(), null, "process", null, 0, -1, sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, function.class, "function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getfunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, function.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfunction_Reprocess(), this.getfunction(), null, "reprocess", null, 0, -1, function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, domain.class, "domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdomain_Local_store(), this.getlocal_store(), null, "local_store", null, 0, -1, domain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdomain_Trust(), this.gettrust(), null, "trust", null, 0, -1, domain.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(local_storeEClass, local_store.class, "local_store", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getlocal_store_Name(), ecorePackage.getEString(), "name", null, 0, 1, local_store.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlocal_store_Path(), ecorePackage.getEString(), "path", null, 0, 1, local_store.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperatureEClass, temperature.class, "temperature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettemperature_Osoyoo(), this.getosoyoo(), null, "osoyoo", null, 0, -1, temperature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osoyooEClass, osoyoo.class, "osoyoo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getosoyoo_Name(), ecorePackage.getEString(), "name", null, 0, 1, osoyoo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getosoyoo_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, osoyoo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localEClass, local.class, "local", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dht11_temperatureEClass, dht11_temperature.class, "dht11_temperature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(trustEClass, trust.class, "trust", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettrust_Name(), ecorePackage.getEString(), "name", null, 0, 1, trust.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettrust_Id(), ecorePackage.getEString(), "id", null, 0, 1, trust.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettrust_Password(), ecorePackage.getEString(), "password", null, 0, 1, trust.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettrust_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, trust.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amazonEClass, amazon.class, "amazon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anonymizationEClass, anonymization.class, "anonymization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getanonymization_Average(), this.getaverage(), null, "average", null, 0, -1, anonymization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(averageEClass, average.class, "average", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getaverage_Name(), ecorePackage.getEString(), "name", null, 0, 1, average.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getaverage_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, average.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(data_averageEClass, data_average.class, "data_average", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(encryptionEClass, encryption.class, "encryption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(data_deletionEClass, data_deletion.class, "data_deletion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(verificationEClass, verification.class, "verification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemPackageImpl
