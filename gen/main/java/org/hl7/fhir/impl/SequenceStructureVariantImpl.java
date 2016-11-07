/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceInner;
import org.hl7.fhir.SequenceOuter;
import org.hl7.fhir.SequenceStructureVariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getPrecisionOfBoundaries <em>Precision Of Boundaries</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getReportedaCGHRatio <em>Reporteda CGH Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceStructureVariantImpl#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceStructureVariantImpl extends BackboneElementImpl implements SequenceStructureVariant {
	/**
	 * The cached value of the '{@link #getPrecisionOfBoundaries() <em>Precision Of Boundaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionOfBoundaries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String precisionOfBoundaries;

	/**
	 * The cached value of the '{@link #getReportedaCGHRatio() <em>Reporteda CGH Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedaCGHRatio()
	 * @generated
	 * @ordered
	 */
	protected Decimal reportedaCGHRatio;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer length;

	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected SequenceOuter outer;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected SequenceInner inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceStructureVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceStructureVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPrecisionOfBoundaries() {
		return precisionOfBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecisionOfBoundaries(org.hl7.fhir.String newPrecisionOfBoundaries, NotificationChain msgs) {
		org.hl7.fhir.String oldPrecisionOfBoundaries = precisionOfBoundaries;
		precisionOfBoundaries = newPrecisionOfBoundaries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES, oldPrecisionOfBoundaries, newPrecisionOfBoundaries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionOfBoundaries(org.hl7.fhir.String newPrecisionOfBoundaries) {
		if (newPrecisionOfBoundaries != precisionOfBoundaries) {
			NotificationChain msgs = null;
			if (precisionOfBoundaries != null)
				msgs = ((InternalEObject)precisionOfBoundaries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES, null, msgs);
			if (newPrecisionOfBoundaries != null)
				msgs = ((InternalEObject)newPrecisionOfBoundaries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES, null, msgs);
			msgs = basicSetPrecisionOfBoundaries(newPrecisionOfBoundaries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES, newPrecisionOfBoundaries, newPrecisionOfBoundaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getReportedaCGHRatio() {
		return reportedaCGHRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedaCGHRatio(Decimal newReportedaCGHRatio, NotificationChain msgs) {
		Decimal oldReportedaCGHRatio = reportedaCGHRatio;
		reportedaCGHRatio = newReportedaCGHRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, oldReportedaCGHRatio, newReportedaCGHRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedaCGHRatio(Decimal newReportedaCGHRatio) {
		if (newReportedaCGHRatio != reportedaCGHRatio) {
			NotificationChain msgs = null;
			if (reportedaCGHRatio != null)
				msgs = ((InternalEObject)reportedaCGHRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, null, msgs);
			if (newReportedaCGHRatio != null)
				msgs = ((InternalEObject)newReportedaCGHRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, null, msgs);
			msgs = basicSetReportedaCGHRatio(newReportedaCGHRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, newReportedaCGHRatio, newReportedaCGHRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(org.hl7.fhir.Integer newLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(org.hl7.fhir.Integer newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceOuter getOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuter(SequenceOuter newOuter, NotificationChain msgs) {
		SequenceOuter oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, oldOuter, newOuter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(SequenceOuter newOuter) {
		if (newOuter != outer) {
			NotificationChain msgs = null;
			if (outer != null)
				msgs = ((InternalEObject)outer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			if (newOuter != null)
				msgs = ((InternalEObject)newOuter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			msgs = basicSetOuter(newOuter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, newOuter, newOuter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceInner getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInner(SequenceInner newInner, NotificationChain msgs) {
		SequenceInner oldInner = inner;
		inner = newInner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, oldInner, newInner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(SequenceInner newInner) {
		if (newInner != inner) {
			NotificationChain msgs = null;
			if (inner != null)
				msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			if (newInner != null)
				msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			msgs = basicSetInner(newInner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, newInner, newInner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				return basicSetPrecisionOfBoundaries(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return basicSetReportedaCGHRatio(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return basicSetOuter(null, msgs);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return basicSetInner(null, msgs);
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				return getPrecisionOfBoundaries();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return getReportedaCGHRatio();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return getLength();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return getOuter();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return getInner();
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				setPrecisionOfBoundaries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				setReportedaCGHRatio((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((SequenceOuter)newValue);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((SequenceInner)newValue);
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				setPrecisionOfBoundaries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				setReportedaCGHRatio((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((SequenceOuter)null);
				return;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((SequenceInner)null);
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
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				return precisionOfBoundaries != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return reportedaCGHRatio != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return length != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return outer != null;
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceStructureVariantImpl
