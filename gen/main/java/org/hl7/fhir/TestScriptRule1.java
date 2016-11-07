/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Rule1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestScriptRule1#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptRule1#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptRule1()
 * @model extendedMetaData="name='TestScript.Rule1' kind='elementOnly'"
 * @generated
 */
public interface TestScriptRule1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the referenced rule within the external ruleset template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Id</em>' containment reference.
	 * @see #setRuleId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule1_RuleId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ruleId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getRuleId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptRule1#getRuleId <em>Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' containment reference.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptParam1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each rule template can take one or more parameters for rule evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule1_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptParam1> getParam();

} // TestScriptRule1
