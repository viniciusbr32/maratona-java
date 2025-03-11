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
// ? zero ou uma
// * zero ou mais
// + uma ou mais
// {n,m} de n até m
// ()
// |
// $ fim da linha

public class PatternMatcherTeste04 {
    public static void main(String[] args) {
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "0x1A3 0X7F 0x123ABC 0X0 0x1 0x1G3 0XH9 1A3 0x 0X12G";
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
