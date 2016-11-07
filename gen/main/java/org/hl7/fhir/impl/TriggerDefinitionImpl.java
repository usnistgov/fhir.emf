/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getEventTimingTiming <em>Event Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getEventTimingReference <em>Event Timing Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getEventTimingDate <em>Event Timing Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getEventTimingDateTime <em>Event Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TriggerDefinitionImpl#getEventData <em>Event Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerDefinitionImpl extends ElementImpl implements TriggerDefinition {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TriggerType type;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String eventName;

	/**
	 * The cached value of the '{@link #getEventTimingTiming() <em>Event Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing eventTimingTiming;

	/**
	 * The cached value of the '{@link #getEventTimingReference() <em>Event Timing Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimingReference()
	 * @generated
	 * @ordered
	 */
	protected Reference eventTimingReference;

	/**
	 * The cached value of the '{@link #getEventTimingDate() <em>Event Timing Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimingDate()
	 * @generated
	 * @ordered
	 */
	protected Date eventTimingDate;

	/**
	 * The cached value of the '{@link #getEventTimingDateTime() <em>Event Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime eventTimingDateTime;

	/**
	 * The cached value of the '{@link #getEventData() <em>Event Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventData()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement eventData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTriggerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TriggerType newType, NotificationChain msgs) {
		TriggerType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TriggerType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventName(org.hl7.fhir.String newEventName, NotificationChain msgs) {
		org.hl7.fhir.String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_NAME, oldEventName, newEventName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(org.hl7.fhir.String newEventName) {
		if (newEventName != eventName) {
			NotificationChain msgs = null;
			if (eventName != null)
				msgs = ((InternalEObject)eventName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_NAME, null, msgs);
			if (newEventName != null)
				msgs = ((InternalEObject)newEventName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_NAME, null, msgs);
			msgs = basicSetEventName(newEventName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_NAME, newEventName, newEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getEventTimingTiming() {
		return eventTimingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventTimingTiming(Timing newEventTimingTiming, NotificationChain msgs) {
		Timing oldEventTimingTiming = eventTimingTiming;
		eventTimingTiming = newEventTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING, oldEventTimingTiming, newEventTimingTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTimingTiming(Timing newEventTimingTiming) {
		if (newEventTimingTiming != eventTimingTiming) {
			NotificationChain msgs = null;
			if (eventTimingTiming != null)
				msgs = ((InternalEObject)eventTimingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING, null, msgs);
			if (newEventTimingTiming != null)
				msgs = ((InternalEObject)newEventTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING, null, msgs);
			msgs = basicSetEventTimingTiming(newEventTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING, newEventTimingTiming, newEventTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEventTimingReference() {
		return eventTimingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventTimingReference(Reference newEventTimingReference, NotificationChain msgs) {
		Reference oldEventTimingReference = eventTimingReference;
		eventTimingReference = newEventTimingReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE, oldEventTimingReference, newEventTimingReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTimingReference(Reference newEventTimingReference) {
		if (newEventTimingReference != eventTimingReference) {
			NotificationChain msgs = null;
			if (eventTimingReference != null)
				msgs = ((InternalEObject)eventTimingReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE, null, msgs);
			if (newEventTimingReference != null)
				msgs = ((InternalEObject)newEventTimingReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE, null, msgs);
			msgs = basicSetEventTimingReference(newEventTimingReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE, newEventTimingReference, newEventTimingReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEventTimingDate() {
		return eventTimingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventTimingDate(Date newEventTimingDate, NotificationChain msgs) {
		Date oldEventTimingDate = eventTimingDate;
		eventTimingDate = newEventTimingDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE, oldEventTimingDate, newEventTimingDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTimingDate(Date newEventTimingDate) {
		if (newEventTimingDate != eventTimingDate) {
			NotificationChain msgs = null;
			if (eventTimingDate != null)
				msgs = ((InternalEObject)eventTimingDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE, null, msgs);
			if (newEventTimingDate != null)
				msgs = ((InternalEObject)newEventTimingDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE, null, msgs);
			msgs = basicSetEventTimingDate(newEventTimingDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE, newEventTimingDate, newEventTimingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEventTimingDateTime() {
		return eventTimingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventTimingDateTime(DateTime newEventTimingDateTime, NotificationChain msgs) {
		DateTime oldEventTimingDateTime = eventTimingDateTime;
		eventTimingDateTime = newEventTimingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME, oldEventTimingDateTime, newEventTimingDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTimingDateTime(DateTime newEventTimingDateTime) {
		if (newEventTimingDateTime != eventTimingDateTime) {
			NotificationChain msgs = null;
			if (eventTimingDateTime != null)
				msgs = ((InternalEObject)eventTimingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME, null, msgs);
			if (newEventTimingDateTime != null)
				msgs = ((InternalEObject)newEventTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME, null, msgs);
			msgs = basicSetEventTimingDateTime(newEventTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME, newEventTimingDateTime, newEventTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement getEventData() {
		return eventData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventData(DataRequirement newEventData, NotificationChain msgs) {
		DataRequirement oldEventData = eventData;
		eventData = newEventData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_DATA, oldEventData, newEventData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventData(DataRequirement newEventData) {
		if (newEventData != eventData) {
			NotificationChain msgs = null;
			if (eventData != null)
				msgs = ((InternalEObject)eventData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_DATA, null, msgs);
			if (newEventData != null)
				msgs = ((InternalEObject)newEventData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TRIGGER_DEFINITION__EVENT_DATA, null, msgs);
			msgs = basicSetEventData(newEventData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TRIGGER_DEFINITION__EVENT_DATA, newEventData, newEventData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TRIGGER_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.TRIGGER_DEFINITION__EVENT_NAME:
				return basicSetEventName(null, msgs);
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING:
				return basicSetEventTimingTiming(null, msgs);
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE:
				return basicSetEventTimingReference(null, msgs);
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE:
				return basicSetEventTimingDate(null, msgs);
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME:
				return basicSetEventTimingDateTime(null, msgs);
			case FhirPackage.TRIGGER_DEFINITION__EVENT_DATA:
				return basicSetEventData(null, msgs);
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
			case FhirPackage.TRIGGER_DEFINITION__TYPE:
				return getType();
			case FhirPackage.TRIGGER_DEFINITION__EVENT_NAME:
				return getEventName();
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING:
				return getEventTimingTiming();
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE:
				return getEventTimingReference();
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE:
				return getEventTimingDate();
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME:
				return getEventTimingDateTime();
			case FhirPackage.TRIGGER_DEFINITION__EVENT_DATA:
				return getEventData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.TRIGGER_DEFINITION__TYPE:
				setType((TriggerType)newValue);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_NAME:
				setEventName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING:
				setEventTimingTiming((Timing)newValue);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE:
				setEventTimingReference((Reference)newValue);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE:
				setEventTimingDate((Date)newValue);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME:
				setEventTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_DATA:
				setEventData((DataRequirement)newValue);
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
			case FhirPackage.TRIGGER_DEFINITION__TYPE:
				setType((TriggerType)null);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_NAME:
				setEventName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING:
				setEventTimingTiming((Timing)null);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE:
				setEventTimingReference((Reference)null);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE:
				setEventTimingDate((Date)null);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME:
				setEventTimingDateTime((DateTime)null);
				return;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_DATA:
				setEventData((DataRequirement)null);
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
			case FhirPackage.TRIGGER_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_NAME:
				return eventName != null;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_TIMING:
				return eventTimingTiming != null;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_REFERENCE:
				return eventTimingReference != null;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE:
				return eventTimingDate != null;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_TIMING_DATE_TIME:
				return eventTimingDateTime != null;
			case FhirPackage.TRIGGER_DEFINITION__EVENT_DATA:
				return eventData != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerDefinitionImpl
