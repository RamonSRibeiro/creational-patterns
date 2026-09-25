package unificarPadroes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FactoryMethodTest {

    @Test
    public void getInstanciaDeveSempreRetornarOMesmoObjeto() {
        FactoryMethod primeira = FactoryMethod.getInstancia();
        FactoryMethod segunda = FactoryMethod.getInstancia();

        assertSame(primeira, segunda);
    }

    @Test
    public void criarFabricaComFabricaGraduacaoDeveRetornarFabricaGraduacao() {
        FabricaAbstrata fabrica = FactoryMethod.getInstancia().criarFabrica("FabricaGraduacao");

        assertTrue(fabrica instanceof FabricaGraduacao);
    }

    @Test
    public void criarFabricaComFabricaPosGraduacaoDeveRetornarFabricaPosGraduacao() {
        FabricaAbstrata fabrica = FactoryMethod.getInstancia().criarFabrica("FabricaPosGraduacao");

        assertTrue(fabrica instanceof FabricaPosGraduacao);
    }

    @Test
    public void criarFabricaComNomeInvalidoDeveLancarExcecao() {
        try {
            FactoryMethod.getInstancia().criarFabrica("ClasseQueNaoExiste");
            fail("Era esperado um RuntimeException para uma classe inexistente.");
        } catch (RuntimeException e) {
            // comportamento esperado
        }
    }
}
