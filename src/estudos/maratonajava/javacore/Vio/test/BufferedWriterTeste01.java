package estudos.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Escrevendo no arquivo usando BufferedWriter!\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
