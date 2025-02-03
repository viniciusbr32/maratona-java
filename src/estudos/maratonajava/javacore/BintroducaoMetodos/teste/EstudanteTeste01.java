package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "estudante 01";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "estudante 02";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }



}
