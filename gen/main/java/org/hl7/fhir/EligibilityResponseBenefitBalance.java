/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Benefit Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getFinancial <em>Financial</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance()
 * @model extendedMetaData="name='EligibilityResponse.BenefitBalance' kind='elementOnly'"
 * @generated
 */
public interface EligibilityResponseBenefitBalance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dental, Vision, Medical, Pharmacy, Rehab etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Coding value);

	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Category</em>' containment reference.
	 * @see #setSubCategory(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_SubCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getSubCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getSubCategory <em>Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Category</em>' containment reference.
	 * @see #getSubCategory()
	 * @generated
	 */
	void setSubCategory(Coding value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short name or tag for the benefit, for example MED01, or DENT2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Network designation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Coding value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit designation: individual or family.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Coding value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Term()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getTerm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Coding value);

	/**
	 * Returns the value of the '<em><b>Financial</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EligibilityResponseFinancial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits Used to date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Financial</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Financial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='financial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EligibilityResponseFinancial> getFinancial();

} // EligibilityResponseBenefitBalance
