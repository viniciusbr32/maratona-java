package estudos.maratonajava.javacore.Gassociacao.teste;

import estudos.maratonajava.javacore.Gassociacao.dominio.Jogador;
import estudos.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafu");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-----------Jogadores----------");
        jogador1.imprime();
        jogador2.imprime();
        System.out.println("---------------Time-------------");
        time.imprime();


    }
}
