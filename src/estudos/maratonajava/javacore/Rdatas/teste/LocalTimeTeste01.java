package estudos.maratonajava.javacore.Rdatas.teste;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime agora = LocalTime.now();
        System.out.println(time);
        System.out.println(agora);
    }
}
