/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Version Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Whether a reference needs to be version specific or version independent, or whetehr either can be used
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ReferenceVersionRules#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getReferenceVersionRules()
 * @model extendedMetaData="name='ReferenceVersionRules' kind='elementOnly'"
 * @generated
 */
public interface ReferenceVersionRules extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.ReferenceVersionRulesList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ReferenceVersionRulesList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ReferenceVersionRulesList)
	 * @see org.hl7.fhir.FhirPackage#getReferenceVersionRules_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ReferenceVersionRulesList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferenceVersionRules#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ReferenceVersionRulesList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ReferenceVersionRulesList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.ReferenceVersionRules#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ReferenceVersionRulesList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.ReferenceVersionRules#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ReferenceVersionRulesList)
	 * @generated
	 */
	boolean isSetValue();

} // ReferenceVersionRules
