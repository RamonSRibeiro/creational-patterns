package unificarPadroes;

public class DiplomaGraduacao implements Diploma {

    @Override
    public void emitir() {
        System.out.println("Diploma de Graduação emitido.");
    }
}
