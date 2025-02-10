package estudos.maratonajava.javacore.CsobrecargaMetodos.teste;

import estudos.maratonajava.javacore.CsobrecargaMetodos.dominio.Anime;

public class testeAnime01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        anime.init("Naruto", "TV", 10);
        anime2.init("ANime 2", "Serie", 10, "Ação");

        anime2.imprime();
        System.out.println("---------------------------");
        anime.imprime();

    }
}
