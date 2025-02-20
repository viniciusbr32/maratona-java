package estudos.maratonajava.javacore.Npolimorfismo.teste;

import estudos.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
