/**
 */
package clienteservidortcp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perifericos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Perifericos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clienteservidortcp.Perifericos#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getPerifericos()
 * @model abstract="true"
 * @generated
 */
public interface Perifericos extends EObject {
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
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPerifericos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Perifericos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link clienteservidortcp.TipoPerifericos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.TipoPerifericos
	 * @see #setTipo(TipoPerifericos)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPerifericos_Tipo()
	 * @model
	 * @generated
	 */
	TipoPerifericos getTipo();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Perifericos#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.TipoPerifericos
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoPerifericos value);

} // Perifericos
