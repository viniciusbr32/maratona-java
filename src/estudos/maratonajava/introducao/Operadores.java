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

        // operadores logicos  && (AND) , || (or) , ! negação

        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("DentroDaleiMaiorqueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("DentroDaleiMenorqueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;

        System.out.println("Da pra compra o playstation ? "+isPlaystationCincoCompravel);

        // operadores de atribuição = += -= *= /= %=
        // Apenas para economizar algumas linhas de codigo

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus /= 2;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1; // contador = contador + !
        contador++; // só funciona de 1 em 1
        contador--;

        int contador2 = 0;

        System.out.println(contador2++);
        System.out.println(contador);

        /*
        o lado do sinal ++ muda conforme o lado que ele é colocado
        caso ele seja colocado no começo exemplo ++contador, ele diz que primeira a varialvel faz oque tem que fazer e dps incrementar
        e caso seja colocado no final, ele já incrementa na hora da execução

        o mesmo vale para o decremento (--)
         */




    }

}
