/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Action Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTriggerDefinition <em>Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionActionDefinition#getActionDefinition <em>Action Definition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition()
 * @model extendedMetaData="name='PlanDefinition.ActionDefinition' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionActionDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the action. The identifier SHALL be unique within the container in which it appears, and MAY be universally unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Identifier</em>' containment reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_ActionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getActionIdentifier <em>Action Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getLabel <em>Label</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTitle <em>Title</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Concept()
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedResource> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Trigger Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TriggerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of when the action should be triggered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TriggerDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggerDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriggerDefinition> getTriggerDefinition();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression specifying whether or not the action is applicable in a given context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(PlanDefinitionCondition)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanDefinitionCondition getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(PlanDefinitionCondition value);

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionRelatedAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship to another action such as "before" or "30-60 minutes after start of".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_RelatedAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionRelatedAction> getRelatedAction();

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingPeriod <em>Timing Period</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TimingDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTimingDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingDuration <em>Timing Duration</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TimingRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getTimingRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingRange <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Range</em>' containment reference.
	 * @see #getTimingRange()
	 * @generated
	 */
	void setTimingRange(Range value);

	/**
	 * Returns the value of the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Timing</em>' containment reference.
	 * @see #setTimingTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Participant Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanActionParticipantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_ParticipantType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanActionParticipantType> getParticipantType();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of action to perform (create, update, remove).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getType <em>Type</em>}' containment reference.
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
	 * @see #setGroupingBehavior(PlanActionGroupingBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_GroupingBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupingBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanActionGroupingBehavior getGroupingBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getGroupingBehavior <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #getGroupingBehavior()
	 * @generated
	 */
	void setGroupingBehavior(PlanActionGroupingBehavior value);

	/**
	 * Returns the value of the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the selection behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #setSelectionBehavior(PlanActionSelectionBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_SelectionBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='selectionBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanActionSelectionBehavior getSelectionBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getSelectionBehavior <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #getSelectionBehavior()
	 * @generated
	 */
	void setSelectionBehavior(PlanActionSelectionBehavior value);

	/**
	 * Returns the value of the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the requiredness behavior for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Behavior</em>' containment reference.
	 * @see #setRequiredBehavior(PlanActionRequiredBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_RequiredBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanActionRequiredBehavior getRequiredBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getRequiredBehavior <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Behavior</em>' containment reference.
	 * @see #getRequiredBehavior()
	 * @generated
	 */
	void setRequiredBehavior(PlanActionRequiredBehavior value);

	/**
	 * Returns the value of the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action should usually be preselected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #setPrecheckBehavior(PlanActionPrecheckBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_PrecheckBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precheckBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanActionPrecheckBehavior getPrecheckBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getPrecheckBehavior <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #getPrecheckBehavior()
	 * @generated
	 */
	void setPrecheckBehavior(PlanActionPrecheckBehavior value);

	/**
	 * Returns the value of the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action can be selected multiple times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #setCardinalityBehavior(PlanActionCardinalityBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_CardinalityBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardinalityBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanActionCardinalityBehavior getCardinalityBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getCardinalityBehavior <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #getCardinalityBehavior()
	 * @generated
	 */
	void setCardinalityBehavior(PlanActionCardinalityBehavior value);

	/**
	 * Returns the value of the '<em><b>Activity Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an ActivityDefinition that describes the action to be taken in detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Definition</em>' containment reference.
	 * @see #setActivityDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_ActivityDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activityDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActivityDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getActivityDefinition <em>Activity Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Definition</em>' containment reference.
	 * @see #getActivityDefinition()
	 * @generated
	 */
	void setActivityDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_Transform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTransform();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionActionDefinition#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Reference value);

	/**
	 * Returns the value of the '<em><b>Dynamic Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionDynamicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Value</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_DynamicValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionDynamicValue> getDynamicValue();

	/**
	 * Returns the value of the '<em><b>Action Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionActionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionActionDefinition_ActionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionActionDefinition> getActionDefinition();

} // PlanDefinitionActionDefinition
