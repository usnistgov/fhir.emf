/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MeasureReportGroup#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup#getMeasureScore <em>Measure Score</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup#getStratifier <em>Stratifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportGroup#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup()
 * @model extendedMetaData="name='MeasureReport.Group' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the population group as defined in the measure definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportPopulation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The populations that make up the population group, one for each type of population appropriate for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportPopulation> getPopulation();

	/**
	 * Returns the value of the '<em><b>Measure Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Score</em>' containment reference.
	 * @see #setMeasureScore(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup_MeasureScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScore' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getMeasureScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportGroup#getMeasureScore <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score</em>' containment reference.
	 * @see #getMeasureScore()
	 * @generated
	 */
	void setMeasureScore(Decimal value);

	/**
	 * Returns the value of the '<em><b>Stratifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportStratifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stratifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup_Stratifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stratifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportStratifier> getStratifier();

	/**
	 * Returns the value of the '<em><b>Supplemental Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportSupplementalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplemental data elements for the measure provide additional information requested by the measure for each patient involved in the populations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportGroup_SupplementalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportSupplementalData> getSupplementalData();

} // MeasureReportGroup
