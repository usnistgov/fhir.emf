/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Raw data describing a biological sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getVariantId <em>Variant Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getReadId <em>Read Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceRepository()
 * @model extendedMetaData="name='Sequence.Repository' kind='elementOnly'"
 * @generated
 */
public interface SequenceRepository extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of an external repository which contains further details about the genetics data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of an external repository which contains further details about the genetics data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Variant Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the variant in this external repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Id</em>' containment reference.
	 * @see #setVariantId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_VariantId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVariantId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getVariantId <em>Variant Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Id</em>' containment reference.
	 * @see #getVariantId()
	 * @generated
	 */
	void setVariantId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Read Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the read in this external repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Id</em>' containment reference.
	 * @see #setReadId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_ReadId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReadId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getReadId <em>Read Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Id</em>' containment reference.
	 * @see #getReadId()
	 * @generated
	 */
	void setReadId(org.hl7.fhir.String value);

} // SequenceRepository
