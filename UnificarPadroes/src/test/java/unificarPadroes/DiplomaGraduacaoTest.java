package unificarPadroes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class DiplomaGraduacaoTest {

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
    public void emitirDeveImprimirMensagemDeGraduacao() {
        Diploma diploma = new DiplomaGraduacao();

        diploma.emitir();

        assertTrue(saida.toString().contains("Diploma de Graduação"));
    }
}
