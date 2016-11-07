/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.ExpansionProfileExclude1;
import org.hl7.fhir.ExpansionProfileInclude1;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileDesignationImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileDesignationImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileDesignationImpl extends BackboneElementImpl implements ExpansionProfileDesignation {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileInclude1 include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileExclude1 exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileDesignationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExpansionProfileDesignation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileInclude1 getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(ExpansionProfileInclude1 newInclude, NotificationChain msgs) {
		ExpansionProfileInclude1 oldInclude = include;
		include = newInclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE, oldInclude, newInclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(ExpansionProfileInclude1 newInclude) {
		if (newInclude != include) {
			NotificationChain msgs = null;
			if (include != null)
				msgs = ((InternalEObject)include).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE, null, msgs);
			if (newInclude != null)
				msgs = ((InternalEObject)newInclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE, null, msgs);
			msgs = basicSetInclude(newInclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE, newInclude, newInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExclude1 getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(ExpansionProfileExclude1 newExclude, NotificationChain msgs) {
		ExpansionProfileExclude1 oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(ExpansionProfileExclude1 newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE:
				return basicSetInclude(null, msgs);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE:
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
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE:
				return getInclude();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE:
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
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE:
				setInclude((ExpansionProfileInclude1)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE:
				setExclude((ExpansionProfileExclude1)newValue);
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
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE:
				setInclude((ExpansionProfileInclude1)null);
				return;
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE:
				setExclude((ExpansionProfileExclude1)null);
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
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__INCLUDE:
				return include != null;
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION__EXCLUDE:
				return exclude != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileDesignationImpl
