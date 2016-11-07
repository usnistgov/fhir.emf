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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Schedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getPlanningHorizon <em>Planning Horizon</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ScheduleImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends DomainResourceImpl implements Schedule {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceType;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Reference actor;

	/**
	 * The cached value of the '{@link #getPlanningHorizon() <em>Planning Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningHorizon()
	 * @generated
	 * @ordered
	 */
	protected Period planningHorizon;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SCHEDULE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(CodeableConcept newServiceCategory, NotificationChain msgs) {
		CodeableConcept oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(CodeableConcept newServiceCategory) {
		if (newServiceCategory != serviceCategory) {
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__SERVICE_CATEGORY, null, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__SERVICE_CATEGORY, null, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceType() {
		if (serviceType == null) {
			serviceType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SCHEDULE__SERVICE_TYPE);
		}
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SCHEDULE__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Reference newActor, NotificationChain msgs) {
		Reference oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Reference newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__ACTOR, null, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__ACTOR, null, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPlanningHorizon() {
		return planningHorizon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningHorizon(Period newPlanningHorizon, NotificationChain msgs) {
		Period oldPlanningHorizon = planningHorizon;
		planningHorizon = newPlanningHorizon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__PLANNING_HORIZON, oldPlanningHorizon, newPlanningHorizon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningHorizon(Period newPlanningHorizon) {
		if (newPlanningHorizon != planningHorizon) {
			NotificationChain msgs = null;
			if (planningHorizon != null)
				msgs = ((InternalEObject)planningHorizon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__PLANNING_HORIZON, null, msgs);
			if (newPlanningHorizon != null)
				msgs = ((InternalEObject)newPlanningHorizon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__PLANNING_HORIZON, null, msgs);
			msgs = basicSetPlanningHorizon(newPlanningHorizon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__PLANNING_HORIZON, newPlanningHorizon, newPlanningHorizon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SCHEDULE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SCHEDULE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SCHEDULE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SCHEDULE__ACTIVE:
				return basicSetActive(null, msgs);
			case FhirPackage.SCHEDULE__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case FhirPackage.SCHEDULE__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceType()).basicRemove(otherEnd, msgs);
			case FhirPackage.SCHEDULE__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.SCHEDULE__ACTOR:
				return basicSetActor(null, msgs);
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				return basicSetPlanningHorizon(null, msgs);
			case FhirPackage.SCHEDULE__COMMENT:
				return basicSetComment(null, msgs);
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SCHEDULE__ACTIVE:
				return getActive();
			case FhirPackage.SCHEDULE__SERVICE_CATEGORY:
				return getServiceCategory();
			case FhirPackage.SCHEDULE__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.SCHEDULE__SPECIALTY:
				return getSpecialty();
			case FhirPackage.SCHEDULE__ACTOR:
				return getActor();
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				return getPlanningHorizon();
			case FhirPackage.SCHEDULE__COMMENT:
				return getComment();
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SCHEDULE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SCHEDULE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.SCHEDULE__SERVICE_TYPE:
				getServiceType().clear();
				getServiceType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SCHEDULE__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SCHEDULE__ACTOR:
				setActor((Reference)newValue);
				return;
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)newValue);
				return;
			case FhirPackage.SCHEDULE__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SCHEDULE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SCHEDULE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)null);
				return;
			case FhirPackage.SCHEDULE__SERVICE_TYPE:
				getServiceType().clear();
				return;
			case FhirPackage.SCHEDULE__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.SCHEDULE__ACTOR:
				setActor((Reference)null);
				return;
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)null);
				return;
			case FhirPackage.SCHEDULE__COMMENT:
				setComment((org.hl7.fhir.String)null);
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
			case FhirPackage.SCHEDULE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SCHEDULE__ACTIVE:
				return active != null;
			case FhirPackage.SCHEDULE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case FhirPackage.SCHEDULE__SERVICE_TYPE:
				return serviceType != null && !serviceType.isEmpty();
			case FhirPackage.SCHEDULE__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.SCHEDULE__ACTOR:
				return actor != null;
			case FhirPackage.SCHEDULE__PLANNING_HORIZON:
				return planningHorizon != null;
			case FhirPackage.SCHEDULE__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
