package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see https://stackoverflow.com/a/24018148    -    Ref. Lazy Holder
 * 
 * @author Cbih936
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	
	// método para expor a singleton de maneira pública 
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
