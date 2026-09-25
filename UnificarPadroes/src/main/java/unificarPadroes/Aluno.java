package unificarPadroes;

public class Aluno {

    private final String nome;
    private final Historico historico;
    private final Diploma diploma;

    public Aluno(String nome, String tipoFabrica) {
        this.nome = nome;

        FabricaAbstrata fabrica = FactoryMethod.getInstancia().criarFabrica(tipoFabrica);
        this.historico = fabrica.criarHistorico();
        this.diploma = fabrica.criarDiploma();
    }

    public void emitirDocumentos() {
        System.out.println("Aluno: " + nome);
        historico.emitir();
        diploma.emitir();
    }
}
