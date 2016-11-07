/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measure resource provides the definition of a quality measure.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Measure#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRelatedResource <em>Related Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRiskAdjustment <em>Risk Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRateAggregation <em>Rate Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getSet <em>Set</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasure()
 * @model extendedMetaData="name='Measure' kind='elementOnly'"
 * @generated
 */
public interface Measure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this measure when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this measure is (or will be) published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A logical identifier for the measure such as the CMS or NQF identifier. Note that at least one identifier is required for non-experimental active artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the measure, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A machine-friendly name for the measure. This name should be usable as an identifier for the measure by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive, user-friendly title for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the measure was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the measure from the consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief description of the purpose of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A detailed description of how the measure is used from a clinical perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference.
	 * @see #setUsage(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Usage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUsage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getUsage <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' containment reference.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the measure was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_PublicationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPublicationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the measure content was last reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Review Date</em>' containment reference.
	 * @see #setLastReviewDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getLastReviewDate <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Review Date</em>' containment reference.
	 * @see #getLastReviewDate()
	 * @generated
	 */
	void setLastReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period during which the measure content is effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies various attributes of the patient population for whom and/or environment of care in which, the measure is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getCoverage();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical topics related to the content of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Topic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTopic();

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Contributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contributor to the content of the measure, including authors, editors, reviewers, and endorsers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Contributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Contributor> getContributor();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the measure (also known as the steward for the measure). This information is required for non-experimental active artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the measure and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Related Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related resources such as additional documentation, justification, or bibliographic references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_RelatedResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedResource> getRelatedResource();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Library resource containing the formal logic used by the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLibrary();

	/**
	 * Returns the value of the '<em><b>Disclaimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A disclaimer for the use of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disclaimer</em>' containment reference.
	 * @see #setDisclaimer(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Disclaimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disclaimer' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDisclaimer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getDisclaimer <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disclaimer</em>' containment reference.
	 * @see #getDisclaimer()
	 * @generated
	 */
	void setDisclaimer(Markdown value);

	/**
	 * Returns the value of the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure scoring type, e.g. proportion, CV.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scoring</em>' containment reference.
	 * @see #setScoring(MeasureScoring)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Scoring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scoring' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureScoring getScoring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getScoring <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoring</em>' containment reference.
	 * @see #getScoring()
	 * @generated
	 */
	void setScoring(MeasureScoring value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure type, e.g. process, outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getType();

	/**
	 * Returns the value of the '<em><b>Risk Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the risk adjustment factors that may impact the resulting score for the measure and how they may be accounted for when computing and reporting measure results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Adjustment</em>' containment reference.
	 * @see #setRiskAdjustment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_RiskAdjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='riskAdjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRiskAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getRiskAdjustment <em>Risk Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Adjustment</em>' containment reference.
	 * @see #getRiskAdjustment()
	 * @generated
	 */
	void setRiskAdjustment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Rate Aggregation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the rate aggregation for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Aggregation</em>' containment reference.
	 * @see #setRateAggregation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_RateAggregation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateAggregation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRateAggregation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getRateAggregation <em>Rate Aggregation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Aggregation</em>' containment reference.
	 * @see #getRateAggregation()
	 * @generated
	 */
	void setRateAggregation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rationale for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRationale();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(Markdown value);

	/**
	 * Returns the value of the '<em><b>Clinical Recommendation Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical recommendation statement for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Recommendation Statement</em>' containment reference.
	 * @see #setClinicalRecommendationStatement(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_ClinicalRecommendationStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalRecommendationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getClinicalRecommendationStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Recommendation Statement</em>' containment reference.
	 * @see #getClinicalRecommendationStatement()
	 * @generated
	 */
	void setClinicalRecommendationStatement(Markdown value);

	/**
	 * Returns the value of the '<em><b>Improvement Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Improvement notation for the measure, e.g. higher score indicates better quality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Improvement Notation</em>' containment reference.
	 * @see #setImprovementNotation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_ImprovementNotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='improvementNotation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getImprovementNotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getImprovementNotation <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improvement Notation</em>' containment reference.
	 * @see #getImprovementNotation()
	 * @generated
	 */
	void setImprovementNotation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of the complete measure calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Markdown value);

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional guidance for the measure including how it can be used in a clinical context, and the intent of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guidance</em>' containment reference.
	 * @see #setGuidance(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Guidance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guidance' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getGuidance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getGuidance <em>Guidance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance</em>' containment reference.
	 * @see #getGuidance()
	 * @generated
	 */
	void setGuidance(Markdown value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure set, e.g. Preventive Care and Screening.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Set()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of population criteria for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Supplemental Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureSupplementalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_SupplementalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureSupplementalData> getSupplementalData();

} // Measure
