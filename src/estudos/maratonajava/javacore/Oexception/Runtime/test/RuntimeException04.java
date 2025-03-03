package estudos.maratonajava.javacore.Oexception.Runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Dentro de  ArrayIndexOutOfBoundsException ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Dentro de  IndexOutOfBoundsException ");
        } catch (ArithmeticException e) {
            System.out.println(" Dentro de  ArithmeticException ");
        } catch (IllegalArgumentException e) {
            System.out.println(" Dentro de IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println(" Dentro de RuntimeException ");
        }
        // pode usar em linha, quando exceções não fazem parte da mesma hierarquia
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dentro de SQLException | FileNotFoundException");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}
