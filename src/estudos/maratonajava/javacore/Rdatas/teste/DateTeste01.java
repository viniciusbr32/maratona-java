package estudos.maratonajava.javacore.Rdatas.teste;

import java.util.Date;

// Modo de tratar com dates, a maioria de métodos depreciados

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(10000000000L);
        System.out.println(date);
        System.out.println(date.getHours());
    }
}
