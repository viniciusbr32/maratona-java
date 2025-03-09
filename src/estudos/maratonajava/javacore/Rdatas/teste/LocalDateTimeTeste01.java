package estudos.maratonajava.javacore.Rdatas.teste;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        LocalDate agora = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(agora.atTime(time));
        System.out.println(time.atDate(agora));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'Ás' " +
                "HH:mm")));
    }
}
