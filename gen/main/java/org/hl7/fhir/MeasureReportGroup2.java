/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MeasureReport resource contains the results of evaluating a measure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup2#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup2#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup2#getPatients <em>Patients</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup2()
 * @model extendedMetaData="name='MeasureReport.Group2' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportGroup2 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value for this supplemental data element, expressed as a string.  When defining supplemental data  on complex values, the value must be rendered such that the value for each group within the supplemental data element is unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup2_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup2#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of members in the supplemental data group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup2_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup2#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Patients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element refers to a List of patient level MeasureReport resources, one for each patient in this population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patients</em>' containment reference.
	 * @see #setPatients(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup2_Patients()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patients' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatients();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup2#getPatients <em>Patients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patients</em>' containment reference.
	 * @see #getPatients()
	 * @generated
	 */
	void setPatients(Reference value);

} // MeasureReportGroup2
