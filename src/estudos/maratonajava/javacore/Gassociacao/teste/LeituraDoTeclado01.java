package estudos.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Seu nome Abaixo");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println("Digite Masculino ou Feminino para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("---------------------");

        System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo);
    }
}
