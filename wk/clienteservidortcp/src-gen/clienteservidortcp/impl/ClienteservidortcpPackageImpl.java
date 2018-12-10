/**
 */
package clienteservidortcp.impl;

import clienteservidortcp.Actuadores;
import clienteservidortcp.Arquitectura;
import clienteservidortcp.ClienteServidor;
import clienteservidortcp.ClienteservidortcpFactory;
import clienteservidortcp.ClienteservidortcpPackage;
import clienteservidortcp.Computadora;
import clienteservidortcp.Elementos;
import clienteservidortcp.Entrada;
import clienteservidortcp.Interfaz;
import clienteservidortcp.Perifericos;
import clienteservidortcp.Pines;
import clienteservidortcp.Puertos;
import clienteservidortcp.Salida;
import clienteservidortcp.Sensores;
import clienteservidortcp.TarjetaDesarrollo;
import clienteservidortcp.TipoPerifericos;
import clienteservidortcp.TipoPuerto;
import clienteservidortcp.TiposPines;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClienteservidortcpPackageImpl extends EPackageImpl implements ClienteservidortcpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arquitecturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computadoraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tarjetaDesarrolloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perifericosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puertosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfazEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuadoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tiposPinesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clienteServidorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPuertoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPerifericosEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see clienteservidortcp.ClienteservidortcpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClienteservidortcpPackageImpl() {
		super(eNS_URI, ClienteservidortcpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClienteservidortcpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClienteservidortcpPackage init() {
		if (isInited)
			return (ClienteservidortcpPackage) EPackage.Registry.INSTANCE
					.getEPackage(ClienteservidortcpPackage.eNS_URI);

		// Obtain or create and register package
		ClienteservidortcpPackageImpl theClienteservidortcpPackage = (ClienteservidortcpPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ClienteservidortcpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ClienteservidortcpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theClienteservidortcpPackage.createPackageContents();

		// Initialize created meta-data
		theClienteservidortcpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClienteservidortcpPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClienteservidortcpPackage.eNS_URI, theClienteservidortcpPackage);
		return theClienteservidortcpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArquitectura() {
		return arquitecturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArquitectura_Computadora() {
		return (EReference) arquitecturaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArquitectura_Tarjetadesarrollo() {
		return (EReference) arquitecturaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArquitectura_Perifericos() {
		return (EReference) arquitecturaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArquitectura_Puertos() {
		return (EReference) arquitecturaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArquitectura_Nombre() {
		return (EAttribute) arquitecturaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputadora() {
		return computadoraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputadora_Tipo() {
		return (EAttribute) computadoraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputadora_Interfaz() {
		return (EReference) computadoraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputadora_Com() {
		return (EReference) computadoraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputadora_Tcp() {
		return (EReference) computadoraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputadora_Puertos() {
		return (EReference) computadoraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarjetaDesarrollo() {
		return tarjetaDesarrolloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarjetaDesarrollo_Nombre() {
		return (EAttribute) tarjetaDesarrolloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarjetaDesarrollo_VelocidadT() {
		return (EAttribute) tarjetaDesarrolloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarjetaDesarrollo_Pines() {
		return (EReference) tarjetaDesarrolloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarjetaDesarrollo_Puertos() {
		return (EReference) tarjetaDesarrolloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerifericos() {
		return perifericosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerifericos_Nombre() {
		return (EAttribute) perifericosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerifericos_Tipo() {
		return (EAttribute) perifericosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuertos() {
		return puertosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuertos_Nombre() {
		return (EAttribute) puertosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuertos_Tipo() {
		return (EAttribute) puertosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuertos_Puertos() {
		return (EReference) puertosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPines() {
		return pinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPines_Numero() {
		return (EAttribute) pinesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPines_Tipo() {
		return (EAttribute) pinesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntrada() {
		return entradaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntrada_Sensores() {
		return (EReference) entradaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalida() {
		return salidaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalida_Actuadores() {
		return (EReference) salidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaz() {
		return interfazEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_Elementos() {
		return (EReference) interfazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCP() {
		return tcpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCP_Puerto() {
		return (EAttribute) tcpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCP_IP() {
		return (EAttribute) tcpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCP_Dato() {
		return (EAttribute) tcpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOM() {
		return comEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOM_Nombre() {
		return (EAttribute) comEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOM_Dato() {
		return (EAttribute) comEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementos() {
		return elementosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementos_Nombre() {
		return (EAttribute) elementosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuadores() {
		return actuadoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensores() {
		return sensoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTiposPines() {
		return tiposPinesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClienteServidor() {
		return clienteServidorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPuerto() {
		return tipoPuertoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPerifericos() {
		return tipoPerifericosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteservidortcpFactory getClienteservidortcpFactory() {
		return (ClienteservidortcpFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		arquitecturaEClass = createEClass(ARQUITECTURA);
		createEReference(arquitecturaEClass, ARQUITECTURA__COMPUTADORA);
		createEReference(arquitecturaEClass, ARQUITECTURA__TARJETADESARROLLO);
		createEReference(arquitecturaEClass, ARQUITECTURA__PERIFERICOS);
		createEReference(arquitecturaEClass, ARQUITECTURA__PUERTOS);
		createEAttribute(arquitecturaEClass, ARQUITECTURA__NOMBRE);

		computadoraEClass = createEClass(COMPUTADORA);
		createEAttribute(computadoraEClass, COMPUTADORA__TIPO);
		createEReference(computadoraEClass, COMPUTADORA__INTERFAZ);
		createEReference(computadoraEClass, COMPUTADORA__COM);
		createEReference(computadoraEClass, COMPUTADORA__TCP);
		createEReference(computadoraEClass, COMPUTADORA__PUERTOS);

		tarjetaDesarrolloEClass = createEClass(TARJETA_DESARROLLO);
		createEAttribute(tarjetaDesarrolloEClass, TARJETA_DESARROLLO__NOMBRE);
		createEAttribute(tarjetaDesarrolloEClass, TARJETA_DESARROLLO__VELOCIDAD_T);
		createEReference(tarjetaDesarrolloEClass, TARJETA_DESARROLLO__PINES);
		createEReference(tarjetaDesarrolloEClass, TARJETA_DESARROLLO__PUERTOS);

		perifericosEClass = createEClass(PERIFERICOS);
		createEAttribute(perifericosEClass, PERIFERICOS__NOMBRE);
		createEAttribute(perifericosEClass, PERIFERICOS__TIPO);

		puertosEClass = createEClass(PUERTOS);
		createEAttribute(puertosEClass, PUERTOS__NOMBRE);
		createEAttribute(puertosEClass, PUERTOS__TIPO);
		createEReference(puertosEClass, PUERTOS__PUERTOS);

		pinesEClass = createEClass(PINES);
		createEAttribute(pinesEClass, PINES__NUMERO);
		createEAttribute(pinesEClass, PINES__TIPO);

		entradaEClass = createEClass(ENTRADA);
		createEReference(entradaEClass, ENTRADA__SENSORES);

		salidaEClass = createEClass(SALIDA);
		createEReference(salidaEClass, SALIDA__ACTUADORES);

		interfazEClass = createEClass(INTERFAZ);
		createEReference(interfazEClass, INTERFAZ__ELEMENTOS);

		tcpEClass = createEClass(TCP);
		createEAttribute(tcpEClass, TCP__PUERTO);
		createEAttribute(tcpEClass, TCP__IP);
		createEAttribute(tcpEClass, TCP__DATO);

		comEClass = createEClass(COM);
		createEAttribute(comEClass, COM__NOMBRE);
		createEAttribute(comEClass, COM__DATO);

		elementosEClass = createEClass(ELEMENTOS);
		createEAttribute(elementosEClass, ELEMENTOS__NOMBRE);

		actuadoresEClass = createEClass(ACTUADORES);

		sensoresEClass = createEClass(SENSORES);

		// Create enums
		tiposPinesEEnum = createEEnum(TIPOS_PINES);
		clienteServidorEEnum = createEEnum(CLIENTE_SERVIDOR);
		tipoPuertoEEnum = createEEnum(TIPO_PUERTO);
		tipoPerifericosEEnum = createEEnum(TIPO_PERIFERICOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entradaEClass.getESuperTypes().add(this.getPines());
		salidaEClass.getESuperTypes().add(this.getPines());
		actuadoresEClass.getESuperTypes().add(this.getPerifericos());
		sensoresEClass.getESuperTypes().add(this.getPerifericos());

		// Initialize classes, features, and operations; add parameters
		initEClass(arquitecturaEClass, Arquitectura.class, "Arquitectura", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArquitectura_Computadora(), this.getComputadora(), null, "computadora", null, 0, -1,
				Arquitectura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArquitectura_Tarjetadesarrollo(), this.getTarjetaDesarrollo(), null, "tarjetadesarrollo",
				null, 0, -1, Arquitectura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArquitectura_Perifericos(), this.getPerifericos(), null, "perifericos", null, 0, -1,
				Arquitectura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArquitectura_Puertos(), this.getPuertos(), null, "puertos", null, 0, -1, Arquitectura.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArquitectura_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Arquitectura.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computadoraEClass, Computadora.class, "Computadora", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputadora_Tipo(), this.getClienteServidor(), "Tipo", null, 0, 1, Computadora.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputadora_Interfaz(), this.getInterfaz(), null, "interfaz", null, 0, -1, Computadora.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputadora_Com(), this.getCOM(), null, "com", null, 0, -1, Computadora.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getComputadora_Tcp(), this.getTCP(), null, "tcp", null, 0, -1, Computadora.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getComputadora_Puertos(), this.getPuertos(), null, "puertos", null, 0, -1, Computadora.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tarjetaDesarrolloEClass, TarjetaDesarrollo.class, "TarjetaDesarrollo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarjetaDesarrollo_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1,
				TarjetaDesarrollo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarjetaDesarrollo_VelocidadT(), ecorePackage.getEInt(), "VelocidadT", null, 0, 1,
				TarjetaDesarrollo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTarjetaDesarrollo_Pines(), this.getPines(), null, "pines", null, 0, -1,
				TarjetaDesarrollo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarjetaDesarrollo_Puertos(), this.getPuertos(), null, "puertos", null, 0, -1,
				TarjetaDesarrollo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perifericosEClass, Perifericos.class, "Perifericos", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerifericos_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Perifericos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerifericos_Tipo(), this.getTipoPerifericos(), "Tipo", null, 0, 1, Perifericos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puertosEClass, Puertos.class, "Puertos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuertos_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Puertos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuertos_Tipo(), this.getTipoPuerto(), "Tipo", null, 0, 1, Puertos.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuertos_Puertos(), this.getPuertos(), null, "puertos", null, 0, 1, Puertos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinesEClass, Pines.class, "Pines", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPines_Numero(), ecorePackage.getEInt(), "Numero", null, 0, 1, Pines.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPines_Tipo(), this.getTiposPines(), "Tipo", null, 0, 1, Pines.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entradaEClass, Entrada.class, "Entrada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntrada_Sensores(), this.getSensores(), null, "sensores", null, 0, 1, Entrada.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salidaEClass, Salida.class, "Salida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalida_Actuadores(), this.getActuadores(), null, "actuadores", null, 0, 1, Salida.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfazEClass, Interfaz.class, "Interfaz", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaz_Elementos(), this.getElementos(), null, "elementos", null, 0, -1, Interfaz.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcpEClass, clienteservidortcp.TCP.class, "TCP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCP_Puerto(), ecorePackage.getEInt(), "Puerto", null, 0, 1, clienteservidortcp.TCP.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCP_IP(), ecorePackage.getEString(), "IP", null, 0, 1, clienteservidortcp.TCP.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCP_Dato(), ecorePackage.getEString(), "Dato", null, 0, 1, clienteservidortcp.TCP.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comEClass, clienteservidortcp.COM.class, "COM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOM_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, clienteservidortcp.COM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCOM_Dato(), ecorePackage.getEString(), "Dato", null, 0, 1, clienteservidortcp.COM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementosEClass, Elementos.class, "Elementos", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementos_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Elementos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuadoresEClass, Actuadores.class, "Actuadores", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensoresEClass, Sensores.class, "Sensores", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tiposPinesEEnum, TiposPines.class, "TiposPines");
		addEEnumLiteral(tiposPinesEEnum, TiposPines.ANALOGICO);
		addEEnumLiteral(tiposPinesEEnum, TiposPines.DIGITAL);

		initEEnum(clienteServidorEEnum, ClienteServidor.class, "ClienteServidor");
		addEEnumLiteral(clienteServidorEEnum, ClienteServidor.CLIENTE);
		addEEnumLiteral(clienteServidorEEnum, ClienteServidor.SERVIDOR);

		initEEnum(tipoPuertoEEnum, TipoPuerto.class, "TipoPuerto");
		addEEnumLiteral(tipoPuertoEEnum, TipoPuerto.SERIAL);
		addEEnumLiteral(tipoPuertoEEnum, TipoPuerto.ETHERNET);

		initEEnum(tipoPerifericosEEnum, TipoPerifericos.class, "TipoPerifericos");
		addEEnumLiteral(tipoPerifericosEEnum, TipoPerifericos.ANALOGICO);
		addEEnumLiteral(tipoPerifericosEEnum, TipoPerifericos.DIGITAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ClienteservidortcpPackageImpl
