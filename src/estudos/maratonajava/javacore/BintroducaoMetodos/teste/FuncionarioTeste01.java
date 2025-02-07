package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Teste 01";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1000, 2000, 3000};
        funcionario.imprime();

    }
}
