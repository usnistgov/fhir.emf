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
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIssuerIdentifier <em>Issuer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIssuerReference <em>Issuer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIsAgreement <em>Is Agreement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getBin <em>Bin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPlanholderIdentifier <em>Planholder Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPlanholderReference <em>Planholder Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getBeneficiaryIdentifier <em>Beneficiary Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getBeneficiaryReference <em>Beneficiary Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubGroup <em>Sub Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends DomainResourceImpl implements Coverage {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CoverageStatus status;

	/**
	 * The cached value of the '{@link #getIssuerIdentifier() <em>Issuer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier issuerIdentifier;

	/**
	 * The cached value of the '{@link #getIssuerReference() <em>Issuer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerReference()
	 * @generated
	 * @ordered
	 */
	protected Reference issuerReference;

	/**
	 * The cached value of the '{@link #getIsAgreement() <em>Is Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAgreement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isAgreement;

	/**
	 * The cached value of the '{@link #getBin() <em>Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String bin;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getPlanholderIdentifier() <em>Planholder Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanholderIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier planholderIdentifier;

	/**
	 * The cached value of the '{@link #getPlanholderReference() <em>Planholder Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanholderReference()
	 * @generated
	 * @ordered
	 */
	protected Reference planholderReference;

	/**
	 * The cached value of the '{@link #getBeneficiaryIdentifier() <em>Beneficiary Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier beneficiaryIdentifier;

	/**
	 * The cached value of the '{@link #getBeneficiaryReference() <em>Beneficiary Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiaryReference()
	 * @generated
	 * @ordered
	 */
	protected Reference beneficiaryReference;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Coding relationship;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String group;

	/**
	 * The cached value of the '{@link #getSubGroup() <em>Sub Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroup()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subGroup;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String plan;

	/**
	 * The cached value of the '{@link #getSubPlan() <em>Sub Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPlan()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subPlan;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String class_;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt dependent;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String network;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CoverageStatus newStatus, NotificationChain msgs) {
		CoverageStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CoverageStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIssuerIdentifier() {
		return issuerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuerIdentifier(Identifier newIssuerIdentifier, NotificationChain msgs) {
		Identifier oldIssuerIdentifier = issuerIdentifier;
		issuerIdentifier = newIssuerIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ISSUER_IDENTIFIER, oldIssuerIdentifier, newIssuerIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerIdentifier(Identifier newIssuerIdentifier) {
		if (newIssuerIdentifier != issuerIdentifier) {
			NotificationChain msgs = null;
			if (issuerIdentifier != null)
				msgs = ((InternalEObject)issuerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ISSUER_IDENTIFIER, null, msgs);
			if (newIssuerIdentifier != null)
				msgs = ((InternalEObject)newIssuerIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ISSUER_IDENTIFIER, null, msgs);
			msgs = basicSetIssuerIdentifier(newIssuerIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ISSUER_IDENTIFIER, newIssuerIdentifier, newIssuerIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getIssuerReference() {
		return issuerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuerReference(Reference newIssuerReference, NotificationChain msgs) {
		Reference oldIssuerReference = issuerReference;
		issuerReference = newIssuerReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ISSUER_REFERENCE, oldIssuerReference, newIssuerReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerReference(Reference newIssuerReference) {
		if (newIssuerReference != issuerReference) {
			NotificationChain msgs = null;
			if (issuerReference != null)
				msgs = ((InternalEObject)issuerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ISSUER_REFERENCE, null, msgs);
			if (newIssuerReference != null)
				msgs = ((InternalEObject)newIssuerReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ISSUER_REFERENCE, null, msgs);
			msgs = basicSetIssuerReference(newIssuerReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ISSUER_REFERENCE, newIssuerReference, newIssuerReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsAgreement() {
		return isAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsAgreement(org.hl7.fhir.Boolean newIsAgreement, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsAgreement = isAgreement;
		isAgreement = newIsAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__IS_AGREEMENT, oldIsAgreement, newIsAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAgreement(org.hl7.fhir.Boolean newIsAgreement) {
		if (newIsAgreement != isAgreement) {
			NotificationChain msgs = null;
			if (isAgreement != null)
				msgs = ((InternalEObject)isAgreement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__IS_AGREEMENT, null, msgs);
			if (newIsAgreement != null)
				msgs = ((InternalEObject)newIsAgreement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__IS_AGREEMENT, null, msgs);
			msgs = basicSetIsAgreement(newIsAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__IS_AGREEMENT, newIsAgreement, newIsAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getBin() {
		return bin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBin(org.hl7.fhir.String newBin, NotificationChain msgs) {
		org.hl7.fhir.String oldBin = bin;
		bin = newBin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BIN, oldBin, newBin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBin(org.hl7.fhir.String newBin) {
		if (newBin != bin) {
			NotificationChain msgs = null;
			if (bin != null)
				msgs = ((InternalEObject)bin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BIN, null, msgs);
			if (newBin != null)
				msgs = ((InternalEObject)newBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BIN, null, msgs);
			msgs = basicSetBin(newBin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BIN, newBin, newBin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPlanholderIdentifier() {
		return planholderIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanholderIdentifier(Identifier newPlanholderIdentifier, NotificationChain msgs) {
		Identifier oldPlanholderIdentifier = planholderIdentifier;
		planholderIdentifier = newPlanholderIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER, oldPlanholderIdentifier, newPlanholderIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanholderIdentifier(Identifier newPlanholderIdentifier) {
		if (newPlanholderIdentifier != planholderIdentifier) {
			NotificationChain msgs = null;
			if (planholderIdentifier != null)
				msgs = ((InternalEObject)planholderIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER, null, msgs);
			if (newPlanholderIdentifier != null)
				msgs = ((InternalEObject)newPlanholderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER, null, msgs);
			msgs = basicSetPlanholderIdentifier(newPlanholderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER, newPlanholderIdentifier, newPlanholderIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPlanholderReference() {
		return planholderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanholderReference(Reference newPlanholderReference, NotificationChain msgs) {
		Reference oldPlanholderReference = planholderReference;
		planholderReference = newPlanholderReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLANHOLDER_REFERENCE, oldPlanholderReference, newPlanholderReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanholderReference(Reference newPlanholderReference) {
		if (newPlanholderReference != planholderReference) {
			NotificationChain msgs = null;
			if (planholderReference != null)
				msgs = ((InternalEObject)planholderReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLANHOLDER_REFERENCE, null, msgs);
			if (newPlanholderReference != null)
				msgs = ((InternalEObject)newPlanholderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLANHOLDER_REFERENCE, null, msgs);
			msgs = basicSetPlanholderReference(newPlanholderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLANHOLDER_REFERENCE, newPlanholderReference, newPlanholderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getBeneficiaryIdentifier() {
		return beneficiaryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeneficiaryIdentifier(Identifier newBeneficiaryIdentifier, NotificationChain msgs) {
		Identifier oldBeneficiaryIdentifier = beneficiaryIdentifier;
		beneficiaryIdentifier = newBeneficiaryIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER, oldBeneficiaryIdentifier, newBeneficiaryIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeneficiaryIdentifier(Identifier newBeneficiaryIdentifier) {
		if (newBeneficiaryIdentifier != beneficiaryIdentifier) {
			NotificationChain msgs = null;
			if (beneficiaryIdentifier != null)
				msgs = ((InternalEObject)beneficiaryIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER, null, msgs);
			if (newBeneficiaryIdentifier != null)
				msgs = ((InternalEObject)newBeneficiaryIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER, null, msgs);
			msgs = basicSetBeneficiaryIdentifier(newBeneficiaryIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER, newBeneficiaryIdentifier, newBeneficiaryIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBeneficiaryReference() {
		return beneficiaryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeneficiaryReference(Reference newBeneficiaryReference, NotificationChain msgs) {
		Reference oldBeneficiaryReference = beneficiaryReference;
		beneficiaryReference = newBeneficiaryReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BENEFICIARY_REFERENCE, oldBeneficiaryReference, newBeneficiaryReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeneficiaryReference(Reference newBeneficiaryReference) {
		if (newBeneficiaryReference != beneficiaryReference) {
			NotificationChain msgs = null;
			if (beneficiaryReference != null)
				msgs = ((InternalEObject)beneficiaryReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BENEFICIARY_REFERENCE, null, msgs);
			if (newBeneficiaryReference != null)
				msgs = ((InternalEObject)newBeneficiaryReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BENEFICIARY_REFERENCE, null, msgs);
			msgs = basicSetBeneficiaryReference(newBeneficiaryReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BENEFICIARY_REFERENCE, newBeneficiaryReference, newBeneficiaryReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Coding newRelationship, NotificationChain msgs) {
		Coding oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Coding newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COVERAGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(org.hl7.fhir.String newGroup, NotificationChain msgs) {
		org.hl7.fhir.String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(org.hl7.fhir.String newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSubGroup() {
		return subGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubGroup(org.hl7.fhir.String newSubGroup, NotificationChain msgs) {
		org.hl7.fhir.String oldSubGroup = subGroup;
		subGroup = newSubGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUB_GROUP, oldSubGroup, newSubGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGroup(org.hl7.fhir.String newSubGroup) {
		if (newSubGroup != subGroup) {
			NotificationChain msgs = null;
			if (subGroup != null)
				msgs = ((InternalEObject)subGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUB_GROUP, null, msgs);
			if (newSubGroup != null)
				msgs = ((InternalEObject)newSubGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUB_GROUP, null, msgs);
			msgs = basicSetSubGroup(newSubGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUB_GROUP, newSubGroup, newSubGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(org.hl7.fhir.String newPlan, NotificationChain msgs) {
		org.hl7.fhir.String oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(org.hl7.fhir.String newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSubPlan() {
		return subPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPlan(org.hl7.fhir.String newSubPlan, NotificationChain msgs) {
		org.hl7.fhir.String oldSubPlan = subPlan;
		subPlan = newSubPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUB_PLAN, oldSubPlan, newSubPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPlan(org.hl7.fhir.String newSubPlan) {
		if (newSubPlan != subPlan) {
			NotificationChain msgs = null;
			if (subPlan != null)
				msgs = ((InternalEObject)subPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUB_PLAN, null, msgs);
			if (newSubPlan != null)
				msgs = ((InternalEObject)newSubPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUB_PLAN, null, msgs);
			msgs = basicSetSubPlan(newSubPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUB_PLAN, newSubPlan, newSubPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.hl7.fhir.String newClass, NotificationChain msgs) {
		org.hl7.fhir.String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.hl7.fhir.String newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(PositiveInt newDependent, NotificationChain msgs) {
		PositiveInt oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__DEPENDENT, oldDependent, newDependent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(PositiveInt newDependent) {
		if (newDependent != dependent) {
			NotificationChain msgs = null;
			if (dependent != null)
				msgs = ((InternalEObject)dependent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__DEPENDENT, null, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__DEPENDENT, null, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(org.hl7.fhir.String newNetwork, NotificationChain msgs) {
		org.hl7.fhir.String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(org.hl7.fhir.String newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COVERAGE__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COVERAGE__ISSUER_IDENTIFIER:
				return basicSetIssuerIdentifier(null, msgs);
			case FhirPackage.COVERAGE__ISSUER_REFERENCE:
				return basicSetIssuerReference(null, msgs);
			case FhirPackage.COVERAGE__IS_AGREEMENT:
				return basicSetIsAgreement(null, msgs);
			case FhirPackage.COVERAGE__BIN:
				return basicSetBin(null, msgs);
			case FhirPackage.COVERAGE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER:
				return basicSetPlanholderIdentifier(null, msgs);
			case FhirPackage.COVERAGE__PLANHOLDER_REFERENCE:
				return basicSetPlanholderReference(null, msgs);
			case FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER:
				return basicSetBeneficiaryIdentifier(null, msgs);
			case FhirPackage.COVERAGE__BENEFICIARY_REFERENCE:
				return basicSetBeneficiaryReference(null, msgs);
			case FhirPackage.COVERAGE__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.COVERAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.COVERAGE__SUB_GROUP:
				return basicSetSubGroup(null, msgs);
			case FhirPackage.COVERAGE__PLAN:
				return basicSetPlan(null, msgs);
			case FhirPackage.COVERAGE__SUB_PLAN:
				return basicSetSubPlan(null, msgs);
			case FhirPackage.COVERAGE__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.COVERAGE__DEPENDENT:
				return basicSetDependent(null, msgs);
			case FhirPackage.COVERAGE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.COVERAGE__NETWORK:
				return basicSetNetwork(null, msgs);
			case FhirPackage.COVERAGE__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COVERAGE__STATUS:
				return getStatus();
			case FhirPackage.COVERAGE__ISSUER_IDENTIFIER:
				return getIssuerIdentifier();
			case FhirPackage.COVERAGE__ISSUER_REFERENCE:
				return getIssuerReference();
			case FhirPackage.COVERAGE__IS_AGREEMENT:
				return getIsAgreement();
			case FhirPackage.COVERAGE__BIN:
				return getBin();
			case FhirPackage.COVERAGE__PERIOD:
				return getPeriod();
			case FhirPackage.COVERAGE__TYPE:
				return getType();
			case FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER:
				return getPlanholderIdentifier();
			case FhirPackage.COVERAGE__PLANHOLDER_REFERENCE:
				return getPlanholderReference();
			case FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER:
				return getBeneficiaryIdentifier();
			case FhirPackage.COVERAGE__BENEFICIARY_REFERENCE:
				return getBeneficiaryReference();
			case FhirPackage.COVERAGE__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.COVERAGE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COVERAGE__GROUP:
				return getGroup();
			case FhirPackage.COVERAGE__SUB_GROUP:
				return getSubGroup();
			case FhirPackage.COVERAGE__PLAN:
				return getPlan();
			case FhirPackage.COVERAGE__SUB_PLAN:
				return getSubPlan();
			case FhirPackage.COVERAGE__CLASS:
				return getClass_();
			case FhirPackage.COVERAGE__DEPENDENT:
				return getDependent();
			case FhirPackage.COVERAGE__SEQUENCE:
				return getSequence();
			case FhirPackage.COVERAGE__NETWORK:
				return getNetwork();
			case FhirPackage.COVERAGE__CONTRACT:
				return getContract();
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
			case FhirPackage.COVERAGE__STATUS:
				setStatus((CoverageStatus)newValue);
				return;
			case FhirPackage.COVERAGE__ISSUER_IDENTIFIER:
				setIssuerIdentifier((Identifier)newValue);
				return;
			case FhirPackage.COVERAGE__ISSUER_REFERENCE:
				setIssuerReference((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__IS_AGREEMENT:
				setIsAgreement((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.COVERAGE__BIN:
				setBin((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.COVERAGE__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER:
				setPlanholderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.COVERAGE__PLANHOLDER_REFERENCE:
				setPlanholderReference((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER:
				setBeneficiaryIdentifier((Identifier)newValue);
				return;
			case FhirPackage.COVERAGE__BENEFICIARY_REFERENCE:
				setBeneficiaryReference((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__RELATIONSHIP:
				setRelationship((Coding)newValue);
				return;
			case FhirPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COVERAGE__GROUP:
				setGroup((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__SUB_GROUP:
				setSubGroup((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__PLAN:
				setPlan((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__SUB_PLAN:
				setSubPlan((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__CLASS:
				setClass((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__DEPENDENT:
				setDependent((PositiveInt)newValue);
				return;
			case FhirPackage.COVERAGE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.COVERAGE__NETWORK:
				setNetwork((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.COVERAGE__STATUS:
				setStatus((CoverageStatus)null);
				return;
			case FhirPackage.COVERAGE__ISSUER_IDENTIFIER:
				setIssuerIdentifier((Identifier)null);
				return;
			case FhirPackage.COVERAGE__ISSUER_REFERENCE:
				setIssuerReference((Reference)null);
				return;
			case FhirPackage.COVERAGE__IS_AGREEMENT:
				setIsAgreement((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.COVERAGE__BIN:
				setBin((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.COVERAGE__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER:
				setPlanholderIdentifier((Identifier)null);
				return;
			case FhirPackage.COVERAGE__PLANHOLDER_REFERENCE:
				setPlanholderReference((Reference)null);
				return;
			case FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER:
				setBeneficiaryIdentifier((Identifier)null);
				return;
			case FhirPackage.COVERAGE__BENEFICIARY_REFERENCE:
				setBeneficiaryReference((Reference)null);
				return;
			case FhirPackage.COVERAGE__RELATIONSHIP:
				setRelationship((Coding)null);
				return;
			case FhirPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COVERAGE__GROUP:
				setGroup((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__SUB_GROUP:
				setSubGroup((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__PLAN:
				setPlan((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__SUB_PLAN:
				setSubPlan((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__CLASS:
				setClass((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__DEPENDENT:
				setDependent((PositiveInt)null);
				return;
			case FhirPackage.COVERAGE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.COVERAGE__NETWORK:
				setNetwork((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__CONTRACT:
				getContract().clear();
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
			case FhirPackage.COVERAGE__STATUS:
				return status != null;
			case FhirPackage.COVERAGE__ISSUER_IDENTIFIER:
				return issuerIdentifier != null;
			case FhirPackage.COVERAGE__ISSUER_REFERENCE:
				return issuerReference != null;
			case FhirPackage.COVERAGE__IS_AGREEMENT:
				return isAgreement != null;
			case FhirPackage.COVERAGE__BIN:
				return bin != null;
			case FhirPackage.COVERAGE__PERIOD:
				return period != null;
			case FhirPackage.COVERAGE__TYPE:
				return type != null;
			case FhirPackage.COVERAGE__PLANHOLDER_IDENTIFIER:
				return planholderIdentifier != null;
			case FhirPackage.COVERAGE__PLANHOLDER_REFERENCE:
				return planholderReference != null;
			case FhirPackage.COVERAGE__BENEFICIARY_IDENTIFIER:
				return beneficiaryIdentifier != null;
			case FhirPackage.COVERAGE__BENEFICIARY_REFERENCE:
				return beneficiaryReference != null;
			case FhirPackage.COVERAGE__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.COVERAGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COVERAGE__GROUP:
				return group != null;
			case FhirPackage.COVERAGE__SUB_GROUP:
				return subGroup != null;
			case FhirPackage.COVERAGE__PLAN:
				return plan != null;
			case FhirPackage.COVERAGE__SUB_PLAN:
				return subPlan != null;
			case FhirPackage.COVERAGE__CLASS:
				return class_ != null;
			case FhirPackage.COVERAGE__DEPENDENT:
				return dependent != null;
			case FhirPackage.COVERAGE__SEQUENCE:
				return sequence != null;
			case FhirPackage.COVERAGE__NETWORK:
				return network != null;
			case FhirPackage.COVERAGE__CONTRACT:
				return contract != null && !contract.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl
