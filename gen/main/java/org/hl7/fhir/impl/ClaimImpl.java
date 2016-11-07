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

import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCoverage;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimInformation;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimMissingTeeth;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimStatus;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getInsurerIdentifier <em>Insurer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getInsurerReference <em>Insurer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEntererIdentifier <em>Enterer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEntererReference <em>Enterer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFacilityIdentifier <em>Facility Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFacilityReference <em>Facility Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPrescriptionIdentifier <em>Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPrescriptionReference <em>Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOriginalPrescriptionIdentifier <em>Original Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOriginalPrescriptionReference <em>Original Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getReferralIdentifier <em>Referral Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getReferralReference <em>Referral Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPatientIdentifier <em>Patient Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPatientReference <em>Patient Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getMissingTeeth <em>Missing Teeth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimImpl extends DomainResourceImpl implements Claim {
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
	protected ClaimStatus status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subType;

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
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

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
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Use use;

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
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected Coding fundsReserve;

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
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimRelated> related;

	/**
	 * The cached value of the '{@link #getPrescriptionIdentifier() <em>Prescription Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier prescriptionIdentifier;

	/**
	 * The cached value of the '{@link #getPrescriptionReference() <em>Prescription Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference prescriptionReference;

	/**
	 * The cached value of the '{@link #getOriginalPrescriptionIdentifier() <em>Original Prescription Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescriptionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier originalPrescriptionIdentifier;

	/**
	 * The cached value of the '{@link #getOriginalPrescriptionReference() <em>Original Prescription Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescriptionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference originalPrescriptionReference;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ClaimPayee payee;

	/**
	 * The cached value of the '{@link #getReferralIdentifier() <em>Referral Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier referralIdentifier;

	/**
	 * The cached value of the '{@link #getReferralReference() <em>Referral Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralReference()
	 * @generated
	 * @ordered
	 */
	protected Reference referralReference;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimInformation> information;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimProcedure> procedure;

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
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimCoverage> coverage;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected ClaimAccident accident;

	/**
	 * The cached value of the '{@link #getEmploymentImpacted() <em>Employment Impacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentImpacted()
	 * @generated
	 * @ordered
	 */
	protected Period employmentImpacted;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected Period hospitalization;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimItem> item;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected Money total;

	/**
	 * The cached value of the '{@link #getMissingTeeth() <em>Missing Teeth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingTeeth()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimMissingTeeth> missingTeeth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubType() {
		if (subType == null) {
			subType = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM__SUB_TYPE);
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ClaimStatus newStatus, NotificationChain msgs) {
		ClaimStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ClaimStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__RULESET, oldRuleset, newRuleset);
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
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__RULESET, newRuleset, newRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
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
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillablePeriod(Period newBillablePeriod, NotificationChain msgs) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__BILLABLE_PERIOD, oldBillablePeriod, newBillablePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillablePeriod(Period newBillablePeriod) {
		if (newBillablePeriod != billablePeriod) {
			NotificationChain msgs = null;
			if (billablePeriod != null)
				msgs = ((InternalEObject)billablePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__BILLABLE_PERIOD, null, msgs);
			if (newBillablePeriod != null)
				msgs = ((InternalEObject)newBillablePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__BILLABLE_PERIOD, null, msgs);
			msgs = basicSetBillablePeriod(newBillablePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__BILLABLE_PERIOD, newBillablePeriod, newBillablePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__INSURER_IDENTIFIER, oldInsurerIdentifier, newInsurerIdentifier);
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
				msgs = ((InternalEObject)insurerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__INSURER_IDENTIFIER, null, msgs);
			if (newInsurerIdentifier != null)
				msgs = ((InternalEObject)newInsurerIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__INSURER_IDENTIFIER, null, msgs);
			msgs = basicSetInsurerIdentifier(newInsurerIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__INSURER_IDENTIFIER, newInsurerIdentifier, newInsurerIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__INSURER_REFERENCE, oldInsurerReference, newInsurerReference);
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
				msgs = ((InternalEObject)insurerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__INSURER_REFERENCE, null, msgs);
			if (newInsurerReference != null)
				msgs = ((InternalEObject)newInsurerReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__INSURER_REFERENCE, null, msgs);
			msgs = basicSetInsurerReference(newInsurerReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__INSURER_REFERENCE, newInsurerReference, newInsurerReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PROVIDER_IDENTIFIER, oldProviderIdentifier, newProviderIdentifier);
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
				msgs = ((InternalEObject)providerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PROVIDER_IDENTIFIER, null, msgs);
			if (newProviderIdentifier != null)
				msgs = ((InternalEObject)newProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetProviderIdentifier(newProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PROVIDER_IDENTIFIER, newProviderIdentifier, newProviderIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PROVIDER_REFERENCE, oldProviderReference, newProviderReference);
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
				msgs = ((InternalEObject)providerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PROVIDER_REFERENCE, null, msgs);
			if (newProviderReference != null)
				msgs = ((InternalEObject)newProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetProviderReference(newProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PROVIDER_REFERENCE, newProviderReference, newProviderReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER, oldOrganizationIdentifier, newOrganizationIdentifier);
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
				msgs = ((InternalEObject)organizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER, null, msgs);
			if (newOrganizationIdentifier != null)
				msgs = ((InternalEObject)newOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetOrganizationIdentifier(newOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER, newOrganizationIdentifier, newOrganizationIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORGANIZATION_REFERENCE, oldOrganizationReference, newOrganizationReference);
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
				msgs = ((InternalEObject)organizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORGANIZATION_REFERENCE, null, msgs);
			if (newOrganizationReference != null)
				msgs = ((InternalEObject)newOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetOrganizationReference(newOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORGANIZATION_REFERENCE, newOrganizationReference, newOrganizationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Use newUse, NotificationChain msgs) {
		Use oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Use newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__USE, newUse, newUse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundsReserve(Coding newFundsReserve, NotificationChain msgs) {
		Coding oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, newFundsReserve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundsReserve(Coding newFundsReserve) {
		if (newFundsReserve != fundsReserve) {
			NotificationChain msgs = null;
			if (fundsReserve != null)
				msgs = ((InternalEObject)fundsReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FUNDS_RESERVE, null, msgs);
			if (newFundsReserve != null)
				msgs = ((InternalEObject)newFundsReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FUNDS_RESERVE, null, msgs);
			msgs = basicSetFundsReserve(newFundsReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FUNDS_RESERVE, newFundsReserve, newFundsReserve));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ENTERER_IDENTIFIER, oldEntererIdentifier, newEntererIdentifier);
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
				msgs = ((InternalEObject)entererIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ENTERER_IDENTIFIER, null, msgs);
			if (newEntererIdentifier != null)
				msgs = ((InternalEObject)newEntererIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ENTERER_IDENTIFIER, null, msgs);
			msgs = basicSetEntererIdentifier(newEntererIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ENTERER_IDENTIFIER, newEntererIdentifier, newEntererIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ENTERER_REFERENCE, oldEntererReference, newEntererReference);
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
				msgs = ((InternalEObject)entererReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ENTERER_REFERENCE, null, msgs);
			if (newEntererReference != null)
				msgs = ((InternalEObject)newEntererReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ENTERER_REFERENCE, null, msgs);
			msgs = basicSetEntererReference(newEntererReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ENTERER_REFERENCE, newEntererReference, newEntererReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FACILITY_IDENTIFIER, oldFacilityIdentifier, newFacilityIdentifier);
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
				msgs = ((InternalEObject)facilityIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FACILITY_IDENTIFIER, null, msgs);
			if (newFacilityIdentifier != null)
				msgs = ((InternalEObject)newFacilityIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FACILITY_IDENTIFIER, null, msgs);
			msgs = basicSetFacilityIdentifier(newFacilityIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FACILITY_IDENTIFIER, newFacilityIdentifier, newFacilityIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FACILITY_REFERENCE, oldFacilityReference, newFacilityReference);
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
				msgs = ((InternalEObject)facilityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FACILITY_REFERENCE, null, msgs);
			if (newFacilityReference != null)
				msgs = ((InternalEObject)newFacilityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FACILITY_REFERENCE, null, msgs);
			msgs = basicSetFacilityReference(newFacilityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FACILITY_REFERENCE, newFacilityReference, newFacilityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<ClaimRelated>(ClaimRelated.class, this, FhirPackage.CLAIM__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPrescriptionIdentifier() {
		return prescriptionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptionIdentifier(Identifier newPrescriptionIdentifier, NotificationChain msgs) {
		Identifier oldPrescriptionIdentifier = prescriptionIdentifier;
		prescriptionIdentifier = newPrescriptionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER, oldPrescriptionIdentifier, newPrescriptionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptionIdentifier(Identifier newPrescriptionIdentifier) {
		if (newPrescriptionIdentifier != prescriptionIdentifier) {
			NotificationChain msgs = null;
			if (prescriptionIdentifier != null)
				msgs = ((InternalEObject)prescriptionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER, null, msgs);
			if (newPrescriptionIdentifier != null)
				msgs = ((InternalEObject)newPrescriptionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER, null, msgs);
			msgs = basicSetPrescriptionIdentifier(newPrescriptionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER, newPrescriptionIdentifier, newPrescriptionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescriptionReference() {
		return prescriptionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptionReference(Reference newPrescriptionReference, NotificationChain msgs) {
		Reference oldPrescriptionReference = prescriptionReference;
		prescriptionReference = newPrescriptionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRESCRIPTION_REFERENCE, oldPrescriptionReference, newPrescriptionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptionReference(Reference newPrescriptionReference) {
		if (newPrescriptionReference != prescriptionReference) {
			NotificationChain msgs = null;
			if (prescriptionReference != null)
				msgs = ((InternalEObject)prescriptionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRESCRIPTION_REFERENCE, null, msgs);
			if (newPrescriptionReference != null)
				msgs = ((InternalEObject)newPrescriptionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRESCRIPTION_REFERENCE, null, msgs);
			msgs = basicSetPrescriptionReference(newPrescriptionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRESCRIPTION_REFERENCE, newPrescriptionReference, newPrescriptionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOriginalPrescriptionIdentifier() {
		return originalPrescriptionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescriptionIdentifier(Identifier newOriginalPrescriptionIdentifier, NotificationChain msgs) {
		Identifier oldOriginalPrescriptionIdentifier = originalPrescriptionIdentifier;
		originalPrescriptionIdentifier = newOriginalPrescriptionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER, oldOriginalPrescriptionIdentifier, newOriginalPrescriptionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescriptionIdentifier(Identifier newOriginalPrescriptionIdentifier) {
		if (newOriginalPrescriptionIdentifier != originalPrescriptionIdentifier) {
			NotificationChain msgs = null;
			if (originalPrescriptionIdentifier != null)
				msgs = ((InternalEObject)originalPrescriptionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER, null, msgs);
			if (newOriginalPrescriptionIdentifier != null)
				msgs = ((InternalEObject)newOriginalPrescriptionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER, null, msgs);
			msgs = basicSetOriginalPrescriptionIdentifier(newOriginalPrescriptionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER, newOriginalPrescriptionIdentifier, newOriginalPrescriptionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOriginalPrescriptionReference() {
		return originalPrescriptionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescriptionReference(Reference newOriginalPrescriptionReference, NotificationChain msgs) {
		Reference oldOriginalPrescriptionReference = originalPrescriptionReference;
		originalPrescriptionReference = newOriginalPrescriptionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE, oldOriginalPrescriptionReference, newOriginalPrescriptionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescriptionReference(Reference newOriginalPrescriptionReference) {
		if (newOriginalPrescriptionReference != originalPrescriptionReference) {
			NotificationChain msgs = null;
			if (originalPrescriptionReference != null)
				msgs = ((InternalEObject)originalPrescriptionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE, null, msgs);
			if (newOriginalPrescriptionReference != null)
				msgs = ((InternalEObject)newOriginalPrescriptionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE, null, msgs);
			msgs = basicSetOriginalPrescriptionReference(newOriginalPrescriptionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE, newOriginalPrescriptionReference, newOriginalPrescriptionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ClaimPayee newPayee, NotificationChain msgs) {
		ClaimPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ClaimPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getReferralIdentifier() {
		return referralIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferralIdentifier(Identifier newReferralIdentifier, NotificationChain msgs) {
		Identifier oldReferralIdentifier = referralIdentifier;
		referralIdentifier = newReferralIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__REFERRAL_IDENTIFIER, oldReferralIdentifier, newReferralIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferralIdentifier(Identifier newReferralIdentifier) {
		if (newReferralIdentifier != referralIdentifier) {
			NotificationChain msgs = null;
			if (referralIdentifier != null)
				msgs = ((InternalEObject)referralIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__REFERRAL_IDENTIFIER, null, msgs);
			if (newReferralIdentifier != null)
				msgs = ((InternalEObject)newReferralIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__REFERRAL_IDENTIFIER, null, msgs);
			msgs = basicSetReferralIdentifier(newReferralIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__REFERRAL_IDENTIFIER, newReferralIdentifier, newReferralIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferralReference() {
		return referralReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferralReference(Reference newReferralReference, NotificationChain msgs) {
		Reference oldReferralReference = referralReference;
		referralReference = newReferralReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__REFERRAL_REFERENCE, oldReferralReference, newReferralReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferralReference(Reference newReferralReference) {
		if (newReferralReference != referralReference) {
			NotificationChain msgs = null;
			if (referralReference != null)
				msgs = ((InternalEObject)referralReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__REFERRAL_REFERENCE, null, msgs);
			if (newReferralReference != null)
				msgs = ((InternalEObject)newReferralReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__REFERRAL_REFERENCE, null, msgs);
			msgs = basicSetReferralReference(newReferralReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__REFERRAL_REFERENCE, newReferralReference, newReferralReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimInformation> getInformation() {
		if (information == null) {
			information = new EObjectContainmentEList<ClaimInformation>(ClaimInformation.class, this, FhirPackage.CLAIM__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ClaimDiagnosis>(ClaimDiagnosis.class, this, FhirPackage.CLAIM__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimProcedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<ClaimProcedure>(ClaimProcedure.class, this, FhirPackage.CLAIM__PROCEDURE);
		}
		return procedure;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PATIENT_IDENTIFIER, oldPatientIdentifier, newPatientIdentifier);
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
				msgs = ((InternalEObject)patientIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PATIENT_IDENTIFIER, null, msgs);
			if (newPatientIdentifier != null)
				msgs = ((InternalEObject)newPatientIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PATIENT_IDENTIFIER, null, msgs);
			msgs = basicSetPatientIdentifier(newPatientIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PATIENT_IDENTIFIER, newPatientIdentifier, newPatientIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PATIENT_REFERENCE, oldPatientReference, newPatientReference);
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
				msgs = ((InternalEObject)patientReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PATIENT_REFERENCE, null, msgs);
			if (newPatientReference != null)
				msgs = ((InternalEObject)newPatientReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PATIENT_REFERENCE, null, msgs);
			msgs = basicSetPatientReference(newPatientReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PATIENT_REFERENCE, newPatientReference, newPatientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimCoverage> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<ClaimCoverage>(ClaimCoverage.class, this, FhirPackage.CLAIM__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimAccident getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(ClaimAccident newAccident, NotificationChain msgs) {
		ClaimAccident oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ACCIDENT, oldAccident, newAccident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccident(ClaimAccident newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ACCIDENT, newAccident, newAccident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEmploymentImpacted() {
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmploymentImpacted(Period newEmploymentImpacted, NotificationChain msgs) {
		Period oldEmploymentImpacted = employmentImpacted;
		employmentImpacted = newEmploymentImpacted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, newEmploymentImpacted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentImpacted(Period newEmploymentImpacted) {
		if (newEmploymentImpacted != employmentImpacted) {
			NotificationChain msgs = null;
			if (employmentImpacted != null)
				msgs = ((InternalEObject)employmentImpacted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__EMPLOYMENT_IMPACTED, null, msgs);
			if (newEmploymentImpacted != null)
				msgs = ((InternalEObject)newEmploymentImpacted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__EMPLOYMENT_IMPACTED, null, msgs);
			msgs = basicSetEmploymentImpacted(newEmploymentImpacted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__EMPLOYMENT_IMPACTED, newEmploymentImpacted, newEmploymentImpacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHospitalization(Period newHospitalization, NotificationChain msgs) {
		Period oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__HOSPITALIZATION, oldHospitalization, newHospitalization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(Period newHospitalization) {
		if (newHospitalization != hospitalization) {
			NotificationChain msgs = null;
			if (hospitalization != null)
				msgs = ((InternalEObject)hospitalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__HOSPITALIZATION, null, msgs);
			if (newHospitalization != null)
				msgs = ((InternalEObject)newHospitalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__HOSPITALIZATION, null, msgs);
			msgs = basicSetHospitalization(newHospitalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__HOSPITALIZATION, newHospitalization, newHospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ClaimItem>(ClaimItem.class, this, FhirPackage.CLAIM__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(Money newTotal, NotificationChain msgs) {
		Money oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TOTAL, oldTotal, newTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(Money newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject)total).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject)newTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TOTAL, newTotal, newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimMissingTeeth> getMissingTeeth() {
		if (missingTeeth == null) {
			missingTeeth = new EObjectContainmentEList<ClaimMissingTeeth>(ClaimMissingTeeth.class, this, FhirPackage.CLAIM__MISSING_TEETH);
		}
		return missingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CLAIM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.CLAIM__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.CLAIM__BILLABLE_PERIOD:
				return basicSetBillablePeriod(null, msgs);
			case FhirPackage.CLAIM__INSURER_IDENTIFIER:
				return basicSetInsurerIdentifier(null, msgs);
			case FhirPackage.CLAIM__INSURER_REFERENCE:
				return basicSetInsurerReference(null, msgs);
			case FhirPackage.CLAIM__PROVIDER_IDENTIFIER:
				return basicSetProviderIdentifier(null, msgs);
			case FhirPackage.CLAIM__PROVIDER_REFERENCE:
				return basicSetProviderReference(null, msgs);
			case FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER:
				return basicSetOrganizationIdentifier(null, msgs);
			case FhirPackage.CLAIM__ORGANIZATION_REFERENCE:
				return basicSetOrganizationReference(null, msgs);
			case FhirPackage.CLAIM__USE:
				return basicSetUse(null, msgs);
			case FhirPackage.CLAIM__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				return basicSetFundsReserve(null, msgs);
			case FhirPackage.CLAIM__ENTERER_IDENTIFIER:
				return basicSetEntererIdentifier(null, msgs);
			case FhirPackage.CLAIM__ENTERER_REFERENCE:
				return basicSetEntererReference(null, msgs);
			case FhirPackage.CLAIM__FACILITY_IDENTIFIER:
				return basicSetFacilityIdentifier(null, msgs);
			case FhirPackage.CLAIM__FACILITY_REFERENCE:
				return basicSetFacilityReference(null, msgs);
			case FhirPackage.CLAIM__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER:
				return basicSetPrescriptionIdentifier(null, msgs);
			case FhirPackage.CLAIM__PRESCRIPTION_REFERENCE:
				return basicSetPrescriptionReference(null, msgs);
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				return basicSetOriginalPrescriptionIdentifier(null, msgs);
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE:
				return basicSetOriginalPrescriptionReference(null, msgs);
			case FhirPackage.CLAIM__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.CLAIM__REFERRAL_IDENTIFIER:
				return basicSetReferralIdentifier(null, msgs);
			case FhirPackage.CLAIM__REFERRAL_REFERENCE:
				return basicSetReferralReference(null, msgs);
			case FhirPackage.CLAIM__INFORMATION:
				return ((InternalEList<?>)getInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__PATIENT_IDENTIFIER:
				return basicSetPatientIdentifier(null, msgs);
			case FhirPackage.CLAIM__PATIENT_REFERENCE:
				return basicSetPatientReference(null, msgs);
			case FhirPackage.CLAIM__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__ACCIDENT:
				return basicSetAccident(null, msgs);
			case FhirPackage.CLAIM__EMPLOYMENT_IMPACTED:
				return basicSetEmploymentImpacted(null, msgs);
			case FhirPackage.CLAIM__HOSPITALIZATION:
				return basicSetHospitalization(null, msgs);
			case FhirPackage.CLAIM__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__TOTAL:
				return basicSetTotal(null, msgs);
			case FhirPackage.CLAIM__MISSING_TEETH:
				return ((InternalEList<?>)getMissingTeeth()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLAIM__STATUS:
				return getStatus();
			case FhirPackage.CLAIM__TYPE:
				return getType();
			case FhirPackage.CLAIM__SUB_TYPE:
				return getSubType();
			case FhirPackage.CLAIM__RULESET:
				return getRuleset();
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.CLAIM__CREATED:
				return getCreated();
			case FhirPackage.CLAIM__BILLABLE_PERIOD:
				return getBillablePeriod();
			case FhirPackage.CLAIM__INSURER_IDENTIFIER:
				return getInsurerIdentifier();
			case FhirPackage.CLAIM__INSURER_REFERENCE:
				return getInsurerReference();
			case FhirPackage.CLAIM__PROVIDER_IDENTIFIER:
				return getProviderIdentifier();
			case FhirPackage.CLAIM__PROVIDER_REFERENCE:
				return getProviderReference();
			case FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER:
				return getOrganizationIdentifier();
			case FhirPackage.CLAIM__ORGANIZATION_REFERENCE:
				return getOrganizationReference();
			case FhirPackage.CLAIM__USE:
				return getUse();
			case FhirPackage.CLAIM__PRIORITY:
				return getPriority();
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				return getFundsReserve();
			case FhirPackage.CLAIM__ENTERER_IDENTIFIER:
				return getEntererIdentifier();
			case FhirPackage.CLAIM__ENTERER_REFERENCE:
				return getEntererReference();
			case FhirPackage.CLAIM__FACILITY_IDENTIFIER:
				return getFacilityIdentifier();
			case FhirPackage.CLAIM__FACILITY_REFERENCE:
				return getFacilityReference();
			case FhirPackage.CLAIM__RELATED:
				return getRelated();
			case FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER:
				return getPrescriptionIdentifier();
			case FhirPackage.CLAIM__PRESCRIPTION_REFERENCE:
				return getPrescriptionReference();
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				return getOriginalPrescriptionIdentifier();
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE:
				return getOriginalPrescriptionReference();
			case FhirPackage.CLAIM__PAYEE:
				return getPayee();
			case FhirPackage.CLAIM__REFERRAL_IDENTIFIER:
				return getReferralIdentifier();
			case FhirPackage.CLAIM__REFERRAL_REFERENCE:
				return getReferralReference();
			case FhirPackage.CLAIM__INFORMATION:
				return getInformation();
			case FhirPackage.CLAIM__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.CLAIM__PROCEDURE:
				return getProcedure();
			case FhirPackage.CLAIM__PATIENT_IDENTIFIER:
				return getPatientIdentifier();
			case FhirPackage.CLAIM__PATIENT_REFERENCE:
				return getPatientReference();
			case FhirPackage.CLAIM__COVERAGE:
				return getCoverage();
			case FhirPackage.CLAIM__ACCIDENT:
				return getAccident();
			case FhirPackage.CLAIM__EMPLOYMENT_IMPACTED:
				return getEmploymentImpacted();
			case FhirPackage.CLAIM__HOSPITALIZATION:
				return getHospitalization();
			case FhirPackage.CLAIM__ITEM:
				return getItem();
			case FhirPackage.CLAIM__TOTAL:
				return getTotal();
			case FhirPackage.CLAIM__MISSING_TEETH:
				return getMissingTeeth();
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
			case FhirPackage.CLAIM__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM__STATUS:
				setStatus((ClaimStatus)newValue);
				return;
			case FhirPackage.CLAIM__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.CLAIM__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.CLAIM__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FhirPackage.CLAIM__INSURER_IDENTIFIER:
				setInsurerIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__INSURER_REFERENCE:
				setInsurerReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__PROVIDER_REFERENCE:
				setProviderReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__USE:
				setUse((Use)newValue);
				return;
			case FhirPackage.CLAIM__PRIORITY:
				setPriority((Coding)newValue);
				return;
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((Coding)newValue);
				return;
			case FhirPackage.CLAIM__ENTERER_IDENTIFIER:
				setEntererIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__ENTERER_REFERENCE:
				setEntererReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__FACILITY_IDENTIFIER:
				setFacilityIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__FACILITY_REFERENCE:
				setFacilityReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends ClaimRelated>)newValue);
				return;
			case FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER:
				setPrescriptionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__PRESCRIPTION_REFERENCE:
				setPrescriptionReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				setOriginalPrescriptionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE:
				setOriginalPrescriptionReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)newValue);
				return;
			case FhirPackage.CLAIM__REFERRAL_IDENTIFIER:
				setReferralIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__REFERRAL_REFERENCE:
				setReferralReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__INFORMATION:
				getInformation().clear();
				getInformation().addAll((Collection<? extends ClaimInformation>)newValue);
				return;
			case FhirPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ClaimDiagnosis>)newValue);
				return;
			case FhirPackage.CLAIM__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ClaimProcedure>)newValue);
				return;
			case FhirPackage.CLAIM__PATIENT_IDENTIFIER:
				setPatientIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM__PATIENT_REFERENCE:
				setPatientReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends ClaimCoverage>)newValue);
				return;
			case FhirPackage.CLAIM__ACCIDENT:
				setAccident((ClaimAccident)newValue);
				return;
			case FhirPackage.CLAIM__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case FhirPackage.CLAIM__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case FhirPackage.CLAIM__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ClaimItem>)newValue);
				return;
			case FhirPackage.CLAIM__TOTAL:
				setTotal((Money)newValue);
				return;
			case FhirPackage.CLAIM__MISSING_TEETH:
				getMissingTeeth().clear();
				getMissingTeeth().addAll((Collection<? extends ClaimMissingTeeth>)newValue);
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
			case FhirPackage.CLAIM__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLAIM__STATUS:
				setStatus((ClaimStatus)null);
				return;
			case FhirPackage.CLAIM__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.CLAIM__SUB_TYPE:
				getSubType().clear();
				return;
			case FhirPackage.CLAIM__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.CLAIM__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FhirPackage.CLAIM__INSURER_IDENTIFIER:
				setInsurerIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__INSURER_REFERENCE:
				setInsurerReference((Reference)null);
				return;
			case FhirPackage.CLAIM__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__PROVIDER_REFERENCE:
				setProviderReference((Reference)null);
				return;
			case FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)null);
				return;
			case FhirPackage.CLAIM__USE:
				setUse((Use)null);
				return;
			case FhirPackage.CLAIM__PRIORITY:
				setPriority((Coding)null);
				return;
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((Coding)null);
				return;
			case FhirPackage.CLAIM__ENTERER_IDENTIFIER:
				setEntererIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__ENTERER_REFERENCE:
				setEntererReference((Reference)null);
				return;
			case FhirPackage.CLAIM__FACILITY_IDENTIFIER:
				setFacilityIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__FACILITY_REFERENCE:
				setFacilityReference((Reference)null);
				return;
			case FhirPackage.CLAIM__RELATED:
				getRelated().clear();
				return;
			case FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER:
				setPrescriptionIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__PRESCRIPTION_REFERENCE:
				setPrescriptionReference((Reference)null);
				return;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				setOriginalPrescriptionIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE:
				setOriginalPrescriptionReference((Reference)null);
				return;
			case FhirPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)null);
				return;
			case FhirPackage.CLAIM__REFERRAL_IDENTIFIER:
				setReferralIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__REFERRAL_REFERENCE:
				setReferralReference((Reference)null);
				return;
			case FhirPackage.CLAIM__INFORMATION:
				getInformation().clear();
				return;
			case FhirPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.CLAIM__PROCEDURE:
				getProcedure().clear();
				return;
			case FhirPackage.CLAIM__PATIENT_IDENTIFIER:
				setPatientIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM__PATIENT_REFERENCE:
				setPatientReference((Reference)null);
				return;
			case FhirPackage.CLAIM__COVERAGE:
				getCoverage().clear();
				return;
			case FhirPackage.CLAIM__ACCIDENT:
				setAccident((ClaimAccident)null);
				return;
			case FhirPackage.CLAIM__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case FhirPackage.CLAIM__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case FhirPackage.CLAIM__ITEM:
				getItem().clear();
				return;
			case FhirPackage.CLAIM__TOTAL:
				setTotal((Money)null);
				return;
			case FhirPackage.CLAIM__MISSING_TEETH:
				getMissingTeeth().clear();
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
			case FhirPackage.CLAIM__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLAIM__STATUS:
				return status != null;
			case FhirPackage.CLAIM__TYPE:
				return type != null;
			case FhirPackage.CLAIM__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case FhirPackage.CLAIM__RULESET:
				return ruleset != null;
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.CLAIM__CREATED:
				return created != null;
			case FhirPackage.CLAIM__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FhirPackage.CLAIM__INSURER_IDENTIFIER:
				return insurerIdentifier != null;
			case FhirPackage.CLAIM__INSURER_REFERENCE:
				return insurerReference != null;
			case FhirPackage.CLAIM__PROVIDER_IDENTIFIER:
				return providerIdentifier != null;
			case FhirPackage.CLAIM__PROVIDER_REFERENCE:
				return providerReference != null;
			case FhirPackage.CLAIM__ORGANIZATION_IDENTIFIER:
				return organizationIdentifier != null;
			case FhirPackage.CLAIM__ORGANIZATION_REFERENCE:
				return organizationReference != null;
			case FhirPackage.CLAIM__USE:
				return use != null;
			case FhirPackage.CLAIM__PRIORITY:
				return priority != null;
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				return fundsReserve != null;
			case FhirPackage.CLAIM__ENTERER_IDENTIFIER:
				return entererIdentifier != null;
			case FhirPackage.CLAIM__ENTERER_REFERENCE:
				return entererReference != null;
			case FhirPackage.CLAIM__FACILITY_IDENTIFIER:
				return facilityIdentifier != null;
			case FhirPackage.CLAIM__FACILITY_REFERENCE:
				return facilityReference != null;
			case FhirPackage.CLAIM__RELATED:
				return related != null && !related.isEmpty();
			case FhirPackage.CLAIM__PRESCRIPTION_IDENTIFIER:
				return prescriptionIdentifier != null;
			case FhirPackage.CLAIM__PRESCRIPTION_REFERENCE:
				return prescriptionReference != null;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				return originalPrescriptionIdentifier != null;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION_REFERENCE:
				return originalPrescriptionReference != null;
			case FhirPackage.CLAIM__PAYEE:
				return payee != null;
			case FhirPackage.CLAIM__REFERRAL_IDENTIFIER:
				return referralIdentifier != null;
			case FhirPackage.CLAIM__REFERRAL_REFERENCE:
				return referralReference != null;
			case FhirPackage.CLAIM__INFORMATION:
				return information != null && !information.isEmpty();
			case FhirPackage.CLAIM__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.CLAIM__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FhirPackage.CLAIM__PATIENT_IDENTIFIER:
				return patientIdentifier != null;
			case FhirPackage.CLAIM__PATIENT_REFERENCE:
				return patientReference != null;
			case FhirPackage.CLAIM__COVERAGE:
				return coverage != null && !coverage.isEmpty();
			case FhirPackage.CLAIM__ACCIDENT:
				return accident != null;
			case FhirPackage.CLAIM__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case FhirPackage.CLAIM__HOSPITALIZATION:
				return hospitalization != null;
			case FhirPackage.CLAIM__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.CLAIM__TOTAL:
				return total != null;
			case FhirPackage.CLAIM__MISSING_TEETH:
				return missingTeeth != null && !missingTeeth.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
