/**
 */
package org.hl7.fhir.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.hl7.fhir.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirFactoryImpl extends EFactoryImpl implements FhirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirFactory init() {
		try {
			FhirFactory theFhirFactory = (FhirFactory)EPackage.Registry.INSTANCE.getEFactory(FhirPackage.eNS_URI);
			if (theFhirFactory != null) {
				return theFhirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirPackage.ACCOUNT: return createAccount();
			case FhirPackage.ACCOUNT_STATUS: return createAccountStatus();
			case FhirPackage.ACTION_LIST: return createActionList();
			case FhirPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY: return createActivityDefinitionCategory();
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: return createActivityDefinitionDynamicValue();
			case FhirPackage.ADDRESS: return createAddress();
			case FhirPackage.ADDRESS_TYPE: return createAddressType();
			case FhirPackage.ADDRESS_USE: return createAddressUse();
			case FhirPackage.ADMINISTRATIVE_GENDER: return createAdministrativeGender();
			case FhirPackage.AGE: return createAge();
			case FhirPackage.AGGREGATION_MODE: return createAggregationMode();
			case FhirPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: return createAllergyIntoleranceCategory();
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY: return createAllergyIntoleranceCertainty();
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: return createAllergyIntoleranceCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: return createAllergyIntoleranceSeverity();
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS: return createAllergyIntoleranceStatus();
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE: return createAllergyIntoleranceType();
			case FhirPackage.ANNOTATION: return createAnnotation();
			case FhirPackage.APPOINTMENT: return createAppointment();
			case FhirPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case FhirPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case FhirPackage.APPOINTMENT_STATUS: return createAppointmentStatus();
			case FhirPackage.ASSERTION_DIRECTION_TYPE: return createAssertionDirectionType();
			case FhirPackage.ASSERTION_OPERATOR_TYPE: return createAssertionOperatorType();
			case FhirPackage.ASSERTION_RESPONSE_TYPES: return createAssertionResponseTypes();
			case FhirPackage.ATTACHMENT: return createAttachment();
			case FhirPackage.AUDIT_EVENT: return createAuditEvent();
			case FhirPackage.AUDIT_EVENT_ACTION: return createAuditEventAction();
			case FhirPackage.AUDIT_EVENT_AGENT: return createAuditEventAgent();
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE: return createAuditEventAgentNetworkType();
			case FhirPackage.AUDIT_EVENT_DETAIL: return createAuditEventDetail();
			case FhirPackage.AUDIT_EVENT_ENTITY: return createAuditEventEntity();
			case FhirPackage.AUDIT_EVENT_NETWORK: return createAuditEventNetwork();
			case FhirPackage.AUDIT_EVENT_OUTCOME: return createAuditEventOutcome();
			case FhirPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case FhirPackage.BACKBONE_ELEMENT: return createBackboneElement();
			case FhirPackage.BASE64_BINARY: return createBase64Binary();
			case FhirPackage.BASIC: return createBasic();
			case FhirPackage.BINARY: return createBinary();
			case FhirPackage.BINDING_STRENGTH: return createBindingStrength();
			case FhirPackage.BODY_SITE: return createBodySite();
			case FhirPackage.BOOLEAN: return createBoolean();
			case FhirPackage.BUNDLE: return createBundle();
			case FhirPackage.BUNDLE_ENTRY: return createBundleEntry();
			case FhirPackage.BUNDLE_LINK: return createBundleLink();
			case FhirPackage.BUNDLE_REQUEST: return createBundleRequest();
			case FhirPackage.BUNDLE_RESPONSE: return createBundleResponse();
			case FhirPackage.BUNDLE_SEARCH: return createBundleSearch();
			case FhirPackage.BUNDLE_TYPE: return createBundleType();
			case FhirPackage.CARE_PLAN: return createCarePlan();
			case FhirPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS: return createCarePlanActivityStatus();
			case FhirPackage.CARE_PLAN_DETAIL: return createCarePlanDetail();
			case FhirPackage.CARE_PLAN_RELATED_PLAN: return createCarePlanRelatedPlan();
			case FhirPackage.CARE_PLAN_RELATIONSHIP: return createCarePlanRelationship();
			case FhirPackage.CARE_PLAN_STATUS: return createCarePlanStatus();
			case FhirPackage.CARE_TEAM: return createCareTeam();
			case FhirPackage.CARE_TEAM_PARTICIPANT: return createCareTeamParticipant();
			case FhirPackage.CLAIM: return createClaim();
			case FhirPackage.CLAIM_ACCIDENT: return createClaimAccident();
			case FhirPackage.CLAIM_CARE_TEAM: return createClaimCareTeam();
			case FhirPackage.CLAIM_COVERAGE: return createClaimCoverage();
			case FhirPackage.CLAIM_DETAIL: return createClaimDetail();
			case FhirPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case FhirPackage.CLAIM_INFORMATION: return createClaimInformation();
			case FhirPackage.CLAIM_ITEM: return createClaimItem();
			case FhirPackage.CLAIM_MISSING_TEETH: return createClaimMissingTeeth();
			case FhirPackage.CLAIM_PAYEE: return createClaimPayee();
			case FhirPackage.CLAIM_PROCEDURE: return createClaimProcedure();
			case FhirPackage.CLAIM_PROSTHESIS: return createClaimProsthesis();
			case FhirPackage.CLAIM_RELATED: return createClaimRelated();
			case FhirPackage.CLAIM_RESPONSE: return createClaimResponse();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: return createClaimResponseAddItem();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: return createClaimResponseAdjudication();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE: return createClaimResponseCoverage();
			case FhirPackage.CLAIM_RESPONSE_DETAIL: return createClaimResponseDetail();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: return createClaimResponseDetail1();
			case FhirPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case FhirPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case FhirPackage.CLAIM_RESPONSE_NOTE: return createClaimResponseNote();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT: return createClaimResponsePayment();
			case FhirPackage.CLAIM_RESPONSE_STATUS: return createClaimResponseStatus();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: return createClaimResponseSubDetail();
			case FhirPackage.CLAIM_STATUS: return createClaimStatus();
			case FhirPackage.CLAIM_SUB_DETAIL: return createClaimSubDetail();
			case FhirPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATIONS: return createClinicalImpressionInvestigations();
			case FhirPackage.CLINICAL_IMPRESSION_STATUS: return createClinicalImpressionStatus();
			case FhirPackage.CODE: return createCode();
			case FhirPackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case FhirPackage.CODE_SYSTEM: return createCodeSystem();
			case FhirPackage.CODE_SYSTEM_CONCEPT: return createCodeSystemConcept();
			case FhirPackage.CODE_SYSTEM_CONTACT: return createCodeSystemContact();
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE: return createCodeSystemContentMode();
			case FhirPackage.CODE_SYSTEM_DESIGNATION: return createCodeSystemDesignation();
			case FhirPackage.CODE_SYSTEM_FILTER: return createCodeSystemFilter();
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING: return createCodeSystemHierarchyMeaning();
			case FhirPackage.CODE_SYSTEM_PROPERTY: return createCodeSystemProperty();
			case FhirPackage.CODE_SYSTEM_PROPERTY1: return createCodeSystemProperty1();
			case FhirPackage.CODING: return createCoding();
			case FhirPackage.COMMUNICATION: return createCommunication();
			case FhirPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case FhirPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case FhirPackage.COMMUNICATION_REQUEST_STATUS: return createCommunicationRequestStatus();
			case FhirPackage.COMMUNICATION_STATUS: return createCommunicationStatus();
			case FhirPackage.COMPARTMENT_DEFINITION: return createCompartmentDefinition();
			case FhirPackage.COMPARTMENT_DEFINITION_CONTACT: return createCompartmentDefinitionContact();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE: return createCompartmentDefinitionResource();
			case FhirPackage.COMPARTMENT_TYPE: return createCompartmentType();
			case FhirPackage.COMPOSITION: return createComposition();
			case FhirPackage.COMPOSITION_ATTESTATION_MODE: return createCompositionAttestationMode();
			case FhirPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case FhirPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case FhirPackage.COMPOSITION_SECTION: return createCompositionSection();
			case FhirPackage.COMPOSITION_STATUS: return createCompositionStatus();
			case FhirPackage.CONCEPT_MAP: return createConceptMap();
			case FhirPackage.CONCEPT_MAP_CONTACT: return createConceptMapContact();
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: return createConceptMapDependsOn();
			case FhirPackage.CONCEPT_MAP_ELEMENT: return createConceptMapElement();
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE: return createConceptMapEquivalence();
			case FhirPackage.CONCEPT_MAP_GROUP: return createConceptMapGroup();
			case FhirPackage.CONCEPT_MAP_TARGET: return createConceptMapTarget();
			case FhirPackage.CONDITION: return createCondition();
			case FhirPackage.CONDITIONAL_DELETE_STATUS: return createConditionalDeleteStatus();
			case FhirPackage.CONDITIONAL_READ_STATUS: return createConditionalReadStatus();
			case FhirPackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case FhirPackage.CONDITION_STAGE: return createConditionStage();
			case FhirPackage.CONDITION_VERIFICATION_STATUS: return createConditionVerificationStatus();
			case FhirPackage.CONFORMANCE: return createConformance();
			case FhirPackage.CONFORMANCE_CERTIFICATE: return createConformanceCertificate();
			case FhirPackage.CONFORMANCE_CONTACT: return createConformanceContact();
			case FhirPackage.CONFORMANCE_DOCUMENT: return createConformanceDocument();
			case FhirPackage.CONFORMANCE_ENDPOINT: return createConformanceEndpoint();
			case FhirPackage.CONFORMANCE_EVENT: return createConformanceEvent();
			case FhirPackage.CONFORMANCE_EVENT_MODE: return createConformanceEventMode();
			case FhirPackage.CONFORMANCE_IMPLEMENTATION: return createConformanceImplementation();
			case FhirPackage.CONFORMANCE_INTERACTION: return createConformanceInteraction();
			case FhirPackage.CONFORMANCE_INTERACTION1: return createConformanceInteraction1();
			case FhirPackage.CONFORMANCE_MESSAGING: return createConformanceMessaging();
			case FhirPackage.CONFORMANCE_OPERATION: return createConformanceOperation();
			case FhirPackage.CONFORMANCE_RESOURCE: return createConformanceResource();
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS: return createConformanceResourceStatus();
			case FhirPackage.CONFORMANCE_REST: return createConformanceRest();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM: return createConformanceSearchParam();
			case FhirPackage.CONFORMANCE_SECURITY: return createConformanceSecurity();
			case FhirPackage.CONFORMANCE_SOFTWARE: return createConformanceSoftware();
			case FhirPackage.CONFORMANCE_STATEMENT_KIND: return createConformanceStatementKind();
			case FhirPackage.CONSENT: return createConsent();
			case FhirPackage.CONSENT_ACTOR: return createConsentActor();
			case FhirPackage.CONSENT_DATA: return createConsentData();
			case FhirPackage.CONSENT_DATA_MEANING: return createConsentDataMeaning();
			case FhirPackage.CONSENT_EXCEPT: return createConsentExcept();
			case FhirPackage.CONSENT_EXCEPT_TYPE: return createConsentExceptType();
			case FhirPackage.CONSENT_STATUS: return createConsentStatus();
			case FhirPackage.CONSTRAINT_SEVERITY: return createConstraintSeverity();
			case FhirPackage.CONTACT_DETAIL: return createContactDetail();
			case FhirPackage.CONTACT_POINT: return createContactPoint();
			case FhirPackage.CONTACT_POINT_SYSTEM: return createContactPointSystem();
			case FhirPackage.CONTACT_POINT_USE: return createContactPointUse();
			case FhirPackage.CONTENT_TYPE: return createContentType();
			case FhirPackage.CONTRACT: return createContract();
			case FhirPackage.CONTRACT_AGENT: return createContractAgent();
			case FhirPackage.CONTRACT_AGENT1: return createContractAgent1();
			case FhirPackage.CONTRACT_FRIENDLY: return createContractFriendly();
			case FhirPackage.CONTRACT_LEGAL: return createContractLegal();
			case FhirPackage.CONTRACT_RULE: return createContractRule();
			case FhirPackage.CONTRACT_SIGNER: return createContractSigner();
			case FhirPackage.CONTRACT_TERM: return createContractTerm();
			case FhirPackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case FhirPackage.CONTRACT_VALUED_ITEM1: return createContractValuedItem1();
			case FhirPackage.CONTRIBUTOR: return createContributor();
			case FhirPackage.CONTRIBUTOR_TYPE: return createContributorType();
			case FhirPackage.COUNT: return createCount();
			case FhirPackage.COVERAGE: return createCoverage();
			case FhirPackage.COVERAGE_STATUS: return createCoverageStatus();
			case FhirPackage.DATA_ELEMENT: return createDataElement();
			case FhirPackage.DATA_ELEMENT_CONTACT: return createDataElementContact();
			case FhirPackage.DATA_ELEMENT_MAPPING: return createDataElementMapping();
			case FhirPackage.DATA_ELEMENT_STRINGENCY: return createDataElementStringency();
			case FhirPackage.DATA_REQUIREMENT: return createDataRequirement();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER: return createDataRequirementCodeFilter();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER: return createDataRequirementDateFilter();
			case FhirPackage.DATE: return createDate();
			case FhirPackage.DATE_TIME: return createDateTime();
			case FhirPackage.DAYS_OF_WEEK: return createDaysOfWeek();
			case FhirPackage.DECIMAL: return createDecimal();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE: return createDecisionSupportServiceModule();
			case FhirPackage.DETECTED_ISSUE: return createDetectedIssue();
			case FhirPackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case FhirPackage.DETECTED_ISSUE_SEVERITY: return createDetectedIssueSeverity();
			case FhirPackage.DEVICE: return createDevice();
			case FhirPackage.DEVICE_COMPONENT: return createDeviceComponent();
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: return createDeviceComponentProductionSpecification();
			case FhirPackage.DEVICE_METRIC: return createDeviceMetric();
			case FhirPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: return createDeviceMetricCalibrationState();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: return createDeviceMetricCalibrationType();
			case FhirPackage.DEVICE_METRIC_CATEGORY: return createDeviceMetricCategory();
			case FhirPackage.DEVICE_METRIC_COLOR: return createDeviceMetricColor();
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: return createDeviceMetricOperationalStatus();
			case FhirPackage.DEVICE_STATUS: return createDeviceStatus();
			case FhirPackage.DEVICE_USE_REQUEST: return createDeviceUseRequest();
			case FhirPackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case FhirPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE: return createDiagnosticReportImage();
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: return createDiagnosticReportStatus();
			case FhirPackage.DIAGNOSTIC_REQUEST: return createDiagnosticRequest();
			case FhirPackage.DIGITAL_MEDIA_TYPE: return createDigitalMediaType();
			case FhirPackage.DISTANCE: return createDistance();
			case FhirPackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT: return createDocumentManifestContent();
			case FhirPackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case FhirPackage.DOCUMENT_MODE: return createDocumentMode();
			case FhirPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case FhirPackage.DOCUMENT_REFERENCE_RELATED: return createDocumentReferenceRelated();
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: return createDocumentReferenceStatus();
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE: return createDocumentRelationshipType();
			case FhirPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FhirPackage.DOMAIN_RESOURCE: return createDomainResource();
			case FhirPackage.DURATION: return createDuration();
			case FhirPackage.ELEMENT: return createElement();
			case FhirPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FhirPackage.ELEMENT_DEFINITION_BASE: return createElementDefinitionBase();
			case FhirPackage.ELEMENT_DEFINITION_BINDING: return createElementDefinitionBinding();
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: return createElementDefinitionConstraint();
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: return createElementDefinitionMapping();
			case FhirPackage.ELEMENT_DEFINITION_SLICING: return createElementDefinitionSlicing();
			case FhirPackage.ELEMENT_DEFINITION_TYPE: return createElementDefinitionType();
			case FhirPackage.ELIGIBILITY_REQUEST: return createEligibilityRequest();
			case FhirPackage.ELIGIBILITY_REQUEST_STATUS: return createEligibilityRequestStatus();
			case FhirPackage.ELIGIBILITY_RESPONSE: return createEligibilityResponse();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE: return createEligibilityResponseBenefitBalance();
			case FhirPackage.ELIGIBILITY_RESPONSE_ERROR: return createEligibilityResponseError();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL: return createEligibilityResponseFinancial();
			case FhirPackage.ELIGIBILITY_RESPONSE_STATUS: return createEligibilityResponseStatus();
			case FhirPackage.ENCOUNTER: return createEncounter();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case FhirPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: return createEncounterLocationStatus();
			case FhirPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case FhirPackage.ENCOUNTER_STATUS: return createEncounterStatus();
			case FhirPackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case FhirPackage.ENDPOINT: return createEndpoint();
			case FhirPackage.ENDPOINT_STATUS: return createEndpointStatus();
			case FhirPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case FhirPackage.ENROLLMENT_REQUEST_STATUS: return createEnrollmentRequestStatus();
			case FhirPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case FhirPackage.ENROLLMENT_RESPONSE_STATUS: return createEnrollmentResponseStatus();
			case FhirPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case FhirPackage.EPISODE_OF_CARE_STATUS: return createEpisodeOfCareStatus();
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case FhirPackage.EVENT_TIMING: return createEventTiming();
			case FhirPackage.EXPANSION_PROFILE: return createExpansionProfile();
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM: return createExpansionProfileCodeSystem();
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM1: return createExpansionProfileCodeSystem1();
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM2: return createExpansionProfileCodeSystem2();
			case FhirPackage.EXPANSION_PROFILE_CONTACT: return createExpansionProfileContact();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION: return createExpansionProfileDesignation();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION1: return createExpansionProfileDesignation1();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION2: return createExpansionProfileDesignation2();
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE: return createExpansionProfileExclude();
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE1: return createExpansionProfileExclude1();
			case FhirPackage.EXPANSION_PROFILE_INCLUDE: return createExpansionProfileInclude();
			case FhirPackage.EXPANSION_PROFILE_INCLUDE1: return createExpansionProfileInclude1();
			case FhirPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: return createExplanationOfBenefitAccident();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM: return createExplanationOfBenefitAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION: return createExplanationOfBenefitAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: return createExplanationOfBenefitCareTeam();
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE: return createExplanationOfBenefitCoverage();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL: return createExplanationOfBenefitDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1: return createExplanationOfBenefitDetail1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL: return createExplanationOfBenefitFinancial();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INFORMATION: return createExplanationOfBenefitInformation();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM: return createExplanationOfBenefitItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH: return createExplanationOfBenefitMissingTeeth();
			case FhirPackage.EXPLANATION_OF_BENEFIT_NOTE: return createExplanationOfBenefitNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT: return createExplanationOfBenefitPayment();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: return createExplanationOfBenefitProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROSTHESIS: return createExplanationOfBenefitProsthesis();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED: return createExplanationOfBenefitRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS: return createExplanationOfBenefitStatus();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL: return createExplanationOfBenefitSubDetail();
			case FhirPackage.EXTENSION: return createExtension();
			case FhirPackage.EXTENSION_CONTEXT: return createExtensionContext();
			case FhirPackage.FAMILY_HISTORY_STATUS: return createFamilyHistoryStatus();
			case FhirPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case FhirPackage.FILTER_OPERATOR: return createFilterOperator();
			case FhirPackage.FLAG: return createFlag();
			case FhirPackage.FLAG_STATUS: return createFlagStatus();
			case FhirPackage.GOAL: return createGoal();
			case FhirPackage.GOAL_OUTCOME: return createGoalOutcome();
			case FhirPackage.GOAL_STATUS: return createGoalStatus();
			case FhirPackage.GROUP: return createGroup();
			case FhirPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case FhirPackage.GROUP_MEMBER: return createGroupMember();
			case FhirPackage.GROUP_TYPE: return createGroupType();
			case FhirPackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION: return createGuidanceResponseAction();
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION: return createGuidanceResponseRelatedAction();
			case FhirPackage.GUIDANCE_RESPONSE_STATUS: return createGuidanceResponseStatus();
			case FhirPackage.GUIDE_DEPENDENCY_TYPE: return createGuideDependencyType();
			case FhirPackage.GUIDE_PAGE_KIND: return createGuidePageKind();
			case FhirPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case FhirPackage.HTTP_VERB: return createHTTPVerb();
			case FhirPackage.HUMAN_NAME: return createHumanName();
			case FhirPackage.ID: return createId();
			case FhirPackage.IDENTIFIER: return createIdentifier();
			case FhirPackage.IDENTIFIER_USE: return createIdentifierUse();
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: return createIdentityAssuranceLevel();
			case FhirPackage.IMAGING_MANIFEST: return createImagingManifest();
			case FhirPackage.IMAGING_MANIFEST_BASE_LOCATION: return createImagingManifestBaseLocation();
			case FhirPackage.IMAGING_MANIFEST_BASE_LOCATION1: return createImagingManifestBaseLocation1();
			case FhirPackage.IMAGING_MANIFEST_INSTANCE: return createImagingManifestInstance();
			case FhirPackage.IMAGING_MANIFEST_SERIES: return createImagingManifestSeries();
			case FhirPackage.IMAGING_MANIFEST_STUDY: return createImagingManifestStudy();
			case FhirPackage.IMAGING_STUDY: return createImagingStudy();
			case FhirPackage.IMAGING_STUDY_BASE_LOCATION: return createImagingStudyBaseLocation();
			case FhirPackage.IMAGING_STUDY_BASE_LOCATION1: return createImagingStudyBaseLocation1();
			case FhirPackage.IMAGING_STUDY_INSTANCE: return createImagingStudyInstance();
			case FhirPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case FhirPackage.IMMUNIZATION: return createImmunization();
			case FhirPackage.IMMUNIZATION_EXPLANATION: return createImmunizationExplanation();
			case FhirPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL: return createImmunizationRecommendationProtocol();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL: return createImmunizationVaccinationProtocol();
			case FhirPackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case FhirPackage.IMPLEMENTATION_GUIDE_CONTACT: return createImplementationGuideContact();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDENCY: return createImplementationGuideDependency();
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case FhirPackage.IMPLEMENTATION_GUIDE_PACKAGE: return createImplementationGuidePackage();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE: return createImplementationGuidePage();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE: return createImplementationGuideResource();
			case FhirPackage.INSTANCE_AVAILABILITY: return createInstanceAvailability();
			case FhirPackage.INSTANT: return createInstant();
			case FhirPackage.INTEGER: return createInteger();
			case FhirPackage.ISSUE_SEVERITY: return createIssueSeverity();
			case FhirPackage.ISSUE_TYPE: return createIssueType();
			case FhirPackage.LIBRARY: return createLibrary();
			case FhirPackage.LIBRARY_STATUS: return createLibraryStatus();
			case FhirPackage.LINKAGE: return createLinkage();
			case FhirPackage.LINKAGE_ITEM: return createLinkageItem();
			case FhirPackage.LINKAGE_TYPE: return createLinkageType();
			case FhirPackage.LINK_TYPE: return createLinkType();
			case FhirPackage.LIST: return createList();
			case FhirPackage.LIST_ENTRY: return createListEntry();
			case FhirPackage.LIST_MODE: return createListMode();
			case FhirPackage.LIST_STATUS: return createListStatus();
			case FhirPackage.LOCATION: return createLocation();
			case FhirPackage.LOCATION_MODE: return createLocationMode();
			case FhirPackage.LOCATION_POSITION: return createLocationPosition();
			case FhirPackage.LOCATION_STATUS: return createLocationStatus();
			case FhirPackage.MARKDOWN: return createMarkdown();
			case FhirPackage.MEASMNT_PRINCIPLE: return createMeasmntPrinciple();
			case FhirPackage.MEASURE: return createMeasure();
			case FhirPackage.MEASURE_DATA_USAGE: return createMeasureDataUsage();
			case FhirPackage.MEASURE_GROUP: return createMeasureGroup();
			case FhirPackage.MEASURE_POPULATION: return createMeasurePopulation();
			case FhirPackage.MEASURE_POPULATION_TYPE: return createMeasurePopulationType();
			case FhirPackage.MEASURE_REPORT: return createMeasureReport();
			case FhirPackage.MEASURE_REPORT_GROUP: return createMeasureReportGroup();
			case FhirPackage.MEASURE_REPORT_GROUP1: return createMeasureReportGroup1();
			case FhirPackage.MEASURE_REPORT_GROUP2: return createMeasureReportGroup2();
			case FhirPackage.MEASURE_REPORT_POPULATION: return createMeasureReportPopulation();
			case FhirPackage.MEASURE_REPORT_POPULATION1: return createMeasureReportPopulation1();
			case FhirPackage.MEASURE_REPORT_STATUS: return createMeasureReportStatus();
			case FhirPackage.MEASURE_REPORT_STRATIFIER: return createMeasureReportStratifier();
			case FhirPackage.MEASURE_REPORT_SUPPLEMENTAL_DATA: return createMeasureReportSupplementalData();
			case FhirPackage.MEASURE_REPORT_TYPE: return createMeasureReportType();
			case FhirPackage.MEASURE_SCORING: return createMeasureScoring();
			case FhirPackage.MEASURE_STRATIFIER: return createMeasureStratifier();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA: return createMeasureSupplementalData();
			case FhirPackage.MEASURE_TYPE: return createMeasureType();
			case FhirPackage.MEDIA: return createMedia();
			case FhirPackage.MEDICATION: return createMedication();
			case FhirPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case FhirPackage.MEDICATION_ADMINISTRATION_EVENT_HISTORY: return createMedicationAdministrationEventHistory();
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS: return createMedicationAdministrationStatus();
			case FhirPackage.MEDICATION_BATCH: return createMedicationBatch();
			case FhirPackage.MEDICATION_CONTENT: return createMedicationContent();
			case FhirPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION: return createMedicationDispenseDosageInstruction();
			case FhirPackage.MEDICATION_DISPENSE_EVENT_HISTORY: return createMedicationDispenseEventHistory();
			case FhirPackage.MEDICATION_DISPENSE_STATUS: return createMedicationDispenseStatus();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case FhirPackage.MEDICATION_INGREDIENT: return createMedicationIngredient();
			case FhirPackage.MEDICATION_ORDER: return createMedicationOrder();
			case FhirPackage.MEDICATION_ORDER_CATEGORY: return createMedicationOrderCategory();
			case FhirPackage.MEDICATION_ORDER_DISPENSE_REQUEST: return createMedicationOrderDispenseRequest();
			case FhirPackage.MEDICATION_ORDER_DOSAGE_INSTRUCTION: return createMedicationOrderDosageInstruction();
			case FhirPackage.MEDICATION_ORDER_EVENT_HISTORY: return createMedicationOrderEventHistory();
			case FhirPackage.MEDICATION_ORDER_STATUS: return createMedicationOrderStatus();
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION: return createMedicationOrderSubstitution();
			case FhirPackage.MEDICATION_PACKAGE: return createMedicationPackage();
			case FhirPackage.MEDICATION_PRODUCT: return createMedicationProduct();
			case FhirPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case FhirPackage.MEDICATION_STATEMENT_CATEGORY: return createMedicationStatementCategory();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE: return createMedicationStatementDosage();
			case FhirPackage.MEDICATION_STATEMENT_STATUS: return createMedicationStatementStatus();
			case FhirPackage.MESSAGE_HEADER: return createMessageHeader();
			case FhirPackage.MESSAGE_HEADER_DESTINATION: return createMessageHeaderDestination();
			case FhirPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case FhirPackage.MESSAGE_HEADER_SOURCE: return createMessageHeaderSource();
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: return createMessageSignificanceCategory();
			case FhirPackage.META: return createMeta();
			case FhirPackage.MONEY: return createMoney();
			case FhirPackage.NAME_USE: return createNameUse();
			case FhirPackage.NAMING_SYSTEM: return createNamingSystem();
			case FhirPackage.NAMING_SYSTEM_CONTACT: return createNamingSystemContact();
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: return createNamingSystemIdentifierType();
			case FhirPackage.NAMING_SYSTEM_TYPE: return createNamingSystemType();
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case FhirPackage.NARRATIVE: return createNarrative();
			case FhirPackage.NARRATIVE_STATUS: return createNarrativeStatus();
			case FhirPackage.NOTE_TYPE: return createNoteType();
			case FhirPackage.NUTRITION_ORDER_STATUS: return createNutritionOrderStatus();
			case FhirPackage.NUTRITION_REQUEST: return createNutritionRequest();
			case FhirPackage.NUTRITION_REQUEST_ADMINISTRATION: return createNutritionRequestAdministration();
			case FhirPackage.NUTRITION_REQUEST_ENTERAL_FORMULA: return createNutritionRequestEnteralFormula();
			case FhirPackage.NUTRITION_REQUEST_NUTRIENT: return createNutritionRequestNutrient();
			case FhirPackage.NUTRITION_REQUEST_ORAL_DIET: return createNutritionRequestOralDiet();
			case FhirPackage.NUTRITION_REQUEST_SUPPLEMENT: return createNutritionRequestSupplement();
			case FhirPackage.NUTRITION_REQUEST_TEXTURE: return createNutritionRequestTexture();
			case FhirPackage.OBSERVATION: return createObservation();
			case FhirPackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case FhirPackage.OBSERVATION_RELATED: return createObservationRelated();
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE: return createObservationRelationshipType();
			case FhirPackage.OBSERVATION_STATUS: return createObservationStatus();
			case FhirPackage.OID: return createOid();
			case FhirPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case FhirPackage.OPERATION_DEFINITION_BINDING: return createOperationDefinitionBinding();
			case FhirPackage.OPERATION_DEFINITION_CONTACT: return createOperationDefinitionContact();
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case FhirPackage.OPERATION_KIND: return createOperationKind();
			case FhirPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case FhirPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case FhirPackage.OPERATION_PARAMETER_USE: return createOperationParameterUse();
			case FhirPackage.ORGANIZATION: return createOrganization();
			case FhirPackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			case FhirPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			case FhirPackage.PARAMETERS: return createParameters();
			case FhirPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case FhirPackage.PARTICIPANT_REQUIRED: return createParticipantRequired();
			case FhirPackage.PARTICIPATION_STATUS: return createParticipationStatus();
			case FhirPackage.PATIENT: return createPatient();
			case FhirPackage.PATIENT_ANIMAL: return createPatientAnimal();
			case FhirPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case FhirPackage.PATIENT_CONTACT: return createPatientContact();
			case FhirPackage.PATIENT_LINK: return createPatientLink();
			case FhirPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case FhirPackage.PAYMENT_NOTICE_STATUS: return createPaymentNoticeStatus();
			case FhirPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL: return createPaymentReconciliationDetail();
			case FhirPackage.PAYMENT_RECONCILIATION_NOTE: return createPaymentReconciliationNote();
			case FhirPackage.PAYMENT_RECONCILIATION_STATUS: return createPaymentReconciliationStatus();
			case FhirPackage.PERIOD: return createPeriod();
			case FhirPackage.PERSON: return createPerson();
			case FhirPackage.PERSON_LINK: return createPersonLink();
			case FhirPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR: return createPlanActionCardinalityBehavior();
			case FhirPackage.PLAN_ACTION_GROUPING_BEHAVIOR: return createPlanActionGroupingBehavior();
			case FhirPackage.PLAN_ACTION_PARTICIPANT_TYPE: return createPlanActionParticipantType();
			case FhirPackage.PLAN_ACTION_PRECHECK_BEHAVIOR: return createPlanActionPrecheckBehavior();
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_ANCHOR: return createPlanActionRelationshipAnchor();
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_TYPE: return createPlanActionRelationshipType();
			case FhirPackage.PLAN_ACTION_REQUIRED_BEHAVIOR: return createPlanActionRequiredBehavior();
			case FhirPackage.PLAN_ACTION_SELECTION_BEHAVIOR: return createPlanActionSelectionBehavior();
			case FhirPackage.PLAN_DEFINITION: return createPlanDefinition();
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION: return createPlanDefinitionActionDefinition();
			case FhirPackage.PLAN_DEFINITION_CONDITION: return createPlanDefinitionCondition();
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE: return createPlanDefinitionDynamicValue();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION: return createPlanDefinitionRelatedAction();
			case FhirPackage.POSITIVE_INT: return createPositiveInt();
			case FhirPackage.PRACTITIONER: return createPractitioner();
			case FhirPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case FhirPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case FhirPackage.PRACTITIONER_ROLE1: return createPractitionerRole1();
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: return createPractitionerRoleAvailableTime();
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: return createPractitionerRoleNotAvailable();
			case FhirPackage.PROCEDURE: return createProcedure();
			case FhirPackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case FhirPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case FhirPackage.PROCEDURE_REQUEST: return createProcedureRequest();
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY: return createProcedureRequestPriority();
			case FhirPackage.PROCEDURE_REQUEST_STATUS: return createProcedureRequestStatus();
			case FhirPackage.PROCEDURE_STATUS: return createProcedureStatus();
			case FhirPackage.PROCESS_REQUEST: return createProcessRequest();
			case FhirPackage.PROCESS_REQUEST_ITEM: return createProcessRequestItem();
			case FhirPackage.PROCESS_REQUEST_STATUS: return createProcessRequestStatus();
			case FhirPackage.PROCESS_RESPONSE: return createProcessResponse();
			case FhirPackage.PROCESS_RESPONSE_NOTES: return createProcessResponseNotes();
			case FhirPackage.PROCESS_RESPONSE_STATUS: return createProcessResponseStatus();
			case FhirPackage.PROPERTY_REPRESENTATION: return createPropertyRepresentation();
			case FhirPackage.PROPERTY_TYPE: return createPropertyType();
			case FhirPackage.PROVENANCE: return createProvenance();
			case FhirPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case FhirPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case FhirPackage.PROVENANCE_ENTITY_ROLE: return createProvenanceEntityRole();
			case FhirPackage.PROVENANCE_RELATED_AGENT: return createProvenanceRelatedAgent();
			case FhirPackage.QUANTITY: return createQuantity();
			case FhirPackage.QUANTITY_COMPARATOR: return createQuantityComparator();
			case FhirPackage.QUESTIONNAIRE: return createQuestionnaire();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN: return createQuestionnaireEnableWhen();
			case FhirPackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE: return createQuestionnaireItemType();
			case FhirPackage.QUESTIONNAIRE_OPTION: return createQuestionnaireOption();
			case FhirPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER: return createQuestionnaireResponseAnswer();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS: return createQuestionnaireResponseStatus();
			case FhirPackage.QUESTIONNAIRE_STATUS: return createQuestionnaireStatus();
			case FhirPackage.RANGE: return createRange();
			case FhirPackage.RATIO: return createRatio();
			case FhirPackage.REFERENCE: return createReference();
			case FhirPackage.REFERENCE_VERSION_RULES: return createReferenceVersionRules();
			case FhirPackage.REFERRAL_CATEGORY: return createReferralCategory();
			case FhirPackage.REFERRAL_REQUEST: return createReferralRequest();
			case FhirPackage.REFERRAL_STATUS: return createReferralStatus();
			case FhirPackage.RELATED_PERSON: return createRelatedPerson();
			case FhirPackage.RELATED_RESOURCE: return createRelatedResource();
			case FhirPackage.RELATED_RESOURCE_TYPE: return createRelatedResourceType();
			case FhirPackage.REMITTANCE_OUTCOME: return createRemittanceOutcome();
			case FhirPackage.RESOURCE: return createResource();
			case FhirPackage.RESOURCE_CONTAINER: return createResourceContainer();
			case FhirPackage.RESOURCE_VERSION_POLICY: return createResourceVersionPolicy();
			case FhirPackage.RESPONSE_TYPE: return createResponseType();
			case FhirPackage.RESTFUL_CONFORMANCE_MODE: return createRestfulConformanceMode();
			case FhirPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case FhirPackage.SAMPLED_DATA: return createSampledData();
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: return createSampledDataDataType();
			case FhirPackage.SCHEDULE: return createSchedule();
			case FhirPackage.SEARCH_ENTRY_MODE: return createSearchEntryMode();
			case FhirPackage.SEARCH_MODIFIER_CODE: return createSearchModifierCode();
			case FhirPackage.SEARCH_PARAMETER: return createSearchParameter();
			case FhirPackage.SEARCH_PARAMETER_CONTACT: return createSearchParameterContact();
			case FhirPackage.SEARCH_PARAM_TYPE: return createSearchParamType();
			case FhirPackage.SEQUENCE: return createSequence();
			case FhirPackage.SEQUENCE_INNER: return createSequenceInner();
			case FhirPackage.SEQUENCE_OUTER: return createSequenceOuter();
			case FhirPackage.SEQUENCE_QUALITY: return createSequenceQuality();
			case FhirPackage.SEQUENCE_REFERENCE_SEQ: return createSequenceReferenceSeq();
			case FhirPackage.SEQUENCE_REPOSITORY: return createSequenceRepository();
			case FhirPackage.SEQUENCE_STRUCTURE_VARIANT: return createSequenceStructureVariant();
			case FhirPackage.SEQUENCE_TYPE: return createSequenceType();
			case FhirPackage.SEQUENCE_VARIANT: return createSequenceVariant();
			case FhirPackage.SIGNATURE: return createSignature();
			case FhirPackage.SLICING_RULES: return createSlicingRules();
			case FhirPackage.SLOT: return createSlot();
			case FhirPackage.SLOT_STATUS: return createSlotStatus();
			case FhirPackage.SPECIMEN: return createSpecimen();
			case FhirPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case FhirPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case FhirPackage.SPECIMEN_STATUS: return createSpecimenStatus();
			case FhirPackage.SPECIMEN_TREATMENT: return createSpecimenTreatment();
			case FhirPackage.STRING: return createString();
			case FhirPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FhirPackage.STRUCTURE_DEFINITION_CONTACT: return createStructureDefinitionContact();
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case FhirPackage.STRUCTURE_DEFINITION_KIND: return createStructureDefinitionKind();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case FhirPackage.STRUCTURE_MAP: return createStructureMap();
			case FhirPackage.STRUCTURE_MAP_CONTACT: return createStructureMapContact();
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE: return createStructureMapContextType();
			case FhirPackage.STRUCTURE_MAP_DEPENDENT: return createStructureMapDependent();
			case FhirPackage.STRUCTURE_MAP_GROUP: return createStructureMapGroup();
			case FhirPackage.STRUCTURE_MAP_INPUT: return createStructureMapInput();
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE: return createStructureMapInputMode();
			case FhirPackage.STRUCTURE_MAP_LIST_MODE: return createStructureMapListMode();
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE: return createStructureMapModelMode();
			case FhirPackage.STRUCTURE_MAP_PARAMETER: return createStructureMapParameter();
			case FhirPackage.STRUCTURE_MAP_RULE: return createStructureMapRule();
			case FhirPackage.STRUCTURE_MAP_SOURCE: return createStructureMapSource();
			case FhirPackage.STRUCTURE_MAP_STRUCTURE: return createStructureMapStructure();
			case FhirPackage.STRUCTURE_MAP_TARGET: return createStructureMapTarget();
			case FhirPackage.STRUCTURE_MAP_TRANSFORM: return createStructureMapTransform();
			case FhirPackage.SUBSCRIPTION: return createSubscription();
			case FhirPackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE: return createSubscriptionChannelType();
			case FhirPackage.SUBSCRIPTION_STATUS: return createSubscriptionStatus();
			case FhirPackage.SUBSTANCE: return createSubstance();
			case FhirPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case FhirPackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case FhirPackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case FhirPackage.SUPPLY_DELIVERY_STATUS: return createSupplyDeliveryStatus();
			case FhirPackage.SUPPLY_REQUEST: return createSupplyRequest();
			case FhirPackage.SUPPLY_REQUEST_STATUS: return createSupplyRequestStatus();
			case FhirPackage.SUPPLY_REQUEST_WHEN: return createSupplyRequestWhen();
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: return createSystemRestfulInteraction();
			case FhirPackage.TASK: return createTask();
			case FhirPackage.TASK_FULFILLMENT: return createTaskFulfillment();
			case FhirPackage.TASK_INPUT: return createTaskInput();
			case FhirPackage.TASK_OUTPUT: return createTaskOutput();
			case FhirPackage.TASK_PRIORITY: return createTaskPriority();
			case FhirPackage.TASK_STATUS: return createTaskStatus();
			case FhirPackage.TEST_SCRIPT: return createTestScript();
			case FhirPackage.TEST_SCRIPT_ACTION: return createTestScriptAction();
			case FhirPackage.TEST_SCRIPT_ACTION1: return createTestScriptAction1();
			case FhirPackage.TEST_SCRIPT_ACTION2: return createTestScriptAction2();
			case FhirPackage.TEST_SCRIPT_ASSERT: return createTestScriptAssert();
			case FhirPackage.TEST_SCRIPT_CAPABILITY: return createTestScriptCapability();
			case FhirPackage.TEST_SCRIPT_CONTACT: return createTestScriptContact();
			case FhirPackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case FhirPackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case FhirPackage.TEST_SCRIPT_LINK: return createTestScriptLink();
			case FhirPackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case FhirPackage.TEST_SCRIPT_OPERATION: return createTestScriptOperation();
			case FhirPackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case FhirPackage.TEST_SCRIPT_PARAM: return createTestScriptParam();
			case FhirPackage.TEST_SCRIPT_PARAM1: return createTestScriptParam1();
			case FhirPackage.TEST_SCRIPT_PARAM2: return createTestScriptParam2();
			case FhirPackage.TEST_SCRIPT_PARAM3: return createTestScriptParam3();
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER: return createTestScriptRequestHeader();
			case FhirPackage.TEST_SCRIPT_RULE: return createTestScriptRule();
			case FhirPackage.TEST_SCRIPT_RULE1: return createTestScriptRule1();
			case FhirPackage.TEST_SCRIPT_RULE2: return createTestScriptRule2();
			case FhirPackage.TEST_SCRIPT_RULE3: return createTestScriptRule3();
			case FhirPackage.TEST_SCRIPT_RULESET: return createTestScriptRuleset();
			case FhirPackage.TEST_SCRIPT_RULESET1: return createTestScriptRuleset1();
			case FhirPackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case FhirPackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case FhirPackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case FhirPackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case FhirPackage.TIME: return createTime();
			case FhirPackage.TIMING: return createTiming();
			case FhirPackage.TIMING_REPEAT: return createTimingRepeat();
			case FhirPackage.TRIGGER_DEFINITION: return createTriggerDefinition();
			case FhirPackage.TRIGGER_TYPE: return createTriggerType();
			case FhirPackage.TYPE_DERIVATION_RULE: return createTypeDerivationRule();
			case FhirPackage.TYPE_RESTFUL_INTERACTION: return createTypeRestfulInteraction();
			case FhirPackage.UNITS_OF_TIME: return createUnitsOfTime();
			case FhirPackage.UNKNOWN_CONTENT_CODE: return createUnknownContentCode();
			case FhirPackage.UNSIGNED_INT: return createUnsignedInt();
			case FhirPackage.URI: return createUri();
			case FhirPackage.USAGE_CONTEXT: return createUsageContext();
			case FhirPackage.USE: return createUse();
			case FhirPackage.UUID: return createUuid();
			case FhirPackage.VALUE_SET: return createValueSet();
			case FhirPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case FhirPackage.VALUE_SET_CONCEPT: return createValueSetConcept();
			case FhirPackage.VALUE_SET_CONTACT: return createValueSetContact();
			case FhirPackage.VALUE_SET_CONTAINS: return createValueSetContains();
			case FhirPackage.VALUE_SET_DESIGNATION: return createValueSetDesignation();
			case FhirPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case FhirPackage.VALUE_SET_FILTER: return createValueSetFilter();
			case FhirPackage.VALUE_SET_INCLUDE: return createValueSetInclude();
			case FhirPackage.VALUE_SET_PARAMETER: return createValueSetParameter();
			case FhirPackage.VISION_BASE: return createVisionBase();
			case FhirPackage.VISION_EYES: return createVisionEyes();
			case FhirPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE: return createVisionPrescriptionDispense();
			case FhirPackage.XPATH_USAGE_TYPE: return createXPathUsageType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return createAccountStatusListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_LIST_LIST:
				return createActionListListFromString(eDataType, initialValue);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST:
				return createActivityDefinitionCategoryListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return createAddressTypeListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return createAddressUseListFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return createAdministrativeGenderListFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return createAggregationModeListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return createAllergyIntoleranceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST:
				return createAllergyIntoleranceCertaintyListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return createAllergyIntoleranceCriticalityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return createAllergyIntoleranceSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST:
				return createAllergyIntoleranceStatusListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return createAllergyIntoleranceTypeListFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return createAppointmentStatusListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return createAssertionDirectionTypeListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return createAssertionOperatorTypeListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return createAssertionResponseTypesListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return createAuditEventActionListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return createAuditEventAgentNetworkTypeListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return createAuditEventOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return createBindingStrengthListFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return createBundleTypeListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return createCarePlanActivityStatusListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_RELATIONSHIP_LIST:
				return createCarePlanRelationshipListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return createCarePlanStatusListFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_RESPONSE_STATUS_LIST:
				return createClaimResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_STATUS_LIST:
				return createClaimStatusListFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return createClinicalImpressionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return createCodeSystemContentModeListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return createCodeSystemHierarchyMeaningListFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST:
				return createCommunicationRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST:
				return createCommunicationStatusListFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return createCompartmentTypeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return createCompositionAttestationModeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return createCompositionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return createConceptMapEquivalenceListFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return createConditionalDeleteStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return createConditionalReadStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST:
				return createConditionVerificationStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST:
				return createConformanceEventModeListFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST:
				return createConformanceResourceStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_STATEMENT_KIND_LIST:
				return createConformanceStatementKindListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return createConsentDataMeaningListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST:
				return createConsentExceptTypeListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATUS_LIST:
				return createConsentStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return createConstraintSeverityListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return createContactPointSystemListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return createContactPointUseListFromString(eDataType, initialValue);
			case FhirPackage.CONTENT_TYPE_LIST:
				return createContentTypeListFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return createContributorTypeListFromString(eDataType, initialValue);
			case FhirPackage.COVERAGE_STATUS_LIST:
				return createCoverageStatusListFromString(eDataType, initialValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST:
				return createDataElementStringencyListFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return createDaysOfWeekListFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return createDetectedIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return createDeviceMetricCalibrationStateListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return createDeviceMetricCalibrationTypeListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return createDeviceMetricCategoryListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return createDeviceMetricColorListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return createDeviceMetricOperationalStatusListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_STATUS_LIST:
				return createDeviceStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return createDiagnosticReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return createDigitalMediaTypeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return createDocumentModeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return createDocumentReferenceStatusListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return createDocumentRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_REQUEST_STATUS_LIST:
				return createEligibilityRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_STATUS_LIST:
				return createEligibilityResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return createEncounterLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return createEncounterStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return createEndpointStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENROLLMENT_REQUEST_STATUS_LIST:
				return createEnrollmentRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENROLLMENT_RESPONSE_STATUS_LIST:
				return createEnrollmentResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return createEpisodeOfCareStatusListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return createEventTimingListFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return createExplanationOfBenefitStatusListFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return createExtensionContextListFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return createFamilyHistoryStatusListFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return createFilterOperatorListFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return createFlagStatusListFromString(eDataType, initialValue);
			case FhirPackage.GOAL_STATUS_LIST:
				return createGoalStatusListFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return createGroupTypeListFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return createGuidanceResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST:
				return createGuideDependencyTypeListFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST:
				return createGuidePageKindListFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST:
				return createHTTPVerbListFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return createIdentifierUseListFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return createIdentityAssuranceLevelListFromString(eDataType, initialValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return createInstanceAvailabilityListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return createIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_LIST:
				return createIssueTypeListFromString(eDataType, initialValue);
			case FhirPackage.LIBRARY_STATUS_LIST:
				return createLibraryStatusListFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return createLinkageTypeListFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST:
				return createLinkTypeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST:
				return createListModeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST:
				return createListStatusListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return createLocationModeListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return createLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return createMeasmntPrincipleListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_DATA_USAGE_LIST:
				return createMeasureDataUsageListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST:
				return createMeasurePopulationTypeListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return createMeasureReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return createMeasureReportTypeListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_SCORING_LIST:
				return createMeasureScoringListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_TYPE_LIST:
				return createMeasureTypeListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return createMedicationAdministrationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return createMedicationDispenseStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ORDER_CATEGORY_LIST:
				return createMedicationOrderCategoryListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ORDER_STATUS_LIST:
				return createMedicationOrderStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_CATEGORY_LIST:
				return createMedicationStatementCategoryListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return createMedicationStatementStatusListFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return createMessageSignificanceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST:
				return createNameUseListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return createNamingSystemIdentifierTypeListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return createNamingSystemTypeListFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return createNarrativeStatusListFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return createNoteTypeListFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return createNutritionOrderStatusListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return createObservationRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return createObservationStatusListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return createOperationKindListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return createOperationParameterUseListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return createParticipantRequiredListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return createParticipationStatusListFromString(eDataType, initialValue);
			case FhirPackage.PAYMENT_NOTICE_STATUS_LIST:
				return createPaymentNoticeStatusListFromString(eDataType, initialValue);
			case FhirPackage.PAYMENT_RECONCILIATION_STATUS_LIST:
				return createPaymentReconciliationStatusListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR_LIST:
				return createPlanActionCardinalityBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_GROUPING_BEHAVIOR_LIST:
				return createPlanActionGroupingBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_PARTICIPANT_TYPE_LIST:
				return createPlanActionParticipantTypeListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_PRECHECK_BEHAVIOR_LIST:
				return createPlanActionPrecheckBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_ANCHOR_LIST:
				return createPlanActionRelationshipAnchorListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_TYPE_LIST:
				return createPlanActionRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_REQUIRED_BEHAVIOR_LIST:
				return createPlanActionRequiredBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_SELECTION_BEHAVIOR_LIST:
				return createPlanActionSelectionBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST:
				return createProcedureRequestPriorityListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST:
				return createProcedureRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return createProcedureStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROCESS_REQUEST_STATUS_LIST:
				return createProcessRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROCESS_RESPONSE_STATUS_LIST:
				return createProcessResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return createPropertyRepresentationListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return createPropertyTypeListFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return createProvenanceEntityRoleListFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return createQuantityComparatorListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return createQuestionnaireItemTypeListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return createQuestionnaireResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return createQuestionnaireStatusListFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return createReferenceVersionRulesListFromString(eDataType, initialValue);
			case FhirPackage.REFERRAL_CATEGORY_LIST:
				return createReferralCategoryListFromString(eDataType, initialValue);
			case FhirPackage.REFERRAL_STATUS_LIST:
				return createReferralStatusListFromString(eDataType, initialValue);
			case FhirPackage.RELATED_RESOURCE_TYPE_LIST:
				return createRelatedResourceTypeListFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return createRemittanceOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return createResourceVersionPolicyListFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return createResponseTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST:
				return createRestfulConformanceModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return createSearchEntryModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return createSearchModifierCodeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return createSearchParamTypeListFromString(eDataType, initialValue);
			case FhirPackage.SEQUENCE_TYPE_LIST:
				return createSequenceTypeListFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST:
				return createSlicingRulesListFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return createSlotStatusListFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return createSpecimenStatusListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return createStructureDefinitionKindListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return createStructureMapContextTypeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return createStructureMapInputModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_LIST_MODE_LIST:
				return createStructureMapListModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return createStructureMapModelModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return createStructureMapTransformListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return createSubscriptionChannelTypeListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return createSubscriptionStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return createSupplyDeliveryStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return createSupplyRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return createSystemRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.TASK_PRIORITY_LIST:
				return createTaskPriorityListFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_LIST:
				return createTaskStatusListFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return createTriggerTypeListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return createTypeDerivationRuleListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return createTypeRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return createUnitsOfTimeListFromString(eDataType, initialValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST:
				return createUnknownContentCodeListFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST:
				return createUseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST:
				return createVisionBaseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST:
				return createVisionEyesListFromString(eDataType, initialValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return createXPathUsageTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return createAccountStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return createActionListListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST_OBJECT:
				return createActivityDefinitionCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return createAddressTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return createAddressUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return createAdministrativeGenderListObjectFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return createAggregationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return createAllergyIntoleranceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST_OBJECT:
				return createAllergyIntoleranceCertaintyListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return createAllergyIntoleranceCriticalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return createAllergyIntoleranceSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST_OBJECT:
				return createAllergyIntoleranceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return createAllergyIntoleranceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return createAppointmentStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return createAssertionDirectionTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return createAssertionOperatorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return createAssertionResponseTypesListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return createAuditEventActionListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return createAuditEventAgentNetworkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return createAuditEventOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return createBase64BinaryPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return createBindingStrengthListObjectFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return createBooleanPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return createBooleanPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return createBundleTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return createCarePlanActivityStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_RELATIONSHIP_LIST_OBJECT:
				return createCarePlanRelationshipListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return createCarePlanStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_RESPONSE_STATUS_LIST_OBJECT:
				return createClaimResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_STATUS_LIST_OBJECT:
				return createClaimStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return createClinicalImpressionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_PRIMITIVE:
				return createCodePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return createCodeSystemContentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return createCodeSystemHierarchyMeaningListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST_OBJECT:
				return createCommunicationRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST_OBJECT:
				return createCommunicationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return createCompartmentTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return createCompositionAttestationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return createCompositionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return createConceptMapEquivalenceListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return createConditionalDeleteStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return createConditionalReadStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST_OBJECT:
				return createConditionVerificationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST_OBJECT:
				return createConformanceEventModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST_OBJECT:
				return createConformanceResourceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_STATEMENT_KIND_LIST_OBJECT:
				return createConformanceStatementKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return createConsentDataMeaningListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST_OBJECT:
				return createConsentExceptTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATUS_LIST_OBJECT:
				return createConsentStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return createConstraintSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return createContactPointSystemListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return createContactPointUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTENT_TYPE_LIST_OBJECT:
				return createContentTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return createContributorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COVERAGE_STATUS_LIST_OBJECT:
				return createCoverageStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST_OBJECT:
				return createDataElementStringencyListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE:
				return createDatePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return createDatePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return createDateTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return createDateTimePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return createDaysOfWeekListObjectFromString(eDataType, initialValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return createDecimalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return createDetectedIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return createDeviceMetricCalibrationStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return createDeviceMetricCalibrationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return createDeviceMetricCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return createDeviceMetricColorListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return createDeviceMetricOperationalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_STATUS_LIST_OBJECT:
				return createDeviceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return createDiagnosticReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return createDigitalMediaTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return createDocumentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return createDocumentReferenceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createDocumentRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_REQUEST_STATUS_LIST_OBJECT:
				return createEligibilityRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_STATUS_LIST_OBJECT:
				return createEligibilityResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return createEncounterLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return createEncounterStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return createEndpointStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENROLLMENT_REQUEST_STATUS_LIST_OBJECT:
				return createEnrollmentRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENROLLMENT_RESPONSE_STATUS_LIST_OBJECT:
				return createEnrollmentResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return createEpisodeOfCareStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return createEventTimingListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return createExplanationOfBenefitStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return createExtensionContextListObjectFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return createFamilyHistoryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return createFilterOperatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return createFlagStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return createGoalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return createGroupTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return createGuidanceResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST_OBJECT:
				return createGuideDependencyTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST_OBJECT:
				return createGuidePageKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return createHTTPVerbListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return createIdentifierUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return createIdentityAssuranceLevelListObjectFromString(eDataType, initialValue);
			case FhirPackage.ID_PRIMITIVE:
				return createIdPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return createInstanceAvailabilityListObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return createInstantPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return createIntegerPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return createIntegerPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return createIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return createIssueTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIBRARY_STATUS_LIST_OBJECT:
				return createLibraryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return createLinkageTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return createLinkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return createListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return createListStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return createLocationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return createLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return createMarkdownPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return createMeasmntPrincipleListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_DATA_USAGE_LIST_OBJECT:
				return createMeasureDataUsageListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST_OBJECT:
				return createMeasurePopulationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return createMeasureReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return createMeasureReportTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_SCORING_LIST_OBJECT:
				return createMeasureScoringListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_TYPE_LIST_OBJECT:
				return createMeasureTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return createMedicationAdministrationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return createMedicationDispenseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ORDER_CATEGORY_LIST_OBJECT:
				return createMedicationOrderCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ORDER_STATUS_LIST_OBJECT:
				return createMedicationOrderStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_CATEGORY_LIST_OBJECT:
				return createMedicationStatementCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return createMedicationStatementStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return createMessageSignificanceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return createNameUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return createNamingSystemIdentifierTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return createNamingSystemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return createNarrativeStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return createNoteTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return createNutritionOrderStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createObservationRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return createObservationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OID_PRIMITIVE:
				return createOidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return createOperationKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return createOperationParameterUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return createParticipantRequiredListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return createParticipationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PAYMENT_NOTICE_STATUS_LIST_OBJECT:
				return createPaymentNoticeStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PAYMENT_RECONCILIATION_STATUS_LIST_OBJECT:
				return createPaymentReconciliationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return createPlanActionCardinalityBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return createPlanActionGroupingBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return createPlanActionParticipantTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return createPlanActionPrecheckBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_ANCHOR_LIST_OBJECT:
				return createPlanActionRelationshipAnchorListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createPlanActionRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return createPlanActionRequiredBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.PLAN_ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return createPlanActionSelectionBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return createPositiveIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST_OBJECT:
				return createProcedureRequestPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST_OBJECT:
				return createProcedureRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_STATUS_LIST_OBJECT:
				return createProcedureStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCESS_REQUEST_STATUS_LIST_OBJECT:
				return createProcessRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCESS_RESPONSE_STATUS_LIST_OBJECT:
				return createProcessResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return createPropertyRepresentationListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return createPropertyTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return createProvenanceEntityRoleListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return createQuantityComparatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return createQuestionnaireItemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return createQuestionnaireResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST_OBJECT:
				return createQuestionnaireStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return createReferenceVersionRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERRAL_CATEGORY_LIST_OBJECT:
				return createReferralCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERRAL_STATUS_LIST_OBJECT:
				return createReferralStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RELATED_RESOURCE_TYPE_LIST_OBJECT:
				return createRelatedResourceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return createRemittanceOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return createResourceVersionPolicyListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return createResponseTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST_OBJECT:
				return createRestfulConformanceModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return createSampledDataDataTypePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return createSearchEntryModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return createSearchModifierCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return createSearchParamTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEQUENCE_TYPE_LIST_OBJECT:
				return createSequenceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return createSlicingRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return createSlotStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return createSpecimenStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRING_PRIMITIVE:
				return createStringPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return createStructureDefinitionKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return createStructureMapContextTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return createStructureMapInputModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_LIST_MODE_LIST_OBJECT:
				return createStructureMapListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return createStructureMapModelModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return createStructureMapTransformListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return createSubscriptionChannelTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return createSubscriptionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return createSupplyDeliveryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return createSupplyRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return createSystemRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_PRIORITY_LIST_OBJECT:
				return createTaskPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return createTaskStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.TIME_PRIMITIVE:
				return createTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return createTriggerTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return createTypeDerivationRuleListObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return createTypeRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return createUnitsOfTimeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST_OBJECT:
				return createUnknownContentCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return createUnsignedIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URI_PRIMITIVE:
				return createUriPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST_OBJECT:
				return createUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.UUID_PRIMITIVE:
				return createUuidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return createVisionBaseListObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return createVisionEyesListObjectFromString(eDataType, initialValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return createXPathUsageTypeListObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return convertAccountStatusListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_LIST_LIST:
				return convertActionListListToString(eDataType, instanceValue);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST:
				return convertActivityDefinitionCategoryListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return convertAddressTypeListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return convertAddressUseListToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return convertAdministrativeGenderListToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return convertAggregationModeListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return convertAllergyIntoleranceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST:
				return convertAllergyIntoleranceCertaintyListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return convertAllergyIntoleranceCriticalityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return convertAllergyIntoleranceSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST:
				return convertAllergyIntoleranceStatusListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return convertAllergyIntoleranceTypeListToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return convertAppointmentStatusListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return convertAssertionDirectionTypeListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return convertAssertionOperatorTypeListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return convertAssertionResponseTypesListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return convertAuditEventActionListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return convertAuditEventAgentNetworkTypeListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return convertAuditEventOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return convertBindingStrengthListToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return convertBundleTypeListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return convertCarePlanActivityStatusListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_RELATIONSHIP_LIST:
				return convertCarePlanRelationshipListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return convertCarePlanStatusListToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_RESPONSE_STATUS_LIST:
				return convertClaimResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_STATUS_LIST:
				return convertClaimStatusListToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return convertClinicalImpressionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return convertCodeSystemContentModeListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return convertCodeSystemHierarchyMeaningListToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST:
				return convertCommunicationRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST:
				return convertCommunicationStatusListToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return convertCompartmentTypeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return convertCompositionAttestationModeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return convertCompositionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return convertConceptMapEquivalenceListToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return convertConditionalDeleteStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return convertConditionalReadStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST:
				return convertConditionVerificationStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST:
				return convertConformanceEventModeListToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST:
				return convertConformanceResourceStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_STATEMENT_KIND_LIST:
				return convertConformanceStatementKindListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return convertConsentDataMeaningListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST:
				return convertConsentExceptTypeListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATUS_LIST:
				return convertConsentStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return convertConstraintSeverityListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return convertContactPointSystemListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return convertContactPointUseListToString(eDataType, instanceValue);
			case FhirPackage.CONTENT_TYPE_LIST:
				return convertContentTypeListToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return convertContributorTypeListToString(eDataType, instanceValue);
			case FhirPackage.COVERAGE_STATUS_LIST:
				return convertCoverageStatusListToString(eDataType, instanceValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST:
				return convertDataElementStringencyListToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return convertDaysOfWeekListToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return convertDetectedIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return convertDeviceMetricCalibrationStateListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return convertDeviceMetricCalibrationTypeListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return convertDeviceMetricCategoryListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return convertDeviceMetricColorListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return convertDeviceMetricOperationalStatusListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_STATUS_LIST:
				return convertDeviceStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return convertDiagnosticReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return convertDigitalMediaTypeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return convertDocumentModeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return convertDocumentReferenceStatusListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return convertDocumentRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_REQUEST_STATUS_LIST:
				return convertEligibilityRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_STATUS_LIST:
				return convertEligibilityResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return convertEncounterLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return convertEncounterStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return convertEndpointStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENROLLMENT_REQUEST_STATUS_LIST:
				return convertEnrollmentRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENROLLMENT_RESPONSE_STATUS_LIST:
				return convertEnrollmentResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return convertEpisodeOfCareStatusListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return convertEventTimingListToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return convertExplanationOfBenefitStatusListToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return convertExtensionContextListToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return convertFamilyHistoryStatusListToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return convertFilterOperatorListToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return convertFlagStatusListToString(eDataType, instanceValue);
			case FhirPackage.GOAL_STATUS_LIST:
				return convertGoalStatusListToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return convertGroupTypeListToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return convertGuidanceResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST:
				return convertGuideDependencyTypeListToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST:
				return convertGuidePageKindListToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST:
				return convertHTTPVerbListToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return convertIdentifierUseListToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return convertIdentityAssuranceLevelListToString(eDataType, instanceValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return convertInstanceAvailabilityListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return convertIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_LIST:
				return convertIssueTypeListToString(eDataType, instanceValue);
			case FhirPackage.LIBRARY_STATUS_LIST:
				return convertLibraryStatusListToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return convertLinkageTypeListToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST:
				return convertLinkTypeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST:
				return convertListModeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST:
				return convertListStatusListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return convertLocationModeListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return convertLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return convertMeasmntPrincipleListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_DATA_USAGE_LIST:
				return convertMeasureDataUsageListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST:
				return convertMeasurePopulationTypeListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return convertMeasureReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return convertMeasureReportTypeListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_SCORING_LIST:
				return convertMeasureScoringListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_TYPE_LIST:
				return convertMeasureTypeListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return convertMedicationAdministrationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return convertMedicationDispenseStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ORDER_CATEGORY_LIST:
				return convertMedicationOrderCategoryListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ORDER_STATUS_LIST:
				return convertMedicationOrderStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_CATEGORY_LIST:
				return convertMedicationStatementCategoryListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return convertMedicationStatementStatusListToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return convertMessageSignificanceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST:
				return convertNameUseListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return convertNamingSystemIdentifierTypeListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return convertNamingSystemTypeListToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return convertNarrativeStatusListToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return convertNoteTypeListToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return convertNutritionOrderStatusListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return convertObservationRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return convertObservationStatusListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return convertOperationKindListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return convertOperationParameterUseListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return convertParticipantRequiredListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return convertParticipationStatusListToString(eDataType, instanceValue);
			case FhirPackage.PAYMENT_NOTICE_STATUS_LIST:
				return convertPaymentNoticeStatusListToString(eDataType, instanceValue);
			case FhirPackage.PAYMENT_RECONCILIATION_STATUS_LIST:
				return convertPaymentReconciliationStatusListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR_LIST:
				return convertPlanActionCardinalityBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_GROUPING_BEHAVIOR_LIST:
				return convertPlanActionGroupingBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_PARTICIPANT_TYPE_LIST:
				return convertPlanActionParticipantTypeListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_PRECHECK_BEHAVIOR_LIST:
				return convertPlanActionPrecheckBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_ANCHOR_LIST:
				return convertPlanActionRelationshipAnchorListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_TYPE_LIST:
				return convertPlanActionRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_REQUIRED_BEHAVIOR_LIST:
				return convertPlanActionRequiredBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_SELECTION_BEHAVIOR_LIST:
				return convertPlanActionSelectionBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST:
				return convertProcedureRequestPriorityListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST:
				return convertProcedureRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return convertProcedureStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROCESS_REQUEST_STATUS_LIST:
				return convertProcessRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROCESS_RESPONSE_STATUS_LIST:
				return convertProcessResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return convertPropertyRepresentationListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return convertPropertyTypeListToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return convertProvenanceEntityRoleListToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return convertQuantityComparatorListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return convertQuestionnaireItemTypeListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return convertQuestionnaireResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return convertQuestionnaireStatusListToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return convertReferenceVersionRulesListToString(eDataType, instanceValue);
			case FhirPackage.REFERRAL_CATEGORY_LIST:
				return convertReferralCategoryListToString(eDataType, instanceValue);
			case FhirPackage.REFERRAL_STATUS_LIST:
				return convertReferralStatusListToString(eDataType, instanceValue);
			case FhirPackage.RELATED_RESOURCE_TYPE_LIST:
				return convertRelatedResourceTypeListToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return convertRemittanceOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return convertResourceVersionPolicyListToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return convertResponseTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST:
				return convertRestfulConformanceModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return convertSearchEntryModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return convertSearchModifierCodeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return convertSearchParamTypeListToString(eDataType, instanceValue);
			case FhirPackage.SEQUENCE_TYPE_LIST:
				return convertSequenceTypeListToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST:
				return convertSlicingRulesListToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return convertSlotStatusListToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return convertSpecimenStatusListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return convertStructureDefinitionKindListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return convertStructureMapContextTypeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return convertStructureMapInputModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_LIST_MODE_LIST:
				return convertStructureMapListModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return convertStructureMapModelModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return convertStructureMapTransformListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return convertSubscriptionChannelTypeListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return convertSubscriptionStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return convertSupplyDeliveryStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return convertSupplyRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return convertSystemRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.TASK_PRIORITY_LIST:
				return convertTaskPriorityListToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_LIST:
				return convertTaskStatusListToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return convertTriggerTypeListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return convertTypeDerivationRuleListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return convertTypeRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return convertUnitsOfTimeListToString(eDataType, instanceValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST:
				return convertUnknownContentCodeListToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST:
				return convertUseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST:
				return convertVisionBaseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST:
				return convertVisionEyesListToString(eDataType, instanceValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return convertXPathUsageTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return convertAccountStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return convertActionListListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST_OBJECT:
				return convertActivityDefinitionCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return convertAddressTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return convertAddressUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return convertAdministrativeGenderListObjectToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return convertAggregationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return convertAllergyIntoleranceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST_OBJECT:
				return convertAllergyIntoleranceCertaintyListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return convertAllergyIntoleranceCriticalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return convertAllergyIntoleranceSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST_OBJECT:
				return convertAllergyIntoleranceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return convertAllergyIntoleranceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return convertAppointmentStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return convertAssertionDirectionTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return convertAssertionOperatorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return convertAssertionResponseTypesListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return convertAuditEventActionListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return convertAuditEventAgentNetworkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return convertAuditEventOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return convertBase64BinaryPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return convertBindingStrengthListObjectToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return convertBooleanPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return convertBooleanPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return convertBundleTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return convertCarePlanActivityStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_RELATIONSHIP_LIST_OBJECT:
				return convertCarePlanRelationshipListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return convertCarePlanStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_RESPONSE_STATUS_LIST_OBJECT:
				return convertClaimResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_STATUS_LIST_OBJECT:
				return convertClaimStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return convertClinicalImpressionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_PRIMITIVE:
				return convertCodePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return convertCodeSystemContentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return convertCodeSystemHierarchyMeaningListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST_OBJECT:
				return convertCommunicationRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST_OBJECT:
				return convertCommunicationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return convertCompartmentTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return convertCompositionAttestationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return convertCompositionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return convertConceptMapEquivalenceListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return convertConditionalDeleteStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return convertConditionalReadStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST_OBJECT:
				return convertConditionVerificationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST_OBJECT:
				return convertConformanceEventModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST_OBJECT:
				return convertConformanceResourceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_STATEMENT_KIND_LIST_OBJECT:
				return convertConformanceStatementKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return convertConsentDataMeaningListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST_OBJECT:
				return convertConsentExceptTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATUS_LIST_OBJECT:
				return convertConsentStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return convertConstraintSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return convertContactPointSystemListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return convertContactPointUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTENT_TYPE_LIST_OBJECT:
				return convertContentTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return convertContributorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COVERAGE_STATUS_LIST_OBJECT:
				return convertCoverageStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST_OBJECT:
				return convertDataElementStringencyListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE:
				return convertDatePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return convertDatePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return convertDateTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return convertDateTimePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return convertDaysOfWeekListObjectToString(eDataType, instanceValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return convertDecimalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return convertDetectedIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return convertDeviceMetricCalibrationStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return convertDeviceMetricCalibrationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return convertDeviceMetricCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return convertDeviceMetricColorListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return convertDeviceMetricOperationalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_STATUS_LIST_OBJECT:
				return convertDeviceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return convertDiagnosticReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return convertDigitalMediaTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return convertDocumentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return convertDocumentReferenceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertDocumentRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_REQUEST_STATUS_LIST_OBJECT:
				return convertEligibilityRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_STATUS_LIST_OBJECT:
				return convertEligibilityResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return convertEncounterLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return convertEncounterStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return convertEndpointStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENROLLMENT_REQUEST_STATUS_LIST_OBJECT:
				return convertEnrollmentRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENROLLMENT_RESPONSE_STATUS_LIST_OBJECT:
				return convertEnrollmentResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return convertEpisodeOfCareStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return convertEventTimingListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return convertExplanationOfBenefitStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return convertExtensionContextListObjectToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return convertFamilyHistoryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return convertFilterOperatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return convertFlagStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return convertGoalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return convertGroupTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return convertGuidanceResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST_OBJECT:
				return convertGuideDependencyTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST_OBJECT:
				return convertGuidePageKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return convertHTTPVerbListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return convertIdentifierUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return convertIdentityAssuranceLevelListObjectToString(eDataType, instanceValue);
			case FhirPackage.ID_PRIMITIVE:
				return convertIdPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return convertInstanceAvailabilityListObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return convertInstantPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return convertIntegerPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return convertIntegerPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return convertIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return convertIssueTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIBRARY_STATUS_LIST_OBJECT:
				return convertLibraryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return convertLinkageTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return convertLinkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return convertListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return convertListStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return convertLocationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return convertLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return convertMarkdownPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return convertMeasmntPrincipleListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_DATA_USAGE_LIST_OBJECT:
				return convertMeasureDataUsageListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST_OBJECT:
				return convertMeasurePopulationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return convertMeasureReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return convertMeasureReportTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_SCORING_LIST_OBJECT:
				return convertMeasureScoringListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_TYPE_LIST_OBJECT:
				return convertMeasureTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return convertMedicationAdministrationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return convertMedicationDispenseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ORDER_CATEGORY_LIST_OBJECT:
				return convertMedicationOrderCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ORDER_STATUS_LIST_OBJECT:
				return convertMedicationOrderStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_CATEGORY_LIST_OBJECT:
				return convertMedicationStatementCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return convertMedicationStatementStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return convertMessageSignificanceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return convertNameUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return convertNamingSystemIdentifierTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return convertNamingSystemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return convertNarrativeStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return convertNoteTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return convertNutritionOrderStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertObservationRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return convertObservationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OID_PRIMITIVE:
				return convertOidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return convertOperationKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return convertOperationParameterUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return convertParticipantRequiredListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return convertParticipationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PAYMENT_NOTICE_STATUS_LIST_OBJECT:
				return convertPaymentNoticeStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PAYMENT_RECONCILIATION_STATUS_LIST_OBJECT:
				return convertPaymentReconciliationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return convertPlanActionCardinalityBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return convertPlanActionGroupingBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return convertPlanActionParticipantTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return convertPlanActionPrecheckBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_ANCHOR_LIST_OBJECT:
				return convertPlanActionRelationshipAnchorListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertPlanActionRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return convertPlanActionRequiredBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.PLAN_ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return convertPlanActionSelectionBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return convertPositiveIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST_OBJECT:
				return convertProcedureRequestPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST_OBJECT:
				return convertProcedureRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_STATUS_LIST_OBJECT:
				return convertProcedureStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCESS_REQUEST_STATUS_LIST_OBJECT:
				return convertProcessRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCESS_RESPONSE_STATUS_LIST_OBJECT:
				return convertProcessResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return convertPropertyRepresentationListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return convertPropertyTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return convertProvenanceEntityRoleListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return convertQuantityComparatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return convertQuestionnaireItemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return convertQuestionnaireResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST_OBJECT:
				return convertQuestionnaireStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return convertReferenceVersionRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERRAL_CATEGORY_LIST_OBJECT:
				return convertReferralCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERRAL_STATUS_LIST_OBJECT:
				return convertReferralStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RELATED_RESOURCE_TYPE_LIST_OBJECT:
				return convertRelatedResourceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return convertRemittanceOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return convertResourceVersionPolicyListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return convertResponseTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST_OBJECT:
				return convertRestfulConformanceModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return convertSampledDataDataTypePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return convertSearchEntryModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return convertSearchModifierCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return convertSearchParamTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEQUENCE_TYPE_LIST_OBJECT:
				return convertSequenceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return convertSlicingRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return convertSlotStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return convertSpecimenStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRING_PRIMITIVE:
				return convertStringPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return convertStructureDefinitionKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return convertStructureMapContextTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return convertStructureMapInputModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_LIST_MODE_LIST_OBJECT:
				return convertStructureMapListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return convertStructureMapModelModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return convertStructureMapTransformListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return convertSubscriptionChannelTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return convertSubscriptionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return convertSupplyDeliveryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return convertSupplyRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertSystemRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_PRIORITY_LIST_OBJECT:
				return convertTaskPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return convertTaskStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.TIME_PRIMITIVE:
				return convertTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return convertTriggerTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return convertTypeDerivationRuleListObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertTypeRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return convertUnitsOfTimeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST_OBJECT:
				return convertUnknownContentCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return convertUnsignedIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URI_PRIMITIVE:
				return convertUriPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST_OBJECT:
				return convertUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.UUID_PRIMITIVE:
				return convertUuidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return convertVisionBaseListObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return convertVisionEyesListObjectToString(eDataType, instanceValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return convertXPathUsageTypeListObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatus createAccountStatus() {
		AccountStatusImpl accountStatus = new AccountStatusImpl();
		return accountStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList createActionList() {
		ActionListImpl actionList = new ActionListImpl();
		return actionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionCategory createActivityDefinitionCategory() {
		ActivityDefinitionCategoryImpl activityDefinitionCategory = new ActivityDefinitionCategoryImpl();
		return activityDefinitionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue() {
		ActivityDefinitionDynamicValueImpl activityDefinitionDynamicValue = new ActivityDefinitionDynamicValueImpl();
		return activityDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUse() {
		AddressUseImpl addressUse = new AddressUseImpl();
		return addressUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender createAdministrativeGender() {
		AdministrativeGenderImpl administrativeGender = new AdministrativeGenderImpl();
		return administrativeGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMode createAggregationMode() {
		AggregationModeImpl aggregationMode = new AggregationModeImpl();
		return aggregationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory createAllergyIntoleranceCategory() {
		AllergyIntoleranceCategoryImpl allergyIntoleranceCategory = new AllergyIntoleranceCategoryImpl();
		return allergyIntoleranceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertainty createAllergyIntoleranceCertainty() {
		AllergyIntoleranceCertaintyImpl allergyIntoleranceCertainty = new AllergyIntoleranceCertaintyImpl();
		return allergyIntoleranceCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticality() {
		AllergyIntoleranceCriticalityImpl allergyIntoleranceCriticality = new AllergyIntoleranceCriticalityImpl();
		return allergyIntoleranceCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverity() {
		AllergyIntoleranceSeverityImpl allergyIntoleranceSeverity = new AllergyIntoleranceSeverityImpl();
		return allergyIntoleranceSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatus createAllergyIntoleranceStatus() {
		AllergyIntoleranceStatusImpl allergyIntoleranceStatus = new AllergyIntoleranceStatusImpl();
		return allergyIntoleranceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceType createAllergyIntoleranceType() {
		AllergyIntoleranceTypeImpl allergyIntoleranceType = new AllergyIntoleranceTypeImpl();
		return allergyIntoleranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus createAppointmentStatus() {
		AppointmentStatusImpl appointmentStatus = new AppointmentStatusImpl();
		return appointmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionType createAssertionDirectionType() {
		AssertionDirectionTypeImpl assertionDirectionType = new AssertionDirectionTypeImpl();
		return assertionDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorType createAssertionOperatorType() {
		AssertionOperatorTypeImpl assertionOperatorType = new AssertionOperatorTypeImpl();
		return assertionOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypes createAssertionResponseTypes() {
		AssertionResponseTypesImpl assertionResponseTypes = new AssertionResponseTypesImpl();
		return assertionResponseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction createAuditEventAction() {
		AuditEventActionImpl auditEventAction = new AuditEventActionImpl();
		return auditEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgent createAuditEventAgent() {
		AuditEventAgentImpl auditEventAgent = new AuditEventAgentImpl();
		return auditEventAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkType createAuditEventAgentNetworkType() {
		AuditEventAgentNetworkTypeImpl auditEventAgentNetworkType = new AuditEventAgentNetworkTypeImpl();
		return auditEventAgentNetworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventDetail createAuditEventDetail() {
		AuditEventDetailImpl auditEventDetail = new AuditEventDetailImpl();
		return auditEventDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntity createAuditEventEntity() {
		AuditEventEntityImpl auditEventEntity = new AuditEventEntityImpl();
		return auditEventEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventNetwork createAuditEventNetwork() {
		AuditEventNetworkImpl auditEventNetwork = new AuditEventNetworkImpl();
		return auditEventNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome createAuditEventOutcome() {
		AuditEventOutcomeImpl auditEventOutcome = new AuditEventOutcomeImpl();
		return auditEventOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneElement createBackboneElement() {
		BackboneElementImpl backboneElement = new BackboneElementImpl();
		return backboneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength createBindingStrength() {
		BindingStrengthImpl bindingStrength = new BindingStrengthImpl();
		return bindingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite createBodySite() {
		BodySiteImpl bodySite = new BodySiteImpl();
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleRequest createBundleRequest() {
		BundleRequestImpl bundleRequest = new BundleRequestImpl();
		return bundleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleResponse createBundleResponse() {
		BundleResponseImpl bundleResponse = new BundleResponseImpl();
		return bundleResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSearch createBundleSearch() {
		BundleSearchImpl bundleSearch = new BundleSearchImpl();
		return bundleSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleType() {
		BundleTypeImpl bundleType = new BundleTypeImpl();
		return bundleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatus createCarePlanActivityStatus() {
		CarePlanActivityStatusImpl carePlanActivityStatus = new CarePlanActivityStatusImpl();
		return carePlanActivityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanDetail createCarePlanDetail() {
		CarePlanDetailImpl carePlanDetail = new CarePlanDetailImpl();
		return carePlanDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelatedPlan createCarePlanRelatedPlan() {
		CarePlanRelatedPlanImpl carePlanRelatedPlan = new CarePlanRelatedPlanImpl();
		return carePlanRelatedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelationship createCarePlanRelationship() {
		CarePlanRelationshipImpl carePlanRelationship = new CarePlanRelationshipImpl();
		return carePlanRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatus createCarePlanStatus() {
		CarePlanStatusImpl carePlanStatus = new CarePlanStatusImpl();
		return carePlanStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeam createCareTeam() {
		CareTeamImpl careTeam = new CareTeamImpl();
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamParticipant createCareTeamParticipant() {
		CareTeamParticipantImpl careTeamParticipant = new CareTeamParticipantImpl();
		return careTeamParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimAccident createClaimAccident() {
		ClaimAccidentImpl claimAccident = new ClaimAccidentImpl();
		return claimAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCareTeam createClaimCareTeam() {
		ClaimCareTeamImpl claimCareTeam = new ClaimCareTeamImpl();
		return claimCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCoverage createClaimCoverage() {
		ClaimCoverageImpl claimCoverage = new ClaimCoverageImpl();
		return claimCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDetail createClaimDetail() {
		ClaimDetailImpl claimDetail = new ClaimDetailImpl();
		return claimDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInformation createClaimInformation() {
		ClaimInformationImpl claimInformation = new ClaimInformationImpl();
		return claimInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimMissingTeeth createClaimMissingTeeth() {
		ClaimMissingTeethImpl claimMissingTeeth = new ClaimMissingTeethImpl();
		return claimMissingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcedure createClaimProcedure() {
		ClaimProcedureImpl claimProcedure = new ClaimProcedureImpl();
		return claimProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProsthesis createClaimProsthesis() {
		ClaimProsthesisImpl claimProsthesis = new ClaimProsthesisImpl();
		return claimProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimRelated createClaimRelated() {
		ClaimRelatedImpl claimRelated = new ClaimRelatedImpl();
		return claimRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddItem createClaimResponseAddItem() {
		ClaimResponseAddItemImpl claimResponseAddItem = new ClaimResponseAddItemImpl();
		return claimResponseAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication createClaimResponseAdjudication() {
		ClaimResponseAdjudicationImpl claimResponseAdjudication = new ClaimResponseAdjudicationImpl();
		return claimResponseAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseCoverage createClaimResponseCoverage() {
		ClaimResponseCoverageImpl claimResponseCoverage = new ClaimResponseCoverageImpl();
		return claimResponseCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail createClaimResponseDetail() {
		ClaimResponseDetailImpl claimResponseDetail = new ClaimResponseDetailImpl();
		return claimResponseDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail1 createClaimResponseDetail1() {
		ClaimResponseDetail1Impl claimResponseDetail1 = new ClaimResponseDetail1Impl();
		return claimResponseDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseNote createClaimResponseNote() {
		ClaimResponseNoteImpl claimResponseNote = new ClaimResponseNoteImpl();
		return claimResponseNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment createClaimResponsePayment() {
		ClaimResponsePaymentImpl claimResponsePayment = new ClaimResponsePaymentImpl();
		return claimResponsePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseStatus createClaimResponseStatus() {
		ClaimResponseStatusImpl claimResponseStatus = new ClaimResponseStatusImpl();
		return claimResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseSubDetail createClaimResponseSubDetail() {
		ClaimResponseSubDetailImpl claimResponseSubDetail = new ClaimResponseSubDetailImpl();
		return claimResponseSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimStatus createClaimStatus() {
		ClaimStatusImpl claimStatus = new ClaimStatusImpl();
		return claimStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSubDetail createClaimSubDetail() {
		ClaimSubDetailImpl claimSubDetail = new ClaimSubDetailImpl();
		return claimSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionInvestigations createClinicalImpressionInvestigations() {
		ClinicalImpressionInvestigationsImpl clinicalImpressionInvestigations = new ClinicalImpressionInvestigationsImpl();
		return clinicalImpressionInvestigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatus createClinicalImpressionStatus() {
		ClinicalImpressionStatusImpl clinicalImpressionStatus = new ClinicalImpressionStatusImpl();
		return clinicalImpressionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConcept createCodeSystemConcept() {
		CodeSystemConceptImpl codeSystemConcept = new CodeSystemConceptImpl();
		return codeSystemConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContact createCodeSystemContact() {
		CodeSystemContactImpl codeSystemContact = new CodeSystemContactImpl();
		return codeSystemContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentMode createCodeSystemContentMode() {
		CodeSystemContentModeImpl codeSystemContentMode = new CodeSystemContentModeImpl();
		return codeSystemContentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemDesignation createCodeSystemDesignation() {
		CodeSystemDesignationImpl codeSystemDesignation = new CodeSystemDesignationImpl();
		return codeSystemDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemFilter createCodeSystemFilter() {
		CodeSystemFilterImpl codeSystemFilter = new CodeSystemFilterImpl();
		return codeSystemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaning createCodeSystemHierarchyMeaning() {
		CodeSystemHierarchyMeaningImpl codeSystemHierarchyMeaning = new CodeSystemHierarchyMeaningImpl();
		return codeSystemHierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty createCodeSystemProperty() {
		CodeSystemPropertyImpl codeSystemProperty = new CodeSystemPropertyImpl();
		return codeSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty1 createCodeSystemProperty1() {
		CodeSystemProperty1Impl codeSystemProperty1 = new CodeSystemProperty1Impl();
		return codeSystemProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatus createCommunicationRequestStatus() {
		CommunicationRequestStatusImpl communicationRequestStatus = new CommunicationRequestStatusImpl();
		return communicationRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatus createCommunicationStatus() {
		CommunicationStatusImpl communicationStatus = new CommunicationStatusImpl();
		return communicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinition createCompartmentDefinition() {
		CompartmentDefinitionImpl compartmentDefinition = new CompartmentDefinitionImpl();
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinitionContact createCompartmentDefinitionContact() {
		CompartmentDefinitionContactImpl compartmentDefinitionContact = new CompartmentDefinitionContactImpl();
		return compartmentDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinitionResource createCompartmentDefinitionResource() {
		CompartmentDefinitionResourceImpl compartmentDefinitionResource = new CompartmentDefinitionResourceImpl();
		return compartmentDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationMode createCompositionAttestationMode() {
		CompositionAttestationModeImpl compositionAttestationMode = new CompositionAttestationModeImpl();
		return compositionAttestationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus createCompositionStatus() {
		CompositionStatusImpl compositionStatus = new CompositionStatusImpl();
		return compositionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapContact createConceptMapContact() {
		ConceptMapContactImpl conceptMapContact = new ConceptMapContactImpl();
		return conceptMapContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDependsOn createConceptMapDependsOn() {
		ConceptMapDependsOnImpl conceptMapDependsOn = new ConceptMapDependsOnImpl();
		return conceptMapDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapElement createConceptMapElement() {
		ConceptMapElementImpl conceptMapElement = new ConceptMapElementImpl();
		return conceptMapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence createConceptMapEquivalence() {
		ConceptMapEquivalenceImpl conceptMapEquivalence = new ConceptMapEquivalenceImpl();
		return conceptMapEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroup createConceptMapGroup() {
		ConceptMapGroupImpl conceptMapGroup = new ConceptMapGroupImpl();
		return conceptMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapTarget createConceptMapTarget() {
		ConceptMapTargetImpl conceptMapTarget = new ConceptMapTargetImpl();
		return conceptMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatus createConditionalDeleteStatus() {
		ConditionalDeleteStatusImpl conditionalDeleteStatus = new ConditionalDeleteStatusImpl();
		return conditionalDeleteStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatus createConditionalReadStatus() {
		ConditionalReadStatusImpl conditionalReadStatus = new ConditionalReadStatusImpl();
		return conditionalReadStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatus createConditionVerificationStatus() {
		ConditionVerificationStatusImpl conditionVerificationStatus = new ConditionVerificationStatusImpl();
		return conditionVerificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance createConformance() {
		ConformanceImpl conformance = new ConformanceImpl();
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceCertificate createConformanceCertificate() {
		ConformanceCertificateImpl conformanceCertificate = new ConformanceCertificateImpl();
		return conformanceCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceContact createConformanceContact() {
		ConformanceContactImpl conformanceContact = new ConformanceContactImpl();
		return conformanceContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceDocument createConformanceDocument() {
		ConformanceDocumentImpl conformanceDocument = new ConformanceDocumentImpl();
		return conformanceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEndpoint createConformanceEndpoint() {
		ConformanceEndpointImpl conformanceEndpoint = new ConformanceEndpointImpl();
		return conformanceEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEvent createConformanceEvent() {
		ConformanceEventImpl conformanceEvent = new ConformanceEventImpl();
		return conformanceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventMode createConformanceEventMode() {
		ConformanceEventModeImpl conformanceEventMode = new ConformanceEventModeImpl();
		return conformanceEventMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceImplementation createConformanceImplementation() {
		ConformanceImplementationImpl conformanceImplementation = new ConformanceImplementationImpl();
		return conformanceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceInteraction createConformanceInteraction() {
		ConformanceInteractionImpl conformanceInteraction = new ConformanceInteractionImpl();
		return conformanceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceInteraction1 createConformanceInteraction1() {
		ConformanceInteraction1Impl conformanceInteraction1 = new ConformanceInteraction1Impl();
		return conformanceInteraction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceMessaging createConformanceMessaging() {
		ConformanceMessagingImpl conformanceMessaging = new ConformanceMessagingImpl();
		return conformanceMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceOperation createConformanceOperation() {
		ConformanceOperationImpl conformanceOperation = new ConformanceOperationImpl();
		return conformanceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResource createConformanceResource() {
		ConformanceResourceImpl conformanceResource = new ConformanceResourceImpl();
		return conformanceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus createConformanceResourceStatus() {
		ConformanceResourceStatusImpl conformanceResourceStatus = new ConformanceResourceStatusImpl();
		return conformanceResourceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRest createConformanceRest() {
		ConformanceRestImpl conformanceRest = new ConformanceRestImpl();
		return conformanceRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSearchParam createConformanceSearchParam() {
		ConformanceSearchParamImpl conformanceSearchParam = new ConformanceSearchParamImpl();
		return conformanceSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSecurity createConformanceSecurity() {
		ConformanceSecurityImpl conformanceSecurity = new ConformanceSecurityImpl();
		return conformanceSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSoftware createConformanceSoftware() {
		ConformanceSoftwareImpl conformanceSoftware = new ConformanceSoftwareImpl();
		return conformanceSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceStatementKind createConformanceStatementKind() {
		ConformanceStatementKindImpl conformanceStatementKind = new ConformanceStatementKindImpl();
		return conformanceStatementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActor createConsentActor() {
		ConsentActorImpl consentActor = new ConsentActorImpl();
		return consentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentData createConsentData() {
		ConsentDataImpl consentData = new ConsentDataImpl();
		return consentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaning createConsentDataMeaning() {
		ConsentDataMeaningImpl consentDataMeaning = new ConsentDataMeaningImpl();
		return consentDataMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExcept createConsentExcept() {
		ConsentExceptImpl consentExcept = new ConsentExceptImpl();
		return consentExcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptType createConsentExceptType() {
		ConsentExceptTypeImpl consentExceptType = new ConsentExceptTypeImpl();
		return consentExceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatus createConsentStatus() {
		ConsentStatusImpl consentStatus = new ConsentStatusImpl();
		return consentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverity createConstraintSeverity() {
		ConstraintSeverityImpl constraintSeverity = new ConstraintSeverityImpl();
		return constraintSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactDetail createContactDetail() {
		ContactDetailImpl contactDetail = new ContactDetailImpl();
		return contactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystem createContactPointSystem() {
		ContactPointSystemImpl contactPointSystem = new ContactPointSystemImpl();
		return contactPointSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUse createContactPointUse() {
		ContactPointUseImpl contactPointUse = new ContactPointUseImpl();
		return contactPointUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAgent createContractAgent() {
		ContractAgentImpl contractAgent = new ContractAgentImpl();
		return contractAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAgent1 createContractAgent1() {
		ContractAgent1Impl contractAgent1 = new ContractAgent1Impl();
		return contractAgent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFriendly createContractFriendly() {
		ContractFriendlyImpl contractFriendly = new ContractFriendlyImpl();
		return contractFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractLegal createContractLegal() {
		ContractLegalImpl contractLegal = new ContractLegalImpl();
		return contractLegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractRule createContractRule() {
		ContractRuleImpl contractRule = new ContractRuleImpl();
		return contractRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSigner createContractSigner() {
		ContractSignerImpl contractSigner = new ContractSignerImpl();
		return contractSigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem1 createContractValuedItem1() {
		ContractValuedItem1Impl contractValuedItem1 = new ContractValuedItem1Impl();
		return contractValuedItem1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorType() {
		ContributorTypeImpl contributorType = new ContributorTypeImpl();
		return contributorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageStatus createCoverageStatus() {
		CoverageStatusImpl coverageStatus = new CoverageStatusImpl();
		return coverageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementContact createDataElementContact() {
		DataElementContactImpl dataElementContact = new DataElementContactImpl();
		return dataElementContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementMapping createDataElementMapping() {
		DataElementMappingImpl dataElementMapping = new DataElementMappingImpl();
		return dataElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringency createDataElementStringency() {
		DataElementStringencyImpl dataElementStringency = new DataElementStringencyImpl();
		return dataElementStringency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement createDataRequirement() {
		DataRequirementImpl dataRequirement = new DataRequirementImpl();
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementCodeFilter createDataRequirementCodeFilter() {
		DataRequirementCodeFilterImpl dataRequirementCodeFilter = new DataRequirementCodeFilterImpl();
		return dataRequirementCodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementDateFilter createDataRequirementDateFilter() {
		DataRequirementDateFilterImpl dataRequirementDateFilter = new DataRequirementDateFilterImpl();
		return dataRequirementDateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeek createDaysOfWeek() {
		DaysOfWeekImpl daysOfWeek = new DaysOfWeekImpl();
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportServiceModule createDecisionSupportServiceModule() {
		DecisionSupportServiceModuleImpl decisionSupportServiceModule = new DecisionSupportServiceModuleImpl();
		return decisionSupportServiceModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverity createDetectedIssueSeverity() {
		DetectedIssueSeverityImpl detectedIssueSeverity = new DetectedIssueSeverityImpl();
		return detectedIssueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent createDeviceComponent() {
		DeviceComponentImpl deviceComponent = new DeviceComponentImpl();
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponentProductionSpecification createDeviceComponentProductionSpecification() {
		DeviceComponentProductionSpecificationImpl deviceComponentProductionSpecification = new DeviceComponentProductionSpecificationImpl();
		return deviceComponentProductionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationState createDeviceMetricCalibrationState() {
		DeviceMetricCalibrationStateImpl deviceMetricCalibrationState = new DeviceMetricCalibrationStateImpl();
		return deviceMetricCalibrationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationType createDeviceMetricCalibrationType() {
		DeviceMetricCalibrationTypeImpl deviceMetricCalibrationType = new DeviceMetricCalibrationTypeImpl();
		return deviceMetricCalibrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory createDeviceMetricCategory() {
		DeviceMetricCategoryImpl deviceMetricCategory = new DeviceMetricCategoryImpl();
		return deviceMetricCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColor createDeviceMetricColor() {
		DeviceMetricColorImpl deviceMetricColor = new DeviceMetricColorImpl();
		return deviceMetricColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatus() {
		DeviceMetricOperationalStatusImpl deviceMetricOperationalStatus = new DeviceMetricOperationalStatusImpl();
		return deviceMetricOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatus createDeviceStatus() {
		DeviceStatusImpl deviceStatus = new DeviceStatusImpl();
		return deviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequest createDeviceUseRequest() {
		DeviceUseRequestImpl deviceUseRequest = new DeviceUseRequestImpl();
		return deviceUseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportImage createDiagnosticReportImage() {
		DiagnosticReportImageImpl diagnosticReportImage = new DiagnosticReportImageImpl();
		return diagnosticReportImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus createDiagnosticReportStatus() {
		DiagnosticReportStatusImpl diagnosticReportStatus = new DiagnosticReportStatusImpl();
		return diagnosticReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticRequest createDiagnosticRequest() {
		DiagnosticRequestImpl diagnosticRequest = new DiagnosticRequestImpl();
		return diagnosticRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaType createDigitalMediaType() {
		DigitalMediaTypeImpl digitalMediaType = new DigitalMediaTypeImpl();
		return digitalMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestContent createDocumentManifestContent() {
		DocumentManifestContentImpl documentManifestContent = new DocumentManifestContentImpl();
		return documentManifestContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMode createDocumentMode() {
		DocumentModeImpl documentMode = new DocumentModeImpl();
		return documentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelated createDocumentReferenceRelated() {
		DocumentReferenceRelatedImpl documentReferenceRelated = new DocumentReferenceRelatedImpl();
		return documentReferenceRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatus createDocumentReferenceStatus() {
		DocumentReferenceStatusImpl documentReferenceStatus = new DocumentReferenceStatusImpl();
		return documentReferenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipType createDocumentRelationshipType() {
		DocumentRelationshipTypeImpl documentRelationshipType = new DocumentRelationshipTypeImpl();
		return documentRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainResource createDomainResource() {
		DomainResourceImpl domainResource = new DomainResourceImpl();
		return domainResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBase createElementDefinitionBase() {
		ElementDefinitionBaseImpl elementDefinitionBase = new ElementDefinitionBaseImpl();
		return elementDefinitionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBinding createElementDefinitionBinding() {
		ElementDefinitionBindingImpl elementDefinitionBinding = new ElementDefinitionBindingImpl();
		return elementDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionConstraint createElementDefinitionConstraint() {
		ElementDefinitionConstraintImpl elementDefinitionConstraint = new ElementDefinitionConstraintImpl();
		return elementDefinitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionMapping createElementDefinitionMapping() {
		ElementDefinitionMappingImpl elementDefinitionMapping = new ElementDefinitionMappingImpl();
		return elementDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionSlicing createElementDefinitionSlicing() {
		ElementDefinitionSlicingImpl elementDefinitionSlicing = new ElementDefinitionSlicingImpl();
		return elementDefinitionSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionType createElementDefinitionType() {
		ElementDefinitionTypeImpl elementDefinitionType = new ElementDefinitionTypeImpl();
		return elementDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest createEligibilityRequest() {
		EligibilityRequestImpl eligibilityRequest = new EligibilityRequestImpl();
		return eligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestStatus createEligibilityRequestStatus() {
		EligibilityRequestStatusImpl eligibilityRequestStatus = new EligibilityRequestStatusImpl();
		return eligibilityRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse createEligibilityResponse() {
		EligibilityResponseImpl eligibilityResponse = new EligibilityResponseImpl();
		return eligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseBenefitBalance createEligibilityResponseBenefitBalance() {
		EligibilityResponseBenefitBalanceImpl eligibilityResponseBenefitBalance = new EligibilityResponseBenefitBalanceImpl();
		return eligibilityResponseBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseError createEligibilityResponseError() {
		EligibilityResponseErrorImpl eligibilityResponseError = new EligibilityResponseErrorImpl();
		return eligibilityResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseFinancial createEligibilityResponseFinancial() {
		EligibilityResponseFinancialImpl eligibilityResponseFinancial = new EligibilityResponseFinancialImpl();
		return eligibilityResponseFinancial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseStatus createEligibilityResponseStatus() {
		EligibilityResponseStatusImpl eligibilityResponseStatus = new EligibilityResponseStatusImpl();
		return eligibilityResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatus createEncounterLocationStatus() {
		EncounterLocationStatusImpl encounterLocationStatus = new EncounterLocationStatusImpl();
		return encounterLocationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatus createEncounterStatus() {
		EncounterStatusImpl encounterStatus = new EncounterStatusImpl();
		return encounterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatus createEndpointStatus() {
		EndpointStatusImpl endpointStatus = new EndpointStatusImpl();
		return endpointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequestStatus createEnrollmentRequestStatus() {
		EnrollmentRequestStatusImpl enrollmentRequestStatus = new EnrollmentRequestStatusImpl();
		return enrollmentRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponseStatus createEnrollmentResponseStatus() {
		EnrollmentResponseStatusImpl enrollmentResponseStatus = new EnrollmentResponseStatusImpl();
		return enrollmentResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatus createEpisodeOfCareStatus() {
		EpisodeOfCareStatusImpl episodeOfCareStatus = new EpisodeOfCareStatusImpl();
		return episodeOfCareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming createEventTiming() {
		EventTimingImpl eventTiming = new EventTimingImpl();
		return eventTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfile createExpansionProfile() {
		ExpansionProfileImpl expansionProfile = new ExpansionProfileImpl();
		return expansionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystem createExpansionProfileCodeSystem() {
		ExpansionProfileCodeSystemImpl expansionProfileCodeSystem = new ExpansionProfileCodeSystemImpl();
		return expansionProfileCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystem1 createExpansionProfileCodeSystem1() {
		ExpansionProfileCodeSystem1Impl expansionProfileCodeSystem1 = new ExpansionProfileCodeSystem1Impl();
		return expansionProfileCodeSystem1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystem2 createExpansionProfileCodeSystem2() {
		ExpansionProfileCodeSystem2Impl expansionProfileCodeSystem2 = new ExpansionProfileCodeSystem2Impl();
		return expansionProfileCodeSystem2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileContact createExpansionProfileContact() {
		ExpansionProfileContactImpl expansionProfileContact = new ExpansionProfileContactImpl();
		return expansionProfileContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation createExpansionProfileDesignation() {
		ExpansionProfileDesignationImpl expansionProfileDesignation = new ExpansionProfileDesignationImpl();
		return expansionProfileDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation1 createExpansionProfileDesignation1() {
		ExpansionProfileDesignation1Impl expansionProfileDesignation1 = new ExpansionProfileDesignation1Impl();
		return expansionProfileDesignation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation2 createExpansionProfileDesignation2() {
		ExpansionProfileDesignation2Impl expansionProfileDesignation2 = new ExpansionProfileDesignation2Impl();
		return expansionProfileDesignation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExclude createExpansionProfileExclude() {
		ExpansionProfileExcludeImpl expansionProfileExclude = new ExpansionProfileExcludeImpl();
		return expansionProfileExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExclude1 createExpansionProfileExclude1() {
		ExpansionProfileExclude1Impl expansionProfileExclude1 = new ExpansionProfileExclude1Impl();
		return expansionProfileExclude1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileInclude createExpansionProfileInclude() {
		ExpansionProfileIncludeImpl expansionProfileInclude = new ExpansionProfileIncludeImpl();
		return expansionProfileInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileInclude1 createExpansionProfileInclude1() {
		ExpansionProfileInclude1Impl expansionProfileInclude1 = new ExpansionProfileInclude1Impl();
		return expansionProfileInclude1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAccident createExplanationOfBenefitAccident() {
		ExplanationOfBenefitAccidentImpl explanationOfBenefitAccident = new ExplanationOfBenefitAccidentImpl();
		return explanationOfBenefitAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddItem createExplanationOfBenefitAddItem() {
		ExplanationOfBenefitAddItemImpl explanationOfBenefitAddItem = new ExplanationOfBenefitAddItemImpl();
		return explanationOfBenefitAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAdjudication createExplanationOfBenefitAdjudication() {
		ExplanationOfBenefitAdjudicationImpl explanationOfBenefitAdjudication = new ExplanationOfBenefitAdjudicationImpl();
		return explanationOfBenefitAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam() {
		ExplanationOfBenefitCareTeamImpl explanationOfBenefitCareTeam = new ExplanationOfBenefitCareTeamImpl();
		return explanationOfBenefitCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCoverage createExplanationOfBenefitCoverage() {
		ExplanationOfBenefitCoverageImpl explanationOfBenefitCoverage = new ExplanationOfBenefitCoverageImpl();
		return explanationOfBenefitCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDetail createExplanationOfBenefitDetail() {
		ExplanationOfBenefitDetailImpl explanationOfBenefitDetail = new ExplanationOfBenefitDetailImpl();
		return explanationOfBenefitDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDetail1 createExplanationOfBenefitDetail1() {
		ExplanationOfBenefitDetail1Impl explanationOfBenefitDetail1 = new ExplanationOfBenefitDetail1Impl();
		return explanationOfBenefitDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitFinancial createExplanationOfBenefitFinancial() {
		ExplanationOfBenefitFinancialImpl explanationOfBenefitFinancial = new ExplanationOfBenefitFinancialImpl();
		return explanationOfBenefitFinancial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInformation createExplanationOfBenefitInformation() {
		ExplanationOfBenefitInformationImpl explanationOfBenefitInformation = new ExplanationOfBenefitInformationImpl();
		return explanationOfBenefitInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItem createExplanationOfBenefitItem() {
		ExplanationOfBenefitItemImpl explanationOfBenefitItem = new ExplanationOfBenefitItemImpl();
		return explanationOfBenefitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitMissingTeeth createExplanationOfBenefitMissingTeeth() {
		ExplanationOfBenefitMissingTeethImpl explanationOfBenefitMissingTeeth = new ExplanationOfBenefitMissingTeethImpl();
		return explanationOfBenefitMissingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitNote createExplanationOfBenefitNote() {
		ExplanationOfBenefitNoteImpl explanationOfBenefitNote = new ExplanationOfBenefitNoteImpl();
		return explanationOfBenefitNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayment createExplanationOfBenefitPayment() {
		ExplanationOfBenefitPaymentImpl explanationOfBenefitPayment = new ExplanationOfBenefitPaymentImpl();
		return explanationOfBenefitPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure() {
		ExplanationOfBenefitProcedureImpl explanationOfBenefitProcedure = new ExplanationOfBenefitProcedureImpl();
		return explanationOfBenefitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProsthesis createExplanationOfBenefitProsthesis() {
		ExplanationOfBenefitProsthesisImpl explanationOfBenefitProsthesis = new ExplanationOfBenefitProsthesisImpl();
		return explanationOfBenefitProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitRelated createExplanationOfBenefitRelated() {
		ExplanationOfBenefitRelatedImpl explanationOfBenefitRelated = new ExplanationOfBenefitRelatedImpl();
		return explanationOfBenefitRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatus createExplanationOfBenefitStatus() {
		ExplanationOfBenefitStatusImpl explanationOfBenefitStatus = new ExplanationOfBenefitStatusImpl();
		return explanationOfBenefitStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitSubDetail createExplanationOfBenefitSubDetail() {
		ExplanationOfBenefitSubDetailImpl explanationOfBenefitSubDetail = new ExplanationOfBenefitSubDetailImpl();
		return explanationOfBenefitSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContext createExtensionContext() {
		ExtensionContextImpl extensionContext = new ExtensionContextImpl();
		return extensionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatus createFamilyHistoryStatus() {
		FamilyHistoryStatusImpl familyHistoryStatus = new FamilyHistoryStatusImpl();
		return familyHistoryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperator() {
		FilterOperatorImpl filterOperator = new FilterOperatorImpl();
		return filterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatus createFlagStatus() {
		FlagStatusImpl flagStatus = new FlagStatusImpl();
		return flagStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOutcome createGoalOutcome() {
		GoalOutcomeImpl goalOutcome = new GoalOutcomeImpl();
		return goalOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatus createGoalStatus() {
		GoalStatusImpl goalStatus = new GoalStatusImpl();
		return goalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseAction createGuidanceResponseAction() {
		GuidanceResponseActionImpl guidanceResponseAction = new GuidanceResponseActionImpl();
		return guidanceResponseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseRelatedAction createGuidanceResponseRelatedAction() {
		GuidanceResponseRelatedActionImpl guidanceResponseRelatedAction = new GuidanceResponseRelatedActionImpl();
		return guidanceResponseRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatus createGuidanceResponseStatus() {
		GuidanceResponseStatusImpl guidanceResponseStatus = new GuidanceResponseStatusImpl();
		return guidanceResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyType createGuideDependencyType() {
		GuideDependencyTypeImpl guideDependencyType = new GuideDependencyTypeImpl();
		return guideDependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKind createGuidePageKind() {
		GuidePageKindImpl guidePageKind = new GuidePageKindImpl();
		return guidePageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb createHTTPVerb() {
		HTTPVerbImpl httpVerb = new HTTPVerbImpl();
		return httpVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUse createIdentifierUse() {
		IdentifierUseImpl identifierUse = new IdentifierUseImpl();
		return identifierUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel createIdentityAssuranceLevel() {
		IdentityAssuranceLevelImpl identityAssuranceLevel = new IdentityAssuranceLevelImpl();
		return identityAssuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifest createImagingManifest() {
		ImagingManifestImpl imagingManifest = new ImagingManifestImpl();
		return imagingManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestBaseLocation createImagingManifestBaseLocation() {
		ImagingManifestBaseLocationImpl imagingManifestBaseLocation = new ImagingManifestBaseLocationImpl();
		return imagingManifestBaseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestBaseLocation1 createImagingManifestBaseLocation1() {
		ImagingManifestBaseLocation1Impl imagingManifestBaseLocation1 = new ImagingManifestBaseLocation1Impl();
		return imagingManifestBaseLocation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestInstance createImagingManifestInstance() {
		ImagingManifestInstanceImpl imagingManifestInstance = new ImagingManifestInstanceImpl();
		return imagingManifestInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestSeries createImagingManifestSeries() {
		ImagingManifestSeriesImpl imagingManifestSeries = new ImagingManifestSeriesImpl();
		return imagingManifestSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudy createImagingManifestStudy() {
		ImagingManifestStudyImpl imagingManifestStudy = new ImagingManifestStudyImpl();
		return imagingManifestStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyBaseLocation createImagingStudyBaseLocation() {
		ImagingStudyBaseLocationImpl imagingStudyBaseLocation = new ImagingStudyBaseLocationImpl();
		return imagingStudyBaseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyBaseLocation1 createImagingStudyBaseLocation1() {
		ImagingStudyBaseLocation1Impl imagingStudyBaseLocation1 = new ImagingStudyBaseLocation1Impl();
		return imagingStudyBaseLocation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyInstance createImagingStudyInstance() {
		ImagingStudyInstanceImpl imagingStudyInstance = new ImagingStudyInstanceImpl();
		return imagingStudyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation createImmunizationExplanation() {
		ImmunizationExplanationImpl immunizationExplanation = new ImmunizationExplanationImpl();
		return immunizationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion() {
		ImmunizationRecommendationDateCriterionImpl immunizationRecommendationDateCriterion = new ImmunizationRecommendationDateCriterionImpl();
		return immunizationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationProtocol createImmunizationRecommendationProtocol() {
		ImmunizationRecommendationProtocolImpl immunizationRecommendationProtocol = new ImmunizationRecommendationProtocolImpl();
		return immunizationRecommendationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol() {
		ImmunizationVaccinationProtocolImpl immunizationVaccinationProtocol = new ImmunizationVaccinationProtocolImpl();
		return immunizationVaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideContact createImplementationGuideContact() {
		ImplementationGuideContactImpl implementationGuideContact = new ImplementationGuideContactImpl();
		return implementationGuideContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDependency createImplementationGuideDependency() {
		ImplementationGuideDependencyImpl implementationGuideDependency = new ImplementationGuideDependencyImpl();
		return implementationGuideDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePackage createImplementationGuidePackage() {
		ImplementationGuidePackageImpl implementationGuidePackage = new ImplementationGuidePackageImpl();
		return implementationGuidePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage createImplementationGuidePage() {
		ImplementationGuidePageImpl implementationGuidePage = new ImplementationGuidePageImpl();
		return implementationGuidePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideResource createImplementationGuideResource() {
		ImplementationGuideResourceImpl implementationGuideResource = new ImplementationGuideResourceImpl();
		return implementationGuideResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailability createInstanceAvailability() {
		InstanceAvailabilityImpl instanceAvailability = new InstanceAvailabilityImpl();
		return instanceAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity createIssueSeverity() {
		IssueSeverityImpl issueSeverity = new IssueSeverityImpl();
		return issueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryStatus createLibraryStatus() {
		LibraryStatusImpl libraryStatus = new LibraryStatusImpl();
		return libraryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkage createLinkage() {
		LinkageImpl linkage = new LinkageImpl();
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageItem createLinkageItem() {
		LinkageItemImpl linkageItem = new LinkageItemImpl();
		return linkageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageType createLinkageType() {
		LinkageTypeImpl linkageType = new LinkageTypeImpl();
		return linkageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMode createListMode() {
		ListModeImpl listMode = new ListModeImpl();
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatus createListStatus() {
		ListStatusImpl listStatus = new ListStatusImpl();
		return listStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationMode createLocationMode() {
		LocationModeImpl locationMode = new LocationModeImpl();
		return locationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatus createLocationStatus() {
		LocationStatusImpl locationStatus = new LocationStatusImpl();
		return locationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown createMarkdown() {
		MarkdownImpl markdown = new MarkdownImpl();
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrinciple createMeasmntPrinciple() {
		MeasmntPrincipleImpl measmntPrinciple = new MeasmntPrincipleImpl();
		return measmntPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureDataUsage createMeasureDataUsage() {
		MeasureDataUsageImpl measureDataUsage = new MeasureDataUsageImpl();
		return measureDataUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulation createMeasurePopulation() {
		MeasurePopulationImpl measurePopulation = new MeasurePopulationImpl();
		return measurePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulationType createMeasurePopulationType() {
		MeasurePopulationTypeImpl measurePopulationType = new MeasurePopulationTypeImpl();
		return measurePopulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReport createMeasureReport() {
		MeasureReportImpl measureReport = new MeasureReportImpl();
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroup createMeasureReportGroup() {
		MeasureReportGroupImpl measureReportGroup = new MeasureReportGroupImpl();
		return measureReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroup1 createMeasureReportGroup1() {
		MeasureReportGroup1Impl measureReportGroup1 = new MeasureReportGroup1Impl();
		return measureReportGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroup2 createMeasureReportGroup2() {
		MeasureReportGroup2Impl measureReportGroup2 = new MeasureReportGroup2Impl();
		return measureReportGroup2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportPopulation createMeasureReportPopulation() {
		MeasureReportPopulationImpl measureReportPopulation = new MeasureReportPopulationImpl();
		return measureReportPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportPopulation1 createMeasureReportPopulation1() {
		MeasureReportPopulation1Impl measureReportPopulation1 = new MeasureReportPopulation1Impl();
		return measureReportPopulation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatus createMeasureReportStatus() {
		MeasureReportStatusImpl measureReportStatus = new MeasureReportStatusImpl();
		return measureReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStratifier createMeasureReportStratifier() {
		MeasureReportStratifierImpl measureReportStratifier = new MeasureReportStratifierImpl();
		return measureReportStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportSupplementalData createMeasureReportSupplementalData() {
		MeasureReportSupplementalDataImpl measureReportSupplementalData = new MeasureReportSupplementalDataImpl();
		return measureReportSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportType createMeasureReportType() {
		MeasureReportTypeImpl measureReportType = new MeasureReportTypeImpl();
		return measureReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureScoring createMeasureScoring() {
		MeasureScoringImpl measureScoring = new MeasureScoringImpl();
		return measureScoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureStratifier createMeasureStratifier() {
		MeasureStratifierImpl measureStratifier = new MeasureStratifierImpl();
		return measureStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSupplementalData createMeasureSupplementalData() {
		MeasureSupplementalDataImpl measureSupplementalData = new MeasureSupplementalDataImpl();
		return measureSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationEventHistory createMedicationAdministrationEventHistory() {
		MedicationAdministrationEventHistoryImpl medicationAdministrationEventHistory = new MedicationAdministrationEventHistoryImpl();
		return medicationAdministrationEventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatus createMedicationAdministrationStatus() {
		MedicationAdministrationStatusImpl medicationAdministrationStatus = new MedicationAdministrationStatusImpl();
		return medicationAdministrationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationBatch createMedicationBatch() {
		MedicationBatchImpl medicationBatch = new MedicationBatchImpl();
		return medicationBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationContent createMedicationContent() {
		MedicationContentImpl medicationContent = new MedicationContentImpl();
		return medicationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseDosageInstruction createMedicationDispenseDosageInstruction() {
		MedicationDispenseDosageInstructionImpl medicationDispenseDosageInstruction = new MedicationDispenseDosageInstructionImpl();
		return medicationDispenseDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseEventHistory createMedicationDispenseEventHistory() {
		MedicationDispenseEventHistoryImpl medicationDispenseEventHistory = new MedicationDispenseEventHistoryImpl();
		return medicationDispenseEventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatus createMedicationDispenseStatus() {
		MedicationDispenseStatusImpl medicationDispenseStatus = new MedicationDispenseStatusImpl();
		return medicationDispenseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationIngredient createMedicationIngredient() {
		MedicationIngredientImpl medicationIngredient = new MedicationIngredientImpl();
		return medicationIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder createMedicationOrder() {
		MedicationOrderImpl medicationOrder = new MedicationOrderImpl();
		return medicationOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderCategory createMedicationOrderCategory() {
		MedicationOrderCategoryImpl medicationOrderCategory = new MedicationOrderCategoryImpl();
		return medicationOrderCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderDispenseRequest createMedicationOrderDispenseRequest() {
		MedicationOrderDispenseRequestImpl medicationOrderDispenseRequest = new MedicationOrderDispenseRequestImpl();
		return medicationOrderDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderDosageInstruction createMedicationOrderDosageInstruction() {
		MedicationOrderDosageInstructionImpl medicationOrderDosageInstruction = new MedicationOrderDosageInstructionImpl();
		return medicationOrderDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderEventHistory createMedicationOrderEventHistory() {
		MedicationOrderEventHistoryImpl medicationOrderEventHistory = new MedicationOrderEventHistoryImpl();
		return medicationOrderEventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderStatus createMedicationOrderStatus() {
		MedicationOrderStatusImpl medicationOrderStatus = new MedicationOrderStatusImpl();
		return medicationOrderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderSubstitution createMedicationOrderSubstitution() {
		MedicationOrderSubstitutionImpl medicationOrderSubstitution = new MedicationOrderSubstitutionImpl();
		return medicationOrderSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage createMedicationPackage() {
		MedicationPackageImpl medicationPackage = new MedicationPackageImpl();
		return medicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProduct createMedicationProduct() {
		MedicationProductImpl medicationProduct = new MedicationProductImpl();
		return medicationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementCategory createMedicationStatementCategory() {
		MedicationStatementCategoryImpl medicationStatementCategory = new MedicationStatementCategoryImpl();
		return medicationStatementCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementDosage createMedicationStatementDosage() {
		MedicationStatementDosageImpl medicationStatementDosage = new MedicationStatementDosageImpl();
		return medicationStatementDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatus createMedicationStatementStatus() {
		MedicationStatementStatusImpl medicationStatementStatus = new MedicationStatementStatusImpl();
		return medicationStatementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderDestination createMessageHeaderDestination() {
		MessageHeaderDestinationImpl messageHeaderDestination = new MessageHeaderDestinationImpl();
		return messageHeaderDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderSource createMessageHeaderSource() {
		MessageHeaderSourceImpl messageHeaderSource = new MessageHeaderSourceImpl();
		return messageHeaderSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategory createMessageSignificanceCategory() {
		MessageSignificanceCategoryImpl messageSignificanceCategory = new MessageSignificanceCategoryImpl();
		return messageSignificanceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUse createNameUse() {
		NameUseImpl nameUse = new NameUseImpl();
		return nameUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemContact createNamingSystemContact() {
		NamingSystemContactImpl namingSystemContact = new NamingSystemContactImpl();
		return namingSystemContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierType createNamingSystemIdentifierType() {
		NamingSystemIdentifierTypeImpl namingSystemIdentifierType = new NamingSystemIdentifierTypeImpl();
		return namingSystemIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType createNamingSystemType() {
		NamingSystemTypeImpl namingSystemType = new NamingSystemTypeImpl();
		return namingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatus createNarrativeStatus() {
		NarrativeStatusImpl narrativeStatus = new NarrativeStatusImpl();
		return narrativeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatus createNutritionOrderStatus() {
		NutritionOrderStatusImpl nutritionOrderStatus = new NutritionOrderStatusImpl();
		return nutritionOrderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequest createNutritionRequest() {
		NutritionRequestImpl nutritionRequest = new NutritionRequestImpl();
		return nutritionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestAdministration createNutritionRequestAdministration() {
		NutritionRequestAdministrationImpl nutritionRequestAdministration = new NutritionRequestAdministrationImpl();
		return nutritionRequestAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestEnteralFormula createNutritionRequestEnteralFormula() {
		NutritionRequestEnteralFormulaImpl nutritionRequestEnteralFormula = new NutritionRequestEnteralFormulaImpl();
		return nutritionRequestEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestNutrient createNutritionRequestNutrient() {
		NutritionRequestNutrientImpl nutritionRequestNutrient = new NutritionRequestNutrientImpl();
		return nutritionRequestNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestOralDiet createNutritionRequestOralDiet() {
		NutritionRequestOralDietImpl nutritionRequestOralDiet = new NutritionRequestOralDietImpl();
		return nutritionRequestOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestSupplement createNutritionRequestSupplement() {
		NutritionRequestSupplementImpl nutritionRequestSupplement = new NutritionRequestSupplementImpl();
		return nutritionRequestSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestTexture createNutritionRequestTexture() {
		NutritionRequestTextureImpl nutritionRequestTexture = new NutritionRequestTextureImpl();
		return nutritionRequestTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelated createObservationRelated() {
		ObservationRelatedImpl observationRelated = new ObservationRelatedImpl();
		return observationRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipType createObservationRelationshipType() {
		ObservationRelationshipTypeImpl observationRelationshipType = new ObservationRelationshipTypeImpl();
		return observationRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatus createObservationStatus() {
		ObservationStatusImpl observationStatus = new ObservationStatusImpl();
		return observationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionBinding createOperationDefinitionBinding() {
		OperationDefinitionBindingImpl operationDefinitionBinding = new OperationDefinitionBindingImpl();
		return operationDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionContact createOperationDefinitionContact() {
		OperationDefinitionContactImpl operationDefinitionContact = new OperationDefinitionContactImpl();
		return operationDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKind() {
		OperationKindImpl operationKind = new OperationKindImpl();
		return operationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUse createOperationParameterUse() {
		OperationParameterUseImpl operationParameterUse = new OperationParameterUseImpl();
		return operationParameterUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequired createParticipantRequired() {
		ParticipantRequiredImpl participantRequired = new ParticipantRequiredImpl();
		return participantRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatus createParticipationStatus() {
		ParticipationStatusImpl participationStatus = new ParticipationStatusImpl();
		return participationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal createPatientAnimal() {
		PatientAnimalImpl patientAnimal = new PatientAnimalImpl();
		return patientAnimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNoticeStatus createPaymentNoticeStatus() {
		PaymentNoticeStatusImpl paymentNoticeStatus = new PaymentNoticeStatusImpl();
		return paymentNoticeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationDetail createPaymentReconciliationDetail() {
		PaymentReconciliationDetailImpl paymentReconciliationDetail = new PaymentReconciliationDetailImpl();
		return paymentReconciliationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationNote createPaymentReconciliationNote() {
		PaymentReconciliationNoteImpl paymentReconciliationNote = new PaymentReconciliationNoteImpl();
		return paymentReconciliationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationStatus createPaymentReconciliationStatus() {
		PaymentReconciliationStatusImpl paymentReconciliationStatus = new PaymentReconciliationStatusImpl();
		return paymentReconciliationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionCardinalityBehavior createPlanActionCardinalityBehavior() {
		PlanActionCardinalityBehaviorImpl planActionCardinalityBehavior = new PlanActionCardinalityBehaviorImpl();
		return planActionCardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionGroupingBehavior createPlanActionGroupingBehavior() {
		PlanActionGroupingBehaviorImpl planActionGroupingBehavior = new PlanActionGroupingBehaviorImpl();
		return planActionGroupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionParticipantType createPlanActionParticipantType() {
		PlanActionParticipantTypeImpl planActionParticipantType = new PlanActionParticipantTypeImpl();
		return planActionParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionPrecheckBehavior createPlanActionPrecheckBehavior() {
		PlanActionPrecheckBehaviorImpl planActionPrecheckBehavior = new PlanActionPrecheckBehaviorImpl();
		return planActionPrecheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipAnchor createPlanActionRelationshipAnchor() {
		PlanActionRelationshipAnchorImpl planActionRelationshipAnchor = new PlanActionRelationshipAnchorImpl();
		return planActionRelationshipAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipType createPlanActionRelationshipType() {
		PlanActionRelationshipTypeImpl planActionRelationshipType = new PlanActionRelationshipTypeImpl();
		return planActionRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRequiredBehavior createPlanActionRequiredBehavior() {
		PlanActionRequiredBehaviorImpl planActionRequiredBehavior = new PlanActionRequiredBehaviorImpl();
		return planActionRequiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionSelectionBehavior createPlanActionSelectionBehavior() {
		PlanActionSelectionBehaviorImpl planActionSelectionBehavior = new PlanActionSelectionBehaviorImpl();
		return planActionSelectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinition createPlanDefinition() {
		PlanDefinitionImpl planDefinition = new PlanDefinitionImpl();
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionActionDefinition createPlanDefinitionActionDefinition() {
		PlanDefinitionActionDefinitionImpl planDefinitionActionDefinition = new PlanDefinitionActionDefinitionImpl();
		return planDefinitionActionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionCondition createPlanDefinitionCondition() {
		PlanDefinitionConditionImpl planDefinitionCondition = new PlanDefinitionConditionImpl();
		return planDefinitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionDynamicValue createPlanDefinitionDynamicValue() {
		PlanDefinitionDynamicValueImpl planDefinitionDynamicValue = new PlanDefinitionDynamicValueImpl();
		return planDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionRelatedAction createPlanDefinitionRelatedAction() {
		PlanDefinitionRelatedActionImpl planDefinitionRelatedAction = new PlanDefinitionRelatedActionImpl();
		return planDefinitionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole1 createPractitionerRole1() {
		PractitionerRole1Impl practitionerRole1 = new PractitionerRole1Impl();
		return practitionerRole1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRoleAvailableTime createPractitionerRoleAvailableTime() {
		PractitionerRoleAvailableTimeImpl practitionerRoleAvailableTime = new PractitionerRoleAvailableTimeImpl();
		return practitionerRoleAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRoleNotAvailable createPractitionerRoleNotAvailable() {
		PractitionerRoleNotAvailableImpl practitionerRoleNotAvailable = new PractitionerRoleNotAvailableImpl();
		return practitionerRoleNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest createProcedureRequest() {
		ProcedureRequestImpl procedureRequest = new ProcedureRequestImpl();
		return procedureRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriority createProcedureRequestPriority() {
		ProcedureRequestPriorityImpl procedureRequestPriority = new ProcedureRequestPriorityImpl();
		return procedureRequestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatus createProcedureRequestStatus() {
		ProcedureRequestStatusImpl procedureRequestStatus = new ProcedureRequestStatusImpl();
		return procedureRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatus createProcedureStatus() {
		ProcedureStatusImpl procedureStatus = new ProcedureStatusImpl();
		return procedureStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest createProcessRequest() {
		ProcessRequestImpl processRequest = new ProcessRequestImpl();
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestItem createProcessRequestItem() {
		ProcessRequestItemImpl processRequestItem = new ProcessRequestItemImpl();
		return processRequestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestStatus createProcessRequestStatus() {
		ProcessRequestStatusImpl processRequestStatus = new ProcessRequestStatusImpl();
		return processRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse createProcessResponse() {
		ProcessResponseImpl processResponse = new ProcessResponseImpl();
		return processResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseNotes createProcessResponseNotes() {
		ProcessResponseNotesImpl processResponseNotes = new ProcessResponseNotesImpl();
		return processResponseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseStatus createProcessResponseStatus() {
		ProcessResponseStatusImpl processResponseStatus = new ProcessResponseStatusImpl();
		return processResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentation createPropertyRepresentation() {
		PropertyRepresentationImpl propertyRepresentation = new PropertyRepresentationImpl();
		return propertyRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRole createProvenanceEntityRole() {
		ProvenanceEntityRoleImpl provenanceEntityRole = new ProvenanceEntityRoleImpl();
		return provenanceEntityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceRelatedAgent createProvenanceRelatedAgent() {
		ProvenanceRelatedAgentImpl provenanceRelatedAgent = new ProvenanceRelatedAgentImpl();
		return provenanceRelatedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparator createQuantityComparator() {
		QuantityComparatorImpl quantityComparator = new QuantityComparatorImpl();
		return quantityComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireEnableWhen createQuestionnaireEnableWhen() {
		QuestionnaireEnableWhenImpl questionnaireEnableWhen = new QuestionnaireEnableWhenImpl();
		return questionnaireEnableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemType createQuestionnaireItemType() {
		QuestionnaireItemTypeImpl questionnaireItemType = new QuestionnaireItemTypeImpl();
		return questionnaireItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireOption createQuestionnaireOption() {
		QuestionnaireOptionImpl questionnaireOption = new QuestionnaireOptionImpl();
		return questionnaireOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseAnswer createQuestionnaireResponseAnswer() {
		QuestionnaireResponseAnswerImpl questionnaireResponseAnswer = new QuestionnaireResponseAnswerImpl();
		return questionnaireResponseAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatus createQuestionnaireResponseStatus() {
		QuestionnaireResponseStatusImpl questionnaireResponseStatus = new QuestionnaireResponseStatusImpl();
		return questionnaireResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatus createQuestionnaireStatus() {
		QuestionnaireStatusImpl questionnaireStatus = new QuestionnaireStatusImpl();
		return questionnaireStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRules createReferenceVersionRules() {
		ReferenceVersionRulesImpl referenceVersionRules = new ReferenceVersionRulesImpl();
		return referenceVersionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralCategory createReferralCategory() {
		ReferralCategoryImpl referralCategory = new ReferralCategoryImpl();
		return referralCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest createReferralRequest() {
		ReferralRequestImpl referralRequest = new ReferralRequestImpl();
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatus createReferralStatus() {
		ReferralStatusImpl referralStatus = new ReferralStatusImpl();
		return referralStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedResource createRelatedResource() {
		RelatedResourceImpl relatedResource = new RelatedResourceImpl();
		return relatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedResourceType createRelatedResourceType() {
		RelatedResourceTypeImpl relatedResourceType = new RelatedResourceTypeImpl();
		return relatedResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcome createRemittanceOutcome() {
		RemittanceOutcomeImpl remittanceOutcome = new RemittanceOutcomeImpl();
		return remittanceOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer createResourceContainer() {
		ResourceContainerImpl resourceContainer = new ResourceContainerImpl();
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy createResourceVersionPolicy() {
		ResourceVersionPolicyImpl resourceVersionPolicy = new ResourceVersionPolicyImpl();
		return resourceVersionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceMode createRestfulConformanceMode() {
		RestfulConformanceModeImpl restfulConformanceMode = new RestfulConformanceModeImpl();
		return restfulConformanceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledDataDataType createSampledDataDataType() {
		SampledDataDataTypeImpl sampledDataDataType = new SampledDataDataTypeImpl();
		return sampledDataDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode createSearchEntryMode() {
		SearchEntryModeImpl searchEntryMode = new SearchEntryModeImpl();
		return searchEntryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCode createSearchModifierCode() {
		SearchModifierCodeImpl searchModifierCode = new SearchModifierCodeImpl();
		return searchModifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameterContact createSearchParameterContact() {
		SearchParameterContactImpl searchParameterContact = new SearchParameterContactImpl();
		return searchParameterContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType createSearchParamType() {
		SearchParamTypeImpl searchParamType = new SearchParamTypeImpl();
		return searchParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceInner createSequenceInner() {
		SequenceInnerImpl sequenceInner = new SequenceInnerImpl();
		return sequenceInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceOuter createSequenceOuter() {
		SequenceOuterImpl sequenceOuter = new SequenceOuterImpl();
		return sequenceOuter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceQuality createSequenceQuality() {
		SequenceQualityImpl sequenceQuality = new SequenceQualityImpl();
		return sequenceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceReferenceSeq createSequenceReferenceSeq() {
		SequenceReferenceSeqImpl sequenceReferenceSeq = new SequenceReferenceSeqImpl();
		return sequenceReferenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRepository createSequenceRepository() {
		SequenceRepositoryImpl sequenceRepository = new SequenceRepositoryImpl();
		return sequenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariant createSequenceStructureVariant() {
		SequenceStructureVariantImpl sequenceStructureVariant = new SequenceStructureVariantImpl();
		return sequenceStructureVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceVariant createSequenceVariant() {
		SequenceVariantImpl sequenceVariant = new SequenceVariantImpl();
		return sequenceVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRules createSlicingRules() {
		SlicingRulesImpl slicingRules = new SlicingRulesImpl();
		return slicingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatus createSlotStatus() {
		SlotStatusImpl slotStatus = new SlotStatusImpl();
		return slotStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatus createSpecimenStatus() {
		SpecimenStatusImpl specimenStatus = new SpecimenStatusImpl();
		return specimenStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenTreatment createSpecimenTreatment() {
		SpecimenTreatmentImpl specimenTreatment = new SpecimenTreatmentImpl();
		return specimenTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionContact createStructureDefinitionContact() {
		StructureDefinitionContactImpl structureDefinitionContact = new StructureDefinitionContactImpl();
		return structureDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKind createStructureDefinitionKind() {
		StructureDefinitionKindImpl structureDefinitionKind = new StructureDefinitionKindImpl();
		return structureDefinitionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap createStructureMap() {
		StructureMapImpl structureMap = new StructureMapImpl();
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContact createStructureMapContact() {
		StructureMapContactImpl structureMapContact = new StructureMapContactImpl();
		return structureMapContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextType createStructureMapContextType() {
		StructureMapContextTypeImpl structureMapContextType = new StructureMapContextTypeImpl();
		return structureMapContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapDependent createStructureMapDependent() {
		StructureMapDependentImpl structureMapDependent = new StructureMapDependentImpl();
		return structureMapDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroup createStructureMapGroup() {
		StructureMapGroupImpl structureMapGroup = new StructureMapGroupImpl();
		return structureMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInput createStructureMapInput() {
		StructureMapInputImpl structureMapInput = new StructureMapInputImpl();
		return structureMapInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputMode createStructureMapInputMode() {
		StructureMapInputModeImpl structureMapInputMode = new StructureMapInputModeImpl();
		return structureMapInputMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapListMode createStructureMapListMode() {
		StructureMapListModeImpl structureMapListMode = new StructureMapListModeImpl();
		return structureMapListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelMode createStructureMapModelMode() {
		StructureMapModelModeImpl structureMapModelMode = new StructureMapModelModeImpl();
		return structureMapModelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapParameter createStructureMapParameter() {
		StructureMapParameterImpl structureMapParameter = new StructureMapParameterImpl();
		return structureMapParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapRule createStructureMapRule() {
		StructureMapRuleImpl structureMapRule = new StructureMapRuleImpl();
		return structureMapRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSource createStructureMapSource() {
		StructureMapSourceImpl structureMapSource = new StructureMapSourceImpl();
		return structureMapSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapStructure createStructureMapStructure() {
		StructureMapStructureImpl structureMapStructure = new StructureMapStructureImpl();
		return structureMapStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTarget createStructureMapTarget() {
		StructureMapTargetImpl structureMapTarget = new StructureMapTargetImpl();
		return structureMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransform createStructureMapTransform() {
		StructureMapTransformImpl structureMapTransform = new StructureMapTransformImpl();
		return structureMapTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelType createSubscriptionChannelType() {
		SubscriptionChannelTypeImpl subscriptionChannelType = new SubscriptionChannelTypeImpl();
		return subscriptionChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus createSubscriptionStatus() {
		SubscriptionStatusImpl subscriptionStatus = new SubscriptionStatusImpl();
		return subscriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatus createSupplyDeliveryStatus() {
		SupplyDeliveryStatusImpl supplyDeliveryStatus = new SupplyDeliveryStatusImpl();
		return supplyDeliveryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatus createSupplyRequestStatus() {
		SupplyRequestStatusImpl supplyRequestStatus = new SupplyRequestStatusImpl();
		return supplyRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestWhen createSupplyRequestWhen() {
		SupplyRequestWhenImpl supplyRequestWhen = new SupplyRequestWhenImpl();
		return supplyRequestWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteraction createSystemRestfulInteraction() {
		SystemRestfulInteractionImpl systemRestfulInteraction = new SystemRestfulInteractionImpl();
		return systemRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFulfillment createTaskFulfillment() {
		TaskFulfillmentImpl taskFulfillment = new TaskFulfillmentImpl();
		return taskFulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInput createTaskInput() {
		TaskInputImpl taskInput = new TaskInputImpl();
		return taskInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPriority createTaskPriority() {
		TaskPriorityImpl taskPriority = new TaskPriorityImpl();
		return taskPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus createTaskStatus() {
		TaskStatusImpl taskStatus = new TaskStatusImpl();
		return taskStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction createTestScriptAction() {
		TestScriptActionImpl testScriptAction = new TestScriptActionImpl();
		return testScriptAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction1 createTestScriptAction1() {
		TestScriptAction1Impl testScriptAction1 = new TestScriptAction1Impl();
		return testScriptAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction2 createTestScriptAction2() {
		TestScriptAction2Impl testScriptAction2 = new TestScriptAction2Impl();
		return testScriptAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAssert createTestScriptAssert() {
		TestScriptAssertImpl testScriptAssert = new TestScriptAssertImpl();
		return testScriptAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptCapability createTestScriptCapability() {
		TestScriptCapabilityImpl testScriptCapability = new TestScriptCapabilityImpl();
		return testScriptCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptContact createTestScriptContact() {
		TestScriptContactImpl testScriptContact = new TestScriptContactImpl();
		return testScriptContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptLink createTestScriptLink() {
		TestScriptLinkImpl testScriptLink = new TestScriptLinkImpl();
		return testScriptLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOperation createTestScriptOperation() {
		TestScriptOperationImpl testScriptOperation = new TestScriptOperationImpl();
		return testScriptOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam createTestScriptParam() {
		TestScriptParamImpl testScriptParam = new TestScriptParamImpl();
		return testScriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam1 createTestScriptParam1() {
		TestScriptParam1Impl testScriptParam1 = new TestScriptParam1Impl();
		return testScriptParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam2 createTestScriptParam2() {
		TestScriptParam2Impl testScriptParam2 = new TestScriptParam2Impl();
		return testScriptParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam3 createTestScriptParam3() {
		TestScriptParam3Impl testScriptParam3 = new TestScriptParam3Impl();
		return testScriptParam3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestHeader createTestScriptRequestHeader() {
		TestScriptRequestHeaderImpl testScriptRequestHeader = new TestScriptRequestHeaderImpl();
		return testScriptRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule createTestScriptRule() {
		TestScriptRuleImpl testScriptRule = new TestScriptRuleImpl();
		return testScriptRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule1 createTestScriptRule1() {
		TestScriptRule1Impl testScriptRule1 = new TestScriptRule1Impl();
		return testScriptRule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule2 createTestScriptRule2() {
		TestScriptRule2Impl testScriptRule2 = new TestScriptRule2Impl();
		return testScriptRule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule3 createTestScriptRule3() {
		TestScriptRule3Impl testScriptRule3 = new TestScriptRule3Impl();
		return testScriptRule3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRuleset createTestScriptRuleset() {
		TestScriptRulesetImpl testScriptRuleset = new TestScriptRulesetImpl();
		return testScriptRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRuleset1 createTestScriptRuleset1() {
		TestScriptRuleset1Impl testScriptRuleset1 = new TestScriptRuleset1Impl();
		return testScriptRuleset1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRepeat createTimingRepeat() {
		TimingRepeatImpl timingRepeat = new TimingRepeatImpl();
		return timingRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDefinition createTriggerDefinition() {
		TriggerDefinitionImpl triggerDefinition = new TriggerDefinitionImpl();
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerType() {
		TriggerTypeImpl triggerType = new TriggerTypeImpl();
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRule createTypeDerivationRule() {
		TypeDerivationRuleImpl typeDerivationRule = new TypeDerivationRuleImpl();
		return typeDerivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteraction createTypeRestfulInteraction() {
		TypeRestfulInteractionImpl typeRestfulInteraction = new TypeRestfulInteractionImpl();
		return typeRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime createUnitsOfTime() {
		UnitsOfTimeImpl unitsOfTime = new UnitsOfTimeImpl();
		return unitsOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCode createUnknownContentCode() {
		UnknownContentCodeImpl unknownContentCode = new UnknownContentCodeImpl();
		return unknownContentCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConcept createValueSetConcept() {
		ValueSetConceptImpl valueSetConcept = new ValueSetConceptImpl();
		return valueSetConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContact createValueSetContact() {
		ValueSetContactImpl valueSetContact = new ValueSetContactImpl();
		return valueSetContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContains createValueSetContains() {
		ValueSetContainsImpl valueSetContains = new ValueSetContainsImpl();
		return valueSetContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDesignation createValueSetDesignation() {
		ValueSetDesignationImpl valueSetDesignation = new ValueSetDesignationImpl();
		return valueSetDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetFilter createValueSetFilter() {
		ValueSetFilterImpl valueSetFilter = new ValueSetFilterImpl();
		return valueSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetInclude createValueSetInclude() {
		ValueSetIncludeImpl valueSetInclude = new ValueSetIncludeImpl();
		return valueSetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetParameter createValueSetParameter() {
		ValueSetParameterImpl valueSetParameter = new ValueSetParameterImpl();
		return valueSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase createVisionBase() {
		VisionBaseImpl visionBase = new VisionBaseImpl();
		return visionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyes createVisionEyes() {
		VisionEyesImpl visionEyes = new VisionEyesImpl();
		return visionEyes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionDispense createVisionPrescriptionDispense() {
		VisionPrescriptionDispenseImpl visionPrescriptionDispense = new VisionPrescriptionDispenseImpl();
		return visionPrescriptionDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageType createXPathUsageType() {
		XPathUsageTypeImpl xPathUsageType = new XPathUsageTypeImpl();
		return xPathUsageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusList createAccountStatusListFromString(EDataType eDataType, String initialValue) {
		AccountStatusList result = AccountStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionListList createActionListListFromString(EDataType eDataType, String initialValue) {
		ActionListList result = ActionListList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionCategoryList createActivityDefinitionCategoryListFromString(EDataType eDataType, String initialValue) {
		ActivityDefinitionCategoryList result = ActivityDefinitionCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityDefinitionCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeList createAddressTypeListFromString(EDataType eDataType, String initialValue) {
		AddressTypeList result = AddressTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListFromString(EDataType eDataType, String initialValue) {
		AddressUseList result = AddressUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListFromString(EDataType eDataType, String initialValue) {
		AdministrativeGenderList result = AdministrativeGenderList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListFromString(EDataType eDataType, String initialValue) {
		AggregationModeList result = AggregationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategoryList result = AllergyIntoleranceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertaintyList createAllergyIntoleranceCertaintyListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCertaintyList result = AllergyIntoleranceCertaintyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCertaintyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticalityList result = AllergyIntoleranceCriticalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverityList result = AllergyIntoleranceSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatusList createAllergyIntoleranceStatusListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceStatusList result = AllergyIntoleranceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceTypeList result = AllergyIntoleranceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListFromString(EDataType eDataType, String initialValue) {
		AppointmentStatusList result = AppointmentStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeList createAssertionDirectionTypeListFromString(EDataType eDataType, String initialValue) {
		AssertionDirectionTypeList result = AssertionDirectionTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeList createAssertionOperatorTypeListFromString(EDataType eDataType, String initialValue) {
		AssertionOperatorTypeList result = AssertionOperatorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesList createAssertionResponseTypesListFromString(EDataType eDataType, String initialValue) {
		AssertionResponseTypesList result = AssertionResponseTypesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListFromString(EDataType eDataType, String initialValue) {
		AuditEventActionList result = AuditEventActionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkTypeList createAuditEventAgentNetworkTypeListFromString(EDataType eDataType, String initialValue) {
		AuditEventAgentNetworkTypeList result = AuditEventAgentNetworkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListFromString(EDataType eDataType, String initialValue) {
		AuditEventOutcomeList result = AuditEventOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListFromString(EDataType eDataType, String initialValue) {
		BindingStrengthList result = BindingStrengthList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListFromString(EDataType eDataType, String initialValue) {
		BundleTypeList result = BundleTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityStatusList result = CarePlanActivityStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelationshipList createCarePlanRelationshipListFromString(EDataType eDataType, String initialValue) {
		CarePlanRelationshipList result = CarePlanRelationshipList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanRelationshipListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatusList createCarePlanStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanStatusList result = CarePlanStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseStatusList createClaimResponseStatusListFromString(EDataType eDataType, String initialValue) {
		ClaimResponseStatusList result = ClaimResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimStatusList createClaimStatusListFromString(EDataType eDataType, String initialValue) {
		ClaimStatusList result = ClaimStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionStatusList result = ClinicalImpressionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeList createCodeSystemContentModeListFromString(EDataType eDataType, String initialValue) {
		CodeSystemContentModeList result = CodeSystemContentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningList createCodeSystemHierarchyMeaningListFromString(EDataType eDataType, String initialValue) {
		CodeSystemHierarchyMeaningList result = CodeSystemHierarchyMeaningList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatusList createCommunicationRequestStatusListFromString(EDataType eDataType, String initialValue) {
		CommunicationRequestStatusList result = CommunicationRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatusList createCommunicationStatusListFromString(EDataType eDataType, String initialValue) {
		CommunicationStatusList result = CommunicationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeList createCompartmentTypeListFromString(EDataType eDataType, String initialValue) {
		CompartmentTypeList result = CompartmentTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListFromString(EDataType eDataType, String initialValue) {
		CompositionAttestationModeList result = CompositionAttestationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListFromString(EDataType eDataType, String initialValue) {
		CompositionStatusList result = CompositionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListFromString(EDataType eDataType, String initialValue) {
		ConceptMapEquivalenceList result = ConceptMapEquivalenceList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusList createConditionalDeleteStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionalDeleteStatusList result = ConditionalDeleteStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusList createConditionalReadStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionalReadStatusList result = ConditionalReadStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatusList createConditionVerificationStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionVerificationStatusList result = ConditionVerificationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionVerificationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventModeList createConformanceEventModeListFromString(EDataType eDataType, String initialValue) {
		ConformanceEventModeList result = ConformanceEventModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceEventModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatusList createConformanceResourceStatusListFromString(EDataType eDataType, String initialValue) {
		ConformanceResourceStatusList result = ConformanceResourceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceResourceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceStatementKindList createConformanceStatementKindListFromString(EDataType eDataType, String initialValue) {
		ConformanceStatementKindList result = ConformanceStatementKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceStatementKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningList createConsentDataMeaningListFromString(EDataType eDataType, String initialValue) {
		ConsentDataMeaningList result = ConsentDataMeaningList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptTypeList createConsentExceptTypeListFromString(EDataType eDataType, String initialValue) {
		ConsentExceptTypeList result = ConsentExceptTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentExceptTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatusList createConsentStatusListFromString(EDataType eDataType, String initialValue) {
		ConsentStatusList result = ConsentStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverityList result = ConstraintSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListFromString(EDataType eDataType, String initialValue) {
		ContactPointSystemList result = ContactPointSystemList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListFromString(EDataType eDataType, String initialValue) {
		ContactPointUseList result = ContactPointUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentTypeList createContentTypeListFromString(EDataType eDataType, String initialValue) {
		ContentTypeList result = ContentTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeList createContributorTypeListFromString(EDataType eDataType, String initialValue) {
		ContributorTypeList result = ContributorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageStatusList createCoverageStatusListFromString(EDataType eDataType, String initialValue) {
		CoverageStatusList result = CoverageStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringencyList createDataElementStringencyListFromString(EDataType eDataType, String initialValue) {
		DataElementStringencyList result = DataElementStringencyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementStringencyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListFromString(EDataType eDataType, String initialValue) {
		DaysOfWeekList result = DaysOfWeekList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityList createDetectedIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		DetectedIssueSeverityList result = DetectedIssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationStateList result = DeviceMetricCalibrationStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationTypeList result = DeviceMetricCalibrationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategoryList result = DeviceMetricCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricColorList result = DeviceMetricColorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatusList result = DeviceMetricOperationalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatusList createDeviceStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceStatusList result = DeviceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatusList result = DiagnosticReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaTypeList createDigitalMediaTypeListFromString(EDataType eDataType, String initialValue) {
		DigitalMediaTypeList result = DigitalMediaTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListFromString(EDataType eDataType, String initialValue) {
		DocumentModeList result = DocumentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatusList result = DocumentReferenceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		DocumentRelationshipTypeList result = DocumentRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestStatusList createEligibilityRequestStatusListFromString(EDataType eDataType, String initialValue) {
		EligibilityRequestStatusList result = EligibilityRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseStatusList createEligibilityResponseStatusListFromString(EDataType eDataType, String initialValue) {
		EligibilityResponseStatusList result = EligibilityResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatusList result = EncounterLocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusList createEncounterStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterStatusList result = EncounterStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusList createEndpointStatusListFromString(EDataType eDataType, String initialValue) {
		EndpointStatusList result = EndpointStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequestStatusList createEnrollmentRequestStatusListFromString(EDataType eDataType, String initialValue) {
		EnrollmentRequestStatusList result = EnrollmentRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrollmentRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponseStatusList createEnrollmentResponseStatusListFromString(EDataType eDataType, String initialValue) {
		EnrollmentResponseStatusList result = EnrollmentResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrollmentResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatusList result = EpisodeOfCareStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListFromString(EDataType eDataType, String initialValue) {
		EventTimingList result = EventTimingList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusList createExplanationOfBenefitStatusListFromString(EDataType eDataType, String initialValue) {
		ExplanationOfBenefitStatusList result = ExplanationOfBenefitStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextList createExtensionContextListFromString(EDataType eDataType, String initialValue) {
		ExtensionContextList result = ExtensionContextList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusList createFamilyHistoryStatusListFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryStatusList result = FamilyHistoryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListFromString(EDataType eDataType, String initialValue) {
		FilterOperatorList result = FilterOperatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListFromString(EDataType eDataType, String initialValue) {
		FlagStatusList result = FlagStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusList createGoalStatusListFromString(EDataType eDataType, String initialValue) {
		GoalStatusList result = GoalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListFromString(EDataType eDataType, String initialValue) {
		GroupTypeList result = GroupTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusList createGuidanceResponseStatusListFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseStatusList result = GuidanceResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyTypeList createGuideDependencyTypeListFromString(EDataType eDataType, String initialValue) {
		GuideDependencyTypeList result = GuideDependencyTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideDependencyTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKindList createGuidePageKindListFromString(EDataType eDataType, String initialValue) {
		GuidePageKindList result = GuidePageKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListFromString(EDataType eDataType, String initialValue) {
		HTTPVerbList result = HTTPVerbList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListFromString(EDataType eDataType, String initialValue) {
		IdentifierUseList result = IdentifierUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevelList result = IdentityAssuranceLevelList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailabilityList createInstanceAvailabilityListFromString(EDataType eDataType, String initialValue) {
		InstanceAvailabilityList result = InstanceAvailabilityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		IssueSeverityList result = IssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeList createIssueTypeListFromString(EDataType eDataType, String initialValue) {
		IssueTypeList result = IssueTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryStatusList createLibraryStatusListFromString(EDataType eDataType, String initialValue) {
		LibraryStatusList result = LibraryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeList createLinkageTypeListFromString(EDataType eDataType, String initialValue) {
		LinkageTypeList result = LinkageTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListFromString(EDataType eDataType, String initialValue) {
		LinkTypeList result = LinkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListFromString(EDataType eDataType, String initialValue) {
		ListModeList result = ListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListFromString(EDataType eDataType, String initialValue) {
		ListStatusList result = ListStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListFromString(EDataType eDataType, String initialValue) {
		LocationModeList result = LocationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListFromString(EDataType eDataType, String initialValue) {
		LocationStatusList result = LocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrincipleList createMeasmntPrincipleListFromString(EDataType eDataType, String initialValue) {
		MeasmntPrincipleList result = MeasmntPrincipleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureDataUsageList createMeasureDataUsageListFromString(EDataType eDataType, String initialValue) {
		MeasureDataUsageList result = MeasureDataUsageList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureDataUsageListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulationTypeList createMeasurePopulationTypeListFromString(EDataType eDataType, String initialValue) {
		MeasurePopulationTypeList result = MeasurePopulationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurePopulationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusList createMeasureReportStatusListFromString(EDataType eDataType, String initialValue) {
		MeasureReportStatusList result = MeasureReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeList createMeasureReportTypeListFromString(EDataType eDataType, String initialValue) {
		MeasureReportTypeList result = MeasureReportTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureScoringList createMeasureScoringListFromString(EDataType eDataType, String initialValue) {
		MeasureScoringList result = MeasureScoringList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureScoringListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureTypeList createMeasureTypeListFromString(EDataType eDataType, String initialValue) {
		MeasureTypeList result = MeasureTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusList createMedicationAdministrationStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationStatusList result = MedicationAdministrationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusList createMedicationDispenseStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatusList result = MedicationDispenseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderCategoryList createMedicationOrderCategoryListFromString(EDataType eDataType, String initialValue) {
		MedicationOrderCategoryList result = MedicationOrderCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationOrderCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderStatusList createMedicationOrderStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationOrderStatusList result = MedicationOrderStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationOrderStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementCategoryList createMedicationStatementCategoryListFromString(EDataType eDataType, String initialValue) {
		MedicationStatementCategoryList result = MedicationStatementCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusList createMedicationStatementStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationStatementStatusList result = MedicationStatementStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategoryList result = MessageSignificanceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListFromString(EDataType eDataType, String initialValue) {
		NameUseList result = NameUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierTypeList result = NamingSystemIdentifierTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemTypeList result = NamingSystemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListFromString(EDataType eDataType, String initialValue) {
		NarrativeStatusList result = NarrativeStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListFromString(EDataType eDataType, String initialValue) {
		NoteTypeList result = NoteTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatusList createNutritionOrderStatusListFromString(EDataType eDataType, String initialValue) {
		NutritionOrderStatusList result = NutritionOrderStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipTypeList createObservationRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		ObservationRelationshipTypeList result = ObservationRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListFromString(EDataType eDataType, String initialValue) {
		ObservationStatusList result = ObservationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListFromString(EDataType eDataType, String initialValue) {
		OperationKindList result = OperationKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListFromString(EDataType eDataType, String initialValue) {
		OperationParameterUseList result = OperationParameterUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListFromString(EDataType eDataType, String initialValue) {
		ParticipantRequiredList result = ParticipantRequiredList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListFromString(EDataType eDataType, String initialValue) {
		ParticipationStatusList result = ParticipationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNoticeStatusList createPaymentNoticeStatusListFromString(EDataType eDataType, String initialValue) {
		PaymentNoticeStatusList result = PaymentNoticeStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentNoticeStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationStatusList createPaymentReconciliationStatusListFromString(EDataType eDataType, String initialValue) {
		PaymentReconciliationStatusList result = PaymentReconciliationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentReconciliationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionCardinalityBehaviorList createPlanActionCardinalityBehaviorListFromString(EDataType eDataType, String initialValue) {
		PlanActionCardinalityBehaviorList result = PlanActionCardinalityBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionCardinalityBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionGroupingBehaviorList createPlanActionGroupingBehaviorListFromString(EDataType eDataType, String initialValue) {
		PlanActionGroupingBehaviorList result = PlanActionGroupingBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionGroupingBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionParticipantTypeList createPlanActionParticipantTypeListFromString(EDataType eDataType, String initialValue) {
		PlanActionParticipantTypeList result = PlanActionParticipantTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionParticipantTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionPrecheckBehaviorList createPlanActionPrecheckBehaviorListFromString(EDataType eDataType, String initialValue) {
		PlanActionPrecheckBehaviorList result = PlanActionPrecheckBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionPrecheckBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipAnchorList createPlanActionRelationshipAnchorListFromString(EDataType eDataType, String initialValue) {
		PlanActionRelationshipAnchorList result = PlanActionRelationshipAnchorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRelationshipAnchorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipTypeList createPlanActionRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		PlanActionRelationshipTypeList result = PlanActionRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRequiredBehaviorList createPlanActionRequiredBehaviorListFromString(EDataType eDataType, String initialValue) {
		PlanActionRequiredBehaviorList result = PlanActionRequiredBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRequiredBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionSelectionBehaviorList createPlanActionSelectionBehaviorListFromString(EDataType eDataType, String initialValue) {
		PlanActionSelectionBehaviorList result = PlanActionSelectionBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionSelectionBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriorityList createProcedureRequestPriorityListFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestPriorityList result = ProcedureRequestPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatusList createProcedureRequestStatusListFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestStatusList result = ProcedureRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatusList createProcedureStatusListFromString(EDataType eDataType, String initialValue) {
		ProcedureStatusList result = ProcedureStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestStatusList createProcessRequestStatusListFromString(EDataType eDataType, String initialValue) {
		ProcessRequestStatusList result = ProcessRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseStatusList createProcessResponseStatusListFromString(EDataType eDataType, String initialValue) {
		ProcessResponseStatusList result = ProcessResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentationList result = PropertyRepresentationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeList createPropertyTypeListFromString(EDataType eDataType, String initialValue) {
		PropertyTypeList result = PropertyTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRoleList result = ProvenanceEntityRoleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListFromString(EDataType eDataType, String initialValue) {
		QuantityComparatorList result = QuantityComparatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeList createQuestionnaireItemTypeListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemTypeList result = QuestionnaireItemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusList createQuestionnaireResponseStatusListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireResponseStatusList result = QuestionnaireResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatusList createQuestionnaireStatusListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireStatusList result = QuestionnaireStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesList createReferenceVersionRulesListFromString(EDataType eDataType, String initialValue) {
		ReferenceVersionRulesList result = ReferenceVersionRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralCategoryList createReferralCategoryListFromString(EDataType eDataType, String initialValue) {
		ReferralCategoryList result = ReferralCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatusList createReferralStatusListFromString(EDataType eDataType, String initialValue) {
		ReferralStatusList result = ReferralStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedResourceTypeList createRelatedResourceTypeListFromString(EDataType eDataType, String initialValue) {
		RelatedResourceTypeList result = RelatedResourceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedResourceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListFromString(EDataType eDataType, String initialValue) {
		RemittanceOutcomeList result = RemittanceOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicyList result = ResourceVersionPolicyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListFromString(EDataType eDataType, String initialValue) {
		ResponseTypeList result = ResponseTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceModeList createRestfulConformanceModeListFromString(EDataType eDataType, String initialValue) {
		RestfulConformanceModeList result = RestfulConformanceModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulConformanceModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListFromString(EDataType eDataType, String initialValue) {
		SearchEntryModeList result = SearchEntryModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeList createSearchModifierCodeListFromString(EDataType eDataType, String initialValue) {
		SearchModifierCodeList result = SearchModifierCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListFromString(EDataType eDataType, String initialValue) {
		SearchParamTypeList result = SearchParamTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTypeList createSequenceTypeListFromString(EDataType eDataType, String initialValue) {
		SequenceTypeList result = SequenceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListFromString(EDataType eDataType, String initialValue) {
		SlicingRulesList result = SlicingRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListFromString(EDataType eDataType, String initialValue) {
		SlotStatusList result = SlotStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusList createSpecimenStatusListFromString(EDataType eDataType, String initialValue) {
		SpecimenStatusList result = SpecimenStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindList createStructureDefinitionKindListFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionKindList result = StructureDefinitionKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextTypeList createStructureMapContextTypeListFromString(EDataType eDataType, String initialValue) {
		StructureMapContextTypeList result = StructureMapContextTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeList createStructureMapInputModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapInputModeList result = StructureMapInputModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapListModeList createStructureMapListModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapListModeList result = StructureMapListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeList createStructureMapModelModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapModelModeList result = StructureMapModelModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformList createStructureMapTransformListFromString(EDataType eDataType, String initialValue) {
		StructureMapTransformList result = StructureMapTransformList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListFromString(EDataType eDataType, String initialValue) {
		SubscriptionChannelTypeList result = SubscriptionChannelTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatusList result = SubscriptionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusList createSupplyDeliveryStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyDeliveryStatusList result = SupplyDeliveryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusList createSupplyRequestStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyRequestStatusList result = SupplyRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteractionList result = SystemRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPriorityList createTaskPriorityListFromString(EDataType eDataType, String initialValue) {
		TaskPriorityList result = TaskPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusList createTaskStatusListFromString(EDataType eDataType, String initialValue) {
		TaskStatusList result = TaskStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeList createTriggerTypeListFromString(EDataType eDataType, String initialValue) {
		TriggerTypeList result = TriggerTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleList createTypeDerivationRuleListFromString(EDataType eDataType, String initialValue) {
		TypeDerivationRuleList result = TypeDerivationRuleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteractionList result = TypeRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListFromString(EDataType eDataType, String initialValue) {
		UnitsOfTimeList result = UnitsOfTimeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCodeList createUnknownContentCodeListFromString(EDataType eDataType, String initialValue) {
		UnknownContentCodeList result = UnknownContentCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownContentCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListFromString(EDataType eDataType, String initialValue) {
		UseList result = UseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListFromString(EDataType eDataType, String initialValue) {
		VisionBaseList result = VisionBaseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListFromString(EDataType eDataType, String initialValue) {
		VisionEyesList result = VisionEyesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageTypeList createXPathUsageTypeListFromString(EDataType eDataType, String initialValue) {
		XPathUsageTypeList result = XPathUsageTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusList createAccountStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAccountStatusListFromString(FhirPackage.eINSTANCE.getAccountStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccountStatusListToString(FhirPackage.eINSTANCE.getAccountStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionListList createActionListListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionListListFromString(FhirPackage.eINSTANCE.getActionListList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionListListToString(FhirPackage.eINSTANCE.getActionListList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionCategoryList createActivityDefinitionCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createActivityDefinitionCategoryListFromString(FhirPackage.eINSTANCE.getActivityDefinitionCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityDefinitionCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActivityDefinitionCategoryListToString(FhirPackage.eINSTANCE.getActivityDefinitionCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeList createAddressTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressTypeListFromString(FhirPackage.eINSTANCE.getAddressTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressTypeListToString(FhirPackage.eINSTANCE.getAddressTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressUseListFromString(FhirPackage.eINSTANCE.getAddressUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressUseListToString(FhirPackage.eINSTANCE.getAddressUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdministrativeGenderListFromString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdministrativeGenderListToString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationModeListFromString(FhirPackage.eINSTANCE.getAggregationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationModeListToString(FhirPackage.eINSTANCE.getAggregationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCategoryListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCategoryListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertaintyList createAllergyIntoleranceCertaintyListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCertaintyListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCertaintyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCertaintyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCertaintyListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCertaintyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCriticalityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCriticalityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceSeverityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceSeverityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatusList createAllergyIntoleranceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceStatusListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceStatusListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceTypeListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceTypeListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAppointmentStatusListFromString(FhirPackage.eINSTANCE.getAppointmentStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppointmentStatusListToString(FhirPackage.eINSTANCE.getAppointmentStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeList createAssertionDirectionTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionDirectionTypeListFromString(FhirPackage.eINSTANCE.getAssertionDirectionTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionDirectionTypeListToString(FhirPackage.eINSTANCE.getAssertionDirectionTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeList createAssertionOperatorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionOperatorTypeListFromString(FhirPackage.eINSTANCE.getAssertionOperatorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionOperatorTypeListToString(FhirPackage.eINSTANCE.getAssertionOperatorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesList createAssertionResponseTypesListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionResponseTypesListFromString(FhirPackage.eINSTANCE.getAssertionResponseTypesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionResponseTypesListToString(FhirPackage.eINSTANCE.getAssertionResponseTypesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventActionListFromString(FhirPackage.eINSTANCE.getAuditEventActionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventActionListToString(FhirPackage.eINSTANCE.getAuditEventActionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkTypeList createAuditEventAgentNetworkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventAgentNetworkTypeListFromString(FhirPackage.eINSTANCE.getAuditEventAgentNetworkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventAgentNetworkTypeListToString(FhirPackage.eINSTANCE.getAuditEventAgentNetworkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventOutcomeListFromString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventOutcomeListToString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListObjectFromString(EDataType eDataType, String initialValue) {
		return createBindingStrengthListFromString(FhirPackage.eINSTANCE.getBindingStrengthList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindingStrengthListToString(FhirPackage.eINSTANCE.getBindingStrengthList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanPrimitiveFromString(FhirPackage.eINSTANCE.getBooleanPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanPrimitiveToString(FhirPackage.eINSTANCE.getBooleanPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createBundleTypeListFromString(FhirPackage.eINSTANCE.getBundleTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBundleTypeListToString(FhirPackage.eINSTANCE.getBundleTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanActivityStatusListFromString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanActivityStatusListToString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelationshipList createCarePlanRelationshipListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanRelationshipListFromString(FhirPackage.eINSTANCE.getCarePlanRelationshipList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanRelationshipListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanRelationshipListToString(FhirPackage.eINSTANCE.getCarePlanRelationshipList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatusList createCarePlanStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanStatusListFromString(FhirPackage.eINSTANCE.getCarePlanStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanStatusListToString(FhirPackage.eINSTANCE.getCarePlanStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseStatusList createClaimResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createClaimResponseStatusListFromString(FhirPackage.eINSTANCE.getClaimResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClaimResponseStatusListToString(FhirPackage.eINSTANCE.getClaimResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimStatusList createClaimStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createClaimStatusListFromString(FhirPackage.eINSTANCE.getClaimStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClaimStatusListToString(FhirPackage.eINSTANCE.getClaimStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createClinicalImpressionStatusListFromString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClinicalImpressionStatusListToString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeList createCodeSystemContentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemContentModeListFromString(FhirPackage.eINSTANCE.getCodeSystemContentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemContentModeListToString(FhirPackage.eINSTANCE.getCodeSystemContentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningList createCodeSystemHierarchyMeaningListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemHierarchyMeaningListFromString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemHierarchyMeaningListToString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatusList createCommunicationRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCommunicationRequestStatusListFromString(FhirPackage.eINSTANCE.getCommunicationRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommunicationRequestStatusListToString(FhirPackage.eINSTANCE.getCommunicationRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatusList createCommunicationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCommunicationStatusListFromString(FhirPackage.eINSTANCE.getCommunicationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommunicationStatusListToString(FhirPackage.eINSTANCE.getCommunicationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeList createCompartmentTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompartmentTypeListFromString(FhirPackage.eINSTANCE.getCompartmentTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompartmentTypeListToString(FhirPackage.eINSTANCE.getCompartmentTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionAttestationModeListFromString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionAttestationModeListToString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionStatusListFromString(FhirPackage.eINSTANCE.getCompositionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionStatusListToString(FhirPackage.eINSTANCE.getCompositionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapEquivalenceListFromString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapEquivalenceListToString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusList createConditionalDeleteStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalDeleteStatusListFromString(FhirPackage.eINSTANCE.getConditionalDeleteStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalDeleteStatusListToString(FhirPackage.eINSTANCE.getConditionalDeleteStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusList createConditionalReadStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalReadStatusListFromString(FhirPackage.eINSTANCE.getConditionalReadStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalReadStatusListToString(FhirPackage.eINSTANCE.getConditionalReadStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatusList createConditionVerificationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionVerificationStatusListFromString(FhirPackage.eINSTANCE.getConditionVerificationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionVerificationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionVerificationStatusListToString(FhirPackage.eINSTANCE.getConditionVerificationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventModeList createConformanceEventModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceEventModeListFromString(FhirPackage.eINSTANCE.getConformanceEventModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceEventModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceEventModeListToString(FhirPackage.eINSTANCE.getConformanceEventModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatusList createConformanceResourceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceResourceStatusListFromString(FhirPackage.eINSTANCE.getConformanceResourceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceResourceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceResourceStatusListToString(FhirPackage.eINSTANCE.getConformanceResourceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceStatementKindList createConformanceStatementKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceStatementKindListFromString(FhirPackage.eINSTANCE.getConformanceStatementKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceStatementKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceStatementKindListToString(FhirPackage.eINSTANCE.getConformanceStatementKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningList createConsentDataMeaningListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentDataMeaningListFromString(FhirPackage.eINSTANCE.getConsentDataMeaningList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentDataMeaningListToString(FhirPackage.eINSTANCE.getConsentDataMeaningList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptTypeList createConsentExceptTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentExceptTypeListFromString(FhirPackage.eINSTANCE.getConsentExceptTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentExceptTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentExceptTypeListToString(FhirPackage.eINSTANCE.getConsentExceptTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatusList createConsentStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentStatusListFromString(FhirPackage.eINSTANCE.getConsentStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentStatusListToString(FhirPackage.eINSTANCE.getConsentStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintSeverityListFromString(FhirPackage.eINSTANCE.getConstraintSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintSeverityListToString(FhirPackage.eINSTANCE.getConstraintSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointSystemListFromString(FhirPackage.eINSTANCE.getContactPointSystemList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointSystemListToString(FhirPackage.eINSTANCE.getContactPointSystemList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointUseListFromString(FhirPackage.eINSTANCE.getContactPointUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointUseListToString(FhirPackage.eINSTANCE.getContactPointUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentTypeList createContentTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createContentTypeListFromString(FhirPackage.eINSTANCE.getContentTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContentTypeListToString(FhirPackage.eINSTANCE.getContentTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeList createContributorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorTypeListFromString(FhirPackage.eINSTANCE.getContributorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorTypeListToString(FhirPackage.eINSTANCE.getContributorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageStatusList createCoverageStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCoverageStatusListFromString(FhirPackage.eINSTANCE.getCoverageStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCoverageStatusListToString(FhirPackage.eINSTANCE.getCoverageStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringencyList createDataElementStringencyListObjectFromString(EDataType eDataType, String initialValue) {
		return createDataElementStringencyListFromString(FhirPackage.eINSTANCE.getDataElementStringencyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementStringencyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataElementStringencyListToString(FhirPackage.eINSTANCE.getDataElementStringencyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDatePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDatePrimitiveBaseToString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrimitiveBaseToString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListObjectFromString(EDataType eDataType, String initialValue) {
		return createDaysOfWeekListFromString(FhirPackage.eINSTANCE.getDaysOfWeekList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDaysOfWeekListToString(FhirPackage.eINSTANCE.getDaysOfWeekList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityList createDetectedIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createDetectedIssueSeverityListFromString(FhirPackage.eINSTANCE.getDetectedIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDetectedIssueSeverityListToString(FhirPackage.eINSTANCE.getDetectedIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationStateListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationStateListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationTypeListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationTypeListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCategoryListFromString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCategoryListToString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricColorListFromString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricColorListToString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricOperationalStatusListFromString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricOperationalStatusListToString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatusList createDeviceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceStatusListFromString(FhirPackage.eINSTANCE.getDeviceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceStatusListToString(FhirPackage.eINSTANCE.getDeviceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticReportStatusListFromString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticReportStatusListToString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaTypeList createDigitalMediaTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDigitalMediaTypeListFromString(FhirPackage.eINSTANCE.getDigitalMediaTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDigitalMediaTypeListToString(FhirPackage.eINSTANCE.getDigitalMediaTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentModeListFromString(FhirPackage.eINSTANCE.getDocumentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentModeListToString(FhirPackage.eINSTANCE.getDocumentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentReferenceStatusListFromString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentReferenceStatusListToString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentRelationshipTypeListFromString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentRelationshipTypeListToString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestStatusList createEligibilityRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityRequestStatusListFromString(FhirPackage.eINSTANCE.getEligibilityRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityRequestStatusListToString(FhirPackage.eINSTANCE.getEligibilityRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseStatusList createEligibilityResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityResponseStatusListFromString(FhirPackage.eINSTANCE.getEligibilityResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityResponseStatusListToString(FhirPackage.eINSTANCE.getEligibilityResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterLocationStatusListFromString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterLocationStatusListToString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusList createEncounterStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterStatusListFromString(FhirPackage.eINSTANCE.getEncounterStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterStatusListToString(FhirPackage.eINSTANCE.getEncounterStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusList createEndpointStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEndpointStatusListFromString(FhirPackage.eINSTANCE.getEndpointStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndpointStatusListToString(FhirPackage.eINSTANCE.getEndpointStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequestStatusList createEnrollmentRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEnrollmentRequestStatusListFromString(FhirPackage.eINSTANCE.getEnrollmentRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrollmentRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnrollmentRequestStatusListToString(FhirPackage.eINSTANCE.getEnrollmentRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponseStatusList createEnrollmentResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEnrollmentResponseStatusListFromString(FhirPackage.eINSTANCE.getEnrollmentResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrollmentResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnrollmentResponseStatusListToString(FhirPackage.eINSTANCE.getEnrollmentResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEpisodeOfCareStatusListFromString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEpisodeOfCareStatusListToString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTimingListFromString(FhirPackage.eINSTANCE.getEventTimingList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTimingListToString(FhirPackage.eINSTANCE.getEventTimingList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusList createExplanationOfBenefitStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createExplanationOfBenefitStatusListFromString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExplanationOfBenefitStatusListToString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextList createExtensionContextListObjectFromString(EDataType eDataType, String initialValue) {
		return createExtensionContextListFromString(FhirPackage.eINSTANCE.getExtensionContextList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtensionContextListToString(FhirPackage.eINSTANCE.getExtensionContextList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusList createFamilyHistoryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFamilyHistoryStatusListFromString(FhirPackage.eINSTANCE.getFamilyHistoryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFamilyHistoryStatusListToString(FhirPackage.eINSTANCE.getFamilyHistoryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterOperatorListFromString(FhirPackage.eINSTANCE.getFilterOperatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterOperatorListToString(FhirPackage.eINSTANCE.getFilterOperatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFlagStatusListFromString(FhirPackage.eINSTANCE.getFlagStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlagStatusListToString(FhirPackage.eINSTANCE.getFlagStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusList createGoalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGoalStatusListFromString(FhirPackage.eINSTANCE.getGoalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGoalStatusListToString(FhirPackage.eINSTANCE.getGoalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupTypeListFromString(FhirPackage.eINSTANCE.getGroupTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupTypeListToString(FhirPackage.eINSTANCE.getGroupTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusList createGuidanceResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidanceResponseStatusListFromString(FhirPackage.eINSTANCE.getGuidanceResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidanceResponseStatusListToString(FhirPackage.eINSTANCE.getGuidanceResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyTypeList createGuideDependencyTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuideDependencyTypeListFromString(FhirPackage.eINSTANCE.getGuideDependencyTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideDependencyTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuideDependencyTypeListToString(FhirPackage.eINSTANCE.getGuideDependencyTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKindList createGuidePageKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidePageKindListFromString(FhirPackage.eINSTANCE.getGuidePageKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidePageKindListToString(FhirPackage.eINSTANCE.getGuidePageKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListObjectFromString(EDataType eDataType, String initialValue) {
		return createHTTPVerbListFromString(FhirPackage.eINSTANCE.getHTTPVerbList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHTTPVerbListToString(FhirPackage.eINSTANCE.getHTTPVerbList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierUseListFromString(FhirPackage.eINSTANCE.getIdentifierUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierUseListToString(FhirPackage.eINSTANCE.getIdentifierUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityAssuranceLevelListFromString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityAssuranceLevelListToString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailabilityList createInstanceAvailabilityListObjectFromString(EDataType eDataType, String initialValue) {
		return createInstanceAvailabilityListFromString(FhirPackage.eINSTANCE.getInstanceAvailabilityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstanceAvailabilityListToString(FhirPackage.eINSTANCE.getInstanceAvailabilityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createInstantPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegerPrimitiveFromString(FhirPackage.eINSTANCE.getIntegerPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerPrimitiveToString(FhirPackage.eINSTANCE.getIntegerPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueSeverityListFromString(FhirPackage.eINSTANCE.getIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueSeverityListToString(FhirPackage.eINSTANCE.getIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeList createIssueTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueTypeListFromString(FhirPackage.eINSTANCE.getIssueTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueTypeListToString(FhirPackage.eINSTANCE.getIssueTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryStatusList createLibraryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createLibraryStatusListFromString(FhirPackage.eINSTANCE.getLibraryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLibraryStatusListToString(FhirPackage.eINSTANCE.getLibraryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeList createLinkageTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkageTypeListFromString(FhirPackage.eINSTANCE.getLinkageTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkageTypeListToString(FhirPackage.eINSTANCE.getLinkageTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkTypeListFromString(FhirPackage.eINSTANCE.getLinkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkTypeListToString(FhirPackage.eINSTANCE.getLinkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createListModeListFromString(FhirPackage.eINSTANCE.getListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListModeListToString(FhirPackage.eINSTANCE.getListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createListStatusListFromString(FhirPackage.eINSTANCE.getListStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListStatusListToString(FhirPackage.eINSTANCE.getListStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationModeListFromString(FhirPackage.eINSTANCE.getLocationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationModeListToString(FhirPackage.eINSTANCE.getLocationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationStatusListFromString(FhirPackage.eINSTANCE.getLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationStatusListToString(FhirPackage.eINSTANCE.getLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkdownPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkdownPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrincipleList createMeasmntPrincipleListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasmntPrincipleListFromString(FhirPackage.eINSTANCE.getMeasmntPrincipleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasmntPrincipleListToString(FhirPackage.eINSTANCE.getMeasmntPrincipleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureDataUsageList createMeasureDataUsageListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureDataUsageListFromString(FhirPackage.eINSTANCE.getMeasureDataUsageList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureDataUsageListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureDataUsageListToString(FhirPackage.eINSTANCE.getMeasureDataUsageList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulationTypeList createMeasurePopulationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasurePopulationTypeListFromString(FhirPackage.eINSTANCE.getMeasurePopulationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurePopulationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasurePopulationTypeListToString(FhirPackage.eINSTANCE.getMeasurePopulationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusList createMeasureReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportStatusListFromString(FhirPackage.eINSTANCE.getMeasureReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportStatusListToString(FhirPackage.eINSTANCE.getMeasureReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeList createMeasureReportTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportTypeListFromString(FhirPackage.eINSTANCE.getMeasureReportTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportTypeListToString(FhirPackage.eINSTANCE.getMeasureReportTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureScoringList createMeasureScoringListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureScoringListFromString(FhirPackage.eINSTANCE.getMeasureScoringList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureScoringListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureScoringListToString(FhirPackage.eINSTANCE.getMeasureScoringList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureTypeList createMeasureTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureTypeListFromString(FhirPackage.eINSTANCE.getMeasureTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureTypeListToString(FhirPackage.eINSTANCE.getMeasureTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusList createMedicationAdministrationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationAdministrationStatusListFromString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationAdministrationStatusListToString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusList createMedicationDispenseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationDispenseStatusListFromString(FhirPackage.eINSTANCE.getMedicationDispenseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationDispenseStatusListToString(FhirPackage.eINSTANCE.getMedicationDispenseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderCategoryList createMedicationOrderCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationOrderCategoryListFromString(FhirPackage.eINSTANCE.getMedicationOrderCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationOrderCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationOrderCategoryListToString(FhirPackage.eINSTANCE.getMedicationOrderCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderStatusList createMedicationOrderStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationOrderStatusListFromString(FhirPackage.eINSTANCE.getMedicationOrderStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationOrderStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationOrderStatusListToString(FhirPackage.eINSTANCE.getMedicationOrderStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementCategoryList createMedicationStatementCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatementCategoryListFromString(FhirPackage.eINSTANCE.getMedicationStatementCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatementCategoryListToString(FhirPackage.eINSTANCE.getMedicationStatementCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusList createMedicationStatementStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatementStatusListFromString(FhirPackage.eINSTANCE.getMedicationStatementStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatementStatusListToString(FhirPackage.eINSTANCE.getMedicationStatementStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageSignificanceCategoryListFromString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageSignificanceCategoryListToString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createNameUseListFromString(FhirPackage.eINSTANCE.getNameUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameUseListToString(FhirPackage.eINSTANCE.getNameUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemIdentifierTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemIdentifierTypeListToString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemTypeListToString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNarrativeStatusListFromString(FhirPackage.eINSTANCE.getNarrativeStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNarrativeStatusListToString(FhirPackage.eINSTANCE.getNarrativeStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteTypeListFromString(FhirPackage.eINSTANCE.getNoteTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteTypeListToString(FhirPackage.eINSTANCE.getNoteTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatusList createNutritionOrderStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNutritionOrderStatusListFromString(FhirPackage.eINSTANCE.getNutritionOrderStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNutritionOrderStatusListToString(FhirPackage.eINSTANCE.getNutritionOrderStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipTypeList createObservationRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationRelationshipTypeListFromString(FhirPackage.eINSTANCE.getObservationRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationRelationshipTypeListToString(FhirPackage.eINSTANCE.getObservationRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationStatusListFromString(FhirPackage.eINSTANCE.getObservationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationStatusListToString(FhirPackage.eINSTANCE.getObservationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationKindListFromString(FhirPackage.eINSTANCE.getOperationKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationKindListToString(FhirPackage.eINSTANCE.getOperationKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationParameterUseListFromString(FhirPackage.eINSTANCE.getOperationParameterUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationParameterUseListToString(FhirPackage.eINSTANCE.getOperationParameterUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantRequiredListFromString(FhirPackage.eINSTANCE.getParticipantRequiredList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantRequiredListToString(FhirPackage.eINSTANCE.getParticipantRequiredList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipationStatusListFromString(FhirPackage.eINSTANCE.getParticipationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipationStatusListToString(FhirPackage.eINSTANCE.getParticipationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNoticeStatusList createPaymentNoticeStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentNoticeStatusListFromString(FhirPackage.eINSTANCE.getPaymentNoticeStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentNoticeStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentNoticeStatusListToString(FhirPackage.eINSTANCE.getPaymentNoticeStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationStatusList createPaymentReconciliationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentReconciliationStatusListFromString(FhirPackage.eINSTANCE.getPaymentReconciliationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentReconciliationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentReconciliationStatusListToString(FhirPackage.eINSTANCE.getPaymentReconciliationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionCardinalityBehaviorList createPlanActionCardinalityBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionCardinalityBehaviorListFromString(FhirPackage.eINSTANCE.getPlanActionCardinalityBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionCardinalityBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionCardinalityBehaviorListToString(FhirPackage.eINSTANCE.getPlanActionCardinalityBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionGroupingBehaviorList createPlanActionGroupingBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionGroupingBehaviorListFromString(FhirPackage.eINSTANCE.getPlanActionGroupingBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionGroupingBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionGroupingBehaviorListToString(FhirPackage.eINSTANCE.getPlanActionGroupingBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionParticipantTypeList createPlanActionParticipantTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionParticipantTypeListFromString(FhirPackage.eINSTANCE.getPlanActionParticipantTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionParticipantTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionParticipantTypeListToString(FhirPackage.eINSTANCE.getPlanActionParticipantTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionPrecheckBehaviorList createPlanActionPrecheckBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionPrecheckBehaviorListFromString(FhirPackage.eINSTANCE.getPlanActionPrecheckBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionPrecheckBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionPrecheckBehaviorListToString(FhirPackage.eINSTANCE.getPlanActionPrecheckBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipAnchorList createPlanActionRelationshipAnchorListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionRelationshipAnchorListFromString(FhirPackage.eINSTANCE.getPlanActionRelationshipAnchorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRelationshipAnchorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionRelationshipAnchorListToString(FhirPackage.eINSTANCE.getPlanActionRelationshipAnchorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipTypeList createPlanActionRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionRelationshipTypeListFromString(FhirPackage.eINSTANCE.getPlanActionRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionRelationshipTypeListToString(FhirPackage.eINSTANCE.getPlanActionRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRequiredBehaviorList createPlanActionRequiredBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionRequiredBehaviorListFromString(FhirPackage.eINSTANCE.getPlanActionRequiredBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRequiredBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionRequiredBehaviorListToString(FhirPackage.eINSTANCE.getPlanActionRequiredBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionSelectionBehaviorList createPlanActionSelectionBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanActionSelectionBehaviorListFromString(FhirPackage.eINSTANCE.getPlanActionSelectionBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionSelectionBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanActionSelectionBehaviorListToString(FhirPackage.eINSTANCE.getPlanActionSelectionBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriorityList createProcedureRequestPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureRequestPriorityListFromString(FhirPackage.eINSTANCE.getProcedureRequestPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureRequestPriorityListToString(FhirPackage.eINSTANCE.getProcedureRequestPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatusList createProcedureRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureRequestStatusListFromString(FhirPackage.eINSTANCE.getProcedureRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureRequestStatusListToString(FhirPackage.eINSTANCE.getProcedureRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatusList createProcedureStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureStatusListFromString(FhirPackage.eINSTANCE.getProcedureStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureStatusListToString(FhirPackage.eINSTANCE.getProcedureStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestStatusList createProcessRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessRequestStatusListFromString(FhirPackage.eINSTANCE.getProcessRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessRequestStatusListToString(FhirPackage.eINSTANCE.getProcessRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseStatusList createProcessResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessResponseStatusListFromString(FhirPackage.eINSTANCE.getProcessResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessResponseStatusListToString(FhirPackage.eINSTANCE.getProcessResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyRepresentationListFromString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyRepresentationListToString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeList createPropertyTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeListFromString(FhirPackage.eINSTANCE.getPropertyTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeListToString(FhirPackage.eINSTANCE.getPropertyTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListObjectFromString(EDataType eDataType, String initialValue) {
		return createProvenanceEntityRoleListFromString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProvenanceEntityRoleListToString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuantityComparatorListFromString(FhirPackage.eINSTANCE.getQuantityComparatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuantityComparatorListToString(FhirPackage.eINSTANCE.getQuantityComparatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeList createQuestionnaireItemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemTypeListFromString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemTypeListToString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusList createQuestionnaireResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireResponseStatusListFromString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireResponseStatusListToString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatusList createQuestionnaireStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireStatusListFromString(FhirPackage.eINSTANCE.getQuestionnaireStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireStatusListToString(FhirPackage.eINSTANCE.getQuestionnaireStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesList createReferenceVersionRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceVersionRulesListFromString(FhirPackage.eINSTANCE.getReferenceVersionRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceVersionRulesListToString(FhirPackage.eINSTANCE.getReferenceVersionRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralCategoryList createReferralCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferralCategoryListFromString(FhirPackage.eINSTANCE.getReferralCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferralCategoryListToString(FhirPackage.eINSTANCE.getReferralCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatusList createReferralStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferralStatusListFromString(FhirPackage.eINSTANCE.getReferralStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferralStatusListToString(FhirPackage.eINSTANCE.getReferralStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedResourceTypeList createRelatedResourceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRelatedResourceTypeListFromString(FhirPackage.eINSTANCE.getRelatedResourceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedResourceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelatedResourceTypeListToString(FhirPackage.eINSTANCE.getRelatedResourceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRemittanceOutcomeListFromString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRemittanceOutcomeListToString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceVersionPolicyListFromString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceVersionPolicyListToString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseTypeListFromString(FhirPackage.eINSTANCE.getResponseTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseTypeListToString(FhirPackage.eINSTANCE.getResponseTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceModeList createRestfulConformanceModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRestfulConformanceModeListFromString(FhirPackage.eINSTANCE.getRestfulConformanceModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulConformanceModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestfulConformanceModeListToString(FhirPackage.eINSTANCE.getRestfulConformanceModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSampledDataDataTypePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampledDataDataTypePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchEntryModeListFromString(FhirPackage.eINSTANCE.getSearchEntryModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchEntryModeListToString(FhirPackage.eINSTANCE.getSearchEntryModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeList createSearchModifierCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchModifierCodeListFromString(FhirPackage.eINSTANCE.getSearchModifierCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchModifierCodeListToString(FhirPackage.eINSTANCE.getSearchModifierCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchParamTypeListFromString(FhirPackage.eINSTANCE.getSearchParamTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchParamTypeListToString(FhirPackage.eINSTANCE.getSearchParamTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTypeList createSequenceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSequenceTypeListFromString(FhirPackage.eINSTANCE.getSequenceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSequenceTypeListToString(FhirPackage.eINSTANCE.getSequenceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlicingRulesListFromString(FhirPackage.eINSTANCE.getSlicingRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlicingRulesListToString(FhirPackage.eINSTANCE.getSlicingRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlotStatusListFromString(FhirPackage.eINSTANCE.getSlotStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlotStatusListToString(FhirPackage.eINSTANCE.getSlotStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusList createSpecimenStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenStatusListFromString(FhirPackage.eINSTANCE.getSpecimenStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenStatusListToString(FhirPackage.eINSTANCE.getSpecimenStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindList createStructureDefinitionKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureDefinitionKindListFromString(FhirPackage.eINSTANCE.getStructureDefinitionKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureDefinitionKindListToString(FhirPackage.eINSTANCE.getStructureDefinitionKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextTypeList createStructureMapContextTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapContextTypeListFromString(FhirPackage.eINSTANCE.getStructureMapContextTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapContextTypeListToString(FhirPackage.eINSTANCE.getStructureMapContextTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeList createStructureMapInputModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapInputModeListFromString(FhirPackage.eINSTANCE.getStructureMapInputModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapInputModeListToString(FhirPackage.eINSTANCE.getStructureMapInputModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapListModeList createStructureMapListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapListModeListFromString(FhirPackage.eINSTANCE.getStructureMapListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapListModeListToString(FhirPackage.eINSTANCE.getStructureMapListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeList createStructureMapModelModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapModelModeListFromString(FhirPackage.eINSTANCE.getStructureMapModelModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapModelModeListToString(FhirPackage.eINSTANCE.getStructureMapModelModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformList createStructureMapTransformListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTransformListFromString(FhirPackage.eINSTANCE.getStructureMapTransformList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTransformListToString(FhirPackage.eINSTANCE.getStructureMapTransformList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionChannelTypeListFromString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionChannelTypeListToString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionStatusListFromString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionStatusListToString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusList createSupplyDeliveryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyDeliveryStatusListFromString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyDeliveryStatusListToString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusList createSupplyRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyRequestStatusListFromString(FhirPackage.eINSTANCE.getSupplyRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyRequestStatusListToString(FhirPackage.eINSTANCE.getSupplyRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemRestfulInteractionListFromString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemRestfulInteractionListToString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPriorityList createTaskPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskPriorityListFromString(FhirPackage.eINSTANCE.getTaskPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskPriorityListToString(FhirPackage.eINSTANCE.getTaskPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusList createTaskStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskStatusListFromString(FhirPackage.eINSTANCE.getTaskStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskStatusListToString(FhirPackage.eINSTANCE.getTaskStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeList createTriggerTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggerTypeListFromString(FhirPackage.eINSTANCE.getTriggerTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggerTypeListToString(FhirPackage.eINSTANCE.getTriggerTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleList createTypeDerivationRuleListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDerivationRuleListFromString(FhirPackage.eINSTANCE.getTypeDerivationRuleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDerivationRuleListToString(FhirPackage.eINSTANCE.getTypeDerivationRuleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestfulInteractionListFromString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestfulInteractionListToString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsOfTimeListFromString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsOfTimeListToString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCodeList createUnknownContentCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUnknownContentCodeListFromString(FhirPackage.eINSTANCE.getUnknownContentCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownContentCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnknownContentCodeListToString(FhirPackage.eINSTANCE.getUnknownContentCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnsignedIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createUseListFromString(FhirPackage.eINSTANCE.getUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseListToString(FhirPackage.eINSTANCE.getUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionBaseListFromString(FhirPackage.eINSTANCE.getVisionBaseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionBaseListToString(FhirPackage.eINSTANCE.getVisionBaseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionEyesListFromString(FhirPackage.eINSTANCE.getVisionEyesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionEyesListToString(FhirPackage.eINSTANCE.getVisionEyesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageTypeList createXPathUsageTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createXPathUsageTypeListFromString(FhirPackage.eINSTANCE.getXPathUsageTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertXPathUsageTypeListToString(FhirPackage.eINSTANCE.getXPathUsageTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirPackage getFhirPackage() {
		return (FhirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirPackage getPackage() {
		return FhirPackage.eINSTANCE;
	}

} //FhirFactoryImpl
