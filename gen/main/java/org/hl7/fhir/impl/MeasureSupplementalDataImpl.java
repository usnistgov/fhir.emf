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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MeasureDataUsage;
import org.hl7.fhir.MeasureSupplementalData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Supplemental Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureSupplementalDataImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureSupplementalDataImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureSupplementalDataImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureSupplementalDataImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureSupplementalDataImpl extends BackboneElementImpl implements MeasureSupplementalData {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureDataUsage> usage;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String criteria;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureSupplementalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureSupplementalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureDataUsage> getUsage() {
		if (usage == null) {
			usage = new EObjectContainmentEList<MeasureDataUsage>(MeasureDataUsage.class, this, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriteria(org.hl7.fhir.String newCriteria, NotificationChain msgs) {
		org.hl7.fhir.String oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA, oldCriteria, newCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(org.hl7.fhir.String newCriteria) {
		if (newCriteria != criteria) {
			NotificationChain msgs = null;
			if (criteria != null)
				msgs = ((InternalEObject)criteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA, null, msgs);
			if (newCriteria != null)
				msgs = ((InternalEObject)newCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA, null, msgs);
			msgs = basicSetCriteria(newCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA, newCriteria, newCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				return ((InternalEList<?>)getUsage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				return basicSetCriteria(null, msgs);
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				return basicSetPath(null, msgs);
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
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				return getUsage();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				return getCriteria();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				return getPath();
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
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends MeasureDataUsage>)newValue);
				return;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				setCriteria((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				setPath((org.hl7.fhir.String)newValue);
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
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				getUsage().clear();
				return;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				setCriteria((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				setPath((org.hl7.fhir.String)null);
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
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				return usage != null && !usage.isEmpty();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				return criteria != null;
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				return path != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureSupplementalDataImpl
