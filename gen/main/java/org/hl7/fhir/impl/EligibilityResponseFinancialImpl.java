/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Financial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitUnsignedInt <em>Benefit Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitString <em>Benefit String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitMoney <em>Benefit Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitUsedUnsignedInt <em>Benefit Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseFinancialImpl#getBenefitUsedMoney <em>Benefit Used Money</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EligibilityResponseFinancialImpl extends BackboneElementImpl implements EligibilityResponseFinancial {
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
	 * The cached value of the '{@link #getBenefitUnsignedInt() <em>Benefit Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt benefitUnsignedInt;

	/**
	 * The cached value of the '{@link #getBenefitString() <em>Benefit String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String benefitString;

	/**
	 * The cached value of the '{@link #getBenefitMoney() <em>Benefit Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitMoney()
	 * @generated
	 * @ordered
	 */
	protected Money benefitMoney;

	/**
	 * The cached value of the '{@link #getBenefitUsedUnsignedInt() <em>Benefit Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUsedUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt benefitUsedUnsignedInt;

	/**
	 * The cached value of the '{@link #getBenefitUsedMoney() <em>Benefit Used Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUsedMoney()
	 * @generated
	 * @ordered
	 */
	protected Money benefitUsedMoney;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseFinancialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityResponseFinancial();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getBenefitUnsignedInt() {
		return benefitUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitUnsignedInt(UnsignedInt newBenefitUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldBenefitUnsignedInt = benefitUnsignedInt;
		benefitUnsignedInt = newBenefitUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, oldBenefitUnsignedInt, newBenefitUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUnsignedInt(UnsignedInt newBenefitUnsignedInt) {
		if (newBenefitUnsignedInt != benefitUnsignedInt) {
			NotificationChain msgs = null;
			if (benefitUnsignedInt != null)
				msgs = ((InternalEObject)benefitUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, null, msgs);
			if (newBenefitUnsignedInt != null)
				msgs = ((InternalEObject)newBenefitUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, null, msgs);
			msgs = basicSetBenefitUnsignedInt(newBenefitUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT, newBenefitUnsignedInt, newBenefitUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getBenefitString() {
		return benefitString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitString(org.hl7.fhir.String newBenefitString, NotificationChain msgs) {
		org.hl7.fhir.String oldBenefitString = benefitString;
		benefitString = newBenefitString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING, oldBenefitString, newBenefitString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitString(org.hl7.fhir.String newBenefitString) {
		if (newBenefitString != benefitString) {
			NotificationChain msgs = null;
			if (benefitString != null)
				msgs = ((InternalEObject)benefitString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING, null, msgs);
			if (newBenefitString != null)
				msgs = ((InternalEObject)newBenefitString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING, null, msgs);
			msgs = basicSetBenefitString(newBenefitString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING, newBenefitString, newBenefitString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getBenefitMoney() {
		return benefitMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitMoney(Money newBenefitMoney, NotificationChain msgs) {
		Money oldBenefitMoney = benefitMoney;
		benefitMoney = newBenefitMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY, oldBenefitMoney, newBenefitMoney);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitMoney(Money newBenefitMoney) {
		if (newBenefitMoney != benefitMoney) {
			NotificationChain msgs = null;
			if (benefitMoney != null)
				msgs = ((InternalEObject)benefitMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY, null, msgs);
			if (newBenefitMoney != null)
				msgs = ((InternalEObject)newBenefitMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY, null, msgs);
			msgs = basicSetBenefitMoney(newBenefitMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY, newBenefitMoney, newBenefitMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getBenefitUsedUnsignedInt() {
		return benefitUsedUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitUsedUnsignedInt(UnsignedInt newBenefitUsedUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldBenefitUsedUnsignedInt = benefitUsedUnsignedInt;
		benefitUsedUnsignedInt = newBenefitUsedUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, oldBenefitUsedUnsignedInt, newBenefitUsedUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUsedUnsignedInt(UnsignedInt newBenefitUsedUnsignedInt) {
		if (newBenefitUsedUnsignedInt != benefitUsedUnsignedInt) {
			NotificationChain msgs = null;
			if (benefitUsedUnsignedInt != null)
				msgs = ((InternalEObject)benefitUsedUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, null, msgs);
			if (newBenefitUsedUnsignedInt != null)
				msgs = ((InternalEObject)newBenefitUsedUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, null, msgs);
			msgs = basicSetBenefitUsedUnsignedInt(newBenefitUsedUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT, newBenefitUsedUnsignedInt, newBenefitUsedUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getBenefitUsedMoney() {
		return benefitUsedMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitUsedMoney(Money newBenefitUsedMoney, NotificationChain msgs) {
		Money oldBenefitUsedMoney = benefitUsedMoney;
		benefitUsedMoney = newBenefitUsedMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY, oldBenefitUsedMoney, newBenefitUsedMoney);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUsedMoney(Money newBenefitUsedMoney) {
		if (newBenefitUsedMoney != benefitUsedMoney) {
			NotificationChain msgs = null;
			if (benefitUsedMoney != null)
				msgs = ((InternalEObject)benefitUsedMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY, null, msgs);
			if (newBenefitUsedMoney != null)
				msgs = ((InternalEObject)newBenefitUsedMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY, null, msgs);
			msgs = basicSetBenefitUsedMoney(newBenefitUsedMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY, newBenefitUsedMoney, newBenefitUsedMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				return basicSetBenefitUnsignedInt(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING:
				return basicSetBenefitString(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY:
				return basicSetBenefitMoney(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				return basicSetBenefitUsedUnsignedInt(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY:
				return basicSetBenefitUsedMoney(null, msgs);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				return getType();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				return getBenefitUnsignedInt();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING:
				return getBenefitString();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY:
				return getBenefitMoney();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				return getBenefitUsedUnsignedInt();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY:
				return getBenefitUsedMoney();
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				setBenefitUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING:
				setBenefitString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY:
				setBenefitMoney((Money)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				setBenefitUsedUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY:
				setBenefitUsedMoney((Money)newValue);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				setBenefitUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING:
				setBenefitString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY:
				setBenefitMoney((Money)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				setBenefitUsedUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY:
				setBenefitUsedMoney((Money)null);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__TYPE:
				return type != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_UNSIGNED_INT:
				return benefitUnsignedInt != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_STRING:
				return benefitString != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_MONEY:
				return benefitMoney != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_UNSIGNED_INT:
				return benefitUsedUnsignedInt != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL__BENEFIT_USED_MONEY:
				return benefitUsedMoney != null;
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseFinancialImpl
