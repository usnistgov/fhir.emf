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

import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapGroupImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapGroupImpl extends BackboneElementImpl implements ConceptMapGroup {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getSourceVersion() <em>Source Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sourceVersion;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Uri target;

	/**
	 * The cached value of the '{@link #getTargetVersion() <em>Target Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String targetVersion;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapElement> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSourceVersion() {
		return sourceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceVersion(org.hl7.fhir.String newSourceVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldSourceVersion = sourceVersion;
		sourceVersion = newSourceVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, oldSourceVersion, newSourceVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVersion(org.hl7.fhir.String newSourceVersion) {
		if (newSourceVersion != sourceVersion) {
			NotificationChain msgs = null;
			if (sourceVersion != null)
				msgs = ((InternalEObject)sourceVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, null, msgs);
			if (newSourceVersion != null)
				msgs = ((InternalEObject)newSourceVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, null, msgs);
			msgs = basicSetSourceVersion(newSourceVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, newSourceVersion, newSourceVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Uri newTarget, NotificationChain msgs) {
		Uri oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Uri newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTargetVersion() {
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetVersion(org.hl7.fhir.String newTargetVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldTargetVersion = targetVersion;
		targetVersion = newTargetVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, oldTargetVersion, newTargetVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVersion(org.hl7.fhir.String newTargetVersion) {
		if (newTargetVersion != targetVersion) {
			NotificationChain msgs = null;
			if (targetVersion != null)
				msgs = ((InternalEObject)targetVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, null, msgs);
			if (newTargetVersion != null)
				msgs = ((InternalEObject)newTargetVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, null, msgs);
			msgs = basicSetTargetVersion(newTargetVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, newTargetVersion, newTargetVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ConceptMapElement>(ConceptMapElement.class, this, FhirPackage.CONCEPT_MAP_GROUP__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return basicSetSourceVersion(null, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return basicSetTargetVersion(null, msgs);
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				return getSource();
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return getSourceVersion();
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				return getTarget();
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return getTargetVersion();
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return getElement();
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				setSourceVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				setTargetVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ConceptMapElement>)newValue);
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				setSourceVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				setTargetVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElement().clear();
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
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE:
				return source != null;
			case FhirPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return sourceVersion != null;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET:
				return target != null;
			case FhirPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return targetVersion != null;
			case FhirPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return element != null && !element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupImpl
