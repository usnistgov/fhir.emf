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

import org.hl7.fhir.ExplanationOfBenefitCoverage;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitCoverageImpl#getCoverageIdentifier <em>Coverage Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitCoverageImpl#getCoverageReference <em>Coverage Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitCoverageImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitCoverageImpl extends BackboneElementImpl implements ExplanationOfBenefitCoverage {
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
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> preAuthRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitCoverage();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER, oldCoverageIdentifier, newCoverageIdentifier);
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
				msgs = ((InternalEObject)coverageIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER, null, msgs);
			if (newCoverageIdentifier != null)
				msgs = ((InternalEObject)newCoverageIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER, null, msgs);
			msgs = basicSetCoverageIdentifier(newCoverageIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER, newCoverageIdentifier, newCoverageIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE, oldCoverageReference, newCoverageReference);
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
				msgs = ((InternalEObject)coverageReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE, null, msgs);
			if (newCoverageReference != null)
				msgs = ((InternalEObject)newCoverageReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE, null, msgs);
			msgs = basicSetCoverageReference(newCoverageReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE, newCoverageReference, newCoverageReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getPreAuthRef() {
		if (preAuthRef == null) {
			preAuthRef = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__PRE_AUTH_REF);
		}
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER:
				return basicSetCoverageIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE:
				return basicSetCoverageReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__PRE_AUTH_REF:
				return ((InternalEList<?>)getPreAuthRef()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER:
				return getCoverageIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE:
				return getCoverageReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__PRE_AUTH_REF:
				return getPreAuthRef();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER:
				setCoverageIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE:
				setCoverageReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__PRE_AUTH_REF:
				getPreAuthRef().clear();
				getPreAuthRef().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER:
				setCoverageIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE:
				setCoverageReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__PRE_AUTH_REF:
				getPreAuthRef().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_IDENTIFIER:
				return coverageIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__COVERAGE_REFERENCE:
				return coverageReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE__PRE_AUTH_REF:
				return preAuthRef != null && !preAuthRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitCoverageImpl
