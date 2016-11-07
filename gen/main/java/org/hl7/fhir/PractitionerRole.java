/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getNotAvailable <em>Not Available</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRole#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPractitionerRole()
 * @model extendedMetaData="name='PractitionerRole' kind='elementOnly'"
 * @generated
 */
public interface PractitionerRole extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Identifiers that are specific to a role/location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this practitioner's record is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRole#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner that is able to provide the defined services for the organation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Practitioner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPractitioner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRole#getPractitioner <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' containment reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization where the Practitioner performs the roles associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRole#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles which this practitioner is authorized to perform for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCode();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific specialty of the practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location(s) at which this practitioner provides care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLocation();

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of healthcare services that this worker provides for this role's Organization/Location(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_HealthcareService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='healthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getHealthcareService();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details that are specific to the role/location/service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRole#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PractitionerRoleAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of times that the Service Site is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Time</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_AvailableTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PractitionerRoleAvailableTime> getAvailableTime();

	/**
	 * Returns the value of the '<em><b>Not Available</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PractitionerRoleNotAvailable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HealthcareService is not available during this period of time due to the provided reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Available</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_NotAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notAvailable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PractitionerRoleNotAvailable> getNotAvailable();

	/**
	 * Returns the value of the '<em><b>Availability Exceptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #setAvailabilityExceptions(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_AvailabilityExceptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availabilityExceptions' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAvailabilityExceptions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRole#getAvailabilityExceptions <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #getAvailabilityExceptions()
	 * @generated
	 */
	void setAvailabilityExceptions(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical endpoints providing access to services operated for the practitioner with this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRole_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

} // PractitionerRole
