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
 * A representation of the literals of the enumeration '<em><b>Medication Order Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMedicationOrderCategoryList()
 * @model extendedMetaData="name='MedicationOrderCategory-list'"
 * @generated
 */
public enum MedicationOrderCategoryList implements Enumerator {
	/**
	 * The '<em><b>Inpatient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	INPATIENT(0, "inpatient", "inpatient"),

	/**
	 * The '<em><b>Outpatient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPATIENT(1, "outpatient", "outpatient"),

	/**
	 * The '<em><b>Community</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNITY_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNITY(2, "community", "community");

	/**
	 * The '<em><b>Inpatient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inpatient
	 * <!-- end-model-doc -->
	 * @see #INPATIENT
	 * @model name="inpatient"
	 * @generated
	 * @ordered
	 */
	public static final int INPATIENT_VALUE = 0;

	/**
	 * The '<em><b>Outpatient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outpatient
	 * <!-- end-model-doc -->
	 * @see #OUTPATIENT
	 * @model name="outpatient"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPATIENT_VALUE = 1;

	/**
	 * The '<em><b>Community</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community
	 * <!-- end-model-doc -->
	 * @see #COMMUNITY
	 * @model name="community"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Medication Order Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicationOrderCategoryList[] VALUES_ARRAY =
		new MedicationOrderCategoryList[] {
			INPATIENT,
			OUTPATIENT,
			COMMUNITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Medication Order Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicationOrderCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medication Order Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationOrderCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationOrderCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Order Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationOrderCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationOrderCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Order Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationOrderCategoryList get(int value) {
		switch (value) {
			case INPATIENT_VALUE: return INPATIENT;
			case OUTPATIENT_VALUE: return OUTPATIENT;
			case COMMUNITY_VALUE: return COMMUNITY;
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
	private MedicationOrderCategoryList(int value, String name, String literal) {
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
	
} //MedicationOrderCategoryList
