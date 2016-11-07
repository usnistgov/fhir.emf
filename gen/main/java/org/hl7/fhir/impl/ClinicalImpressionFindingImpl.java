/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionFindingImpl#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionFindingImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionFindingImpl#getCause <em>Cause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionFindingImpl extends BackboneElementImpl implements ClinicalImpressionFinding {
	/**
	 * The cached value of the '{@link #getItemCodeableConcept() <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept itemCodeableConcept;

	/**
	 * The cached value of the '{@link #getItemReference() <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReference()
	 * @generated
	 * @ordered
	 */
	protected Reference itemReference;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String cause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalImpressionFinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getItemCodeableConcept() {
		return itemCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemCodeableConcept(CodeableConcept newItemCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldItemCodeableConcept = itemCodeableConcept;
		itemCodeableConcept = newItemCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, oldItemCodeableConcept, newItemCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCodeableConcept(CodeableConcept newItemCodeableConcept) {
		if (newItemCodeableConcept != itemCodeableConcept) {
			NotificationChain msgs = null;
			if (itemCodeableConcept != null)
				msgs = ((InternalEObject)itemCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, null, msgs);
			if (newItemCodeableConcept != null)
				msgs = ((InternalEObject)newItemCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetItemCodeableConcept(newItemCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT, newItemCodeableConcept, newItemCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getItemReference() {
		return itemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReference(Reference newItemReference, NotificationChain msgs) {
		Reference oldItemReference = itemReference;
		itemReference = newItemReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, oldItemReference, newItemReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReference(Reference newItemReference) {
		if (newItemReference != itemReference) {
			NotificationChain msgs = null;
			if (itemReference != null)
				msgs = ((InternalEObject)itemReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, null, msgs);
			if (newItemReference != null)
				msgs = ((InternalEObject)newItemReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, null, msgs);
			msgs = basicSetItemReference(newItemReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE, newItemReference, newItemReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCause(org.hl7.fhir.String newCause, NotificationChain msgs) {
		org.hl7.fhir.String oldCause = cause;
		cause = newCause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE, oldCause, newCause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(org.hl7.fhir.String newCause) {
		if (newCause != cause) {
			NotificationChain msgs = null;
			if (cause != null)
				msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE, null, msgs);
			if (newCause != null)
				msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE, null, msgs);
			msgs = basicSetCause(newCause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE, newCause, newCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				return basicSetItemCodeableConcept(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				return basicSetItemReference(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE:
				return basicSetCause(null, msgs);
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
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				return getItemCodeableConcept();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				return getItemReference();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE:
				return getCause();
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
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				setItemReference((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE:
				setCause((org.hl7.fhir.String)newValue);
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
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				setItemReference((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE:
				setCause((org.hl7.fhir.String)null);
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
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_CODEABLE_CONCEPT:
				return itemCodeableConcept != null;
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__ITEM_REFERENCE:
				return itemReference != null;
			case FhirPackage.CLINICAL_IMPRESSION_FINDING__CAUSE:
				return cause != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionFindingImpl
