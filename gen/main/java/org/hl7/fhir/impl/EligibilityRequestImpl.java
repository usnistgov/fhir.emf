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

import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityRequestStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getInsurerIdentifier <em>Insurer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getInsurerReference <em>Insurer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getEntererIdentifier <em>Enterer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getEntererReference <em>Enterer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getFacilityIdentifier <em>Facility Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getFacilityReference <em>Facility Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getPatientIdentifier <em>Patient Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getPatientReference <em>Patient Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getCoverageIdentifier <em>Coverage Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getCoverageReference <em>Coverage Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getBenefitCategory <em>Benefit Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getBenefitSubCategory <em>Benefit Sub Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EligibilityRequestImpl extends DomainResourceImpl implements EligibilityRequest {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EligibilityRequestStatus status;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getInsurerIdentifier() <em>Insurer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurerIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier insurerIdentifier;

	/**
	 * The cached value of the '{@link #getInsurerReference() <em>Insurer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurerReference()
	 * @generated
	 * @ordered
	 */
	protected Reference insurerReference;

	/**
	 * The cached value of the '{@link #getProviderIdentifier() <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier providerIdentifier;

	/**
	 * The cached value of the '{@link #getProviderReference() <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderReference()
	 * @generated
	 * @ordered
	 */
	protected Reference providerReference;

	/**
	 * The cached value of the '{@link #getOrganizationIdentifier() <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier organizationIdentifier;

	/**
	 * The cached value of the '{@link #getOrganizationReference() <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference organizationReference;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Coding priority;

	/**
	 * The cached value of the '{@link #getEntererIdentifier() <em>Enterer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntererIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier entererIdentifier;

	/**
	 * The cached value of the '{@link #getEntererReference() <em>Enterer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntererReference()
	 * @generated
	 * @ordered
	 */
	protected Reference entererReference;

	/**
	 * The cached value of the '{@link #getFacilityIdentifier() <em>Facility Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier facilityIdentifier;

	/**
	 * The cached value of the '{@link #getFacilityReference() <em>Facility Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityReference()
	 * @generated
	 * @ordered
	 */
	protected Reference facilityReference;

	/**
	 * The cached value of the '{@link #getPatientIdentifier() <em>Patient Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier patientIdentifier;

	/**
	 * The cached value of the '{@link #getPatientReference() <em>Patient Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientReference()
	 * @generated
	 * @ordered
	 */
	protected Reference patientReference;

	/**
	 * The cached value of the '{@link #getCoverageIdentifier() <em>Coverage Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier coverageIdentifier;

	/**
	 * The cached value of the '{@link #getCoverageReference() <em>Coverage Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageReference()
	 * @generated
	 * @ordered
	 */
	protected Reference coverageReference;

	/**
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String businessArrangement;

	/**
	 * The cached value of the '{@link #getServicedDate() <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedDate()
	 * @generated
	 * @ordered
	 */
	protected Date servicedDate;

	/**
	 * The cached value of the '{@link #getServicedPeriod() <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicedPeriod;

	/**
	 * The cached value of the '{@link #getBenefitCategory() <em>Benefit Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitCategory()
	 * @generated
	 * @ordered
	 */
	protected Coding benefitCategory;

	/**
	 * The cached value of the '{@link #getBenefitSubCategory() <em>Benefit Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitSubCategory()
	 * @generated
	 * @ordered
	 */
	protected Coding benefitSubCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EligibilityRequestStatus newStatus, NotificationChain msgs) {
		EligibilityRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EligibilityRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(Coding newRuleset, NotificationChain msgs) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalRuleset(Coding newOriginalRuleset, NotificationChain msgs) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		if (newOriginalRuleset != originalRuleset) {
			NotificationChain msgs = null;
			if (originalRuleset != null)
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getInsurerIdentifier() {
		return insurerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurerIdentifier(Identifier newInsurerIdentifier, NotificationChain msgs) {
		Identifier oldInsurerIdentifier = insurerIdentifier;
		insurerIdentifier = newInsurerIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER, oldInsurerIdentifier, newInsurerIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurerIdentifier(Identifier newInsurerIdentifier) {
		if (newInsurerIdentifier != insurerIdentifier) {
			NotificationChain msgs = null;
			if (insurerIdentifier != null)
				msgs = ((InternalEObject)insurerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER, null, msgs);
			if (newInsurerIdentifier != null)
				msgs = ((InternalEObject)newInsurerIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER, null, msgs);
			msgs = basicSetInsurerIdentifier(newInsurerIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER, newInsurerIdentifier, newInsurerIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInsurerReference() {
		return insurerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurerReference(Reference newInsurerReference, NotificationChain msgs) {
		Reference oldInsurerReference = insurerReference;
		insurerReference = newInsurerReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE, oldInsurerReference, newInsurerReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurerReference(Reference newInsurerReference) {
		if (newInsurerReference != insurerReference) {
			NotificationChain msgs = null;
			if (insurerReference != null)
				msgs = ((InternalEObject)insurerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE, null, msgs);
			if (newInsurerReference != null)
				msgs = ((InternalEObject)newInsurerReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE, null, msgs);
			msgs = basicSetInsurerReference(newInsurerReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE, newInsurerReference, newInsurerReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getProviderIdentifier() {
		return providerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderIdentifier(Identifier newProviderIdentifier, NotificationChain msgs) {
		Identifier oldProviderIdentifier = providerIdentifier;
		providerIdentifier = newProviderIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER, oldProviderIdentifier, newProviderIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderIdentifier(Identifier newProviderIdentifier) {
		if (newProviderIdentifier != providerIdentifier) {
			NotificationChain msgs = null;
			if (providerIdentifier != null)
				msgs = ((InternalEObject)providerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER, null, msgs);
			if (newProviderIdentifier != null)
				msgs = ((InternalEObject)newProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetProviderIdentifier(newProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER, newProviderIdentifier, newProviderIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProviderReference() {
		return providerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderReference(Reference newProviderReference, NotificationChain msgs) {
		Reference oldProviderReference = providerReference;
		providerReference = newProviderReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE, oldProviderReference, newProviderReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderReference(Reference newProviderReference) {
		if (newProviderReference != providerReference) {
			NotificationChain msgs = null;
			if (providerReference != null)
				msgs = ((InternalEObject)providerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE, null, msgs);
			if (newProviderReference != null)
				msgs = ((InternalEObject)newProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetProviderReference(newProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE, newProviderReference, newProviderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOrganizationIdentifier() {
		return organizationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationIdentifier(Identifier newOrganizationIdentifier, NotificationChain msgs) {
		Identifier oldOrganizationIdentifier = organizationIdentifier;
		organizationIdentifier = newOrganizationIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER, oldOrganizationIdentifier, newOrganizationIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationIdentifier(Identifier newOrganizationIdentifier) {
		if (newOrganizationIdentifier != organizationIdentifier) {
			NotificationChain msgs = null;
			if (organizationIdentifier != null)
				msgs = ((InternalEObject)organizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER, null, msgs);
			if (newOrganizationIdentifier != null)
				msgs = ((InternalEObject)newOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetOrganizationIdentifier(newOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER, newOrganizationIdentifier, newOrganizationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganizationReference() {
		return organizationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationReference(Reference newOrganizationReference, NotificationChain msgs) {
		Reference oldOrganizationReference = organizationReference;
		organizationReference = newOrganizationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE, oldOrganizationReference, newOrganizationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationReference(Reference newOrganizationReference) {
		if (newOrganizationReference != organizationReference) {
			NotificationChain msgs = null;
			if (organizationReference != null)
				msgs = ((InternalEObject)organizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE, null, msgs);
			if (newOrganizationReference != null)
				msgs = ((InternalEObject)newOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetOrganizationReference(newOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE, newOrganizationReference, newOrganizationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Coding newPriority, NotificationChain msgs) {
		Coding oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Coding newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getEntererIdentifier() {
		return entererIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntererIdentifier(Identifier newEntererIdentifier, NotificationChain msgs) {
		Identifier oldEntererIdentifier = entererIdentifier;
		entererIdentifier = newEntererIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER, oldEntererIdentifier, newEntererIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntererIdentifier(Identifier newEntererIdentifier) {
		if (newEntererIdentifier != entererIdentifier) {
			NotificationChain msgs = null;
			if (entererIdentifier != null)
				msgs = ((InternalEObject)entererIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER, null, msgs);
			if (newEntererIdentifier != null)
				msgs = ((InternalEObject)newEntererIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER, null, msgs);
			msgs = basicSetEntererIdentifier(newEntererIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER, newEntererIdentifier, newEntererIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEntererReference() {
		return entererReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntererReference(Reference newEntererReference, NotificationChain msgs) {
		Reference oldEntererReference = entererReference;
		entererReference = newEntererReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE, oldEntererReference, newEntererReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntererReference(Reference newEntererReference) {
		if (newEntererReference != entererReference) {
			NotificationChain msgs = null;
			if (entererReference != null)
				msgs = ((InternalEObject)entererReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE, null, msgs);
			if (newEntererReference != null)
				msgs = ((InternalEObject)newEntererReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE, null, msgs);
			msgs = basicSetEntererReference(newEntererReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE, newEntererReference, newEntererReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getFacilityIdentifier() {
		return facilityIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityIdentifier(Identifier newFacilityIdentifier, NotificationChain msgs) {
		Identifier oldFacilityIdentifier = facilityIdentifier;
		facilityIdentifier = newFacilityIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER, oldFacilityIdentifier, newFacilityIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityIdentifier(Identifier newFacilityIdentifier) {
		if (newFacilityIdentifier != facilityIdentifier) {
			NotificationChain msgs = null;
			if (facilityIdentifier != null)
				msgs = ((InternalEObject)facilityIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER, null, msgs);
			if (newFacilityIdentifier != null)
				msgs = ((InternalEObject)newFacilityIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER, null, msgs);
			msgs = basicSetFacilityIdentifier(newFacilityIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER, newFacilityIdentifier, newFacilityIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFacilityReference() {
		return facilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityReference(Reference newFacilityReference, NotificationChain msgs) {
		Reference oldFacilityReference = facilityReference;
		facilityReference = newFacilityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE, oldFacilityReference, newFacilityReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityReference(Reference newFacilityReference) {
		if (newFacilityReference != facilityReference) {
			NotificationChain msgs = null;
			if (facilityReference != null)
				msgs = ((InternalEObject)facilityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE, null, msgs);
			if (newFacilityReference != null)
				msgs = ((InternalEObject)newFacilityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE, null, msgs);
			msgs = basicSetFacilityReference(newFacilityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE, newFacilityReference, newFacilityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPatientIdentifier() {
		return patientIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientIdentifier(Identifier newPatientIdentifier, NotificationChain msgs) {
		Identifier oldPatientIdentifier = patientIdentifier;
		patientIdentifier = newPatientIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER, oldPatientIdentifier, newPatientIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientIdentifier(Identifier newPatientIdentifier) {
		if (newPatientIdentifier != patientIdentifier) {
			NotificationChain msgs = null;
			if (patientIdentifier != null)
				msgs = ((InternalEObject)patientIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER, null, msgs);
			if (newPatientIdentifier != null)
				msgs = ((InternalEObject)newPatientIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER, null, msgs);
			msgs = basicSetPatientIdentifier(newPatientIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER, newPatientIdentifier, newPatientIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatientReference() {
		return patientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientReference(Reference newPatientReference, NotificationChain msgs) {
		Reference oldPatientReference = patientReference;
		patientReference = newPatientReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE, oldPatientReference, newPatientReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientReference(Reference newPatientReference) {
		if (newPatientReference != patientReference) {
			NotificationChain msgs = null;
			if (patientReference != null)
				msgs = ((InternalEObject)patientReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE, null, msgs);
			if (newPatientReference != null)
				msgs = ((InternalEObject)newPatientReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE, null, msgs);
			msgs = basicSetPatientReference(newPatientReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE, newPatientReference, newPatientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getCoverageIdentifier() {
		return coverageIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageIdentifier(Identifier newCoverageIdentifier, NotificationChain msgs) {
		Identifier oldCoverageIdentifier = coverageIdentifier;
		coverageIdentifier = newCoverageIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER, oldCoverageIdentifier, newCoverageIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageIdentifier(Identifier newCoverageIdentifier) {
		if (newCoverageIdentifier != coverageIdentifier) {
			NotificationChain msgs = null;
			if (coverageIdentifier != null)
				msgs = ((InternalEObject)coverageIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER, null, msgs);
			if (newCoverageIdentifier != null)
				msgs = ((InternalEObject)newCoverageIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER, null, msgs);
			msgs = basicSetCoverageIdentifier(newCoverageIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER, newCoverageIdentifier, newCoverageIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCoverageReference() {
		return coverageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageReference(Reference newCoverageReference, NotificationChain msgs) {
		Reference oldCoverageReference = coverageReference;
		coverageReference = newCoverageReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE, oldCoverageReference, newCoverageReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageReference(Reference newCoverageReference) {
		if (newCoverageReference != coverageReference) {
			NotificationChain msgs = null;
			if (coverageReference != null)
				msgs = ((InternalEObject)coverageReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE, null, msgs);
			if (newCoverageReference != null)
				msgs = ((InternalEObject)newCoverageReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE, null, msgs);
			msgs = basicSetCoverageReference(newCoverageReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE, newCoverageReference, newCoverageReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessArrangement(org.hl7.fhir.String newBusinessArrangement, NotificationChain msgs) {
		org.hl7.fhir.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, oldBusinessArrangement, newBusinessArrangement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(org.hl7.fhir.String newBusinessArrangement) {
		if (newBusinessArrangement != businessArrangement) {
			NotificationChain msgs = null;
			if (businessArrangement != null)
				msgs = ((InternalEObject)businessArrangement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, null, msgs);
			if (newBusinessArrangement != null)
				msgs = ((InternalEObject)newBusinessArrangement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, null, msgs);
			msgs = basicSetBusinessArrangement(newBusinessArrangement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, newBusinessArrangement, newBusinessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getServicedDate() {
		return servicedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedDate(Date newServicedDate, NotificationChain msgs) {
		Date oldServicedDate = servicedDate;
		servicedDate = newServicedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, oldServicedDate, newServicedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedDate(Date newServicedDate) {
		if (newServicedDate != servicedDate) {
			NotificationChain msgs = null;
			if (servicedDate != null)
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, newServicedDate, newServicedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getServicedPeriod() {
		return servicedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedPeriod(Period newServicedPeriod, NotificationChain msgs) {
		Period oldServicedPeriod = servicedPeriod;
		servicedPeriod = newServicedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedPeriod(Period newServicedPeriod) {
		if (newServicedPeriod != servicedPeriod) {
			NotificationChain msgs = null;
			if (servicedPeriod != null)
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBenefitCategory() {
		return benefitCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitCategory(Coding newBenefitCategory, NotificationChain msgs) {
		Coding oldBenefitCategory = benefitCategory;
		benefitCategory = newBenefitCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, oldBenefitCategory, newBenefitCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitCategory(Coding newBenefitCategory) {
		if (newBenefitCategory != benefitCategory) {
			NotificationChain msgs = null;
			if (benefitCategory != null)
				msgs = ((InternalEObject)benefitCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, null, msgs);
			if (newBenefitCategory != null)
				msgs = ((InternalEObject)newBenefitCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, null, msgs);
			msgs = basicSetBenefitCategory(newBenefitCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, newBenefitCategory, newBenefitCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBenefitSubCategory() {
		return benefitSubCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitSubCategory(Coding newBenefitSubCategory, NotificationChain msgs) {
		Coding oldBenefitSubCategory = benefitSubCategory;
		benefitSubCategory = newBenefitSubCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, oldBenefitSubCategory, newBenefitSubCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitSubCategory(Coding newBenefitSubCategory) {
		if (newBenefitSubCategory != benefitSubCategory) {
			NotificationChain msgs = null;
			if (benefitSubCategory != null)
				msgs = ((InternalEObject)benefitSubCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, null, msgs);
			if (newBenefitSubCategory != null)
				msgs = ((InternalEObject)newBenefitSubCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, null, msgs);
			msgs = basicSetBenefitSubCategory(newBenefitSubCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, newBenefitSubCategory, newBenefitSubCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER:
				return basicSetInsurerIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE:
				return basicSetInsurerReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER:
				return basicSetProviderIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE:
				return basicSetProviderReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER:
				return basicSetOrganizationIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE:
				return basicSetOrganizationReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER:
				return basicSetEntererIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE:
				return basicSetEntererReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER:
				return basicSetFacilityIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE:
				return basicSetFacilityReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER:
				return basicSetPatientIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE:
				return basicSetPatientReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER:
				return basicSetCoverageIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE:
				return basicSetCoverageReference(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return basicSetBusinessArrangement(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return basicSetBenefitCategory(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return basicSetBenefitSubCategory(null, msgs);
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.ELIGIBILITY_REQUEST__RULESET:
				return getRuleset();
			case FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				return getCreated();
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER:
				return getInsurerIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE:
				return getInsurerReference();
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER:
				return getProviderIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE:
				return getProviderReference();
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER:
				return getOrganizationIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE:
				return getOrganizationReference();
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER:
				return getEntererIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE:
				return getEntererReference();
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER:
				return getFacilityIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE:
				return getFacilityReference();
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER:
				return getPatientIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE:
				return getPatientReference();
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER:
				return getCoverageIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE:
				return getCoverageReference();
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return getBusinessArrangement();
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return getBenefitCategory();
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return getBenefitSubCategory();
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				setStatus((EligibilityRequestStatus)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER:
				setInsurerIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE:
				setInsurerReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE:
				setProviderReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER:
				setEntererIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE:
				setEntererReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER:
				setFacilityIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE:
				setFacilityReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER:
				setPatientIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE:
				setPatientReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER:
				setCoverageIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE:
				setCoverageReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				setBenefitCategory((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				setBenefitSubCategory((Coding)newValue);
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				setStatus((EligibilityRequestStatus)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER:
				setInsurerIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE:
				setInsurerReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE:
				setProviderReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER:
				setEntererIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE:
				setEntererReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER:
				setFacilityIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE:
				setFacilityReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER:
				setPatientIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE:
				setPatientReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER:
				setCoverageIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE:
				setCoverageReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				setBenefitCategory((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				setBenefitSubCategory((Coding)null);
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				return status != null;
			case FhirPackage.ELIGIBILITY_REQUEST__RULESET:
				return ruleset != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				return created != null;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_IDENTIFIER:
				return insurerIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER_REFERENCE:
				return insurerReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_IDENTIFIER:
				return providerIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER_REFERENCE:
				return providerReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_IDENTIFIER:
				return organizationIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION_REFERENCE:
				return organizationReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_IDENTIFIER:
				return entererIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER_REFERENCE:
				return entererReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_IDENTIFIER:
				return facilityIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY_REFERENCE:
				return facilityReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_IDENTIFIER:
				return patientIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT_REFERENCE:
				return patientReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_IDENTIFIER:
				return coverageIdentifier != null;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE_REFERENCE:
				return coverageReference != null;
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return benefitCategory != null;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return benefitSubCategory != null;
		}
		return super.eIsSet(featureID);
	}

} //EligibilityRequestImpl
