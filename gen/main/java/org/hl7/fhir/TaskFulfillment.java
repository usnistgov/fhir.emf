/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A task to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TaskFulfillment#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link org.hl7.fhir.TaskFulfillment#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.TaskFulfillment#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTaskFulfillment()
 * @model extendedMetaData="name='Task.Fulfillment' kind='elementOnly'"
 * @generated
 */
public interface TaskFulfillment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the number of times the requested action should occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repetitions</em>' containment reference.
	 * @see #setRepetitions(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getTaskFulfillment_Repetitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repetitions' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRepetitions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TaskFulfillment#getRepetitions <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' containment reference.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Over what time-period is fulfillment sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getTaskFulfillment_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TaskFulfillment#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipients</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTaskFulfillment_Recipients()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipients' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipients();

} // TaskFulfillment
