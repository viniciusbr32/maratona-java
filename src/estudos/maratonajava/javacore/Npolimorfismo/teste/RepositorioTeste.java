package estudos.maratonajava.javacore.Npolimorfismo.teste;

import estudos.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import estudos.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import estudos.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import estudos.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
