package estudos.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2025, Month.MAY, 9);
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getYear());
        System.out.println(dateOf);

    }
}
