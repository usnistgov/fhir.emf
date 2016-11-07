/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAuthorIdentifier <em>Author Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAuthorReference <em>Author Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimIdentifier <em>Claim Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimReference <em>Claim Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponseIdentifier <em>Claim Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponseReference <em>Claim Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getFacilityIdentifier <em>Facility Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getFacilityReference <em>Facility Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrescriptionIdentifier <em>Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrescriptionReference <em>Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescriptionIdentifier <em>Original Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescriptionReference <em>Original Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getReferralIdentifier <em>Referral Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getReferralReference <em>Referral Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPatientIdentifier <em>Patient Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPatientReference <em>Patient Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getMissingTeeth <em>Missing Teeth</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit()
 * @model extendedMetaData="name='ExplanationOfBenefit' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefit extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EOB Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Identifier()
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
	 * @see #setStatus(ExplanationOfBenefitStatus)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ExplanationOfBenefitStatus value);

	/**
	 * Returns the value of the '<em><b>Author Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer which is responsible for the explanation of benefit. (choose any one of author*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Identifier</em>' containment reference.
	 * @see #setAuthorIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AuthorIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getAuthorIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAuthorIdentifier <em>Author Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Identifier</em>' containment reference.
	 * @see #getAuthorIdentifier()
	 * @generated
	 */
	void setAuthorIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Author Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer which is responsible for the explanation of benefit. (choose any one of author*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Reference</em>' containment reference.
	 * @see #setAuthorReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AuthorReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthorReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAuthorReference <em>Author Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Reference</em>' containment reference.
	 * @see #getAuthorReference()
	 * @generated
	 */
	void setAuthorReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Claim Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number. (choose any one of claim*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Identifier</em>' containment reference.
	 * @see #setClaimIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getClaimIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimIdentifier <em>Claim Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Identifier</em>' containment reference.
	 * @see #getClaimIdentifier()
	 * @generated
	 */
	void setClaimIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Claim Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number. (choose any one of claim*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Reference</em>' containment reference.
	 * @see #setClaimReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimReference <em>Claim Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Reference</em>' containment reference.
	 * @see #getClaimReference()
	 * @generated
	 */
	void setClaimReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Claim Response Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number. (choose any one of claimResponse*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response Identifier</em>' containment reference.
	 * @see #setClaimResponseIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimResponseIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponseIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getClaimResponseIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponseIdentifier <em>Claim Response Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response Identifier</em>' containment reference.
	 * @see #getClaimResponseIdentifier()
	 * @generated
	 */
	void setClaimResponseIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Claim Response Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number. (choose any one of claimResponse*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response Reference</em>' containment reference.
	 * @see #setClaimResponseReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimResponseReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponseReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimResponseReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponseReference <em>Claim Response Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response Reference</em>' containment reference.
	 * @see #getClaimResponseReference()
	 * @generated
	 */
	void setClaimResponseReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of claim, eg, oral, pharmacy, vision, insitutional, professional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSubType();

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing outcome errror, partial or complete processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Coding value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider which is responsible for the claim. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
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
	 * The provider which is responsible for the claim. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getProviderReference <em>Provider Reference</em>}' containment reference.
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
	 * The provider which is responsible for the claim. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #setOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
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
	 * The provider which is responsible for the claim. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Reference</em>' containment reference.
	 * @see #setOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOrganizationReference <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Reference</em>' containment reference.
	 * @see #getOrganizationReference()
	 * @generated
	 */
	void setOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Facility Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Facility where the services were provided. (choose any one of facility*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Identifier</em>' containment reference.
	 * @see #setFacilityIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_FacilityIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getFacilityIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getFacilityIdentifier <em>Facility Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_FacilityReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFacilityReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getFacilityReference <em>Facility Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Reference</em>' containment reference.
	 * @see #getFacilityReference()
	 * @generated
	 */
	void setFacilityReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitRelated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Related()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitRelated> getRelated();

	/**
	 * Returns the value of the '<em><b>Prescription Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prescription to support the dispensing of Pharmacy or Vision products. (choose any one of prescription*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescription Identifier</em>' containment reference.
	 * @see #setPrescriptionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PrescriptionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriptionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPrescriptionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrescriptionIdentifier <em>Prescription Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Identifier</em>' containment reference.
	 * @see #getPrescriptionIdentifier()
	 * @generated
	 */
	void setPrescriptionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Prescription Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prescription to support the dispensing of Pharmacy or Vision products. (choose any one of prescription*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescription Reference</em>' containment reference.
	 * @see #setPrescriptionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PrescriptionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriptionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescriptionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrescriptionReference <em>Prescription Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Reference</em>' containment reference.
	 * @see #getPrescriptionReference()
	 * @generated
	 */
	void setPrescriptionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Original Prescription Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. (choose any one of originalPrescription*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Prescription Identifier</em>' containment reference.
	 * @see #setOriginalPrescriptionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OriginalPrescriptionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalPrescriptionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOriginalPrescriptionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescriptionIdentifier <em>Original Prescription Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Prescription Identifier</em>' containment reference.
	 * @see #getOriginalPrescriptionIdentifier()
	 * @generated
	 */
	void setOriginalPrescriptionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Original Prescription Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. (choose any one of originalPrescription*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Prescription Reference</em>' containment reference.
	 * @see #setOriginalPrescriptionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OriginalPrescriptionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalPrescriptionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOriginalPrescriptionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescriptionReference <em>Original Prescription Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Prescription Reference</em>' containment reference.
	 * @see #getOriginalPrescriptionReference()
	 * @generated
	 */
	void setOriginalPrescriptionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party to be reimbursed for the services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(ExplanationOfBenefitPayee)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitPayee getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ExplanationOfBenefitPayee value);

	/**
	 * Returns the value of the '<em><b>Referral Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral resource which lists the date, practitioner, reason and other supporting information. (choose any one of referral*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Identifier</em>' containment reference.
	 * @see #setReferralIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ReferralIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getReferralIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getReferralIdentifier <em>Referral Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral Identifier</em>' containment reference.
	 * @see #getReferralIdentifier()
	 * @generated
	 */
	void setReferralIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Referral Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral resource which lists the date, practitioner, reason and other supporting information. (choose any one of referral*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Reference</em>' containment reference.
	 * @see #setReferralReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ReferralReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferralReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getReferralReference <em>Referral Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral Reference</em>' containment reference.
	 * @see #getReferralReference()
	 * @generated
	 */
	void setReferralReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Information()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='information' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitInformation> getInformation();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient diagnosis for which care is sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient procedures performed to support the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitProcedure> getProcedure();

	/**
	 * Returns the value of the '<em><b>Patient Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource. (choose any one of patient*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Identifier</em>' containment reference.
	 * @see #setPatientIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PatientIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPatientIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPatientIdentifier <em>Patient Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PatientReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatientReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPatientReference <em>Patient Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Reference</em>' containment reference.
	 * @see #getPatientReference()
	 * @generated
	 */
	void setPatientReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precedence (primary, secondary, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference.
	 * @see #setPrecedence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Precedence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precedence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPrecedence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence</em>' containment reference.
	 * @see #getPrecedence()
	 * @generated
	 */
	void setPrecedence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(ExplanationOfBenefitCoverage)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitCoverage getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(ExplanationOfBenefitCoverage value);

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An accident which resulted in the need for healthcare services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accident</em>' containment reference.
	 * @see #setAccident(ExplanationOfBenefitAccident)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Accident()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accident' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitAccident getAccident();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccident <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' containment reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(ExplanationOfBenefitAccident value);

	/**
	 * Returns the value of the '<em><b>Employment Impacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #setEmploymentImpacted(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_EmploymentImpacted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='employmentImpacted' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEmploymentImpacted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #getEmploymentImpacted()
	 * @generated
	 */
	void setEmploymentImpacted(Period value);

	/**
	 * Returns the value of the '<em><b>Hospitalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was confined to a treatment center.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hospitalization</em>' containment reference.
	 * @see #setHospitalization(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Hospitalization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hospitalization' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getHospitalization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' containment reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitItem> getItem();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAddItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AddItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitAddItem> getAddItem();

	/**
	 * Returns the value of the '<em><b>Missing Teeth</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missing Teeth</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_MissingTeeth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missingTeeth' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitMissingTeeth> getMissingTeeth();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total cost of the services reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Cost</em>' containment reference.
	 * @see #setTotalCost(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_TotalCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalCost' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalCost();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getTotalCost <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' containment reference.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(Money value);

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of deductable applied which was not allocated to any particular service line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_UnallocDeductable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unallocDeductable' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Benefit</em>' containment reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_TotalBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' containment reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment details for the claim if the claim has been paid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(ExplanationOfBenefitPayment)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Payment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payment' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitPayment getPayment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(ExplanationOfBenefitPayment value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitNote> getNote();

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Balance by Benefit Category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_BenefitBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitBenefitBalance> getBenefitBalance();

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the specification on which this instance relies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getRuleset <em>Ruleset</em>}' containment reference.
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
	 * The version of the specification from which the original instance was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
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
	 * The date when the EOB was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Billable Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The billable period for which charges are being submitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Billable Period</em>' containment reference.
	 * @see #setBillablePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_BillablePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='billablePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billable Period</em>' containment reference.
	 * @see #getBillablePeriod()
	 * @generated
	 */
	void setBillablePeriod(Period value);

} // ExplanationOfBenefit
