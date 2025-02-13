package estudos.maratonajava.javacore.Gassociacao.teste;

import estudos.maratonajava.javacore.Gassociacao.dominio.Escola;
import estudos.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Escola escola = new Escola("Pacifico");
        Professor professor = new Professor("Xandão", "Oftalmo");
        Professor professor2 = new Professor("Marcia", "Oftalmo");

        Professor[] professores = {professor, professor2};
        escola.setProfessores(professores);

        escola.imprime();

    }
}
