/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Date Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementDateFilterImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementDateFilterImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementDateFilterImpl#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DataRequirementDateFilterImpl#getValueDuration <em>Value Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementDateFilterImpl extends ElementImpl implements DataRequirementDateFilter {
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
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValuePeriod() <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period valuePeriod;

	/**
	 * The cached value of the '{@link #getValueDuration() <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration valueDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementDateFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDataRequirementDateFilter();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH, oldPath, newPath);
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
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValuePeriod() {
		return valuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePeriod(Period newValuePeriod, NotificationChain msgs) {
		Period oldValuePeriod = valuePeriod;
		valuePeriod = newValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD, oldValuePeriod, newValuePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePeriod(Period newValuePeriod) {
		if (newValuePeriod != valuePeriod) {
			NotificationChain msgs = null;
			if (valuePeriod != null)
				msgs = ((InternalEObject)valuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD, null, msgs);
			if (newValuePeriod != null)
				msgs = ((InternalEObject)newValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD, null, msgs);
			msgs = basicSetValuePeriod(newValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD, newValuePeriod, newValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getValueDuration() {
		return valueDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDuration(Duration newValueDuration, NotificationChain msgs) {
		Duration oldValueDuration = valueDuration;
		valueDuration = newValueDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION, oldValueDuration, newValueDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDuration(Duration newValueDuration) {
		if (newValueDuration != valueDuration) {
			NotificationChain msgs = null;
			if (valueDuration != null)
				msgs = ((InternalEObject)valueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION, null, msgs);
			if (newValueDuration != null)
				msgs = ((InternalEObject)newValueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION, null, msgs);
			msgs = basicSetValueDuration(newValueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION, newValueDuration, newValueDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD:
				return basicSetValuePeriod(null, msgs);
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION:
				return basicSetValueDuration(null, msgs);
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
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH:
				return getPath();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME:
				return getValueDateTime();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD:
				return getValuePeriod();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION:
				return getValueDuration();
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
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD:
				setValuePeriod((Period)newValue);
				return;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION:
				setValueDuration((Duration)newValue);
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
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD:
				setValuePeriod((Period)null);
				return;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION:
				setValueDuration((Duration)null);
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
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__PATH:
				return path != null;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD:
				return valuePeriod != null;
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION:
				return valueDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementDateFilterImpl
