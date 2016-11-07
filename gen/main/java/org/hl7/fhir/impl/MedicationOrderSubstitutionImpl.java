/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationOrderSubstitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Order Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderSubstitutionImpl#getAllowed <em>Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderSubstitutionImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationOrderSubstitutionImpl extends BackboneElementImpl implements MedicationOrderSubstitution {
	/**
	 * The cached value of the '{@link #getAllowed() <em>Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allowed;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationOrderSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAllowed() {
		return allowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowed(org.hl7.fhir.Boolean newAllowed, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllowed = allowed;
		allowed = newAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED, oldAllowed, newAllowed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowed(org.hl7.fhir.Boolean newAllowed) {
		if (newAllowed != allowed) {
			NotificationChain msgs = null;
			if (allowed != null)
				msgs = ((InternalEObject)allowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED, null, msgs);
			if (newAllowed != null)
				msgs = ((InternalEObject)newAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED, null, msgs);
			msgs = basicSetAllowed(newAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED, newAllowed, newAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED:
				return basicSetAllowed(null, msgs);
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON:
				return basicSetReason(null, msgs);
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
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED:
				return getAllowed();
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON:
				return getReason();
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
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED:
				setAllowed((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON:
				setReason((CodeableConcept)newValue);
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
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED:
				setAllowed((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON:
				setReason((CodeableConcept)null);
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
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__ALLOWED:
				return allowed != null;
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION__REASON:
				return reason != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationOrderSubstitutionImpl
