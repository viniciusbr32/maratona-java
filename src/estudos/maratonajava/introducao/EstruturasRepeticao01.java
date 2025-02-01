package estudos.maratonajava.introducao;

public class EstruturasRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        // While a condicação deve ser um boolean, e ele só acontece caso seja true
        // no do while, ele executa pelo menos uma vez independente se a condição seja true ou fasle
        //

        int count = 0;

        while (count <= 10) {
            System.out.println("contador " + count);
            count++;
        }
        do {
            System.out.println("dentro do while" + count);
            count++;
        } while (count <= 15);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("par " + i);
            } else {
                System.out.println("impar" + i);
            }
        }
    }

}
