/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A homogeneous material with a definite composition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceIngredient#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceIngredient#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceIngredient#getSubstanceReference <em>Substance Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient()
 * @model extendedMetaData="name='Substance.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface SubstanceIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the ingredient in the substance - a concentration ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceIngredient#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Ratio value);

	/**
	 * Returns the value of the '<em><b>Substance Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another substance that is a component of this substance. (choose any one of substance*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Codeable Concept</em>' containment reference.
	 * @see #setSubstanceCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient_SubstanceCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstanceCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceIngredient#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Codeable Concept</em>' containment reference.
	 * @see #getSubstanceCodeableConcept()
	 * @generated
	 */
	void setSubstanceCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Substance Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another substance that is a component of this substance. (choose any one of substance*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Reference</em>' containment reference.
	 * @see #setSubstanceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceIngredient_SubstanceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubstanceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceIngredient#getSubstanceReference <em>Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Reference</em>' containment reference.
	 * @see #getSubstanceReference()
	 * @generated
	 */
	void setSubstanceReference(Reference value);

} // SubstanceIngredient
