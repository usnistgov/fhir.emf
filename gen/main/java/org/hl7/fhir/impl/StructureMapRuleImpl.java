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
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureMapRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapRuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapRuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapRuleImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapRuleImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapRuleImpl extends BackboneElementImpl implements StructureMapRule {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Id name;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapSource> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapTarget> target;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapRule> rule;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapDependent> dependent;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getStructureMapRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Id newName, NotificationChain msgs) {
		Id oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_RULE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Id newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_RULE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_RULE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_RULE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapSource> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<StructureMapSource>(StructureMapSource.class, this, FhirPackage.STRUCTURE_MAP_RULE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<StructureMapTarget>(StructureMapTarget.class, this, FhirPackage.STRUCTURE_MAP_RULE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<StructureMapRule>(StructureMapRule.class, this, FhirPackage.STRUCTURE_MAP_RULE__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapDependent> getDependent() {
		if (dependent == null) {
			dependent = new EObjectContainmentEList<StructureMapDependent>(StructureMapDependent.class, this, FhirPackage.STRUCTURE_MAP_RULE__DEPENDENT);
		}
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_RULE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.STRUCTURE_MAP_RULE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_MAP_RULE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_MAP_RULE__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_MAP_RULE__DEPENDENT:
				return ((InternalEList<?>)getDependent()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case FhirPackage.STRUCTURE_MAP_RULE__NAME:
				return getName();
			case FhirPackage.STRUCTURE_MAP_RULE__SOURCE:
				return getSource();
			case FhirPackage.STRUCTURE_MAP_RULE__TARGET:
				return getTarget();
			case FhirPackage.STRUCTURE_MAP_RULE__RULE:
				return getRule();
			case FhirPackage.STRUCTURE_MAP_RULE__DEPENDENT:
				return getDependent();
			case FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION:
				return getDocumentation();
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
			case FhirPackage.STRUCTURE_MAP_RULE__NAME:
				setName((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends StructureMapSource>)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends StructureMapTarget>)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends StructureMapRule>)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__DEPENDENT:
				getDependent().clear();
				getDependent().addAll((Collection<? extends StructureMapDependent>)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
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
			case FhirPackage.STRUCTURE_MAP_RULE__NAME:
				setName((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__SOURCE:
				getSource().clear();
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__TARGET:
				getTarget().clear();
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__RULE:
				getRule().clear();
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__DEPENDENT:
				getDependent().clear();
				return;
			case FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
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
			case FhirPackage.STRUCTURE_MAP_RULE__NAME:
				return name != null;
			case FhirPackage.STRUCTURE_MAP_RULE__SOURCE:
				return source != null && !source.isEmpty();
			case FhirPackage.STRUCTURE_MAP_RULE__TARGET:
				return target != null && !target.isEmpty();
			case FhirPackage.STRUCTURE_MAP_RULE__RULE:
				return rule != null && !rule.isEmpty();
			case FhirPackage.STRUCTURE_MAP_RULE__DEPENDENT:
				return dependent != null && !dependent.isEmpty();
			case FhirPackage.STRUCTURE_MAP_RULE__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapRuleImpl
