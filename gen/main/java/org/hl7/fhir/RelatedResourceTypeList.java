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
 * A representation of the literals of the enumeration '<em><b>Related Resource Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getRelatedResourceTypeList()
 * @model extendedMetaData="name='RelatedResourceType-list'"
 * @generated
 */
public enum RelatedResourceTypeList implements Enumerator {
	/**
	 * The '<em><b>Documentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION(0, "documentation", "documentation"),

	/**
	 * The '<em><b>Justification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	JUSTIFICATION(1, "justification", "justification"),

	/**
	 * The '<em><b>Citation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITATION_VALUE
	 * @generated
	 * @ordered
	 */
	CITATION(2, "citation", "citation"),

	/**
	 * The '<em><b>Predecessor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDECESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	PREDECESSOR(3, "predecessor", "predecessor"),

	/**
	 * The '<em><b>Successor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSOR(4, "successor", "successor"),

	/**
	 * The '<em><b>Derived From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_FROM(5, "derivedFrom", "derived-from"),

	/**
	 * The '<em><b>Depends On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDS_ON(6, "dependsOn", "depends-on"),

	/**
	 * The '<em><b>Composed Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSED_OF_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSED_OF(7, "composedOf", "composed-of");

	/**
	 * The '<em><b>Documentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION
	 * @model name="documentation"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_VALUE = 0;

	/**
	 * The '<em><b>Justification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Justification
	 * <!-- end-model-doc -->
	 * @see #JUSTIFICATION
	 * @model name="justification"
	 * @generated
	 * @ordered
	 */
	public static final int JUSTIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Citation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation
	 * <!-- end-model-doc -->
	 * @see #CITATION
	 * @model name="citation"
	 * @generated
	 * @ordered
	 */
	public static final int CITATION_VALUE = 2;

	/**
	 * The '<em><b>Predecessor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Predecessor
	 * <!-- end-model-doc -->
	 * @see #PREDECESSOR
	 * @model name="predecessor"
	 * @generated
	 * @ordered
	 */
	public static final int PREDECESSOR_VALUE = 3;

	/**
	 * The '<em><b>Successor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Successor
	 * <!-- end-model-doc -->
	 * @see #SUCCESSOR
	 * @model name="successor"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSOR_VALUE = 4;

	/**
	 * The '<em><b>Derived From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived From
	 * <!-- end-model-doc -->
	 * @see #DERIVED_FROM
	 * @model name="derivedFrom" literal="derived-from"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_FROM_VALUE = 5;

	/**
	 * The '<em><b>Depends On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depends On
	 * <!-- end-model-doc -->
	 * @see #DEPENDS_ON
	 * @model name="dependsOn" literal="depends-on"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDS_ON_VALUE = 6;

	/**
	 * The '<em><b>Composed Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composed Of
	 * <!-- end-model-doc -->
	 * @see #COMPOSED_OF
	 * @model name="composedOf" literal="composed-of"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSED_OF_VALUE = 7;

	/**
	 * An array of all the '<em><b>Related Resource Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelatedResourceTypeList[] VALUES_ARRAY =
		new RelatedResourceTypeList[] {
			DOCUMENTATION,
			JUSTIFICATION,
			CITATION,
			PREDECESSOR,
			SUCCESSOR,
			DERIVED_FROM,
			DEPENDS_ON,
			COMPOSED_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Related Resource Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelatedResourceTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Related Resource Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelatedResourceTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelatedResourceTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Related Resource Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelatedResourceTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelatedResourceTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Related Resource Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelatedResourceTypeList get(int value) {
		switch (value) {
			case DOCUMENTATION_VALUE: return DOCUMENTATION;
			case JUSTIFICATION_VALUE: return JUSTIFICATION;
			case CITATION_VALUE: return CITATION;
			case PREDECESSOR_VALUE: return PREDECESSOR;
			case SUCCESSOR_VALUE: return SUCCESSOR;
			case DERIVED_FROM_VALUE: return DERIVED_FROM;
			case DEPENDS_ON_VALUE: return DEPENDS_ON;
			case COMPOSED_OF_VALUE: return COMPOSED_OF;
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
	private RelatedResourceTypeList(int value, String name, String literal) {
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
	
} //RelatedResourceTypeList
