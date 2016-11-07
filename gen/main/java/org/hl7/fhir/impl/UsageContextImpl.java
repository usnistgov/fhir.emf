/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getPatientGender <em>Patient Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getPatientAgeGroup <em>Patient Age Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getClinicalFocus <em>Clinical Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getTargetUser <em>Target User</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getWorkflowSetting <em>Workflow Setting</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getWorkflowTask <em>Workflow Task</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getClinicalVenue <em>Clinical Venue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UsageContextImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageContextImpl extends ElementImpl implements UsageContext {
	/**
	 * The cached value of the '{@link #getPatientGender() <em>Patient Gender</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientGender()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> patientGender;

	/**
	 * The cached value of the '{@link #getPatientAgeGroup() <em>Patient Age Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientAgeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> patientAgeGroup;

	/**
	 * The cached value of the '{@link #getClinicalFocus() <em>Clinical Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> clinicalFocus;

	/**
	 * The cached value of the '{@link #getTargetUser() <em>Target User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUser()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetUser;

	/**
	 * The cached value of the '{@link #getWorkflowSetting() <em>Workflow Setting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowSetting()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> workflowSetting;

	/**
	 * The cached value of the '{@link #getWorkflowTask() <em>Workflow Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowTask()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> workflowTask;

	/**
	 * The cached value of the '{@link #getClinicalVenue() <em>Clinical Venue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalVenue()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> clinicalVenue;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getUsageContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPatientGender() {
		if (patientGender == null) {
			patientGender = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__PATIENT_GENDER);
		}
		return patientGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPatientAgeGroup() {
		if (patientAgeGroup == null) {
			patientAgeGroup = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__PATIENT_AGE_GROUP);
		}
		return patientAgeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClinicalFocus() {
		if (clinicalFocus == null) {
			clinicalFocus = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__CLINICAL_FOCUS);
		}
		return clinicalFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTargetUser() {
		if (targetUser == null) {
			targetUser = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__TARGET_USER);
		}
		return targetUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getWorkflowSetting() {
		if (workflowSetting == null) {
			workflowSetting = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__WORKFLOW_SETTING);
		}
		return workflowSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getWorkflowTask() {
		if (workflowTask == null) {
			workflowTask = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__WORKFLOW_TASK);
		}
		return workflowTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClinicalVenue() {
		if (clinicalVenue == null) {
			clinicalVenue = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__CLINICAL_VENUE);
		}
		return clinicalVenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.USAGE_CONTEXT__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.USAGE_CONTEXT__PATIENT_GENDER:
				return ((InternalEList<?>)getPatientGender()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__PATIENT_AGE_GROUP:
				return ((InternalEList<?>)getPatientAgeGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__CLINICAL_FOCUS:
				return ((InternalEList<?>)getClinicalFocus()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__TARGET_USER:
				return ((InternalEList<?>)getTargetUser()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_SETTING:
				return ((InternalEList<?>)getWorkflowSetting()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_TASK:
				return ((InternalEList<?>)getWorkflowTask()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__CLINICAL_VENUE:
				return ((InternalEList<?>)getClinicalVenue()).basicRemove(otherEnd, msgs);
			case FhirPackage.USAGE_CONTEXT__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.USAGE_CONTEXT__PATIENT_GENDER:
				return getPatientGender();
			case FhirPackage.USAGE_CONTEXT__PATIENT_AGE_GROUP:
				return getPatientAgeGroup();
			case FhirPackage.USAGE_CONTEXT__CLINICAL_FOCUS:
				return getClinicalFocus();
			case FhirPackage.USAGE_CONTEXT__TARGET_USER:
				return getTargetUser();
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_SETTING:
				return getWorkflowSetting();
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_TASK:
				return getWorkflowTask();
			case FhirPackage.USAGE_CONTEXT__CLINICAL_VENUE:
				return getClinicalVenue();
			case FhirPackage.USAGE_CONTEXT__JURISDICTION:
				return getJurisdiction();
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
			case FhirPackage.USAGE_CONTEXT__PATIENT_GENDER:
				getPatientGender().clear();
				getPatientGender().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__PATIENT_AGE_GROUP:
				getPatientAgeGroup().clear();
				getPatientAgeGroup().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__CLINICAL_FOCUS:
				getClinicalFocus().clear();
				getClinicalFocus().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__TARGET_USER:
				getTargetUser().clear();
				getTargetUser().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_SETTING:
				getWorkflowSetting().clear();
				getWorkflowSetting().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_TASK:
				getWorkflowTask().clear();
				getWorkflowTask().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__CLINICAL_VENUE:
				getClinicalVenue().clear();
				getClinicalVenue().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.USAGE_CONTEXT__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.USAGE_CONTEXT__PATIENT_GENDER:
				getPatientGender().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__PATIENT_AGE_GROUP:
				getPatientAgeGroup().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__CLINICAL_FOCUS:
				getClinicalFocus().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__TARGET_USER:
				getTargetUser().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_SETTING:
				getWorkflowSetting().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_TASK:
				getWorkflowTask().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__CLINICAL_VENUE:
				getClinicalVenue().clear();
				return;
			case FhirPackage.USAGE_CONTEXT__JURISDICTION:
				getJurisdiction().clear();
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
			case FhirPackage.USAGE_CONTEXT__PATIENT_GENDER:
				return patientGender != null && !patientGender.isEmpty();
			case FhirPackage.USAGE_CONTEXT__PATIENT_AGE_GROUP:
				return patientAgeGroup != null && !patientAgeGroup.isEmpty();
			case FhirPackage.USAGE_CONTEXT__CLINICAL_FOCUS:
				return clinicalFocus != null && !clinicalFocus.isEmpty();
			case FhirPackage.USAGE_CONTEXT__TARGET_USER:
				return targetUser != null && !targetUser.isEmpty();
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_SETTING:
				return workflowSetting != null && !workflowSetting.isEmpty();
			case FhirPackage.USAGE_CONTEXT__WORKFLOW_TASK:
				return workflowTask != null && !workflowTask.isEmpty();
			case FhirPackage.USAGE_CONTEXT__CLINICAL_VENUE:
				return clinicalVenue != null && !clinicalVenue.isEmpty();
			case FhirPackage.USAGE_CONTEXT__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsageContextImpl
