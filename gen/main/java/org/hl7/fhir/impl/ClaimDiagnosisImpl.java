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
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getDrg <em>Drg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimDiagnosisImpl extends BackboneElementImpl implements ClaimDiagnosis {
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
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected Coding diagnosis;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> type;

	/**
	 * The cached value of the '{@link #getDrg() <em>Drg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrg()
	 * @generated
	 * @ordered
	 */
	protected Coding drg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimDiagnosis();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE, oldSequence, newSequence);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getDiagnosis() {
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosis(Coding newDiagnosis, NotificationChain msgs) {
		Coding oldDiagnosis = diagnosis;
		diagnosis = newDiagnosis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS, oldDiagnosis, newDiagnosis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosis(Coding newDiagnosis) {
		if (newDiagnosis != diagnosis) {
			NotificationChain msgs = null;
			if (diagnosis != null)
				msgs = ((InternalEObject)diagnosis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS, null, msgs);
			if (newDiagnosis != null)
				msgs = ((InternalEObject)newDiagnosis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS, null, msgs);
			msgs = basicSetDiagnosis(newDiagnosis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS, newDiagnosis, newDiagnosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM_DIAGNOSIS__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getDrg() {
		return drg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrg(Coding newDrg, NotificationChain msgs) {
		Coding oldDrg = drg;
		drg = newDrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DIAGNOSIS__DRG, oldDrg, newDrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrg(Coding newDrg) {
		if (newDrg != drg) {
			NotificationChain msgs = null;
			if (drg != null)
				msgs = ((InternalEObject)drg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DIAGNOSIS__DRG, null, msgs);
			if (newDrg != null)
				msgs = ((InternalEObject)newDrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DIAGNOSIS__DRG, null, msgs);
			msgs = basicSetDrg(newDrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DIAGNOSIS__DRG, newDrg, newDrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS:
				return basicSetDiagnosis(null, msgs);
			case FhirPackage.CLAIM_DIAGNOSIS__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_DIAGNOSIS__DRG:
				return basicSetDrg(null, msgs);
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
			case FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				return getSequence();
			case FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.CLAIM_DIAGNOSIS__TYPE:
				return getType();
			case FhirPackage.CLAIM_DIAGNOSIS__DRG:
				return getDrg();
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
			case FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS:
				setDiagnosis((Coding)newValue);
				return;
			case FhirPackage.CLAIM_DIAGNOSIS__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM_DIAGNOSIS__DRG:
				setDrg((Coding)newValue);
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
			case FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS:
				setDiagnosis((Coding)null);
				return;
			case FhirPackage.CLAIM_DIAGNOSIS__TYPE:
				getType().clear();
				return;
			case FhirPackage.CLAIM_DIAGNOSIS__DRG:
				setDrg((Coding)null);
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
			case FhirPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				return sequence != null;
			case FhirPackage.CLAIM_DIAGNOSIS__DIAGNOSIS:
				return diagnosis != null;
			case FhirPackage.CLAIM_DIAGNOSIS__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.CLAIM_DIAGNOSIS__DRG:
				return drg != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimDiagnosisImpl
