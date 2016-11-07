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
 * A representation of the literals of the enumeration '<em><b>Plan Action Grouping Behavior List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getPlanActionGroupingBehaviorList()
 * @model extendedMetaData="name='PlanActionGroupingBehavior-list'"
 * @generated
 */
public enum PlanActionGroupingBehaviorList implements Enumerator {
	/**
	 * The '<em><b>Visual Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUAL_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	VISUAL_GROUP(0, "visualGroup", "visual-group"),

	/**
	 * The '<em><b>Logical Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_GROUP(1, "logicalGroup", "logical-group"),

	/**
	 * The '<em><b>Sentence Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCE_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	SENTENCE_GROUP(2, "sentenceGroup", "sentence-group");

	/**
	 * The '<em><b>Visual Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visual Group
	 * <!-- end-model-doc -->
	 * @see #VISUAL_GROUP
	 * @model name="visualGroup" literal="visual-group"
	 * @generated
	 * @ordered
	 */
	public static final int VISUAL_GROUP_VALUE = 0;

	/**
	 * The '<em><b>Logical Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical Group
	 * <!-- end-model-doc -->
	 * @see #LOGICAL_GROUP
	 * @model name="logicalGroup" literal="logical-group"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_GROUP_VALUE = 1;

	/**
	 * The '<em><b>Sentence Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sentence Group
	 * <!-- end-model-doc -->
	 * @see #SENTENCE_GROUP
	 * @model name="sentenceGroup" literal="sentence-group"
	 * @generated
	 * @ordered
	 */
	public static final int SENTENCE_GROUP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Plan Action Grouping Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlanActionGroupingBehaviorList[] VALUES_ARRAY =
		new PlanActionGroupingBehaviorList[] {
			VISUAL_GROUP,
			LOGICAL_GROUP,
			SENTENCE_GROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Plan Action Grouping Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlanActionGroupingBehaviorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Plan Action Grouping Behavior List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionGroupingBehaviorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlanActionGroupingBehaviorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plan Action Grouping Behavior List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionGroupingBehaviorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlanActionGroupingBehaviorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plan Action Grouping Behavior List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionGroupingBehaviorList get(int value) {
		switch (value) {
			case VISUAL_GROUP_VALUE: return VISUAL_GROUP;
			case LOGICAL_GROUP_VALUE: return LOGICAL_GROUP;
			case SENTENCE_GROUP_VALUE: return SENTENCE_GROUP;
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
	private PlanActionGroupingBehaviorList(int value, String name, String literal) {
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
	
} //PlanActionGroupingBehaviorList
