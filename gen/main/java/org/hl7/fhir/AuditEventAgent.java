/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventAgent#getPurposeOfUse <em>Purpose Of Use</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent()
 * @model extendedMetaData="name='AuditEvent.Agent' kind='elementOnly'"
 * @generated
 */
public interface AuditEventAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the role(s) the user plays when performing the event. Additional may contain security role codes that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRole();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct reference to a resource that identifies the agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the user actively participating in the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Id</em>' containment reference.
	 * @see #setUserId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_UserId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getUserId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getUserId <em>User Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' containment reference.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Alt Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Id</em>' containment reference.
	 * @see #setAltId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_AltId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAltId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getAltId <em>Alt Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Id</em>' containment reference.
	 * @see #getAltId()
	 * @generated
	 */
	void setAltId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-meaningful name for the agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Requestor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='requestor' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequestor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Policy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getPolicy();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of media involved. Used when the event is about exporting/importing onto media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Coding)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Media()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='media' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getMedia();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Coding value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical network location for application activity, if the activity has a network location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(AuditEventNetwork)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventNetwork getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventAgent#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(AuditEventNetwork value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason (purpose of use), specific to this agent, that was used during the event being recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Of Use</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventAgent_PurposeOfUse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purposeOfUse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPurposeOfUse();

} // AuditEventAgent
