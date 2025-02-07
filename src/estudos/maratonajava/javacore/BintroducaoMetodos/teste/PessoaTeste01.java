package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Vinicius");
        pessoa.setIdade(10);

        System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());

    }
}
