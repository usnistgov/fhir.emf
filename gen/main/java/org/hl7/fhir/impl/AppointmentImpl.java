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

import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getMinutesDuration <em>Minutes Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends DomainResourceImpl implements Appointment {
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
	protected AppointmentStatus status;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceType;

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
	 * The cached value of the '{@link #getAppointmentType() <em>Appointment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept appointmentType;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt priority;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getMinutesDuration() <em>Minutes Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesDuration()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt minutesDuration;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> slot;

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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<AppointmentParticipant> participant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.APPOINTMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AppointmentStatus newStatus, NotificationChain msgs) {
		AppointmentStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(AppointmentStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(CodeableConcept newServiceCategory, NotificationChain msgs) {
		CodeableConcept oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(CodeableConcept newServiceCategory) {
		if (newServiceCategory != serviceCategory) {
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__SERVICE_CATEGORY, null, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__SERVICE_CATEGORY, null, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT__SERVICE_TYPE);
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAppointmentType() {
		return appointmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentType(CodeableConcept newAppointmentType, NotificationChain msgs) {
		CodeableConcept oldAppointmentType = appointmentType;
		appointmentType = newAppointmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, oldAppointmentType, newAppointmentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentType(CodeableConcept newAppointmentType) {
		if (newAppointmentType != appointmentType) {
			NotificationChain msgs = null;
			if (appointmentType != null)
				msgs = ((InternalEObject)appointmentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, null, msgs);
			if (newAppointmentType != null)
				msgs = ((InternalEObject)newAppointmentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, null, msgs);
			msgs = basicSetAppointmentType(newAppointmentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__APPOINTMENT_TYPE, newAppointmentType, newAppointmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(UnsignedInt newPriority, NotificationChain msgs) {
		UnsignedInt oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(UnsignedInt newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Instant newStart, NotificationChain msgs) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getMinutesDuration() {
		return minutesDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinutesDuration(PositiveInt newMinutesDuration, NotificationChain msgs) {
		PositiveInt oldMinutesDuration = minutesDuration;
		minutesDuration = newMinutesDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__MINUTES_DURATION, oldMinutesDuration, newMinutesDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutesDuration(PositiveInt newMinutesDuration) {
		if (newMinutesDuration != minutesDuration) {
			NotificationChain msgs = null;
			if (minutesDuration != null)
				msgs = ((InternalEObject)minutesDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__MINUTES_DURATION, null, msgs);
			if (newMinutesDuration != null)
				msgs = ((InternalEObject)newMinutesDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__MINUTES_DURATION, null, msgs);
			msgs = basicSetMinutesDuration(newMinutesDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__MINUTES_DURATION, newMinutesDuration, newMinutesDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__SLOT);
		}
		return slot;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppointmentParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<AppointmentParticipant>(AppointmentParticipant.class, this, FhirPackage.APPOINTMENT__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return basicSetAppointmentType(null, msgs);
			case FhirPackage.APPOINTMENT__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.APPOINTMENT__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.APPOINTMENT__START:
				return basicSetStart(null, msgs);
			case FhirPackage.APPOINTMENT__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				return basicSetMinutesDuration(null, msgs);
			case FhirPackage.APPOINTMENT__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.APPOINTMENT__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.APPOINTMENT__STATUS:
				return getStatus();
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				return getServiceCategory();
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.APPOINTMENT__SPECIALTY:
				return getSpecialty();
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return getAppointmentType();
			case FhirPackage.APPOINTMENT__REASON:
				return getReason();
			case FhirPackage.APPOINTMENT__PRIORITY:
				return getPriority();
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return getDescription();
			case FhirPackage.APPOINTMENT__START:
				return getStart();
			case FhirPackage.APPOINTMENT__END:
				return getEnd();
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				return getMinutesDuration();
			case FhirPackage.APPOINTMENT__SLOT:
				return getSlot();
			case FhirPackage.APPOINTMENT__CREATED:
				return getCreated();
			case FhirPackage.APPOINTMENT__COMMENT:
				return getComment();
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return getParticipant();
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)newValue);
				return;
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__PRIORITY:
				setPriority((UnsignedInt)newValue);
				return;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.APPOINTMENT__START:
				setStart((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				setMinutesDuration((PositiveInt)newValue);
				return;
			case FhirPackage.APPOINTMENT__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.APPOINTMENT__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends AppointmentParticipant>)newValue);
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)null);
				return;
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FhirPackage.APPOINTMENT__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__PRIORITY:
				setPriority((UnsignedInt)null);
				return;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.APPOINTMENT__START:
				setStart((Instant)null);
				return;
			case FhirPackage.APPOINTMENT__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				setMinutesDuration((PositiveInt)null);
				return;
			case FhirPackage.APPOINTMENT__SLOT:
				getSlot().clear();
				return;
			case FhirPackage.APPOINTMENT__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.APPOINTMENT__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				getParticipant().clear();
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.APPOINTMENT__STATUS:
				return status != null;
			case FhirPackage.APPOINTMENT__SERVICE_CATEGORY:
				return serviceCategory != null;
			case FhirPackage.APPOINTMENT__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FhirPackage.APPOINTMENT__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return appointmentType != null;
			case FhirPackage.APPOINTMENT__REASON:
				return reason != null;
			case FhirPackage.APPOINTMENT__PRIORITY:
				return priority != null;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return description != null;
			case FhirPackage.APPOINTMENT__START:
				return start != null;
			case FhirPackage.APPOINTMENT__END:
				return end != null;
			case FhirPackage.APPOINTMENT__MINUTES_DURATION:
				return minutesDuration != null;
			case FhirPackage.APPOINTMENT__SLOT:
				return slot != null && !slot.isEmpty();
			case FhirPackage.APPOINTMENT__CREATED:
				return created != null;
			case FhirPackage.APPOINTMENT__COMMENT:
				return comment != null;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return participant != null && !participant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppointmentImpl
