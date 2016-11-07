/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Related</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitRelated#getClaimIdentifier <em>Claim Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitRelated#getClaimReference <em>Claim Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitRelated#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitRelated#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitRelated()
 * @model extendedMetaData="name='ExplanationOfBenefit.Related' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitRelated extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Claim Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services. (choose any one of claim*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Identifier</em>' containment reference.
	 * @see #setClaimIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitRelated_ClaimIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getClaimIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitRelated#getClaimIdentifier <em>Claim Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Identifier</em>' containment reference.
	 * @see #getClaimIdentifier()
	 * @generated
	 */
	void setClaimIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Claim Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services. (choose any one of claim*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Reference</em>' containment reference.
	 * @see #setClaimReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitRelated_ClaimReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitRelated#getClaimReference <em>Claim Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Reference</em>' containment reference.
	 * @see #getClaimReference()
	 * @generated
	 */
	void setClaimReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example prior or umbrella.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitRelated_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitRelated#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitRelated_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitRelated#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Identifier value);

} // ExplanationOfBenefitRelated
