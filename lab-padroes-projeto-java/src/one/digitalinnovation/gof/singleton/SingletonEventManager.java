package one.digitalinnovation.gof.singleton;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SingletonEventManager implements Serializable {
	
	private static final long serialVersionUID = 1L;

    // Variável estática para armazenar a única instância da classe
    private static volatile SingletonEventManager instance;
    
    //recursos e configurações
    private String databaseConnectionUrl;
    private int maxConnections;
    
    // Lista para armazenar eventos
    private List<String> events = new ArrayList<>();

    // Construtor privado para impedir a criação de instâncias diretas
    private SingletonEventManager() {
        if (instance != null) {
            throw new IllegalStateException("Já existe uma instância de EventManager. Use getInstance() para obtê-la.");
        }
        // Inicializar recursos e configurações
        databaseConnectionUrl = "jdbc:mysql://localhost/mydb";
        maxConnections = 10;
    }

    // Método estático para obter a única instância da classe
    public static SingletonEventManager getInstance() {
        if (instance == null) {
            synchronized (SingletonEventManager.class) {
                if (instance == null) {
                    instance = new SingletonEventManager();
                }
            }
        }
        return instance;
    }

    // Outros métodos para adicionar, remover ou processar eventos
    public void addEvent(String event) {
    	events.add(event);
    }

    // Método para processar os eventos
    public void processEvents() {
        System.out.println("Processando eventos:");
        for (String event : events) {
            System.out.println(event);
        }
        events.clear(); // Limpar a lista de eventos após o processamento
    }

    // Evitar a criação de novas instâncias durante a desserialização
    protected Object readResolve() {
        return getInstance();
    }
    
    // Método para acessar configurações
    public String getDatabaseConnectionUrl() {
        return databaseConnectionUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }
	

}
