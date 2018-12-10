/**
 */
package clienteservidortcp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Salida#getActuadores <em>Actuadores</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getSalida()
 * @model
 * @generated
 */
public interface Salida extends Pines {

	/**
	 * Returns the value of the '<em><b>Actuadores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuadores</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuadores</em>' reference.
	 * @see #setActuadores(Actuadores)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getSalida_Actuadores()
	 * @model
	 * @generated
	 */
	Actuadores getActuadores();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Salida#getActuadores <em>Actuadores</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuadores</em>' reference.
	 * @see #getActuadores()
	 * @generated
	 */
	void setActuadores(Actuadores value);

} // Salida
