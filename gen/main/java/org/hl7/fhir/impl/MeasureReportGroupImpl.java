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

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportSupplementalData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getMeasureScore <em>Measure Score</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getStratifier <em>Stratifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportGroupImpl#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportGroupImpl extends BackboneElementImpl implements MeasureReportGroup {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportPopulation> population;

	/**
	 * The cached value of the '{@link #getMeasureScore() <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal measureScore;

	/**
	 * The cached value of the '{@link #getStratifier() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportStratifier> stratifier;

	/**
	 * The cached value of the '{@link #getSupplementalData() <em>Supplemental Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalData()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportSupplementalData> supplementalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReportGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportPopulation> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasureReportPopulation>(MeasureReportPopulation.class, this, FhirPackage.MEASURE_REPORT_GROUP__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getMeasureScore() {
		return measureScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScore(Decimal newMeasureScore, NotificationChain msgs) {
		Decimal oldMeasureScore = measureScore;
		measureScore = newMeasureScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, oldMeasureScore, newMeasureScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureScore(Decimal newMeasureScore) {
		if (newMeasureScore != measureScore) {
			NotificationChain msgs = null;
			if (measureScore != null)
				msgs = ((InternalEObject)measureScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, null, msgs);
			if (newMeasureScore != null)
				msgs = ((InternalEObject)newMeasureScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, null, msgs);
			msgs = basicSetMeasureScore(newMeasureScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, newMeasureScore, newMeasureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportStratifier> getStratifier() {
		if (stratifier == null) {
			stratifier = new EObjectContainmentEList<MeasureReportStratifier>(MeasureReportStratifier.class, this, FhirPackage.MEASURE_REPORT_GROUP__STRATIFIER);
		}
		return stratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportSupplementalData> getSupplementalData() {
		if (supplementalData == null) {
			supplementalData = new EObjectContainmentEList<MeasureReportSupplementalData>(MeasureReportSupplementalData.class, this, FhirPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA);
		}
		return supplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEASURE_REPORT_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return basicSetMeasureScore(null, msgs);
			case FhirPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return ((InternalEList<?>)getStratifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				return ((InternalEList<?>)getSupplementalData()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEASURE_REPORT_GROUP__POPULATION:
				return getPopulation();
			case FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return getMeasureScore();
			case FhirPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return getStratifier();
			case FhirPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				return getSupplementalData();
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
			case FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasureReportPopulation>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				setMeasureScore((Decimal)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifier().clear();
				getStratifier().addAll((Collection<? extends MeasureReportStratifier>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
				getSupplementalData().addAll((Collection<? extends MeasureReportSupplementalData>)newValue);
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
			case FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				setMeasureScore((Decimal)null);
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifier().clear();
				return;
			case FhirPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
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
			case FhirPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEASURE_REPORT_GROUP__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return measureScore != null;
			case FhirPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return stratifier != null && !stratifier.isEmpty();
			case FhirPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				return supplementalData != null && !supplementalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupImpl
