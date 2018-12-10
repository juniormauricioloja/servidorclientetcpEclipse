/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Pines;
import clienteservidortcp.Puertos;
import clienteservidortcp.TarjetaDesarrollo;

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
 * An implementation of the model object '<em><b>Tarjeta Desarrollo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.TarjetaDesarrolloImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clienteservidortcp.impl.TarjetaDesarrolloImpl#getVelocidadT <em>Velocidad T</em>}</li>
 *   <li>{@link clienteservidortcp.impl.TarjetaDesarrolloImpl#getPines <em>Pines</em>}</li>
 *   <li>{@link clienteservidortcp.impl.TarjetaDesarrolloImpl#getPuertos <em>Puertos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarjetaDesarrolloImpl extends MinimalEObjectImpl.Container implements TarjetaDesarrollo {
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
	 * The default value of the '{@link #getVelocidadT() <em>Velocidad T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocidadT()
	 * @generated
	 * @ordered
	 */
	protected static final int VELOCIDAD_T_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVelocidadT() <em>Velocidad T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocidadT()
	 * @generated
	 * @ordered
	 */
	protected int velocidadT = VELOCIDAD_T_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPines() <em>Pines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPines()
	 * @generated
	 * @ordered
	 */
	protected EList<Pines> pines;

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
	protected TarjetaDesarrolloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.TARJETA_DESARROLLO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.TARJETA_DESARROLLO__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVelocidadT() {
		return velocidadT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocidadT(int newVelocidadT) {
		int oldVelocidadT = velocidadT;
		velocidadT = newVelocidadT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClienteservidortcpPackage.TARJETA_DESARROLLO__VELOCIDAD_T, oldVelocidadT, velocidadT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pines> getPines() {
		if (pines == null) {
			pines = new EObjectContainmentEList<Pines>(Pines.class, this,
					ClienteservidortcpPackage.TARJETA_DESARROLLO__PINES);
		}
		return pines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Puertos> getPuertos() {
		if (puertos == null) {
			puertos = new EObjectResolvingEList<Puertos>(Puertos.class, this,
					ClienteservidortcpPackage.TARJETA_DESARROLLO__PUERTOS);
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
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PINES:
			return ((InternalEList<?>) getPines()).basicRemove(otherEnd, msgs);
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
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__NOMBRE:
			return getNombre();
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__VELOCIDAD_T:
			return getVelocidadT();
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PINES:
			return getPines();
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PUERTOS:
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
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__NOMBRE:
			setNombre((String) newValue);
			return;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__VELOCIDAD_T:
			setVelocidadT((Integer) newValue);
			return;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PINES:
			getPines().clear();
			getPines().addAll((Collection<? extends Pines>) newValue);
			return;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PUERTOS:
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
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__VELOCIDAD_T:
			setVelocidadT(VELOCIDAD_T_EDEFAULT);
			return;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PINES:
			getPines().clear();
			return;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PUERTOS:
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
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__VELOCIDAD_T:
			return velocidadT != VELOCIDAD_T_EDEFAULT;
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PINES:
			return pines != null && !pines.isEmpty();
		case ClienteservidortcpPackage.TARJETA_DESARROLLO__PUERTOS:
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
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", VelocidadT: ");
		result.append(velocidadT);
		result.append(')');
		return result.toString();
	}

} //TarjetaDesarrolloImpl
