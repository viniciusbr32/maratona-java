package estudos.maratonajava.javacore.Kunum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    private double valor;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento, double valor) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente + ", tipoClienteInt=" + tipoCliente.getTipoPessoaInt() +
                ", tipoPagamentoInt=" + tipoPagamento.getTipoPagamentoInt() +
                ", tipoPagamentoString=" + tipoPagamento.getTipoPagamentoString() +
                ", tipoPagamentoDesconto=" + "o Desconto para pagamento em " + tipoPagamento.getTipoPagamentoString() + " é de " + tipoPagamento.calcularDesconto(100) + "%" +

        '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
