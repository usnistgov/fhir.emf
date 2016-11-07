/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Include</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExpansionProfileInclude#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileInclude()
 * @model extendedMetaData="name='ExpansionProfile.Include' kind='elementOnly'"
 * @generated
 */
public interface ExpansionProfileInclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileCodeSystem1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data group for each code system to be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileInclude_CodeSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpansionProfileCodeSystem1> getCodeSystem();

} // ExpansionProfileInclude
