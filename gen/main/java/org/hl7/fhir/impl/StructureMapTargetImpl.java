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
import org.hl7.fhir.Id;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapListMode;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTransform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getListRuleId <em>List Rule Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapTargetImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapTargetImpl extends BackboneElementImpl implements StructureMapTarget {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Id context;

	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected StructureMapContextType contextType;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String element;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Id variable;

	/**
	 * The cached value of the '{@link #getListMode() <em>List Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMode()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapListMode> listMode;

	/**
	 * The cached value of the '{@link #getListRuleId() <em>List Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRuleId()
	 * @generated
	 * @ordered
	 */
	protected Id listRuleId;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected StructureMapTransform transform;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getStructureMapTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Id newContext, NotificationChain msgs) {
		Id oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Id newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextType getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextType(StructureMapContextType newContextType, NotificationChain msgs) {
		StructureMapContextType oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE, oldContextType, newContextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(StructureMapContextType newContextType) {
		if (newContextType != contextType) {
			NotificationChain msgs = null;
			if (contextType != null)
				msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE, null, msgs);
			if (newContextType != null)
				msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE, null, msgs);
			msgs = basicSetContextType(newContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE, newContextType, newContextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(org.hl7.fhir.String newElement, NotificationChain msgs) {
		org.hl7.fhir.String oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(org.hl7.fhir.String newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Id newVariable, NotificationChain msgs) {
		Id oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Id newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapListMode> getListMode() {
		if (listMode == null) {
			listMode = new EObjectContainmentEList<StructureMapListMode>(StructureMapListMode.class, this, FhirPackage.STRUCTURE_MAP_TARGET__LIST_MODE);
		}
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getListRuleId() {
		return listRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListRuleId(Id newListRuleId, NotificationChain msgs) {
		Id oldListRuleId = listRuleId;
		listRuleId = newListRuleId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID, oldListRuleId, newListRuleId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListRuleId(Id newListRuleId) {
		if (newListRuleId != listRuleId) {
			NotificationChain msgs = null;
			if (listRuleId != null)
				msgs = ((InternalEObject)listRuleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID, null, msgs);
			if (newListRuleId != null)
				msgs = ((InternalEObject)newListRuleId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID, null, msgs);
			msgs = basicSetListRuleId(newListRuleId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID, newListRuleId, newListRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransform getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(StructureMapTransform newTransform, NotificationChain msgs) {
		StructureMapTransform oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(StructureMapTransform newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<StructureMapParameter>(StructureMapParameter.class, this, FhirPackage.STRUCTURE_MAP_TARGET__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE:
				return basicSetContextType(null, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT:
				return basicSetElement(null, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE:
				return basicSetVariable(null, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_MODE:
				return ((InternalEList<?>)getListMode()).basicRemove(otherEnd, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID:
				return basicSetListRuleId(null, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM:
				return basicSetTransform(null, msgs);
			case FhirPackage.STRUCTURE_MAP_TARGET__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT:
				return getContext();
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE:
				return getContextType();
			case FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT:
				return getElement();
			case FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE:
				return getVariable();
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_MODE:
				return getListMode();
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID:
				return getListRuleId();
			case FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM:
				return getTransform();
			case FhirPackage.STRUCTURE_MAP_TARGET__PARAMETER:
				return getParameter();
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
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT:
				setContext((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE:
				setContextType((StructureMapContextType)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT:
				setElement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE:
				setVariable((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_MODE:
				getListMode().clear();
				getListMode().addAll((Collection<? extends StructureMapListMode>)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID:
				setListRuleId((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM:
				setTransform((StructureMapTransform)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends StructureMapParameter>)newValue);
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
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT:
				setContext((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE:
				setContextType((StructureMapContextType)null);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT:
				setElement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE:
				setVariable((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_MODE:
				getListMode().clear();
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID:
				setListRuleId((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM:
				setTransform((StructureMapTransform)null);
				return;
			case FhirPackage.STRUCTURE_MAP_TARGET__PARAMETER:
				getParameter().clear();
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
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT:
				return context != null;
			case FhirPackage.STRUCTURE_MAP_TARGET__CONTEXT_TYPE:
				return contextType != null;
			case FhirPackage.STRUCTURE_MAP_TARGET__ELEMENT:
				return element != null;
			case FhirPackage.STRUCTURE_MAP_TARGET__VARIABLE:
				return variable != null;
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_MODE:
				return listMode != null && !listMode.isEmpty();
			case FhirPackage.STRUCTURE_MAP_TARGET__LIST_RULE_ID:
				return listRuleId != null;
			case FhirPackage.STRUCTURE_MAP_TARGET__TRANSFORM:
				return transform != null;
			case FhirPackage.STRUCTURE_MAP_TARGET__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureMapTargetImpl
