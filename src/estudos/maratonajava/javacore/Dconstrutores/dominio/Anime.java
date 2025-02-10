package estudos.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String produtora;


    public Anime(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }

    public Anime(String nome, String tipo, int episodios, String genero, String produtora) {
        this(nome, tipo, episodios, genero);
        this.produtora = produtora;
    }


    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        if (this.genero == null) {
            System.out.println("Não informou genero");
            return;
        }
        System.out.println(this.genero);

        if(this.produtora == null) {
            return;
        }
        System.out.println(this.produtora);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }


}



