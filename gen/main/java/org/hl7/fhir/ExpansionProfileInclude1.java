/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Include1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExpansionProfileInclude1#getDesignation <em>Designation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileInclude1()
 * @model extendedMetaData="name='ExpansionProfile.Include1' kind='elementOnly'"
 * @generated
 */
public interface ExpansionProfileInclude1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileDesignation1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data group for each designation to be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileInclude1_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpansionProfileDesignation1> getDesignation();

} // ExpansionProfileInclude1
