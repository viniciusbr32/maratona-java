package estudos.maratonajava.javacore.Rdatas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo");
        }

        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        c.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(Calendar.DAY_OF_MONTH);


    }
}
