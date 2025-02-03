package estudos.maratonajava.javacore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante) {
        System.out.println("---------------------");
        System.out.println("Nome " + estudante.nome + " IDADE " + estudante.idade + " SEXO " + estudante.sexo);
    }
}
