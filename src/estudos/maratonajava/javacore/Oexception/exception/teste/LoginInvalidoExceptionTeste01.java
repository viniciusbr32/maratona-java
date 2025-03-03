package estudos.maratonajava.javacore.Oexception.exception.teste;

import estudos.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();

        } catch (LoginInvalidoException e) {
            System.out.println(" ERROR: " + e.getMessage());
        } finally {
            System.out.println("Fechando conexão com banco de dados");
        }
    }


    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println(" Digite seu usuario ");
        String usuarioDigitado = teclado.nextLine();
        System.out.println(" Digite sua senha");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha invalida");
        }

        System.out.println("Logado com sucesso");

    }
}
