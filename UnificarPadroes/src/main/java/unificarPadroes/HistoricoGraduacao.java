package unificarPadroes;

public class HistoricoGraduacao implements Historico {

    @Override
    public void emitir() {
        System.out.println("Histórico de Graduação emitido.");
    }
}
