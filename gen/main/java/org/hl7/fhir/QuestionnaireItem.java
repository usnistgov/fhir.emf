/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getOptions <em>Options</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getOption <em>Option</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialBoolean <em>Initial Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialDecimal <em>Initial Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialInteger <em>Initial Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialDate <em>Initial Date</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialDateTime <em>Initial Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialInstant <em>Initial Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialString <em>Initial String</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialUri <em>Initial Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialAttachment <em>Initial Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialCoding <em>Initial Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialQuantity <em>Initial Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitialReference <em>Initial Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem()
 * @model extendedMetaData="name='Questionnaire.Item' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a how this group of questions is known in a particular terminology such as LOINC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getConcept();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short label for a particular group, question or set of display text within the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Prefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPrefix();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a section, the text of a question or text content for a text item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(QuestionnaireItemType)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireItemType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(QuestionnaireItemType value);

	/**
	 * Returns the value of the '<em><b>Enable When</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireEnableWhen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable When</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_EnableWhen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableWhen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireEnableWhen> getEnableWhen();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the item must be present in a "completed" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the item may occur multiple times in the instance, containing multiple sets of answers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeats</em>' containment reference.
	 * @see #setRepeats(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Repeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeats' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRepeats();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getRepeats <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' containment reference.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the value cannot be changed by a human respondent to the Questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference.
	 * @see #setReadOnly(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_ReadOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of characters that are permitted in the answer to be considered a "valid" QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_MaxLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxLength' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a value set containing a list of codes representing permitted answers for the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Options()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='options' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOptions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Reference value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a "choice" question, identifies one of the permitted answers for the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Option()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireOption> getOption();

	/**
	 * Returns the value of the '<em><b>Initial Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Boolean</em>' containment reference.
	 * @see #setInitialBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInitialBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialBoolean <em>Initial Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Boolean</em>' containment reference.
	 * @see #getInitialBoolean()
	 * @generated
	 */
	void setInitialBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Initial Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Decimal</em>' containment reference.
	 * @see #setInitialDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getInitialDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialDecimal <em>Initial Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Decimal</em>' containment reference.
	 * @see #getInitialDecimal()
	 * @generated
	 */
	void setInitialDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Initial Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Integer</em>' containment reference.
	 * @see #setInitialInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getInitialInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialInteger <em>Initial Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Integer</em>' containment reference.
	 * @see #getInitialInteger()
	 * @generated
	 */
	void setInitialInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Initial Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Date</em>' containment reference.
	 * @see #setInitialDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getInitialDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialDate <em>Initial Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Date</em>' containment reference.
	 * @see #getInitialDate()
	 * @generated
	 */
	void setInitialDate(Date value);

	/**
	 * Returns the value of the '<em><b>Initial Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Date Time</em>' containment reference.
	 * @see #setInitialDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getInitialDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialDateTime <em>Initial Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Date Time</em>' containment reference.
	 * @see #getInitialDateTime()
	 * @generated
	 */
	void setInitialDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Initial Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Instant</em>' containment reference.
	 * @see #setInitialInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getInitialInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialInstant <em>Initial Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Instant</em>' containment reference.
	 * @see #getInitialInstant()
	 * @generated
	 */
	void setInitialInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Initial Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Time</em>' containment reference.
	 * @see #setInitialTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getInitialTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialTime <em>Initial Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Time</em>' containment reference.
	 * @see #getInitialTime()
	 * @generated
	 */
	void setInitialTime(Time value);

	/**
	 * Returns the value of the '<em><b>Initial String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial String</em>' containment reference.
	 * @see #setInitialString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInitialString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialString <em>Initial String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial String</em>' containment reference.
	 * @see #getInitialString()
	 * @generated
	 */
	void setInitialString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Initial Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Uri</em>' containment reference.
	 * @see #setInitialUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getInitialUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialUri <em>Initial Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Uri</em>' containment reference.
	 * @see #getInitialUri()
	 * @generated
	 */
	void setInitialUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Initial Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Attachment</em>' containment reference.
	 * @see #setInitialAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getInitialAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialAttachment <em>Initial Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Attachment</em>' containment reference.
	 * @see #getInitialAttachment()
	 * @generated
	 */
	void setInitialAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Initial Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Coding</em>' containment reference.
	 * @see #setInitialCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getInitialCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialCoding <em>Initial Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Coding</em>' containment reference.
	 * @see #getInitialCoding()
	 * @generated
	 */
	void setInitialCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Initial Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Quantity</em>' containment reference.
	 * @see #setInitialQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getInitialQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialQuantity <em>Initial Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Quantity</em>' containment reference.
	 * @see #getInitialQuantity()
	 * @generated
	 */
	void setInitialQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Initial Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be pre-populated when rendering the questionnaire for user input. (choose any one of initial*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Reference</em>' containment reference.
	 * @see #setInitialReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_InitialReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInitialReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getInitialReference <em>Initial Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Reference</em>' containment reference.
	 * @see #getInitialReference()
	 * @generated
	 */
	void setInitialReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows text, questions and other groups to be nested beneath a question or group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireItem> getItem();

} // QuestionnaireItem
