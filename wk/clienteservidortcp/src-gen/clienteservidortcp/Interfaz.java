/**
 */
package clienteservidortcp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Interfaz#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getInterfaz()
 * @model
 * @generated
 */
public interface Interfaz extends EObject {
	/**
	 * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
	 * The list contents are of type {@link clienteservidortcp.Elementos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' containment reference list.
	 * @see clienteservidortcp.ClienteservidortcpPackage#getInterfaz_Elementos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elementos> getElementos();

} // Interfaz
