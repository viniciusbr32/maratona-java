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

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
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
