package estudos.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        CriarNovoArquivo();
    }

    private static void CriarNovoArquivo() {
        File file = new File("Arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Iscriado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
