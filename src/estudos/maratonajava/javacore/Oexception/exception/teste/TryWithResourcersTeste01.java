package estudos.maratonajava.javacore.Oexception.exception.teste;


import estudos.maratonajava.javacore.Oexception.dominio.Leitor1;
import estudos.maratonajava.javacore.Oexception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcersTeste01 {
    public static void main(String[] args) {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo02() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

