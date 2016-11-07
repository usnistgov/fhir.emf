/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestProviderIdentifier <em>Request Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestProviderReference <em>Request Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestOrganizationIdentifier <em>Request Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestOrganizationReference <em>Request Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponse()
 * @model extendedMetaData="name='ClaimResponse' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Identifier()
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
	 * @see #setStatus(ClaimResponseStatus)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ClaimResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource referrence. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Identifier</em>' containment reference.
	 * @see #setRequestIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestIdentifier <em>Request Identifier</em>}' containment reference.
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
	 * Original request resource referrence. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Reference</em>' containment reference.
	 * @see #setRequestReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestReference <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Reference</em>' containment reference.
	 * @see #getRequestReference()
	 * @generated
	 */
	void setRequestReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRuleset <em>Ruleset</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getCreated <em>Created</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOrganizationReference <em>Organization Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestProviderIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestProviderIdentifier <em>Request Provider Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestProviderReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestProviderReference <em>Request Provider Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestOrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestOrganizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestOrganizationIdentifier <em>Request Organization Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_RequestOrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestOrganizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestOrganizationReference <em>Request Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization Reference</em>' containment reference.
	 * @see #getRequestOrganizationReference()
	 * @generated
	 */
	void setRequestOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing outcome errror, partial or complete processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Coding value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Payee Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party to be reimbursed: Subscriber, provider, other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Type</em>' containment reference.
	 * @see #setPayeeType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PayeeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPayeeType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPayeeType <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Type</em>' containment reference.
	 * @see #getPayeeType()
	 * @generated
	 */
	void setPayeeType(Coding value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for submitted services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseItem> getItem();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAddItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_AddItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAddItem> getAddItem();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutually exclusive with Services Provided (Item).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseError> getError();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total cost of the services reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Cost</em>' containment reference.
	 * @see #setTotalCost(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_TotalCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalCost' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalCost();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getTotalCost <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' containment reference.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(Money value);

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of deductible applied which was not allocated to any particular service line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_UnallocDeductable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unallocDeductable' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getUnallocDeductable <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Benefit</em>' containment reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_TotalBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getTotalBenefit <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' containment reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment details for the claim if the claim has been paid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(ClaimResponsePayment)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Payment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payment' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponsePayment getPayment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(ClaimResponsePayment value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of funds reservation (For provider, for Patient, None).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' containment reference.
	 * @see #setReserved(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Reserved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getReserved();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getReserved <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' containment reference.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Coding value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseNote> getNote();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseCoverage> getCoverage();

} // ClaimResponse
