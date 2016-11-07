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

import org.hl7.fhir.Coding;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDetailImpl#getSubDetail <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitDetailImpl extends BackboneElementImpl implements ExplanationOfBenefitDetail {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected Coding revenue;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Coding category;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modifier;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> programCode;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udi;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumber;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAdjudication> adjudication;

	/**
	 * The cached value of the '{@link #getSubDetail() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitSubDetail> subDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(Coding newRevenue, NotificationChain msgs) {
		Coding oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE, oldRevenue, newRevenue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(Coding newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Coding newCategory, NotificationChain msgs) {
		Coding oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Coding newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Coding newService, NotificationChain msgs) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getProgramCode() {
		if (programCode == null) {
			programCode = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__PROGRAM_CODE);
		}
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE, oldUnitPrice, newUnitPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(Decimal newPoints, NotificationChain msgs) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS, oldPoints, newPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUdi() {
		if (udi == null) {
			udi = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UDI);
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumber() {
		if (noteNumber == null) {
			noteNumber = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NOTE_NUMBER);
		}
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ExplanationOfBenefitAdjudication>(ExplanationOfBenefitAdjudication.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitSubDetail> getSubDetail() {
		if (subDetail == null) {
			subDetail = new EObjectContainmentEList<ExplanationOfBenefitSubDetail>(ExplanationOfBenefitSubDetail.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SUB_DETAIL);
		}
		return subDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE:
				return basicSetRevenue(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS:
				return basicSetPoints(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UDI:
				return ((InternalEList<?>)getUdi()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE:
				return getSequence();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE:
				return getRevenue();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY:
				return getCategory();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE:
				return getService();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__MODIFIER:
				return getModifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__PROGRAM_CODE:
				return getProgramCode();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY:
				return getQuantity();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR:
				return getFactor();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS:
				return getPoints();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET:
				return getNet();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UDI:
				return getUdi();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NOTE_NUMBER:
				return getNoteNumber();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SUB_DETAIL:
				return getSubDetail();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE:
				setRevenue((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY:
				setCategory((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__PROGRAM_CODE:
				getProgramCode().clear();
				getProgramCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UDI:
				getUdi().clear();
				getUdi().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NOTE_NUMBER:
				getNoteNumber().clear();
				getNoteNumber().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ExplanationOfBenefitAdjudication>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SUB_DETAIL:
				getSubDetail().clear();
				getSubDetail().addAll((Collection<? extends ExplanationOfBenefitSubDetail>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE:
				setRevenue((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY:
				setCategory((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE:
				setService((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__PROGRAM_CODE:
				getProgramCode().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET:
				setNet((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UDI:
				getUdi().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NOTE_NUMBER:
				getNoteNumber().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SUB_DETAIL:
				getSubDetail().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SEQUENCE:
				return sequence != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__REVENUE:
				return revenue != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__CATEGORY:
				return category != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SERVICE:
				return service != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__PROGRAM_CODE:
				return programCode != null && !programCode.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__QUANTITY:
				return quantity != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__FACTOR:
				return factor != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__POINTS:
				return points != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NET:
				return net != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__UDI:
				return udi != null && !udi.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__NOTE_NUMBER:
				return noteNumber != null && !noteNumber.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL__SUB_DETAIL:
				return subDetail != null && !subDetail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitDetailImpl
