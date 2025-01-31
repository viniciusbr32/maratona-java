package estudos.maratonajava.introducao;

// aula 03 estruturas condicionais
// aula 05 pt 3


public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario for maior que 5000

        double  salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro dev dojo";
        String mensagemNaoDoar = "ainda não tenho condiçoes, mas vou ter";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar ;

        System.out.println(resultado);


    }
}
