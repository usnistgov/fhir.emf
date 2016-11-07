/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Manifest Series</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingManifestSeries#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestSeries#getBaseLocation <em>Base Location</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestSeries#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries()
 * @model extendedMetaData="name='ImagingManifest.Series' kind='elementOnly'"
 * @generated
 */
public interface ImagingManifestSeries extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Series instance UID of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestSeries#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Base Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingManifestBaseLocation1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Methods of accessing (e.g. retrieving) the series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries_BaseLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingManifestBaseLocation1> getBaseLocation();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingManifestInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity and locating information of the selected DICOM SOP instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries_Instance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingManifestInstance> getInstance();

} // ImagingManifestSeries
