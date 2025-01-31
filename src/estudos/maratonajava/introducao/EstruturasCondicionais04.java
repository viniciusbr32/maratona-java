package estudos.maratonajava.introducao;

// aula 05 pt 1
// estruturas condicionais parte 4 EXERCICIO
// Saber quando de imposto vai pagar, dependendo do salario na holanda em 2020
public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;

        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        String mensagem = "Você vai pagar de imposto a quantidade de ";
        if (salario <= 34712) {
            valorImposto = salario * primeiraFaixa;
            System.out.println(mensagem+valorImposto);
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * segundaFaixa;
            System.out.println(mensagem+valorImposto);

        }  else {
            valorImposto = salario * terceiraFaixa;
            System.out.println(mensagem+valorImposto);

        }
    }
}
