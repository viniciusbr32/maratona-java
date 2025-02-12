package estudos.maratonajava.javacore.FmodificadoresEstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 1- alocado espaço em memoria
    // 2- cada atributo da classe é criado e inicialização com valores default ou oque for passado;
    // 3- bloco inicialização é executado
    // 4- construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Bloco de inicialização 2");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
