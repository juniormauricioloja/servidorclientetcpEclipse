/**
 */
package clienteservidortcp.util;

import clienteservidortcp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see clienteservidortcp.ClienteservidortcpPackage
 * @generated
 */
public class ClienteservidortcpSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClienteservidortcpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteservidortcpSwitch() {
		if (modelPackage == null) {
			modelPackage = ClienteservidortcpPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ClienteservidortcpPackage.ARQUITECTURA: {
			Arquitectura arquitectura = (Arquitectura) theEObject;
			T result = caseArquitectura(arquitectura);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.COMPUTADORA: {
			Computadora computadora = (Computadora) theEObject;
			T result = caseComputadora(computadora);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.TARJETA_DESARROLLO: {
			TarjetaDesarrollo tarjetaDesarrollo = (TarjetaDesarrollo) theEObject;
			T result = caseTarjetaDesarrollo(tarjetaDesarrollo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.PERIFERICOS: {
			Perifericos perifericos = (Perifericos) theEObject;
			T result = casePerifericos(perifericos);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.PUERTOS: {
			Puertos puertos = (Puertos) theEObject;
			T result = casePuertos(puertos);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.PINES: {
			Pines pines = (Pines) theEObject;
			T result = casePines(pines);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.ENTRADA: {
			Entrada entrada = (Entrada) theEObject;
			T result = caseEntrada(entrada);
			if (result == null)
				result = casePines(entrada);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.SALIDA: {
			Salida salida = (Salida) theEObject;
			T result = caseSalida(salida);
			if (result == null)
				result = casePines(salida);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.INTERFAZ: {
			Interfaz interfaz = (Interfaz) theEObject;
			T result = caseInterfaz(interfaz);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.TCP: {
			TCP tcp = (TCP) theEObject;
			T result = caseTCP(tcp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.COM: {
			COM com = (COM) theEObject;
			T result = caseCOM(com);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.ELEMENTOS: {
			Elementos elementos = (Elementos) theEObject;
			T result = caseElementos(elementos);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.ACTUADORES: {
			Actuadores actuadores = (Actuadores) theEObject;
			T result = caseActuadores(actuadores);
			if (result == null)
				result = casePerifericos(actuadores);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ClienteservidortcpPackage.SENSORES: {
			Sensores sensores = (Sensores) theEObject;
			T result = caseSensores(sensores);
			if (result == null)
				result = casePerifericos(sensores);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arquitectura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arquitectura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArquitectura(Arquitectura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computadora</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computadora</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputadora(Computadora object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarjeta Desarrollo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarjeta Desarrollo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarjetaDesarrollo(TarjetaDesarrollo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perifericos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perifericos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerifericos(Perifericos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Puertos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Puertos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuertos(Puertos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePines(Pines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entrada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entrada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntrada(Entrada object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalida(Salida object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaz(Interfaz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCP(TCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOM(COM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementos(Elementos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuadores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuadores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuadores(Actuadores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensores(Sensores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClienteservidortcpSwitch
