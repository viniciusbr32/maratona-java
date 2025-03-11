package estudos.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// \d = Todos os digitos
// \D = tudo oque não for digito
// \s espaços em brancos \t \n \f \r
// \S todos os caracteres excluindo os brancos
// \w = a-zA-Z, digitos, -
// \W tudo aocontrario do \W
// [] Range

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        String regex = "\\W";
        String texto = "abau43a3@#@$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto    " + texto);
        System.out.println("indice:  0123456789");
        System.out.println("Posiçoes Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
