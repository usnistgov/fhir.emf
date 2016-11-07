/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Map of relationships between 2 structures that can be used to transform data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.StructureMapRule#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapRule#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapRule#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapRule#getRule <em>Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapRule#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapRule#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getStructureMapRule()
 * @model extendedMetaData="name='StructureMap.Rule' kind='elementOnly'"
 * @generated
 */
public interface StructureMapRule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the rule for internal references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapRule_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapRule#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Id value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source inputs to the mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapRule_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapSource> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content to create because of this mapping rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapRule_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapTarget> getTarget();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rules contained in this rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapRule_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapRule> getRule();

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapDependent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which other rules to apply in the context of this rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapRule_Dependent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapDependent> getDependent();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation for this instance of data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapRule_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapRule#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

} // StructureMapRule
