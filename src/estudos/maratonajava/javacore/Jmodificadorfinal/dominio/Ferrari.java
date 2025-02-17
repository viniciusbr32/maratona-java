package estudos.maratonajava.javacore.Jmodificadorfinal.dominio;

 public class Ferrari {
    private String nome;

    final public void imprime() {
        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
