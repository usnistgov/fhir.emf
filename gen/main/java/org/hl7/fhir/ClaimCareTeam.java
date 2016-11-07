/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Care Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimCareTeam#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCareTeam#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCareTeam#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCareTeam#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCareTeam#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimCareTeam()
 * @model extendedMetaData="name='Claim.CareTeam' kind='elementOnly'"
 * @generated
 */
public interface ClaimCareTeam extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Member of the team who provided the overall service. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimCareTeam_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCareTeam#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
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
	 * Member of the team who provided the overall service. (choose any one of provider*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimCareTeam_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCareTeam#getProviderReference <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Reference</em>' containment reference.
	 * @see #getProviderReference()
	 * @generated
	 */
	void setProviderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who is billing and responsible for the claimed good or service rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getClaimCareTeam_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCareTeam#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimCareTeam_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCareTeam#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Coding value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualification which is applicable for this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference.
	 * @see #setQualification(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimCareTeam_Qualification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getQualification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCareTeam#getQualification <em>Qualification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' containment reference.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(Coding value);

} // ClaimCareTeam
