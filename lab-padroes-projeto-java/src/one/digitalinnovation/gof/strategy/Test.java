package one.digitalinnovation.gof.strategy;


import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonEventManager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
	
	
	public static void main(String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Cbih", "14111240");
		
		// SingletonEventManager
        SingletonEventManager eventManager = SingletonEventManager.getInstance();

        // Adicione alguns eventos
        eventManager.addEvent("Evento 1");
        eventManager.addEvent("Evento 2");
        eventManager.addEvent("Evento 3");

        // Processar e imprimir os eventos
        eventManager.processEvents();
	}

}
