package unificarPadroes;

public class FabricaPosGraduacao implements FabricaAbstrata {

    @Override
    public Historico criarHistorico() {
        return new HistoricoPosGraduacao();
    }

    @Override
    public Diploma criarDiploma() {
        return new DiplomaPosGraduacao();
    }
}
