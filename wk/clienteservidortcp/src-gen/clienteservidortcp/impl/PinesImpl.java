/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Pines;
import clienteservidortcp.TiposPines;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clienteservidortcp.impl.PinesImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link clienteservidortcp.impl.PinesImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PinesImpl extends MinimalEObjectImpl.Container implements Pines {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TiposPines TIPO_EDEFAULT = TiposPines.ANALOGICO;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TiposPines tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClienteservidortcpPackage.Literals.PINES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PINES__NUMERO, oldNumero,
					numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiposPines getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TiposPines newTipo) {
		TiposPines oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClienteservidortcpPackage.PINES__TIPO, oldTipo,
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
		case ClienteservidortcpPackage.PINES__NUMERO:
			return getNumero();
		case ClienteservidortcpPackage.PINES__TIPO:
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
		case ClienteservidortcpPackage.PINES__NUMERO:
			setNumero((Integer) newValue);
			return;
		case ClienteservidortcpPackage.PINES__TIPO:
			setTipo((TiposPines) newValue);
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
		case ClienteservidortcpPackage.PINES__NUMERO:
			setNumero(NUMERO_EDEFAULT);
			return;
		case ClienteservidortcpPackage.PINES__TIPO:
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
		case ClienteservidortcpPackage.PINES__NUMERO:
			return numero != NUMERO_EDEFAULT;
		case ClienteservidortcpPackage.PINES__TIPO:
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
		result.append(" (Numero: ");
		result.append(numero);
		result.append(", Tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //PinesImpl
