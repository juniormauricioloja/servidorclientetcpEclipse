/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.Arquitectura;
import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Computadora;
import clienteservidortcp.Perifericos;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arquitectura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.ArquitecturaImpl#getComputadora <em>Computadora</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ArquitecturaImpl#getTarjetadesarrollo <em>Tarjetadesarrollo</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ArquitecturaImpl#getPerifericos <em>Perifericos</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ArquitecturaImpl#getPuertos <em>Puertos</em>}</li>
 *   <li>{@link clienteservidortcp.impl.ArquitecturaImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArquitecturaImpl extends MinimalEObjectImpl.Container implements Arquitectura {
	/**
	 * The cached value of the '{@link #getComputadora() <em>Computadora</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputadora()
	 * @generated
	 * @ordered
	 */
	protected EList<Computadora> computadora;

	/**
	 * The cached value of the '{@link #getTarjetadesarrollo() <em>Tarjetadesarrollo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarjetadesarrollo()
	 * @generated
	 * @ordered
	 */
	protected EList<TarjetaDesarrollo> tarjetadesarrollo;

	/**
	 * The cached value of the '{@link #getPerifericos() <em>Perifericos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerifericos()
	 * @generated
	 * @ordered
	 */
	protected EList<Perifericos> perifericos;

	/**
	 * The cached value of the '{@link #getPuertos() <em>Puertos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuertos()
	 * @generated
	 * @ordered
	 */
	protected EList<Puertos> puertos;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArquitecturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.ARQUITECTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computadora> getComputadora() {
		if (computadora == null) {
			computadora = new EObjectContainmentEList<Computadora>(Computadora.class, this,
					ClienteservidortcpPackage.ARQUITECTURA__COMPUTADORA);
		}
		return computadora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TarjetaDesarrollo> getTarjetadesarrollo() {
		if (tarjetadesarrollo == null) {
			tarjetadesarrollo = new EObjectContainmentEList<TarjetaDesarrollo>(TarjetaDesarrollo.class, this,
					ClienteservidortcpPackage.ARQUITECTURA__TARJETADESARROLLO);
		}
		return tarjetadesarrollo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perifericos> getPerifericos() {
		if (perifericos == null) {
			perifericos = new EObjectContainmentEList<Perifericos>(Perifericos.class, this,
					ClienteservidortcpPackage.ARQUITECTURA__PERIFERICOS);
		}
		return perifericos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Puertos> getPuertos() {
		if (puertos == null) {
			puertos = new EObjectContainmentEList<Puertos>(Puertos.class, this,
					ClienteservidortcpPackage.ARQUITECTURA__PUERTOS);
		}
		return puertos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.ARQUITECTURA__NOMBRE,
					oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClienteservidortcpPackage.ARQUITECTURA__COMPUTADORA:
			return ((InternalEList<?>) getComputadora()).basicRemove(otherEnd, msgs);
		case ClienteservidortcpPackage.ARQUITECTURA__TARJETADESARROLLO:
			return ((InternalEList<?>) getTarjetadesarrollo()).basicRemove(otherEnd, msgs);
		case ClienteservidortcpPackage.ARQUITECTURA__PERIFERICOS:
			return ((InternalEList<?>) getPerifericos()).basicRemove(otherEnd, msgs);
		case ClienteservidortcpPackage.ARQUITECTURA__PUERTOS:
			return ((InternalEList<?>) getPuertos()).basicRemove(otherEnd, msgs);
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
		case ClienteservidortcpPackage.ARQUITECTURA__COMPUTADORA:
			return getComputadora();
		case ClienteservidortcpPackage.ARQUITECTURA__TARJETADESARROLLO:
			return getTarjetadesarrollo();
		case ClienteservidortcpPackage.ARQUITECTURA__PERIFERICOS:
			return getPerifericos();
		case ClienteservidortcpPackage.ARQUITECTURA__PUERTOS:
			return getPuertos();
		case ClienteservidortcpPackage.ARQUITECTURA__NOMBRE:
			return getNombre();
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
		case ClienteservidortcpPackage.ARQUITECTURA__COMPUTADORA:
			getComputadora().clear();
			getComputadora().addAll((Collection<? extends Computadora>) newValue);
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__TARJETADESARROLLO:
			getTarjetadesarrollo().clear();
			getTarjetadesarrollo().addAll((Collection<? extends TarjetaDesarrollo>) newValue);
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__PERIFERICOS:
			getPerifericos().clear();
			getPerifericos().addAll((Collection<? extends Perifericos>) newValue);
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__PUERTOS:
			getPuertos().clear();
			getPuertos().addAll((Collection<? extends Puertos>) newValue);
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__NOMBRE:
			setNombre((String) newValue);
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
		case ClienteservidortcpPackage.ARQUITECTURA__COMPUTADORA:
			getComputadora().clear();
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__TARJETADESARROLLO:
			getTarjetadesarrollo().clear();
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__PERIFERICOS:
			getPerifericos().clear();
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__PUERTOS:
			getPuertos().clear();
			return;
		case ClienteservidortcpPackage.ARQUITECTURA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
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
		case ClienteservidortcpPackage.ARQUITECTURA__COMPUTADORA:
			return computadora != null && !computadora.isEmpty();
		case ClienteservidortcpPackage.ARQUITECTURA__TARJETADESARROLLO:
			return tarjetadesarrollo != null && !tarjetadesarrollo.isEmpty();
		case ClienteservidortcpPackage.ARQUITECTURA__PERIFERICOS:
			return perifericos != null && !perifericos.isEmpty();
		case ClienteservidortcpPackage.ARQUITECTURA__PUERTOS:
			return puertos != null && !puertos.isEmpty();
		case ClienteservidortcpPackage.ARQUITECTURA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(')');
		return result.toString();
	}

} //ArquitecturaImpl
