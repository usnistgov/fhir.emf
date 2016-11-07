/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner Role Not Available</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PractitionerRoleNotAvailable#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerRoleNotAvailable#getDuring <em>During</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPractitionerRoleNotAvailable()
 * @model extendedMetaData="name='PractitionerRole.NotAvailable' kind='elementOnly'"
 * @generated
 */
public interface PractitionerRoleNotAvailable extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason that can be presented to the user as to why this time is not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRoleNotAvailable_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRoleNotAvailable#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service is not available (seasonally or for a public holiday) from this date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>During</em>' containment reference.
	 * @see #setDuring(Period)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerRoleNotAvailable_During()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='during' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDuring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerRoleNotAvailable#getDuring <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' containment reference.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(Period value);

} // PractitionerRoleNotAvailable
