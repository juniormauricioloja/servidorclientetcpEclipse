/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.COM;
import clienteservidortcp.ClienteServidor;
import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Computadora;
import clienteservidortcp.Interfaz;
import clienteservidortcp.Puertos;
import clienteservidortcp.TCP;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computadora</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.ComputadoraImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ComputadoraImpl#getInterfaz <em>Interfaz</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ComputadoraImpl#getCom <em>Com</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ComputadoraImpl#getTcp <em>Tcp</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ComputadoraImpl#getPuertos <em>Puertos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputadoraImpl extends MinimalEObjectImpl.Container implements Computadora {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final ClienteServidor TIPO_EDEFAULT = ClienteServidor.CLIENTE;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected ClienteServidor tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaz() <em>Interfaz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaz()
	 * @generated
	 * @ordered
	 */
	protected EList<Interfaz> interfaz;

	/**
	 * The cached value of the '{@link #getCom() <em>Com</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCom()
	 * @generated
	 * @ordered
	 */
	protected EList<COM> com;

	/**
	 * The cached value of the '{@link #getTcp() <em>Tcp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcp()
	 * @generated
	 * @ordered
	 */
	protected EList<TCP> tcp;

	/**
	 * The cached value of the '{@link #getPuertos() <em>Puertos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertos()
	 * @generated
	 * @ordered
	 */
	protected EList<Puertos> puertos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputadoraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.COMPUTADORA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteServidor getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(ClienteServidor newTipo) {
		ClienteServidor oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.COMPUTADORA__TIPO, oldTipo,
					tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interfaz> getInterfaz() {
		if (interfaz == null) {
			interfaz = new EObjectContainmentEList<Interfaz>(Interfaz.class, this,
					ClienteservidortcpPackage.COMPUTADORA__INTERFAZ);
		}
		return interfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COM> getCom() {
		if (com == null) {
			com = new EObjectContainmentEList<COM>(COM.class, this, ClienteservidortcpPackage.COMPUTADORA__COM);
		}
		return com;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCP> getTcp() {
		if (tcp == null) {
			tcp = new EObjectContainmentEList<TCP>(TCP.class, this, ClienteservidortcpPackage.COMPUTADORA__TCP);
		}
		return tcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Puertos> getPuertos() {
		if (puertos == null) {
			puertos = new EObjectResolvingEList<Puertos>(Puertos.class, this,
					ClienteservidortcpPackage.COMPUTADORA__PUERTOS);
		}
		return puertos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClienteservidortcpPackage.COMPUTADORA__INTERFAZ:
			return ((InternalEList<?>) getInterfaz()).basicRemove(otherEnd, msgs);
		case ClienteservidortcpPackage.COMPUTADORA__COM:
			return ((InternalEList<?>) getCom()).basicRemove(otherEnd, msgs);
		case ClienteservidortcpPackage.COMPUTADORA__TCP:
			return ((InternalEList<?>) getTcp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClienteservidortcpPackage.COMPUTADORA__TIPO:
			return getTipo();
		case ClienteservidortcpPackage.COMPUTADORA__INTERFAZ:
			return getInterfaz();
		case ClienteservidortcpPackage.COMPUTADORA__COM:
			return getCom();
		case ClienteservidortcpPackage.COMPUTADORA__TCP:
			return getTcp();
		case ClienteservidortcpPackage.COMPUTADORA__PUERTOS:
			return getPuertos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClienteservidortcpPackage.COMPUTADORA__TIPO:
			setTipo((ClienteServidor) newValue);
			return;
		case ClienteservidortcpPackage.COMPUTADORA__INTERFAZ:
			getInterfaz().clear();
			getInterfaz().addAll((Collection<? extends Interfaz>) newValue);
			return;
		case ClienteservidortcpPackage.COMPUTADORA__COM:
			getCom().clear();
			getCom().addAll((Collection<? extends COM>) newValue);
			return;
		case ClienteservidortcpPackage.COMPUTADORA__TCP:
			getTcp().clear();
			getTcp().addAll((Collection<? extends TCP>) newValue);
			return;
		case ClienteservidortcpPackage.COMPUTADORA__PUERTOS:
			getPuertos().clear();
			getPuertos().addAll((Collection<? extends Puertos>) newValue);
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
		case ClienteservidortcpPackage.COMPUTADORA__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case ClienteservidortcpPackage.COMPUTADORA__INTERFAZ:
			getInterfaz().clear();
			return;
		case ClienteservidortcpPackage.COMPUTADORA__COM:
			getCom().clear();
			return;
		case ClienteservidortcpPackage.COMPUTADORA__TCP:
			getTcp().clear();
			return;
		case ClienteservidortcpPackage.COMPUTADORA__PUERTOS:
			getPuertos().clear();
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
		case ClienteservidortcpPackage.COMPUTADORA__TIPO:
			return tipo != TIPO_EDEFAULT;
		case ClienteservidortcpPackage.COMPUTADORA__INTERFAZ:
			return interfaz != null && !interfaz.isEmpty();
		case ClienteservidortcpPackage.COMPUTADORA__COM:
			return com != null && !com.isEmpty();
		case ClienteservidortcpPackage.COMPUTADORA__TCP:
			return tcp != null && !tcp.isEmpty();
		case ClienteservidortcpPackage.COMPUTADORA__PUERTOS:
			return puertos != null && !puertos.isEmpty();
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
		result.append(" (Tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //ComputadoraImpl
