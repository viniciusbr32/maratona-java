package estudos.maratonajava.javacore.Oexception.Error.teste;

public class StacOverflowTeste01 {
    public static void main(String[] args) {
        Recursividade();
        System.out.println(" rodou");
    }

    public static void Recursividade() {
        Recursividade();
    }
}
