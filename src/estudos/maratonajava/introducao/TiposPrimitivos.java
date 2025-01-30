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
           int idade = 10;
           long numeroGrande = 100000;
           double salarioDouble = 2000;
           float salarioFloat = 2500;
           byte idadeByte = 12;
           short idadeShort = 10;
           boolean verdadeiro = true;
            boolean falso = false;
            char caractere = '\u0041';
            char caractereAsci = 87;

            // no char podemos usar unicode ou asci


            System.out.println("a idade é" + idade+ " anos");
             System.out.println("unicode "+ caractere);
             System.out.println("Asci "+ caractereAsci);

    }
}
