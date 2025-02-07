package estudos.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {
    public int somaDoisNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public double subtraiaDoisNumeros(double num1, double num2) {
        return num1 - num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println("teste" + num1);
        System.out.println(num2);
    }

    public int SomaArrayVargs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }

        return soma;
    }

}

// 1, 3, 6, 10, 15;