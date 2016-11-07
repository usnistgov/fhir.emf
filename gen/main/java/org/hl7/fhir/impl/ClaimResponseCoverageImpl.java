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

import org.hl7.fhir.ClaimResponseCoverage;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getCoverageIdentifier <em>Coverage Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getCoverageReference <em>Coverage Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseCoverageImpl#getClaimResponse <em>Claim Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseCoverageImpl extends BackboneElementImpl implements ClaimResponseCoverage {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getFocal() <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocal()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean focal;

	/**
	 * The cached value of the '{@link #getCoverageIdentifier() <em>Coverage Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier coverageIdentifier;

	/**
	 * The cached value of the '{@link #getCoverageReference() <em>Coverage Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageReference()
	 * @generated
	 * @ordered
	 */
	protected Reference coverageReference;

	/**
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String businessArrangement;

	/**
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> preAuthRef;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference claimResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getFocal() {
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocal(org.hl7.fhir.Boolean newFocal, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldFocal = focal;
		focal = newFocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL, oldFocal, newFocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocal(org.hl7.fhir.Boolean newFocal) {
		if (newFocal != focal) {
			NotificationChain msgs = null;
			if (focal != null)
				msgs = ((InternalEObject)focal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL, null, msgs);
			if (newFocal != null)
				msgs = ((InternalEObject)newFocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL, null, msgs);
			msgs = basicSetFocal(newFocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL, newFocal, newFocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getCoverageIdentifier() {
		return coverageIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageIdentifier(Identifier newCoverageIdentifier, NotificationChain msgs) {
		Identifier oldCoverageIdentifier = coverageIdentifier;
		coverageIdentifier = newCoverageIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER, oldCoverageIdentifier, newCoverageIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageIdentifier(Identifier newCoverageIdentifier) {
		if (newCoverageIdentifier != coverageIdentifier) {
			NotificationChain msgs = null;
			if (coverageIdentifier != null)
				msgs = ((InternalEObject)coverageIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER, null, msgs);
			if (newCoverageIdentifier != null)
				msgs = ((InternalEObject)newCoverageIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER, null, msgs);
			msgs = basicSetCoverageIdentifier(newCoverageIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER, newCoverageIdentifier, newCoverageIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCoverageReference() {
		return coverageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageReference(Reference newCoverageReference, NotificationChain msgs) {
		Reference oldCoverageReference = coverageReference;
		coverageReference = newCoverageReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE, oldCoverageReference, newCoverageReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageReference(Reference newCoverageReference) {
		if (newCoverageReference != coverageReference) {
			NotificationChain msgs = null;
			if (coverageReference != null)
				msgs = ((InternalEObject)coverageReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE, null, msgs);
			if (newCoverageReference != null)
				msgs = ((InternalEObject)newCoverageReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE, null, msgs);
			msgs = basicSetCoverageReference(newCoverageReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE, newCoverageReference, newCoverageReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessArrangement(org.hl7.fhir.String newBusinessArrangement, NotificationChain msgs) {
		org.hl7.fhir.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT, oldBusinessArrangement, newBusinessArrangement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(org.hl7.fhir.String newBusinessArrangement) {
		if (newBusinessArrangement != businessArrangement) {
			NotificationChain msgs = null;
			if (businessArrangement != null)
				msgs = ((InternalEObject)businessArrangement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT, null, msgs);
			if (newBusinessArrangement != null)
				msgs = ((InternalEObject)newBusinessArrangement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT, null, msgs);
			msgs = basicSetBusinessArrangement(newBusinessArrangement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT, newBusinessArrangement, newBusinessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getPreAuthRef() {
		if (preAuthRef == null) {
			preAuthRef = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF);
		}
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(Reference newClaimResponse, NotificationChain msgs) {
		Reference oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE, oldClaimResponse, newClaimResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(Reference newClaimResponse) {
		if (newClaimResponse != claimResponse) {
			NotificationChain msgs = null;
			if (claimResponse != null)
				msgs = ((InternalEObject)claimResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE, null, msgs);
			if (newClaimResponse != null)
				msgs = ((InternalEObject)newClaimResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE, null, msgs);
			msgs = basicSetClaimResponse(newClaimResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE, newClaimResponse, newClaimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				return basicSetFocal(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER:
				return basicSetCoverageIdentifier(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE:
				return basicSetCoverageReference(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				return basicSetBusinessArrangement(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				return ((InternalEList<?>)getPreAuthRef()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				return getSequence();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				return getFocal();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER:
				return getCoverageIdentifier();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE:
				return getCoverageReference();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				return getBusinessArrangement();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				return getPreAuthRef();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				return getClaimResponse();
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
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				setFocal((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER:
				setCoverageIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE:
				setCoverageReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				getPreAuthRef().clear();
				getPreAuthRef().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				setClaimResponse((Reference)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				setFocal((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER:
				setCoverageIdentifier((Identifier)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE:
				setCoverageReference((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				getPreAuthRef().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				setClaimResponse((Reference)null);
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
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				return sequence != null;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				return focal != null;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_IDENTIFIER:
				return coverageIdentifier != null;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__COVERAGE_REFERENCE:
				return coverageReference != null;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				return preAuthRef != null && !preAuthRef.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				return claimResponse != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseCoverageImpl
