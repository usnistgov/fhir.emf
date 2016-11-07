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

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getReportingOrganization <em>Reporting Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getEvaluatedResources <em>Evaluated Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportImpl extends DomainResourceImpl implements MeasureReport {
	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected Reference measure;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MeasureReportType type;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MeasureReportStatus status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getReportingOrganization() <em>Reporting Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference reportingOrganization;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroup> group;

	/**
	 * The cached value of the '{@link #getEvaluatedResources() <em>Evaluated Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedResources()
	 * @generated
	 * @ordered
	 */
	protected Reference evaluatedResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(Reference newMeasure, NotificationChain msgs) {
		Reference oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__MEASURE, oldMeasure, newMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(Reference newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(MeasureReportType newType, NotificationChain msgs) {
		MeasureReportType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MeasureReportType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MeasureReportStatus newStatus, NotificationChain msgs) {
		MeasureReportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MeasureReportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReportingOrganization() {
		return reportingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingOrganization(Reference newReportingOrganization, NotificationChain msgs) {
		Reference oldReportingOrganization = reportingOrganization;
		reportingOrganization = newReportingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION, oldReportingOrganization, newReportingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingOrganization(Reference newReportingOrganization) {
		if (newReportingOrganization != reportingOrganization) {
			NotificationChain msgs = null;
			if (reportingOrganization != null)
				msgs = ((InternalEObject)reportingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION, null, msgs);
			if (newReportingOrganization != null)
				msgs = ((InternalEObject)newReportingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION, null, msgs);
			msgs = basicSetReportingOrganization(newReportingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION, newReportingOrganization, newReportingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<MeasureReportGroup>(MeasureReportGroup.class, this, FhirPackage.MEASURE_REPORT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEvaluatedResources() {
		return evaluatedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluatedResources(Reference newEvaluatedResources, NotificationChain msgs) {
		Reference oldEvaluatedResources = evaluatedResources;
		evaluatedResources = newEvaluatedResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES, oldEvaluatedResources, newEvaluatedResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluatedResources(Reference newEvaluatedResources) {
		if (newEvaluatedResources != evaluatedResources) {
			NotificationChain msgs = null;
			if (evaluatedResources != null)
				msgs = ((InternalEObject)evaluatedResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES, null, msgs);
			if (newEvaluatedResources != null)
				msgs = ((InternalEObject)newEvaluatedResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES, null, msgs);
			msgs = basicSetEvaluatedResources(newEvaluatedResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES, newEvaluatedResources, newEvaluatedResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT__MEASURE:
				return basicSetMeasure(null, msgs);
			case FhirPackage.MEASURE_REPORT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEASURE_REPORT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEASURE_REPORT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.MEASURE_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEASURE_REPORT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION:
				return basicSetReportingOrganization(null, msgs);
			case FhirPackage.MEASURE_REPORT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES:
				return basicSetEvaluatedResources(null, msgs);
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
			case FhirPackage.MEASURE_REPORT__MEASURE:
				return getMeasure();
			case FhirPackage.MEASURE_REPORT__TYPE:
				return getType();
			case FhirPackage.MEASURE_REPORT__PATIENT:
				return getPatient();
			case FhirPackage.MEASURE_REPORT__PERIOD:
				return getPeriod();
			case FhirPackage.MEASURE_REPORT__STATUS:
				return getStatus();
			case FhirPackage.MEASURE_REPORT__DATE:
				return getDate();
			case FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION:
				return getReportingOrganization();
			case FhirPackage.MEASURE_REPORT__GROUP:
				return getGroup();
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES:
				return getEvaluatedResources();
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
			case FhirPackage.MEASURE_REPORT__MEASURE:
				setMeasure((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__TYPE:
				setType((MeasureReportType)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__STATUS:
				setStatus((MeasureReportStatus)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION:
				setReportingOrganization((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends MeasureReportGroup>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES:
				setEvaluatedResources((Reference)newValue);
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
			case FhirPackage.MEASURE_REPORT__MEASURE:
				setMeasure((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT__TYPE:
				setType((MeasureReportType)null);
				return;
			case FhirPackage.MEASURE_REPORT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.MEASURE_REPORT__STATUS:
				setStatus((MeasureReportStatus)null);
				return;
			case FhirPackage.MEASURE_REPORT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION:
				setReportingOrganization((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT__GROUP:
				getGroup().clear();
				return;
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES:
				setEvaluatedResources((Reference)null);
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
			case FhirPackage.MEASURE_REPORT__MEASURE:
				return measure != null;
			case FhirPackage.MEASURE_REPORT__TYPE:
				return type != null;
			case FhirPackage.MEASURE_REPORT__PATIENT:
				return patient != null;
			case FhirPackage.MEASURE_REPORT__PERIOD:
				return period != null;
			case FhirPackage.MEASURE_REPORT__STATUS:
				return status != null;
			case FhirPackage.MEASURE_REPORT__DATE:
				return date != null;
			case FhirPackage.MEASURE_REPORT__REPORTING_ORGANIZATION:
				return reportingOrganization != null;
			case FhirPackage.MEASURE_REPORT__GROUP:
				return group != null && !group.isEmpty();
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCES:
				return evaluatedResources != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportImpl
