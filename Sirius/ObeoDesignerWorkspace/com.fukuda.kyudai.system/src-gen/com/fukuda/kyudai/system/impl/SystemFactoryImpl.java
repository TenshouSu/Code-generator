/**
 */
package com.fukuda.kyudai.system.impl;

import com.fukuda.kyudai.system.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemFactoryImpl extends EFactoryImpl implements SystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemFactory init() {
		try {
			SystemFactory theSystemFactory = (SystemFactory) EPackage.Registry.INSTANCE
					.getEFactory(SystemPackage.eNS_URI);
			if (theSystemFactory != null) {
				return theSystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SystemPackage.SYSTEM:
			return createsystem();
		case SystemPackage.DOMAIN:
			return createdomain();
		case SystemPackage.TEMPERATURE:
			return createtemperature();
		case SystemPackage.LOCAL:
			return createlocal();
		case SystemPackage.DHT11_TEMPERATURE:
			return createdht11_temperature();
		case SystemPackage.AMAZON:
			return createamazon();
		case SystemPackage.ANONYMIZATION:
			return createanonymization();
		case SystemPackage.DATA_AVERAGE:
			return createdata_average();
		case SystemPackage.ENCRYPTION:
			return createencryption();
		case SystemPackage.DATA_DELETION:
			return createdata_deletion();
		case SystemPackage.VERIFICATION:
			return createverification();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public system createsystem() {
		systemImpl system = new systemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domain createdomain() {
		domainImpl domain = new domainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperature createtemperature() {
		temperatureImpl temperature = new temperatureImpl();
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public local createlocal() {
		localImpl local = new localImpl();
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dht11_temperature createdht11_temperature() {
		dht11_temperatureImpl dht11_temperature = new dht11_temperatureImpl();
		return dht11_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public amazon createamazon() {
		amazonImpl amazon = new amazonImpl();
		return amazon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public anonymization createanonymization() {
		anonymizationImpl anonymization = new anonymizationImpl();
		return anonymization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public data_average createdata_average() {
		data_averageImpl data_average = new data_averageImpl();
		return data_average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public encryption createencryption() {
		encryptionImpl encryption = new encryptionImpl();
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public data_deletion createdata_deletion() {
		data_deletionImpl data_deletion = new data_deletionImpl();
		return data_deletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public verification createverification() {
		verificationImpl verification = new verificationImpl();
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPackage getSystemPackage() {
		return (SystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemPackage getPackage() {
		return SystemPackage.eINSTANCE;
	}

} //SystemFactoryImpl
