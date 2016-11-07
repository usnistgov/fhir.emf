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
 * A representation of the literals of the enumeration '<em><b>Code System Content Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCodeSystemContentModeList()
 * @model extendedMetaData="name='CodeSystemContentMode-list'"
 * @generated
 */
public enum CodeSystemContentModeList implements Enumerator {
	/**
	 * The '<em><b>Not Present</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_PRESENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PRESENT(0, "notPresent", "not-present"),

	/**
	 * The '<em><b>Examplar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMPLAR_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLAR(1, "examplar", "examplar"),

	/**
	 * The '<em><b>Fragment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FRAGMENT(2, "fragment", "fragment"),

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(3, "complete", "complete");

	/**
	 * The '<em><b>Not Present</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Present
	 * <!-- end-model-doc -->
	 * @see #NOT_PRESENT
	 * @model name="notPresent" literal="not-present"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PRESENT_VALUE = 0;

	/**
	 * The '<em><b>Examplar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examplar
	 * <!-- end-model-doc -->
	 * @see #EXAMPLAR
	 * @model name="examplar"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLAR_VALUE = 1;

	/**
	 * The '<em><b>Fragment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fragment
	 * <!-- end-model-doc -->
	 * @see #FRAGMENT
	 * @model name="fragment"
	 * @generated
	 * @ordered
	 */
	public static final int FRAGMENT_VALUE = 2;

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Complete
	 * <!-- end-model-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Code System Content Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeSystemContentModeList[] VALUES_ARRAY =
		new CodeSystemContentModeList[] {
			NOT_PRESENT,
			EXAMPLAR,
			FRAGMENT,
			COMPLETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Code System Content Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeSystemContentModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Code System Content Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSystemContentModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeSystemContentModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code System Content Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSystemContentModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeSystemContentModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code System Content Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSystemContentModeList get(int value) {
		switch (value) {
			case NOT_PRESENT_VALUE: return NOT_PRESENT;
			case EXAMPLAR_VALUE: return EXAMPLAR;
			case FRAGMENT_VALUE: return FRAGMENT;
			case COMPLETE_VALUE: return COMPLETE;
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
	private CodeSystemContentModeList(int value, String name, String literal) {
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
	
} //CodeSystemContentModeList
