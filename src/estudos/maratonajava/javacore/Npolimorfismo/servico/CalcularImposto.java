package estudos.maratonajava.javacore.Npolimorfismo.servico;

import estudos.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import estudos.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalcularImposto {
    public static void calcularImpostoProduto(Produto produto) {
        System.out.println("Relatorio de  imposto de " + produto.getNome());
        double imposto = produto.calcularImpsto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
