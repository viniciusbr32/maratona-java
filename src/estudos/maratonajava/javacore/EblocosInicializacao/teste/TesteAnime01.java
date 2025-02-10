package estudos.maratonajava.javacore.EblocosInicializacao.teste;

import estudos.maratonajava.javacore.EblocosInicializacao.dominio.Anime;

public class TesteAnime01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
       for(int episodio: anime.getEpisodios()) {
           System.out.print(episodio + " ");
       }

    }
}
