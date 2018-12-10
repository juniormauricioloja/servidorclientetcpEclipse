/**
 */
package clienteservidortcp.util;

import clienteservidortcp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpPackage
 * @generated
 */
public class ClienteservidortcpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClienteservidortcpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteservidortcpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClienteservidortcpPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteservidortcpSwitch<Adapter> modelSwitch = new ClienteservidortcpSwitch<Adapter>() {
		@Override
		public Adapter caseArquitectura(Arquitectura object) {
			return createArquitecturaAdapter();
		}

		@Override
		public Adapter caseComputadora(Computadora object) {
			return createComputadoraAdapter();
		}

		@Override
		public Adapter caseTarjetaDesarrollo(TarjetaDesarrollo object) {
			return createTarjetaDesarrolloAdapter();
		}

		@Override
		public Adapter casePerifericos(Perifericos object) {
			return createPerifericosAdapter();
		}

		@Override
		public Adapter casePuertos(Puertos object) {
			return createPuertosAdapter();
		}

		@Override
		public Adapter casePines(Pines object) {
			return createPinesAdapter();
		}

		@Override
		public Adapter caseEntrada(Entrada object) {
			return createEntradaAdapter();
		}

		@Override
		public Adapter caseSalida(Salida object) {
			return createSalidaAdapter();
		}

		@Override
		public Adapter caseInterfaz(Interfaz object) {
			return createInterfazAdapter();
		}

		@Override
		public Adapter caseTCP(TCP object) {
			return createTCPAdapter();
		}

		@Override
		public Adapter caseCOM(COM object) {
			return createCOMAdapter();
		}

		@Override
		public Adapter caseElementos(Elementos object) {
			return createElementosAdapter();
		}

		@Override
		public Adapter caseActuadores(Actuadores object) {
			return createActuadoresAdapter();
		}

		@Override
		public Adapter caseSensores(Sensores object) {
			return createSensoresAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Arquitectura
	 * @generated
	 */
	public Adapter createArquitecturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Computadora <em>Computadora</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Computadora
	 * @generated
	 */
	public Adapter createComputadoraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.TarjetaDesarrollo <em>Tarjeta Desarrollo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.TarjetaDesarrollo
	 * @generated
	 */
	public Adapter createTarjetaDesarrolloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Perifericos <em>Perifericos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Perifericos
	 * @generated
	 */
	public Adapter createPerifericosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Puertos <em>Puertos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Puertos
	 * @generated
	 */
	public Adapter createPuertosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Pines <em>Pines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Pines
	 * @generated
	 */
	public Adapter createPinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Entrada <em>Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Entrada
	 * @generated
	 */
	public Adapter createEntradaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Salida
	 * @generated
	 */
	public Adapter createSalidaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Interfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Interfaz
	 * @generated
	 */
	public Adapter createInterfazAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.TCP <em>TCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.TCP
	 * @generated
	 */
	public Adapter createTCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.COM <em>COM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.COM
	 * @generated
	 */
	public Adapter createCOMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Elementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Elementos
	 * @generated
	 */
	public Adapter createElementosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Actuadores <em>Actuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Actuadores
	 * @generated
	 */
	public Adapter createActuadoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clienteservidortcp.Sensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clienteservidortcp.Sensores
	 * @generated
	 */
	public Adapter createSensoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClienteservidortcpAdapterFactory
