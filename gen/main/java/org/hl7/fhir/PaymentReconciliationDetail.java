/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides payment details and claim references supporting a bulk payment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponseIdentifier <em>Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponseReference <em>Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterIdentifier <em>Submitter Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterReference <em>Submitter Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeIdentifier <em>Payee Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeReference <em>Payee Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail()
 * @model extendedMetaData="name='PaymentReconciliation.Detail' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliationDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to indicate the nature of the payment, adjustment, funds advance, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The claim or financial resource. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Identifier</em>' containment reference.
	 * @see #setRequestIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_RequestIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestIdentifier <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Identifier</em>' containment reference.
	 * @see #getRequestIdentifier()
	 * @generated
	 */
	void setRequestIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Request Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The claim or financial resource. (choose any one of request*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Reference</em>' containment reference.
	 * @see #setRequestReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_RequestReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestReference <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Reference</em>' containment reference.
	 * @see #getRequestReference()
	 * @generated
	 */
	void setRequestReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Response Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The claim response resource. (choose any one of response*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Identifier</em>' containment reference.
	 * @see #setResponseIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_ResponseIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getResponseIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponseIdentifier <em>Response Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Identifier</em>' containment reference.
	 * @see #getResponseIdentifier()
	 * @generated
	 */
	void setResponseIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Response Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The claim response resource. (choose any one of response*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Reference</em>' containment reference.
	 * @see #setResponseReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_ResponseReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponseReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponseReference <em>Response Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Reference</em>' containment reference.
	 * @see #getResponseReference()
	 * @generated
	 */
	void setResponseReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Submitter Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Organization which submitted the invoice or financial transaction. (choose any one of submitter*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter Identifier</em>' containment reference.
	 * @see #setSubmitterIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_SubmitterIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitterIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSubmitterIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterIdentifier <em>Submitter Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Identifier</em>' containment reference.
	 * @see #getSubmitterIdentifier()
	 * @generated
	 */
	void setSubmitterIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Submitter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Organization which submitted the invoice or financial transaction. (choose any one of submitter*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter Reference</em>' containment reference.
	 * @see #setSubmitterReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_SubmitterReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitterReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubmitterReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterReference <em>Submitter Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Reference</em>' containment reference.
	 * @see #getSubmitterReference()
	 * @generated
	 */
	void setSubmitterReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is receiving the payment. (choose any one of payee*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Identifier</em>' containment reference.
	 * @see #setPayeeIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_PayeeIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPayeeIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeIdentifier <em>Payee Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Identifier</em>' containment reference.
	 * @see #getPayeeIdentifier()
	 * @generated
	 */
	void setPayeeIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Payee Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is receiving the payment. (choose any one of payee*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Reference</em>' containment reference.
	 * @see #setPayeeReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_PayeeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPayeeReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeReference <em>Payee Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Reference</em>' containment reference.
	 * @see #getPayeeReference()
	 * @generated
	 */
	void setPayeeReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the invoice or financial resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}' containment reference.
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
	 * Amount paid for this detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationDetail
