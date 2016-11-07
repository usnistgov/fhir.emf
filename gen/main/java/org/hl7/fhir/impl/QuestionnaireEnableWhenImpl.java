/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Enable When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getHasAnswer <em>Has Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerBoolean <em>Answer Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerDecimal <em>Answer Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerInteger <em>Answer Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerDate <em>Answer Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerDateTime <em>Answer Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerInstant <em>Answer Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerTime <em>Answer Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerString <em>Answer String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerUri <em>Answer Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerAttachment <em>Answer Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerCoding <em>Answer Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerQuantity <em>Answer Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireEnableWhenImpl#getAnswerReference <em>Answer Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireEnableWhenImpl extends BackboneElementImpl implements QuestionnaireEnableWhen {
	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String question;

	/**
	 * The cached value of the '{@link #getHasAnswer() <em>Has Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAnswer()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean hasAnswer;

	/**
	 * The cached value of the '{@link #getAnswerBoolean() <em>Answer Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean answerBoolean;

	/**
	 * The cached value of the '{@link #getAnswerDecimal() <em>Answer Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal answerDecimal;

	/**
	 * The cached value of the '{@link #getAnswerInteger() <em>Answer Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer answerInteger;

	/**
	 * The cached value of the '{@link #getAnswerDate() <em>Answer Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerDate()
	 * @generated
	 * @ordered
	 */
	protected Date answerDate;

	/**
	 * The cached value of the '{@link #getAnswerDateTime() <em>Answer Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime answerDateTime;

	/**
	 * The cached value of the '{@link #getAnswerInstant() <em>Answer Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant answerInstant;

	/**
	 * The cached value of the '{@link #getAnswerTime() <em>Answer Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerTime()
	 * @generated
	 * @ordered
	 */
	protected Time answerTime;

	/**
	 * The cached value of the '{@link #getAnswerString() <em>Answer String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String answerString;

	/**
	 * The cached value of the '{@link #getAnswerUri() <em>Answer Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerUri()
	 * @generated
	 * @ordered
	 */
	protected Uri answerUri;

	/**
	 * The cached value of the '{@link #getAnswerAttachment() <em>Answer Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment answerAttachment;

	/**
	 * The cached value of the '{@link #getAnswerCoding() <em>Answer Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding answerCoding;

	/**
	 * The cached value of the '{@link #getAnswerQuantity() <em>Answer Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity answerQuantity;

	/**
	 * The cached value of the '{@link #getAnswerReference() <em>Answer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerReference()
	 * @generated
	 * @ordered
	 */
	protected Reference answerReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireEnableWhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireEnableWhen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(org.hl7.fhir.String newQuestion, NotificationChain msgs) {
		org.hl7.fhir.String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION, oldQuestion, newQuestion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(org.hl7.fhir.String newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION, newQuestion, newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getHasAnswer() {
		return hasAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAnswer(org.hl7.fhir.Boolean newHasAnswer, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldHasAnswer = hasAnswer;
		hasAnswer = newHasAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER, oldHasAnswer, newHasAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAnswer(org.hl7.fhir.Boolean newHasAnswer) {
		if (newHasAnswer != hasAnswer) {
			NotificationChain msgs = null;
			if (hasAnswer != null)
				msgs = ((InternalEObject)hasAnswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER, null, msgs);
			if (newHasAnswer != null)
				msgs = ((InternalEObject)newHasAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER, null, msgs);
			msgs = basicSetHasAnswer(newHasAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER, newHasAnswer, newHasAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAnswerBoolean() {
		return answerBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerBoolean(org.hl7.fhir.Boolean newAnswerBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAnswerBoolean = answerBoolean;
		answerBoolean = newAnswerBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN, oldAnswerBoolean, newAnswerBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerBoolean(org.hl7.fhir.Boolean newAnswerBoolean) {
		if (newAnswerBoolean != answerBoolean) {
			NotificationChain msgs = null;
			if (answerBoolean != null)
				msgs = ((InternalEObject)answerBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN, null, msgs);
			if (newAnswerBoolean != null)
				msgs = ((InternalEObject)newAnswerBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN, null, msgs);
			msgs = basicSetAnswerBoolean(newAnswerBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN, newAnswerBoolean, newAnswerBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAnswerDecimal() {
		return answerDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerDecimal(Decimal newAnswerDecimal, NotificationChain msgs) {
		Decimal oldAnswerDecimal = answerDecimal;
		answerDecimal = newAnswerDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL, oldAnswerDecimal, newAnswerDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerDecimal(Decimal newAnswerDecimal) {
		if (newAnswerDecimal != answerDecimal) {
			NotificationChain msgs = null;
			if (answerDecimal != null)
				msgs = ((InternalEObject)answerDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL, null, msgs);
			if (newAnswerDecimal != null)
				msgs = ((InternalEObject)newAnswerDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL, null, msgs);
			msgs = basicSetAnswerDecimal(newAnswerDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL, newAnswerDecimal, newAnswerDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getAnswerInteger() {
		return answerInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerInteger(org.hl7.fhir.Integer newAnswerInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldAnswerInteger = answerInteger;
		answerInteger = newAnswerInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER, oldAnswerInteger, newAnswerInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerInteger(org.hl7.fhir.Integer newAnswerInteger) {
		if (newAnswerInteger != answerInteger) {
			NotificationChain msgs = null;
			if (answerInteger != null)
				msgs = ((InternalEObject)answerInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER, null, msgs);
			if (newAnswerInteger != null)
				msgs = ((InternalEObject)newAnswerInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER, null, msgs);
			msgs = basicSetAnswerInteger(newAnswerInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER, newAnswerInteger, newAnswerInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAnswerDate() {
		return answerDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerDate(Date newAnswerDate, NotificationChain msgs) {
		Date oldAnswerDate = answerDate;
		answerDate = newAnswerDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE, oldAnswerDate, newAnswerDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerDate(Date newAnswerDate) {
		if (newAnswerDate != answerDate) {
			NotificationChain msgs = null;
			if (answerDate != null)
				msgs = ((InternalEObject)answerDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE, null, msgs);
			if (newAnswerDate != null)
				msgs = ((InternalEObject)newAnswerDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE, null, msgs);
			msgs = basicSetAnswerDate(newAnswerDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE, newAnswerDate, newAnswerDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAnswerDateTime() {
		return answerDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerDateTime(DateTime newAnswerDateTime, NotificationChain msgs) {
		DateTime oldAnswerDateTime = answerDateTime;
		answerDateTime = newAnswerDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME, oldAnswerDateTime, newAnswerDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerDateTime(DateTime newAnswerDateTime) {
		if (newAnswerDateTime != answerDateTime) {
			NotificationChain msgs = null;
			if (answerDateTime != null)
				msgs = ((InternalEObject)answerDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME, null, msgs);
			if (newAnswerDateTime != null)
				msgs = ((InternalEObject)newAnswerDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME, null, msgs);
			msgs = basicSetAnswerDateTime(newAnswerDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME, newAnswerDateTime, newAnswerDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getAnswerInstant() {
		return answerInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerInstant(Instant newAnswerInstant, NotificationChain msgs) {
		Instant oldAnswerInstant = answerInstant;
		answerInstant = newAnswerInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT, oldAnswerInstant, newAnswerInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerInstant(Instant newAnswerInstant) {
		if (newAnswerInstant != answerInstant) {
			NotificationChain msgs = null;
			if (answerInstant != null)
				msgs = ((InternalEObject)answerInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT, null, msgs);
			if (newAnswerInstant != null)
				msgs = ((InternalEObject)newAnswerInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT, null, msgs);
			msgs = basicSetAnswerInstant(newAnswerInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT, newAnswerInstant, newAnswerInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAnswerTime() {
		return answerTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerTime(Time newAnswerTime, NotificationChain msgs) {
		Time oldAnswerTime = answerTime;
		answerTime = newAnswerTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME, oldAnswerTime, newAnswerTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerTime(Time newAnswerTime) {
		if (newAnswerTime != answerTime) {
			NotificationChain msgs = null;
			if (answerTime != null)
				msgs = ((InternalEObject)answerTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME, null, msgs);
			if (newAnswerTime != null)
				msgs = ((InternalEObject)newAnswerTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME, null, msgs);
			msgs = basicSetAnswerTime(newAnswerTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME, newAnswerTime, newAnswerTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAnswerString() {
		return answerString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerString(org.hl7.fhir.String newAnswerString, NotificationChain msgs) {
		org.hl7.fhir.String oldAnswerString = answerString;
		answerString = newAnswerString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING, oldAnswerString, newAnswerString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerString(org.hl7.fhir.String newAnswerString) {
		if (newAnswerString != answerString) {
			NotificationChain msgs = null;
			if (answerString != null)
				msgs = ((InternalEObject)answerString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING, null, msgs);
			if (newAnswerString != null)
				msgs = ((InternalEObject)newAnswerString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING, null, msgs);
			msgs = basicSetAnswerString(newAnswerString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING, newAnswerString, newAnswerString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getAnswerUri() {
		return answerUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerUri(Uri newAnswerUri, NotificationChain msgs) {
		Uri oldAnswerUri = answerUri;
		answerUri = newAnswerUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI, oldAnswerUri, newAnswerUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerUri(Uri newAnswerUri) {
		if (newAnswerUri != answerUri) {
			NotificationChain msgs = null;
			if (answerUri != null)
				msgs = ((InternalEObject)answerUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI, null, msgs);
			if (newAnswerUri != null)
				msgs = ((InternalEObject)newAnswerUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI, null, msgs);
			msgs = basicSetAnswerUri(newAnswerUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI, newAnswerUri, newAnswerUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAnswerAttachment() {
		return answerAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerAttachment(Attachment newAnswerAttachment, NotificationChain msgs) {
		Attachment oldAnswerAttachment = answerAttachment;
		answerAttachment = newAnswerAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT, oldAnswerAttachment, newAnswerAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerAttachment(Attachment newAnswerAttachment) {
		if (newAnswerAttachment != answerAttachment) {
			NotificationChain msgs = null;
			if (answerAttachment != null)
				msgs = ((InternalEObject)answerAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT, null, msgs);
			if (newAnswerAttachment != null)
				msgs = ((InternalEObject)newAnswerAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT, null, msgs);
			msgs = basicSetAnswerAttachment(newAnswerAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT, newAnswerAttachment, newAnswerAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getAnswerCoding() {
		return answerCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerCoding(Coding newAnswerCoding, NotificationChain msgs) {
		Coding oldAnswerCoding = answerCoding;
		answerCoding = newAnswerCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING, oldAnswerCoding, newAnswerCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerCoding(Coding newAnswerCoding) {
		if (newAnswerCoding != answerCoding) {
			NotificationChain msgs = null;
			if (answerCoding != null)
				msgs = ((InternalEObject)answerCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING, null, msgs);
			if (newAnswerCoding != null)
				msgs = ((InternalEObject)newAnswerCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING, null, msgs);
			msgs = basicSetAnswerCoding(newAnswerCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING, newAnswerCoding, newAnswerCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getAnswerQuantity() {
		return answerQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerQuantity(Quantity newAnswerQuantity, NotificationChain msgs) {
		Quantity oldAnswerQuantity = answerQuantity;
		answerQuantity = newAnswerQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY, oldAnswerQuantity, newAnswerQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerQuantity(Quantity newAnswerQuantity) {
		if (newAnswerQuantity != answerQuantity) {
			NotificationChain msgs = null;
			if (answerQuantity != null)
				msgs = ((InternalEObject)answerQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY, null, msgs);
			if (newAnswerQuantity != null)
				msgs = ((InternalEObject)newAnswerQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY, null, msgs);
			msgs = basicSetAnswerQuantity(newAnswerQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY, newAnswerQuantity, newAnswerQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAnswerReference() {
		return answerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerReference(Reference newAnswerReference, NotificationChain msgs) {
		Reference oldAnswerReference = answerReference;
		answerReference = newAnswerReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE, oldAnswerReference, newAnswerReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerReference(Reference newAnswerReference) {
		if (newAnswerReference != answerReference) {
			NotificationChain msgs = null;
			if (answerReference != null)
				msgs = ((InternalEObject)answerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE, null, msgs);
			if (newAnswerReference != null)
				msgs = ((InternalEObject)newAnswerReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE, null, msgs);
			msgs = basicSetAnswerReference(newAnswerReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE, newAnswerReference, newAnswerReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION:
				return basicSetQuestion(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER:
				return basicSetHasAnswer(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN:
				return basicSetAnswerBoolean(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL:
				return basicSetAnswerDecimal(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER:
				return basicSetAnswerInteger(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE:
				return basicSetAnswerDate(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME:
				return basicSetAnswerDateTime(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT:
				return basicSetAnswerInstant(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME:
				return basicSetAnswerTime(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING:
				return basicSetAnswerString(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI:
				return basicSetAnswerUri(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT:
				return basicSetAnswerAttachment(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING:
				return basicSetAnswerCoding(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY:
				return basicSetAnswerQuantity(null, msgs);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE:
				return basicSetAnswerReference(null, msgs);
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
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION:
				return getQuestion();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER:
				return getHasAnswer();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN:
				return getAnswerBoolean();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL:
				return getAnswerDecimal();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER:
				return getAnswerInteger();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE:
				return getAnswerDate();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME:
				return getAnswerDateTime();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT:
				return getAnswerInstant();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME:
				return getAnswerTime();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING:
				return getAnswerString();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI:
				return getAnswerUri();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT:
				return getAnswerAttachment();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING:
				return getAnswerCoding();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY:
				return getAnswerQuantity();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE:
				return getAnswerReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION:
				setQuestion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER:
				setHasAnswer((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN:
				setAnswerBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL:
				setAnswerDecimal((Decimal)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER:
				setAnswerInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE:
				setAnswerDate((Date)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME:
				setAnswerDateTime((DateTime)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT:
				setAnswerInstant((Instant)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME:
				setAnswerTime((Time)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING:
				setAnswerString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI:
				setAnswerUri((Uri)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT:
				setAnswerAttachment((Attachment)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING:
				setAnswerCoding((Coding)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY:
				setAnswerQuantity((Quantity)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE:
				setAnswerReference((Reference)newValue);
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
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION:
				setQuestion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER:
				setHasAnswer((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN:
				setAnswerBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL:
				setAnswerDecimal((Decimal)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER:
				setAnswerInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE:
				setAnswerDate((Date)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME:
				setAnswerDateTime((DateTime)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT:
				setAnswerInstant((Instant)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME:
				setAnswerTime((Time)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING:
				setAnswerString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI:
				setAnswerUri((Uri)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT:
				setAnswerAttachment((Attachment)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING:
				setAnswerCoding((Coding)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY:
				setAnswerQuantity((Quantity)null);
				return;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE:
				setAnswerReference((Reference)null);
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
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__QUESTION:
				return question != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__HAS_ANSWER:
				return hasAnswer != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_BOOLEAN:
				return answerBoolean != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DECIMAL:
				return answerDecimal != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INTEGER:
				return answerInteger != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE:
				return answerDate != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_DATE_TIME:
				return answerDateTime != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_INSTANT:
				return answerInstant != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_TIME:
				return answerTime != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_STRING:
				return answerString != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_URI:
				return answerUri != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_ATTACHMENT:
				return answerAttachment != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_CODING:
				return answerCoding != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_QUANTITY:
				return answerQuantity != null;
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN__ANSWER_REFERENCE:
				return answerReference != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireEnableWhenImpl
