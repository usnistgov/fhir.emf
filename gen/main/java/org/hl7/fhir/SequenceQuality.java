/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Quality</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SequenceQuality#getStandardSequence <em>Standard Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getTruthTP <em>Truth TP</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getQueryTP <em>Query TP</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getTruthFN <em>Truth FN</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getQueryFP <em>Query FP</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getGtFP <em>Gt FP</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceQuality#getFScore <em>FScore</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceQuality()
 * @model extendedMetaData="name='Sequence.Quality' kind='elementOnly'"
 * @generated
 */
public interface SequenceQuality extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Standard Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gold standard sequence used for comparing against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Sequence</em>' containment reference.
	 * @see #setStandardSequence(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_StandardSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStandardSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getStandardSequence <em>Standard Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Sequence</em>' containment reference.
	 * @see #getStandardSequence()
	 * @generated
	 */
	void setStandardSequence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start position (inclusive) of the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getStart <em>Start</em>}' containment reference.
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
	 * End position (exclusive) of the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Score()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Quantity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method for quality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Truth TP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True positives, from the perspective of the truth data, i.e. the number of sites in the Truth Call Set for which there are paths through the Query Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Truth TP</em>' containment reference.
	 * @see #setTruthTP(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_TruthTP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='truthTP' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getTruthTP();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getTruthTP <em>Truth TP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truth TP</em>' containment reference.
	 * @see #getTruthTP()
	 * @generated
	 */
	void setTruthTP(Decimal value);

	/**
	 * Returns the value of the '<em><b>Query TP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True positives, from the perspective of the query data, i.e. the number of sites in the Query Call Set for which there are paths through the Truth Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query TP</em>' containment reference.
	 * @see #setQueryTP(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_QueryTP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryTP' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getQueryTP();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getQueryTP <em>Query TP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query TP</em>' containment reference.
	 * @see #getQueryTP()
	 * @generated
	 */
	void setQueryTP(Decimal value);

	/**
	 * Returns the value of the '<em><b>Truth FN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * False negatives, i.e. the number of sites in the Truth Call Set for which there is no path through the Query Call Set that is consistent with all of the alleles at this site, or sites for which there is an inaccurate genotype call for the event. Sites with correct variant but incorrect genotype are counted here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Truth FN</em>' containment reference.
	 * @see #setTruthFN(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_TruthFN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='truthFN' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getTruthFN();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getTruthFN <em>Truth FN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truth FN</em>' containment reference.
	 * @see #getTruthFN()
	 * @generated
	 */
	void setTruthFN(Decimal value);

	/**
	 * Returns the value of the '<em><b>Query FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * False positives, i.e. the number of sites in the Query Call Set for which there is no path through the Truth Call Set that is consistent with this site. Sites with correct variant but incorrect genotype are counted here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query FP</em>' containment reference.
	 * @see #setQueryFP(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_QueryFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryFP' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getQueryFP();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getQueryFP <em>Query FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query FP</em>' containment reference.
	 * @see #getQueryFP()
	 * @generated
	 */
	void setQueryFP(Decimal value);

	/**
	 * Returns the value of the '<em><b>Gt FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of false positives where the non-REF alleles in the Truth and Query Call Sets match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gt FP</em>' containment reference.
	 * @see #setGtFP(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_GtFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gtFP' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getGtFP();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getGtFP <em>Gt FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gt FP</em>' containment reference.
	 * @see #getGtFP()
	 * @generated
	 */
	void setGtFP(Decimal value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QUERY.TP / (QUERY.TP + QUERY.FP).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision</em>' containment reference.
	 * @see #setPrecision(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Precision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precision' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getPrecision <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' containment reference.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Decimal value);

	/**
	 * Returns the value of the '<em><b>Recall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUTH.TP / (TRUTH.TP + TRUTH.FN).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recall</em>' containment reference.
	 * @see #setRecall(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_Recall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recall' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getRecall();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getRecall <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recall</em>' containment reference.
	 * @see #getRecall()
	 * @generated
	 */
	void setRecall(Decimal value);

	/**
	 * Returns the value of the '<em><b>FScore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision + recall).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FScore</em>' containment reference.
	 * @see #setFScore(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSequenceQuality_FScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fScore' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceQuality#getFScore <em>FScore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FScore</em>' containment reference.
	 * @see #getFScore()
	 * @generated
	 */
	void setFScore(Decimal value);

} // SequenceQuality
