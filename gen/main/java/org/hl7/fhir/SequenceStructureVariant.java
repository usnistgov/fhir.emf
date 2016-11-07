/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Structure Variant</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SequenceStructureVariant#getPrecisionOfBoundaries <em>Precision Of Boundaries</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceStructureVariant#getReportedaCGHRatio <em>Reporteda CGH Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceStructureVariant#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceStructureVariant#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceStructureVariant#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceStructureVariant()
 * @model extendedMetaData="name='Sequence.StructureVariant' kind='elementOnly'"
 * @generated
 */
public interface SequenceStructureVariant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Precision Of Boundaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precision of boundaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision Of Boundaries</em>' containment reference.
	 * @see #setPrecisionOfBoundaries(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceStructureVariant_PrecisionOfBoundaries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precisionOfBoundaries' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPrecisionOfBoundaries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceStructureVariant#getPrecisionOfBoundaries <em>Precision Of Boundaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Of Boundaries</em>' containment reference.
	 * @see #getPrecisionOfBoundaries()
	 * @generated
	 */
	void setPrecisionOfBoundaries(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reporteda CGH Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural Variant reported aCGH ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporteda CGH Ratio</em>' containment reference.
	 * @see #setReportedaCGHRatio(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceStructureVariant_ReportedaCGHRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportedaCGHRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getReportedaCGHRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceStructureVariant#getReportedaCGHRatio <em>Reporteda CGH Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporteda CGH Ratio</em>' containment reference.
	 * @see #getReportedaCGHRatio()
	 * @generated
	 */
	void setReportedaCGHRatio(Decimal value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural Variant Length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceStructureVariant_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceStructureVariant#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural variant outer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer</em>' containment reference.
	 * @see #setOuter(SequenceOuter)
	 * @see org.hl7.fhir.FhirPackage#getSequenceStructureVariant_Outer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outer' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceOuter getOuter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceStructureVariant#getOuter <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' containment reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(SequenceOuter value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural variant inner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(SequenceInner)
	 * @see org.hl7.fhir.FhirPackage#getSequenceStructureVariant_Inner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inner' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceInner getInner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceStructureVariant#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(SequenceInner value);

} // SequenceStructureVariant
