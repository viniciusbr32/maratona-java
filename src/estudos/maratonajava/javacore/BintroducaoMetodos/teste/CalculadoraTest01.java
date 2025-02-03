package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoSubtracao = calculadora.subtraiaDoisNumeros(12.5, 10.5);
        int Resultado = calculadora.somaDoisNumeros(10, 20);

        System.out.println(Resultado);
        System.out.println(resultadoSubtracao);
    }
}
