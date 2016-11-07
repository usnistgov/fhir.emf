/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group</b></em>'.
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
 *   <li>{@link org.hl7.fhir.StructureMapGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapGroup#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapGroup#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapGroup#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapGroup#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getStructureMapGroup()
 * @model extendedMetaData="name='StructureMap.Group' kind='elementOnly'"
 * @generated
 */
public interface StructureMapGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive name for a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapGroup_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapGroup#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Id value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another group that this group adds rules to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapGroup_Extends()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extends' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getExtends();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapGroup#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Id value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation for this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapGroup_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapGroup#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapGroup_Input()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapInput> getInput();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transform Rule from source to target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapGroup_Rule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapRule> getRule();

} // StructureMapGroup
