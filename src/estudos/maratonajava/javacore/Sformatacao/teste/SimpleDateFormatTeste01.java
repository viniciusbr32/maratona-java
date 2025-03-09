package estudos.maratonajava.javacore.Sformatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "dd 'de' MMMM 'de' yyyy";
        Locale localeBR = new Locale("pt", "BR");

        SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeBR);

        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("06 de março de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
