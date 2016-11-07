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
 * A representation of the literals of the enumeration '<em><b>Name Use List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getNameUseList()
 * @model extendedMetaData="name='NameUse-list'"
 * @generated
 */
public enum NameUseList implements Enumerator {
	/**
	 * The '<em><b>Usual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USUAL_VALUE
	 * @generated
	 * @ordered
	 */
	USUAL(0, "usual", "usual"),

	/**
	 * The '<em><b>Official</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICIAL(1, "official", "official"),

	/**
	 * The '<em><b>Temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP(2, "temp", "temp"),

	/**
	 * The '<em><b>Nickname</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NICKNAME_VALUE
	 * @generated
	 * @ordered
	 */
	NICKNAME(3, "nickname", "nickname"),

	/**
	 * The '<em><b>Anonymous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMOUS(4, "anonymous", "anonymous"),

	/**
	 * The '<em><b>Old</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLD_VALUE
	 * @generated
	 * @ordered
	 */
	OLD(5, "old", "old"),

	/**
	 * The '<em><b>Maiden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIDEN_VALUE
	 * @generated
	 * @ordered
	 */
	MAIDEN(6, "maiden", "maiden");

	/**
	 * The '<em><b>Usual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usual
	 * <!-- end-model-doc -->
	 * @see #USUAL
	 * @model name="usual"
	 * @generated
	 * @ordered
	 */
	public static final int USUAL_VALUE = 0;

	/**
	 * The '<em><b>Official</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official
	 * <!-- end-model-doc -->
	 * @see #OFFICIAL
	 * @model name="official"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIAL_VALUE = 1;

	/**
	 * The '<em><b>Temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temp
	 * <!-- end-model-doc -->
	 * @see #TEMP
	 * @model name="temp"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_VALUE = 2;

	/**
	 * The '<em><b>Nickname</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nickname
	 * <!-- end-model-doc -->
	 * @see #NICKNAME
	 * @model name="nickname"
	 * @generated
	 * @ordered
	 */
	public static final int NICKNAME_VALUE = 3;

	/**
	 * The '<em><b>Anonymous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anonymous
	 * <!-- end-model-doc -->
	 * @see #ANONYMOUS
	 * @model name="anonymous"
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMOUS_VALUE = 4;

	/**
	 * The '<em><b>Old</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Old
	 * <!-- end-model-doc -->
	 * @see #OLD
	 * @model name="old"
	 * @generated
	 * @ordered
	 */
	public static final int OLD_VALUE = 5;

	/**
	 * The '<em><b>Maiden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maiden
	 * <!-- end-model-doc -->
	 * @see #MAIDEN
	 * @model name="maiden"
	 * @generated
	 * @ordered
	 */
	public static final int MAIDEN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Name Use List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameUseList[] VALUES_ARRAY =
		new NameUseList[] {
			USUAL,
			OFFICIAL,
			TEMP,
			NICKNAME,
			ANONYMOUS,
			OLD,
			MAIDEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Use List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameUseList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Use List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameUseList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameUseList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Use List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameUseList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameUseList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Use List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameUseList get(int value) {
		switch (value) {
			case USUAL_VALUE: return USUAL;
			case OFFICIAL_VALUE: return OFFICIAL;
			case TEMP_VALUE: return TEMP;
			case NICKNAME_VALUE: return NICKNAME;
			case ANONYMOUS_VALUE: return ANONYMOUS;
			case OLD_VALUE: return OLD;
			case MAIDEN_VALUE: return MAIDEN;
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
	private NameUseList(int value, String name, String literal) {
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
	
} //NameUseList
