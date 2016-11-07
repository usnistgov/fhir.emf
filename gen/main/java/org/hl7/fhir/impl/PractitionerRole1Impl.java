/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PractitionerRole1;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Role1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerRole1Impl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerRole1Impl extends BackboneElementImpl implements PractitionerRole1 {
	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> location;

	/**
	 * The cached value of the '{@link #getHealthcareService() <em>Healthcare Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareService()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> healthcareService;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerRole1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPractitionerRole1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE1__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE1__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE1__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE1__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER_ROLE1__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PRACTITIONER_ROLE1__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.PRACTITIONER_ROLE1__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE1__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE1__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER_ROLE1__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER_ROLE1__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_ROLE1__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getHealthcareService() {
		if (healthcareService == null) {
			healthcareService = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_ROLE1__HEALTHCARE_SERVICE);
		}
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PRACTITIONER_ROLE1__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__HEALTHCARE_SERVICE:
				return ((InternalEList<?>)getHealthcareService()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER_ROLE1__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION:
				return getOrganization();
			case FhirPackage.PRACTITIONER_ROLE1__CODE:
				return getCode();
			case FhirPackage.PRACTITIONER_ROLE1__SPECIALTY:
				return getSpecialty();
			case FhirPackage.PRACTITIONER_ROLE1__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PRACTITIONER_ROLE1__TELECOM:
				return getTelecom();
			case FhirPackage.PRACTITIONER_ROLE1__PERIOD:
				return getPeriod();
			case FhirPackage.PRACTITIONER_ROLE1__LOCATION:
				return getLocation();
			case FhirPackage.PRACTITIONER_ROLE1__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.PRACTITIONER_ROLE1__ENDPOINT:
				return getEndpoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				getHealthcareService().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE1__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE1__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE1__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PRACTITIONER_ROLE1__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE1__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				return;
			case FhirPackage.PRACTITIONER_ROLE1__ENDPOINT:
				getEndpoint().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER_ROLE1__ORGANIZATION:
				return organization != null;
			case FhirPackage.PRACTITIONER_ROLE1__CODE:
				return code != null;
			case FhirPackage.PRACTITIONER_ROLE1__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE1__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE1__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE1__PERIOD:
				return period != null;
			case FhirPackage.PRACTITIONER_ROLE1__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE1__HEALTHCARE_SERVICE:
				return healthcareService != null && !healthcareService.isEmpty();
			case FhirPackage.PRACTITIONER_ROLE1__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerRole1Impl
