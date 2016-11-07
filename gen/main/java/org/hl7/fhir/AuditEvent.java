/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getPurposeOfEvent <em>Purpose Of Event</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEvent#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEvent()
 * @model extendedMetaData="name='AuditEvent' kind='elementOnly'"
 * @generated
 */
public interface AuditEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the category of event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Subtype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSubtype();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicator for type of action performed during the event that generated the audit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AuditEventAction)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventAction getAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AuditEventAction value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the event occurred on the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Recorded()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(Instant value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the event succeeded or failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(AuditEventOutcome)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventOutcome getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(AuditEventOutcome value);

	/**
	 * Returns the value of the '<em><b>Outcome Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of the outcome of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Desc</em>' containment reference.
	 * @see #setOutcomeDesc(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_OutcomeDesc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOutcomeDesc();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getOutcomeDesc <em>Outcome Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome Desc</em>' containment reference.
	 * @see #getOutcomeDesc()
	 * @generated
	 */
	void setOutcomeDesc(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purposeOfUse (reason) that was used during the event being recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Of Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_PurposeOfEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purposeOfEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPurposeOfEvent();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor taking an active role in the event or activity that is logged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Agent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventAgent> getAgent();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system that is reporting the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(AuditEventSource)
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventSource getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEvent#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AuditEventSource value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific instances of data or objects that have been accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEvent_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventEntity> getEntity();

} // AuditEvent
