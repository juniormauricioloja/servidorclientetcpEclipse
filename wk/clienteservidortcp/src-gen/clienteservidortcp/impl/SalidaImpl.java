/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.Actuadores;
import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Salida;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.SalidaImpl#getActuadores <em>Actuadores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalidaImpl extends PinesImpl implements Salida {
	/**
	 * The cached value of the '{@link #getActuadores() <em>Actuadores</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuadores()
	 * @generated
	 * @ordered
	 */
	protected Actuadores actuadores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalidaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.SALIDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuadores getActuadores() {
		if (actuadores != null && actuadores.eIsProxy()) {
			InternalEObject oldActuadores = (InternalEObject) actuadores;
			actuadores = (Actuadores) eResolveProxy(oldActuadores);
			if (actuadores != oldActuadores) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ClienteservidortcpPackage.SALIDA__ACTUADORES, oldActuadores, actuadores));
			}
		}
		return actuadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuadores basicGetActuadores() {
		return actuadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuadores(Actuadores newActuadores) {
		Actuadores oldActuadores = actuadores;
		actuadores = newActuadores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.SALIDA__ACTUADORES,
					oldActuadores, actuadores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClienteservidortcpPackage.SALIDA__ACTUADORES:
			if (resolve)
				return getActuadores();
			return basicGetActuadores();
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
		case ClienteservidortcpPackage.SALIDA__ACTUADORES:
			setActuadores((Actuadores) newValue);
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
		case ClienteservidortcpPackage.SALIDA__ACTUADORES:
			setActuadores((Actuadores) null);
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
		case ClienteservidortcpPackage.SALIDA__ACTUADORES:
			return actuadores != null;
		}
		return super.eIsSet(featureID);
	}

} //SalidaImpl
