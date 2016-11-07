/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.ExpansionProfileCodeSystem1;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileIncludeImpl#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileIncludeImpl extends BackboneElementImpl implements ExpansionProfileInclude {
	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionProfileCodeSystem1> codeSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExpansionProfileInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionProfileCodeSystem1> getCodeSystem() {
		if (codeSystem == null) {
			codeSystem = new EObjectContainmentEList<ExpansionProfileCodeSystem1>(ExpansionProfileCodeSystem1.class, this, FhirPackage.EXPANSION_PROFILE_INCLUDE__CODE_SYSTEM);
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPANSION_PROFILE_INCLUDE__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPANSION_PROFILE_INCLUDE__CODE_SYSTEM:
				return getCodeSystem();
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
			case FhirPackage.EXPANSION_PROFILE_INCLUDE__CODE_SYSTEM:
				getCodeSystem().clear();
				getCodeSystem().addAll((Collection<? extends ExpansionProfileCodeSystem1>)newValue);
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
			case FhirPackage.EXPANSION_PROFILE_INCLUDE__CODE_SYSTEM:
				getCodeSystem().clear();
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
			case FhirPackage.EXPANSION_PROFILE_INCLUDE__CODE_SYSTEM:
				return codeSystem != null && !codeSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileIncludeImpl
