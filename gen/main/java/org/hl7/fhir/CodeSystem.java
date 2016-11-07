/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A code system resource specifies a set of codes drawn from one or more code systems.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CodeSystem#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getHierarchyMeaning <em>Hierarchy Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getVersionNeeded <em>Version Needed</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.CodeSystem#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCodeSystem()
 * @model extendedMetaData="name='CodeSystem' kind='elementOnly'"
 * @generated
 */
public interface CodeSystem extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this code system when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this code system is (or will be) published. This is used in [Coding]{datatypes.html#Coding}.system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify this version of the code system when it is referenced in a specification, model, design or instance (e.g. Coding.version). This is an arbitrary value managed by the profile author manually and the value should be a timestamp. This is used in [Coding]{datatypes.html#Coding}.version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getVersion <em>Version</em>}' containment reference.
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
	 * A free text natural language name describing the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConformanceResourceStatus)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceResourceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConformanceResourceStatus value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This CodeSystem was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeSystemContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemContact> getContact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the code system status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the use of the code system - reason for definition, "the semantic space" to be included in the code system, conditions of use, etc. The description may include a list of expected usages for the code system and can also describe the approach taken to build the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of code system definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUseContext();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains why this code system is needed and why it has been constrained as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Markdown value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If code comparison is case sensitive when codes within this system are compared to each other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #setCaseSensitive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_CaseSensitive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseSensitive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getCaseSensitive <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Canonical URL of value set that contains the entire code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(Uri value);

	/**
	 * Returns the value of the '<em><b>Hierarchy Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meaning of the heirarchy of concepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hierarchy Meaning</em>' containment reference.
	 * @see #setHierarchyMeaning(CodeSystemHierarchyMeaning)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_HierarchyMeaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierarchyMeaning' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemHierarchyMeaning getHierarchyMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getHierarchyMeaning <em>Hierarchy Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Meaning</em>' containment reference.
	 * @see #getHierarchyMeaning()
	 * @generated
	 */
	void setHierarchyMeaning(CodeSystemHierarchyMeaning value);

	/**
	 * Returns the value of the '<em><b>Compositional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True If code system defines a post-composition grammar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compositional</em>' containment reference.
	 * @see #setCompositional(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Compositional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositional' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCompositional();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getCompositional <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositional</em>' containment reference.
	 * @see #getCompositional()
	 * @generated
	 */
	void setCompositional(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Version Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag is used to signify that the code system has not (or does not) maintain the definitions, and a version must be specified when referencing this code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Needed</em>' containment reference.
	 * @see #setVersionNeeded(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_VersionNeeded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getVersionNeeded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getVersionNeeded <em>Version Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Needed</em>' containment reference.
	 * @see #getVersionNeeded()
	 * @generated
	 */
	void setVersionNeeded(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How much of the content of the code system - the concepts and codes it defines - are represented in this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(CodeSystemContentMode)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemContentMode getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(CodeSystemContentMode value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of concepts defined by the code system. Where the code system has a compositional grammar, the count refers to the number of base (primitive) concepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSystem#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeSystemFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemFilter> getFilter();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeSystemProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property defines an additional slot through which additional information can be provided about a concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeSystemConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCodeSystem_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemConcept> getConcept();

} // CodeSystem
