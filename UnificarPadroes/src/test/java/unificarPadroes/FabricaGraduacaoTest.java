package unificarPadroes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FabricaGraduacaoTest {

    private final FabricaAbstrata fabrica = new FabricaGraduacao();

    @Test
    public void criarHistoricoDeveRetornarHistoricoGraduacao() {
        Historico historico = fabrica.criarHistorico();

        assertTrue(historico instanceof HistoricoGraduacao);
    }

    @Test
    public void criarDiplomaDeveRetornarDiplomaGraduacao() {
        Diploma diploma = fabrica.criarDiploma();

        assertTrue(diploma instanceof DiplomaGraduacao);
    }

    @Test
    public void fabricaDeveSerUmaFabricaAbstrata() {
        assertTrue(fabrica instanceof FabricaAbstrata);
    }
}
