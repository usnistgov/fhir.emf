/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getCoverageIdentifier <em>Coverage Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getCoverageReference <em>Coverage Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseCoverage#getClaimResponse <em>Claim Response</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage()
 * @model extendedMetaData="name='ClaimResponse.Coverage' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseCoverage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseCoverage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Focal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal</em>' containment reference.
	 * @see #setFocal(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_Focal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFocal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseCoverage#getFocal <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' containment reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the program or plan identification, underwriter or payor. (choose any one of coverage*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Identifier</em>' containment reference.
	 * @see #setCoverageIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_CoverageIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getCoverageIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseCoverage#getCoverageIdentifier <em>Coverage Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Identifier</em>' containment reference.
	 * @see #getCoverageIdentifier()
	 * @generated
	 */
	void setCoverageIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Coverage Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the program or plan identification, underwriter or payor. (choose any one of coverage*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Reference</em>' containment reference.
	 * @see #setCoverageReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_CoverageReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverageReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseCoverage#getCoverageReference <em>Coverage Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Reference</em>' containment reference.
	 * @see #getCoverageReference()
	 * @generated
	 */
	void setCoverageReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract number of a business agreement which describes the terms and conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #setBusinessArrangement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_BusinessArrangement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessArrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseCoverage#getBusinessArrangement <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of references from the Insurer to which these services pertain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getPreAuthRef();

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Coverages adjudication details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseCoverage_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseCoverage#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

} // ClaimResponseCoverage
