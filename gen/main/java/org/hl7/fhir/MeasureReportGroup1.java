/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MeasureReportGroup1#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup1#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup1#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup1()
 * @model extendedMetaData="name='MeasureReport.Group1' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportGroup1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value for this stratum, expressed as a string. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup1_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup1#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportPopulation1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The populations that make up the stratum, one for each type of population appropriate to the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup1_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportPopulation1> getPopulation();

	/**
	 * Returns the value of the '<em><b>Measure Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure score for this stratum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Score</em>' containment reference.
	 * @see #setMeasureScore(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup1_MeasureScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScore' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getMeasureScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup1#getMeasureScore <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score</em>' containment reference.
	 * @see #getMeasureScore()
	 * @generated
	 */
	void setMeasureScore(Decimal value);

} // MeasureReportGroup1
