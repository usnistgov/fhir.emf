/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Notice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getResponseIdentifier <em>Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getResponseReference <em>Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentNotice#getStatusDate <em>Status Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentNotice()
 * @model extendedMetaData="name='PaymentNotice' kind='elementOnly'"
 * @generated
 */
public interface PaymentNotice extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The notice business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_Identifier()
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
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PaymentNoticeStatus)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentNoticeStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PaymentNoticeStatus value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Target Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Identifier</em>' containment reference.
	 * @see #setTargetIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_TargetIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getTargetIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getTargetIdentifier <em>Target Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Identifier</em>' containment reference.
	 * @see #getTargetIdentifier()
	 * @generated
	 */
	void setTargetIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Target Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Reference</em>' containment reference.
	 * @see #setTargetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_TargetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTargetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getTargetReference <em>Target Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Reference</em>' containment reference.
	 * @see #getTargetReference()
	 * @generated
	 */
	void setTargetReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #getProviderIdentifier()
	 * @generated
	 */
	void setProviderIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Provider Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getProviderReference <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Reference</em>' containment reference.
	 * @see #getProviderReference()
	 * @generated
	 */
	void setProviderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #setOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #getOrganizationIdentifier()
	 * @generated
	 */
	void setOrganizationIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Organization Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Reference</em>' containment reference.
	 * @see #setOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getOrganizationReference <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Reference</em>' containment reference.
	 * @see #getOrganizationReference()
	 * @generated
	 */
	void setOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference of resource for which payment is being made. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Identifier</em>' containment reference.
	 * @see #setRequestIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_RequestIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getRequestIdentifier <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Identifier</em>' containment reference.
	 * @see #getRequestIdentifier()
	 * @generated
	 */
	void setRequestIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Request Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference of resource for which payment is being made. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Reference</em>' containment reference.
	 * @see #setRequestReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_RequestReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getRequestReference <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Reference</em>' containment reference.
	 * @see #getRequestReference()
	 * @generated
	 */
	void setRequestReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Response Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference of response to resource for which payment is being made. (choose any one of response*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Identifier</em>' containment reference.
	 * @see #setResponseIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_ResponseIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getResponseIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getResponseIdentifier <em>Response Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Identifier</em>' containment reference.
	 * @see #getResponseIdentifier()
	 * @generated
	 */
	void setResponseIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Response Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference of response to resource for which payment is being made. (choose any one of response*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Reference</em>' containment reference.
	 * @see #setResponseReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_ResponseReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponseReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getResponseReference <em>Response Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Reference</em>' containment reference.
	 * @see #getResponseReference()
	 * @generated
	 */
	void setResponseReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The payment status, typically paid: payment sent, cleared: payment received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Status</em>' containment reference.
	 * @see #setPaymentStatus(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_PaymentStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paymentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPaymentStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getPaymentStatus <em>Payment Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' containment reference.
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(Coding value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the above payment action occurrred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentNotice_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentNotice#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

} // PaymentNotice
