/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Target</b></em>'.
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
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getListRuleId <em>List Rule Id</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapTarget#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget()
 * @model extendedMetaData="name='StructureMap.Target' kind='elementOnly'"
 * @generated
 */
public interface StructureMapTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type or variable this rule applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapTarget#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Id value);

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How to interpret the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Type</em>' containment reference.
	 * @see #setContextType(StructureMapContextType)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_ContextType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contextType' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMapContextType getContextType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapTarget#getContextType <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' containment reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(StructureMapContextType value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Field to create in the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getElement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapTarget#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Named context for field, if desired, and a field is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapTarget#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapListMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If field is a list, how to manage the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Mode</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_ListMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listMode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapListMode> getListMode();

	/**
	 * Returns the value of the '<em><b>List Rule Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal rule reference for shared list items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Rule Id</em>' containment reference.
	 * @see #setListRuleId(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_ListRuleId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listRuleId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getListRuleId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapTarget#getListRuleId <em>List Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Rule Id</em>' containment reference.
	 * @see #getListRuleId()
	 * @generated
	 */
	void setListRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the data is copied / created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(StructureMapTransform)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_Transform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMapTransform getTransform();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapTarget#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(StructureMapTransform value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.StructureMapParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters to the transform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getStructureMapTarget_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureMapParameter> getParameter();

} // StructureMapTarget
