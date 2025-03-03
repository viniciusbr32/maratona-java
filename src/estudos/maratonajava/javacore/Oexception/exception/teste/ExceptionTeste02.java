package estudos.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) {
        try {
            CriarNovoArquivo();

        } catch (IOException e) {
            System.out.println("Não criou " + e);


        }
    }

    private static void CriarNovoArquivo() throws IOException {
        File file = new File("Arquivo\\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Iscriado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
