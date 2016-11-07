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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseAction;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getEvaluationMessage <em>Evaluation Message</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getDataRequirement <em>Data Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseImpl extends DomainResourceImpl implements GuidanceResponse {
	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected Id requestId;

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
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Reference module;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GuidanceResponseStatus status;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getReasonCodeableConcept() <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonReference;

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
	 * The cached value of the '{@link #getEvaluationMessage() <em>Evaluation Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> evaluationMessage;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected Reference outputParameters;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<GuidanceResponseAction> action;

	/**
	 * The cached value of the '{@link #getDataRequirement() <em>Data Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> dataRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGuidanceResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestId(Id newRequestId, NotificationChain msgs) {
		Id oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, oldRequestId, newRequestId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(Id newRequestId) {
		if (newRequestId != requestId) {
			NotificationChain msgs = null;
			if (requestId != null)
				msgs = ((InternalEObject)requestId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, null, msgs);
			if (newRequestId != null)
				msgs = ((InternalEObject)newRequestId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, null, msgs);
			msgs = basicSetRequestId(newRequestId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID, newRequestId, newRequestId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Reference newModule, NotificationChain msgs) {
		Reference oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE, oldModule, newModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Reference newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE, null, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE, null, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(GuidanceResponseStatus newStatus, NotificationChain msgs) {
		GuidanceResponseStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(GuidanceResponseStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonCodeableConcept() {
		return reasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonCodeableConcept(CodeableConcept newReasonCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldReasonCodeableConcept = reasonCodeableConcept;
		reasonCodeableConcept = newReasonCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT, oldReasonCodeableConcept, newReasonCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCodeableConcept(CodeableConcept newReasonCodeableConcept) {
		if (newReasonCodeableConcept != reasonCodeableConcept) {
			NotificationChain msgs = null;
			if (reasonCodeableConcept != null)
				msgs = ((InternalEObject)reasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT, null, msgs);
			if (newReasonCodeableConcept != null)
				msgs = ((InternalEObject)newReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonCodeableConcept(newReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT, newReasonCodeableConcept, newReasonCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonReference() {
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonReference(Reference newReasonReference, NotificationChain msgs) {
		Reference oldReasonReference = reasonReference;
		reasonReference = newReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE, oldReasonReference, newReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonReference(Reference newReasonReference) {
		if (newReasonReference != reasonReference) {
			NotificationChain msgs = null;
			if (reasonReference != null)
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.GUIDANCE_RESPONSE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEvaluationMessage() {
		if (evaluationMessage == null) {
			evaluationMessage = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE);
		}
		return evaluationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParameters(Reference newOutputParameters, NotificationChain msgs) {
		Reference oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(Reference newOutputParameters) {
		if (newOutputParameters != outputParameters) {
			NotificationChain msgs = null;
			if (outputParameters != null)
				msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			if (newOutputParameters != null)
				msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			msgs = basicSetOutputParameters(newOutputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuidanceResponseAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<GuidanceResponseAction>(GuidanceResponseAction.class, this, FhirPackage.GUIDANCE_RESPONSE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getDataRequirement() {
		if (dataRequirement == null) {
			dataRequirement = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT);
		}
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return basicSetRequestId(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				return basicSetModule(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT:
				return basicSetReasonCodeableConcept(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return ((InternalEList<?>)getEvaluationMessage()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return basicSetOutputParameters(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return ((InternalEList<?>)getDataRequirement()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return getRequestId();
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				return getModule();
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				return getSubject();
			case FhirPackage.GUIDANCE_RESPONSE__CONTEXT:
				return getContext();
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				return getPerformer();
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				return getNote();
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return getEvaluationMessage();
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return getOutputParameters();
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				return getAction();
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return getDataRequirement();
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((Id)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				setModule((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((GuidanceResponseStatus)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessage().clear();
				getEvaluationMessage().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends GuidanceResponseAction>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirement().clear();
				getDataRequirement().addAll((Collection<? extends DataRequirement>)newValue);
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((Id)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				setModule((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((GuidanceResponseStatus)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessage().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				getAction().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirement().clear();
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return requestId != null;
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE:
				return module != null;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				return subject != null;
			case FhirPackage.GUIDANCE_RESPONSE__CONTEXT:
				return context != null;
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				return performer != null;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return reasonReference != null;
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return evaluationMessage != null && !evaluationMessage.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case FhirPackage.GUIDANCE_RESPONSE__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return dataRequirement != null && !dataRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseImpl
