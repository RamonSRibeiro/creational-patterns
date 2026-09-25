package unificarPadroes;

public class DiplomaPosGraduacao implements Diploma {

    @Override
    public void emitir() {
        System.out.println("Diploma de Pós-Graduação emitido.");
    }
}
