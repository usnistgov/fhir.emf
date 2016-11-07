/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Enable When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getHasAnswer <em>Has Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerBoolean <em>Answer Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerDecimal <em>Answer Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerInteger <em>Answer Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerDate <em>Answer Date</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerDateTime <em>Answer Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerInstant <em>Answer Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerTime <em>Answer Time</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerString <em>Answer String</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerUri <em>Answer Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerAttachment <em>Answer Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerCoding <em>Answer Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerQuantity <em>Answer Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerReference <em>Answer Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen()
 * @model extendedMetaData="name='Questionnaire.EnableWhen' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireEnableWhen extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The linkId for the question whose answer (or lack of answer) governs whether this item is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_Question()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getQuestion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Has Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that this item should be enabled only if the specified question is answered or not answered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Answer</em>' containment reference.
	 * @see #setHasAnswer(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_HasAnswer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasAnswer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getHasAnswer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getHasAnswer <em>Has Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Answer</em>' containment reference.
	 * @see #getHasAnswer()
	 * @generated
	 */
	void setHasAnswer(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Answer Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Boolean</em>' containment reference.
	 * @see #setAnswerBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAnswerBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerBoolean <em>Answer Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Boolean</em>' containment reference.
	 * @see #getAnswerBoolean()
	 * @generated
	 */
	void setAnswerBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Answer Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Decimal</em>' containment reference.
	 * @see #setAnswerDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getAnswerDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerDecimal <em>Answer Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Decimal</em>' containment reference.
	 * @see #getAnswerDecimal()
	 * @generated
	 */
	void setAnswerDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Answer Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Integer</em>' containment reference.
	 * @see #setAnswerInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getAnswerInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerInteger <em>Answer Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Integer</em>' containment reference.
	 * @see #getAnswerInteger()
	 * @generated
	 */
	void setAnswerInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Answer Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Date</em>' containment reference.
	 * @see #setAnswerDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getAnswerDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerDate <em>Answer Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Date</em>' containment reference.
	 * @see #getAnswerDate()
	 * @generated
	 */
	void setAnswerDate(Date value);

	/**
	 * Returns the value of the '<em><b>Answer Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Date Time</em>' containment reference.
	 * @see #setAnswerDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAnswerDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerDateTime <em>Answer Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Date Time</em>' containment reference.
	 * @see #getAnswerDateTime()
	 * @generated
	 */
	void setAnswerDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Answer Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Instant</em>' containment reference.
	 * @see #setAnswerInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getAnswerInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerInstant <em>Answer Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Instant</em>' containment reference.
	 * @see #getAnswerInstant()
	 * @generated
	 */
	void setAnswerInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Answer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Time</em>' containment reference.
	 * @see #setAnswerTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getAnswerTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerTime <em>Answer Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Time</em>' containment reference.
	 * @see #getAnswerTime()
	 * @generated
	 */
	void setAnswerTime(Time value);

	/**
	 * Returns the value of the '<em><b>Answer String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer String</em>' containment reference.
	 * @see #setAnswerString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAnswerString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerString <em>Answer String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer String</em>' containment reference.
	 * @see #getAnswerString()
	 * @generated
	 */
	void setAnswerString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Answer Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Uri</em>' containment reference.
	 * @see #setAnswerUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getAnswerUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerUri <em>Answer Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Uri</em>' containment reference.
	 * @see #getAnswerUri()
	 * @generated
	 */
	void setAnswerUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Answer Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Attachment</em>' containment reference.
	 * @see #setAnswerAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getAnswerAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerAttachment <em>Answer Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Attachment</em>' containment reference.
	 * @see #getAnswerAttachment()
	 * @generated
	 */
	void setAnswerAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Answer Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Coding</em>' containment reference.
	 * @see #setAnswerCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getAnswerCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerCoding <em>Answer Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Coding</em>' containment reference.
	 * @see #getAnswerCoding()
	 * @generated
	 */
	void setAnswerCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Answer Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Quantity</em>' containment reference.
	 * @see #setAnswerQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAnswerQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerQuantity <em>Answer Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Quantity</em>' containment reference.
	 * @see #getAnswerQuantity()
	 * @generated
	 */
	void setAnswerQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Answer Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, then the answer for the referenced question must match this answer for all components present in the enableWhen.answer. (choose any one of answer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Reference</em>' containment reference.
	 * @see #setAnswerReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireEnableWhen_AnswerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAnswerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireEnableWhen#getAnswerReference <em>Answer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Reference</em>' containment reference.
	 * @see #getAnswerReference()
	 * @generated
	 */
	void setAnswerReference(Reference value);

} // QuestionnaireEnableWhen
