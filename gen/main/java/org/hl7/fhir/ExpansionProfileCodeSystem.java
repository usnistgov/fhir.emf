/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExpansionProfileCodeSystem#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfileCodeSystem#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileCodeSystem()
 * @model extendedMetaData="name='ExpansionProfile.CodeSystem' kind='elementOnly'"
 * @generated
 */
public interface ExpansionProfileCodeSystem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code systems to be included in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(ExpansionProfileInclude)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileCodeSystem_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileInclude getInclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileCodeSystem#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(ExpansionProfileInclude value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code systems to be excluded from value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(ExpansionProfileExclude)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileCodeSystem_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileExclude getExclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileCodeSystem#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(ExpansionProfileExclude value);

} // ExpansionProfileCodeSystem
