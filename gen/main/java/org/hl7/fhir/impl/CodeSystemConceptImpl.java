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
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemConceptImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemConceptImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemConceptImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemConceptImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemConceptImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemConceptImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeSystemConceptImpl extends BackboneElementImpl implements CodeSystemConcept {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String display;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String definition;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemDesignation> designation;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemProperty1> property;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConcept> concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCodeSystemConcept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM_CONCEPT__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM_CONCEPT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM_CONCEPT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM_CONCEPT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(org.hl7.fhir.String newDefinition, NotificationChain msgs) {
		org.hl7.fhir.String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(org.hl7.fhir.String newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemDesignation> getDesignation() {
		if (designation == null) {
			designation = new EObjectContainmentEList<CodeSystemDesignation>(CodeSystemDesignation.class, this, FhirPackage.CODE_SYSTEM_CONCEPT__DESIGNATION);
		}
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemProperty1> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<CodeSystemProperty1>(CodeSystemProperty1.class, this, FhirPackage.CODE_SYSTEM_CONCEPT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<CodeSystemConcept>(CodeSystemConcept.class, this, FhirPackage.CODE_SYSTEM_CONCEPT__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CODE_SYSTEM_CONCEPT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.CODE_SYSTEM_CONCEPT__DESIGNATION:
				return ((InternalEList<?>)getDesignation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CODE_SYSTEM_CONCEPT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.CODE_SYSTEM_CONCEPT__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CODE_SYSTEM_CONCEPT__CODE:
				return getCode();
			case FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY:
				return getDisplay();
			case FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION:
				return getDefinition();
			case FhirPackage.CODE_SYSTEM_CONCEPT__DESIGNATION:
				return getDesignation();
			case FhirPackage.CODE_SYSTEM_CONCEPT__PROPERTY:
				return getProperty();
			case FhirPackage.CODE_SYSTEM_CONCEPT__CONCEPT:
				return getConcept();
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
			case FhirPackage.CODE_SYSTEM_CONCEPT__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION:
				setDefinition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends CodeSystemDesignation>)newValue);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends CodeSystemProperty1>)newValue);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends CodeSystemConcept>)newValue);
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
			case FhirPackage.CODE_SYSTEM_CONCEPT__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION:
				setDefinition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DESIGNATION:
				getDesignation().clear();
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.CODE_SYSTEM_CONCEPT__CONCEPT:
				getConcept().clear();
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
			case FhirPackage.CODE_SYSTEM_CONCEPT__CODE:
				return code != null;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DISPLAY:
				return display != null;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DEFINITION:
				return definition != null;
			case FhirPackage.CODE_SYSTEM_CONCEPT__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case FhirPackage.CODE_SYSTEM_CONCEPT__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.CODE_SYSTEM_CONCEPT__CONCEPT:
				return concept != null && !concept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemConceptImpl
