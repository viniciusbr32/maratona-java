package estudos.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abauabuab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto    " + texto);
        System.out.println("indice:  0123456789");
        System.out.println("Posiçoes Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
