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
 * A representation of the literals of the enumeration '<em><b>Code System Hierarchy Meaning List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCodeSystemHierarchyMeaningList()
 * @model extendedMetaData="name='CodeSystemHierarchyMeaning-list'"
 * @generated
 */
public enum CodeSystemHierarchyMeaningList implements Enumerator {
	/**
	 * The '<em><b>Grouped By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUPED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	GROUPED_BY(0, "groupedBy", "grouped-by"),

	/**
	 * The '<em><b>Subsumes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSUMES_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSUMES(1, "subsumes", "subsumes"),

	/**
	 * The '<em><b>Part Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_OF_VALUE
	 * @generated
	 * @ordered
	 */
	PART_OF(2, "partOf", "part-of"),

	/**
	 * The '<em><b>Classified With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFIED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFIED_WITH(3, "classifiedWith", "classified-with");

	/**
	 * The '<em><b>Grouped By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grouped By
	 * <!-- end-model-doc -->
	 * @see #GROUPED_BY
	 * @model name="groupedBy" literal="grouped-by"
	 * @generated
	 * @ordered
	 */
	public static final int GROUPED_BY_VALUE = 0;

	/**
	 * The '<em><b>Subsumes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsumes
	 * <!-- end-model-doc -->
	 * @see #SUBSUMES
	 * @model name="subsumes"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSUMES_VALUE = 1;

	/**
	 * The '<em><b>Part Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part Of
	 * <!-- end-model-doc -->
	 * @see #PART_OF
	 * @model name="partOf" literal="part-of"
	 * @generated
	 * @ordered
	 */
	public static final int PART_OF_VALUE = 2;

	/**
	 * The '<em><b>Classified With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classified With
	 * <!-- end-model-doc -->
	 * @see #CLASSIFIED_WITH
	 * @model name="classifiedWith" literal="classified-with"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFIED_WITH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Code System Hierarchy Meaning List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeSystemHierarchyMeaningList[] VALUES_ARRAY =
		new CodeSystemHierarchyMeaningList[] {
			GROUPED_BY,
			SUBSUMES,
			PART_OF,
			CLASSIFIED_WITH,
		};

	/**
	 * A public read-only list of all the '<em><b>Code System Hierarchy Meaning List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeSystemHierarchyMeaningList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Code System Hierarchy Meaning List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSystemHierarchyMeaningList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeSystemHierarchyMeaningList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code System Hierarchy Meaning List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSystemHierarchyMeaningList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeSystemHierarchyMeaningList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code System Hierarchy Meaning List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSystemHierarchyMeaningList get(int value) {
		switch (value) {
			case GROUPED_BY_VALUE: return GROUPED_BY;
			case SUBSUMES_VALUE: return SUBSUMES;
			case PART_OF_VALUE: return PART_OF;
			case CLASSIFIED_WITH_VALUE: return CLASSIFIED_WITH;
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
	private CodeSystemHierarchyMeaningList(int value, String name, String literal) {
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
	
} //CodeSystemHierarchyMeaningList
