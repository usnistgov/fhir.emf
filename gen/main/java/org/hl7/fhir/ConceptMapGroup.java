/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConceptMapGroup#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapGroup#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapGroup#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapGroup#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapGroup#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConceptMapGroup()
 * @model extendedMetaData="name='ConceptMap.Group' kind='elementOnly'"
 * @generated
 */
public interface ConceptMapGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapGroup_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapGroup#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Uri value);

	/**
	 * Returns the value of the '<em><b>Source Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific version of the code system, as determined by the code system authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Version</em>' containment reference.
	 * @see #setSourceVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapGroup_SourceVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSourceVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapGroup#getSourceVersion <em>Source Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Version</em>' containment reference.
	 * @see #getSourceVersion()
	 * @generated
	 */
	void setSourceVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapGroup_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapGroup#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Uri value);

	/**
	 * Returns the value of the '<em><b>Target Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific version of the code system, as determined by the code system authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Version</em>' containment reference.
	 * @see #setTargetVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapGroup_TargetVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTargetVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapGroup#getTargetVersion <em>Target Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Version</em>' containment reference.
	 * @see #getTargetVersion()
	 * @generated
	 */
	void setTargetVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConceptMapElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mappings for an individual concept in the source to one or more concepts in the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConceptMapGroup_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapElement> getElement();

} // ConceptMapGroup
