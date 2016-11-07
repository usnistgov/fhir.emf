/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance Response Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction()
 * @model extendedMetaData="name='GuidanceResponse.Action' kind='elementOnly'"
 * @generated
 */
public interface GuidanceResponseAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the action. The identifier SHALL be unique within the container in which it appears, and MAY be universally unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Identifier</em>' containment reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_ActionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getActionIdentifier <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Identifier</em>' containment reference.
	 * @see #getActionIdentifier()
	 * @generated
	 */
	void setActionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-visible label for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the action displayed to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the action used to provide a summary to display to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concept represented by this action or its sub-actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getConcept();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedResource> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship to another action such as "before" or "30-60 minutes after start of".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference.
	 * @see #setRelatedAction(GuidanceResponseRelatedAction)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_RelatedAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAction' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidanceResponseRelatedAction getRelatedAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getRelatedAction <em>Related Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Action</em>' containment reference.
	 * @see #getRelatedAction()
	 * @generated
	 */
	void setRelatedAction(GuidanceResponseRelatedAction value);

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Timing Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Duration</em>' containment reference.
	 * @see #setTimingDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_TimingDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTimingDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getTimingDuration <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Duration</em>' containment reference.
	 * @see #getTimingDuration()
	 * @generated
	 */
	void setTimingDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Timing Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Range</em>' containment reference.
	 * @see #setTimingRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_TimingRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getTimingRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getTimingRange <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Range</em>' containment reference.
	 * @see #getTimingRange()
	 * @generated
	 */
	void setTimingRange(Range value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getParticipant();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of action to perform (create, update, remove).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Grouping Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the grouping behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #setGroupingBehavior(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_GroupingBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupingBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getGroupingBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getGroupingBehavior <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #getGroupingBehavior()
	 * @generated
	 */
	void setGroupingBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the selection behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #setSelectionBehavior(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_SelectionBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='selectionBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getSelectionBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getSelectionBehavior <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #getSelectionBehavior()
	 * @generated
	 */
	void setSelectionBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the requiredness behavior for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Behavior</em>' containment reference.
	 * @see #setRequiredBehavior(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_RequiredBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getRequiredBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getRequiredBehavior <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Behavior</em>' containment reference.
	 * @see #getRequiredBehavior()
	 * @generated
	 */
	void setRequiredBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action should usually be preselected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #setPrecheckBehavior(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_PrecheckBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precheckBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getPrecheckBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getPrecheckBehavior <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #getPrecheckBehavior()
	 * @generated
	 */
	void setPrecheckBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action can be selected multiple times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #setCardinalityBehavior(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_CardinalityBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardinalityBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCardinalityBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getCardinalityBehavior <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #getCardinalityBehavior()
	 * @generated
	 */
	void setCardinalityBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource that is the target of the action (e.g. CommunicationRequest).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseAction#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GuidanceResponseAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseAction_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GuidanceResponseAction> getAction();

} // GuidanceResponseAction
