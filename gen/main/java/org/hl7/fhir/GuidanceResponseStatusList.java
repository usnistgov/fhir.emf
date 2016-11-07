/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guidance Response Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseStatusList()
 * @model extendedMetaData="name='GuidanceResponseStatus-list'"
 * @generated
 */
public enum GuidanceResponseStatusList implements Enumerator {
	/**
	 * The '<em><b>Success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESS(0, "success", "success"),

	/**
	 * The '<em><b>Data Requested</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_REQUESTED(1, "dataRequested", "data-requested"),

	/**
	 * The '<em><b>Data Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_REQUIRED(2, "dataRequired", "data-required"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(3, "inProgress", "in-progress"),

	/**
	 * The '<em><b>Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	FAILURE(4, "failure", "failure");

	/**
	 * The '<em><b>Success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Success
	 * <!-- end-model-doc -->
	 * @see #SUCCESS
	 * @model name="success"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS_VALUE = 0;

	/**
	 * The '<em><b>Data Requested</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Requested
	 * <!-- end-model-doc -->
	 * @see #DATA_REQUESTED
	 * @model name="dataRequested" literal="data-requested"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_REQUESTED_VALUE = 1;

	/**
	 * The '<em><b>Data Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Required
	 * <!-- end-model-doc -->
	 * @see #DATA_REQUIRED
	 * @model name="dataRequired" literal="data-required"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_REQUIRED_VALUE = 2;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Progress
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 3;

	/**
	 * The '<em><b>Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Failure
	 * <!-- end-model-doc -->
	 * @see #FAILURE
	 * @model name="failure"
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Guidance Response Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuidanceResponseStatusList[] VALUES_ARRAY =
		new GuidanceResponseStatusList[] {
			SUCCESS,
			DATA_REQUESTED,
			DATA_REQUIRED,
			IN_PROGRESS,
			FAILURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Guidance Response Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuidanceResponseStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guidance Response Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuidanceResponseStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuidanceResponseStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guidance Response Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuidanceResponseStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuidanceResponseStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guidance Response Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuidanceResponseStatusList get(int value) {
		switch (value) {
			case SUCCESS_VALUE: return SUCCESS;
			case DATA_REQUESTED_VALUE: return DATA_REQUESTED;
			case DATA_REQUIRED_VALUE: return DATA_REQUIRED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case FAILURE_VALUE: return FAILURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GuidanceResponseStatusList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GuidanceResponseStatusList
