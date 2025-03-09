package estudos.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUSA = new Locale("en", "US");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeUSA);

        System.out.println("Brasil " + df1.format(calendar.getTime()));
        System.out.println("Estados unidos " + df2.format(calendar.getTime()));

        System.out.println(localeUSA.getDisplayLanguage(localeBR));
        System.out.println(localeBR.getDisplayLanguage(localeUSA));
        System.out.println(localeUSA.getDisplayCountry(localeBR));
    }
}
