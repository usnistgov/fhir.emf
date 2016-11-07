/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Destination</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestScriptDestination#getIndex <em>Index</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptDestination#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptDestination()
 * @model extendedMetaData="name='TestScript.Destination' kind='elementOnly'"
 * @generated
 */
public interface TestScriptDestination extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstract name given to a destination server in this test script.  The name is provided as a number starting at 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptDestination_Index()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getIndex();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptDestination#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of destination profile the test system supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Coding)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptDestination_Profile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptDestination#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Coding value);

} // TestScriptDestination
