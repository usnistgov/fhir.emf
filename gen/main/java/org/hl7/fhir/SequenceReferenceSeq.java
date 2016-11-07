/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Reference Seq</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getStrand <em>Strand</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceReferenceSeq#getWindowEnd <em>Window End</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq()
 * @model extendedMetaData="name='Sequence.ReferenceSeq' kind='elementOnly'"
 * @generated
 */
public interface SequenceReferenceSeq extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Chromosome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chromosome</em>' containment reference.
	 * @see #setChromosome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_Chromosome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chromosome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChromosome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getChromosome <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromosome</em>' containment reference.
	 * @see #getChromosome()
	 * @generated
	 */
	void setChromosome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genome Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genome Build</em>' containment reference.
	 * @see #setGenomeBuild(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_GenomeBuild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genomeBuild' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGenomeBuild();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Build</em>' containment reference.
	 * @see #getGenomeBuild()
	 * @generated
	 */
	void setGenomeBuild(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq Id</em>' containment reference.
	 * @see #setReferenceSeqId(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_ReferenceSeqId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceSeqId' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReferenceSeqId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Id</em>' containment reference.
	 * @see #getReferenceSeqId()
	 * @generated
	 */
	void setReferenceSeqId(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Pointer to another Sequence entity as refence sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq Pointer</em>' containment reference.
	 * @see #setReferenceSeqPointer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_ReferenceSeqPointer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeqPointer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferenceSeqPointer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Pointer</em>' containment reference.
	 * @see #getReferenceSeqPointer()
	 * @generated
	 */
	void setReferenceSeqPointer(Reference value);

	/**
	 * Returns the value of the '<em><b>Reference Seq String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Reference Sequence string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq String</em>' containment reference.
	 * @see #setReferenceSeqString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_ReferenceSeqString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeqString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReferenceSeqString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq String</em>' containment reference.
	 * @see #getReferenceSeqString()
	 * @generated
	 */
	void setReferenceSeqString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Strand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strand of DNA. Available values are "1" for the plus strand and "-1" for the minus strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strand</em>' containment reference.
	 * @see #setStrand(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_Strand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strand' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getStrand <em>Strand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand</em>' containment reference.
	 * @see #getStrand()
	 * @generated
	 */
	void setStrand(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Window Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start position (inclusive) of the window on the reference sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window Start</em>' containment reference.
	 * @see #setWindowStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_WindowStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='windowStart' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWindowStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getWindowStart <em>Window Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Start</em>' containment reference.
	 * @see #getWindowStart()
	 * @generated
	 */
	void setWindowStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Window End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position (exclusive) of the window on the reference sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window End</em>' containment reference.
	 * @see #setWindowEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceReferenceSeq_WindowEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='windowEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWindowEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceReferenceSeq#getWindowEnd <em>Window End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window End</em>' containment reference.
	 * @see #getWindowEnd()
	 * @generated
	 */
	void setWindowEnd(org.hl7.fhir.Integer value);

} // SequenceReferenceSeq
