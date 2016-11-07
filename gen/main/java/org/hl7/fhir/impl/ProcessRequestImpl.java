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

import org.hl7.fhir.ActionList;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessRequestStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getResponseIdentifier <em>Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getResponseReference <em>Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getNullify <em>Nullify</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequestImpl extends DomainResourceImpl implements ProcessRequest {
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
	protected ProcessRequestStatus status;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionList action;

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
	 * The cached value of the '{@link #getNullify() <em>Nullify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullify()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean nullify;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String reference;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessRequestItem> item;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> exclude;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcessRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionList newAction, NotificationChain msgs) {
		ActionList oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionList newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCESS_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ProcessRequestStatus newStatus, NotificationChain msgs) {
		ProcessRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcessRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RULESET, oldRuleset, newRuleset);
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
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RULESET, newRuleset, newRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
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
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER, oldTargetIdentifier, newTargetIdentifier);
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
				msgs = ((InternalEObject)targetIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER, null, msgs);
			if (newTargetIdentifier != null)
				msgs = ((InternalEObject)newTargetIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER, null, msgs);
			msgs = basicSetTargetIdentifier(newTargetIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER, newTargetIdentifier, newTargetIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE, oldTargetReference, newTargetReference);
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
				msgs = ((InternalEObject)targetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE, null, msgs);
			if (newTargetReference != null)
				msgs = ((InternalEObject)newTargetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE, null, msgs);
			msgs = basicSetTargetReference(newTargetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE, newTargetReference, newTargetReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER, oldProviderIdentifier, newProviderIdentifier);
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
				msgs = ((InternalEObject)providerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER, null, msgs);
			if (newProviderIdentifier != null)
				msgs = ((InternalEObject)newProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetProviderIdentifier(newProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER, newProviderIdentifier, newProviderIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE, oldProviderReference, newProviderReference);
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
				msgs = ((InternalEObject)providerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE, null, msgs);
			if (newProviderReference != null)
				msgs = ((InternalEObject)newProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetProviderReference(newProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE, newProviderReference, newProviderReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER, oldOrganizationIdentifier, newOrganizationIdentifier);
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
				msgs = ((InternalEObject)organizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER, null, msgs);
			if (newOrganizationIdentifier != null)
				msgs = ((InternalEObject)newOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetOrganizationIdentifier(newOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER, newOrganizationIdentifier, newOrganizationIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE, oldOrganizationReference, newOrganizationReference);
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
				msgs = ((InternalEObject)organizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE, null, msgs);
			if (newOrganizationReference != null)
				msgs = ((InternalEObject)newOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetOrganizationReference(newOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE, newOrganizationReference, newOrganizationReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER, oldRequestIdentifier, newRequestIdentifier);
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
				msgs = ((InternalEObject)requestIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER, null, msgs);
			if (newRequestIdentifier != null)
				msgs = ((InternalEObject)newRequestIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER, null, msgs);
			msgs = basicSetRequestIdentifier(newRequestIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER, newRequestIdentifier, newRequestIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE, oldRequestReference, newRequestReference);
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
				msgs = ((InternalEObject)requestReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE, null, msgs);
			if (newRequestReference != null)
				msgs = ((InternalEObject)newRequestReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE, null, msgs);
			msgs = basicSetRequestReference(newRequestReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE, newRequestReference, newRequestReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER, oldResponseIdentifier, newResponseIdentifier);
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
				msgs = ((InternalEObject)responseIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER, null, msgs);
			if (newResponseIdentifier != null)
				msgs = ((InternalEObject)newResponseIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER, null, msgs);
			msgs = basicSetResponseIdentifier(newResponseIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER, newResponseIdentifier, newResponseIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE, oldResponseReference, newResponseReference);
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
				msgs = ((InternalEObject)responseReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE, null, msgs);
			if (newResponseReference != null)
				msgs = ((InternalEObject)newResponseReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE, null, msgs);
			msgs = basicSetResponseReference(newResponseReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE, newResponseReference, newResponseReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getNullify() {
		return nullify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullify(org.hl7.fhir.Boolean newNullify, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNullify = nullify;
		nullify = newNullify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__NULLIFY, oldNullify, newNullify);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullify(org.hl7.fhir.Boolean newNullify) {
		if (newNullify != nullify) {
			NotificationChain msgs = null;
			if (nullify != null)
				msgs = ((InternalEObject)nullify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__NULLIFY, null, msgs);
			if (newNullify != null)
				msgs = ((InternalEObject)newNullify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__NULLIFY, null, msgs);
			msgs = basicSetNullify(newNullify, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__NULLIFY, newNullify, newNullify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(org.hl7.fhir.String newReference, NotificationChain msgs) {
		org.hl7.fhir.String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(org.hl7.fhir.String newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessRequestItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ProcessRequestItem>(ProcessRequestItem.class, this, FhirPackage.PROCESS_REQUEST__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.PROCESS_REQUEST__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.PROCESS_REQUEST__EXCLUDE);
		}
		return exclude;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCESS_REQUEST__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ACTION:
				return basicSetAction(null, msgs);
			case FhirPackage.PROCESS_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER:
				return basicSetTargetIdentifier(null, msgs);
			case FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE:
				return basicSetTargetReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER:
				return basicSetProviderIdentifier(null, msgs);
			case FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE:
				return basicSetProviderReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER:
				return basicSetOrganizationIdentifier(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE:
				return basicSetOrganizationReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER:
				return basicSetRequestIdentifier(null, msgs);
			case FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE:
				return basicSetRequestReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER:
				return basicSetResponseIdentifier(null, msgs);
			case FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE:
				return basicSetResponseReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				return basicSetNullify(null, msgs);
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCESS_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.PROCESS_REQUEST__RULESET:
				return getRuleset();
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.PROCESS_REQUEST__ACTION:
				return getAction();
			case FhirPackage.PROCESS_REQUEST__CREATED:
				return getCreated();
			case FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER:
				return getTargetIdentifier();
			case FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE:
				return getTargetReference();
			case FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER:
				return getProviderIdentifier();
			case FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE:
				return getProviderReference();
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER:
				return getOrganizationIdentifier();
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE:
				return getOrganizationReference();
			case FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE:
				return getRequestReference();
			case FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER:
				return getResponseIdentifier();
			case FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE:
				return getResponseReference();
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				return getNullify();
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				return getReference();
			case FhirPackage.PROCESS_REQUEST__ITEM:
				return getItem();
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				return getInclude();
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				return getExclude();
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				return getPeriod();
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
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__STATUS:
				setStatus((ProcessRequestStatus)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ACTION:
				setAction((ActionList)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE:
				setTargetReference((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE:
				setProviderReference((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE:
				setRequestReference((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER:
				setResponseIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE:
				setResponseReference((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				setNullify((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				setReference((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ProcessRequestItem>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__STATUS:
				setStatus((ProcessRequestStatus)null);
				return;
			case FhirPackage.PROCESS_REQUEST__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ACTION:
				setAction((ActionList)null);
				return;
			case FhirPackage.PROCESS_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)null);
				return;
			case FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE:
				setTargetReference((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE:
				setProviderReference((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)null);
				return;
			case FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE:
				setRequestReference((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER:
				setResponseIdentifier((Identifier)null);
				return;
			case FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE:
				setResponseReference((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				setNullify((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				setReference((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ITEM:
				getItem().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				getInclude().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				getExclude().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				setPeriod((Period)null);
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
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCESS_REQUEST__STATUS:
				return status != null;
			case FhirPackage.PROCESS_REQUEST__RULESET:
				return ruleset != null;
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.PROCESS_REQUEST__ACTION:
				return action != null;
			case FhirPackage.PROCESS_REQUEST__CREATED:
				return created != null;
			case FhirPackage.PROCESS_REQUEST__TARGET_IDENTIFIER:
				return targetIdentifier != null;
			case FhirPackage.PROCESS_REQUEST__TARGET_REFERENCE:
				return targetReference != null;
			case FhirPackage.PROCESS_REQUEST__PROVIDER_IDENTIFIER:
				return providerIdentifier != null;
			case FhirPackage.PROCESS_REQUEST__PROVIDER_REFERENCE:
				return providerReference != null;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_IDENTIFIER:
				return organizationIdentifier != null;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION_REFERENCE:
				return organizationReference != null;
			case FhirPackage.PROCESS_REQUEST__REQUEST_IDENTIFIER:
				return requestIdentifier != null;
			case FhirPackage.PROCESS_REQUEST__REQUEST_REFERENCE:
				return requestReference != null;
			case FhirPackage.PROCESS_REQUEST__RESPONSE_IDENTIFIER:
				return responseIdentifier != null;
			case FhirPackage.PROCESS_REQUEST__RESPONSE_REFERENCE:
				return responseReference != null;
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				return nullify != null;
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				return reference != null;
			case FhirPackage.PROCESS_REQUEST__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				return include != null && !include.isEmpty();
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequestImpl
