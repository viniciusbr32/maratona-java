package estudos.maratonajava.introducao;

public class EstruturasRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 9230;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
           if(valorParcela < 1000) {
               continue;
           }
            System.out.println("PARCELA: " + parcela + " | VALOR DE CADA PARCELA: " + valorParcela);
        }
    }
}
