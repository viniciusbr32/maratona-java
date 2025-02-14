package estudos.maratonajava.javacore.Isobreescrita.dominio;

public class Anime  {
    private String nome;
    private String produtora;

    public Anime(String nome, String produtora) {
        this.nome = nome;
        this.produtora = produtora;
    }


    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", produtora='" + produtora + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
