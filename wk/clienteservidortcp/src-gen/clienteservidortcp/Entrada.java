/**
 */
package clienteservidortcp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entrada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Entrada#getSensores <em>Sensores</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getEntrada()
 * @model
 * @generated
 */
public interface Entrada extends Pines {

	/**
	 * Returns the value of the '<em><b>Sensores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensores</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensores</em>' reference.
	 * @see #setSensores(Sensores)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getEntrada_Sensores()
	 * @model
	 * @generated
	 */
	Sensores getSensores();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Entrada#getSensores <em>Sensores</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensores</em>' reference.
	 * @see #getSensores()
	 * @generated
	 */
	void setSensores(Sensores value);
} // Entrada
