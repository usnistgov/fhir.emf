/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Payee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimPayeeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimPayeeImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimPayeeImpl#getPartyIdentifier <em>Party Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimPayeeImpl#getPartyReference <em>Party Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimPayeeImpl extends BackboneElementImpl implements ClaimPayee {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected Coding resourceType;

	/**
	 * The cached value of the '{@link #getPartyIdentifier() <em>Party Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier partyIdentifier;

	/**
	 * The cached value of the '{@link #getPartyReference() <em>Party Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyReference()
	 * @generated
	 * @ordered
	 */
	protected Reference partyReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimPayeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimPayee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceType(Coding newResourceType, NotificationChain msgs) {
		Coding oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE, oldResourceType, newResourceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(Coding newResourceType) {
		if (newResourceType != resourceType) {
			NotificationChain msgs = null;
			if (resourceType != null)
				msgs = ((InternalEObject)resourceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE, null, msgs);
			if (newResourceType != null)
				msgs = ((InternalEObject)newResourceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE, null, msgs);
			msgs = basicSetResourceType(newResourceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE, newResourceType, newResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPartyIdentifier() {
		return partyIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyIdentifier(Identifier newPartyIdentifier, NotificationChain msgs) {
		Identifier oldPartyIdentifier = partyIdentifier;
		partyIdentifier = newPartyIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER, oldPartyIdentifier, newPartyIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyIdentifier(Identifier newPartyIdentifier) {
		if (newPartyIdentifier != partyIdentifier) {
			NotificationChain msgs = null;
			if (partyIdentifier != null)
				msgs = ((InternalEObject)partyIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER, null, msgs);
			if (newPartyIdentifier != null)
				msgs = ((InternalEObject)newPartyIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER, null, msgs);
			msgs = basicSetPartyIdentifier(newPartyIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER, newPartyIdentifier, newPartyIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPartyReference() {
		return partyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyReference(Reference newPartyReference, NotificationChain msgs) {
		Reference oldPartyReference = partyReference;
		partyReference = newPartyReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE, oldPartyReference, newPartyReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyReference(Reference newPartyReference) {
		if (newPartyReference != partyReference) {
			NotificationChain msgs = null;
			if (partyReference != null)
				msgs = ((InternalEObject)partyReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE, null, msgs);
			if (newPartyReference != null)
				msgs = ((InternalEObject)newPartyReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE, null, msgs);
			msgs = basicSetPartyReference(newPartyReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE, newPartyReference, newPartyReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_PAYEE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE:
				return basicSetResourceType(null, msgs);
			case FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER:
				return basicSetPartyIdentifier(null, msgs);
			case FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE:
				return basicSetPartyReference(null, msgs);
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
			case FhirPackage.CLAIM_PAYEE__TYPE:
				return getType();
			case FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE:
				return getResourceType();
			case FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER:
				return getPartyIdentifier();
			case FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE:
				return getPartyReference();
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
			case FhirPackage.CLAIM_PAYEE__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE:
				setResourceType((Coding)newValue);
				return;
			case FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER:
				setPartyIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE:
				setPartyReference((Reference)newValue);
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
			case FhirPackage.CLAIM_PAYEE__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE:
				setResourceType((Coding)null);
				return;
			case FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER:
				setPartyIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE:
				setPartyReference((Reference)null);
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
			case FhirPackage.CLAIM_PAYEE__TYPE:
				return type != null;
			case FhirPackage.CLAIM_PAYEE__RESOURCE_TYPE:
				return resourceType != null;
			case FhirPackage.CLAIM_PAYEE__PARTY_IDENTIFIER:
				return partyIdentifier != null;
			case FhirPackage.CLAIM_PAYEE__PARTY_REFERENCE:
				return partyReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimPayeeImpl
