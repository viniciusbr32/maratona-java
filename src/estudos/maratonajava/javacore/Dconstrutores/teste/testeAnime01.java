package estudos.maratonajava.javacore.Dconstrutores.teste;


import estudos.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class testeAnime01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "teste", 30, "Não sei" );
        Anime anime2 = new Anime("Anime 2", "Teste 2", 20, "Não sei tambem", "Produtora GLOBO");
        System.out.println("---------------------------");
        anime.imprime();
        System.out.println("---------------------------");
        anime2.imprime();
    }
}
