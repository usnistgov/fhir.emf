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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getConsentor <em>Consentor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceIdentifier <em>Source Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getExcept <em>Except</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentImpl extends DomainResourceImpl implements Consent {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConsentStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getConsentor() <em>Consentor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> consentor;

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
	 * The cached value of the '{@link #getSourceAttachment() <em>Source Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment sourceAttachment;

	/**
	 * The cached value of the '{@link #getSourceIdentifier() <em>Source Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier sourceIdentifier;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceReference;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected Uri policy;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purpose;

	/**
	 * The cached value of the '{@link #getExcept() <em>Except</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentExcept> except;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConsentStatus newStatus, NotificationChain msgs) {
		ConsentStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConsentStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATE_TIME, newDateTime, newDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getConsentor() {
		if (consentor == null) {
			consentor = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__CONSENTOR);
		}
		return consentor;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getSourceAttachment() {
		return sourceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAttachment(Attachment newSourceAttachment, NotificationChain msgs) {
		Attachment oldSourceAttachment = sourceAttachment;
		sourceAttachment = newSourceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_ATTACHMENT, oldSourceAttachment, newSourceAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAttachment(Attachment newSourceAttachment) {
		if (newSourceAttachment != sourceAttachment) {
			NotificationChain msgs = null;
			if (sourceAttachment != null)
				msgs = ((InternalEObject)sourceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_ATTACHMENT, null, msgs);
			if (newSourceAttachment != null)
				msgs = ((InternalEObject)newSourceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_ATTACHMENT, null, msgs);
			msgs = basicSetSourceAttachment(newSourceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_ATTACHMENT, newSourceAttachment, newSourceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSourceIdentifier() {
		return sourceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIdentifier(Identifier newSourceIdentifier, NotificationChain msgs) {
		Identifier oldSourceIdentifier = sourceIdentifier;
		sourceIdentifier = newSourceIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_IDENTIFIER, oldSourceIdentifier, newSourceIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIdentifier(Identifier newSourceIdentifier) {
		if (newSourceIdentifier != sourceIdentifier) {
			NotificationChain msgs = null;
			if (sourceIdentifier != null)
				msgs = ((InternalEObject)sourceIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_IDENTIFIER, null, msgs);
			if (newSourceIdentifier != null)
				msgs = ((InternalEObject)newSourceIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_IDENTIFIER, null, msgs);
			msgs = basicSetSourceIdentifier(newSourceIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_IDENTIFIER, newSourceIdentifier, newSourceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReference(Reference newSourceReference, NotificationChain msgs) {
		Reference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceReference(Reference newSourceReference) {
		if (newSourceReference != sourceReference) {
			NotificationChain msgs = null;
			if (sourceReference != null)
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(Uri newPolicy, NotificationChain msgs) {
		Uri oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__POLICY, oldPolicy, newPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(Uri newPolicy) {
		if (newPolicy != policy) {
			NotificationChain msgs = null;
			if (policy != null)
				msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__POLICY, null, msgs);
			if (newPolicy != null)
				msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__POLICY, null, msgs);
			msgs = basicSetPolicy(newPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__POLICY, newPolicy, newPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONSENT__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentExcept> getExcept() {
		if (except == null) {
			except = new EObjectContainmentEList<ConsentExcept>(ConsentExcept.class, this, FhirPackage.CONSENT__EXCEPT);
		}
		return except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONSENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONSENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONSENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.CONSENT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.CONSENT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CONSENT__CONSENTOR:
				return ((InternalEList<?>)getConsentor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return basicSetSourceAttachment(null, msgs);
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				return basicSetSourceIdentifier(null, msgs);
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return basicSetSourceReference(null, msgs);
			case FhirPackage.CONSENT__POLICY:
				return basicSetPolicy(null, msgs);
			case FhirPackage.CONSENT__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__EXCEPT:
				return ((InternalEList<?>)getExcept()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONSENT__STATUS:
				return getStatus();
			case FhirPackage.CONSENT__CATEGORY:
				return getCategory();
			case FhirPackage.CONSENT__DATE_TIME:
				return getDateTime();
			case FhirPackage.CONSENT__PERIOD:
				return getPeriod();
			case FhirPackage.CONSENT__PATIENT:
				return getPatient();
			case FhirPackage.CONSENT__CONSENTOR:
				return getConsentor();
			case FhirPackage.CONSENT__ORGANIZATION:
				return getOrganization();
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return getSourceAttachment();
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				return getSourceIdentifier();
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return getSourceReference();
			case FhirPackage.CONSENT__POLICY:
				return getPolicy();
			case FhirPackage.CONSENT__RECIPIENT:
				return getRecipient();
			case FhirPackage.CONSENT__PURPOSE:
				return getPurpose();
			case FhirPackage.CONSENT__EXCEPT:
				return getExcept();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentStatus)newValue);
				return;
			case FhirPackage.CONSENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirPackage.CONSENT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CONSENT__CONSENTOR:
				getConsentor().clear();
				getConsentor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				setSourceAttachment((Attachment)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				setSourceIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				setSourceReference((Reference)newValue);
				return;
			case FhirPackage.CONSENT__POLICY:
				setPolicy((Uri)newValue);
				return;
			case FhirPackage.CONSENT__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONSENT__EXCEPT:
				getExcept().clear();
				getExcept().addAll((Collection<? extends ConsentExcept>)newValue);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentStatus)null);
				return;
			case FhirPackage.CONSENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirPackage.CONSENT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CONSENT__CONSENTOR:
				getConsentor().clear();
				return;
			case FhirPackage.CONSENT__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				setSourceAttachment((Attachment)null);
				return;
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				setSourceIdentifier((Identifier)null);
				return;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				setSourceReference((Reference)null);
				return;
			case FhirPackage.CONSENT__POLICY:
				setPolicy((Uri)null);
				return;
			case FhirPackage.CONSENT__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.CONSENT__PURPOSE:
				getPurpose().clear();
				return;
			case FhirPackage.CONSENT__EXCEPT:
				getExcept().clear();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONSENT__STATUS:
				return status != null;
			case FhirPackage.CONSENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CONSENT__DATE_TIME:
				return dateTime != null;
			case FhirPackage.CONSENT__PERIOD:
				return period != null;
			case FhirPackage.CONSENT__PATIENT:
				return patient != null;
			case FhirPackage.CONSENT__CONSENTOR:
				return consentor != null && !consentor.isEmpty();
			case FhirPackage.CONSENT__ORGANIZATION:
				return organization != null;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return sourceAttachment != null;
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				return sourceIdentifier != null;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return sourceReference != null;
			case FhirPackage.CONSENT__POLICY:
				return policy != null;
			case FhirPackage.CONSENT__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.CONSENT__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case FhirPackage.CONSENT__EXCEPT:
				return except != null && !except.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentImpl
