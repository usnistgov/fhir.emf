/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Manifest Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances may have been selected for a purpose, such as  conference, or consult.  Reflecting a range of sharing purposes, typical ImagingManifest resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); both a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingManifestInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestInstance#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingManifestInstance()
 * @model extendedMetaData="name='ImagingManifest.Instance' kind='elementOnly'"
 * @generated
 */
public interface ImagingManifestInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sop Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOP class UID of the selected instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sop Class</em>' containment reference.
	 * @see #setSopClass(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestInstance_SopClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sopClass' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getSopClass();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestInstance#getSopClass <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' containment reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Oid value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOP Instance UID of the selected instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestInstance_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestInstance#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

} // ImagingManifestInstance
