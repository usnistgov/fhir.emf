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
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasureScoring;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureType;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedResource;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRelatedResource <em>Related Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRiskAdjustment <em>Risk Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRateAggregation <em>Rate Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends DomainResourceImpl implements Measure {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String purpose;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String usage;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected Date publicationDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> coverage;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topic;

	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected EList<Contributor> contributor;

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
	protected EList<ContactDetail> contact;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

	/**
	 * The cached value of the '{@link #getRelatedResource() <em>Related Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedResource> relatedResource;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> library;

	/**
	 * The cached value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
	protected Markdown disclaimer;

	/**
	 * The cached value of the '{@link #getScoring() <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoring()
	 * @generated
	 * @ordered
	 */
	protected MeasureScoring scoring;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> type;

	/**
	 * The cached value of the '{@link #getRiskAdjustment() <em>Risk Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAdjustment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String riskAdjustment;

	/**
	 * The cached value of the '{@link #getRateAggregation() <em>Rate Aggregation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAggregation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String rateAggregation;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected Markdown rationale;

	/**
	 * The cached value of the '{@link #getClinicalRecommendationStatement() <em>Clinical Recommendation Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalRecommendationStatement()
	 * @generated
	 * @ordered
	 */
	protected Markdown clinicalRecommendationStatement;

	/**
	 * The cached value of the '{@link #getImprovementNotation() <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovementNotation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String improvementNotation;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Markdown definition;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected Markdown guidance;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String set;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureGroup> group;

	/**
	 * The cached value of the '{@link #getSupplementalData() <em>Supplemental Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalData()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureSupplementalData> supplementalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEASURE__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(org.hl7.fhir.String newPurpose, NotificationChain msgs) {
		org.hl7.fhir.String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(org.hl7.fhir.String newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(org.hl7.fhir.String newUsage, NotificationChain msgs) {
		org.hl7.fhir.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(org.hl7.fhir.String newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(Date newPublicationDate, NotificationChain msgs) {
		Date oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PUBLICATION_DATE, oldPublicationDate, newPublicationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(Date newPublicationDate) {
		if (newPublicationDate != publicationDate) {
			NotificationChain msgs = null;
			if (publicationDate != null)
				msgs = ((InternalEObject)publicationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PUBLICATION_DATE, null, msgs);
			if (newPublicationDate != null)
				msgs = ((InternalEObject)newPublicationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PUBLICATION_DATE, null, msgs);
			msgs = basicSetPublicationDate(newPublicationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PUBLICATION_DATE, newPublicationDate, newPublicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.MEASURE__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEASURE__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contributor> getContributor() {
		if (contributor == null) {
			contributor = new EObjectContainmentEList<Contributor>(Contributor.class, this, FhirPackage.MEASURE__CONTRIBUTOR);
		}
		return contributor;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.MEASURE__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(org.hl7.fhir.String newCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(org.hl7.fhir.String newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedResource> getRelatedResource() {
		if (relatedResource == null) {
			relatedResource = new EObjectContainmentEList<RelatedResource>(RelatedResource.class, this, FhirPackage.MEASURE__RELATED_RESOURCE);
		}
		return relatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEASURE__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDisclaimer() {
		return disclaimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisclaimer(Markdown newDisclaimer, NotificationChain msgs) {
		Markdown oldDisclaimer = disclaimer;
		disclaimer = newDisclaimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DISCLAIMER, oldDisclaimer, newDisclaimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisclaimer(Markdown newDisclaimer) {
		if (newDisclaimer != disclaimer) {
			NotificationChain msgs = null;
			if (disclaimer != null)
				msgs = ((InternalEObject)disclaimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DISCLAIMER, null, msgs);
			if (newDisclaimer != null)
				msgs = ((InternalEObject)newDisclaimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DISCLAIMER, null, msgs);
			msgs = basicSetDisclaimer(newDisclaimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DISCLAIMER, newDisclaimer, newDisclaimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureScoring getScoring() {
		return scoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoring(MeasureScoring newScoring, NotificationChain msgs) {
		MeasureScoring oldScoring = scoring;
		scoring = newScoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SCORING, oldScoring, newScoring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoring(MeasureScoring newScoring) {
		if (newScoring != scoring) {
			NotificationChain msgs = null;
			if (scoring != null)
				msgs = ((InternalEObject)scoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SCORING, null, msgs);
			if (newScoring != null)
				msgs = ((InternalEObject)newScoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SCORING, null, msgs);
			msgs = basicSetScoring(newScoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SCORING, newScoring, newScoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, FhirPackage.MEASURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRiskAdjustment() {
		return riskAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAdjustment(org.hl7.fhir.String newRiskAdjustment, NotificationChain msgs) {
		org.hl7.fhir.String oldRiskAdjustment = riskAdjustment;
		riskAdjustment = newRiskAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RISK_ADJUSTMENT, oldRiskAdjustment, newRiskAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAdjustment(org.hl7.fhir.String newRiskAdjustment) {
		if (newRiskAdjustment != riskAdjustment) {
			NotificationChain msgs = null;
			if (riskAdjustment != null)
				msgs = ((InternalEObject)riskAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RISK_ADJUSTMENT, null, msgs);
			if (newRiskAdjustment != null)
				msgs = ((InternalEObject)newRiskAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RISK_ADJUSTMENT, null, msgs);
			msgs = basicSetRiskAdjustment(newRiskAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RISK_ADJUSTMENT, newRiskAdjustment, newRiskAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRateAggregation() {
		return rateAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateAggregation(org.hl7.fhir.String newRateAggregation, NotificationChain msgs) {
		org.hl7.fhir.String oldRateAggregation = rateAggregation;
		rateAggregation = newRateAggregation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATE_AGGREGATION, oldRateAggregation, newRateAggregation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateAggregation(org.hl7.fhir.String newRateAggregation) {
		if (newRateAggregation != rateAggregation) {
			NotificationChain msgs = null;
			if (rateAggregation != null)
				msgs = ((InternalEObject)rateAggregation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATE_AGGREGATION, null, msgs);
			if (newRateAggregation != null)
				msgs = ((InternalEObject)newRateAggregation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATE_AGGREGATION, null, msgs);
			msgs = basicSetRateAggregation(newRateAggregation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATE_AGGREGATION, newRateAggregation, newRateAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(Markdown newRationale, NotificationChain msgs) {
		Markdown oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATIONALE, oldRationale, newRationale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(Markdown newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getClinicalRecommendationStatement() {
		return clinicalRecommendationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalRecommendationStatement(Markdown newClinicalRecommendationStatement, NotificationChain msgs) {
		Markdown oldClinicalRecommendationStatement = clinicalRecommendationStatement;
		clinicalRecommendationStatement = newClinicalRecommendationStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, oldClinicalRecommendationStatement, newClinicalRecommendationStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalRecommendationStatement(Markdown newClinicalRecommendationStatement) {
		if (newClinicalRecommendationStatement != clinicalRecommendationStatement) {
			NotificationChain msgs = null;
			if (clinicalRecommendationStatement != null)
				msgs = ((InternalEObject)clinicalRecommendationStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, null, msgs);
			if (newClinicalRecommendationStatement != null)
				msgs = ((InternalEObject)newClinicalRecommendationStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, null, msgs);
			msgs = basicSetClinicalRecommendationStatement(newClinicalRecommendationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, newClinicalRecommendationStatement, newClinicalRecommendationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getImprovementNotation() {
		return improvementNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImprovementNotation(org.hl7.fhir.String newImprovementNotation, NotificationChain msgs) {
		org.hl7.fhir.String oldImprovementNotation = improvementNotation;
		improvementNotation = newImprovementNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__IMPROVEMENT_NOTATION, oldImprovementNotation, newImprovementNotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImprovementNotation(org.hl7.fhir.String newImprovementNotation) {
		if (newImprovementNotation != improvementNotation) {
			NotificationChain msgs = null;
			if (improvementNotation != null)
				msgs = ((InternalEObject)improvementNotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__IMPROVEMENT_NOTATION, null, msgs);
			if (newImprovementNotation != null)
				msgs = ((InternalEObject)newImprovementNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__IMPROVEMENT_NOTATION, null, msgs);
			msgs = basicSetImprovementNotation(newImprovementNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__IMPROVEMENT_NOTATION, newImprovementNotation, newImprovementNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Markdown newDefinition, NotificationChain msgs) {
		Markdown oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Markdown newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getGuidance() {
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuidance(Markdown newGuidance, NotificationChain msgs) {
		Markdown oldGuidance = guidance;
		guidance = newGuidance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__GUIDANCE, oldGuidance, newGuidance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuidance(Markdown newGuidance) {
		if (newGuidance != guidance) {
			NotificationChain msgs = null;
			if (guidance != null)
				msgs = ((InternalEObject)guidance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__GUIDANCE, null, msgs);
			if (newGuidance != null)
				msgs = ((InternalEObject)newGuidance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__GUIDANCE, null, msgs);
			msgs = basicSetGuidance(newGuidance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__GUIDANCE, newGuidance, newGuidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(org.hl7.fhir.String newSet, NotificationChain msgs) {
		org.hl7.fhir.String oldSet = set;
		set = newSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SET, oldSet, newSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(org.hl7.fhir.String newSet) {
		if (newSet != set) {
			NotificationChain msgs = null;
			if (set != null)
				msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SET, null, msgs);
			if (newSet != null)
				msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SET, null, msgs);
			msgs = basicSetSet(newSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SET, newSet, newSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<MeasureGroup>(MeasureGroup.class, this, FhirPackage.MEASURE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureSupplementalData> getSupplementalData() {
		if (supplementalData == null) {
			supplementalData = new EObjectContainmentEList<MeasureSupplementalData>(MeasureSupplementalData.class, this, FhirPackage.MEASURE__SUPPLEMENTAL_DATA);
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
			case FhirPackage.MEASURE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.MEASURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MEASURE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MEASURE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.MEASURE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEASURE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.MEASURE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEASURE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.MEASURE__USAGE:
				return basicSetUsage(null, msgs);
			case FhirPackage.MEASURE__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MEASURE__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__CONTRIBUTOR:
				return ((InternalEList<?>)getContributor()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.MEASURE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.MEASURE__RELATED_RESOURCE:
				return ((InternalEList<?>)getRelatedResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__DISCLAIMER:
				return basicSetDisclaimer(null, msgs);
			case FhirPackage.MEASURE__SCORING:
				return basicSetScoring(null, msgs);
			case FhirPackage.MEASURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				return basicSetRiskAdjustment(null, msgs);
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				return basicSetRateAggregation(null, msgs);
			case FhirPackage.MEASURE__RATIONALE:
				return basicSetRationale(null, msgs);
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return basicSetClinicalRecommendationStatement(null, msgs);
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				return basicSetImprovementNotation(null, msgs);
			case FhirPackage.MEASURE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.MEASURE__GUIDANCE:
				return basicSetGuidance(null, msgs);
			case FhirPackage.MEASURE__SET:
				return basicSetSet(null, msgs);
			case FhirPackage.MEASURE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
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
			case FhirPackage.MEASURE__URL:
				return getUrl();
			case FhirPackage.MEASURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEASURE__VERSION:
				return getVersion();
			case FhirPackage.MEASURE__NAME:
				return getName();
			case FhirPackage.MEASURE__TITLE:
				return getTitle();
			case FhirPackage.MEASURE__STATUS:
				return getStatus();
			case FhirPackage.MEASURE__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.MEASURE__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEASURE__PURPOSE:
				return getPurpose();
			case FhirPackage.MEASURE__USAGE:
				return getUsage();
			case FhirPackage.MEASURE__PUBLICATION_DATE:
				return getPublicationDate();
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MEASURE__COVERAGE:
				return getCoverage();
			case FhirPackage.MEASURE__TOPIC:
				return getTopic();
			case FhirPackage.MEASURE__CONTRIBUTOR:
				return getContributor();
			case FhirPackage.MEASURE__PUBLISHER:
				return getPublisher();
			case FhirPackage.MEASURE__CONTACT:
				return getContact();
			case FhirPackage.MEASURE__COPYRIGHT:
				return getCopyright();
			case FhirPackage.MEASURE__RELATED_RESOURCE:
				return getRelatedResource();
			case FhirPackage.MEASURE__LIBRARY:
				return getLibrary();
			case FhirPackage.MEASURE__DISCLAIMER:
				return getDisclaimer();
			case FhirPackage.MEASURE__SCORING:
				return getScoring();
			case FhirPackage.MEASURE__TYPE:
				return getType();
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				return getRiskAdjustment();
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				return getRateAggregation();
			case FhirPackage.MEASURE__RATIONALE:
				return getRationale();
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return getClinicalRecommendationStatement();
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				return getImprovementNotation();
			case FhirPackage.MEASURE__DEFINITION:
				return getDefinition();
			case FhirPackage.MEASURE__GUIDANCE:
				return getGuidance();
			case FhirPackage.MEASURE__SET:
				return getSet();
			case FhirPackage.MEASURE__GROUP:
				return getGroup();
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
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
			case FhirPackage.MEASURE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.MEASURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEASURE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.MEASURE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEASURE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__PURPOSE:
				setPurpose((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__USAGE:
				setUsage((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__PUBLICATION_DATE:
				setPublicationDate((Date)newValue);
				return;
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MEASURE__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.MEASURE__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEASURE__CONTRIBUTOR:
				getContributor().clear();
				getContributor().addAll((Collection<? extends Contributor>)newValue);
				return;
			case FhirPackage.MEASURE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.MEASURE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__RELATED_RESOURCE:
				getRelatedResource().clear();
				getRelatedResource().addAll((Collection<? extends RelatedResource>)newValue);
				return;
			case FhirPackage.MEASURE__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEASURE__DISCLAIMER:
				setDisclaimer((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__SCORING:
				setScoring((MeasureScoring)newValue);
				return;
			case FhirPackage.MEASURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				setRiskAdjustment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				setRateAggregation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__RATIONALE:
				setRationale((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				setClinicalRecommendationStatement((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				setImprovementNotation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__DEFINITION:
				setDefinition((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__GUIDANCE:
				setGuidance((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__SET:
				setSet((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends MeasureGroup>)newValue);
				return;
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
				getSupplementalData().addAll((Collection<? extends MeasureSupplementalData>)newValue);
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
			case FhirPackage.MEASURE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.MEASURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEASURE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.MEASURE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEASURE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__PURPOSE:
				setPurpose((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__USAGE:
				setUsage((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__PUBLICATION_DATE:
				setPublicationDate((Date)null);
				return;
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MEASURE__COVERAGE:
				getCoverage().clear();
				return;
			case FhirPackage.MEASURE__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.MEASURE__CONTRIBUTOR:
				getContributor().clear();
				return;
			case FhirPackage.MEASURE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.MEASURE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__RELATED_RESOURCE:
				getRelatedResource().clear();
				return;
			case FhirPackage.MEASURE__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.MEASURE__DISCLAIMER:
				setDisclaimer((Markdown)null);
				return;
			case FhirPackage.MEASURE__SCORING:
				setScoring((MeasureScoring)null);
				return;
			case FhirPackage.MEASURE__TYPE:
				getType().clear();
				return;
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				setRiskAdjustment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				setRateAggregation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__RATIONALE:
				setRationale((Markdown)null);
				return;
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				setClinicalRecommendationStatement((Markdown)null);
				return;
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				setImprovementNotation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__DEFINITION:
				setDefinition((Markdown)null);
				return;
			case FhirPackage.MEASURE__GUIDANCE:
				setGuidance((Markdown)null);
				return;
			case FhirPackage.MEASURE__SET:
				setSet((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__GROUP:
				getGroup().clear();
				return;
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
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
			case FhirPackage.MEASURE__URL:
				return url != null;
			case FhirPackage.MEASURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEASURE__VERSION:
				return version != null;
			case FhirPackage.MEASURE__NAME:
				return name != null;
			case FhirPackage.MEASURE__TITLE:
				return title != null;
			case FhirPackage.MEASURE__STATUS:
				return status != null;
			case FhirPackage.MEASURE__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.MEASURE__DESCRIPTION:
				return description != null;
			case FhirPackage.MEASURE__PURPOSE:
				return purpose != null;
			case FhirPackage.MEASURE__USAGE:
				return usage != null;
			case FhirPackage.MEASURE__PUBLICATION_DATE:
				return publicationDate != null;
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MEASURE__COVERAGE:
				return coverage != null && !coverage.isEmpty();
			case FhirPackage.MEASURE__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.MEASURE__CONTRIBUTOR:
				return contributor != null && !contributor.isEmpty();
			case FhirPackage.MEASURE__PUBLISHER:
				return publisher != null;
			case FhirPackage.MEASURE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.MEASURE__COPYRIGHT:
				return copyright != null;
			case FhirPackage.MEASURE__RELATED_RESOURCE:
				return relatedResource != null && !relatedResource.isEmpty();
			case FhirPackage.MEASURE__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.MEASURE__DISCLAIMER:
				return disclaimer != null;
			case FhirPackage.MEASURE__SCORING:
				return scoring != null;
			case FhirPackage.MEASURE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				return riskAdjustment != null;
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				return rateAggregation != null;
			case FhirPackage.MEASURE__RATIONALE:
				return rationale != null;
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return clinicalRecommendationStatement != null;
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				return improvementNotation != null;
			case FhirPackage.MEASURE__DEFINITION:
				return definition != null;
			case FhirPackage.MEASURE__GUIDANCE:
				return guidance != null;
			case FhirPackage.MEASURE__SET:
				return set != null;
			case FhirPackage.MEASURE__GROUP:
				return group != null && !group.isEmpty();
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return supplementalData != null && !supplementalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureImpl
