package estudos.maratonajava.introducao;
// aula 05 pt 1
public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! operador de negacao
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("não autorizado a comprar bebida");
        }


        System.out.println("fora do if");

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }


    }


}
