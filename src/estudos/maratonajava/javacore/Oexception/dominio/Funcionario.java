package estudos.maratonajava.javacore.Oexception.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando Funcionario");
    }
}
