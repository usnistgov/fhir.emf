/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getResponseIdentifier <em>Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getResponseReference <em>Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getSubmitterIdentifier <em>Submitter Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getSubmitterReference <em>Submitter Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getPayeeIdentifier <em>Payee Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getPayeeReference <em>Payee Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationDetailImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationDetailImpl extends BackboneElementImpl implements PaymentReconciliationDetail {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestIdentifier;

	/**
	 * The cached value of the '{@link #getRequestReference() <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestReference()
	 * @generated
	 * @ordered
	 */
	protected Reference requestReference;

	/**
	 * The cached value of the '{@link #getResponseIdentifier() <em>Response Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier responseIdentifier;

	/**
	 * The cached value of the '{@link #getResponseReference() <em>Response Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseReference()
	 * @generated
	 * @ordered
	 */
	protected Reference responseReference;

	/**
	 * The cached value of the '{@link #getSubmitterIdentifier() <em>Submitter Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier submitterIdentifier;

	/**
	 * The cached value of the '{@link #getSubmitterReference() <em>Submitter Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterReference()
	 * @generated
	 * @ordered
	 */
	protected Reference submitterReference;

	/**
	 * The cached value of the '{@link #getPayeeIdentifier() <em>Payee Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier payeeIdentifier;

	/**
	 * The cached value of the '{@link #getPayeeReference() <em>Payee Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeReference()
	 * @generated
	 * @ordered
	 */
	protected Reference payeeReference;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Money amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentReconciliationDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestIdentifier(Identifier newRequestIdentifier, NotificationChain msgs) {
		Identifier oldRequestIdentifier = requestIdentifier;
		requestIdentifier = newRequestIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER, oldRequestIdentifier, newRequestIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestIdentifier(Identifier newRequestIdentifier) {
		if (newRequestIdentifier != requestIdentifier) {
			NotificationChain msgs = null;
			if (requestIdentifier != null)
				msgs = ((InternalEObject)requestIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER, null, msgs);
			if (newRequestIdentifier != null)
				msgs = ((InternalEObject)newRequestIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER, null, msgs);
			msgs = basicSetRequestIdentifier(newRequestIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER, newRequestIdentifier, newRequestIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestReference() {
		return requestReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestReference(Reference newRequestReference, NotificationChain msgs) {
		Reference oldRequestReference = requestReference;
		requestReference = newRequestReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE, oldRequestReference, newRequestReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestReference(Reference newRequestReference) {
		if (newRequestReference != requestReference) {
			NotificationChain msgs = null;
			if (requestReference != null)
				msgs = ((InternalEObject)requestReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE, null, msgs);
			if (newRequestReference != null)
				msgs = ((InternalEObject)newRequestReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE, null, msgs);
			msgs = basicSetRequestReference(newRequestReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE, newRequestReference, newRequestReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getResponseIdentifier() {
		return responseIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseIdentifier(Identifier newResponseIdentifier, NotificationChain msgs) {
		Identifier oldResponseIdentifier = responseIdentifier;
		responseIdentifier = newResponseIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER, oldResponseIdentifier, newResponseIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseIdentifier(Identifier newResponseIdentifier) {
		if (newResponseIdentifier != responseIdentifier) {
			NotificationChain msgs = null;
			if (responseIdentifier != null)
				msgs = ((InternalEObject)responseIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER, null, msgs);
			if (newResponseIdentifier != null)
				msgs = ((InternalEObject)newResponseIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER, null, msgs);
			msgs = basicSetResponseIdentifier(newResponseIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER, newResponseIdentifier, newResponseIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResponseReference() {
		return responseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseReference(Reference newResponseReference, NotificationChain msgs) {
		Reference oldResponseReference = responseReference;
		responseReference = newResponseReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE, oldResponseReference, newResponseReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseReference(Reference newResponseReference) {
		if (newResponseReference != responseReference) {
			NotificationChain msgs = null;
			if (responseReference != null)
				msgs = ((InternalEObject)responseReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE, null, msgs);
			if (newResponseReference != null)
				msgs = ((InternalEObject)newResponseReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE, null, msgs);
			msgs = basicSetResponseReference(newResponseReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE, newResponseReference, newResponseReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSubmitterIdentifier() {
		return submitterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitterIdentifier(Identifier newSubmitterIdentifier, NotificationChain msgs) {
		Identifier oldSubmitterIdentifier = submitterIdentifier;
		submitterIdentifier = newSubmitterIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER, oldSubmitterIdentifier, newSubmitterIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitterIdentifier(Identifier newSubmitterIdentifier) {
		if (newSubmitterIdentifier != submitterIdentifier) {
			NotificationChain msgs = null;
			if (submitterIdentifier != null)
				msgs = ((InternalEObject)submitterIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER, null, msgs);
			if (newSubmitterIdentifier != null)
				msgs = ((InternalEObject)newSubmitterIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER, null, msgs);
			msgs = basicSetSubmitterIdentifier(newSubmitterIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER, newSubmitterIdentifier, newSubmitterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubmitterReference() {
		return submitterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitterReference(Reference newSubmitterReference, NotificationChain msgs) {
		Reference oldSubmitterReference = submitterReference;
		submitterReference = newSubmitterReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE, oldSubmitterReference, newSubmitterReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitterReference(Reference newSubmitterReference) {
		if (newSubmitterReference != submitterReference) {
			NotificationChain msgs = null;
			if (submitterReference != null)
				msgs = ((InternalEObject)submitterReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE, null, msgs);
			if (newSubmitterReference != null)
				msgs = ((InternalEObject)newSubmitterReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE, null, msgs);
			msgs = basicSetSubmitterReference(newSubmitterReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE, newSubmitterReference, newSubmitterReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPayeeIdentifier() {
		return payeeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayeeIdentifier(Identifier newPayeeIdentifier, NotificationChain msgs) {
		Identifier oldPayeeIdentifier = payeeIdentifier;
		payeeIdentifier = newPayeeIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER, oldPayeeIdentifier, newPayeeIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeIdentifier(Identifier newPayeeIdentifier) {
		if (newPayeeIdentifier != payeeIdentifier) {
			NotificationChain msgs = null;
			if (payeeIdentifier != null)
				msgs = ((InternalEObject)payeeIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER, null, msgs);
			if (newPayeeIdentifier != null)
				msgs = ((InternalEObject)newPayeeIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER, null, msgs);
			msgs = basicSetPayeeIdentifier(newPayeeIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER, newPayeeIdentifier, newPayeeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPayeeReference() {
		return payeeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayeeReference(Reference newPayeeReference, NotificationChain msgs) {
		Reference oldPayeeReference = payeeReference;
		payeeReference = newPayeeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE, oldPayeeReference, newPayeeReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeReference(Reference newPayeeReference) {
		if (newPayeeReference != payeeReference) {
			NotificationChain msgs = null;
			if (payeeReference != null)
				msgs = ((InternalEObject)payeeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE, null, msgs);
			if (newPayeeReference != null)
				msgs = ((InternalEObject)newPayeeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE, null, msgs);
			msgs = basicSetPayeeReference(newPayeeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE, newPayeeReference, newPayeeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Money newAmount, NotificationChain msgs) {
		Money oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Money newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER:
				return basicSetRequestIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE:
				return basicSetRequestReference(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER:
				return basicSetResponseIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE:
				return basicSetResponseReference(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER:
				return basicSetSubmitterIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE:
				return basicSetSubmitterReference(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER:
				return basicSetPayeeIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE:
				return basicSetPayeeReference(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				return basicSetAmount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				return getType();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE:
				return getRequestReference();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER:
				return getResponseIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE:
				return getResponseReference();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER:
				return getSubmitterIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE:
				return getSubmitterReference();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER:
				return getPayeeIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE:
				return getPayeeReference();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				return getDate();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				return getAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE:
				setRequestReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER:
				setResponseIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE:
				setResponseReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER:
				setSubmitterIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE:
				setSubmitterReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER:
				setPayeeIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE:
				setPayeeReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				setAmount((Money)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE:
				setRequestReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER:
				setResponseIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE:
				setResponseReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER:
				setSubmitterIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE:
				setSubmitterReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER:
				setPayeeIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE:
				setPayeeReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				setAmount((Money)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__TYPE:
				return type != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_IDENTIFIER:
				return requestIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__REQUEST_REFERENCE:
				return requestReference != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_IDENTIFIER:
				return responseIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__RESPONSE_REFERENCE:
				return responseReference != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_IDENTIFIER:
				return submitterIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__SUBMITTER_REFERENCE:
				return submitterReference != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_IDENTIFIER:
				return payeeIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__PAYEE_REFERENCE:
				return payeeReference != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__DATE:
				return date != null;
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationDetailImpl
