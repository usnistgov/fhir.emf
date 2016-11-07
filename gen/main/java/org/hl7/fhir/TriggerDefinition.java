/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A description of a triggering event.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getEventTimingTiming <em>Event Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getEventTimingReference <em>Event Timing Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getEventTimingDate <em>Event Timing Date</em>}</li>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getEventTimingDateTime <em>Event Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.TriggerDefinition#getEventData <em>Event Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition()
 * @model extendedMetaData="name='TriggerDefinition' kind='elementOnly'"
 * @generated
 */
public interface TriggerDefinition extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of triggering event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TriggerType)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the event (if this is a named-event trigger).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Name</em>' containment reference.
	 * @see #setEventName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_EventName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getEventName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getEventName <em>Event Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' containment reference.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Event Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing of the event (if this is a period trigger). (choose any one of eventTiming*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Timing Timing</em>' containment reference.
	 * @see #setEventTimingTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_EventTimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getEventTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getEventTimingTiming <em>Event Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Timing</em>' containment reference.
	 * @see #getEventTimingTiming()
	 * @generated
	 */
	void setEventTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Event Timing Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing of the event (if this is a period trigger). (choose any one of eventTiming*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Timing Reference</em>' containment reference.
	 * @see #setEventTimingReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_EventTimingReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEventTimingReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getEventTimingReference <em>Event Timing Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Reference</em>' containment reference.
	 * @see #getEventTimingReference()
	 * @generated
	 */
	void setEventTimingReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Event Timing Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing of the event (if this is a period trigger). (choose any one of eventTiming*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Timing Date</em>' containment reference.
	 * @see #setEventTimingDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_EventTimingDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getEventTimingDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getEventTimingDate <em>Event Timing Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Date</em>' containment reference.
	 * @see #getEventTimingDate()
	 * @generated
	 */
	void setEventTimingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Event Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing of the event (if this is a period trigger). (choose any one of eventTiming*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Timing Date Time</em>' containment reference.
	 * @see #setEventTimingDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_EventTimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEventTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getEventTimingDateTime <em>Event Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Date Time</em>' containment reference.
	 * @see #getEventTimingDateTime()
	 * @generated
	 */
	void setEventTimingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Event Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The triggering data of the event (if this is a data trigger).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Data</em>' containment reference.
	 * @see #setEventData(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getTriggerDefinition_EventData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventData' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getEventData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TriggerDefinition#getEventData <em>Event Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Data</em>' containment reference.
	 * @see #getEventData()
	 * @generated
	 */
	void setEventData(DataRequirement value);

} // TriggerDefinition
