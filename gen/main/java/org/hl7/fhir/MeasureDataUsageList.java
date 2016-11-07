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
 * A representation of the literals of the enumeration '<em><b>Measure Data Usage List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMeasureDataUsageList()
 * @model extendedMetaData="name='MeasureDataUsage-list'"
 * @generated
 */
public enum MeasureDataUsageList implements Enumerator {
	/**
	 * The '<em><b>Supplemental Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENTAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLEMENTAL_DATA(0, "supplementalData", "supplemental-data"),

	/**
	 * The '<em><b>Risk Adjustment Factor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_ADJUSTMENT_FACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ADJUSTMENT_FACTOR(1, "riskAdjustmentFactor", "risk-adjustment-factor");

	/**
	 * The '<em><b>Supplemental Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplemental Data
	 * <!-- end-model-doc -->
	 * @see #SUPPLEMENTAL_DATA
	 * @model name="supplementalData" literal="supplemental-data"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLEMENTAL_DATA_VALUE = 0;

	/**
	 * The '<em><b>Risk Adjustment Factor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk Adjustment Factor
	 * <!-- end-model-doc -->
	 * @see #RISK_ADJUSTMENT_FACTOR
	 * @model name="riskAdjustmentFactor" literal="risk-adjustment-factor"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ADJUSTMENT_FACTOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Measure Data Usage List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasureDataUsageList[] VALUES_ARRAY =
		new MeasureDataUsageList[] {
			SUPPLEMENTAL_DATA,
			RISK_ADJUSTMENT_FACTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Data Usage List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasureDataUsageList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Data Usage List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureDataUsageList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureDataUsageList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Data Usage List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureDataUsageList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureDataUsageList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Data Usage List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureDataUsageList get(int value) {
		switch (value) {
			case SUPPLEMENTAL_DATA_VALUE: return SUPPLEMENTAL_DATA;
			case RISK_ADJUSTMENT_FACTOR_VALUE: return RISK_ADJUSTMENT_FACTOR;
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
	private MeasureDataUsageList(int value, String name, String literal) {
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
	
} //MeasureDataUsageList
