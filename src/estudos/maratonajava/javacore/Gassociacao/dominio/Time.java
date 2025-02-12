package estudos.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;


    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        this.nome = nome;
        if (jogadores != null) {
            System.out.println("Escalação");
            for (Jogador jogador : jogadores) {

                System.out.println(jogador.getNome());
            }
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getTime() {
        return nome;
    }

    public void setTime(String nome) {
        this.nome = nome;
    }
}
