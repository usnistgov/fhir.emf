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
 * A representation of the literals of the enumeration '<em><b>Conditional Read Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConditionalReadStatusList()
 * @model extendedMetaData="name='ConditionalReadStatus-list'"
 * @generated
 */
public enum ConditionalReadStatusList implements Enumerator {
	/**
	 * The '<em><b>Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SUPPORTED(0, "notSupported", "not-supported"),

	/**
	 * The '<em><b>Modified Since</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFIED_SINCE_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIED_SINCE(1, "modifiedSince", "modified-since"),

	/**
	 * The '<em><b>Not Match</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_MATCH(2, "notMatch", "not-match"),

	/**
	 * The '<em><b>Full Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_SUPPORT(3, "fullSupport", "full-support");

	/**
	 * The '<em><b>Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Supported
	 * <!-- end-model-doc -->
	 * @see #NOT_SUPPORTED
	 * @model name="notSupported" literal="not-supported"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SUPPORTED_VALUE = 0;

	/**
	 * The '<em><b>Modified Since</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If-Modified-Since
	 * <!-- end-model-doc -->
	 * @see #MODIFIED_SINCE
	 * @model name="modifiedSince" literal="modified-since"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIED_SINCE_VALUE = 1;

	/**
	 * The '<em><b>Not Match</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If-None-Match
	 * <!-- end-model-doc -->
	 * @see #NOT_MATCH
	 * @model name="notMatch" literal="not-match"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_MATCH_VALUE = 2;

	/**
	 * The '<em><b>Full Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full Support
	 * <!-- end-model-doc -->
	 * @see #FULL_SUPPORT
	 * @model name="fullSupport" literal="full-support"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_SUPPORT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Conditional Read Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionalReadStatusList[] VALUES_ARRAY =
		new ConditionalReadStatusList[] {
			NOT_SUPPORTED,
			MODIFIED_SINCE,
			NOT_MATCH,
			FULL_SUPPORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Conditional Read Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionalReadStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conditional Read Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionalReadStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionalReadStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conditional Read Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionalReadStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionalReadStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conditional Read Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionalReadStatusList get(int value) {
		switch (value) {
			case NOT_SUPPORTED_VALUE: return NOT_SUPPORTED;
			case MODIFIED_SINCE_VALUE: return MODIFIED_SINCE;
			case NOT_MATCH_VALUE: return NOT_MATCH;
			case FULL_SUPPORT_VALUE: return FULL_SUPPORT;
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
	private ConditionalReadStatusList(int value, String name, String literal) {
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
	
} //ConditionalReadStatusList
