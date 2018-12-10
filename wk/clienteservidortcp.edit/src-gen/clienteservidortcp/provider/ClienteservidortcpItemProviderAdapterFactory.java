/**
 */
package clienteservidortcp.provider;

import clienteservidortcp.util.ClienteservidortcpAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClienteservidortcpItemProviderAdapterFactory extends ClienteservidortcpAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteservidortcpItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Arquitectura} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArquitecturaItemProvider arquitecturaItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Arquitectura}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArquitecturaAdapter() {
		if (arquitecturaItemProvider == null) {
			arquitecturaItemProvider = new ArquitecturaItemProvider(this);
		}

		return arquitecturaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Computadora} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputadoraItemProvider computadoraItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Computadora}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputadoraAdapter() {
		if (computadoraItemProvider == null) {
			computadoraItemProvider = new ComputadoraItemProvider(this);
		}

		return computadoraItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.TarjetaDesarrollo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TarjetaDesarrolloItemProvider tarjetaDesarrolloItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.TarjetaDesarrollo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTarjetaDesarrolloAdapter() {
		if (tarjetaDesarrolloItemProvider == null) {
			tarjetaDesarrolloItemProvider = new TarjetaDesarrolloItemProvider(this);
		}

		return tarjetaDesarrolloItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Puertos} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuertosItemProvider puertosItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Puertos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPuertosAdapter() {
		if (puertosItemProvider == null) {
			puertosItemProvider = new PuertosItemProvider(this);
		}

		return puertosItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Entrada} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntradaItemProvider entradaItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Entrada}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntradaAdapter() {
		if (entradaItemProvider == null) {
			entradaItemProvider = new EntradaItemProvider(this);
		}

		return entradaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Salida} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalidaItemProvider salidaItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Salida}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSalidaAdapter() {
		if (salidaItemProvider == null) {
			salidaItemProvider = new SalidaItemProvider(this);
		}

		return salidaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Interfaz} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfazItemProvider interfazItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Interfaz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfazAdapter() {
		if (interfazItemProvider == null) {
			interfazItemProvider = new InterfazItemProvider(this);
		}

		return interfazItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.TCP} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPItemProvider tcpItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.TCP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCPAdapter() {
		if (tcpItemProvider == null) {
			tcpItemProvider = new TCPItemProvider(this);
		}

		return tcpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.COM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COMItemProvider comItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.COM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCOMAdapter() {
		if (comItemProvider == null) {
			comItemProvider = new COMItemProvider(this);
		}

		return comItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Elementos} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementosItemProvider elementosItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Elementos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementosAdapter() {
		if (elementosItemProvider == null) {
			elementosItemProvider = new ElementosItemProvider(this);
		}

		return elementosItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Actuadores} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuadoresItemProvider actuadoresItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Actuadores}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActuadoresAdapter() {
		if (actuadoresItemProvider == null) {
			actuadoresItemProvider = new ActuadoresItemProvider(this);
		}

		return actuadoresItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link clienteservidortcp.Sensores} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensoresItemProvider sensoresItemProvider;

	/**
	 * This creates an adapter for a {@link clienteservidortcp.Sensores}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensoresAdapter() {
		if (sensoresItemProvider == null) {
			sensoresItemProvider = new SensoresItemProvider(this);
		}

		return sensoresItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (arquitecturaItemProvider != null)
			arquitecturaItemProvider.dispose();
		if (computadoraItemProvider != null)
			computadoraItemProvider.dispose();
		if (tarjetaDesarrolloItemProvider != null)
			tarjetaDesarrolloItemProvider.dispose();
		if (puertosItemProvider != null)
			puertosItemProvider.dispose();
		if (entradaItemProvider != null)
			entradaItemProvider.dispose();
		if (salidaItemProvider != null)
			salidaItemProvider.dispose();
		if (interfazItemProvider != null)
			interfazItemProvider.dispose();
		if (tcpItemProvider != null)
			tcpItemProvider.dispose();
		if (comItemProvider != null)
			comItemProvider.dispose();
		if (elementosItemProvider != null)
			elementosItemProvider.dispose();
		if (actuadoresItemProvider != null)
			actuadoresItemProvider.dispose();
		if (sensoresItemProvider != null)
			sensoresItemProvider.dispose();
	}

}
