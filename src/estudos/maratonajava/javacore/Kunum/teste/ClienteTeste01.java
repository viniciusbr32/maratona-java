package estudos.maratonajava.javacore.Kunum.teste;


import estudos.maratonajava.javacore.Kunum.dominio.Cliente;
import estudos.maratonajava.javacore.Kunum.dominio.TipoCliente;
import estudos.maratonajava.javacore.Kunum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Vinicius", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX, 100);
        Cliente cliente2 = new Cliente("Vinicius2", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO, 100);
        Cliente cliente3 = new Cliente("Vinicius3", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO, 100);

        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());

        TipoPagamento tipoPagamento = TipoPagamento.tipoPagamentoPorIndice(1);
        TipoPagamento tipoPagamento2 = TipoPagamento.tipoPagamentoPorIndice(2);
        TipoPagamento tipoPagamento3 = TipoPagamento.tipoPagamentoPorIndice(3);
        System.out.println(tipoPagamento);
        System.out.println(tipoPagamento2);
        System.out.println(tipoPagamento3);

    }
}
