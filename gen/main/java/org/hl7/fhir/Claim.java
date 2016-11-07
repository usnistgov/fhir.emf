/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Claim#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getInsurerIdentifier <em>Insurer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getInsurerReference <em>Insurer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getEntererIdentifier <em>Enterer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getEntererReference <em>Enterer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getFacilityIdentifier <em>Facility Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getFacilityReference <em>Facility Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getPrescriptionIdentifier <em>Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getPrescriptionReference <em>Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getOriginalPrescriptionIdentifier <em>Original Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getOriginalPrescriptionReference <em>Original Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getReferralIdentifier <em>Referral Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getReferralReference <em>Referral Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getPatientIdentifier <em>Patient Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getPatientReference <em>Patient Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.Claim#getMissingTeeth <em>Missing Teeth</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaim()
 * @model extendedMetaData="name='Claim' kind='elementOnly'"
 * @generated
 */
public interface Claim extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of claim, eg, oral, pharmacy, vision, insitutional, professional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSubType();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: claim number, pre-determination or pre-authorization number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Identifier()
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
	 * @see #setStatus(ClaimStatus)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ClaimStatus value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the specification on which this instance relies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getRuleset <em>Ruleset</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
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
	 * The date when the enclosed suite of services were performed or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getCreated <em>Created</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_BillablePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='billablePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getBillablePeriod <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billable Period</em>' containment reference.
	 * @see #getBillablePeriod()
	 * @generated
	 */
	void setBillablePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Insurer Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of insurer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer Identifier</em>' containment reference.
	 * @see #setInsurerIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_InsurerIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getInsurerIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getInsurerIdentifier <em>Insurer Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_InsurerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getInsurerReference <em>Insurer Reference</em>}' containment reference.
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
	 * The provider which is responsible for the bill, claim pre-determination, pre-authorization. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
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
	 * The provider which is responsible for the bill, claim pre-determination, pre-authorization. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaim_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getProviderReference <em>Provider Reference</em>}' containment reference.
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
	 * The organization which is responsible for the bill, claim pre-determination, pre-authorization. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #setOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
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
	 * The organization which is responsible for the bill, claim pre-determination, pre-authorization. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Reference</em>' containment reference.
	 * @see #setOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaim_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getOrganizationReference <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Reference</em>' containment reference.
	 * @see #getOrganizationReference()
	 * @generated
	 */
	void setOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Use)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	Use getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Use value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immediate (STAT), best effort (NORMAL), deferred (DEFER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Coding value);

	/**
	 * Returns the value of the '<em><b>Funds Reserve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #setFundsReserve(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaim_FundsReserve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fundsReserve' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getFundsReserve();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getFundsReserve <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #getFundsReserve()
	 * @generated
	 */
	void setFundsReserve(Coding value);

	/**
	 * Returns the value of the '<em><b>Enterer Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who created the invoice/claim/pre-determination or pre-authorization. (choose any one of enterer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer Identifier</em>' containment reference.
	 * @see #setEntererIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_EntererIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entererIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getEntererIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getEntererIdentifier <em>Enterer Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_EntererReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entererReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEntererReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getEntererReference <em>Enterer Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_FacilityIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getFacilityIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getFacilityIdentifier <em>Facility Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_FacilityReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFacilityReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getFacilityReference <em>Facility Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Reference</em>' containment reference.
	 * @see #getFacilityReference()
	 * @generated
	 */
	void setFacilityReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimRelated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Related()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimRelated> getRelated();

	/**
	 * Returns the value of the '<em><b>Prescription Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prescription to support the dispensing of Pharmacy or Vision products. (choose any one of prescription*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescription Identifier</em>' containment reference.
	 * @see #setPrescriptionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_PrescriptionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriptionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPrescriptionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getPrescriptionIdentifier <em>Prescription Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_PrescriptionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescriptionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescriptionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getPrescriptionReference <em>Prescription Reference</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_OriginalPrescriptionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalPrescriptionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOriginalPrescriptionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getOriginalPrescriptionIdentifier <em>Original Prescription Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_OriginalPrescriptionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalPrescriptionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOriginalPrescriptionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getOriginalPrescriptionReference <em>Original Prescription Reference</em>}' containment reference.
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
	 * @see #setPayee(ClaimPayee)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimPayee getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ClaimPayee value);

	/**
	 * Returns the value of the '<em><b>Referral Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral resource which lists the date, practitioner, reason and other supporting information. (choose any one of referral*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Identifier</em>' containment reference.
	 * @see #setReferralIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_ReferralIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getReferralIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getReferralIdentifier <em>Referral Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_ReferralReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferralReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getReferralReference <em>Referral Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral Reference</em>' containment reference.
	 * @see #getReferralReference()
	 * @generated
	 */
	void setReferralReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Information()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='information' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimInformation> getInformation();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient diagnosis for which care is sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient procedures performed to support the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimProcedure> getProcedure();

	/**
	 * Returns the value of the '<em><b>Patient Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource. (choose any one of patient*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Identifier</em>' containment reference.
	 * @see #setPatientIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaim_PatientIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPatientIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getPatientIdentifier <em>Patient Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_PatientReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatientReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getPatientReference <em>Patient Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Reference</em>' containment reference.
	 * @see #getPatientReference()
	 * @generated
	 */
	void setPatientReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimCoverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An accident which resulted in the need for healthcare services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accident</em>' containment reference.
	 * @see #setAccident(ClaimAccident)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Accident()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accident' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimAccident getAccident();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getAccident <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' containment reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(ClaimAccident value);

	/**
	 * Returns the value of the '<em><b>Employment Impacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #setEmploymentImpacted(Period)
	 * @see org.hl7.fhir.FhirPackage#getClaim_EmploymentImpacted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='employmentImpacted' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEmploymentImpacted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getEmploymentImpacted <em>Employment Impacted</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaim_Hospitalization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hospitalization' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getHospitalization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getHospitalization <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' containment reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimItem> getItem();

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total value of the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaim_Total()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Claim#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(Money value);

	/**
	 * Returns the value of the '<em><b>Missing Teeth</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimMissingTeeth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missing Teeth</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaim_MissingTeeth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missingTeeth' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimMissingTeeth> getMissingTeeth();

} // Claim
