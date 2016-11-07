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
 * A representation of the literals of the enumeration '<em><b>Measure Scoring List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMeasureScoringList()
 * @model extendedMetaData="name='MeasureScoring-list'"
 * @generated
 */
public enum MeasureScoringList implements Enumerator {
	/**
	 * The '<em><b>Proportion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROPORTION(0, "proportion", "proportion"),

	/**
	 * The '<em><b>Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(1, "ratio", "ratio"),

	/**
	 * The '<em><b>Continuous Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS_VARIABLE(2, "continuousVariable", "continuous-variable"),

	/**
	 * The '<em><b>Cohort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COHORT_VALUE
	 * @generated
	 * @ordered
	 */
	COHORT(3, "cohort", "cohort");

	/**
	 * The '<em><b>Proportion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proportion
	 * <!-- end-model-doc -->
	 * @see #PROPORTION
	 * @model name="proportion"
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTION_VALUE = 0;

	/**
	 * The '<em><b>Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ratio
	 * <!-- end-model-doc -->
	 * @see #RATIO
	 * @model name="ratio"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 1;

	/**
	 * The '<em><b>Continuous Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuous Variable
	 * <!-- end-model-doc -->
	 * @see #CONTINUOUS_VARIABLE
	 * @model name="continuousVariable" literal="continuous-variable"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VARIABLE_VALUE = 2;

	/**
	 * The '<em><b>Cohort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cohort
	 * <!-- end-model-doc -->
	 * @see #COHORT
	 * @model name="cohort"
	 * @generated
	 * @ordered
	 */
	public static final int COHORT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Measure Scoring List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasureScoringList[] VALUES_ARRAY =
		new MeasureScoringList[] {
			PROPORTION,
			RATIO,
			CONTINUOUS_VARIABLE,
			COHORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Scoring List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasureScoringList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Scoring List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureScoringList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureScoringList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Scoring List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureScoringList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureScoringList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Scoring List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureScoringList get(int value) {
		switch (value) {
			case PROPORTION_VALUE: return PROPORTION;
			case RATIO_VALUE: return RATIO;
			case CONTINUOUS_VARIABLE_VALUE: return CONTINUOUS_VARIABLE;
			case COHORT_VALUE: return COHORT;
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
	private MeasureScoringList(int value, String name, String literal) {
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
	
} //MeasureScoringList
