/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Action Cardinality Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines behavior for an action or a group for how many times that item may be repeated
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PlanActionCardinalityBehavior#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanActionCardinalityBehavior()
 * @model extendedMetaData="name='PlanActionCardinalityBehavior' kind='elementOnly'"
 * @generated
 */
public interface PlanActionCardinalityBehavior extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.PlanActionCardinalityBehaviorList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.PlanActionCardinalityBehaviorList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(PlanActionCardinalityBehaviorList)
	 * @see org.hl7.fhir.FhirPackage#getPlanActionCardinalityBehavior_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	PlanActionCardinalityBehaviorList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanActionCardinalityBehavior#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.PlanActionCardinalityBehaviorList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PlanActionCardinalityBehaviorList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.PlanActionCardinalityBehavior#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(PlanActionCardinalityBehaviorList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.PlanActionCardinalityBehavior#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(PlanActionCardinalityBehaviorList)
	 * @generated
	 */
	boolean isSetValue();

} // PlanActionCardinalityBehavior
