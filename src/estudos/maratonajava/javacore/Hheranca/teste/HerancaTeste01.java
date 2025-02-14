package estudos.maratonajava.javacore.Hheranca.teste;

import estudos.maratonajava.javacore.Hheranca.dominio.Endereco;
import estudos.maratonajava.javacore.Hheranca.dominio.Funcionario;
import estudos.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vinicius");
        Funcionario funcionario = new Funcionario("funcionario Teste");
        Endereco endereco = new Endereco();


        funcionario.setCpf("3333-333");
        funcionario.setSalario(200000);
        funcionario.setEndereco(endereco);

        endereco.setCep("222-222-222");
        endereco.setRua("Rua procopio");


        pessoa.setCpf("222-2222");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------");

        funcionario.imprime();


    }
}
