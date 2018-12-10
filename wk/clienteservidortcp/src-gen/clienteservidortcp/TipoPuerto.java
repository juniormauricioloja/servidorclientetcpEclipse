/**
 */
package clienteservidortcp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Puerto</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpPackage#getTipoPuerto()
 * @model
 * @generated
 */
public enum TipoPuerto implements Enumerator {
	/**
	 * The '<em><b>Serial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(0, "Serial", "Serial"),

	/**
	 * The '<em><b>Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET(1, "Ethernet", "Ethernet");

	/**
	 * The '<em><b>Serial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Serial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model name="Serial"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 0;

	/**
	 * The '<em><b>Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET
	 * @model name="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tipo Puerto</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPuerto[] VALUES_ARRAY = new TipoPuerto[] { SERIAL, ETHERNET, };

	/**
	 * A public read-only list of all the '<em><b>Tipo Puerto</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoPuerto> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Puerto</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPuerto get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPuerto result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Puerto</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPuerto getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPuerto result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Puerto</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPuerto get(int value) {
		switch (value) {
		case SERIAL_VALUE:
			return SERIAL;
		case ETHERNET_VALUE:
			return ETHERNET;
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
	private TipoPuerto(int value, String name, String literal) {
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

} //TipoPuerto
