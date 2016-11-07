/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Source</b></em>'.
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
 *   <li>{@link org.hl7.fhir.StructureMapSource#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getCheck <em>Check</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getStructureMapSource()
 * @model extendedMetaData="name='StructureMap.Source' kind='elementOnly'"
 * @generated
 */
public interface StructureMapSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this rule applies if the source isn't found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Required()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type or variable this rule applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Context()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getContext <em>Context</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_ContextType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contextType' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMapContextType getContextType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getContextType <em>Context Type</em>}' containment reference.
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
	 * Optional field for this source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getElement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How to handle the list mode for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Mode</em>' containment reference.
	 * @see #setListMode(StructureMapListMode)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_ListMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listMode' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMapListMode getListMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getListMode <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Mode</em>' containment reference.
	 * @see #getListMode()
	 * @generated
	 */
	void setListMode(StructureMapListMode value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Named context for field, if a field is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FluentPath expression  - must be true or the rule does not apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FluentPath expression  - must be true or the mapping engine throws an error instead of completing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check</em>' containment reference.
	 * @see #setCheck(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Check()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='check' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCheck();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getCheck <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' containment reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(org.hl7.fhir.String value);

} // StructureMapSource
