package unificarPadroes;

public class FabricaGraduacao implements FabricaAbstrata {

    @Override
    public Historico criarHistorico() {
        return new HistoricoGraduacao();
    }

    @Override
    public Diploma criarDiploma() {
        return new DiplomaGraduacao();
    }
}
