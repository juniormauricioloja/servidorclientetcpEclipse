/**
 */
package clienteservidortcp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cliente Servidor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpPackage#getClienteServidor()
 * @model
 * @generated
 */
public enum ClienteServidor implements Enumerator {
	/**
	 * The '<em><b>Cliente</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENTE_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENTE(0, "Cliente", "Cliente"),

	/**
	 * The '<em><b>Servidor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVIDOR_VALUE
	 * @generated
	 * @ordered
	 */
	SERVIDOR(1, "Servidor", "Servidor");

	/**
	 * The '<em><b>Cliente</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cliente</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENTE
	 * @model name="Cliente"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENTE_VALUE = 0;

	/**
	 * The '<em><b>Servidor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Servidor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVIDOR
	 * @model name="Servidor"
	 * @generated
	 * @ordered
	 */
	public static final int SERVIDOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cliente Servidor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClienteServidor[] VALUES_ARRAY = new ClienteServidor[] { CLIENTE, SERVIDOR, };

	/**
	 * A public read-only list of all the '<em><b>Cliente Servidor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClienteServidor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cliente Servidor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClienteServidor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClienteServidor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cliente Servidor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClienteServidor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClienteServidor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cliente Servidor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClienteServidor get(int value) {
		switch (value) {
		case CLIENTE_VALUE:
			return CLIENTE;
		case SERVIDOR_VALUE:
			return SERVIDOR;
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
	private ClienteServidor(int value, String name, String literal) {
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

} //ClienteServidor
