package estudos.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double num : salarios) {
            System.out.println(num + " ");
        }
        System.out.println(" a media é " + MediaSalario(salarios));
    }

    public double MediaSalario(double... salarios) {
        if (salarios == null) {
            return 0;
        }


        for (double num : salarios) {
            media += num;
        }

        return media /= salarios.length;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalarios(double... salarios) {
        this.salarios = salarios;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return this.media;
    }
}
