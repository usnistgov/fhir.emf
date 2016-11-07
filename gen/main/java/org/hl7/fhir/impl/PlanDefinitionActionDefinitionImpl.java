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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PlanActionCardinalityBehavior;
import org.hl7.fhir.PlanActionGroupingBehavior;
import org.hl7.fhir.PlanActionParticipantType;
import org.hl7.fhir.PlanActionPrecheckBehavior;
import org.hl7.fhir.PlanActionRequiredBehavior;
import org.hl7.fhir.PlanActionSelectionBehavior;
import org.hl7.fhir.PlanDefinitionActionDefinition;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedResource;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Action Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTriggerDefinition <em>Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionActionDefinitionImpl#getActionDefinition <em>Action Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionActionDefinitionImpl extends BackboneElementImpl implements PlanDefinitionActionDefinition {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String textEquivalent;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> concept;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedResource> documentation;

	/**
	 * The cached value of the '{@link #getTriggerDefinition() <em>Trigger Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerDefinition> triggerDefinition;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected PlanDefinitionCondition condition;

	/**
	 * The cached value of the '{@link #getRelatedAction() <em>Related Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionRelatedAction> relatedAction;

	/**
	 * The cached value of the '{@link #getTimingDateTime() <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timingDateTime;

	/**
	 * The cached value of the '{@link #getTimingPeriod() <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timingPeriod;

	/**
	 * The cached value of the '{@link #getTimingDuration() <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration timingDuration;

	/**
	 * The cached value of the '{@link #getTimingRange() <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingRange()
	 * @generated
	 * @ordered
	 */
	protected Range timingRange;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getParticipantType() <em>Participant Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantType()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanActionParticipantType> participantType;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected PlanActionGroupingBehavior groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected PlanActionSelectionBehavior selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected PlanActionRequiredBehavior requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected PlanActionPrecheckBehavior precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected PlanActionCardinalityBehavior cardinalityBehavior;

	/**
	 * The cached value of the '{@link #getActivityDefinition() <em>Activity Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference activityDefinition;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Reference transform;

	/**
	 * The cached value of the '{@link #getDynamicValue() <em>Dynamic Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionDynamicValue> dynamicValue;

	/**
	 * The cached value of the '{@link #getActionDefinition() <em>Action Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionDefinition> actionDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionActionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPlanDefinitionActionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIdentifier(Identifier newActionIdentifier, NotificationChain msgs) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER, oldActionIdentifier, newActionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		if (newActionIdentifier != actionIdentifier) {
			NotificationChain msgs = null;
			if (actionIdentifier != null)
				msgs = ((InternalEObject)actionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER, null, msgs);
			if (newActionIdentifier != null)
				msgs = ((InternalEObject)newActionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER, null, msgs);
			msgs = basicSetActionIdentifier(newActionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER, newActionIdentifier, newActionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(org.hl7.fhir.String newTextEquivalent, NotificationChain msgs) {
		org.hl7.fhir.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(org.hl7.fhir.String newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedResource> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<RelatedResource>(RelatedResource.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerDefinition> getTriggerDefinition() {
		if (triggerDefinition == null) {
			triggerDefinition = new EObjectContainmentEList<TriggerDefinition>(TriggerDefinition.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION);
		}
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(PlanDefinitionCondition newCondition, NotificationChain msgs) {
		PlanDefinitionCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(PlanDefinitionCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionRelatedAction> getRelatedAction() {
		if (relatedAction == null) {
			relatedAction = new EObjectContainmentEList<PlanDefinitionRelatedAction>(PlanDefinitionRelatedAction.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION);
		}
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTimingDateTime() {
		return timingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDateTime(DateTime newTimingDateTime, NotificationChain msgs) {
		DateTime oldTimingDateTime = timingDateTime;
		timingDateTime = newTimingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDateTime(DateTime newTimingDateTime) {
		if (newTimingDateTime != timingDateTime) {
			NotificationChain msgs = null;
			if (timingDateTime != null)
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getTimingPeriod() {
		return timingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPeriod(Period newTimingPeriod, NotificationChain msgs) {
		Period oldTimingPeriod = timingPeriod;
		timingPeriod = newTimingPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingPeriod(Period newTimingPeriod) {
		if (newTimingPeriod != timingPeriod) {
			NotificationChain msgs = null;
			if (timingPeriod != null)
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimingDuration() {
		return timingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDuration(Duration newTimingDuration, NotificationChain msgs) {
		Duration oldTimingDuration = timingDuration;
		timingDuration = newTimingDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION, oldTimingDuration, newTimingDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDuration(Duration newTimingDuration) {
		if (newTimingDuration != timingDuration) {
			NotificationChain msgs = null;
			if (timingDuration != null)
				msgs = ((InternalEObject)timingDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION, null, msgs);
			if (newTimingDuration != null)
				msgs = ((InternalEObject)newTimingDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION, null, msgs);
			msgs = basicSetTimingDuration(newTimingDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION, newTimingDuration, newTimingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getTimingRange() {
		return timingRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingRange(Range newTimingRange, NotificationChain msgs) {
		Range oldTimingRange = timingRange;
		timingRange = newTimingRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE, oldTimingRange, newTimingRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingRange(Range newTimingRange) {
		if (newTimingRange != timingRange) {
			NotificationChain msgs = null;
			if (timingRange != null)
				msgs = ((InternalEObject)timingRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE, null, msgs);
			if (newTimingRange != null)
				msgs = ((InternalEObject)newTimingRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE, null, msgs);
			msgs = basicSetTimingRange(newTimingRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE, newTimingRange, newTimingRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING, oldTimingTiming, newTimingTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanActionParticipantType> getParticipantType() {
		if (participantType == null) {
			participantType = new EObjectContainmentEList<PlanActionParticipantType>(PlanActionParticipantType.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE);
		}
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionGroupingBehavior getGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingBehavior(PlanActionGroupingBehavior newGroupingBehavior, NotificationChain msgs) {
		PlanActionGroupingBehavior oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR, oldGroupingBehavior, newGroupingBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(PlanActionGroupingBehavior newGroupingBehavior) {
		if (newGroupingBehavior != groupingBehavior) {
			NotificationChain msgs = null;
			if (groupingBehavior != null)
				msgs = ((InternalEObject)groupingBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR, null, msgs);
			if (newGroupingBehavior != null)
				msgs = ((InternalEObject)newGroupingBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR, null, msgs);
			msgs = basicSetGroupingBehavior(newGroupingBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR, newGroupingBehavior, newGroupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionSelectionBehavior getSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBehavior(PlanActionSelectionBehavior newSelectionBehavior, NotificationChain msgs) {
		PlanActionSelectionBehavior oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR, oldSelectionBehavior, newSelectionBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBehavior(PlanActionSelectionBehavior newSelectionBehavior) {
		if (newSelectionBehavior != selectionBehavior) {
			NotificationChain msgs = null;
			if (selectionBehavior != null)
				msgs = ((InternalEObject)selectionBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR, null, msgs);
			if (newSelectionBehavior != null)
				msgs = ((InternalEObject)newSelectionBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR, null, msgs);
			msgs = basicSetSelectionBehavior(newSelectionBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR, newSelectionBehavior, newSelectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRequiredBehavior getRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBehavior(PlanActionRequiredBehavior newRequiredBehavior, NotificationChain msgs) {
		PlanActionRequiredBehavior oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR, oldRequiredBehavior, newRequiredBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBehavior(PlanActionRequiredBehavior newRequiredBehavior) {
		if (newRequiredBehavior != requiredBehavior) {
			NotificationChain msgs = null;
			if (requiredBehavior != null)
				msgs = ((InternalEObject)requiredBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR, null, msgs);
			if (newRequiredBehavior != null)
				msgs = ((InternalEObject)newRequiredBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR, null, msgs);
			msgs = basicSetRequiredBehavior(newRequiredBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR, newRequiredBehavior, newRequiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionPrecheckBehavior getPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecheckBehavior(PlanActionPrecheckBehavior newPrecheckBehavior, NotificationChain msgs) {
		PlanActionPrecheckBehavior oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, newPrecheckBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecheckBehavior(PlanActionPrecheckBehavior newPrecheckBehavior) {
		if (newPrecheckBehavior != precheckBehavior) {
			NotificationChain msgs = null;
			if (precheckBehavior != null)
				msgs = ((InternalEObject)precheckBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR, null, msgs);
			if (newPrecheckBehavior != null)
				msgs = ((InternalEObject)newPrecheckBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR, null, msgs);
			msgs = basicSetPrecheckBehavior(newPrecheckBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR, newPrecheckBehavior, newPrecheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionCardinalityBehavior getCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityBehavior(PlanActionCardinalityBehavior newCardinalityBehavior, NotificationChain msgs) {
		PlanActionCardinalityBehavior oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, newCardinalityBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityBehavior(PlanActionCardinalityBehavior newCardinalityBehavior) {
		if (newCardinalityBehavior != cardinalityBehavior) {
			NotificationChain msgs = null;
			if (cardinalityBehavior != null)
				msgs = ((InternalEObject)cardinalityBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR, null, msgs);
			if (newCardinalityBehavior != null)
				msgs = ((InternalEObject)newCardinalityBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR, null, msgs);
			msgs = basicSetCardinalityBehavior(newCardinalityBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR, newCardinalityBehavior, newCardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getActivityDefinition() {
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityDefinition(Reference newActivityDefinition, NotificationChain msgs) {
		Reference oldActivityDefinition = activityDefinition;
		activityDefinition = newActivityDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION, oldActivityDefinition, newActivityDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityDefinition(Reference newActivityDefinition) {
		if (newActivityDefinition != activityDefinition) {
			NotificationChain msgs = null;
			if (activityDefinition != null)
				msgs = ((InternalEObject)activityDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION, null, msgs);
			if (newActivityDefinition != null)
				msgs = ((InternalEObject)newActivityDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION, null, msgs);
			msgs = basicSetActivityDefinition(newActivityDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION, newActivityDefinition, newActivityDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Reference newTransform, NotificationChain msgs) {
		Reference oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Reference newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionDynamicValue> getDynamicValue() {
		if (dynamicValue == null) {
			dynamicValue = new EObjectContainmentEList<PlanDefinitionDynamicValue>(PlanDefinitionDynamicValue.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE);
		}
		return dynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionActionDefinition> getActionDefinition() {
		if (actionDefinition == null) {
			actionDefinition = new EObjectContainmentEList<PlanDefinitionActionDefinition>(PlanDefinitionActionDefinition.class, this, FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION);
		}
		return actionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				return basicSetActionIdentifier(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				return ((InternalEList<?>)getTriggerDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				return ((InternalEList<?>)getRelatedAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION:
				return basicSetTimingDuration(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE:
				return basicSetTimingRange(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				return ((InternalEList<?>)getParticipantType()).basicRemove(otherEnd, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				return basicSetGroupingBehavior(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				return basicSetSelectionBehavior(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				return basicSetRequiredBehavior(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				return basicSetPrecheckBehavior(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				return basicSetCardinalityBehavior(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				return basicSetActivityDefinition(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				return basicSetTransform(null, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				return ((InternalEList<?>)getDynamicValue()).basicRemove(otherEnd, msgs);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				return ((InternalEList<?>)getActionDefinition()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				return getActionIdentifier();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				return getLabel();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				return getTitle();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONCEPT:
				return getConcept();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				return getTriggerDefinition();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				return getCondition();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				return getRelatedAction();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME:
				return getTimingDateTime();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION:
				return getTimingDuration();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE:
				return getTimingRange();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				return getParticipantType();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				return getType();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				return getGroupingBehavior();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				return getSelectionBehavior();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				return getRequiredBehavior();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				return getPrecheckBehavior();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				return getCardinalityBehavior();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				return getActivityDefinition();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				return getTransform();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				return getDynamicValue();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				return getActionDefinition();
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
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends RelatedResource>)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				getTriggerDefinition().clear();
				getTriggerDefinition().addAll((Collection<? extends TriggerDefinition>)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				setCondition((PlanDefinitionCondition)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				getRelatedAction().clear();
				getRelatedAction().addAll((Collection<? extends PlanDefinitionRelatedAction>)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION:
				setTimingDuration((Duration)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE:
				setTimingRange((Range)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				getParticipantType().clear();
				getParticipantType().addAll((Collection<? extends PlanActionParticipantType>)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				setGroupingBehavior((PlanActionGroupingBehavior)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				setSelectionBehavior((PlanActionSelectionBehavior)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((PlanActionRequiredBehavior)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((PlanActionPrecheckBehavior)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((PlanActionCardinalityBehavior)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				setActivityDefinition((Reference)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				setTransform((Reference)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				getDynamicValue().clear();
				getDynamicValue().addAll((Collection<? extends PlanDefinitionDynamicValue>)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				getActionDefinition().clear();
				getActionDefinition().addAll((Collection<? extends PlanDefinitionActionDefinition>)newValue);
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
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				getTriggerDefinition().clear();
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				setCondition((PlanDefinitionCondition)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				getRelatedAction().clear();
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION:
				setTimingDuration((Duration)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE:
				setTimingRange((Range)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				getParticipantType().clear();
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				setGroupingBehavior((PlanActionGroupingBehavior)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				setSelectionBehavior((PlanActionSelectionBehavior)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((PlanActionRequiredBehavior)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((PlanActionPrecheckBehavior)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((PlanActionCardinalityBehavior)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				setActivityDefinition((Reference)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				setTransform((Reference)null);
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				getDynamicValue().clear();
				return;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				getActionDefinition().clear();
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
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				return label != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				return title != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				return triggerDefinition != null && !triggerDefinition.isEmpty();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				return condition != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				return relatedAction != null && !relatedAction.isEmpty();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DATE_TIME:
				return timingDateTime != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_DURATION:
				return timingDuration != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_RANGE:
				return timingRange != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				return participantType != null && !participantType.isEmpty();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				return activityDefinition != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				return transform != null;
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				return dynamicValue != null && !dynamicValue.isEmpty();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				return actionDefinition != null && !actionDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionActionDefinitionImpl
