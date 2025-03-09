package estudos.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "br");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 100_000.234;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
