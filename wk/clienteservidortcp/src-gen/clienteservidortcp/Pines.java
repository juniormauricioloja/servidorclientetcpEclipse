/**
 */
package clienteservidortcp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.Pines#getNumero <em>Numero</em>}</li>
 *   <li>{@link clienteservidortcp.Pines#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see clienteservidortcp.ClienteservidortcpPackage#getPines()
 * @model abstract="true"
 * @generated
 */
public interface Pines extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPines_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Pines#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link clienteservidortcp.TiposPines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.TiposPines
	 * @see #setTipo(TiposPines)
	 * @see clienteservidortcp.ClienteservidortcpPackage#getPines_Tipo()
	 * @model
	 * @generated
	 */
	TiposPines getTipo();

	/**
	 * Sets the value of the '{@link clienteservidortcp.Pines#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see clienteservidortcp.TiposPines
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TiposPines value);

} // Pines
