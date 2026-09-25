package unificarPadroes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class DiplomaPosGraduacaoTest {

    private final ByteArrayOutputStream saida = new ByteArrayOutputStream();
    private final PrintStream saidaOriginal = System.out;

    @Before
    public void redirecionarSaida() {
        System.setOut(new PrintStream(saida));
    }

    @After
    public void restaurarSaida() {
        System.setOut(saidaOriginal);
    }

    @Test
    public void emitirDeveImprimirMensagemDePosGraduacao() {
        Diploma diploma = new DiplomaPosGraduacao();

        diploma.emitir();

        assertTrue(saida.toString().contains("Diploma de Pós-Graduação"));
    }
}
