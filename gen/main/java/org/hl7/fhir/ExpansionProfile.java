/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIncludeDesignations <em>Include Designations</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIncludeDefinition <em>Include Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIncludeInactive <em>Include Inactive</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludeNested <em>Exclude Nested</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludeNotForUI <em>Exclude Not For UI</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDisplayLanguage <em>Display Language</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getLimitedExpansion <em>Limited Expansion</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfile()
 * @model extendedMetaData="name='ExpansionProfile' kind='elementOnly'"
 * @generated
 */
public interface ExpansionProfile extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getUrl <em>Url</em>}' containment reference.
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
	 * Formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * Used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getVersion <em>Version</em>}' containment reference.
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
	 * A free text natural language name for the expansion profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getName <em>Name</em>}' containment reference.
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
	 * The status of the expansion profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConformanceResourceStatus)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceResourceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getStatus <em>Status</em>}' containment reference.
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
	 * This expansion profile was authored for testing purposes (or education/evaluation/marketing), and is not intended for genuine production usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The name of the individual or organization that published the expansion profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpansionProfileContact> getContact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the expansion profile status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDate <em>Date</em>}' containment reference.
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
	 * A free text natural language description of the use of the expansion profile - reason for definition,  conditions of use, etc. The description may include a list of expected usages for the expansion profile and can also describe the approach taken to build the expansion profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of criteria that provide the constraints imposed on the value set expansion by including or excluding codes from specific code systems (or versions).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(ExpansionProfileCodeSystem)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileCodeSystem getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getCodeSystem <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(ExpansionProfileCodeSystem value);

	/**
	 * Returns the value of the '<em><b>Include Designations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether concept designations are to be included or excluded in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Designations</em>' containment reference.
	 * @see #setIncludeDesignations(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_IncludeDesignations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeDesignations' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIncludeDesignations();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIncludeDesignations <em>Include Designations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Designations</em>' containment reference.
	 * @see #getIncludeDesignations()
	 * @generated
	 */
	void setIncludeDesignations(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference.
	 * @see #setDesignation(ExpansionProfileDesignation)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileDesignation getDesignation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDesignation <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation</em>' containment reference.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(ExpansionProfileDesignation value);

	/**
	 * Returns the value of the '<em><b>Include Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether the value set definition is included or excluded in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Definition</em>' containment reference.
	 * @see #setIncludeDefinition(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_IncludeDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIncludeDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIncludeDefinition <em>Include Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Definition</em>' containment reference.
	 * @see #getIncludeDefinition()
	 * @generated
	 */
	void setIncludeDefinition(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether inactive concepts are included or excluded in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Inactive</em>' containment reference.
	 * @see #setIncludeInactive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_IncludeInactive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeInactive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIncludeInactive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIncludeInactive <em>Include Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Inactive</em>' containment reference.
	 * @see #getIncludeInactive()
	 * @generated
	 */
	void setIncludeInactive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Nested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether or not the value set expansion includes nested codes (i.e. ValueSet.expansion.contains.contains).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Nested</em>' containment reference.
	 * @see #setExcludeNested(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludeNested()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeNested' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcludeNested();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludeNested <em>Exclude Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Nested</em>' containment reference.
	 * @see #getExcludeNested()
	 * @generated
	 */
	void setExcludeNested(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Not For UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Not For UI</em>' containment reference.
	 * @see #setExcludeNotForUI(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludeNotForUI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeNotForUI' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcludeNotForUI();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludeNotForUI <em>Exclude Not For UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Not For UI</em>' containment reference.
	 * @see #getExcludeNotForUI()
	 * @generated
	 */
	void setExcludeNotForUI(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Post Coordinated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether or not the value set expansion includes post coordinated codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Post Coordinated</em>' containment reference.
	 * @see #setExcludePostCoordinated(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludePostCoordinated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludePostCoordinated' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcludePostCoordinated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Post Coordinated</em>' containment reference.
	 * @see #getExcludePostCoordinated()
	 * @generated
	 */
	void setExcludePostCoordinated(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Display Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Language</em>' containment reference.
	 * @see #setDisplayLanguage(Code)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_DisplayLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='displayLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getDisplayLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDisplayLanguage <em>Display Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Language</em>' containment reference.
	 * @see #getDisplayLanguage()
	 * @generated
	 */
	void setDisplayLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Limited Expansion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limited Expansion</em>' containment reference.
	 * @see #setLimitedExpansion(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_LimitedExpansion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='limitedExpansion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getLimitedExpansion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getLimitedExpansion <em>Limited Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Expansion</em>' containment reference.
	 * @see #getLimitedExpansion()
	 * @generated
	 */
	void setLimitedExpansion(org.hl7.fhir.Boolean value);

} // ExpansionProfile
