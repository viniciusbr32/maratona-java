package estudos.maratonajava.javacore.Uregex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "levi, Eren, Mikasa, true, 200";
        String nomes[] = texto.split(",");

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
