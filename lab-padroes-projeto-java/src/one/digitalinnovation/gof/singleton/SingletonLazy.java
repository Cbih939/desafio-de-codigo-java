package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Preguiçoso"
 * 
 * @author Cbih936
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	
	// método para expor a singleton de maneira pública 
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
