/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponsePaymentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponsePaymentImpl#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponsePaymentImpl#getAdjustmentReason <em>Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponsePaymentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponsePaymentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponsePaymentImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponsePaymentImpl extends BackboneElementImpl implements ClaimResponsePayment {
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
	 * The cached value of the '{@link #getAdjustment() <em>Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected Money adjustment;

	/**
	 * The cached value of the '{@link #getAdjustmentReason() <em>Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustmentReason()
	 * @generated
	 * @ordered
	 */
	protected Coding adjustmentReason;

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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponsePaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponsePayment();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getAdjustment() {
		return adjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdjustment(Money newAdjustment, NotificationChain msgs) {
		Money oldAdjustment = adjustment;
		adjustment = newAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT, oldAdjustment, newAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustment(Money newAdjustment) {
		if (newAdjustment != adjustment) {
			NotificationChain msgs = null;
			if (adjustment != null)
				msgs = ((InternalEObject)adjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT, null, msgs);
			if (newAdjustment != null)
				msgs = ((InternalEObject)newAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT, null, msgs);
			msgs = basicSetAdjustment(newAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT, newAdjustment, newAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getAdjustmentReason() {
		return adjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdjustmentReason(Coding newAdjustmentReason, NotificationChain msgs) {
		Coding oldAdjustmentReason = adjustmentReason;
		adjustmentReason = newAdjustmentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON, oldAdjustmentReason, newAdjustmentReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustmentReason(Coding newAdjustmentReason) {
		if (newAdjustmentReason != adjustmentReason) {
			NotificationChain msgs = null;
			if (adjustmentReason != null)
				msgs = ((InternalEObject)adjustmentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON, null, msgs);
			if (newAdjustmentReason != null)
				msgs = ((InternalEObject)newAdjustmentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON, null, msgs);
			msgs = basicSetAdjustmentReason(newAdjustmentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON, newAdjustmentReason, newAdjustmentReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT, oldAmount, newAmount);
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
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT:
				return basicSetAdjustment(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON:
				return basicSetAdjustmentReason(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE:
				return getType();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT:
				return getAdjustment();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON:
				return getAdjustmentReason();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE:
				return getDate();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT:
				return getAmount();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER:
				return getIdentifier();
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
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT:
				setAdjustment((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON:
				setAdjustmentReason((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT:
				setAmount((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT:
				setAdjustment((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON:
				setAdjustmentReason((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT:
				setAmount((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER:
				setIdentifier((Identifier)null);
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
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__TYPE:
				return type != null;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT:
				return adjustment != null;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__ADJUSTMENT_REASON:
				return adjustmentReason != null;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__DATE:
				return date != null;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__AMOUNT:
				return amount != null;
			case FhirPackage.CLAIM_RESPONSE_PAYMENT__IDENTIFIER:
				return identifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponsePaymentImpl
