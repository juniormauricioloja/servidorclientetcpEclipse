/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClienteservidortcpFactoryImpl extends EFactoryImpl implements ClienteservidortcpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClienteservidortcpFactory init() {
		try {
			ClienteservidortcpFactory theClienteservidortcpFactory = (ClienteservidortcpFactory) EPackage.Registry.INSTANCE
					.getEFactory(ClienteservidortcpPackage.eNS_URI);
			if (theClienteservidortcpFactory != null) {
				return theClienteservidortcpFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClienteservidortcpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteservidortcpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ClienteservidortcpPackage.ARQUITECTURA:
			return createArquitectura();
		case ClienteservidortcpPackage.COMPUTADORA:
			return createComputadora();
		case ClienteservidortcpPackage.TARJETA_DESARROLLO:
			return createTarjetaDesarrollo();
		case ClienteservidortcpPackage.PUERTOS:
			return createPuertos();
		case ClienteservidortcpPackage.ENTRADA:
			return createEntrada();
		case ClienteservidortcpPackage.SALIDA:
			return createSalida();
		case ClienteservidortcpPackage.INTERFAZ:
			return createInterfaz();
		case ClienteservidortcpPackage.TCP:
			return createTCP();
		case ClienteservidortcpPackage.COM:
			return createCOM();
		case ClienteservidortcpPackage.ELEMENTOS:
			return createElementos();
		case ClienteservidortcpPackage.ACTUADORES:
			return createActuadores();
		case ClienteservidortcpPackage.SENSORES:
			return createSensores();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ClienteservidortcpPackage.TIPOS_PINES:
			return createTiposPinesFromString(eDataType, initialValue);
		case ClienteservidortcpPackage.CLIENTE_SERVIDOR:
			return createClienteServidorFromString(eDataType, initialValue);
		case ClienteservidortcpPackage.TIPO_PUERTO:
			return createTipoPuertoFromString(eDataType, initialValue);
		case ClienteservidortcpPackage.TIPO_PERIFERICOS:
			return createTipoPerifericosFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ClienteservidortcpPackage.TIPOS_PINES:
			return convertTiposPinesToString(eDataType, instanceValue);
		case ClienteservidortcpPackage.CLIENTE_SERVIDOR:
			return convertClienteServidorToString(eDataType, instanceValue);
		case ClienteservidortcpPackage.TIPO_PUERTO:
			return convertTipoPuertoToString(eDataType, instanceValue);
		case ClienteservidortcpPackage.TIPO_PERIFERICOS:
			return convertTipoPerifericosToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arquitectura createArquitectura() {
		ArquitecturaImpl arquitectura = new ArquitecturaImpl();
		return arquitectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computadora createComputadora() {
		ComputadoraImpl computadora = new ComputadoraImpl();
		return computadora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TarjetaDesarrollo createTarjetaDesarrollo() {
		TarjetaDesarrolloImpl tarjetaDesarrollo = new TarjetaDesarrolloImpl();
		return tarjetaDesarrollo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puertos createPuertos() {
		PuertosImpl puertos = new PuertosImpl();
		return puertos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entrada createEntrada() {
		EntradaImpl entrada = new EntradaImpl();
		return entrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salida createSalida() {
		SalidaImpl salida = new SalidaImpl();
		return salida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfaz createInterfaz() {
		InterfazImpl interfaz = new InterfazImpl();
		return interfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCP createTCP() {
		TCPImpl tcp = new TCPImpl();
		return tcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COM createCOM() {
		COMImpl com = new COMImpl();
		return com;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elementos createElementos() {
		ElementosImpl elementos = new ElementosImpl();
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuadores createActuadores() {
		ActuadoresImpl actuadores = new ActuadoresImpl();
		return actuadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensores createSensores() {
		SensoresImpl sensores = new SensoresImpl();
		return sensores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiposPines createTiposPinesFromString(EDataType eDataType, String initialValue) {
		TiposPines result = TiposPines.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTiposPinesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteServidor createClienteServidorFromString(EDataType eDataType, String initialValue) {
		ClienteServidor result = ClienteServidor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClienteServidorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPuerto createTipoPuertoFromString(EDataType eDataType, String initialValue) {
		TipoPuerto result = TipoPuerto.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPuertoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPerifericos createTipoPerifericosFromString(EDataType eDataType, String initialValue) {
		TipoPerifericos result = TipoPerifericos.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPerifericosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteservidortcpPackage getClienteservidortcpPackage() {
		return (ClienteservidortcpPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClienteservidortcpPackage getPackage() {
		return ClienteservidortcpPackage.eINSTANCE;
	}

} //ClienteservidortcpFactoryImpl
