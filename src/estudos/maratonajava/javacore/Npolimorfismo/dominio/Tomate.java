package estudos.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {

    private static  final double IMPOSTO_POR_CENTO = 0.06;
    private String DataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpsto() {
        System.out.println("Calculando Imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }
}
