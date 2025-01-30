package estudos.maratonajava.introducao;

// aula 02

/*
     tipos primitivos
        // - `byte`
        //- `short`
        //- `int`
        //- `long`
        //- `float`
        //- `double`
        //- `char`
        //- `boolean`
 */

public class TiposPrimitivos {

    public static void main(String[] args) {
        int idade = (int) 100000000000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0f;
        byte idadeByte = 12;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        char caractereAsci = 87;
        String nome = "vinicius";

        // no char podemos usar unicode ou asci


        System.out.println("a idade é " + idade + " anos");
        System.out.println("unicode " + caractere);
        System.out.println("Asci " + caractereAsci);
        System.out.println(nome);


    }
}
