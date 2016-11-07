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
import org.hl7.fhir.TestScriptRule3;
import org.hl7.fhir.TestScriptRuleset1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Ruleset1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptRuleset1Impl#getRulesetId <em>Ruleset Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptRuleset1Impl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptRuleset1Impl extends BackboneElementImpl implements TestScriptRuleset1 {
	/**
	 * The cached value of the '{@link #getRulesetId() <em>Ruleset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesetId()
	 * @generated
	 * @ordered
	 */
	protected Id rulesetId;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptRule3> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptRuleset1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptRuleset1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRulesetId() {
		return rulesetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRulesetId(Id newRulesetId, NotificationChain msgs) {
		Id oldRulesetId = rulesetId;
		rulesetId = newRulesetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID, oldRulesetId, newRulesetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulesetId(Id newRulesetId) {
		if (newRulesetId != rulesetId) {
			NotificationChain msgs = null;
			if (rulesetId != null)
				msgs = ((InternalEObject)rulesetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID, null, msgs);
			if (newRulesetId != null)
				msgs = ((InternalEObject)newRulesetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID, null, msgs);
			msgs = basicSetRulesetId(newRulesetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID, newRulesetId, newRulesetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptRule3> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<TestScriptRule3>(TestScriptRule3.class, this, FhirPackage.TEST_SCRIPT_RULESET1__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID:
				return basicSetRulesetId(null, msgs);
			case FhirPackage.TEST_SCRIPT_RULESET1__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID:
				return getRulesetId();
			case FhirPackage.TEST_SCRIPT_RULESET1__RULE:
				return getRule();
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
			case FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID:
				setRulesetId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_RULESET1__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends TestScriptRule3>)newValue);
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
			case FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID:
				setRulesetId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_RULESET1__RULE:
				getRule().clear();
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
			case FhirPackage.TEST_SCRIPT_RULESET1__RULESET_ID:
				return rulesetId != null;
			case FhirPackage.TEST_SCRIPT_RULESET1__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptRuleset1Impl
