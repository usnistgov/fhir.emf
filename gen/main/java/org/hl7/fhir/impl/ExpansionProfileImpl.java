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

import org.hl7.fhir.Code;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.ExpansionProfileCodeSystem;
import org.hl7.fhir.ExpansionProfileContact;
import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getIncludeDesignations <em>Include Designations</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getIncludeDefinition <em>Include Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getIncludeInactive <em>Include Inactive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getExcludeNested <em>Exclude Nested</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getExcludeNotForUI <em>Exclude Not For UI</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getDisplayLanguage <em>Display Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExpansionProfileImpl#getLimitedExpansion <em>Limited Expansion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileImpl extends DomainResourceImpl implements ExpansionProfile {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConformanceResourceStatus status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionProfileContact> contact;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileCodeSystem codeSystem;

	/**
	 * The cached value of the '{@link #getIncludeDesignations() <em>Include Designations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDesignations()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean includeDesignations;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileDesignation designation;

	/**
	 * The cached value of the '{@link #getIncludeDefinition() <em>Include Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean includeDefinition;

	/**
	 * The cached value of the '{@link #getIncludeInactive() <em>Include Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeInactive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean includeInactive;

	/**
	 * The cached value of the '{@link #getExcludeNested() <em>Exclude Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNested()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean excludeNested;

	/**
	 * The cached value of the '{@link #getExcludeNotForUI() <em>Exclude Not For UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNotForUI()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean excludeNotForUI;

	/**
	 * The cached value of the '{@link #getExcludePostCoordinated() <em>Exclude Post Coordinated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePostCoordinated()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean excludePostCoordinated;

	/**
	 * The cached value of the '{@link #getDisplayLanguage() <em>Display Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code displayLanguage;

	/**
	 * The cached value of the '{@link #getLimitedExpansion() <em>Limited Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedExpansion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean limitedExpansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExpansionProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConformanceResourceStatus newStatus, NotificationChain msgs) {
		ConformanceResourceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConformanceResourceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionProfileContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ExpansionProfileContact>(ExpansionProfileContact.class, this, FhirPackage.EXPANSION_PROFILE__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystem getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(ExpansionProfileCodeSystem newCodeSystem, NotificationChain msgs) {
		ExpansionProfileCodeSystem oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM, oldCodeSystem, newCodeSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(ExpansionProfileCodeSystem newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null)
				msgs = ((InternalEObject)codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM, null, msgs);
			if (newCodeSystem != null)
				msgs = ((InternalEObject)newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM, null, msgs);
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM, newCodeSystem, newCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIncludeDesignations() {
		return includeDesignations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeDesignations(org.hl7.fhir.Boolean newIncludeDesignations, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIncludeDesignations = includeDesignations;
		includeDesignations = newIncludeDesignations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, oldIncludeDesignations, newIncludeDesignations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDesignations(org.hl7.fhir.Boolean newIncludeDesignations) {
		if (newIncludeDesignations != includeDesignations) {
			NotificationChain msgs = null;
			if (includeDesignations != null)
				msgs = ((InternalEObject)includeDesignations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, null, msgs);
			if (newIncludeDesignations != null)
				msgs = ((InternalEObject)newIncludeDesignations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, null, msgs);
			msgs = basicSetIncludeDesignations(newIncludeDesignations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, newIncludeDesignations, newIncludeDesignations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignation(ExpansionProfileDesignation newDesignation, NotificationChain msgs) {
		ExpansionProfileDesignation oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DESIGNATION, oldDesignation, newDesignation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(ExpansionProfileDesignation newDesignation) {
		if (newDesignation != designation) {
			NotificationChain msgs = null;
			if (designation != null)
				msgs = ((InternalEObject)designation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DESIGNATION, null, msgs);
			if (newDesignation != null)
				msgs = ((InternalEObject)newDesignation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DESIGNATION, null, msgs);
			msgs = basicSetDesignation(newDesignation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DESIGNATION, newDesignation, newDesignation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIncludeDefinition() {
		return includeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeDefinition(org.hl7.fhir.Boolean newIncludeDefinition, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIncludeDefinition = includeDefinition;
		includeDefinition = newIncludeDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, oldIncludeDefinition, newIncludeDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDefinition(org.hl7.fhir.Boolean newIncludeDefinition) {
		if (newIncludeDefinition != includeDefinition) {
			NotificationChain msgs = null;
			if (includeDefinition != null)
				msgs = ((InternalEObject)includeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, null, msgs);
			if (newIncludeDefinition != null)
				msgs = ((InternalEObject)newIncludeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, null, msgs);
			msgs = basicSetIncludeDefinition(newIncludeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, newIncludeDefinition, newIncludeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIncludeInactive() {
		return includeInactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeInactive(org.hl7.fhir.Boolean newIncludeInactive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIncludeInactive = includeInactive;
		includeInactive = newIncludeInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE, oldIncludeInactive, newIncludeInactive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeInactive(org.hl7.fhir.Boolean newIncludeInactive) {
		if (newIncludeInactive != includeInactive) {
			NotificationChain msgs = null;
			if (includeInactive != null)
				msgs = ((InternalEObject)includeInactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE, null, msgs);
			if (newIncludeInactive != null)
				msgs = ((InternalEObject)newIncludeInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE, null, msgs);
			msgs = basicSetIncludeInactive(newIncludeInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE, newIncludeInactive, newIncludeInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExcludeNested() {
		return excludeNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeNested(org.hl7.fhir.Boolean newExcludeNested, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExcludeNested = excludeNested;
		excludeNested = newExcludeNested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED, oldExcludeNested, newExcludeNested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeNested(org.hl7.fhir.Boolean newExcludeNested) {
		if (newExcludeNested != excludeNested) {
			NotificationChain msgs = null;
			if (excludeNested != null)
				msgs = ((InternalEObject)excludeNested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED, null, msgs);
			if (newExcludeNested != null)
				msgs = ((InternalEObject)newExcludeNested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED, null, msgs);
			msgs = basicSetExcludeNested(newExcludeNested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED, newExcludeNested, newExcludeNested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExcludeNotForUI() {
		return excludeNotForUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeNotForUI(org.hl7.fhir.Boolean newExcludeNotForUI, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExcludeNotForUI = excludeNotForUI;
		excludeNotForUI = newExcludeNotForUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, oldExcludeNotForUI, newExcludeNotForUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeNotForUI(org.hl7.fhir.Boolean newExcludeNotForUI) {
		if (newExcludeNotForUI != excludeNotForUI) {
			NotificationChain msgs = null;
			if (excludeNotForUI != null)
				msgs = ((InternalEObject)excludeNotForUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, null, msgs);
			if (newExcludeNotForUI != null)
				msgs = ((InternalEObject)newExcludeNotForUI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, null, msgs);
			msgs = basicSetExcludeNotForUI(newExcludeNotForUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, newExcludeNotForUI, newExcludeNotForUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExcludePostCoordinated() {
		return excludePostCoordinated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludePostCoordinated(org.hl7.fhir.Boolean newExcludePostCoordinated, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExcludePostCoordinated = excludePostCoordinated;
		excludePostCoordinated = newExcludePostCoordinated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, oldExcludePostCoordinated, newExcludePostCoordinated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludePostCoordinated(org.hl7.fhir.Boolean newExcludePostCoordinated) {
		if (newExcludePostCoordinated != excludePostCoordinated) {
			NotificationChain msgs = null;
			if (excludePostCoordinated != null)
				msgs = ((InternalEObject)excludePostCoordinated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, null, msgs);
			if (newExcludePostCoordinated != null)
				msgs = ((InternalEObject)newExcludePostCoordinated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, null, msgs);
			msgs = basicSetExcludePostCoordinated(newExcludePostCoordinated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, newExcludePostCoordinated, newExcludePostCoordinated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDisplayLanguage() {
		return displayLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayLanguage(Code newDisplayLanguage, NotificationChain msgs) {
		Code oldDisplayLanguage = displayLanguage;
		displayLanguage = newDisplayLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, oldDisplayLanguage, newDisplayLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLanguage(Code newDisplayLanguage) {
		if (newDisplayLanguage != displayLanguage) {
			NotificationChain msgs = null;
			if (displayLanguage != null)
				msgs = ((InternalEObject)displayLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, null, msgs);
			if (newDisplayLanguage != null)
				msgs = ((InternalEObject)newDisplayLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, null, msgs);
			msgs = basicSetDisplayLanguage(newDisplayLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, newDisplayLanguage, newDisplayLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getLimitedExpansion() {
		return limitedExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitedExpansion(org.hl7.fhir.Boolean newLimitedExpansion, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldLimitedExpansion = limitedExpansion;
		limitedExpansion = newLimitedExpansion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION, oldLimitedExpansion, newLimitedExpansion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitedExpansion(org.hl7.fhir.Boolean newLimitedExpansion) {
		if (newLimitedExpansion != limitedExpansion) {
			NotificationChain msgs = null;
			if (limitedExpansion != null)
				msgs = ((InternalEObject)limitedExpansion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION, null, msgs);
			if (newLimitedExpansion != null)
				msgs = ((InternalEObject)newLimitedExpansion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION, null, msgs);
			msgs = basicSetLimitedExpansion(newLimitedExpansion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION, newLimitedExpansion, newLimitedExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPANSION_PROFILE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPANSION_PROFILE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				return basicSetIncludeDesignations(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__DESIGNATION:
				return basicSetDesignation(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				return basicSetIncludeDefinition(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				return basicSetIncludeInactive(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				return basicSetExcludeNested(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				return basicSetExcludeNotForUI(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				return basicSetExcludePostCoordinated(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				return basicSetDisplayLanguage(null, msgs);
			case FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				return basicSetLimitedExpansion(null, msgs);
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
			case FhirPackage.EXPANSION_PROFILE__URL:
				return getUrl();
			case FhirPackage.EXPANSION_PROFILE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EXPANSION_PROFILE__VERSION:
				return getVersion();
			case FhirPackage.EXPANSION_PROFILE__NAME:
				return getName();
			case FhirPackage.EXPANSION_PROFILE__STATUS:
				return getStatus();
			case FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.EXPANSION_PROFILE__PUBLISHER:
				return getPublisher();
			case FhirPackage.EXPANSION_PROFILE__CONTACT:
				return getContact();
			case FhirPackage.EXPANSION_PROFILE__DATE:
				return getDate();
			case FhirPackage.EXPANSION_PROFILE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				return getIncludeDesignations();
			case FhirPackage.EXPANSION_PROFILE__DESIGNATION:
				return getDesignation();
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				return getIncludeDefinition();
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				return getIncludeInactive();
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				return getExcludeNested();
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				return getExcludeNotForUI();
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				return getExcludePostCoordinated();
			case FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				return getDisplayLanguage();
			case FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				return getLimitedExpansion();
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
			case FhirPackage.EXPANSION_PROFILE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__STATUS:
				setStatus((ConformanceResourceStatus)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ExpansionProfileContact>)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM:
				setCodeSystem((ExpansionProfileCodeSystem)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				setIncludeDesignations((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__DESIGNATION:
				setDesignation((ExpansionProfileDesignation)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				setIncludeDefinition((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				setIncludeInactive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				setExcludeNested((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				setExcludeNotForUI((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				setExcludePostCoordinated((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				setDisplayLanguage((Code)newValue);
				return;
			case FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				setLimitedExpansion((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.EXPANSION_PROFILE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__STATUS:
				setStatus((ConformanceResourceStatus)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.EXPANSION_PROFILE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM:
				setCodeSystem((ExpansionProfileCodeSystem)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				setIncludeDesignations((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__DESIGNATION:
				setDesignation((ExpansionProfileDesignation)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				setIncludeDefinition((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				setIncludeInactive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				setExcludeNested((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				setExcludeNotForUI((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				setExcludePostCoordinated((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				setDisplayLanguage((Code)null);
				return;
			case FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				setLimitedExpansion((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.EXPANSION_PROFILE__URL:
				return url != null;
			case FhirPackage.EXPANSION_PROFILE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.EXPANSION_PROFILE__VERSION:
				return version != null;
			case FhirPackage.EXPANSION_PROFILE__NAME:
				return name != null;
			case FhirPackage.EXPANSION_PROFILE__STATUS:
				return status != null;
			case FhirPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.EXPANSION_PROFILE__PUBLISHER:
				return publisher != null;
			case FhirPackage.EXPANSION_PROFILE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.EXPANSION_PROFILE__DATE:
				return date != null;
			case FhirPackage.EXPANSION_PROFILE__DESCRIPTION:
				return description != null;
			case FhirPackage.EXPANSION_PROFILE__CODE_SYSTEM:
				return codeSystem != null;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				return includeDesignations != null;
			case FhirPackage.EXPANSION_PROFILE__DESIGNATION:
				return designation != null;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				return includeDefinition != null;
			case FhirPackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				return includeInactive != null;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				return excludeNested != null;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				return excludeNotForUI != null;
			case FhirPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				return excludePostCoordinated != null;
			case FhirPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				return displayLanguage != null;
			case FhirPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				return limitedExpansion != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileImpl
