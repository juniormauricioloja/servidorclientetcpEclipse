/**
 */
package clienteservidortcp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.TCP#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link clienteservidortcp.TCP#getIP <em>IP</em>}</li>
 *   <li>{@link clienteservidortcp.TCP#getDato <em>Dato</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getTCP()
 * @model
 * @generated
 */
public interface TCP extends EObject {
	/**
	 * Returns the value of the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puerto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puerto</em>' attribute.
	 * @see #setPuerto(int)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTCP_Puerto()
	 * @model
	 * @generated
	 */
	int getPuerto();

	/**
	 * Sets the value of the '{@link clienteservidortcp.TCP#getPuerto <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puerto</em>' attribute.
	 * @see #getPuerto()
	 * @generated
	 */
	void setPuerto(int value);

	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTCP_IP()
	 * @model
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link clienteservidortcp.TCP#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dato</em>' attribute.
	 * @see #setDato(String)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTCP_Dato()
	 * @model
	 * @generated
	 */
	String getDato();

	/**
	 * Sets the value of the '{@link clienteservidortcp.TCP#getDato <em>Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dato</em>' attribute.
	 * @see #getDato()
	 * @generated
	 */
	void setDato(String value);

} // TCP
