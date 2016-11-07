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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Code Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueSetString <em>Value Set String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueSetReference <em>Value Set Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementCodeFilterImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementCodeFilterImpl extends ElementImpl implements DataRequirementCodeFilter {
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
	 * The cached value of the '{@link #getValueSetString() <em>Value Set String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueSetString;

	/**
	 * The cached value of the '{@link #getValueSetReference() <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueSetReference;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> valueCode;

	/**
	 * The cached value of the '{@link #getValueCoding() <em>Value Coding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCoding()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> valueCoding;

	/**
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> valueCodeableConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementCodeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDataRequirementCodeFilter();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, oldPath, newPath);
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
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValueSetString() {
		return valueSetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetString(org.hl7.fhir.String newValueSetString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueSetString = valueSetString;
		valueSetString = newValueSetString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING, oldValueSetString, newValueSetString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetString(org.hl7.fhir.String newValueSetString) {
		if (newValueSetString != valueSetString) {
			NotificationChain msgs = null;
			if (valueSetString != null)
				msgs = ((InternalEObject)valueSetString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING, null, msgs);
			if (newValueSetString != null)
				msgs = ((InternalEObject)newValueSetString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING, null, msgs);
			msgs = basicSetValueSetString(newValueSetString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING, newValueSetString, newValueSetString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getValueSetReference() {
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetReference(Reference newValueSetReference, NotificationChain msgs) {
		Reference oldValueSetReference = valueSetReference;
		valueSetReference = newValueSetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, oldValueSetReference, newValueSetReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetReference(Reference newValueSetReference) {
		if (newValueSetReference != valueSetReference) {
			NotificationChain msgs = null;
			if (valueSetReference != null)
				msgs = ((InternalEObject)valueSetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, null, msgs);
			if (newValueSetReference != null)
				msgs = ((InternalEObject)newValueSetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, null, msgs);
			msgs = basicSetValueSetReference(newValueSetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE, newValueSetReference, newValueSetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getValueCode() {
		if (valueCode == null) {
			valueCode = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODE);
		}
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getValueCoding() {
		if (valueCoding == null) {
			valueCoding = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODING);
		}
		return valueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getValueCodeableConcept() {
		if (valueCodeableConcept == null) {
			valueCodeableConcept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODEABLE_CONCEPT);
		}
		return valueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING:
				return basicSetValueSetString(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				return basicSetValueSetReference(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODE:
				return ((InternalEList<?>)getValueCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODING:
				return ((InternalEList<?>)getValueCoding()).basicRemove(otherEnd, msgs);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODEABLE_CONCEPT:
				return ((InternalEList<?>)getValueCodeableConcept()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return getPath();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING:
				return getValueSetString();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				return getValueSetReference();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODE:
				return getValueCode();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODING:
				return getValueCoding();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING:
				setValueSetString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODE:
				getValueCode().clear();
				getValueCode().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODING:
				getValueCoding().clear();
				getValueCoding().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODEABLE_CONCEPT:
				getValueCodeableConcept().clear();
				getValueCodeableConcept().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING:
				setValueSetString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODE:
				getValueCode().clear();
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODING:
				getValueCoding().clear();
				return;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODEABLE_CONCEPT:
				getValueCodeableConcept().clear();
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
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return path != null;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_STRING:
				return valueSetString != null;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET_REFERENCE:
				return valueSetReference != null;
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODE:
				return valueCode != null && !valueCode.isEmpty();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODING:
				return valueCoding != null && !valueCoding.isEmpty();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null && !valueCodeableConcept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementCodeFilterImpl
