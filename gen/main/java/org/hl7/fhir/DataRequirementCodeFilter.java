/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Requirement Code Filter</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DataRequirementCodeFilter#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementCodeFilter#getValueSetString <em>Value Set String</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementCodeFilter#getValueSetReference <em>Value Set Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementCodeFilter#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementCodeFilter#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirementCodeFilter#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter()
 * @model extendedMetaData="name='DataRequirement.CodeFilter' kind='elementOnly'"
 * @generated
 */
public interface DataRequirementCodeFilter extends Element {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementCodeFilter#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset. (choose any one of valueSet*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set String</em>' containment reference.
	 * @see #setValueSetString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter_ValueSetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueSetString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementCodeFilter#getValueSetString <em>Value Set String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set String</em>' containment reference.
	 * @see #getValueSetString()
	 * @generated
	 */
	void setValueSetString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset. (choose any one of valueSet*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #setValueSetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter_ValueSetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueSetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirementCodeFilter#getValueSetReference <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #getValueSetReference()
	 * @generated
	 */
	void setValueSetReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codes for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter_ValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getValueCode();

	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Coding</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter_ValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getValueCoding();

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirementCodeFilter_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getValueCodeableConcept();

} // DataRequirementCodeFilter
