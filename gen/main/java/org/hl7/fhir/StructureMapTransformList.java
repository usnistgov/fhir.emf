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
 * A representation of the literals of the enumeration '<em><b>Structure Map Transform List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getStructureMapTransformList()
 * @model extendedMetaData="name='StructureMapTransform-list'"
 * @generated
 */
public enum StructureMapTransformList implements Enumerator {
	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(0, "create", "create"),

	/**
	 * The '<em><b>Copy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_VALUE
	 * @generated
	 * @ordered
	 */
	COPY(1, "copy", "copy"),

	/**
	 * The '<em><b>Truncate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNCATE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUNCATE(2, "truncate", "truncate"),

	/**
	 * The '<em><b>Escape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	ESCAPE(3, "escape", "escape"),

	/**
	 * The '<em><b>Cast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAST_VALUE
	 * @generated
	 * @ordered
	 */
	CAST(4, "cast", "cast"),

	/**
	 * The '<em><b>Append</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND_VALUE
	 * @generated
	 * @ordered
	 */
	APPEND(5, "append", "append"),

	/**
	 * The '<em><b>Translate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSLATE(6, "translate", "translate"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(7, "reference", "reference"),

	/**
	 * The '<em><b>Date Op</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_OP_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_OP(8, "dateOp", "dateOp"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(9, "uuid", "uuid"),

	/**
	 * The '<em><b>Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	POINTER(10, "pointer", "pointer"),

	/**
	 * The '<em><b>Evaluate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVALUATE_VALUE
	 * @generated
	 * @ordered
	 */
	EVALUATE(11, "evaluate", "evaluate"),

	/**
	 * The '<em><b>Cc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CC_VALUE
	 * @generated
	 * @ordered
	 */
	CC(12, "cc", "cc"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(13, "c", "c"),

	/**
	 * The '<em><b>Qty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QTY_VALUE
	 * @generated
	 * @ordered
	 */
	QTY(14, "qty", "qty"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(15, "id", "id"),

	/**
	 * The '<em><b>Cp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP_VALUE
	 * @generated
	 * @ordered
	 */
	CP(16, "cp", "cp");

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * create
	 * <!-- end-model-doc -->
	 * @see #CREATE
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 0;

	/**
	 * The '<em><b>Copy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copy
	 * <!-- end-model-doc -->
	 * @see #COPY
	 * @model name="copy"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_VALUE = 1;

	/**
	 * The '<em><b>Truncate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * truncate
	 * <!-- end-model-doc -->
	 * @see #TRUNCATE
	 * @model name="truncate"
	 * @generated
	 * @ordered
	 */
	public static final int TRUNCATE_VALUE = 2;

	/**
	 * The '<em><b>Escape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * escape
	 * <!-- end-model-doc -->
	 * @see #ESCAPE
	 * @model name="escape"
	 * @generated
	 * @ordered
	 */
	public static final int ESCAPE_VALUE = 3;

	/**
	 * The '<em><b>Cast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cast
	 * <!-- end-model-doc -->
	 * @see #CAST
	 * @model name="cast"
	 * @generated
	 * @ordered
	 */
	public static final int CAST_VALUE = 4;

	/**
	 * The '<em><b>Append</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * append
	 * <!-- end-model-doc -->
	 * @see #APPEND
	 * @model name="append"
	 * @generated
	 * @ordered
	 */
	public static final int APPEND_VALUE = 5;

	/**
	 * The '<em><b>Translate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * translate
	 * <!-- end-model-doc -->
	 * @see #TRANSLATE
	 * @model name="translate"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSLATE_VALUE = 6;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reference
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 7;

	/**
	 * The '<em><b>Date Op</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dateOp
	 * <!-- end-model-doc -->
	 * @see #DATE_OP
	 * @model name="dateOp"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_OP_VALUE = 8;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uuid
	 * <!-- end-model-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 9;

	/**
	 * The '<em><b>Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pointer
	 * <!-- end-model-doc -->
	 * @see #POINTER
	 * @model name="pointer"
	 * @generated
	 * @ordered
	 */
	public static final int POINTER_VALUE = 10;

	/**
	 * The '<em><b>Evaluate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * evaluate
	 * <!-- end-model-doc -->
	 * @see #EVALUATE
	 * @model name="evaluate"
	 * @generated
	 * @ordered
	 */
	public static final int EVALUATE_VALUE = 11;

	/**
	 * The '<em><b>Cc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cc
	 * <!-- end-model-doc -->
	 * @see #CC
	 * @model name="cc"
	 * @generated
	 * @ordered
	 */
	public static final int CC_VALUE = 12;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * c
	 * <!-- end-model-doc -->
	 * @see #C
	 * @model name="c"
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 13;

	/**
	 * The '<em><b>Qty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * qty
	 * <!-- end-model-doc -->
	 * @see #QTY
	 * @model name="qty"
	 * @generated
	 * @ordered
	 */
	public static final int QTY_VALUE = 14;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * id
	 * <!-- end-model-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 15;

	/**
	 * The '<em><b>Cp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cp
	 * <!-- end-model-doc -->
	 * @see #CP
	 * @model name="cp"
	 * @generated
	 * @ordered
	 */
	public static final int CP_VALUE = 16;

	/**
	 * An array of all the '<em><b>Structure Map Transform List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureMapTransformList[] VALUES_ARRAY =
		new StructureMapTransformList[] {
			CREATE,
			COPY,
			TRUNCATE,
			ESCAPE,
			CAST,
			APPEND,
			TRANSLATE,
			REFERENCE,
			DATE_OP,
			UUID,
			POINTER,
			EVALUATE,
			CC,
			C,
			QTY,
			ID,
			CP,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Map Transform List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureMapTransformList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Map Transform List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapTransformList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapTransformList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Transform List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapTransformList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapTransformList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Transform List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapTransformList get(int value) {
		switch (value) {
			case CREATE_VALUE: return CREATE;
			case COPY_VALUE: return COPY;
			case TRUNCATE_VALUE: return TRUNCATE;
			case ESCAPE_VALUE: return ESCAPE;
			case CAST_VALUE: return CAST;
			case APPEND_VALUE: return APPEND;
			case TRANSLATE_VALUE: return TRANSLATE;
			case REFERENCE_VALUE: return REFERENCE;
			case DATE_OP_VALUE: return DATE_OP;
			case UUID_VALUE: return UUID;
			case POINTER_VALUE: return POINTER;
			case EVALUATE_VALUE: return EVALUATE;
			case CC_VALUE: return CC;
			case C_VALUE: return C;
			case QTY_VALUE: return QTY;
			case ID_VALUE: return ID;
			case CP_VALUE: return CP;
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
	private StructureMapTransformList(int value, String name, String literal) {
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
	
} //StructureMapTransformList
