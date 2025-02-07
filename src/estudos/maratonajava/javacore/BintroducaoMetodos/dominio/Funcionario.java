package estudos.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null ) {
            return;
        }
        for (double num: salarios) {
            System.out.println(num + " ");
        }
        System.out.println(" a media é" + MediaSalario(salarios));
    }

    public double MediaSalario (double... salarios) {
        if(salarios == null) {
            return 0;
        }
        double soma = 0;
        for (double num: salarios) {
            soma+=num;
        }
        return soma /= salarios.length;
    }
}
