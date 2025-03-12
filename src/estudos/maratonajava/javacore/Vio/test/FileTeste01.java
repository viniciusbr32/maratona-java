package estudos.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {

            boolean iscreated = file.createNewFile();
            System.out.println("Arquivo criado: " + iscreated);
            System.out.println("path: " + file.getPath());
            System.out.println("path absolute: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("last modified : " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("'Brasilia' dd 'de' MMMM 'de' yyyy 'ás' HH:mm:ss")));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
