/**
 */
package clienteservidortcp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puertos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Puertos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clienteservidortcp.Puertos#getTipo <em>Tipo</em>}</li>
 *   <li>{@link clienteservidortcp.Puertos#getPuertos <em>Puertos</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getPuertos()
 * @model
 * @generated
 */
public interface Puertos extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPuertos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Puertos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link clienteservidortcp.TipoPuerto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.TipoPuerto
	 * @see #setTipo(TipoPuerto)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPuertos_Tipo()
	 * @model
	 * @generated
	 */
	TipoPuerto getTipo();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Puertos#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.TipoPuerto
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoPuerto value);

	/**
	 * Returns the value of the '<em><b>Puertos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puertos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puertos</em>' reference.
	 * @see #setPuertos(Puertos)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPuertos_Puertos()
	 * @model
	 * @generated
	 */
	Puertos getPuertos();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Puertos#getPuertos <em>Puertos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puertos</em>' reference.
	 * @see #getPuertos()
	 * @generated
	 */
	void setPuertos(Puertos value);

} // Puertos
