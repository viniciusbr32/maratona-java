package estudos.maratonajava.javacore.Oexception.Runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }


    public static int divisao(int a, int b) {

        if (b == 0) {
            throw new RuntimeException(" O divisor não pode ser 0");
        }
        return a / b;
    }
}
