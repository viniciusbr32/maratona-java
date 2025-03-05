package estudos.maratonajava.javacore.Qstring;

public class StringPerfomaceTeste01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        contactString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + " MS");

        inicio = System.currentTimeMillis();
        contactStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Builder " + (fim - inicio) + " MS");

        inicio = System.currentTimeMillis();
        contactStringBuffer(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para Buffer " + (fim - inicio) + " MS");
    }

    private static void contactString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }

    }

    private static void contactStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    private static void contactStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }
}
