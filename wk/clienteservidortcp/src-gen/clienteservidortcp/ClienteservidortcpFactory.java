/**
 */
package clienteservidortcp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpPackage
 * @generated
 */
public interface ClienteservidortcpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClienteservidortcpFactory eINSTANCE = clienteservidortcp.impl.ClienteservidortcpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arquitectura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arquitectura</em>'.
	 * @generated
	 */
	Arquitectura createArquitectura();

	/**
	 * Returns a new object of class '<em>Computadora</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computadora</em>'.
	 * @generated
	 */
	Computadora createComputadora();

	/**
	 * Returns a new object of class '<em>Tarjeta Desarrollo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarjeta Desarrollo</em>'.
	 * @generated
	 */
	TarjetaDesarrollo createTarjetaDesarrollo();

	/**
	 * Returns a new object of class '<em>Puertos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puertos</em>'.
	 * @generated
	 */
	Puertos createPuertos();

	/**
	 * Returns a new object of class '<em>Entrada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada</em>'.
	 * @generated
	 */
	Entrada createEntrada();

	/**
	 * Returns a new object of class '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida</em>'.
	 * @generated
	 */
	Salida createSalida();

	/**
	 * Returns a new object of class '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaz</em>'.
	 * @generated
	 */
	Interfaz createInterfaz();

	/**
	 * Returns a new object of class '<em>TCP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCP</em>'.
	 * @generated
	 */
	TCP createTCP();

	/**
	 * Returns a new object of class '<em>COM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COM</em>'.
	 * @generated
	 */
	COM createCOM();

	/**
	 * Returns a new object of class '<em>Elementos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementos</em>'.
	 * @generated
	 */
	Elementos createElementos();

	/**
	 * Returns a new object of class '<em>Actuadores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuadores</em>'.
	 * @generated
	 */
	Actuadores createActuadores();

	/**
	 * Returns a new object of class '<em>Sensores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensores</em>'.
	 * @generated
	 */
	Sensores createSensores();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClienteservidortcpPackage getClienteservidortcpPackage();

} //ClienteservidortcpFactory
