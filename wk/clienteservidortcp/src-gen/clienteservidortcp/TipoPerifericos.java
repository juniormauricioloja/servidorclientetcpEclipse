/**
 */
package clienteservidortcp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Perifericos</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpPackage#getTipoPerifericos()
 * @model
 * @generated
 */
public enum TipoPerifericos implements Enumerator {
	/**
	 * The '<em><b>Analogico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOGICO_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOGICO(0, "Analogico", "Analogico"),

	/**
	 * The '<em><b>Digital</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL(1, "Digital", "Digital");

	/**
	 * The '<em><b>Analogico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analogico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALOGICO
	 * @model name="Analogico"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOGICO_VALUE = 0;

	/**
	 * The '<em><b>Digital</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digital</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITAL
	 * @model name="Digital"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tipo Perifericos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPerifericos[] VALUES_ARRAY = new TipoPerifericos[] { ANALOGICO, DIGITAL, };

	/**
	 * A public read-only list of all the '<em><b>Tipo Perifericos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoPerifericos> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Perifericos</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPerifericos get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPerifericos result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Perifericos</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPerifericos getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPerifericos result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Perifericos</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPerifericos get(int value) {
		switch (value) {
		case ANALOGICO_VALUE:
			return ANALOGICO;
		case DIGITAL_VALUE:
			return DIGITAL;
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
	private TipoPerifericos(int value, String name, String literal) {
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

} //TipoPerifericos
