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
 * A representation of the literals of the enumeration '<em><b>Measure Population Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMeasurePopulationTypeList()
 * @model extendedMetaData="name='MeasurePopulationType-list'"
 * @generated
 */
public enum MeasurePopulationTypeList implements Enumerator {
	/**
	 * The '<em><b>Initial Population</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_POPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL_POPULATION(0, "initialPopulation", "initial-population"),

	/**
	 * The '<em><b>Numerator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERATOR(1, "numerator", "numerator"),

	/**
	 * The '<em><b>Numerator Exclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_EXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERATOR_EXCLUSION(2, "numeratorExclusion", "numerator-exclusion"),

	/**
	 * The '<em><b>Denominator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DENOMINATOR(3, "denominator", "denominator"),

	/**
	 * The '<em><b>Denominator Exclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOR_EXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	DENOMINATOR_EXCLUSION(4, "denominatorExclusion", "denominator-exclusion"),

	/**
	 * The '<em><b>Denominator Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOR_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DENOMINATOR_EXCEPTION(5, "denominatorException", "denominator-exception"),

	/**
	 * The '<em><b>Measure Population</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_POPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_POPULATION(6, "measurePopulation", "measure-population"),

	/**
	 * The '<em><b>Measure Population Exclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_POPULATION_EXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_POPULATION_EXCLUSION(7, "measurePopulationExclusion", "measure-population-exclusion"),

	/**
	 * The '<em><b>Measure Score</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_SCORE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_SCORE(8, "measureScore", "measure-score");

	/**
	 * The '<em><b>Initial Population</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial Population
	 * <!-- end-model-doc -->
	 * @see #INITIAL_POPULATION
	 * @model name="initialPopulation" literal="initial-population"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_POPULATION_VALUE = 0;

	/**
	 * The '<em><b>Numerator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerator
	 * <!-- end-model-doc -->
	 * @see #NUMERATOR
	 * @model name="numerator"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERATOR_VALUE = 1;

	/**
	 * The '<em><b>Numerator Exclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerator Exclusion
	 * <!-- end-model-doc -->
	 * @see #NUMERATOR_EXCLUSION
	 * @model name="numeratorExclusion" literal="numerator-exclusion"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERATOR_EXCLUSION_VALUE = 2;

	/**
	 * The '<em><b>Denominator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denominator
	 * <!-- end-model-doc -->
	 * @see #DENOMINATOR
	 * @model name="denominator"
	 * @generated
	 * @ordered
	 */
	public static final int DENOMINATOR_VALUE = 3;

	/**
	 * The '<em><b>Denominator Exclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denominator Exclusion
	 * <!-- end-model-doc -->
	 * @see #DENOMINATOR_EXCLUSION
	 * @model name="denominatorExclusion" literal="denominator-exclusion"
	 * @generated
	 * @ordered
	 */
	public static final int DENOMINATOR_EXCLUSION_VALUE = 4;

	/**
	 * The '<em><b>Denominator Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denominator Exception
	 * <!-- end-model-doc -->
	 * @see #DENOMINATOR_EXCEPTION
	 * @model name="denominatorException" literal="denominator-exception"
	 * @generated
	 * @ordered
	 */
	public static final int DENOMINATOR_EXCEPTION_VALUE = 5;

	/**
	 * The '<em><b>Measure Population</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure Population
	 * <!-- end-model-doc -->
	 * @see #MEASURE_POPULATION
	 * @model name="measurePopulation" literal="measure-population"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_POPULATION_VALUE = 6;

	/**
	 * The '<em><b>Measure Population Exclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure Population Exclusion
	 * <!-- end-model-doc -->
	 * @see #MEASURE_POPULATION_EXCLUSION
	 * @model name="measurePopulationExclusion" literal="measure-population-exclusion"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_POPULATION_EXCLUSION_VALUE = 7;

	/**
	 * The '<em><b>Measure Score</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure Score
	 * <!-- end-model-doc -->
	 * @see #MEASURE_SCORE
	 * @model name="measureScore" literal="measure-score"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_SCORE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Measure Population Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurePopulationTypeList[] VALUES_ARRAY =
		new MeasurePopulationTypeList[] {
			INITIAL_POPULATION,
			NUMERATOR,
			NUMERATOR_EXCLUSION,
			DENOMINATOR,
			DENOMINATOR_EXCLUSION,
			DENOMINATOR_EXCEPTION,
			MEASURE_POPULATION,
			MEASURE_POPULATION_EXCLUSION,
			MEASURE_SCORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Population Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurePopulationTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Population Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurePopulationTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurePopulationTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Population Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurePopulationTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurePopulationTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Population Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurePopulationTypeList get(int value) {
		switch (value) {
			case INITIAL_POPULATION_VALUE: return INITIAL_POPULATION;
			case NUMERATOR_VALUE: return NUMERATOR;
			case NUMERATOR_EXCLUSION_VALUE: return NUMERATOR_EXCLUSION;
			case DENOMINATOR_VALUE: return DENOMINATOR;
			case DENOMINATOR_EXCLUSION_VALUE: return DENOMINATOR_EXCLUSION;
			case DENOMINATOR_EXCEPTION_VALUE: return DENOMINATOR_EXCEPTION;
			case MEASURE_POPULATION_VALUE: return MEASURE_POPULATION;
			case MEASURE_POPULATION_EXCLUSION_VALUE: return MEASURE_POPULATION_EXCLUSION;
			case MEASURE_SCORE_VALUE: return MEASURE_SCORE;
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
	private MeasurePopulationTypeList(int value, String name, String literal) {
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
	
} //MeasurePopulationTypeList
