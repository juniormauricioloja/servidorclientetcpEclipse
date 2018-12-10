/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.TCP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.TCPImpl#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link clienteservidortcp.impl.TCPImpl#getIP <em>IP</em>}</li>
 *   <li>{@link clienteservidortcp.impl.TCPImpl#getDato <em>Dato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCPImpl extends MinimalEObjectImpl.Container implements TCP {
	/**
	 * The default value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected static final int PUERTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected int puerto = PUERTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDato() <em>Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDato()
	 * @generated
	 * @ordered
	 */
	protected static final String DATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDato() <em>Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDato()
	 * @generated
	 * @ordered
	 */
	protected String dato = DATO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.TCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPuerto() {
		return puerto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuerto(int newPuerto) {
		int oldPuerto = puerto;
		puerto = newPuerto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.TCP__PUERTO, oldPuerto,
					puerto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = ip;
		ip = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.TCP__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDato() {
		return dato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDato(String newDato) {
		String oldDato = dato;
		dato = newDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.TCP__DATO, oldDato, dato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClienteservidortcpPackage.TCP__PUERTO:
			return getPuerto();
		case ClienteservidortcpPackage.TCP__IP:
			return getIP();
		case ClienteservidortcpPackage.TCP__DATO:
			return getDato();
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
		case ClienteservidortcpPackage.TCP__PUERTO:
			setPuerto((Integer) newValue);
			return;
		case ClienteservidortcpPackage.TCP__IP:
			setIP((String) newValue);
			return;
		case ClienteservidortcpPackage.TCP__DATO:
			setDato((String) newValue);
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
		case ClienteservidortcpPackage.TCP__PUERTO:
			setPuerto(PUERTO_EDEFAULT);
			return;
		case ClienteservidortcpPackage.TCP__IP:
			setIP(IP_EDEFAULT);
			return;
		case ClienteservidortcpPackage.TCP__DATO:
			setDato(DATO_EDEFAULT);
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
		case ClienteservidortcpPackage.TCP__PUERTO:
			return puerto != PUERTO_EDEFAULT;
		case ClienteservidortcpPackage.TCP__IP:
			return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
		case ClienteservidortcpPackage.TCP__DATO:
			return DATO_EDEFAULT == null ? dato != null : !DATO_EDEFAULT.equals(dato);
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
		result.append(" (Puerto: ");
		result.append(puerto);
		result.append(", IP: ");
		result.append(ip);
		result.append(", Dato: ");
		result.append(dato);
		result.append(')');
		return result.toString();
	}

} //TCPImpl
