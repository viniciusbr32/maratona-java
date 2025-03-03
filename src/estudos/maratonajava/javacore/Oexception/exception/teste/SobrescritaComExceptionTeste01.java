package estudos.maratonajava.javacore.Oexception.exception.teste;

import estudos.maratonajava.javacore.Oexception.dominio.Funcionario;
import estudos.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;
import estudos.maratonajava.javacore.Oexception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
