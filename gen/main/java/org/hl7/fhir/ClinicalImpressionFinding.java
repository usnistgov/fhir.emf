/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalImpressionFinding#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpressionFinding#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpressionFinding#getCause <em>Cause</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding()
 * @model extendedMetaData="name='ClinicalImpression.Finding' kind='elementOnly'"
 * @generated
 */
public interface ClinicalImpressionFinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions. (choose any one of item*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #setItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding_ItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionFinding#getItemCodeableConcept <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #getItemCodeableConcept()
	 * @generated
	 */
	void setItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions. (choose any one of item*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding_ItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionFinding#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which investigations support finding or diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference.
	 * @see #setCause(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpressionFinding_Cause()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cause' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCause();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpressionFinding#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' containment reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(org.hl7.fhir.String value);

} // ClinicalImpressionFinding
