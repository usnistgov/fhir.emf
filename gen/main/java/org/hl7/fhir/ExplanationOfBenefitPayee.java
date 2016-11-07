/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Payee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayee#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayee#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayee#getPartyIdentifier <em>Party Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayee#getPartyReference <em>Party Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayee()
 * @model extendedMetaData="name='ExplanationOfBenefit.Payee' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitPayee extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Party to be reimbursed: Subscriber, provider, other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayee_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayee#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * organization | patient | practitioner | relatedperson.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' containment reference.
	 * @see #setResourceType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayee_ResourceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getResourceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayee#getResourceType <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' containment reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Coding value);

	/**
	 * Returns the value of the '<em><b>Party Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party to be reimbursed: Subscriber, provider, other. (choose any one of party*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Identifier</em>' containment reference.
	 * @see #setPartyIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayee_PartyIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partyIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPartyIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayee#getPartyIdentifier <em>Party Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Identifier</em>' containment reference.
	 * @see #getPartyIdentifier()
	 * @generated
	 */
	void setPartyIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Party Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party to be reimbursed: Subscriber, provider, other. (choose any one of party*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Reference</em>' containment reference.
	 * @see #setPartyReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayee_PartyReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partyReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPartyReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayee#getPartyReference <em>Party Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Reference</em>' containment reference.
	 * @see #getPartyReference()
	 * @generated
	 */
	void setPartyReference(Reference value);

} // ExplanationOfBenefitPayee
