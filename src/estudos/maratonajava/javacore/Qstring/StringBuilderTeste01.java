package estudos.maratonajava.javacore.Qstring;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Vinicius";
        nome.concat(" Dev dojo");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Vinicius");

        sb.append(" Dev dojo").append(" Teste");
        System.out.println(sb);

    }
}
