package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

import java.util.Arrays;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Teste 01");
        funcionario.setIdade(20);

        funcionario.setSalarios(new double[]{2000, 2000});
        funcionario.imprime();

        System.out.println("GET MEDIA " + funcionario.getMedia());


    }
}
