/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getInsurerIdentifier <em>Insurer Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getInsurerReference <em>Insurer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getSubjectIdentifier <em>Subject Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EnrollmentRequest#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest()
 * @model extendedMetaData="name='EnrollmentRequest' kind='elementOnly'"
 * @generated
 */
public interface EnrollmentRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EnrollmentRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EnrollmentRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Insurer Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of insurer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer Identifier</em>' containment reference.
	 * @see #setInsurerIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_InsurerIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getInsurerIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getInsurerIdentifier <em>Insurer Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer Identifier</em>' containment reference.
	 * @see #getInsurerIdentifier()
	 * @generated
	 */
	void setInsurerIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Insurer Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request. (choose any one of insurer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer Reference</em>' containment reference.
	 * @see #setInsurerReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_InsurerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getInsurerReference <em>Insurer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer Reference</em>' containment reference.
	 * @see #getInsurerReference()
	 * @generated
	 */
	void setInsurerReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #getProviderIdentifier()
	 * @generated
	 */
	void setProviderIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Provider Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getProviderReference <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Reference</em>' containment reference.
	 * @see #getProviderReference()
	 * @generated
	 */
	void setProviderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #setOrganizationIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_OrganizationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganizationIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getOrganizationIdentifier <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Identifier</em>' containment reference.
	 * @see #getOrganizationIdentifier()
	 * @generated
	 */
	void setOrganizationIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Organization Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient. (choose any one of organization*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Reference</em>' containment reference.
	 * @see #setOrganizationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_OrganizationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganizationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getOrganizationReference <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Reference</em>' containment reference.
	 * @see #getOrganizationReference()
	 * @generated
	 */
	void setOrganizationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Subject Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource. (choose any one of subject*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Identifier</em>' containment reference.
	 * @see #setSubjectIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_SubjectIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSubjectIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getSubjectIdentifier <em>Subject Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Identifier</em>' containment reference.
	 * @see #getSubjectIdentifier()
	 * @generated
	 */
	void setSubjectIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Subject Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource. (choose any one of subject*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Reference</em>' containment reference.
	 * @see #setSubjectReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_SubjectReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubjectReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getSubjectReference <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Reference</em>' containment reference.
	 * @see #getSubjectReference()
	 * @generated
	 */
	void setSubjectReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the program or plan identification, underwriter or payor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEnrollmentRequest_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EnrollmentRequest#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

} // EnrollmentRequest
