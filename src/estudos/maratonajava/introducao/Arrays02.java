package estudos.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
    // byte, short, double, int, long, float, 0
        // char '\u0000' " "
        // String null

        String[] nomes = new String[4];
        nomes[0] = "goku";
        nomes[1] = "kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
