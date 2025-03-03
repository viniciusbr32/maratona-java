package estudos.maratonajava.javacore.Oexception.Runtime.test;

public class RuntimeException3 {
    public static void main(String[] args) {

        try {
            abreConexao2();
        } catch (RuntimeException e) {
            System.out.println(" Erro em tempo de execução " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Erro Inesperado " + e.getLocalizedMessage());
        }

    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println(" Escrevendo dados no arquivo ");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(" Fechando recurso liberado pelo SO");
        }
        return null;
    }
    // nunca criar um try sozinho ou try-catch ou try-finally ou os 3 juntos

    public static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println(" Escrevendo dados no arquivo ");
            throw new RuntimeException();
        } catch (RuntimeException e) {  // Captura exceções em tempo de execução
            System.out.println("Erro de RuntimeException: " + e.getMessage());
            throw e;
        } catch (Exception e) {  // Captura exceções verificadas (Checked Exceptions)
            System.out.println("Erro genérico de Exception: " + e.getMessage());
            throw e;
        } finally {
            System.out.println(" Fechando recurso liberado pelo SO");
        }
    }

}
