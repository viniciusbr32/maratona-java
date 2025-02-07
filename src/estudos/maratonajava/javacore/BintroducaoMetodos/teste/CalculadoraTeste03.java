package estudos.maratonajava.javacore.BintroducaoMetodos.teste;

import estudos.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.SomaArrayVargs(1, 2, 3, 4, 5);

        System.out.println(resultado);
    }
}
