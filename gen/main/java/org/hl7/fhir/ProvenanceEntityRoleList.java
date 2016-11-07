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
 * A representation of the literals of the enumeration '<em><b>Provenance Entity Role List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getProvenanceEntityRoleList()
 * @model extendedMetaData="name='ProvenanceEntityRole-list'"
 * @generated
 */
public enum ProvenanceEntityRoleList implements Enumerator {
	/**
	 * The '<em><b>Derivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVATION(0, "derivation", "derivation"),

	/**
	 * The '<em><b>Revision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISION_VALUE
	 * @generated
	 * @ordered
	 */
	REVISION(1, "revision", "revision"),

	/**
	 * The '<em><b>Quotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	QUOTATION(2, "quotation", "quotation"),

	/**
	 * The '<em><b>Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(3, "source", "source"), /**
	 * The '<em><b>Removal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVAL(4, "removal", "removal");

	/**
	 * The '<em><b>Derivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation
	 * <!-- end-model-doc -->
	 * @see #DERIVATION
	 * @model name="derivation"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVATION_VALUE = 0;

	/**
	 * The '<em><b>Revision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revision
	 * <!-- end-model-doc -->
	 * @see #REVISION
	 * @model name="revision"
	 * @generated
	 * @ordered
	 */
	public static final int REVISION_VALUE = 1;

	/**
	 * The '<em><b>Quotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quotation
	 * <!-- end-model-doc -->
	 * @see #QUOTATION
	 * @model name="quotation"
	 * @generated
	 * @ordered
	 */
	public static final int QUOTATION_VALUE = 2;

	/**
	 * The '<em><b>Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source
	 * <!-- end-model-doc -->
	 * @see #SOURCE
	 * @model name="source"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 3;

	/**
	 * The '<em><b>Removal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removal
	 * <!-- end-model-doc -->
	 * @see #REMOVAL
	 * @model name="removal"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Provenance Entity Role List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvenanceEntityRoleList[] VALUES_ARRAY =
		new ProvenanceEntityRoleList[] {
			DERIVATION,
			REVISION,
			QUOTATION,
			SOURCE,
			REMOVAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Provenance Entity Role List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvenanceEntityRoleList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provenance Entity Role List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceEntityRoleList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceEntityRoleList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Entity Role List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceEntityRoleList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceEntityRoleList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Entity Role List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceEntityRoleList get(int value) {
		switch (value) {
			case DERIVATION_VALUE: return DERIVATION;
			case REVISION_VALUE: return REVISION;
			case QUOTATION_VALUE: return QUOTATION;
			case SOURCE_VALUE: return SOURCE;
			case REMOVAL_VALUE: return REMOVAL;
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
	private ProvenanceEntityRoleList(int value, String name, String literal) {
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
	
} //ProvenanceEntityRoleList
