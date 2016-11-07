/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Endpoint#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPayloadFormat <em>Payload Format</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getHeader <em>Header</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEndpoint()
 * @model extendedMetaData="name='Endpoint' kind='elementOnly'"
 * @generated
 */
public interface Endpoint extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * active | suspended | error | off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EndpointStatus)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EndpointStatus value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A friendly name that this endpoint can be referred to with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that manages this endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of channel to send notifications on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' containment reference.
	 * @see #setConnectionType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_ConnectionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connectionType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getConnectionType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getConnectionType <em>Connection Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' containment reference.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(Coding value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The http verb to be used when calling this endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getMethod();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval during which the managing organization assumes the defined responsibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uri that describes the actual end-point to send messages to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Uri)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Uri value);

	/**
	 * Returns the value of the '<em><b>Payload Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. If the mime type is blank, then there is no payload in the notification, just a notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Format</em>' containment reference.
	 * @see #setPayloadFormat(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_PayloadFormat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='payloadFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPayloadFormat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getPayloadFormat <em>Payload Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Format</em>' containment reference.
	 * @see #getPayloadFormat()
	 * @generated
	 */
	void setPayloadFormat(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Payload Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The payload type describes the acceptable content that can be communicated on the endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_PayloadType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='payloadType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPayloadType();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional headers / information to send as part of the notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getHeader();

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' containment reference.
	 * @see #setPublicKey(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_PublicKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicKey' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublicKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getPublicKey <em>Public Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' containment reference.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(org.hl7.fhir.String value);

} // Endpoint
