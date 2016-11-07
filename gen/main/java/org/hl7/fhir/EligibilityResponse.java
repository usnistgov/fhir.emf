/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRequestProviderIdentifier <em>Request Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRequestProviderReference <em>Request Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRequestOrganizationIdentifier <em>Request Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getRequestOrganizationReference <em>Request Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getInforce <em>Inforce</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getBenefitBalance <em>Benefit Balance</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponse#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse()
 * @model extendedMetaData="name='EligibilityResponse' kind='elementOnly'"
 * @generated
 */
public interface EligibilityResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Identifier()
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
	 * @see #setStatus(EligibilityResponseStatus)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EligibilityResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EligibilityResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource reference. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Identifier</em>' containment reference.
	 * @see #setRequestIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_RequestIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRequestIdentifier <em>Request Identifier</em>}' containment reference.
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
	 * Original request resource reference. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Reference</em>' containment reference.
	 * @see #setRequestReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_RequestReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRequestReference <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Reference</em>' containment reference.
	 * @see #getRequestReference()
	 * @generated
	 */
	void setRequestReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction status: error, complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(RemittanceOutcome)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	RemittanceOutcome getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(RemittanceOutcome value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRuleset <em>Ruleset</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
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
	 * The date when the enclosed suite of services were performed or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Organization Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who produced this adjudicated response. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #setOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
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
	 * The Insurer who produced this adjudicated response. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Reference</em>' containment reference.
	 * @see #setOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getOrganizationReference <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Reference</em>' containment reference.
	 * @see #getOrganizationReference()
	 * @generated
	 */
	void setOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of requestProvider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Provider Identifier</em>' containment reference.
	 * @see #setRequestProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_RequestProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestProviderIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRequestProviderIdentifier <em>Request Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider Identifier</em>' containment reference.
	 * @see #getRequestProviderIdentifier()
	 * @generated
	 */
	void setRequestProviderIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Request Provider Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of requestProvider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Provider Reference</em>' containment reference.
	 * @see #setRequestProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_RequestProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestProviderReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRequestProviderReference <em>Request Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider Reference</em>' containment reference.
	 * @see #getRequestProviderReference()
	 * @generated
	 */
	void setRequestProviderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Organization Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of requestOrganization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Organization Identifier</em>' containment reference.
	 * @see #setRequestOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_RequestOrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestOrganizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRequestOrganizationIdentifier <em>Request Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization Identifier</em>' containment reference.
	 * @see #getRequestOrganizationIdentifier()
	 * @generated
	 */
	void setRequestOrganizationIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Request Organization Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of requestOrganization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Organization Reference</em>' containment reference.
	 * @see #setRequestOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_RequestOrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestOrganizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getRequestOrganizationReference <em>Request Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization Reference</em>' containment reference.
	 * @see #getRequestOrganizationReference()
	 * @generated
	 */
	void setRequestOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Inforce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inforce</em>' containment reference.
	 * @see #setInforce(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Inforce()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inforce' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInforce();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getInforce <em>Inforce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inforce</em>' containment reference.
	 * @see #getInforce()
	 * @generated
	 */
	void setInforce(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract resource which may provide more detailed information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Reference value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponse#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EligibilityResponseBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits and optionally current balances by Category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_BenefitBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EligibilityResponseBenefitBalance> getBenefitBalance();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EligibilityResponseError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutually exclusive with Services Provided (Item).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponse_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EligibilityResponseError> getError();

} // EligibilityResponse
