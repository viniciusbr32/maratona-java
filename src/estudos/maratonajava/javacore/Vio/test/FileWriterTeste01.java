package estudos.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Primeira linha do arquivo.\n");
            fw.write("Segunda linha do arquivo.\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
