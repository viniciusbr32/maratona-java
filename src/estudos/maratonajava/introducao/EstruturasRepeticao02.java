package estudos.maratonajava.introducao;

// exercicio
// imprimidas todos os numeros pares, de 0 ate 100000
public class EstruturasRepeticao02 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                System.out.println("numero par " + i);
            }
        }
    }
}
