package estudos.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    public void remover() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermisson() {
        System.out.println("Checkando permissoes dentro do arquivo");
    }
}
