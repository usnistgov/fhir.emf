/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the insurance eligibility details from the insurer regarding a specified coverage and optionally some class of service.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getInsurerIdentifier <em>Insurer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getInsurerReference <em>Insurer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getEntererIdentifier <em>Enterer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getEntererReference <em>Enterer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getFacilityIdentifier <em>Facility Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getFacilityReference <em>Facility Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getPatientIdentifier <em>Patient Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getPatientReference <em>Patient Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getCoverageIdentifier <em>Coverage Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getCoverageReference <em>Coverage Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getBenefitCategory <em>Benefit Category</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getBenefitSubCategory <em>Benefit Sub Category</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest()
 * @model extendedMetaData="name='EligibilityRequest' kind='elementOnly'"
 * @generated
 */
public interface EligibilityRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EligibilityRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EligibilityRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EligibilityRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Insurer Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of insurer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer Identifier</em>' containment reference.
	 * @see #setInsurerIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_InsurerIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getInsurerIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getInsurerIdentifier <em>Insurer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer Identifier</em>' containment reference.
	 * @see #getInsurerIdentifier()
	 * @generated
	 */
	void setInsurerIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Insurer Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of insurer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer Reference</em>' containment reference.
	 * @see #setInsurerReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_InsurerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getInsurerReference <em>Insurer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer Reference</em>' containment reference.
	 * @see #getInsurerReference()
	 * @generated
	 */
	void setInsurerReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #getProviderIdentifier()
	 * @generated
	 */
	void setProviderIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Provider Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getProviderReference <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Reference</em>' containment reference.
	 * @see #getProviderReference()
	 * @generated
	 */
	void setProviderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #setOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #getOrganizationIdentifier()
	 * @generated
	 */
	void setOrganizationIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Organization Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Reference</em>' containment reference.
	 * @see #setOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getOrganizationReference <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Reference</em>' containment reference.
	 * @see #getOrganizationReference()
	 * @generated
	 */
	void setOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immediate (STAT), best effort (NORMAL), deferred (DEFER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Coding value);

	/**
	 * Returns the value of the '<em><b>Enterer Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who created the invoice/claim/pre-determination or pre-authorization. (choose any one of enterer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer Identifier</em>' containment reference.
	 * @see #setEntererIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_EntererIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entererIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getEntererIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getEntererIdentifier <em>Enterer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer Identifier</em>' containment reference.
	 * @see #getEntererIdentifier()
	 * @generated
	 */
	void setEntererIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Enterer Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who created the invoice/claim/pre-determination or pre-authorization. (choose any one of enterer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer Reference</em>' containment reference.
	 * @see #setEntererReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_EntererReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entererReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEntererReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getEntererReference <em>Enterer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer Reference</em>' containment reference.
	 * @see #getEntererReference()
	 * @generated
	 */
	void setEntererReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Facility Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Facility where the services were provided. (choose any one of facility*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Identifier</em>' containment reference.
	 * @see #setFacilityIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_FacilityIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getFacilityIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getFacilityIdentifier <em>Facility Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Identifier</em>' containment reference.
	 * @see #getFacilityIdentifier()
	 * @generated
	 */
	void setFacilityIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Facility Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Facility where the services were provided. (choose any one of facility*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Reference</em>' containment reference.
	 * @see #setFacilityReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_FacilityReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFacilityReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getFacilityReference <em>Facility Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Reference</em>' containment reference.
	 * @see #getFacilityReference()
	 * @generated
	 */
	void setFacilityReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource. (choose any one of patient*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Identifier</em>' containment reference.
	 * @see #setPatientIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_PatientIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPatientIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getPatientIdentifier <em>Patient Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Identifier</em>' containment reference.
	 * @see #getPatientIdentifier()
	 * @generated
	 */
	void setPatientIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Patient Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource. (choose any one of patient*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Reference</em>' containment reference.
	 * @see #setPatientReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_PatientReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatientReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getPatientReference <em>Patient Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Reference</em>' containment reference.
	 * @see #getPatientReference()
	 * @generated
	 */
	void setPatientReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care. (choose any one of coverage*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Identifier</em>' containment reference.
	 * @see #setCoverageIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_CoverageIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getCoverageIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getCoverageIdentifier <em>Coverage Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Identifier</em>' containment reference.
	 * @see #getCoverageIdentifier()
	 * @generated
	 */
	void setCoverageIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Coverage Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care. (choose any one of coverage*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Reference</em>' containment reference.
	 * @see #setCoverageReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_CoverageReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverageReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getCoverageReference <em>Coverage Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Reference</em>' containment reference.
	 * @see #getCoverageReference()
	 * @generated
	 */
	void setCoverageReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract number of a business agreement which describes the terms and conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #setBusinessArrangement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_BusinessArrangement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessArrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getBusinessArrangement <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Serviced Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or dates when the enclosed suite of services were performed or completed. (choose any one of serviced*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviced Date</em>' containment reference.
	 * @see #setServicedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getServicedDate <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Date</em>' containment reference.
	 * @see #getServicedDate()
	 * @generated
	 */
	void setServicedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Serviced Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or dates when the enclosed suite of services were performed or completed. (choose any one of serviced*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviced Period</em>' containment reference.
	 * @see #setServicedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getServicedPeriod <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Period</em>' containment reference.
	 * @see #getServicedPeriod()
	 * @generated
	 */
	void setServicedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Benefit Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dental, Vision, Medical, Pharmacy, Rehab etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Category</em>' containment reference.
	 * @see #setBenefitCategory(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_BenefitCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getBenefitCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getBenefitCategory <em>Benefit Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Category</em>' containment reference.
	 * @see #getBenefitCategory()
	 * @generated
	 */
	void setBenefitCategory(Coding value);

	/**
	 * Returns the value of the '<em><b>Benefit Sub Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Sub Category</em>' containment reference.
	 * @see #setBenefitSubCategory(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_BenefitSubCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitSubCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getBenefitSubCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getBenefitSubCategory <em>Benefit Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Sub Category</em>' containment reference.
	 * @see #getBenefitSubCategory()
	 * @generated
	 */
	void setBenefitSubCategory(Coding value);

} // EligibilityRequest
