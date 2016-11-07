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
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.TaskFulfillment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TaskFulfillmentImpl#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskFulfillmentImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskFulfillmentImpl#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskFulfillmentImpl extends BackboneElementImpl implements TaskFulfillment {
	/**
	 * The cached value of the '{@link #getRepetitions() <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt repetitions;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTaskFulfillment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getRepetitions() {
		return repetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitions(PositiveInt newRepetitions, NotificationChain msgs) {
		PositiveInt oldRepetitions = repetitions;
		repetitions = newRepetitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK_FULFILLMENT__REPETITIONS, oldRepetitions, newRepetitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitions(PositiveInt newRepetitions) {
		if (newRepetitions != repetitions) {
			NotificationChain msgs = null;
			if (repetitions != null)
				msgs = ((InternalEObject)repetitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK_FULFILLMENT__REPETITIONS, null, msgs);
			if (newRepetitions != null)
				msgs = ((InternalEObject)newRepetitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK_FULFILLMENT__REPETITIONS, null, msgs);
			msgs = basicSetRepetitions(newRepetitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK_FULFILLMENT__REPETITIONS, newRepetitions, newRepetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK_FULFILLMENT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK_FULFILLMENT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK_FULFILLMENT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK_FULFILLMENT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TASK_FULFILLMENT__RECIPIENTS);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TASK_FULFILLMENT__REPETITIONS:
				return basicSetRepetitions(null, msgs);
			case FhirPackage.TASK_FULFILLMENT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.TASK_FULFILLMENT__RECIPIENTS:
				return ((InternalEList<?>)getRecipients()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TASK_FULFILLMENT__REPETITIONS:
				return getRepetitions();
			case FhirPackage.TASK_FULFILLMENT__PERIOD:
				return getPeriod();
			case FhirPackage.TASK_FULFILLMENT__RECIPIENTS:
				return getRecipients();
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
			case FhirPackage.TASK_FULFILLMENT__REPETITIONS:
				setRepetitions((PositiveInt)newValue);
				return;
			case FhirPackage.TASK_FULFILLMENT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.TASK_FULFILLMENT__RECIPIENTS:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.TASK_FULFILLMENT__REPETITIONS:
				setRepetitions((PositiveInt)null);
				return;
			case FhirPackage.TASK_FULFILLMENT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.TASK_FULFILLMENT__RECIPIENTS:
				getRecipients().clear();
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
			case FhirPackage.TASK_FULFILLMENT__REPETITIONS:
				return repetitions != null;
			case FhirPackage.TASK_FULFILLMENT__PERIOD:
				return period != null;
			case FhirPackage.TASK_FULFILLMENT__RECIPIENTS:
				return recipients != null && !recipients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskFulfillmentImpl
