/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.TestScriptParam2;
import org.hl7.fhir.TestScriptRule2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Rule2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptRule2Impl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptRule2Impl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptRule2Impl extends BackboneElementImpl implements TestScriptRule2 {
	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected Id ruleId;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptParam2> param;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptRule2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptRule2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRuleId() {
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleId(Id newRuleId, NotificationChain msgs) {
		Id oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_RULE2__RULE_ID, oldRuleId, newRuleId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleId(Id newRuleId) {
		if (newRuleId != ruleId) {
			NotificationChain msgs = null;
			if (ruleId != null)
				msgs = ((InternalEObject)ruleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_RULE2__RULE_ID, null, msgs);
			if (newRuleId != null)
				msgs = ((InternalEObject)newRuleId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_RULE2__RULE_ID, null, msgs);
			msgs = basicSetRuleId(newRuleId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_RULE2__RULE_ID, newRuleId, newRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptParam2> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<TestScriptParam2>(TestScriptParam2.class, this, FhirPackage.TEST_SCRIPT_RULE2__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_RULE2__RULE_ID:
				return basicSetRuleId(null, msgs);
			case FhirPackage.TEST_SCRIPT_RULE2__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TEST_SCRIPT_RULE2__RULE_ID:
				return getRuleId();
			case FhirPackage.TEST_SCRIPT_RULE2__PARAM:
				return getParam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_RULE2__RULE_ID:
				setRuleId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_RULE2__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends TestScriptParam2>)newValue);
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
			case FhirPackage.TEST_SCRIPT_RULE2__RULE_ID:
				setRuleId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_RULE2__PARAM:
				getParam().clear();
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
			case FhirPackage.TEST_SCRIPT_RULE2__RULE_ID:
				return ruleId != null;
			case FhirPackage.TEST_SCRIPT_RULE2__PARAM:
				return param != null && !param.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptRule2Impl
