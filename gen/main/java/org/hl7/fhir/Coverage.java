/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to pay for or reimburse health care products and services.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Coverage#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getIssuerIdentifier <em>Issuer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getIssuerReference <em>Issuer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getIsAgreement <em>Is Agreement</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getBin <em>Bin</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPlanholderIdentifier <em>Planholder Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPlanholderReference <em>Planholder Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getBeneficiaryIdentifier <em>Beneficiary Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getBeneficiaryReference <em>Beneficiary Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubGroup <em>Sub Group</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverage()
 * @model extendedMetaData="name='Coverage' kind='elementOnly'"
 * @generated
 */
public interface Coverage extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CoverageStatus)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CoverageStatus value);

	/**
	 * Returns the value of the '<em><b>Issuer Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. (choose any one of issuer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Identifier</em>' containment reference.
	 * @see #setIssuerIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_IssuerIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issuerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIssuerIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getIssuerIdentifier <em>Issuer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Identifier</em>' containment reference.
	 * @see #getIssuerIdentifier()
	 * @generated
	 */
	void setIssuerIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Issuer Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. (choose any one of issuer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Reference</em>' containment reference.
	 * @see #setIssuerReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_IssuerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issuerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIssuerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getIssuerReference <em>Issuer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Reference</em>' containment reference.
	 * @see #getIssuerReference()
	 * @generated
	 */
	void setIssuerReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A self, or other, payment agreement not an insurance policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Agreement</em>' containment reference.
	 * @see #setIsAgreement(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_IsAgreement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsAgreement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getIsAgreement <em>Is Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Agreement</em>' containment reference.
	 * @see #getIsAgreement()
	 * @generated
	 */
	void setIsAgreement(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Identification Number (BIN number) used to identify the routing  of eClaims.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bin</em>' containment reference.
	 * @see #setBin(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Bin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bin' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getBin <em>Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin</em>' containment reference.
	 * @see #getBin()
	 * @generated
	 */
	void setBin(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Planholder Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due. (choose any one of planholder*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planholder Identifier</em>' containment reference.
	 * @see #setPlanholderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_PlanholderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planholderIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPlanholderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPlanholderIdentifier <em>Planholder Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planholder Identifier</em>' containment reference.
	 * @see #getPlanholderIdentifier()
	 * @generated
	 */
	void setPlanholderIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Planholder Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due. (choose any one of planholder*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planholder Reference</em>' containment reference.
	 * @see #setPlanholderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_PlanholderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planholderReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPlanholderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPlanholderReference <em>Planholder Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planholder Reference</em>' containment reference.
	 * @see #getPlanholderReference()
	 * @generated
	 */
	void setPlanholderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Beneficiary Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who benefits from the insurance coverage. (choose any one of beneficiary*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beneficiary Identifier</em>' containment reference.
	 * @see #setBeneficiaryIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_BeneficiaryIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beneficiaryIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getBeneficiaryIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getBeneficiaryIdentifier <em>Beneficiary Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary Identifier</em>' containment reference.
	 * @see #getBeneficiaryIdentifier()
	 * @generated
	 */
	void setBeneficiaryIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Beneficiary Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who benefits from the insurance coverage. (choose any one of beneficiary*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beneficiary Reference</em>' containment reference.
	 * @see #setBeneficiaryReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_BeneficiaryReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beneficiaryReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBeneficiaryReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getBeneficiaryReference <em>Beneficiary Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary Reference</em>' containment reference.
	 * @see #getBeneficiaryReference()
	 * @generated
	 */
	void setBeneficiaryReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of beneficiary (patient) (subscriber) to the the planholder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Coding)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Group</em>' containment reference.
	 * @see #setSubGroup(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_SubGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubGroup <em>Sub Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Group</em>' containment reference.
	 * @see #getSubGroup()
	 * @generated
	 */
	void setSubGroup(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Plan</em>' containment reference.
	 * @see #setSubPlan(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_SubPlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subPlan' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubPlan <em>Sub Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Plan</em>' containment reference.
	 * @see #getSubPlan()
	 * @generated
	 */
	void setSubPlan(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a dependent under the coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference.
	 * @see #setDependent(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Dependent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDependent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getDependent <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' containment reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for a community of providers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The policy(s) which constitute this insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getContract();

} // Coverage
