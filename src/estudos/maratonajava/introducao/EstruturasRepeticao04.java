package estudos.maratonajava.introducao;

// dado o valor de um carro, descubra em quantas vezes, ele pode ser parcelado
// condição é que valor da parcela tem que ser maior ou igual a mil;

// MEU PENSAMENT0
// valor do carro / parcela minima
//


public class EstruturasRepeticao04 {
    public static void main(String[] args) {

        double valorTotal = 9230;

        for (int parcela = 1; parcela <= valorTotal / 1000 ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("QUANTIDADES  DE PARCELAS: " + parcela + " | VALOR DE CADA PARCELA: " + valorParcela);
        }
    }
}
