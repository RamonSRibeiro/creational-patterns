package unificarPadroes;

public class Main {

    public static void main(String[] args) {
        Aluno alunoGraduacao = new Aluno("Maria", "FabricaGraduacao");
        alunoGraduacao.emitirDocumentos();

        System.out.println();

        Aluno alunoPos = new Aluno("João", "FabricaPosGraduacao");
        alunoPos.emitirDocumentos();

        System.out.println();

        // Provando o Singleton: as duas chamadas retornam o MESMO objeto.
        boolean mesmaInstancia = FactoryMethod.getInstancia() == FactoryMethod.getInstancia();
        System.out.println("FactoryMethod é singleton? " + mesmaInstancia);
    }
}
