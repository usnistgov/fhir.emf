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
 * A representation of the literals of the enumeration '<em><b>Property Representation List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getPropertyRepresentationList()
 * @model extendedMetaData="name='PropertyRepresentation-list'"
 * @generated
 */
public enum PropertyRepresentationList implements Enumerator {
	/**
	 * The '<em><b>Xml Attr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_ATTR_VALUE
	 * @generated
	 * @ordered
	 */
	XML_ATTR(0, "xmlAttr", "xmlAttr"), /**
	 * The '<em><b>Xml Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	XML_TEXT(1, "xmlText", "xmlText"), /**
	 * The '<em><b>Type Attr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_ATTR_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_ATTR(2, "typeAttr", "typeAttr"), /**
	 * The '<em><b>Cda Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDA_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CDA_TEXT(3, "cdaText", "cdaText"), /**
	 * The '<em><b>Xhtml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XHTML_VALUE
	 * @generated
	 * @ordered
	 */
	XHTML(4, "xhtml", "xhtml");

	/**
	 * The '<em><b>Xml Attr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XML Attribute
	 * <!-- end-model-doc -->
	 * @see #XML_ATTR
	 * @model name="xmlAttr"
	 * @generated
	 * @ordered
	 */
	public static final int XML_ATTR_VALUE = 0;

	/**
	 * The '<em><b>Xml Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XML Text
	 * <!-- end-model-doc -->
	 * @see #XML_TEXT
	 * @model name="xmlText"
	 * @generated
	 * @ordered
	 */
	public static final int XML_TEXT_VALUE = 1;

	/**
	 * The '<em><b>Type Attr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type Attribute
	 * <!-- end-model-doc -->
	 * @see #TYPE_ATTR
	 * @model name="typeAttr"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ATTR_VALUE = 2;

	/**
	 * The '<em><b>Cda Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Text Format
	 * <!-- end-model-doc -->
	 * @see #CDA_TEXT
	 * @model name="cdaText"
	 * @generated
	 * @ordered
	 */
	public static final int CDA_TEXT_VALUE = 3;

	/**
	 * The '<em><b>Xhtml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XHTML
	 * <!-- end-model-doc -->
	 * @see #XHTML
	 * @model name="xhtml"
	 * @generated
	 * @ordered
	 */
	public static final int XHTML_VALUE = 4;

	/**
	 * An array of all the '<em><b>Property Representation List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyRepresentationList[] VALUES_ARRAY =
		new PropertyRepresentationList[] {
			XML_ATTR,
			XML_TEXT,
			TYPE_ATTR,
			CDA_TEXT,
			XHTML,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Representation List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyRepresentationList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Representation List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyRepresentationList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyRepresentationList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Representation List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyRepresentationList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyRepresentationList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Representation List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyRepresentationList get(int value) {
		switch (value) {
			case XML_ATTR_VALUE: return XML_ATTR;
			case XML_TEXT_VALUE: return XML_TEXT;
			case TYPE_ATTR_VALUE: return TYPE_ATTR;
			case CDA_TEXT_VALUE: return CDA_TEXT;
			case XHTML_VALUE: return XHTML;
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
	private PropertyRepresentationList(int value, String name, String literal) {
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
	
} //PropertyRepresentationList
