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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireOption;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialBoolean <em>Initial Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialDecimal <em>Initial Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialInteger <em>Initial Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialDate <em>Initial Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialDateTime <em>Initial Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialInstant <em>Initial Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialString <em>Initial String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialUri <em>Initial Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialAttachment <em>Initial Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialCoding <em>Initial Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialQuantity <em>Initial Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitialReference <em>Initial Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireItemImpl extends BackboneElementImpl implements QuestionnaireItem {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> concept;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String prefix;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireItemType type;

	/**
	 * The cached value of the '{@link #getEnableWhen() <em>Enable When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireEnableWhen> enableWhen;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean repeats;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean readOnly;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer maxLength;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Reference options;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireOption> option;

	/**
	 * The cached value of the '{@link #getInitialBoolean() <em>Initial Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean initialBoolean;

	/**
	 * The cached value of the '{@link #getInitialDecimal() <em>Initial Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal initialDecimal;

	/**
	 * The cached value of the '{@link #getInitialInteger() <em>Initial Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer initialInteger;

	/**
	 * The cached value of the '{@link #getInitialDate() <em>Initial Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDate()
	 * @generated
	 * @ordered
	 */
	protected Date initialDate;

	/**
	 * The cached value of the '{@link #getInitialDateTime() <em>Initial Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime initialDateTime;

	/**
	 * The cached value of the '{@link #getInitialInstant() <em>Initial Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant initialInstant;

	/**
	 * The cached value of the '{@link #getInitialTime() <em>Initial Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime()
	 * @generated
	 * @ordered
	 */
	protected Time initialTime;

	/**
	 * The cached value of the '{@link #getInitialString() <em>Initial String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String initialString;

	/**
	 * The cached value of the '{@link #getInitialUri() <em>Initial Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialUri()
	 * @generated
	 * @ordered
	 */
	protected Uri initialUri;

	/**
	 * The cached value of the '{@link #getInitialAttachment() <em>Initial Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment initialAttachment;

	/**
	 * The cached value of the '{@link #getInitialCoding() <em>Initial Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding initialCoding;

	/**
	 * The cached value of the '{@link #getInitialQuantity() <em>Initial Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity initialQuantity;

	/**
	 * The cached value of the '{@link #getInitialReference() <em>Initial Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReference()
	 * @generated
	 * @ordered
	 */
	protected Reference initialReference;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.QUESTIONNAIRE_ITEM__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(org.hl7.fhir.String newPrefix, NotificationChain msgs) {
		org.hl7.fhir.String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(org.hl7.fhir.String newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__PREFIX, newPrefix, newPrefix));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(QuestionnaireItemType newType, NotificationChain msgs) {
		QuestionnaireItemType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QuestionnaireItemType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireEnableWhen> getEnableWhen() {
		if (enableWhen == null) {
			enableWhen = new EObjectContainmentEList<QuestionnaireEnableWhen>(QuestionnaireEnableWhen.class, this, FhirPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN);
		}
		return enableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeats(org.hl7.fhir.Boolean newRepeats, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__REPEATS, oldRepeats, newRepeats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeats(org.hl7.fhir.Boolean newRepeats) {
		if (newRepeats != repeats) {
			NotificationChain msgs = null;
			if (repeats != null)
				msgs = ((InternalEObject)repeats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__REPEATS, null, msgs);
			if (newRepeats != null)
				msgs = ((InternalEObject)newRepeats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__REPEATS, null, msgs);
			msgs = basicSetRepeats(newRepeats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__REPEATS, newRepeats, newRepeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadOnly(org.hl7.fhir.Boolean newReadOnly, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY, oldReadOnly, newReadOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(org.hl7.fhir.Boolean newReadOnly) {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY, newReadOnly, newReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(org.hl7.fhir.Integer newMaxLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, oldMaxLength, newMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(org.hl7.fhir.Integer newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Reference newOptions, NotificationChain msgs) {
		Reference oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Reference newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireOption> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<QuestionnaireOption>(QuestionnaireOption.class, this, FhirPackage.QUESTIONNAIRE_ITEM__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getInitialBoolean() {
		return initialBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialBoolean(org.hl7.fhir.Boolean newInitialBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInitialBoolean = initialBoolean;
		initialBoolean = newInitialBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN, oldInitialBoolean, newInitialBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialBoolean(org.hl7.fhir.Boolean newInitialBoolean) {
		if (newInitialBoolean != initialBoolean) {
			NotificationChain msgs = null;
			if (initialBoolean != null)
				msgs = ((InternalEObject)initialBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN, null, msgs);
			if (newInitialBoolean != null)
				msgs = ((InternalEObject)newInitialBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN, null, msgs);
			msgs = basicSetInitialBoolean(newInitialBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN, newInitialBoolean, newInitialBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getInitialDecimal() {
		return initialDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialDecimal(Decimal newInitialDecimal, NotificationChain msgs) {
		Decimal oldInitialDecimal = initialDecimal;
		initialDecimal = newInitialDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL, oldInitialDecimal, newInitialDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDecimal(Decimal newInitialDecimal) {
		if (newInitialDecimal != initialDecimal) {
			NotificationChain msgs = null;
			if (initialDecimal != null)
				msgs = ((InternalEObject)initialDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL, null, msgs);
			if (newInitialDecimal != null)
				msgs = ((InternalEObject)newInitialDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL, null, msgs);
			msgs = basicSetInitialDecimal(newInitialDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL, newInitialDecimal, newInitialDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getInitialInteger() {
		return initialInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialInteger(org.hl7.fhir.Integer newInitialInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldInitialInteger = initialInteger;
		initialInteger = newInitialInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER, oldInitialInteger, newInitialInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialInteger(org.hl7.fhir.Integer newInitialInteger) {
		if (newInitialInteger != initialInteger) {
			NotificationChain msgs = null;
			if (initialInteger != null)
				msgs = ((InternalEObject)initialInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER, null, msgs);
			if (newInitialInteger != null)
				msgs = ((InternalEObject)newInitialInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER, null, msgs);
			msgs = basicSetInitialInteger(newInitialInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER, newInitialInteger, newInitialInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInitialDate() {
		return initialDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialDate(Date newInitialDate, NotificationChain msgs) {
		Date oldInitialDate = initialDate;
		initialDate = newInitialDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE, oldInitialDate, newInitialDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDate(Date newInitialDate) {
		if (newInitialDate != initialDate) {
			NotificationChain msgs = null;
			if (initialDate != null)
				msgs = ((InternalEObject)initialDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE, null, msgs);
			if (newInitialDate != null)
				msgs = ((InternalEObject)newInitialDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE, null, msgs);
			msgs = basicSetInitialDate(newInitialDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE, newInitialDate, newInitialDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getInitialDateTime() {
		return initialDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialDateTime(DateTime newInitialDateTime, NotificationChain msgs) {
		DateTime oldInitialDateTime = initialDateTime;
		initialDateTime = newInitialDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME, oldInitialDateTime, newInitialDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDateTime(DateTime newInitialDateTime) {
		if (newInitialDateTime != initialDateTime) {
			NotificationChain msgs = null;
			if (initialDateTime != null)
				msgs = ((InternalEObject)initialDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME, null, msgs);
			if (newInitialDateTime != null)
				msgs = ((InternalEObject)newInitialDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME, null, msgs);
			msgs = basicSetInitialDateTime(newInitialDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME, newInitialDateTime, newInitialDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getInitialInstant() {
		return initialInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialInstant(Instant newInitialInstant, NotificationChain msgs) {
		Instant oldInitialInstant = initialInstant;
		initialInstant = newInitialInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT, oldInitialInstant, newInitialInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialInstant(Instant newInitialInstant) {
		if (newInitialInstant != initialInstant) {
			NotificationChain msgs = null;
			if (initialInstant != null)
				msgs = ((InternalEObject)initialInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT, null, msgs);
			if (newInitialInstant != null)
				msgs = ((InternalEObject)newInitialInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT, null, msgs);
			msgs = basicSetInitialInstant(newInitialInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT, newInitialInstant, newInitialInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getInitialTime() {
		return initialTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialTime(Time newInitialTime, NotificationChain msgs) {
		Time oldInitialTime = initialTime;
		initialTime = newInitialTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME, oldInitialTime, newInitialTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTime(Time newInitialTime) {
		if (newInitialTime != initialTime) {
			NotificationChain msgs = null;
			if (initialTime != null)
				msgs = ((InternalEObject)initialTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME, null, msgs);
			if (newInitialTime != null)
				msgs = ((InternalEObject)newInitialTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME, null, msgs);
			msgs = basicSetInitialTime(newInitialTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME, newInitialTime, newInitialTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getInitialString() {
		return initialString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialString(org.hl7.fhir.String newInitialString, NotificationChain msgs) {
		org.hl7.fhir.String oldInitialString = initialString;
		initialString = newInitialString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING, oldInitialString, newInitialString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialString(org.hl7.fhir.String newInitialString) {
		if (newInitialString != initialString) {
			NotificationChain msgs = null;
			if (initialString != null)
				msgs = ((InternalEObject)initialString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING, null, msgs);
			if (newInitialString != null)
				msgs = ((InternalEObject)newInitialString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING, null, msgs);
			msgs = basicSetInitialString(newInitialString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING, newInitialString, newInitialString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getInitialUri() {
		return initialUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialUri(Uri newInitialUri, NotificationChain msgs) {
		Uri oldInitialUri = initialUri;
		initialUri = newInitialUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI, oldInitialUri, newInitialUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialUri(Uri newInitialUri) {
		if (newInitialUri != initialUri) {
			NotificationChain msgs = null;
			if (initialUri != null)
				msgs = ((InternalEObject)initialUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI, null, msgs);
			if (newInitialUri != null)
				msgs = ((InternalEObject)newInitialUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI, null, msgs);
			msgs = basicSetInitialUri(newInitialUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI, newInitialUri, newInitialUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getInitialAttachment() {
		return initialAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialAttachment(Attachment newInitialAttachment, NotificationChain msgs) {
		Attachment oldInitialAttachment = initialAttachment;
		initialAttachment = newInitialAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT, oldInitialAttachment, newInitialAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialAttachment(Attachment newInitialAttachment) {
		if (newInitialAttachment != initialAttachment) {
			NotificationChain msgs = null;
			if (initialAttachment != null)
				msgs = ((InternalEObject)initialAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT, null, msgs);
			if (newInitialAttachment != null)
				msgs = ((InternalEObject)newInitialAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT, null, msgs);
			msgs = basicSetInitialAttachment(newInitialAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT, newInitialAttachment, newInitialAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getInitialCoding() {
		return initialCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialCoding(Coding newInitialCoding, NotificationChain msgs) {
		Coding oldInitialCoding = initialCoding;
		initialCoding = newInitialCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING, oldInitialCoding, newInitialCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCoding(Coding newInitialCoding) {
		if (newInitialCoding != initialCoding) {
			NotificationChain msgs = null;
			if (initialCoding != null)
				msgs = ((InternalEObject)initialCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING, null, msgs);
			if (newInitialCoding != null)
				msgs = ((InternalEObject)newInitialCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING, null, msgs);
			msgs = basicSetInitialCoding(newInitialCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING, newInitialCoding, newInitialCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getInitialQuantity() {
		return initialQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialQuantity(Quantity newInitialQuantity, NotificationChain msgs) {
		Quantity oldInitialQuantity = initialQuantity;
		initialQuantity = newInitialQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY, oldInitialQuantity, newInitialQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialQuantity(Quantity newInitialQuantity) {
		if (newInitialQuantity != initialQuantity) {
			NotificationChain msgs = null;
			if (initialQuantity != null)
				msgs = ((InternalEObject)initialQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY, null, msgs);
			if (newInitialQuantity != null)
				msgs = ((InternalEObject)newInitialQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY, null, msgs);
			msgs = basicSetInitialQuantity(newInitialQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY, newInitialQuantity, newInitialQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInitialReference() {
		return initialReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialReference(Reference newInitialReference, NotificationChain msgs) {
		Reference oldInitialReference = initialReference;
		initialReference = newInitialReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE, oldInitialReference, newInitialReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialReference(Reference newInitialReference) {
		if (newInitialReference != initialReference) {
			NotificationChain msgs = null;
			if (initialReference != null)
				msgs = ((InternalEObject)initialReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE, null, msgs);
			if (newInitialReference != null)
				msgs = ((InternalEObject)newInitialReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE, null, msgs);
			msgs = basicSetInitialReference(newInitialReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE, newInitialReference, newInitialReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<QuestionnaireItem>(QuestionnaireItem.class, this, FhirPackage.QUESTIONNAIRE_ITEM__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return basicSetPrefix(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return ((InternalEList<?>)getEnableWhen()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return basicSetRequired(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return basicSetRepeats(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				return basicSetOptions(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN:
				return basicSetInitialBoolean(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL:
				return basicSetInitialDecimal(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER:
				return basicSetInitialInteger(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE:
				return basicSetInitialDate(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME:
				return basicSetInitialDateTime(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT:
				return basicSetInitialInstant(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME:
				return basicSetInitialTime(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING:
				return basicSetInitialString(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI:
				return basicSetInitialUri(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT:
				return basicSetInitialAttachment(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING:
				return basicSetInitialCoding(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY:
				return basicSetInitialQuantity(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE:
				return basicSetInitialReference(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ITEM__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return getLinkId();
			case FhirPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				return getConcept();
			case FhirPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return getPrefix();
			case FhirPackage.QUESTIONNAIRE_ITEM__TEXT:
				return getText();
			case FhirPackage.QUESTIONNAIRE_ITEM__TYPE:
				return getType();
			case FhirPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return getEnableWhen();
			case FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return getRequired();
			case FhirPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return getRepeats();
			case FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return getReadOnly();
			case FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return getMaxLength();
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				return getOptions();
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTION:
				return getOption();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN:
				return getInitialBoolean();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL:
				return getInitialDecimal();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER:
				return getInitialInteger();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE:
				return getInitialDate();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME:
				return getInitialDateTime();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT:
				return getInitialInstant();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME:
				return getInitialTime();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING:
				return getInitialString();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI:
				return getInitialUri();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT:
				return getInitialAttachment();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING:
				return getInitialCoding();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY:
				return getInitialQuantity();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE:
				return getInitialReference();
			case FhirPackage.QUESTIONNAIRE_ITEM__ITEM:
				return getItem();
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
			case FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((QuestionnaireItemType)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhen().clear();
				getEnableWhen().addAll((Collection<? extends QuestionnaireEnableWhen>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				setOptions((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends QuestionnaireOption>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN:
				setInitialBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL:
				setInitialDecimal((Decimal)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER:
				setInitialInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE:
				setInitialDate((Date)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME:
				setInitialDateTime((DateTime)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT:
				setInitialInstant((Instant)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME:
				setInitialTime((Time)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING:
				setInitialString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI:
				setInitialUri((Uri)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT:
				setInitialAttachment((Attachment)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING:
				setInitialCoding((Coding)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY:
				setInitialQuantity((Quantity)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE:
				setInitialReference((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends QuestionnaireItem>)newValue);
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
			case FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((QuestionnaireItemType)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhen().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				setOptions((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTION:
				getOption().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN:
				setInitialBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL:
				setInitialDecimal((Decimal)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER:
				setInitialInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE:
				setInitialDate((Date)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME:
				setInitialDateTime((DateTime)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT:
				setInitialInstant((Instant)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME:
				setInitialTime((Time)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING:
				setInitialString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI:
				setInitialUri((Uri)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT:
				setInitialAttachment((Attachment)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING:
				setInitialCoding((Coding)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY:
				setInitialQuantity((Quantity)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE:
				setInitialReference((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItem().clear();
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
			case FhirPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return linkId != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return prefix != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__TEXT:
				return text != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__TYPE:
				return type != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return enableWhen != null && !enableWhen.isEmpty();
			case FhirPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return required != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return repeats != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return readOnly != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return maxLength != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				return options != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__OPTION:
				return option != null && !option.isEmpty();
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_BOOLEAN:
				return initialBoolean != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DECIMAL:
				return initialDecimal != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INTEGER:
				return initialInteger != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE:
				return initialDate != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_DATE_TIME:
				return initialDateTime != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_INSTANT:
				return initialInstant != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_TIME:
				return initialTime != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_STRING:
				return initialString != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_URI:
				return initialUri != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_ATTACHMENT:
				return initialAttachment != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_CODING:
				return initialCoding != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_QUANTITY:
				return initialQuantity != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__INITIAL_REFERENCE:
				return initialReference != null;
			case FhirPackage.QUESTIONNAIRE_ITEM__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemImpl
