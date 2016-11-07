/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a required data item for evaluation in terms of the type of data, and optional code- or date-based filters of the data.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DataRequirement#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getDateFilter <em>Date Filter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDataRequirement()
 * @model extendedMetaData="name='DataRequirement' kind='elementOnly'"
 * @generated
 */
public interface DataRequirement extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile of the required data, specified as the uri of the profile definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProfile();

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_MustSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getMustSupport();

	/**
	 * Returns the value of the '<em><b>Code Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirementCodeFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_CodeFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirementCodeFilter> getCodeFilter();

	/**
	 * Returns the value of the '<em><b>Date Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirementDateFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_DateFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirementDateFilter> getDateFilter();

} // DataRequirement
