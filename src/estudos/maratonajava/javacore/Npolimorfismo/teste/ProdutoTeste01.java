package estudos.maratonajava.javacore.Npolimorfismo.teste;

import estudos.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import estudos.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PC GAMER bla bla", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 2000);

        CalcularImposto.calcularImpostoProduto(computador);
        System.out.println("--------------------");

        CalcularImposto.calcularImpostoProduto(tomate);
        System.out.println("--------------------");
        CalcularImposto.calcularImpostoProduto(televisao);

    }
}
