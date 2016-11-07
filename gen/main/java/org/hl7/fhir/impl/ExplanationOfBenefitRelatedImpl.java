/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitRelatedImpl#getClaimIdentifier <em>Claim Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitRelatedImpl#getClaimReference <em>Claim Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitRelatedImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitRelatedImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitRelatedImpl extends BackboneElementImpl implements ExplanationOfBenefitRelated {
	/**
	 * The cached value of the '{@link #getClaimIdentifier() <em>Claim Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier claimIdentifier;

	/**
	 * The cached value of the '{@link #getClaimReference() <em>Claim Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimReference()
	 * @generated
	 * @ordered
	 */
	protected Reference claimReference;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Coding relationship;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Identifier reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitRelated();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getClaimIdentifier() {
		return claimIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimIdentifier(Identifier newClaimIdentifier, NotificationChain msgs) {
		Identifier oldClaimIdentifier = claimIdentifier;
		claimIdentifier = newClaimIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER, oldClaimIdentifier, newClaimIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimIdentifier(Identifier newClaimIdentifier) {
		if (newClaimIdentifier != claimIdentifier) {
			NotificationChain msgs = null;
			if (claimIdentifier != null)
				msgs = ((InternalEObject)claimIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER, null, msgs);
			if (newClaimIdentifier != null)
				msgs = ((InternalEObject)newClaimIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER, null, msgs);
			msgs = basicSetClaimIdentifier(newClaimIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER, newClaimIdentifier, newClaimIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaimReference() {
		return claimReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimReference(Reference newClaimReference, NotificationChain msgs) {
		Reference oldClaimReference = claimReference;
		claimReference = newClaimReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE, oldClaimReference, newClaimReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimReference(Reference newClaimReference) {
		if (newClaimReference != claimReference) {
			NotificationChain msgs = null;
			if (claimReference != null)
				msgs = ((InternalEObject)claimReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE, null, msgs);
			if (newClaimReference != null)
				msgs = ((InternalEObject)newClaimReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE, null, msgs);
			msgs = basicSetClaimReference(newClaimReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE, newClaimReference, newClaimReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Coding newRelationship, NotificationChain msgs) {
		Coding oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Coding newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Identifier newReference, NotificationChain msgs) {
		Identifier oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Identifier newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER:
				return basicSetClaimIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE:
				return basicSetClaimReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE:
				return basicSetReference(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER:
				return getClaimIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE:
				return getClaimReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE:
				return getReference();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER:
				setClaimIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE:
				setClaimReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP:
				setRelationship((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE:
				setReference((Identifier)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER:
				setClaimIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE:
				setClaimReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP:
				setRelationship((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE:
				setReference((Identifier)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_IDENTIFIER:
				return claimIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__CLAIM_REFERENCE:
				return claimReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitRelatedImpl
