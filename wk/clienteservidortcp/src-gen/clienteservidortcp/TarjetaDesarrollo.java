/**
 */
package clienteservidortcp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarjeta Desarrollo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.TarjetaDesarrollo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clienteservidortcp.TarjetaDesarrollo#getVelocidadT <em>Velocidad T</em>}</li>
 *   <li>{@link clienteservidortcp.TarjetaDesarrollo#getPines <em>Pines</em>}</li>
 *   <li>{@link clienteservidortcp.TarjetaDesarrollo#getPuertos <em>Puertos</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getTarjetaDesarrollo()
 * @model
 * @generated
 */
public interface TarjetaDesarrollo extends EObject {
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
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTarjetaDesarrollo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link clienteservidortcp.TarjetaDesarrollo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Velocidad T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocidad T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocidad T</em>' attribute.
	 * @see #setVelocidadT(int)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTarjetaDesarrollo_VelocidadT()
	 * @model
	 * @generated
	 */
	int getVelocidadT();

	/**
	 * Sets the value of the '{@link clienteservidortcp.TarjetaDesarrollo#getVelocidadT <em>Velocidad T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocidad T</em>' attribute.
	 * @see #getVelocidadT()
	 * @generated
	 */
	void setVelocidadT(int value);

	/**
	 * Returns the value of the '<em><b>Pines</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.Pines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pines</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTarjetaDesarrollo_Pines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pines> getPines();

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
	 * @see clienteservidortcp.ClienteservidortcpPackage#getTarjetaDesarrollo_Puertos()
	 * @model
	 * @generated
	 */
	EList<Puertos> getPuertos();

} // TarjetaDesarrollo
