package estudos.maratonajava.javacore.EblocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1- alocado espaço em memoria
    // 2- cada atributo da classe é criado e inicialização com valores default ou oque for passado;
    // 3- bloco inicialização é executado
    // 4- construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios) {
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
