package estudos.maratonajava.introducao;

// Exercicios tipos primitivos
// aula 03
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.


 */

public class ExercicioTiposPrimitivos {

   public  static void main(String[] args) {
       String nome = "vinicius";
       String endereco = "Avenida Bla bla bla, 106, Jardim Primavera";
       double salario = 2500.25;
       String data = "30/01/2025";
       String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salario de "+salario+" na data "+data;

       System.out.println(relatorio);
   }

}
