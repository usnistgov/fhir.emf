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
 * A representation of the literals of the enumeration '<em><b>Plan Action Required Behavior List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getPlanActionRequiredBehaviorList()
 * @model extendedMetaData="name='PlanActionRequiredBehavior-list'"
 * @generated
 */
public enum PlanActionRequiredBehaviorList implements Enumerator {
	/**
	 * The '<em><b>Must</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_VALUE
	 * @generated
	 * @ordered
	 */
	MUST(0, "must", "must"),

	/**
	 * The '<em><b>Could</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_VALUE
	 * @generated
	 * @ordered
	 */
	COULD(1, "could", "could"),

	/**
	 * The '<em><b>Must Unless Documented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_UNLESS_DOCUMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	MUST_UNLESS_DOCUMENTED(2, "mustUnlessDocumented", "must-unless-documented");

	/**
	 * The '<em><b>Must</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must
	 * <!-- end-model-doc -->
	 * @see #MUST
	 * @model name="must"
	 * @generated
	 * @ordered
	 */
	public static final int MUST_VALUE = 0;

	/**
	 * The '<em><b>Could</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Could
	 * <!-- end-model-doc -->
	 * @see #COULD
	 * @model name="could"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_VALUE = 1;

	/**
	 * The '<em><b>Must Unless Documented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must Unless Documented
	 * <!-- end-model-doc -->
	 * @see #MUST_UNLESS_DOCUMENTED
	 * @model name="mustUnlessDocumented" literal="must-unless-documented"
	 * @generated
	 * @ordered
	 */
	public static final int MUST_UNLESS_DOCUMENTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Plan Action Required Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlanActionRequiredBehaviorList[] VALUES_ARRAY =
		new PlanActionRequiredBehaviorList[] {
			MUST,
			COULD,
			MUST_UNLESS_DOCUMENTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Plan Action Required Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlanActionRequiredBehaviorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Plan Action Required Behavior List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionRequiredBehaviorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlanActionRequiredBehaviorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plan Action Required Behavior List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionRequiredBehaviorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlanActionRequiredBehaviorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Plan Action Required Behavior List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlanActionRequiredBehaviorList get(int value) {
		switch (value) {
			case MUST_VALUE: return MUST;
			case COULD_VALUE: return COULD;
			case MUST_UNLESS_DOCUMENTED_VALUE: return MUST_UNLESS_DOCUMENTED;
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
	private PlanActionRequiredBehaviorList(int value, String name, String literal) {
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
	
} //PlanActionRequiredBehaviorList
