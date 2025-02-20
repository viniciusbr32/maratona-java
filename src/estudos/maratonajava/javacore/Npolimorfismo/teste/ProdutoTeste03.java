package estudos.maratonajava.javacore.Npolimorfismo.teste;

import estudos.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import estudos.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/02/2021");

        CalcularImposto.calcularImpostoProduto(produto);
        System.out.println("-----------------");
        CalcularImposto.calcularImpostoProduto(tomate);



    }
}
