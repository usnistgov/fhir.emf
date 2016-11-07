/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ExpansionProfileCodeSystem;
import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileCodeSystemImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileCodeSystemImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileCodeSystemImpl extends BackboneElementImpl implements ExpansionProfileCodeSystem {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileInclude include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileExclude exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileCodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExpansionProfileCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileInclude getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(ExpansionProfileInclude newInclude, NotificationChain msgs) {
		ExpansionProfileInclude oldInclude = include;
		include = newInclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE, oldInclude, newInclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(ExpansionProfileInclude newInclude) {
		if (newInclude != include) {
			NotificationChain msgs = null;
			if (include != null)
				msgs = ((InternalEObject)include).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE, null, msgs);
			if (newInclude != null)
				msgs = ((InternalEObject)newInclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE, null, msgs);
			msgs = basicSetInclude(newInclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE, newInclude, newInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExclude getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(ExpansionProfileExclude newExclude, NotificationChain msgs) {
		ExpansionProfileExclude oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(ExpansionProfileExclude newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE:
				return basicSetInclude(null, msgs);
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE:
				return basicSetExclude(null, msgs);
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
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE:
				return getInclude();
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE:
				return getExclude();
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
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE:
				setInclude((ExpansionProfileInclude)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE:
				setExclude((ExpansionProfileExclude)newValue);
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
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE:
				setInclude((ExpansionProfileInclude)null);
				return;
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE:
				setExclude((ExpansionProfileExclude)null);
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
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__INCLUDE:
				return include != null;
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM__EXCLUDE:
				return exclude != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileCodeSystemImpl
