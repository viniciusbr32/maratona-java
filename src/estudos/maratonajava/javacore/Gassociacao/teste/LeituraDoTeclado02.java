package estudos.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite Sua pergunta e Responderei Sim ou Não");

        String pergunta = entrada.nextLine();

        if (pergunta.startsWith(" ")) {
            System.out.println("sim");
        } else  {
            System.out.println("nao");
        }

    }
}
