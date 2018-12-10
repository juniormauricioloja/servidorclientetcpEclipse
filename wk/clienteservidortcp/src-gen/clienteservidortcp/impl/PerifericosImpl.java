/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Perifericos;
import clienteservidortcp.TipoPerifericos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perifericos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.PerifericosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clienteservidortcp.impl.PerifericosImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PerifericosImpl extends MinimalEObjectImpl.Container implements Perifericos {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPerifericos TIPO_EDEFAULT = TipoPerifericos.ANALOGICO;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoPerifericos tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerifericosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.PERIFERICOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PERIFERICOS__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPerifericos getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoPerifericos newTipo) {
		TipoPerifericos oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PERIFERICOS__TIPO, oldTipo,
					tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClienteservidortcpPackage.PERIFERICOS__NOMBRE:
			return getNombre();
		case ClienteservidortcpPackage.PERIFERICOS__TIPO:
			return getTipo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClienteservidortcpPackage.PERIFERICOS__NOMBRE:
			setNombre((String) newValue);
			return;
		case ClienteservidortcpPackage.PERIFERICOS__TIPO:
			setTipo((TipoPerifericos) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ClienteservidortcpPackage.PERIFERICOS__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ClienteservidortcpPackage.PERIFERICOS__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ClienteservidortcpPackage.PERIFERICOS__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case ClienteservidortcpPackage.PERIFERICOS__TIPO:
			return tipo != TIPO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", Tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //PerifericosImpl
