package unificarPadroes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FabricaPosGraduacaoTest {

    private final FabricaAbstrata fabrica = new FabricaPosGraduacao();

    @Test
    public void criarHistoricoDeveRetornarHistoricoPosGraduacao() {
        Historico historico = fabrica.criarHistorico();

        assertTrue(historico instanceof HistoricoPosGraduacao);
    }

    @Test
    public void criarDiplomaDeveRetornarDiplomaPosGraduacao() {
        Diploma diploma = fabrica.criarDiploma();

        assertTrue(diploma instanceof DiplomaPosGraduacao);
    }

    @Test
    public void fabricaDeveSerUmaFabricaAbstrata() {
        assertTrue(fabrica instanceof FabricaAbstrata);
    }
}
