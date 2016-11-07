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
 * A representation of the literals of the enumeration '<em><b>Sequence Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSequenceTypeList()
 * @model extendedMetaData="name='sequenceType-list'"
 * @generated
 */
public enum SequenceTypeList implements Enumerator {
	/**
	 * The '<em><b>AA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AA_VALUE
	 * @generated
	 * @ordered
	 */
	AA(0, "AA", "AA"),

	/**
	 * The '<em><b>DNA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNA_VALUE
	 * @generated
	 * @ordered
	 */
	DNA(1, "DNA", "DNA"),

	/**
	 * The '<em><b>RNA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RNA_VALUE
	 * @generated
	 * @ordered
	 */
	RNA(2, "RNA", "RNA");

	/**
	 * The '<em><b>AA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AA Sequence
	 * <!-- end-model-doc -->
	 * @see #AA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AA_VALUE = 0;

	/**
	 * The '<em><b>DNA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DNA Sequence
	 * <!-- end-model-doc -->
	 * @see #DNA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNA_VALUE = 1;

	/**
	 * The '<em><b>RNA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RNA Sequence
	 * <!-- end-model-doc -->
	 * @see #RNA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RNA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sequence Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SequenceTypeList[] VALUES_ARRAY =
		new SequenceTypeList[] {
			AA,
			DNA,
			RNA,
		};

	/**
	 * A public read-only list of all the '<em><b>Sequence Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SequenceTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sequence Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SequenceTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SequenceTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceTypeList get(int value) {
		switch (value) {
			case AA_VALUE: return AA;
			case DNA_VALUE: return DNA;
			case RNA_VALUE: return RNA;
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
	private SequenceTypeList(int value, String name, String literal) {
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
	
} //SequenceTypeList
