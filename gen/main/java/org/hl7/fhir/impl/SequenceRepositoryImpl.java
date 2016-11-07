/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getVariantId <em>Variant Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getReadId <em>Read Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceRepositoryImpl extends BackboneElementImpl implements SequenceRepository {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getVariantId() <em>Variant Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String variantId;

	/**
	 * The cached value of the '{@link #getReadId() <em>Read Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String readId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceRepository();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVariantId() {
		return variantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantId(org.hl7.fhir.String newVariantId, NotificationChain msgs) {
		org.hl7.fhir.String oldVariantId = variantId;
		variantId = newVariantId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, oldVariantId, newVariantId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantId(org.hl7.fhir.String newVariantId) {
		if (newVariantId != variantId) {
			NotificationChain msgs = null;
			if (variantId != null)
				msgs = ((InternalEObject)variantId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, null, msgs);
			if (newVariantId != null)
				msgs = ((InternalEObject)newVariantId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, null, msgs);
			msgs = basicSetVariantId(newVariantId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, newVariantId, newVariantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReadId() {
		return readId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadId(org.hl7.fhir.String newReadId, NotificationChain msgs) {
		org.hl7.fhir.String oldReadId = readId;
		readId = newReadId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__READ_ID, oldReadId, newReadId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadId(org.hl7.fhir.String newReadId) {
		if (newReadId != readId) {
			NotificationChain msgs = null;
			if (readId != null)
				msgs = ((InternalEObject)readId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__READ_ID, null, msgs);
			if (newReadId != null)
				msgs = ((InternalEObject)newReadId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__READ_ID, null, msgs);
			msgs = basicSetReadId(newReadId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__READ_ID, newReadId, newReadId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return basicSetVariantId(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__READ_ID:
				return basicSetReadId(null, msgs);
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				return getUrl();
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				return getName();
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return getVariantId();
			case FhirPackage.SEQUENCE_REPOSITORY__READ_ID:
				return getReadId();
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				setVariantId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__READ_ID:
				setReadId((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				setVariantId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__READ_ID:
				setReadId((org.hl7.fhir.String)null);
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				return url != null;
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				return name != null;
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return variantId != null;
			case FhirPackage.SEQUENCE_REPOSITORY__READ_ID:
				return readId != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceRepositoryImpl
