/**
 */
package clienteservidortcp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arquitectura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Arquitectura#getComputadora <em>Computadora</em>}</li>
 *   <li>{@link clienteservidortcp.Arquitectura#getTarjetadesarrollo <em>Tarjetadesarrollo</em>}</li>
 *   <li>{@link clienteservidortcp.Arquitectura#getPerifericos <em>Perifericos</em>}</li>
 *   <li>{@link clienteservidortcp.Arquitectura#getPuertos <em>Puertos</em>}</li>
 *   <li>{@link clienteservidortcp.Arquitectura#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getArquitectura()
 * @model
 * @generated
 */
public interface Arquitectura extends EObject {
	/**
	 * Returns the value of the '<em><b>Computadora</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.Computadora}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computadora</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computadora</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getArquitectura_Computadora()
	 * @model containment="true"
	 * @generated
	 */
	EList<Computadora> getComputadora();

	/**
	 * Returns the value of the '<em><b>Tarjetadesarrollo</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.TarjetaDesarrollo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarjetadesarrollo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarjetadesarrollo</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getArquitectura_Tarjetadesarrollo()
	 * @model containment="true"
	 * @generated
	 */
	EList<TarjetaDesarrollo> getTarjetadesarrollo();

	/**
	 * Returns the value of the '<em><b>Perifericos</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.Perifericos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perifericos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perifericos</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getArquitectura_Perifericos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Perifericos> getPerifericos();

	/**
	 * Returns the value of the '<em><b>Puertos</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.Puertos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puertos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puertos</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getArquitectura_Puertos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Puertos> getPuertos();

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
	 * @see clienteservidortcp.ClienteservidortcpPackage#getArquitectura_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Arquitectura#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Arquitectura
