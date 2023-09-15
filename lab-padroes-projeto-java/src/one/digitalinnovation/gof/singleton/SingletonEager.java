package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Apressado".
 * 
 * @author Cbih936
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	
	// método para expor a singleton de maneira pública 
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
