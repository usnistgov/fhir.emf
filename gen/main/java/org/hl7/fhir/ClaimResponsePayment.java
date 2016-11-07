/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponsePayment#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponsePayment#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponsePayment#getAdjustmentReason <em>Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponsePayment#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponsePayment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponsePayment#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment()
 * @model extendedMetaData="name='ClaimResponse.Payment' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponsePayment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this represents partial or complete payment of the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponsePayment#getType <em>Type</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment_Adjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponsePayment#getAdjustment <em>Adjustment</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment_AdjustmentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjustmentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getAdjustmentReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponsePayment#getAdjustmentReason <em>Adjustment Reason</em>}' containment reference.
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
	 * Estimated payment data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponsePayment#getDate <em>Date</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponsePayment#getAmount <em>Amount</em>}' containment reference.
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
	 * Payment identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponsePayment_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponsePayment#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

} // ClaimResponsePayment
