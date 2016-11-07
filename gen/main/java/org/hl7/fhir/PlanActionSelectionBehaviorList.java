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
 * A representation of the literals of the enumeration '<em><b>Plan Action Selection Behavior List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getPlanActionSelectionBehaviorList()
 * @model extendedMetaData="name='PlanActionSelectionBehavior-list'"
 * @generated
 */
public enum PlanActionSelectionBehaviorList implements Enumerator {
	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "any", "any"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(1, "all", "all"),

	/**
	 * The '<em><b>All Or None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OR_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OR_NONE(2, "allOrNone", "all-or-none"),

	/**
	 * The '<em><b>Exactly One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONE(3, "exactlyOne", "exactly-one"),

	/**
	 * The '<em><b>At Most One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST_ONE(4, "atMostOne", "at-most-one"),

	/**
	 * The '<em><b>One Or More</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_OR_MORE(5, "oneOrMore", "one-or-more");

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any
	 * <!-- end-model-doc -->
	 * @see #ANY
	 * @model name="any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All
	 * <!-- end-model-doc -->
	 * @see #ALL
	 * @model name="all"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 1;

	/**
	 * The '<em><b>All Or None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Or None
	 * <!-- end-model-doc -->
	 * @see #ALL_OR_NONE
	 * @model name="allOrNone" literal="all-or-none"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OR_NONE_VALUE = 2;

	/**
	 * The '<em><b>Exactly One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly One
	 * <!-- end-model-doc -->
	 * @see #EXACTLY_ONE
	 * @model name="exactlyOne" literal="exactly-one"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONE_VALUE = 3;

	/**
	 * The '<em><b>At Most One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At Most One
	 * <!-- end-model-doc -->
	 * @see #AT_MOST_ONE
	 * @model name="atMostOne" literal="at-most-one"
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_ONE_VALUE = 4;

	/**
	 * The '<em><b>One Or More</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One Or More
	 * <!-- end-model-doc -->
	 * @see #ONE_OR_MORE
	 * @model name="oneOrMore" literal="one-or-more"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_OR_MORE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Plan Action Selection Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlanActionSelectionBehaviorList[] VALUES_ARRAY =
		new PlanActionSelectionBehaviorList[] {
			ANY,
			ALL,
			ALL_OR_NONE,
			EXACTLY_ONE,
			AT_MOST_ONE,
			ONE_OR_MORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Plan Action Selection Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlanActionSelectionBehaviorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Plan Action Selection Behavior List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionSelectionBehaviorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlanActionSelectionBehaviorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plan Action Selection Behavior List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionSelectionBehaviorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlanActionSelectionBehaviorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plan Action Selection Behavior List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionSelectionBehaviorList get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case ALL_VALUE: return ALL;
			case ALL_OR_NONE_VALUE: return ALL_OR_NONE;
			case EXACTLY_ONE_VALUE: return EXACTLY_ONE;
			case AT_MOST_ONE_VALUE: return AT_MOST_ONE;
			case ONE_OR_MORE_VALUE: return ONE_OR_MORE;
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
	private PlanActionSelectionBehaviorList(int value, String name, String literal) {
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
	
} //PlanActionSelectionBehaviorList
