package estudos.maratonajava.javacore.Minterfaces.teste;

import estudos.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import estudos.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import estudos.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        DataLoader.retrieveMaxDataSize();

        fileLoader.load();
        databaseLoader.load();
        fileLoader.remover();
        databaseLoader.remover();
        fileLoader.checkPermisson();
        databaseLoader.checkPermisson();
        databaseLoader.retrieveMaxDataSize();
    }
}
