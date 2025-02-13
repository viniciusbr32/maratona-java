package estudos.maratonajava.javacore.Gassociacao.teste;

import estudos.maratonajava.javacore.Gassociacao.dominio.Aluno;
import estudos.maratonajava.javacore.Gassociacao.dominio.Local;
import estudos.maratonajava.javacore.Gassociacao.dominio.Professor;
import estudos.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vinicius", 19);
        Aluno aluno2 = new Aluno("TesteAluno2", 20);

        Aluno[] alunos = {aluno1, aluno2};

        Professor professor = new Professor("Marcos", "Oftalmo");

        Local local = new Local("Rua Procopio, N:18");
        Seminario seminario = new Seminario("Seminario 1", alunos, local);
        Seminario seminario2 = new Seminario("Seminario 2", alunos, local);
        Seminario[] seminarios = {seminario, seminario2};

        professor.setSeminarios(seminarios);
        professor.imprime();

    }
}
