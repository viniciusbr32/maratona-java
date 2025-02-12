package estudos.maratonajava.javacore.Gassociacao.teste;

import estudos.maratonajava.javacore.Gassociacao.dominio.Jogador;
import estudos.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");

        Jogador[] jogadores = {jogador1};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
