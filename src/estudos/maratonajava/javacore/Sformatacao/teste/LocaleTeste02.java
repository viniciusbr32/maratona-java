package estudos.maratonajava.javacore.Sformatacao.teste;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCountries =  Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String countries : isoCountries) {
            System.out.print(countries + " ");
        }
        System.out.println();
        System.out.println("Languages");

        for(String languages: isoLanguages) {
            System.out.print(languages + " ");
        }
    }
}
