/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getAttestedDate <em>Attested Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance()
 * @model extendedMetaData="name='AllergyIntolerance' kind='elementOnly'"
 * @generated
 */
public interface AllergyIntolerance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Onset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record of the date and/or time of the onset of the Allergy or Intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset</em>' containment reference.
	 * @see #setOnset(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Onset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onset' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOnset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getOnset <em>Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset</em>' containment reference.
	 * @see #getOnset()
	 * @generated
	 */
	void setOnset(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the date and/or time of the last known occurrence of a reaction event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Occurrence</em>' containment reference.
	 * @see #setLastOccurrence(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_LastOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastOccurrence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getLastOccurrence <em>Last Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Occurrence</em>' containment reference.
	 * @see #getLastOccurrence()
	 * @generated
	 */
	void setLastOccurrence(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual who recorded the record and takes responsibility for its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who has the allergy or intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Attested Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the most recent date on which the recorder has asserted that the information represented by this AllergyIntolerance record is accurate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attested Date</em>' containment reference.
	 * @see #setAttestedDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_AttestedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attestedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAttestedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getAttestedDate <em>Attested Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attested Date</em>' containment reference.
	 * @see #getAttestedDate()
	 * @generated
	 */
	void setAttestedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of the information about the allergy that is recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporter</em>' containment reference.
	 * @see #setReporter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Reporter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reporter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReporter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getReporter <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' containment reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AllergyIntoleranceStatus)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AllergyIntoleranceStatus value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criticality</em>' containment reference.
	 * @see #setCriticality(AllergyIntoleranceCriticality)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Criticality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criticality' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceCriticality getCriticality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCriticality <em>Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' containment reference.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(AllergyIntoleranceCriticality value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., "Latex"), an allergy or intolerance condition (e.g., "Latex allergy"), or a negated/excluded code for a specific substance or class (e.g., "No latex allergy") or a general or categorical negated statement (e.g.,  "No known allergy", "No known drug allergies").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the underlying physiological mechanism for the reaction risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AllergyIntoleranceType)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AllergyIntoleranceType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of the identified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(AllergyIntoleranceCategory)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceCategory getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(AllergyIntoleranceCategory value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AllergyIntoleranceReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about each adverse reaction event linked to exposure to the identified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Reaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AllergyIntoleranceReaction> getReaction();

} // AllergyIntolerance
