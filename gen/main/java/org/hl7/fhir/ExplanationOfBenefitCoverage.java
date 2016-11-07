/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCoverage#getCoverageIdentifier <em>Coverage Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCoverage#getCoverageReference <em>Coverage Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCoverage#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCoverage()
 * @model extendedMetaData="name='ExplanationOfBenefit.Coverage' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitCoverage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coverage Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the program or plan identification, underwriter or payor. (choose any one of coverage*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Identifier</em>' containment reference.
	 * @see #setCoverageIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCoverage_CoverageIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getCoverageIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCoverage#getCoverageIdentifier <em>Coverage Identifier</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCoverage_CoverageReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverageReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCoverage#getCoverageReference <em>Coverage Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Reference</em>' containment reference.
	 * @see #getCoverageReference()
	 * @generated
	 */
	void setCoverageReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of references from the Insurer to which these services pertain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCoverage_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getPreAuthRef();

} // ExplanationOfBenefitCoverage
