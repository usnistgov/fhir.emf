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
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentNoticeStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getResponseIdentifier <em>Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getResponseReference <em>Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentNoticeImpl#getStatusDate <em>Status Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentNoticeImpl extends DomainResourceImpl implements PaymentNotice {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PaymentNoticeStatus status;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getTargetIdentifier() <em>Target Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier targetIdentifier;

	/**
	 * The cached value of the '{@link #getTargetReference() <em>Target Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference targetReference;

	/**
	 * The cached value of the '{@link #getProviderIdentifier() <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier providerIdentifier;

	/**
	 * The cached value of the '{@link #getProviderReference() <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderReference()
	 * @generated
	 * @ordered
	 */
	protected Reference providerReference;

	/**
	 * The cached value of the '{@link #getOrganizationIdentifier() <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier organizationIdentifier;

	/**
	 * The cached value of the '{@link #getOrganizationReference() <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference organizationReference;

	/**
	 * The cached value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestIdentifier;

	/**
	 * The cached value of the '{@link #getRequestReference() <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestReference()
	 * @generated
	 * @ordered
	 */
	protected Reference requestReference;

	/**
	 * The cached value of the '{@link #getResponseIdentifier() <em>Response Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier responseIdentifier;

	/**
	 * The cached value of the '{@link #getResponseReference() <em>Response Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseReference()
	 * @generated
	 * @ordered
	 */
	protected Reference responseReference;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentStatus;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentNoticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentNotice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PAYMENT_NOTICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNoticeStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PaymentNoticeStatus newStatus, NotificationChain msgs) {
		PaymentNoticeStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PaymentNoticeStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(Coding newRuleset, NotificationChain msgs) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalRuleset(Coding newOriginalRuleset, NotificationChain msgs) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		if (newOriginalRuleset != originalRuleset) {
			NotificationChain msgs = null;
			if (originalRuleset != null)
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getTargetIdentifier() {
		return targetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetIdentifier(Identifier newTargetIdentifier, NotificationChain msgs) {
		Identifier oldTargetIdentifier = targetIdentifier;
		targetIdentifier = newTargetIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER, oldTargetIdentifier, newTargetIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIdentifier(Identifier newTargetIdentifier) {
		if (newTargetIdentifier != targetIdentifier) {
			NotificationChain msgs = null;
			if (targetIdentifier != null)
				msgs = ((InternalEObject)targetIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER, null, msgs);
			if (newTargetIdentifier != null)
				msgs = ((InternalEObject)newTargetIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER, null, msgs);
			msgs = basicSetTargetIdentifier(newTargetIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER, newTargetIdentifier, newTargetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTargetReference() {
		return targetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetReference(Reference newTargetReference, NotificationChain msgs) {
		Reference oldTargetReference = targetReference;
		targetReference = newTargetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE, oldTargetReference, newTargetReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetReference(Reference newTargetReference) {
		if (newTargetReference != targetReference) {
			NotificationChain msgs = null;
			if (targetReference != null)
				msgs = ((InternalEObject)targetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE, null, msgs);
			if (newTargetReference != null)
				msgs = ((InternalEObject)newTargetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE, null, msgs);
			msgs = basicSetTargetReference(newTargetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE, newTargetReference, newTargetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getProviderIdentifier() {
		return providerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderIdentifier(Identifier newProviderIdentifier, NotificationChain msgs) {
		Identifier oldProviderIdentifier = providerIdentifier;
		providerIdentifier = newProviderIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER, oldProviderIdentifier, newProviderIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderIdentifier(Identifier newProviderIdentifier) {
		if (newProviderIdentifier != providerIdentifier) {
			NotificationChain msgs = null;
			if (providerIdentifier != null)
				msgs = ((InternalEObject)providerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER, null, msgs);
			if (newProviderIdentifier != null)
				msgs = ((InternalEObject)newProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetProviderIdentifier(newProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER, newProviderIdentifier, newProviderIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProviderReference() {
		return providerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderReference(Reference newProviderReference, NotificationChain msgs) {
		Reference oldProviderReference = providerReference;
		providerReference = newProviderReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE, oldProviderReference, newProviderReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderReference(Reference newProviderReference) {
		if (newProviderReference != providerReference) {
			NotificationChain msgs = null;
			if (providerReference != null)
				msgs = ((InternalEObject)providerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE, null, msgs);
			if (newProviderReference != null)
				msgs = ((InternalEObject)newProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetProviderReference(newProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE, newProviderReference, newProviderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOrganizationIdentifier() {
		return organizationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationIdentifier(Identifier newOrganizationIdentifier, NotificationChain msgs) {
		Identifier oldOrganizationIdentifier = organizationIdentifier;
		organizationIdentifier = newOrganizationIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER, oldOrganizationIdentifier, newOrganizationIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationIdentifier(Identifier newOrganizationIdentifier) {
		if (newOrganizationIdentifier != organizationIdentifier) {
			NotificationChain msgs = null;
			if (organizationIdentifier != null)
				msgs = ((InternalEObject)organizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER, null, msgs);
			if (newOrganizationIdentifier != null)
				msgs = ((InternalEObject)newOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetOrganizationIdentifier(newOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER, newOrganizationIdentifier, newOrganizationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganizationReference() {
		return organizationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationReference(Reference newOrganizationReference, NotificationChain msgs) {
		Reference oldOrganizationReference = organizationReference;
		organizationReference = newOrganizationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE, oldOrganizationReference, newOrganizationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationReference(Reference newOrganizationReference) {
		if (newOrganizationReference != organizationReference) {
			NotificationChain msgs = null;
			if (organizationReference != null)
				msgs = ((InternalEObject)organizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE, null, msgs);
			if (newOrganizationReference != null)
				msgs = ((InternalEObject)newOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetOrganizationReference(newOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE, newOrganizationReference, newOrganizationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestIdentifier(Identifier newRequestIdentifier, NotificationChain msgs) {
		Identifier oldRequestIdentifier = requestIdentifier;
		requestIdentifier = newRequestIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER, oldRequestIdentifier, newRequestIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestIdentifier(Identifier newRequestIdentifier) {
		if (newRequestIdentifier != requestIdentifier) {
			NotificationChain msgs = null;
			if (requestIdentifier != null)
				msgs = ((InternalEObject)requestIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER, null, msgs);
			if (newRequestIdentifier != null)
				msgs = ((InternalEObject)newRequestIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER, null, msgs);
			msgs = basicSetRequestIdentifier(newRequestIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER, newRequestIdentifier, newRequestIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestReference() {
		return requestReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestReference(Reference newRequestReference, NotificationChain msgs) {
		Reference oldRequestReference = requestReference;
		requestReference = newRequestReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE, oldRequestReference, newRequestReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestReference(Reference newRequestReference) {
		if (newRequestReference != requestReference) {
			NotificationChain msgs = null;
			if (requestReference != null)
				msgs = ((InternalEObject)requestReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE, null, msgs);
			if (newRequestReference != null)
				msgs = ((InternalEObject)newRequestReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE, null, msgs);
			msgs = basicSetRequestReference(newRequestReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE, newRequestReference, newRequestReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getResponseIdentifier() {
		return responseIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseIdentifier(Identifier newResponseIdentifier, NotificationChain msgs) {
		Identifier oldResponseIdentifier = responseIdentifier;
		responseIdentifier = newResponseIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER, oldResponseIdentifier, newResponseIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseIdentifier(Identifier newResponseIdentifier) {
		if (newResponseIdentifier != responseIdentifier) {
			NotificationChain msgs = null;
			if (responseIdentifier != null)
				msgs = ((InternalEObject)responseIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER, null, msgs);
			if (newResponseIdentifier != null)
				msgs = ((InternalEObject)newResponseIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER, null, msgs);
			msgs = basicSetResponseIdentifier(newResponseIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER, newResponseIdentifier, newResponseIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResponseReference() {
		return responseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseReference(Reference newResponseReference, NotificationChain msgs) {
		Reference oldResponseReference = responseReference;
		responseReference = newResponseReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE, oldResponseReference, newResponseReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseReference(Reference newResponseReference) {
		if (newResponseReference != responseReference) {
			NotificationChain msgs = null;
			if (responseReference != null)
				msgs = ((InternalEObject)responseReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE, null, msgs);
			if (newResponseReference != null)
				msgs = ((InternalEObject)newResponseReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE, null, msgs);
			msgs = basicSetResponseReference(newResponseReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE, newResponseReference, newResponseReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentStatus(Coding newPaymentStatus, NotificationChain msgs) {
		Coding oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, oldPaymentStatus, newPaymentStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(Coding newPaymentStatus) {
		if (newPaymentStatus != paymentStatus) {
			NotificationChain msgs = null;
			if (paymentStatus != null)
				msgs = ((InternalEObject)paymentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, null, msgs);
			if (newPaymentStatus != null)
				msgs = ((InternalEObject)newPaymentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, null, msgs);
			msgs = basicSetPaymentStatus(newPaymentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS, newPaymentStatus, newPaymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(Date newStatusDate, NotificationChain msgs) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__STATUS_DATE, oldStatusDate, newStatusDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(Date newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_NOTICE__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_NOTICE__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_NOTICE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER:
				return basicSetTargetIdentifier(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE:
				return basicSetTargetReference(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER:
				return basicSetProviderIdentifier(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE:
				return basicSetProviderReference(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER:
				return basicSetOrganizationIdentifier(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE:
				return basicSetOrganizationReference(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER:
				return basicSetRequestIdentifier(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE:
				return basicSetRequestReference(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER:
				return basicSetResponseIdentifier(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE:
				return basicSetResponseReference(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return basicSetPaymentStatus(null, msgs);
			case FhirPackage.PAYMENT_NOTICE__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PAYMENT_NOTICE__STATUS:
				return getStatus();
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				return getRuleset();
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				return getCreated();
			case FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER:
				return getTargetIdentifier();
			case FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE:
				return getTargetReference();
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER:
				return getProviderIdentifier();
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE:
				return getProviderReference();
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER:
				return getOrganizationIdentifier();
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE:
				return getOrganizationReference();
			case FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE:
				return getRequestReference();
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER:
				return getResponseIdentifier();
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE:
				return getResponseReference();
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return getPaymentStatus();
			case FhirPackage.PAYMENT_NOTICE__STATUS_DATE:
				return getStatusDate();
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__STATUS:
				setStatus((PaymentNoticeStatus)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE:
				setTargetReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE:
				setProviderReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE:
				setRequestReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER:
				setResponseIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE:
				setResponseReference((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_NOTICE__STATUS_DATE:
				setStatusDate((Date)newValue);
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PAYMENT_NOTICE__STATUS:
				setStatus((PaymentNoticeStatus)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE:
				setTargetReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE:
				setProviderReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE:
				setRequestReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER:
				setResponseIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE:
				setResponseReference((Reference)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((Coding)null);
				return;
			case FhirPackage.PAYMENT_NOTICE__STATUS_DATE:
				setStatusDate((Date)null);
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
			case FhirPackage.PAYMENT_NOTICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PAYMENT_NOTICE__STATUS:
				return status != null;
			case FhirPackage.PAYMENT_NOTICE__RULESET:
				return ruleset != null;
			case FhirPackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.PAYMENT_NOTICE__CREATED:
				return created != null;
			case FhirPackage.PAYMENT_NOTICE__TARGET_IDENTIFIER:
				return targetIdentifier != null;
			case FhirPackage.PAYMENT_NOTICE__TARGET_REFERENCE:
				return targetReference != null;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_IDENTIFIER:
				return providerIdentifier != null;
			case FhirPackage.PAYMENT_NOTICE__PROVIDER_REFERENCE:
				return providerReference != null;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_IDENTIFIER:
				return organizationIdentifier != null;
			case FhirPackage.PAYMENT_NOTICE__ORGANIZATION_REFERENCE:
				return organizationReference != null;
			case FhirPackage.PAYMENT_NOTICE__REQUEST_IDENTIFIER:
				return requestIdentifier != null;
			case FhirPackage.PAYMENT_NOTICE__REQUEST_REFERENCE:
				return requestReference != null;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_IDENTIFIER:
				return responseIdentifier != null;
			case FhirPackage.PAYMENT_NOTICE__RESPONSE_REFERENCE:
				return responseReference != null;
			case FhirPackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return paymentStatus != null;
			case FhirPackage.PAYMENT_NOTICE__STATUS_DATE:
				return statusDate != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentNoticeImpl
