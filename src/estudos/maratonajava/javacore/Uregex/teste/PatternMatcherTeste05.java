package estudos.maratonajava.javacore.Uregex.teste;

import java.util.Arrays;
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
// . Coringa aceita qualquer careactere unico depois dele
// .* → Qualquer sequência de caracteres (inclusive vazia)

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        String regex = "([a-zA-z0-9\\._-])+@([a-zA-z])+(\\.+([a-zA-z])+)+";
        String texto = "teste@gmail.com, #@123teste2@gmail.com.br, teste.com, teste@gmail";
        System.out.println("EMail Valido");
        System.out.println("teste@gmail.com".matches(regex));

        System.out.println(texto.split(",")[3].trim());

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
