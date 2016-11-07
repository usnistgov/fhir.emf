/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Rule2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptRule2#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptRule2#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptRule2()
 * @model extendedMetaData="name='TestScript.Rule2' kind='elementOnly'"
 * @generated
 */
public interface TestScriptRule2 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TestScript.rule id value this assert will evaluate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Id</em>' containment reference.
	 * @see #setRuleId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule2_RuleId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ruleId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getRuleId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptRule2#getRuleId <em>Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' containment reference.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptParam2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each rule template can take one or more parameters for rule evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule2_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptParam2> getParam();

} // TestScriptRule2
