package unificarPadroes;

public class FactoryMethod {

    private static FactoryMethod instancia;

    // Construtor privado: ninguém de fora cria FactoryMethod diretamente.
    private FactoryMethod() {
    }

    public static synchronized FactoryMethod getInstancia() {
        if (instancia == null) {
            instancia = new FactoryMethod();
        }
        return instancia;
    }

    public FabricaAbstrata criarFabrica(String nomeClasse) {
        try {
            // Obtém o pacote onde FactoryMethod está.
            String pacote = FactoryMethod.class.getPackageName();

            // Monta o nome completo da classe.
            String nomeCompleto = pacote + "." + nomeClasse;

            Class<?> classe = Class.forName(nomeCompleto);

            Object instanciaFabrica = classe.getDeclaredConstructor().newInstance();

            return (FabricaAbstrata) instanciaFabrica;

        } catch (Exception e) {
            throw new RuntimeException(
                    "Não foi possível criar a fábrica: " + nomeClasse,
                    e
            );
        }
    }
}