/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Variant</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SequenceVariant#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceVariant#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceVariant#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceVariant#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceVariant#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceVariant#getVariantPointer <em>Variant Pointer</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceVariant()
 * @model extendedMetaData="name='Sequence.Variant' kind='elementOnly'"
 * @generated
 */
public interface SequenceVariant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start position (inclusive) of the variant on the  reference sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceVariant_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceVariant#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position (exclusive) of the variant on the reference sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceVariant_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceVariant#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Observed Allele</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed Allele</em>' containment reference.
	 * @see #setObservedAllele(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceVariant_ObservedAllele()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observedAllele' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getObservedAllele();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceVariant#getObservedAllele <em>Observed Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Allele</em>' containment reference.
	 * @see #getObservedAllele()
	 * @generated
	 */
	void setObservedAllele(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference Allele</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Allele</em>' containment reference.
	 * @see #setReferenceAllele(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceVariant_ReferenceAllele()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceAllele' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReferenceAllele();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceVariant#getReferenceAllele <em>Reference Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Allele</em>' containment reference.
	 * @see #getReferenceAllele()
	 * @generated
	 */
	void setReferenceAllele(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cigar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cigar</em>' containment reference.
	 * @see #setCigar(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceVariant_Cigar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cigar' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCigar();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceVariant#getCigar <em>Cigar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cigar</em>' containment reference.
	 * @see #getCigar()
	 * @generated
	 */
	void setCigar(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Variant Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pointer to an Observation containing variant information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Pointer</em>' containment reference.
	 * @see #setVariantPointer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequenceVariant_VariantPointer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantPointer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getVariantPointer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceVariant#getVariantPointer <em>Variant Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Pointer</em>' containment reference.
	 * @see #getVariantPointer()
	 * @generated
	 */
	void setVariantPointer(Reference value);

} // SequenceVariant
