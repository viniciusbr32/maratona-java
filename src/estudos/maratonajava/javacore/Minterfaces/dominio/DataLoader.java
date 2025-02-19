package estudos.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
   public static final int MAX_DATA_SIZE = 10;
   public abstract void load();

   default void checkPermisson(){
      System.out.println("Checkando permissoes");
   }

   static void retrieveMaxDataSize() {
      System.out.println("Dentro do retriveMaxDataSize");
   }
}
