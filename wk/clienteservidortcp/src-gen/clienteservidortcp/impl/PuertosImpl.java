/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Puertos;
import clienteservidortcp.TipoPuerto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puertos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.PuertosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clienteservidortcp.impl.PuertosImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link clienteservidortcp.impl.PuertosImpl#getPuertos <em>Puertos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuertosImpl extends MinimalEObjectImpl.Container implements Puertos {
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
	protected static final TipoPuerto TIPO_EDEFAULT = TipoPuerto.SERIAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoPuerto tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPuertos() <em>Puertos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertos()
	 * @generated
	 * @ordered
	 */
	protected Puertos puertos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuertosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.PUERTOS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PUERTOS__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPuerto getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoPuerto newTipo) {
		TipoPuerto oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PUERTOS__TIPO, oldTipo,
					tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puertos getPuertos() {
		if (puertos != null && puertos.eIsProxy()) {
			InternalEObject oldPuertos = (InternalEObject) puertos;
			puertos = (Puertos) eResolveProxy(oldPuertos);
			if (puertos != oldPuertos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ClienteservidortcpPackage.PUERTOS__PUERTOS, oldPuertos, puertos));
			}
		}
		return puertos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puertos basicGetPuertos() {
		return puertos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuertos(Puertos newPuertos) {
		Puertos oldPuertos = puertos;
		puertos = newPuertos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PUERTOS__PUERTOS,
					oldPuertos, puertos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClienteservidortcpPackage.PUERTOS__NOMBRE:
			return getNombre();
		case ClienteservidortcpPackage.PUERTOS__TIPO:
			return getTipo();
		case ClienteservidortcpPackage.PUERTOS__PUERTOS:
			if (resolve)
				return getPuertos();
			return basicGetPuertos();
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
		case ClienteservidortcpPackage.PUERTOS__NOMBRE:
			setNombre((String) newValue);
			return;
		case ClienteservidortcpPackage.PUERTOS__TIPO:
			setTipo((TipoPuerto) newValue);
			return;
		case ClienteservidortcpPackage.PUERTOS__PUERTOS:
			setPuertos((Puertos) newValue);
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
		case ClienteservidortcpPackage.PUERTOS__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ClienteservidortcpPackage.PUERTOS__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case ClienteservidortcpPackage.PUERTOS__PUERTOS:
			setPuertos((Puertos) null);
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
		case ClienteservidortcpPackage.PUERTOS__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case ClienteservidortcpPackage.PUERTOS__TIPO:
			return tipo != TIPO_EDEFAULT;
		case ClienteservidortcpPackage.PUERTOS__PUERTOS:
			return puertos != null;
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

} //PuertosImpl
