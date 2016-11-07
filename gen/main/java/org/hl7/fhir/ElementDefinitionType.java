/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionType#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionType#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionType#getTargetProfile <em>Target Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionType#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionType#getVersioning <em>Versioning</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionType()
 * @model extendedMetaData="name='ElementDefinition.Type' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionType extends Element {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of Data type or Resource that is a(or the) type used for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionType_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionType#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a profile structure or implementation Guide that SHALL hold for the datatype this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition in another profile. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionType_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionType#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Uri value);

	/**
	 * Returns the value of the '<em><b>Target Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a profile structure or implementation Guide that SHALL hold for the target of the reference this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition in another profile. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Profile</em>' containment reference.
	 * @see #setTargetProfile(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionType_TargetProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getTargetProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionType#getTargetProfile <em>Target Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Profile</em>' containment reference.
	 * @see #getTargetProfile()
	 * @generated
	 */
	void setTargetProfile(Uri value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AggregationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionType_Aggregation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aggregation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AggregationMode> getAggregation();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this reference needs to be version specific or version independent, or whetehr either can be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versioning</em>' containment reference.
	 * @see #setVersioning(ReferenceVersionRules)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionType_Versioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versioning' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceVersionRules getVersioning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionType#getVersioning <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' containment reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(ReferenceVersionRules value);

} // ElementDefinitionType
