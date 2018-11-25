/**
 */
package com.fukuda.kyudai.system;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.fukuda.kyudai.system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/system";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = com.fukuda.kyudai.system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.systemImpl <em>system</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.systemImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getsystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SENSOR = 2;

	/**
	 * The number of structural features of the '<em>system</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>system</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.sensorImpl <em>sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.sensorImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getsensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PROCESS = 1;

	/**
	 * The number of structural features of the '<em>sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.functionImpl <em>function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.functionImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getfunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REPROCESS = 1;

	/**
	 * The number of structural features of the '<em>function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.domainImpl <em>domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.domainImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdomain()
	 * @generated
	 */
	int DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Reprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__REPROCESS = FUNCTION__REPROCESS;

	/**
	 * The feature id for the '<em><b>Local store</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LOCAL_STORE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trust</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TRUST = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.local_storeImpl <em>local store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.local_storeImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getlocal_store()
	 * @generated
	 */
	int LOCAL_STORE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE__PATH = 1;

	/**
	 * The number of structural features of the '<em>local store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>local store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.temperatureImpl <em>temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.temperatureImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#gettemperature()
	 * @generated
	 */
	int TEMPERATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__PROCESS = SENSOR__PROCESS;

	/**
	 * The feature id for the '<em><b>Osoyoo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__OSOYOO = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.osoyooImpl <em>osoyoo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.osoyooImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getosoyoo()
	 * @generated
	 */
	int OSOYOO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSOYOO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSOYOO__INTERVAL = 1;

	/**
	 * The number of structural features of the '<em>osoyoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSOYOO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>osoyoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSOYOO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.localImpl <em>local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.localImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getlocal()
	 * @generated
	 */
	int LOCAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__NAME = LOCAL_STORE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__PATH = LOCAL_STORE__PATH;

	/**
	 * The number of structural features of the '<em>local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FEATURE_COUNT = LOCAL_STORE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OPERATION_COUNT = LOCAL_STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.dht11_temperatureImpl <em>dht11 temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.dht11_temperatureImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdht11_temperature()
	 * @generated
	 */
	int DHT11_TEMPERATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHT11_TEMPERATURE__NAME = OSOYOO__NAME;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHT11_TEMPERATURE__INTERVAL = OSOYOO__INTERVAL;

	/**
	 * The number of structural features of the '<em>dht11 temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHT11_TEMPERATURE_FEATURE_COUNT = OSOYOO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>dht11 temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHT11_TEMPERATURE_OPERATION_COUNT = OSOYOO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.trustImpl <em>trust</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.trustImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#gettrust()
	 * @generated
	 */
	int TRUST = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__PROTOCOL = 3;

	/**
	 * The number of structural features of the '<em>trust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>trust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.amazonImpl <em>amazon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.amazonImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getamazon()
	 * @generated
	 */
	int AMAZON = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON__NAME = TRUST__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON__ID = TRUST__ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON__PASSWORD = TRUST__PASSWORD;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON__PROTOCOL = TRUST__PROTOCOL;

	/**
	 * The number of structural features of the '<em>amazon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_FEATURE_COUNT = TRUST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>amazon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_OPERATION_COUNT = TRUST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.anonymizationImpl <em>anonymization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.anonymizationImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getanonymization()
	 * @generated
	 */
	int ANONYMIZATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Reprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION__REPROCESS = FUNCTION__REPROCESS;

	/**
	 * The feature id for the '<em><b>Average</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION__AVERAGE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>anonymization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>anonymization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.averageImpl <em>average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.averageImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getaverage()
	 * @generated
	 */
	int AVERAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE__INTERVAL = 1;

	/**
	 * The number of structural features of the '<em>average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.data_averageImpl <em>data average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.data_averageImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdata_average()
	 * @generated
	 */
	int DATA_AVERAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AVERAGE__NAME = AVERAGE__NAME;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AVERAGE__INTERVAL = AVERAGE__INTERVAL;

	/**
	 * The number of structural features of the '<em>data average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AVERAGE_FEATURE_COUNT = AVERAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>data average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AVERAGE_OPERATION_COUNT = AVERAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.encryptionImpl <em>encryption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.encryptionImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getencryption()
	 * @generated
	 */
	int ENCRYPTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Reprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION__REPROCESS = FUNCTION__REPROCESS;

	/**
	 * The number of structural features of the '<em>encryption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>encryption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.data_deletionImpl <em>data deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.data_deletionImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdata_deletion()
	 * @generated
	 */
	int DATA_DELETION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DELETION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Reprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DELETION__REPROCESS = FUNCTION__REPROCESS;

	/**
	 * The number of structural features of the '<em>data deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DELETION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>data deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DELETION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.fukuda.kyudai.system.impl.verificationImpl <em>verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fukuda.kyudai.system.impl.verificationImpl
	 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getverification()
	 * @generated
	 */
	int VERIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Reprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__REPROCESS = FUNCTION__REPROCESS;

	/**
	 * The number of structural features of the '<em>verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.system <em>system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>system</em>'.
	 * @see com.fukuda.kyudai.system.system
	 * @generated
	 */
	EClass getsystem();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.system#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.system#getName()
	 * @see #getsystem()
	 * @generated
	 */
	EAttribute getsystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fukuda.kyudai.system.system#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see com.fukuda.kyudai.system.system#getFunction()
	 * @see #getsystem()
	 * @generated
	 */
	EReference getsystem_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fukuda.kyudai.system.system#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see com.fukuda.kyudai.system.system#getSensor()
	 * @see #getsystem()
	 * @generated
	 */
	EReference getsystem_Sensor();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.sensor <em>sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sensor</em>'.
	 * @see com.fukuda.kyudai.system.sensor
	 * @generated
	 */
	EClass getsensor();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.sensor#getName()
	 * @see #getsensor()
	 * @generated
	 */
	EAttribute getsensor_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.fukuda.kyudai.system.sensor#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process</em>'.
	 * @see com.fukuda.kyudai.system.sensor#getProcess()
	 * @see #getsensor()
	 * @generated
	 */
	EReference getsensor_Process();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.function <em>function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>function</em>'.
	 * @see com.fukuda.kyudai.system.function
	 * @generated
	 */
	EClass getfunction();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.function#getName()
	 * @see #getfunction()
	 * @generated
	 */
	EAttribute getfunction_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.fukuda.kyudai.system.function#getReprocess <em>Reprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reprocess</em>'.
	 * @see com.fukuda.kyudai.system.function#getReprocess()
	 * @see #getfunction()
	 * @generated
	 */
	EReference getfunction_Reprocess();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.domain <em>domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>domain</em>'.
	 * @see com.fukuda.kyudai.system.domain
	 * @generated
	 */
	EClass getdomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fukuda.kyudai.system.domain#getLocal_store <em>Local store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local store</em>'.
	 * @see com.fukuda.kyudai.system.domain#getLocal_store()
	 * @see #getdomain()
	 * @generated
	 */
	EReference getdomain_Local_store();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fukuda.kyudai.system.domain#getTrust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trust</em>'.
	 * @see com.fukuda.kyudai.system.domain#getTrust()
	 * @see #getdomain()
	 * @generated
	 */
	EReference getdomain_Trust();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.local_store <em>local store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>local store</em>'.
	 * @see com.fukuda.kyudai.system.local_store
	 * @generated
	 */
	EClass getlocal_store();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.local_store#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.local_store#getName()
	 * @see #getlocal_store()
	 * @generated
	 */
	EAttribute getlocal_store_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.local_store#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.fukuda.kyudai.system.local_store#getPath()
	 * @see #getlocal_store()
	 * @generated
	 */
	EAttribute getlocal_store_Path();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.temperature <em>temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>temperature</em>'.
	 * @see com.fukuda.kyudai.system.temperature
	 * @generated
	 */
	EClass gettemperature();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fukuda.kyudai.system.temperature#getOsoyoo <em>Osoyoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osoyoo</em>'.
	 * @see com.fukuda.kyudai.system.temperature#getOsoyoo()
	 * @see #gettemperature()
	 * @generated
	 */
	EReference gettemperature_Osoyoo();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.osoyoo <em>osoyoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>osoyoo</em>'.
	 * @see com.fukuda.kyudai.system.osoyoo
	 * @generated
	 */
	EClass getosoyoo();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.osoyoo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.osoyoo#getName()
	 * @see #getosoyoo()
	 * @generated
	 */
	EAttribute getosoyoo_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.osoyoo#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see com.fukuda.kyudai.system.osoyoo#getInterval()
	 * @see #getosoyoo()
	 * @generated
	 */
	EAttribute getosoyoo_Interval();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.local <em>local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>local</em>'.
	 * @see com.fukuda.kyudai.system.local
	 * @generated
	 */
	EClass getlocal();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.dht11_temperature <em>dht11 temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dht11 temperature</em>'.
	 * @see com.fukuda.kyudai.system.dht11_temperature
	 * @generated
	 */
	EClass getdht11_temperature();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.trust <em>trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>trust</em>'.
	 * @see com.fukuda.kyudai.system.trust
	 * @generated
	 */
	EClass gettrust();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.trust#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.trust#getName()
	 * @see #gettrust()
	 * @generated
	 */
	EAttribute gettrust_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.trust#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.fukuda.kyudai.system.trust#getId()
	 * @see #gettrust()
	 * @generated
	 */
	EAttribute gettrust_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.trust#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.fukuda.kyudai.system.trust#getPassword()
	 * @see #gettrust()
	 * @generated
	 */
	EAttribute gettrust_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.trust#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.fukuda.kyudai.system.trust#getProtocol()
	 * @see #gettrust()
	 * @generated
	 */
	EAttribute gettrust_Protocol();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.amazon <em>amazon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>amazon</em>'.
	 * @see com.fukuda.kyudai.system.amazon
	 * @generated
	 */
	EClass getamazon();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.anonymization <em>anonymization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>anonymization</em>'.
	 * @see com.fukuda.kyudai.system.anonymization
	 * @generated
	 */
	EClass getanonymization();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fukuda.kyudai.system.anonymization#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Average</em>'.
	 * @see com.fukuda.kyudai.system.anonymization#getAverage()
	 * @see #getanonymization()
	 * @generated
	 */
	EReference getanonymization_Average();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.average <em>average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>average</em>'.
	 * @see com.fukuda.kyudai.system.average
	 * @generated
	 */
	EClass getaverage();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.average#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fukuda.kyudai.system.average#getName()
	 * @see #getaverage()
	 * @generated
	 */
	EAttribute getaverage_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.fukuda.kyudai.system.average#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see com.fukuda.kyudai.system.average#getInterval()
	 * @see #getaverage()
	 * @generated
	 */
	EAttribute getaverage_Interval();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.data_average <em>data average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>data average</em>'.
	 * @see com.fukuda.kyudai.system.data_average
	 * @generated
	 */
	EClass getdata_average();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.encryption <em>encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>encryption</em>'.
	 * @see com.fukuda.kyudai.system.encryption
	 * @generated
	 */
	EClass getencryption();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.data_deletion <em>data deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>data deletion</em>'.
	 * @see com.fukuda.kyudai.system.data_deletion
	 * @generated
	 */
	EClass getdata_deletion();

	/**
	 * Returns the meta object for class '{@link com.fukuda.kyudai.system.verification <em>verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>verification</em>'.
	 * @see com.fukuda.kyudai.system.verification
	 * @generated
	 */
	EClass getverification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.systemImpl <em>system</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.systemImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getsystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getsystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getsystem_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__FUNCTION = eINSTANCE.getsystem_Function();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SENSOR = eINSTANCE.getsystem_Sensor();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.sensorImpl <em>sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.sensorImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getsensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getsensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getsensor_Name();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PROCESS = eINSTANCE.getsensor_Process();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.functionImpl <em>function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.functionImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getfunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getfunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getfunction_Name();

		/**
		 * The meta object literal for the '<em><b>Reprocess</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__REPROCESS = eINSTANCE.getfunction_Reprocess();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.domainImpl <em>domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.domainImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getdomain();

		/**
		 * The meta object literal for the '<em><b>Local store</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LOCAL_STORE = eINSTANCE.getdomain_Local_store();

		/**
		 * The meta object literal for the '<em><b>Trust</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TRUST = eINSTANCE.getdomain_Trust();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.local_storeImpl <em>local store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.local_storeImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getlocal_store()
		 * @generated
		 */
		EClass LOCAL_STORE = eINSTANCE.getlocal_store();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_STORE__NAME = eINSTANCE.getlocal_store_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_STORE__PATH = eINSTANCE.getlocal_store_Path();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.temperatureImpl <em>temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.temperatureImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#gettemperature()
		 * @generated
		 */
		EClass TEMPERATURE = eINSTANCE.gettemperature();

		/**
		 * The meta object literal for the '<em><b>Osoyoo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPERATURE__OSOYOO = eINSTANCE.gettemperature_Osoyoo();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.osoyooImpl <em>osoyoo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.osoyooImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getosoyoo()
		 * @generated
		 */
		EClass OSOYOO = eINSTANCE.getosoyoo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSOYOO__NAME = eINSTANCE.getosoyoo_Name();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSOYOO__INTERVAL = eINSTANCE.getosoyoo_Interval();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.localImpl <em>local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.localImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getlocal()
		 * @generated
		 */
		EClass LOCAL = eINSTANCE.getlocal();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.dht11_temperatureImpl <em>dht11 temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.dht11_temperatureImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdht11_temperature()
		 * @generated
		 */
		EClass DHT11_TEMPERATURE = eINSTANCE.getdht11_temperature();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.trustImpl <em>trust</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.trustImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#gettrust()
		 * @generated
		 */
		EClass TRUST = eINSTANCE.gettrust();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUST__NAME = eINSTANCE.gettrust_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUST__ID = eINSTANCE.gettrust_Id();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUST__PASSWORD = eINSTANCE.gettrust_Password();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUST__PROTOCOL = eINSTANCE.gettrust_Protocol();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.amazonImpl <em>amazon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.amazonImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getamazon()
		 * @generated
		 */
		EClass AMAZON = eINSTANCE.getamazon();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.anonymizationImpl <em>anonymization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.anonymizationImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getanonymization()
		 * @generated
		 */
		EClass ANONYMIZATION = eINSTANCE.getanonymization();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMIZATION__AVERAGE = eINSTANCE.getanonymization_Average();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.averageImpl <em>average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.averageImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getaverage()
		 * @generated
		 */
		EClass AVERAGE = eINSTANCE.getaverage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGE__NAME = eINSTANCE.getaverage_Name();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGE__INTERVAL = eINSTANCE.getaverage_Interval();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.data_averageImpl <em>data average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.data_averageImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdata_average()
		 * @generated
		 */
		EClass DATA_AVERAGE = eINSTANCE.getdata_average();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.encryptionImpl <em>encryption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.encryptionImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getencryption()
		 * @generated
		 */
		EClass ENCRYPTION = eINSTANCE.getencryption();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.data_deletionImpl <em>data deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.data_deletionImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getdata_deletion()
		 * @generated
		 */
		EClass DATA_DELETION = eINSTANCE.getdata_deletion();

		/**
		 * The meta object literal for the '{@link com.fukuda.kyudai.system.impl.verificationImpl <em>verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fukuda.kyudai.system.impl.verificationImpl
		 * @see com.fukuda.kyudai.system.impl.SystemPackageImpl#getverification()
		 * @generated
		 */
		EClass VERIFICATION = eINSTANCE.getverification();

	}

} //SystemPackage
