package estudos.maratonajava.introducao;

public class EstruturasCondicionais05 {
    // imprima o dia da semana, considerando 1 como domingo


    public static void main(String[] args) {
        byte dia = 10;
        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não existe esse dia da semana");
        }

        // imprima o sexo da pessoa baseado na letra entre masculino e feminino

        char sxo = 'F';
        switch (sxo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
        }
    }


}
