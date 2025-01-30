package estudos.maratonajava.introducao;
// aula 04
public class Operadores {

    public static void main(String[] args) {
        // + - / *
        // a soma de dois valores inteiros em uma operação, o resultado sempre vai ser um numero inteiro
        int numero01 = 10;
        double  numero02 = 20;
        double resultado = numero01 / numero02;

        System.out.println("valor "+resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // operadores logicos, sempre vao retornar um valor boolean
        // maior > menor <
        // <= menor igual >= maior igual
        // dois iguais == significa que esta comprando
        // != comparando se é diferente

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
    }
}
