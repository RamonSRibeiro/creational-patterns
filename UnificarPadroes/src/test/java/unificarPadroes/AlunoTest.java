package unificarPadroes;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;

public class AlunoTest {

    @Test
    public void alunoDeGraduacaoDeveReceberHistoricoEDiplomaDeGraduacao() throws Exception {
        Aluno aluno = new Aluno("Maria", "FabricaGraduacao");

        assertTrue(getCampo(aluno, "historico") instanceof HistoricoGraduacao);
        assertTrue(getCampo(aluno, "diploma") instanceof DiplomaGraduacao);
    }

    @Test
    public void alunoDePosGraduacaoDeveReceberHistoricoEDiplomaDePosGraduacao() throws Exception {
        Aluno aluno = new Aluno("João", "FabricaPosGraduacao");

        assertTrue(getCampo(aluno, "historico") instanceof HistoricoPosGraduacao);
        assertTrue(getCampo(aluno, "diploma") instanceof DiplomaPosGraduacao);
    }

    // Os campos de Aluno são privados de propósito (encapsulamento);
    // usamos reflexão só para checar o resultado nos testes.
    private Object getCampo(Aluno aluno, String nomeCampo) throws Exception {
        Field campo = Aluno.class.getDeclaredField(nomeCampo);
        campo.setAccessible(true);
        return campo.get(aluno);
    }
}
