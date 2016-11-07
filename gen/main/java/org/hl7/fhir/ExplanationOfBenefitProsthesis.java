/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Prosthesis</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitProsthesis#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitProsthesis#getPriorDate <em>Prior Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitProsthesis#getPriorMaterial <em>Prior Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitProsthesis()
 * @model extendedMetaData="name='ExplanationOfBenefit.Prosthesis' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitProsthesis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this is the initial placement of a fixed prosthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitProsthesis_Initial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initial' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInitial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitProsthesis#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Prior Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of the initial placement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior Date</em>' containment reference.
	 * @see #setPriorDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitProsthesis_PriorDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priorDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPriorDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitProsthesis#getPriorDate <em>Prior Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Date</em>' containment reference.
	 * @see #getPriorDate()
	 * @generated
	 */
	void setPriorDate(Date value);

	/**
	 * Returns the value of the '<em><b>Prior Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material of the prior denture or bridge prosthesis (Oral).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior Material</em>' containment reference.
	 * @see #setPriorMaterial(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitProsthesis_PriorMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priorMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPriorMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitProsthesis#getPriorMaterial <em>Prior Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Material</em>' containment reference.
	 * @see #getPriorMaterial()
	 * @generated
	 */
	void setPriorMaterial(Coding value);

} // ExplanationOfBenefitProsthesis
