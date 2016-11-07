/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayment#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayment#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayment#getAdjustmentReason <em>Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayment#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitPayment#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment()
 * @model extendedMetaData="name='ExplanationOfBenefit.Payment' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitPayment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this represents partial or complete payment of the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayment#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjustment</em>' containment reference.
	 * @see #setAdjustment(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment_Adjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayment#getAdjustment <em>Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' containment reference.
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(Money value);

	/**
	 * Returns the value of the '<em><b>Adjustment Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason for the payment adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjustment Reason</em>' containment reference.
	 * @see #setAdjustmentReason(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment_AdjustmentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjustmentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getAdjustmentReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayment#getAdjustmentReason <em>Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment Reason</em>' containment reference.
	 * @see #getAdjustmentReason()
	 * @generated
	 */
	void setAdjustmentReason(Coding value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated payment date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayment#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payable less any payment adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayment#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment identifer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitPayment_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitPayment#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

} // ExplanationOfBenefitPayment
