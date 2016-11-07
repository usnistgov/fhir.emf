/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Consent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getConsentor <em>Consentor</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceIdentifier <em>Source Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getExcept <em>Except</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsent()
 * @model extendedMetaData="name='Consent' kind='elementOnly'"
 * @generated
 */
public interface Consent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this copy of the Consent Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current state of this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConsentStatus)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConsentStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this  Consent was issued / created / indexed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConsent_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant time or time-period when this Consent is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient/healthcare consumer to whom this consent applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Consentor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient/consumer that is responsible for agreeing to the consent represented by this resource. This is the person (usually) that agreed to the policy, along with the exceptions, e.g. the persion who takes responsibility for the agreement. In the signature this corresponds to the role "Consent Signature".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consentor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Consentor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getConsentor();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that manages the consent, and the framework within which it is executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Source Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Attachment</em>' containment reference.
	 * @see #setSourceAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getSourceAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Attachment</em>' containment reference.
	 * @see #getSourceAttachment()
	 * @generated
	 */
	void setSourceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Source Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Identifier</em>' containment reference.
	 * @see #setSourceIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSourceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceIdentifier <em>Source Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identifier</em>' containment reference.
	 * @see #getSourceIdentifier()
	 * @generated
	 */
	void setSourceIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Reference</em>' containment reference.
	 * @see #setSourceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' containment reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the policy that this consents to. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Policy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getPolicy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(Uri value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actor whose access is controlled by this consent under the terms of the policy and exceptions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipient();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPurpose();

	/**
	 * Returns the value of the '<em><b>Except</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentExcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Except</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Except()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='except' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentExcept> getExcept();

} // Consent
