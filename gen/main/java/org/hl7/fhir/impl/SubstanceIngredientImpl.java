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
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceIngredient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceIngredientImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceIngredientImpl#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceIngredientImpl#getSubstanceReference <em>Substance Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceIngredientImpl extends BackboneElementImpl implements SubstanceIngredient {
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Ratio quantity;

	/**
	 * The cached value of the '{@link #getSubstanceCodeableConcept() <em>Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substanceCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubstanceReference() <em>Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference substanceReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Ratio newQuantity, NotificationChain msgs) {
		Ratio oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Ratio newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstanceCodeableConcept() {
		return substanceCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceCodeableConcept(CodeableConcept newSubstanceCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubstanceCodeableConcept = substanceCodeableConcept;
		substanceCodeableConcept = newSubstanceCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT, oldSubstanceCodeableConcept, newSubstanceCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceCodeableConcept(CodeableConcept newSubstanceCodeableConcept) {
		if (newSubstanceCodeableConcept != substanceCodeableConcept) {
			NotificationChain msgs = null;
			if (substanceCodeableConcept != null)
				msgs = ((InternalEObject)substanceCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			if (newSubstanceCodeableConcept != null)
				msgs = ((InternalEObject)newSubstanceCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubstanceCodeableConcept(newSubstanceCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT, newSubstanceCodeableConcept, newSubstanceCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubstanceReference() {
		return substanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceReference(Reference newSubstanceReference, NotificationChain msgs) {
		Reference oldSubstanceReference = substanceReference;
		substanceReference = newSubstanceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE, oldSubstanceReference, newSubstanceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceReference(Reference newSubstanceReference) {
		if (newSubstanceReference != substanceReference) {
			NotificationChain msgs = null;
			if (substanceReference != null)
				msgs = ((InternalEObject)substanceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE, null, msgs);
			if (newSubstanceReference != null)
				msgs = ((InternalEObject)newSubstanceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE, null, msgs);
			msgs = basicSetSubstanceReference(newSubstanceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE, newSubstanceReference, newSubstanceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT:
				return basicSetSubstanceCodeableConcept(null, msgs);
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE:
				return basicSetSubstanceReference(null, msgs);
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
			case FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY:
				return getQuantity();
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT:
				return getSubstanceCodeableConcept();
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE:
				return getSubstanceReference();
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
			case FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY:
				setQuantity((Ratio)newValue);
				return;
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT:
				setSubstanceCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE:
				setSubstanceReference((Reference)newValue);
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
			case FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY:
				setQuantity((Ratio)null);
				return;
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT:
				setSubstanceCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE:
				setSubstanceReference((Reference)null);
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
			case FhirPackage.SUBSTANCE_INGREDIENT__QUANTITY:
				return quantity != null;
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_CODEABLE_CONCEPT:
				return substanceCodeableConcept != null;
			case FhirPackage.SUBSTANCE_INGREDIENT__SUBSTANCE_REFERENCE:
				return substanceReference != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceIngredientImpl
