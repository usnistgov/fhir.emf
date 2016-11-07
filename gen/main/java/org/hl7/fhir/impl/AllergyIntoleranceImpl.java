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

import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceStatus;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getAttestedDate <em>Attested Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends DomainResourceImpl implements AllergyIntolerance {
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
	protected AllergyIntoleranceStatus status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceType type;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceCategory category;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceCriticality criticality;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getAttestedDate() <em>Attested Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttestedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime attestedDate;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Reference recorder;

	/**
	 * The cached value of the '{@link #getReporter() <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected Reference reporter;

	/**
	 * The cached value of the '{@link #getOnset() <em>Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnset()
	 * @generated
	 * @ordered
	 */
	protected DateTime onset;

	/**
	 * The cached value of the '{@link #getLastOccurrence() <em>Last Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOccurrence()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastOccurrence;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntoleranceReaction> reaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAllergyIntolerance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOnset() {
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnset(DateTime newOnset, NotificationChain msgs) {
		DateTime oldOnset = onset;
		onset = newOnset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET, oldOnset, newOnset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnset(DateTime newOnset) {
		if (newOnset != onset) {
			NotificationChain msgs = null;
			if (onset != null)
				msgs = ((InternalEObject)onset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET, null, msgs);
			if (newOnset != null)
				msgs = ((InternalEObject)newOnset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET, null, msgs);
			msgs = basicSetOnset(newOnset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET, newOnset, newOnset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getLastOccurrence() {
		return lastOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastOccurrence(DateTime newLastOccurrence, NotificationChain msgs) {
		DateTime oldLastOccurrence = lastOccurrence;
		lastOccurrence = newLastOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, oldLastOccurrence, newLastOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastOccurrence(DateTime newLastOccurrence) {
		if (newLastOccurrence != lastOccurrence) {
			NotificationChain msgs = null;
			if (lastOccurrence != null)
				msgs = ((InternalEObject)lastOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, null, msgs);
			if (newLastOccurrence != null)
				msgs = ((InternalEObject)newLastOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, null, msgs);
			msgs = basicSetLastOccurrence(newLastOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, newLastOccurrence, newLastOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorder(Reference newRecorder, NotificationChain msgs) {
		Reference oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, newRecorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorder(Reference newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__RECORDER, newRecorder, newRecorder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAttestedDate() {
		return attestedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttestedDate(DateTime newAttestedDate, NotificationChain msgs) {
		DateTime oldAttestedDate = attestedDate;
		attestedDate = newAttestedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE, oldAttestedDate, newAttestedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttestedDate(DateTime newAttestedDate) {
		if (newAttestedDate != attestedDate) {
			NotificationChain msgs = null;
			if (attestedDate != null)
				msgs = ((InternalEObject)attestedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE, null, msgs);
			if (newAttestedDate != null)
				msgs = ((InternalEObject)newAttestedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE, null, msgs);
			msgs = basicSetAttestedDate(newAttestedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE, newAttestedDate, newAttestedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReporter() {
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReporter(Reference newReporter, NotificationChain msgs) {
		Reference oldReporter = reporter;
		reporter = newReporter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__REPORTER, oldReporter, newReporter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(Reference newReporter) {
		if (newReporter != reporter) {
			NotificationChain msgs = null;
			if (reporter != null)
				msgs = ((InternalEObject)reporter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__REPORTER, null, msgs);
			if (newReporter != null)
				msgs = ((InternalEObject)newReporter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__REPORTER, null, msgs);
			msgs = basicSetReporter(newReporter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__REPORTER, newReporter, newReporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AllergyIntoleranceStatus newStatus, NotificationChain msgs) {
		AllergyIntoleranceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(AllergyIntoleranceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticality(AllergyIntoleranceCriticality newCriticality, NotificationChain msgs) {
		AllergyIntoleranceCriticality oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, newCriticality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(AllergyIntoleranceCriticality newCriticality) {
		if (newCriticality != criticality) {
			NotificationChain msgs = null;
			if (criticality != null)
				msgs = ((InternalEObject)criticality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, null, msgs);
			if (newCriticality != null)
				msgs = ((InternalEObject)newCriticality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, null, msgs);
			msgs = basicSetCriticality(newCriticality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, newCriticality, newCriticality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AllergyIntoleranceType newType, NotificationChain msgs) {
		AllergyIntoleranceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AllergyIntoleranceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(AllergyIntoleranceCategory newCategory, NotificationChain msgs) {
		AllergyIntoleranceCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(AllergyIntoleranceCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.ALLERGY_INTOLERANCE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyIntoleranceReaction> getReaction() {
		if (reaction == null) {
			reaction = new EObjectContainmentEList<AllergyIntoleranceReaction>(AllergyIntoleranceReaction.class, this, FhirPackage.ALLERGY_INTOLERANCE__REACTION);
		}
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return basicSetCriticality(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE:
				return basicSetAttestedDate(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				return basicSetRecorder(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__REPORTER:
				return basicSetReporter(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET:
				return basicSetOnset(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return basicSetLastOccurrence(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				return ((InternalEList<?>)getReaction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ALLERGY_INTOLERANCE__STATUS:
				return getStatus();
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				return getType();
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return getCategory();
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return getCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				return getCode();
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				return getPatient();
			case FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE:
				return getAttestedDate();
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				return getRecorder();
			case FhirPackage.ALLERGY_INTOLERANCE__REPORTER:
				return getReporter();
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET:
				return getOnset();
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return getLastOccurrence();
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				return getNote();
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				return getReaction();
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__STATUS:
				setStatus((AllergyIntoleranceStatus)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((AllergyIntoleranceType)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				setCategory((AllergyIntoleranceCategory)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((AllergyIntoleranceCriticality)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE:
				setAttestedDate((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__REPORTER:
				setReporter((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET:
				setOnset((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				getReaction().clear();
				getReaction().addAll((Collection<? extends AllergyIntoleranceReaction>)newValue);
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__STATUS:
				setStatus((AllergyIntoleranceStatus)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((AllergyIntoleranceType)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				setCategory((AllergyIntoleranceCategory)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((AllergyIntoleranceCriticality)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE:
				setAttestedDate((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__REPORTER:
				setReporter((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET:
				setOnset((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				getReaction().clear();
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ALLERGY_INTOLERANCE__STATUS:
				return status != null;
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				return type != null;
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return category != null;
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return criticality != null;
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				return code != null;
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				return patient != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ATTESTED_DATE:
				return attestedDate != null;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				return recorder != null;
			case FhirPackage.ALLERGY_INTOLERANCE__REPORTER:
				return reporter != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET:
				return onset != null;
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return lastOccurrence != null;
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				return reaction != null && !reaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceImpl
