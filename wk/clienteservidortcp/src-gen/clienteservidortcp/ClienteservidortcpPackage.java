/**
 */
package clienteservidortcp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpFactory
 * @model kind="package"
 * @generated
 */
public interface ClienteservidortcpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clienteservidortcp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/clienteservidortcp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "clienteservidortcp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClienteservidortcpPackage eINSTANCE = clienteservidortcp.impl.ClienteservidortcpPackageImpl.init();

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.ArquitecturaImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getArquitectura()
	 * @generated
	 */
	int ARQUITECTURA = 0;

	/**
	 * The feature id for the '<em><b>Computadora</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__COMPUTADORA = 0;

	/**
	 * The feature id for the '<em><b>Tarjetadesarrollo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__TARJETADESARROLLO = 1;

	/**
	 * The feature id for the '<em><b>Perifericos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__PERIFERICOS = 2;

	/**
	 * The feature id for the '<em><b>Puertos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__PUERTOS = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__NOMBRE = 4;

	/**
	 * The number of structural features of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.ComputadoraImpl <em>Computadora</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.ComputadoraImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getComputadora()
	 * @generated
	 */
	int COMPUTADORA = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Interfaz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA__INTERFAZ = 1;

	/**
	 * The feature id for the '<em><b>Com</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA__COM = 2;

	/**
	 * The feature id for the '<em><b>Tcp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA__TCP = 3;

	/**
	 * The feature id for the '<em><b>Puertos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA__PUERTOS = 4;

	/**
	 * The number of structural features of the '<em>Computadora</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Computadora</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTADORA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.TarjetaDesarrolloImpl <em>Tarjeta Desarrollo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.TarjetaDesarrolloImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTarjetaDesarrollo()
	 * @generated
	 */
	int TARJETA_DESARROLLO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_DESARROLLO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Velocidad T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_DESARROLLO__VELOCIDAD_T = 1;

	/**
	 * The feature id for the '<em><b>Pines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_DESARROLLO__PINES = 2;

	/**
	 * The feature id for the '<em><b>Puertos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_DESARROLLO__PUERTOS = 3;

	/**
	 * The number of structural features of the '<em>Tarjeta Desarrollo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_DESARROLLO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tarjeta Desarrollo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_DESARROLLO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.PerifericosImpl <em>Perifericos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.PerifericosImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getPerifericos()
	 * @generated
	 */
	int PERIFERICOS = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIFERICOS__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIFERICOS__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Perifericos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIFERICOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Perifericos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIFERICOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.PuertosImpl <em>Puertos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.PuertosImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getPuertos()
	 * @generated
	 */
	int PUERTOS = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTOS__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTOS__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Puertos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTOS__PUERTOS = 2;

	/**
	 * The number of structural features of the '<em>Puertos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTOS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Puertos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUERTOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.PinesImpl <em>Pines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.PinesImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getPines()
	 * @generated
	 */
	int PINES = 5;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINES__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINES__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Pines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.EntradaImpl <em>Entrada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.EntradaImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getEntrada()
	 * @generated
	 */
	int ENTRADA = 6;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__NUMERO = PINES__NUMERO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__TIPO = PINES__TIPO;

	/**
	 * The feature id for the '<em><b>Sensores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__SENSORES = PINES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entrada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_FEATURE_COUNT = PINES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entrada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OPERATION_COUNT = PINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.SalidaImpl <em>Salida</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.SalidaImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getSalida()
	 * @generated
	 */
	int SALIDA = 7;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__NUMERO = PINES__NUMERO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__TIPO = PINES__TIPO;

	/**
	 * The feature id for the '<em><b>Actuadores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__ACTUADORES = PINES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Salida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_FEATURE_COUNT = PINES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Salida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_OPERATION_COUNT = PINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.InterfazImpl <em>Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.InterfazImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getInterfaz()
	 * @generated
	 */
	int INTERFAZ = 8;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__ELEMENTOS = 0;

	/**
	 * The number of structural features of the '<em>Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.TCPImpl <em>TCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.TCPImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTCP()
	 * @generated
	 */
	int TCP = 9;

	/**
	 * The feature id for the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP__PUERTO = 0;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP__IP = 1;

	/**
	 * The feature id for the '<em><b>Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP__DATO = 2;

	/**
	 * The number of structural features of the '<em>TCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.COMImpl <em>COM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.COMImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getCOM()
	 * @generated
	 */
	int COM = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM__DATO = 1;

	/**
	 * The number of structural features of the '<em>COM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>COM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.ElementosImpl <em>Elementos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.ElementosImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getElementos()
	 * @generated
	 */
	int ELEMENTOS = 11;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTOS__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Elementos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elementos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.ActuadoresImpl <em>Actuadores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.ActuadoresImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getActuadores()
	 * @generated
	 */
	int ACTUADORES = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__NOMBRE = PERIFERICOS__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__TIPO = PERIFERICOS__TIPO;

	/**
	 * The number of structural features of the '<em>Actuadores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES_FEATURE_COUNT = PERIFERICOS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuadores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES_OPERATION_COUNT = PERIFERICOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.impl.SensoresImpl <em>Sensores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.impl.SensoresImpl
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getSensores()
	 * @generated
	 */
	int SENSORES = 13;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__NOMBRE = PERIFERICOS__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__TIPO = PERIFERICOS__TIPO;

	/**
	 * The number of structural features of the '<em>Sensores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES_FEATURE_COUNT = PERIFERICOS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES_OPERATION_COUNT = PERIFERICOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clienteservidortcp.TiposPines <em>Tipos Pines</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.TiposPines
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTiposPines()
	 * @generated
	 */
	int TIPOS_PINES = 14;

	/**
	 * The meta object id for the '{@link clienteservidortcp.ClienteServidor <em>Cliente Servidor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.ClienteServidor
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getClienteServidor()
	 * @generated
	 */
	int CLIENTE_SERVIDOR = 15;

	/**
	 * The meta object id for the '{@link clienteservidortcp.TipoPuerto <em>Tipo Puerto</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.TipoPuerto
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTipoPuerto()
	 * @generated
	 */
	int TIPO_PUERTO = 16;

	/**
	 * The meta object id for the '{@link clienteservidortcp.TipoPerifericos <em>Tipo Perifericos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clienteservidortcp.TipoPerifericos
	 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTipoPerifericos()
	 * @generated
	 */
	int TIPO_PERIFERICOS = 17;

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arquitectura</em>'.
	 * @see clienteservidortcp.Arquitectura
	 * @generated
	 */
	EClass getArquitectura();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Arquitectura#getComputadora <em>Computadora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computadora</em>'.
	 * @see clienteservidortcp.Arquitectura#getComputadora()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Computadora();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Arquitectura#getTarjetadesarrollo <em>Tarjetadesarrollo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tarjetadesarrollo</em>'.
	 * @see clienteservidortcp.Arquitectura#getTarjetadesarrollo()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Tarjetadesarrollo();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Arquitectura#getPerifericos <em>Perifericos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perifericos</em>'.
	 * @see clienteservidortcp.Arquitectura#getPerifericos()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Perifericos();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Arquitectura#getPuertos <em>Puertos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Puertos</em>'.
	 * @see clienteservidortcp.Arquitectura#getPuertos()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Puertos();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Arquitectura#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clienteservidortcp.Arquitectura#getNombre()
	 * @see #getArquitectura()
	 * @generated
	 */
	EAttribute getArquitectura_Nombre();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Computadora <em>Computadora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computadora</em>'.
	 * @see clienteservidortcp.Computadora
	 * @generated
	 */
	EClass getComputadora();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Computadora#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see clienteservidortcp.Computadora#getTipo()
	 * @see #getComputadora()
	 * @generated
	 */
	EAttribute getComputadora_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Computadora#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaz</em>'.
	 * @see clienteservidortcp.Computadora#getInterfaz()
	 * @see #getComputadora()
	 * @generated
	 */
	EReference getComputadora_Interfaz();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Computadora#getCom <em>Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com</em>'.
	 * @see clienteservidortcp.Computadora#getCom()
	 * @see #getComputadora()
	 * @generated
	 */
	EReference getComputadora_Com();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Computadora#getTcp <em>Tcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tcp</em>'.
	 * @see clienteservidortcp.Computadora#getTcp()
	 * @see #getComputadora()
	 * @generated
	 */
	EReference getComputadora_Tcp();

	/**
	 * Returns the meta object for the reference list '{@link clienteservidortcp.Computadora#getPuertos <em>Puertos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Puertos</em>'.
	 * @see clienteservidortcp.Computadora#getPuertos()
	 * @see #getComputadora()
	 * @generated
	 */
	EReference getComputadora_Puertos();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.TarjetaDesarrollo <em>Tarjeta Desarrollo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarjeta Desarrollo</em>'.
	 * @see clienteservidortcp.TarjetaDesarrollo
	 * @generated
	 */
	EClass getTarjetaDesarrollo();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.TarjetaDesarrollo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clienteservidortcp.TarjetaDesarrollo#getNombre()
	 * @see #getTarjetaDesarrollo()
	 * @generated
	 */
	EAttribute getTarjetaDesarrollo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.TarjetaDesarrollo#getVelocidadT <em>Velocidad T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocidad T</em>'.
	 * @see clienteservidortcp.TarjetaDesarrollo#getVelocidadT()
	 * @see #getTarjetaDesarrollo()
	 * @generated
	 */
	EAttribute getTarjetaDesarrollo_VelocidadT();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.TarjetaDesarrollo#getPines <em>Pines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pines</em>'.
	 * @see clienteservidortcp.TarjetaDesarrollo#getPines()
	 * @see #getTarjetaDesarrollo()
	 * @generated
	 */
	EReference getTarjetaDesarrollo_Pines();

	/**
	 * Returns the meta object for the reference list '{@link clienteservidortcp.TarjetaDesarrollo#getPuertos <em>Puertos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Puertos</em>'.
	 * @see clienteservidortcp.TarjetaDesarrollo#getPuertos()
	 * @see #getTarjetaDesarrollo()
	 * @generated
	 */
	EReference getTarjetaDesarrollo_Puertos();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Perifericos <em>Perifericos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perifericos</em>'.
	 * @see clienteservidortcp.Perifericos
	 * @generated
	 */
	EClass getPerifericos();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Perifericos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clienteservidortcp.Perifericos#getNombre()
	 * @see #getPerifericos()
	 * @generated
	 */
	EAttribute getPerifericos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Perifericos#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see clienteservidortcp.Perifericos#getTipo()
	 * @see #getPerifericos()
	 * @generated
	 */
	EAttribute getPerifericos_Tipo();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Puertos <em>Puertos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puertos</em>'.
	 * @see clienteservidortcp.Puertos
	 * @generated
	 */
	EClass getPuertos();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Puertos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clienteservidortcp.Puertos#getNombre()
	 * @see #getPuertos()
	 * @generated
	 */
	EAttribute getPuertos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Puertos#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see clienteservidortcp.Puertos#getTipo()
	 * @see #getPuertos()
	 * @generated
	 */
	EAttribute getPuertos_Tipo();

	/**
	 * Returns the meta object for the reference '{@link clienteservidortcp.Puertos#getPuertos <em>Puertos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Puertos</em>'.
	 * @see clienteservidortcp.Puertos#getPuertos()
	 * @see #getPuertos()
	 * @generated
	 */
	EReference getPuertos_Puertos();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Pines <em>Pines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pines</em>'.
	 * @see clienteservidortcp.Pines
	 * @generated
	 */
	EClass getPines();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Pines#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see clienteservidortcp.Pines#getNumero()
	 * @see #getPines()
	 * @generated
	 */
	EAttribute getPines_Numero();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Pines#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see clienteservidortcp.Pines#getTipo()
	 * @see #getPines()
	 * @generated
	 */
	EAttribute getPines_Tipo();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Entrada <em>Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada</em>'.
	 * @see clienteservidortcp.Entrada
	 * @generated
	 */
	EClass getEntrada();

	/**
	 * Returns the meta object for the reference '{@link clienteservidortcp.Entrada#getSensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensores</em>'.
	 * @see clienteservidortcp.Entrada#getSensores()
	 * @see #getEntrada()
	 * @generated
	 */
	EReference getEntrada_Sensores();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida</em>'.
	 * @see clienteservidortcp.Salida
	 * @generated
	 */
	EClass getSalida();

	/**
	 * Returns the meta object for the reference '{@link clienteservidortcp.Salida#getActuadores <em>Actuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuadores</em>'.
	 * @see clienteservidortcp.Salida#getActuadores()
	 * @see #getSalida()
	 * @generated
	 */
	EReference getSalida_Actuadores();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Interfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaz</em>'.
	 * @see clienteservidortcp.Interfaz
	 * @generated
	 */
	EClass getInterfaz();

	/**
	 * Returns the meta object for the containment reference list '{@link clienteservidortcp.Interfaz#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementos</em>'.
	 * @see clienteservidortcp.Interfaz#getElementos()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_Elementos();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.TCP <em>TCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP</em>'.
	 * @see clienteservidortcp.TCP
	 * @generated
	 */
	EClass getTCP();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.TCP#getPuerto <em>Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puerto</em>'.
	 * @see clienteservidortcp.TCP#getPuerto()
	 * @see #getTCP()
	 * @generated
	 */
	EAttribute getTCP_Puerto();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.TCP#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see clienteservidortcp.TCP#getIP()
	 * @see #getTCP()
	 * @generated
	 */
	EAttribute getTCP_IP();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.TCP#getDato <em>Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dato</em>'.
	 * @see clienteservidortcp.TCP#getDato()
	 * @see #getTCP()
	 * @generated
	 */
	EAttribute getTCP_Dato();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.COM <em>COM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COM</em>'.
	 * @see clienteservidortcp.COM
	 * @generated
	 */
	EClass getCOM();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.COM#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clienteservidortcp.COM#getNombre()
	 * @see #getCOM()
	 * @generated
	 */
	EAttribute getCOM_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.COM#getDato <em>Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dato</em>'.
	 * @see clienteservidortcp.COM#getDato()
	 * @see #getCOM()
	 * @generated
	 */
	EAttribute getCOM_Dato();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Elementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementos</em>'.
	 * @see clienteservidortcp.Elementos
	 * @generated
	 */
	EClass getElementos();

	/**
	 * Returns the meta object for the attribute '{@link clienteservidortcp.Elementos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clienteservidortcp.Elementos#getNombre()
	 * @see #getElementos()
	 * @generated
	 */
	EAttribute getElementos_Nombre();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Actuadores <em>Actuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuadores</em>'.
	 * @see clienteservidortcp.Actuadores
	 * @generated
	 */
	EClass getActuadores();

	/**
	 * Returns the meta object for class '{@link clienteservidortcp.Sensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensores</em>'.
	 * @see clienteservidortcp.Sensores
	 * @generated
	 */
	EClass getSensores();

	/**
	 * Returns the meta object for enum '{@link clienteservidortcp.TiposPines <em>Tipos Pines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipos Pines</em>'.
	 * @see clienteservidortcp.TiposPines
	 * @generated
	 */
	EEnum getTiposPines();

	/**
	 * Returns the meta object for enum '{@link clienteservidortcp.ClienteServidor <em>Cliente Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cliente Servidor</em>'.
	 * @see clienteservidortcp.ClienteServidor
	 * @generated
	 */
	EEnum getClienteServidor();

	/**
	 * Returns the meta object for enum '{@link clienteservidortcp.TipoPuerto <em>Tipo Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Puerto</em>'.
	 * @see clienteservidortcp.TipoPuerto
	 * @generated
	 */
	EEnum getTipoPuerto();

	/**
	 * Returns the meta object for enum '{@link clienteservidortcp.TipoPerifericos <em>Tipo Perifericos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Perifericos</em>'.
	 * @see clienteservidortcp.TipoPerifericos
	 * @generated
	 */
	EEnum getTipoPerifericos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClienteservidortcpFactory getClienteservidortcpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.ArquitecturaImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getArquitectura()
		 * @generated
		 */
		EClass ARQUITECTURA = eINSTANCE.getArquitectura();

		/**
		 * The meta object literal for the '<em><b>Computadora</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__COMPUTADORA = eINSTANCE.getArquitectura_Computadora();

		/**
		 * The meta object literal for the '<em><b>Tarjetadesarrollo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__TARJETADESARROLLO = eINSTANCE.getArquitectura_Tarjetadesarrollo();

		/**
		 * The meta object literal for the '<em><b>Perifericos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__PERIFERICOS = eINSTANCE.getArquitectura_Perifericos();

		/**
		 * The meta object literal for the '<em><b>Puertos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__PUERTOS = eINSTANCE.getArquitectura_Puertos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARQUITECTURA__NOMBRE = eINSTANCE.getArquitectura_Nombre();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.ComputadoraImpl <em>Computadora</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.ComputadoraImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getComputadora()
		 * @generated
		 */
		EClass COMPUTADORA = eINSTANCE.getComputadora();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTADORA__TIPO = eINSTANCE.getComputadora_Tipo();

		/**
		 * The meta object literal for the '<em><b>Interfaz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTADORA__INTERFAZ = eINSTANCE.getComputadora_Interfaz();

		/**
		 * The meta object literal for the '<em><b>Com</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTADORA__COM = eINSTANCE.getComputadora_Com();

		/**
		 * The meta object literal for the '<em><b>Tcp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTADORA__TCP = eINSTANCE.getComputadora_Tcp();

		/**
		 * The meta object literal for the '<em><b>Puertos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTADORA__PUERTOS = eINSTANCE.getComputadora_Puertos();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.TarjetaDesarrolloImpl <em>Tarjeta Desarrollo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.TarjetaDesarrolloImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTarjetaDesarrollo()
		 * @generated
		 */
		EClass TARJETA_DESARROLLO = eINSTANCE.getTarjetaDesarrollo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARJETA_DESARROLLO__NOMBRE = eINSTANCE.getTarjetaDesarrollo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Velocidad T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARJETA_DESARROLLO__VELOCIDAD_T = eINSTANCE.getTarjetaDesarrollo_VelocidadT();

		/**
		 * The meta object literal for the '<em><b>Pines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARJETA_DESARROLLO__PINES = eINSTANCE.getTarjetaDesarrollo_Pines();

		/**
		 * The meta object literal for the '<em><b>Puertos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARJETA_DESARROLLO__PUERTOS = eINSTANCE.getTarjetaDesarrollo_Puertos();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.PerifericosImpl <em>Perifericos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.PerifericosImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getPerifericos()
		 * @generated
		 */
		EClass PERIFERICOS = eINSTANCE.getPerifericos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIFERICOS__NOMBRE = eINSTANCE.getPerifericos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIFERICOS__TIPO = eINSTANCE.getPerifericos_Tipo();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.PuertosImpl <em>Puertos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.PuertosImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getPuertos()
		 * @generated
		 */
		EClass PUERTOS = eINSTANCE.getPuertos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUERTOS__NOMBRE = eINSTANCE.getPuertos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUERTOS__TIPO = eINSTANCE.getPuertos_Tipo();

		/**
		 * The meta object literal for the '<em><b>Puertos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUERTOS__PUERTOS = eINSTANCE.getPuertos_Puertos();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.PinesImpl <em>Pines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.PinesImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getPines()
		 * @generated
		 */
		EClass PINES = eINSTANCE.getPines();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINES__NUMERO = eINSTANCE.getPines_Numero();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINES__TIPO = eINSTANCE.getPines_Tipo();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.EntradaImpl <em>Entrada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.EntradaImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getEntrada()
		 * @generated
		 */
		EClass ENTRADA = eINSTANCE.getEntrada();

		/**
		 * The meta object literal for the '<em><b>Sensores</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA__SENSORES = eINSTANCE.getEntrada_Sensores();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.SalidaImpl <em>Salida</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.SalidaImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getSalida()
		 * @generated
		 */
		EClass SALIDA = eINSTANCE.getSalida();

		/**
		 * The meta object literal for the '<em><b>Actuadores</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA__ACTUADORES = eINSTANCE.getSalida_Actuadores();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.InterfazImpl <em>Interfaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.InterfazImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getInterfaz()
		 * @generated
		 */
		EClass INTERFAZ = eINSTANCE.getInterfaz();

		/**
		 * The meta object literal for the '<em><b>Elementos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__ELEMENTOS = eINSTANCE.getInterfaz_Elementos();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.TCPImpl <em>TCP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.TCPImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTCP()
		 * @generated
		 */
		EClass TCP = eINSTANCE.getTCP();

		/**
		 * The meta object literal for the '<em><b>Puerto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP__PUERTO = eINSTANCE.getTCP_Puerto();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP__IP = eINSTANCE.getTCP_IP();

		/**
		 * The meta object literal for the '<em><b>Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP__DATO = eINSTANCE.getTCP_Dato();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.COMImpl <em>COM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.COMImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getCOM()
		 * @generated
		 */
		EClass COM = eINSTANCE.getCOM();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM__NOMBRE = eINSTANCE.getCOM_Nombre();

		/**
		 * The meta object literal for the '<em><b>Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM__DATO = eINSTANCE.getCOM_Dato();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.ElementosImpl <em>Elementos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.ElementosImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getElementos()
		 * @generated
		 */
		EClass ELEMENTOS = eINSTANCE.getElementos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTOS__NOMBRE = eINSTANCE.getElementos_Nombre();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.ActuadoresImpl <em>Actuadores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.ActuadoresImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getActuadores()
		 * @generated
		 */
		EClass ACTUADORES = eINSTANCE.getActuadores();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.impl.SensoresImpl <em>Sensores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.impl.SensoresImpl
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getSensores()
		 * @generated
		 */
		EClass SENSORES = eINSTANCE.getSensores();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.TiposPines <em>Tipos Pines</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.TiposPines
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTiposPines()
		 * @generated
		 */
		EEnum TIPOS_PINES = eINSTANCE.getTiposPines();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.ClienteServidor <em>Cliente Servidor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.ClienteServidor
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getClienteServidor()
		 * @generated
		 */
		EEnum CLIENTE_SERVIDOR = eINSTANCE.getClienteServidor();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.TipoPuerto <em>Tipo Puerto</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.TipoPuerto
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTipoPuerto()
		 * @generated
		 */
		EEnum TIPO_PUERTO = eINSTANCE.getTipoPuerto();

		/**
		 * The meta object literal for the '{@link clienteservidortcp.TipoPerifericos <em>Tipo Perifericos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clienteservidortcp.TipoPerifericos
		 * @see clienteservidortcp.impl.ClienteservidortcpPackageImpl#getTipoPerifericos()
		 * @generated
		 */
		EEnum TIPO_PERIFERICOS = eINSTANCE.getTipoPerifericos();

	}

} //ClienteservidortcpPackage
