/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Missing Teeth</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth#getTooth <em>Tooth</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth#getExtractionDate <em>Extraction Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitMissingTeeth()
 * @model extendedMetaData="name='ExplanationOfBenefit.MissingTeeth' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitMissingTeeth extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Tooth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code identifying which tooth is missing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tooth</em>' containment reference.
	 * @see #setTooth(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitMissingTeeth_Tooth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tooth' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getTooth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth#getTooth <em>Tooth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooth</em>' containment reference.
	 * @see #getTooth()
	 * @generated
	 */
	void setTooth(Coding value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing reason may be: E-extraction, O-other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitMissingTeeth_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(Coding value);

	/**
	 * Returns the value of the '<em><b>Extraction Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the extraction either known from records or patient reported estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extraction Date</em>' containment reference.
	 * @see #setExtractionDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitMissingTeeth_ExtractionDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extractionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getExtractionDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth#getExtractionDate <em>Extraction Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extraction Date</em>' containment reference.
	 * @see #getExtractionDate()
	 * @generated
	 */
	void setExtractionDate(Date value);

} // ExplanationOfBenefitMissingTeeth
