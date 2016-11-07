/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getInvestigations <em>Investigations</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getFinding <em>Finding</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrognosisCodeableConcept <em>Prognosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrognosisReference <em>Prognosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClinicalImpression()
 * @model extendedMetaData="name='ClinicalImpression' kind='elementOnly'"
 * @generated
 */
public interface ClinicalImpression extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Assessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinician performing the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessor</em>' containment reference.
	 * @see #setAssessor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Assessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAssessor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getAssessor <em>Assessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessor</em>' containment reference.
	 * @see #getAssessor()
	 * @generated
	 */
	void setAssessor(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the workflow status of the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ClinicalImpressionStatus)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpressionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ClinicalImpressionStatus value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorizes the type of clinical impression performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the documentation of the assessment was complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time or period over which the subject was assessed. (choose any one of effective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time or period over which the subject was assessed. (choose any one of effective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter or episode of care this impression was created as part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/status prompted it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group of individuals assessed as part of this record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Previous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='previous' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrevious();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Reference value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This a list of the relevant problems/conditions for a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Problem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='problem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProblem();

	/**
	 * Returns the value of the '<em><b>Investigations</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalImpressionInvestigations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Investigations</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Investigations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='investigations' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalImpressionInvestigations> getInvestigations();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getProtocol();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text summary of the investigations and the diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Finding</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalImpressionFinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finding</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Finding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalImpressionFinding> getFinding();

	/**
	 * Returns the value of the '<em><b>Prognosis Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate of likely outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prognosis Codeable Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_PrognosisCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prognosisCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPrognosisCodeableConcept();

	/**
	 * Returns the value of the '<em><b>Prognosis Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment expressing likely outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prognosis Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_PrognosisReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prognosisReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPrognosisReference();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan of action after assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPlan();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions taken during assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAction();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClinicalImpression_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // ClinicalImpression
