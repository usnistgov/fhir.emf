/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Except</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsentExcept()
 * @model extendedMetaData="name='Consent.Except' kind='elementOnly'"
 * @generated
 */
public interface ConsentExcept extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action  to take - permit or deny - when the exception conditions are met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ConsentExceptType)
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentExceptType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentExcept#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConsentExceptType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeframe in which data is controlled by this exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentExcept#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentActor> getActor();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions controlled by this Exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAction();

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_SecurityLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSecurityLabel();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPurpose();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getClass_();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this code is found in an instance, then the exception applies. TODO: where do you not have to look? This is a problematic element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCode();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resources controlled by this exception, if specific resources are referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentData> getData();

} // ConsentExcept
