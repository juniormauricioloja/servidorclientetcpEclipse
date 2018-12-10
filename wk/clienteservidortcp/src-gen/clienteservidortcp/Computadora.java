/**
 */
package clienteservidortcp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computadora</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Computadora#getTipo <em>Tipo</em>}</li>
 *   <li>{@link clienteservidortcp.Computadora#getInterfaz <em>Interfaz</em>}</li>
 *   <li>{@link clienteservidortcp.Computadora#getCom <em>Com</em>}</li>
 *   <li>{@link clienteservidortcp.Computadora#getTcp <em>Tcp</em>}</li>
 *   <li>{@link clienteservidortcp.Computadora#getPuertos <em>Puertos</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getComputadora()
 * @model
 * @generated
 */
public interface Computadora extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link clienteservidortcp.ClienteServidor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.ClienteServidor
	 * @see #setTipo(ClienteServidor)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getComputadora_Tipo()
	 * @model
	 * @generated
	 */
	ClienteServidor getTipo();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Computadora#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.ClienteServidor
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(ClienteServidor value);

	/**
	 * Returns the value of the '<em><b>Interfaz</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.Interfaz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaz</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaz</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getComputadora_Interfaz()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interfaz> getInterfaz();

	/**
	 * Returns the value of the '<em><b>Com</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.COM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getComputadora_Com()
	 * @model containment="true"
	 * @generated
	 */
	EList<COM> getCom();

	/**
	 * Returns the value of the '<em><b>Tcp</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.TCP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcp</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getComputadora_Tcp()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCP> getTcp();

	/**
	 * Returns the value of the '<em><b>Puertos</b></em>' reference list.
	 * The list contents are of type {@link clienteservidortcp.Puertos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puertos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puertos</em>' reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getComputadora_Puertos()
	 * @model
	 * @generated
	 */
	EList<Puertos> getPuertos();

} // Computadora
