package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;


public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "estudante 01";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "estudante 02";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
