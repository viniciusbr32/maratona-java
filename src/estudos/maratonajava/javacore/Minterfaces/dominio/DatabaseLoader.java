package estudos.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    public void remover(){
        System.out.println("Removendo dados do Banco de dados");
    }

    @Override
    public void checkPermisson() {
        System.out.println("Checkando permissoes dentro do dataBase");
    }


    public void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize do DataBaseLoader");
        System.out.println(DataLoader.MAX_DATA_SIZE);
    }


}
