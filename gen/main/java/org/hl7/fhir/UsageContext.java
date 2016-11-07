/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies clinical metadata that can be used to retrieve, index and/or categorize the knowledge artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.UsageContext#getPatientGender <em>Patient Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getPatientAgeGroup <em>Patient Age Group</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getClinicalFocus <em>Clinical Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getTargetUser <em>Target User</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getWorkflowSetting <em>Workflow Setting</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getWorkflowTask <em>Workflow Task</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getClinicalVenue <em>Clinical Venue</em>}</li>
 *   <li>{@link org.hl7.fhir.UsageContext#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getUsageContext()
 * @model extendedMetaData="name='UsageContext' kind='elementOnly'"
 * @generated
 */
public interface UsageContext extends Element {
	/**
	 * Returns the value of the '<em><b>Patient Gender</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gender of the patient. For this item type, use HL7 administrative gender codes (OID: 2.16.840.1.113883.1.11.1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Gender</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_PatientGender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientGender' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPatientGender();

	/**
	 * Returns the value of the '<em><b>Patient Age Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient demographic category for which this artifact is applicable. Allows specification of age groups using coded values originating from the MeSH Code system (OID: 2.16.840.1.113883.6.177). More specifically, only codes from the AgeGroupObservationValue value set are valid for this field  [2.16.840.1.113883.11.75].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Age Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_PatientAgeGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientAgeGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPatientAgeGroup();

	/**
	 * Returns the value of the '<em><b>Clinical Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical concept(s) addressed by the artifact.  For example, disease, diagnostic test interpretation, medication ordering. Please refer to the implementation guide on which code system and codes to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_ClinicalFocus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalFocus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClinicalFocus();

	/**
	 * Returns the value of the '<em><b>Target User</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user types to which an artifact is targeted.  For example, PCP, Patient, Cardiologist, Behavioral Professional, Oral Health Professional, Prescriber, etc... taken from the NUCC Health Care provider taxonomyCode system (OID: 2.16.840.1.113883.6.101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target User</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_TargetUser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetUser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTargetUser();

	/**
	 * Returns the value of the '<em><b>Workflow Setting</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The settings in which the artifact is intended for use.  For example, admission, pre-op, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workflow Setting</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_WorkflowSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workflowSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getWorkflowSetting();

	/**
	 * Returns the value of the '<em><b>Workflow Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the clinical task(s) represented by this artifact. Can be any task context represented by the HL7 ActTaskCode value set (OID: 2.16.840.1.113883.1.11.19846). General categories include: order entry, patient documentation and patient information review.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workflow Task</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_WorkflowTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workflowTask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getWorkflowTask();

	/**
	 * Returns the value of the '<em><b>Clinical Venue</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The venue in which an artifact could be used.  For example, Outpatient, Inpatient, Home, Nursing home. The code value may originate from either the HL7 ActEncounter (OID: 2.16.840.1.113883.1.11.13955) or NUCC non-individual provider codes OID: 2.16.840.1.113883.1.11.19465.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Venue</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_ClinicalVenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalVenue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClinicalVenue();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jurisdiction in which the artifact is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUsageContext_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdiction();

} // UsageContext
