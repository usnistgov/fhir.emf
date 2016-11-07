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
import org.hl7.fhir.ImagingManifestBaseLocation1;
import org.hl7.fhir.ImagingManifestInstance;
import org.hl7.fhir.ImagingManifestSeries;
import org.hl7.fhir.Oid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Manifest Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingManifestSeriesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingManifestSeriesImpl#getBaseLocation <em>Base Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingManifestSeriesImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingManifestSeriesImpl extends BackboneElementImpl implements ImagingManifestSeries {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getBaseLocation() <em>Base Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingManifestBaseLocation1> baseLocation;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingManifestInstance> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingManifestSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingManifestSeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Oid newUid, NotificationChain msgs) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_MANIFEST_SERIES__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_MANIFEST_SERIES__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_MANIFEST_SERIES__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_MANIFEST_SERIES__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingManifestBaseLocation1> getBaseLocation() {
		if (baseLocation == null) {
			baseLocation = new EObjectContainmentEList<ImagingManifestBaseLocation1>(ImagingManifestBaseLocation1.class, this, FhirPackage.IMAGING_MANIFEST_SERIES__BASE_LOCATION);
		}
		return baseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingManifestInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<ImagingManifestInstance>(ImagingManifestInstance.class, this, FhirPackage.IMAGING_MANIFEST_SERIES__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_MANIFEST_SERIES__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_MANIFEST_SERIES__BASE_LOCATION:
				return ((InternalEList<?>)getBaseLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_MANIFEST_SERIES__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_MANIFEST_SERIES__UID:
				return getUid();
			case FhirPackage.IMAGING_MANIFEST_SERIES__BASE_LOCATION:
				return getBaseLocation();
			case FhirPackage.IMAGING_MANIFEST_SERIES__INSTANCE:
				return getInstance();
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
			case FhirPackage.IMAGING_MANIFEST_SERIES__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_MANIFEST_SERIES__BASE_LOCATION:
				getBaseLocation().clear();
				getBaseLocation().addAll((Collection<? extends ImagingManifestBaseLocation1>)newValue);
				return;
			case FhirPackage.IMAGING_MANIFEST_SERIES__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends ImagingManifestInstance>)newValue);
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
			case FhirPackage.IMAGING_MANIFEST_SERIES__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_MANIFEST_SERIES__BASE_LOCATION:
				getBaseLocation().clear();
				return;
			case FhirPackage.IMAGING_MANIFEST_SERIES__INSTANCE:
				getInstance().clear();
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
			case FhirPackage.IMAGING_MANIFEST_SERIES__UID:
				return uid != null;
			case FhirPackage.IMAGING_MANIFEST_SERIES__BASE_LOCATION:
				return baseLocation != null && !baseLocation.isEmpty();
			case FhirPackage.IMAGING_MANIFEST_SERIES__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingManifestSeriesImpl
