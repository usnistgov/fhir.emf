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
import org.hl7.fhir.MedicationStatementDosage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getSiteReference <em>Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getRateRange <em>Rate Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getRateQuantity <em>Rate Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementDosageImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationStatementDosageImpl extends BackboneElementImpl implements MedicationStatementDosage {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getAdditionalInstructions() <em>Additional Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalInstructions;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timing;

	/**
	 * The cached value of the '{@link #getAsNeededBoolean() <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean asNeededBoolean;

	/**
	 * The cached value of the '{@link #getAsNeededCodeableConcept() <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept asNeededCodeableConcept;

	/**
	 * The cached value of the '{@link #getSiteCodeableConcept() <em>Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept siteCodeableConcept;

	/**
	 * The cached value of the '{@link #getSiteReference() <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteReference()
	 * @generated
	 * @ordered
	 */
	protected Reference siteReference;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity doseQuantity;

	/**
	 * The cached value of the '{@link #getDoseRange() <em>Dose Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseRange()
	 * @generated
	 * @ordered
	 */
	protected Range doseRange;

	/**
	 * The cached value of the '{@link #getRateRatio() <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio rateRatio;

	/**
	 * The cached value of the '{@link #getRateRange() <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRange()
	 * @generated
	 * @ordered
	 */
	protected Range rateRange;

	/**
	 * The cached value of the '{@link #getRateQuantity() <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity rateQuantity;

	/**
	 * The cached value of the '{@link #getMaxDosePerPeriod() <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxDosePerPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementDosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationStatementDosage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAdditionalInstructions() {
		if (additionalInstructions == null) {
			additionalInstructions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_STATEMENT_DOSAGE__ADDITIONAL_INSTRUCTIONS);
		}
		return additionalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTiming() {
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiming(Timing newTiming, NotificationChain msgs) {
		Timing oldTiming = timing;
		timing = newTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING, oldTiming, newTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiming(Timing newTiming) {
		if (newTiming != timing) {
			NotificationChain msgs = null;
			if (timing != null)
				msgs = ((InternalEObject)timing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING, null, msgs);
			if (newTiming != null)
				msgs = ((InternalEObject)newTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING, null, msgs);
			msgs = basicSetTiming(newTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING, newTiming, newTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAsNeededBoolean() {
		return asNeededBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAsNeededBoolean = asNeededBoolean;
		asNeededBoolean = newAsNeededBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN, oldAsNeededBoolean, newAsNeededBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean) {
		if (newAsNeededBoolean != asNeededBoolean) {
			NotificationChain msgs = null;
			if (asNeededBoolean != null)
				msgs = ((InternalEObject)asNeededBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN, null, msgs);
			if (newAsNeededBoolean != null)
				msgs = ((InternalEObject)newAsNeededBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN, null, msgs);
			msgs = basicSetAsNeededBoolean(newAsNeededBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN, newAsNeededBoolean, newAsNeededBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAsNeededCodeableConcept() {
		return asNeededCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAsNeededCodeableConcept = asNeededCodeableConcept;
		asNeededCodeableConcept = newAsNeededCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT, oldAsNeededCodeableConcept, newAsNeededCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept) {
		if (newAsNeededCodeableConcept != asNeededCodeableConcept) {
			NotificationChain msgs = null;
			if (asNeededCodeableConcept != null)
				msgs = ((InternalEObject)asNeededCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			if (newAsNeededCodeableConcept != null)
				msgs = ((InternalEObject)newAsNeededCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAsNeededCodeableConcept(newAsNeededCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT, newAsNeededCodeableConcept, newAsNeededCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSiteCodeableConcept() {
		return siteCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteCodeableConcept(CodeableConcept newSiteCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSiteCodeableConcept = siteCodeableConcept;
		siteCodeableConcept = newSiteCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT, oldSiteCodeableConcept, newSiteCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteCodeableConcept(CodeableConcept newSiteCodeableConcept) {
		if (newSiteCodeableConcept != siteCodeableConcept) {
			NotificationChain msgs = null;
			if (siteCodeableConcept != null)
				msgs = ((InternalEObject)siteCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT, null, msgs);
			if (newSiteCodeableConcept != null)
				msgs = ((InternalEObject)newSiteCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSiteCodeableConcept(newSiteCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT, newSiteCodeableConcept, newSiteCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSiteReference() {
		return siteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteReference(Reference newSiteReference, NotificationChain msgs) {
		Reference oldSiteReference = siteReference;
		siteReference = newSiteReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE, oldSiteReference, newSiteReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteReference(Reference newSiteReference) {
		if (newSiteReference != siteReference) {
			NotificationChain msgs = null;
			if (siteReference != null)
				msgs = ((InternalEObject)siteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE, null, msgs);
			if (newSiteReference != null)
				msgs = ((InternalEObject)newSiteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE, null, msgs);
			msgs = basicSetSiteReference(newSiteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE, newSiteReference, newSiteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(Quantity newDoseQuantity, NotificationChain msgs) {
		Quantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(Quantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getDoseRange() {
		return doseRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseRange(Range newDoseRange, NotificationChain msgs) {
		Range oldDoseRange = doseRange;
		doseRange = newDoseRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE, oldDoseRange, newDoseRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseRange(Range newDoseRange) {
		if (newDoseRange != doseRange) {
			NotificationChain msgs = null;
			if (doseRange != null)
				msgs = ((InternalEObject)doseRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE, null, msgs);
			if (newDoseRange != null)
				msgs = ((InternalEObject)newDoseRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE, null, msgs);
			msgs = basicSetDoseRange(newDoseRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE, newDoseRange, newDoseRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getRateRatio() {
		return rateRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRatio(Ratio newRateRatio, NotificationChain msgs) {
		Ratio oldRateRatio = rateRatio;
		rateRatio = newRateRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO, oldRateRatio, newRateRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateRatio(Ratio newRateRatio) {
		if (newRateRatio != rateRatio) {
			NotificationChain msgs = null;
			if (rateRatio != null)
				msgs = ((InternalEObject)rateRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO, null, msgs);
			if (newRateRatio != null)
				msgs = ((InternalEObject)newRateRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO, null, msgs);
			msgs = basicSetRateRatio(newRateRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO, newRateRatio, newRateRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRateRange() {
		return rateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRange(Range newRateRange, NotificationChain msgs) {
		Range oldRateRange = rateRange;
		rateRange = newRateRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE, oldRateRange, newRateRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateRange(Range newRateRange) {
		if (newRateRange != rateRange) {
			NotificationChain msgs = null;
			if (rateRange != null)
				msgs = ((InternalEObject)rateRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE, null, msgs);
			if (newRateRange != null)
				msgs = ((InternalEObject)newRateRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE, null, msgs);
			msgs = basicSetRateRange(newRateRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE, newRateRange, newRateRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getRateQuantity() {
		return rateQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateQuantity(Quantity newRateQuantity, NotificationChain msgs) {
		Quantity oldRateQuantity = rateQuantity;
		rateQuantity = newRateQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY, oldRateQuantity, newRateQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateQuantity(Quantity newRateQuantity) {
		if (newRateQuantity != rateQuantity) {
			NotificationChain msgs = null;
			if (rateQuantity != null)
				msgs = ((InternalEObject)rateQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY, null, msgs);
			if (newRateQuantity != null)
				msgs = ((InternalEObject)newRateQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY, null, msgs);
			msgs = basicSetRateQuantity(newRateQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY, newRateQuantity, newRateQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxDosePerPeriod() {
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerPeriod(Ratio newMaxDosePerPeriod, NotificationChain msgs) {
		Ratio oldMaxDosePerPeriod = maxDosePerPeriod;
		maxDosePerPeriod = newMaxDosePerPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, newMaxDosePerPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerPeriod(Ratio newMaxDosePerPeriod) {
		if (newMaxDosePerPeriod != maxDosePerPeriod) {
			NotificationChain msgs = null;
			if (maxDosePerPeriod != null)
				msgs = ((InternalEObject)maxDosePerPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD, null, msgs);
			if (newMaxDosePerPeriod != null)
				msgs = ((InternalEObject)newMaxDosePerPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD, null, msgs);
			msgs = basicSetMaxDosePerPeriod(newMaxDosePerPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD, newMaxDosePerPeriod, newMaxDosePerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ADDITIONAL_INSTRUCTIONS:
				return ((InternalEList<?>)getAdditionalInstructions()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				return basicSetTiming(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN:
				return basicSetAsNeededBoolean(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT:
				return basicSetAsNeededCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT:
				return basicSetSiteCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE:
				return basicSetSiteReference(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE:
				return basicSetDoseRange(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO:
				return basicSetRateRatio(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE:
				return basicSetRateRange(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY:
				return basicSetRateQuantity(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				return basicSetMaxDosePerPeriod(null, msgs);
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
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				return getText();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ADDITIONAL_INSTRUCTIONS:
				return getAdditionalInstructions();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				return getTiming();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN:
				return getAsNeededBoolean();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT:
				return getAsNeededCodeableConcept();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT:
				return getSiteCodeableConcept();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE:
				return getSiteReference();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				return getRoute();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				return getMethod();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY:
				return getDoseQuantity();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE:
				return getDoseRange();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO:
				return getRateRatio();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE:
				return getRateRange();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY:
				return getRateQuantity();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				return getMaxDosePerPeriod();
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
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				getAdditionalInstructions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				setTiming((Timing)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT:
				setSiteCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE:
				setSiteReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY:
				setDoseQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE:
				setDoseRange((Range)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO:
				setRateRatio((Ratio)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE:
				setRateRange((Range)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY:
				setRateQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)newValue);
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
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				setTiming((Timing)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT:
				setSiteCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE:
				setSiteReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY:
				setDoseQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE:
				setDoseRange((Range)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO:
				setRateRatio((Ratio)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE:
				setRateRange((Range)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY:
				setRateQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)null);
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
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				return text != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ADDITIONAL_INSTRUCTIONS:
				return additionalInstructions != null && !additionalInstructions.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				return timing != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_BOOLEAN:
				return asNeededBoolean != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDED_CODEABLE_CONCEPT:
				return asNeededCodeableConcept != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_CODEABLE_CONCEPT:
				return siteCodeableConcept != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__SITE_REFERENCE:
				return siteReference != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				return route != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				return method != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_QUANTITY:
				return doseQuantity != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__DOSE_RANGE:
				return doseRange != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RATIO:
				return rateRatio != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_RANGE:
				return rateRange != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__RATE_QUANTITY:
				return rateQuantity != null;
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementDosageImpl
