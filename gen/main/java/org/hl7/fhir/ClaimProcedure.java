/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Procedure</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getProcedureCoding <em>Procedure Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getProcedureReference <em>Procedure Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimProcedure()
 * @model extendedMetaData="name='Claim.Procedure' kind='elementOnly'"
 * @generated
 */
public interface ClaimProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence of procedures which serves to order and provide a link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and optionally time the procedure was performed .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Procedure Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The procedure code. (choose any one of procedure*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Coding</em>' containment reference.
	 * @see #setProcedureCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_ProcedureCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProcedureCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getProcedureCoding <em>Procedure Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Coding</em>' containment reference.
	 * @see #getProcedureCoding()
	 * @generated
	 */
	void setProcedureCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Procedure Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The procedure code. (choose any one of procedure*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Reference</em>' containment reference.
	 * @see #setProcedureReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_ProcedureReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProcedureReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getProcedureReference <em>Procedure Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Reference</em>' containment reference.
	 * @see #getProcedureReference()
	 * @generated
	 */
	void setProcedureReference(Reference value);

} // ClaimProcedure
