/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Payee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimPayee#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimPayee#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimPayee#getPartyIdentifier <em>Party Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimPayee#getPartyReference <em>Party Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimPayee()
 * @model extendedMetaData="name='Claim.Payee' kind='elementOnly'"
 * @generated
 */
public interface ClaimPayee extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Party to be reimbursed: Subscriber, provider, other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimPayee_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimPayee#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimPayee_ResourceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getResourceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimPayee#getResourceType <em>Resource Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimPayee_PartyIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partyIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPartyIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimPayee#getPartyIdentifier <em>Party Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimPayee_PartyReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partyReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPartyReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimPayee#getPartyReference <em>Party Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Reference</em>' containment reference.
	 * @see #getPartyReference()
	 * @generated
	 */
	void setPartyReference(Reference value);

} // ClaimPayee
