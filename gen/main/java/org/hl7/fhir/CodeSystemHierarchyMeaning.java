/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Hierarchy Meaning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The meaning of the hierarchy of concepts in a code system
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CodeSystemHierarchyMeaning#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCodeSystemHierarchyMeaning()
 * @model extendedMetaData="name='CodeSystemHierarchyMeaning' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemHierarchyMeaning extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.CodeSystemHierarchyMeaningList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CodeSystemHierarchyMeaningList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CodeSystemHierarchyMeaningList)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystemHierarchyMeaning_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	CodeSystemHierarchyMeaningList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystemHierarchyMeaning#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CodeSystemHierarchyMeaningList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeSystemHierarchyMeaningList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.CodeSystemHierarchyMeaning#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CodeSystemHierarchyMeaningList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.CodeSystemHierarchyMeaning#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CodeSystemHierarchyMeaningList)
	 * @generated
	 */
	boolean isSetValue();

} // CodeSystemHierarchyMeaning
