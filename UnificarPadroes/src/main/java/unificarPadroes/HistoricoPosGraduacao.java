package unificarPadroes;

public class HistoricoPosGraduacao implements Historico {

    @Override
    public void emitir() {
        System.out.println("Histórico de Pós-Graduação emitido.");
    }
}
