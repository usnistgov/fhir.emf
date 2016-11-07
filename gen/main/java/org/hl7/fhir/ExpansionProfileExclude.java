/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Exclude</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExpansionProfileExclude#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileExclude()
 * @model extendedMetaData="name='ExpansionProfile.Exclude' kind='elementOnly'"
 * @generated
 */
public interface ExpansionProfileExclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileCodeSystem2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data group for each code system to be excluded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileExclude_CodeSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpansionProfileCodeSystem2> getCodeSystem();

} // ExpansionProfileExclude
