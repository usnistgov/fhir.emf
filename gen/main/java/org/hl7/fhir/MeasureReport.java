/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MeasureReport resource contains the results of evaluating a measure.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MeasureReport#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getReportingOrganization <em>Reporting Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReport#getEvaluatedResources <em>Evaluated Resources</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReport()
 * @model extendedMetaData="name='MeasureReport' kind='elementOnly'"
 * @generated
 */
public interface MeasureReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the Measure that was evaluated to produce this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Measure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of measure report. This may be an individual report, which provides a single patient's score for the measure, a patient listing, which returns the list of patients that meet the various criteria in the measure, or a summary report, which returns a population count for each criteria in the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(MeasureReportType)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReportType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MeasureReportType value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional Patient if the report was requested for a single patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reporting period for which the report was calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The report status. No data will be available until the report status is complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MeasureReportStatus)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MeasureReportStatus value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date this measure report was generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reporting Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reporting Organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting Organization</em>' containment reference.
	 * @see #setReportingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_ReportingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReportingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getReportingOrganization <em>Reporting Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Organization</em>' containment reference.
	 * @see #getReportingOrganization()
	 * @generated
	 */
	void setReportingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The results of the calculation, one for each population group in the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Evaluated Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Bundle containing the Resources that were used in the evaluation of this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluated Resources</em>' containment reference.
	 * @see #setEvaluatedResources(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReport_EvaluatedResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluatedResources' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEvaluatedResources();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReport#getEvaluatedResources <em>Evaluated Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluated Resources</em>' containment reference.
	 * @see #getEvaluatedResources()
	 * @generated
	 */
	void setEvaluatedResources(Reference value);

} // MeasureReport
