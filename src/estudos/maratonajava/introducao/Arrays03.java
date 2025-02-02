package estudos.maratonajava.introducao;

public class Arrays03 {
    public static void main(String[] args) {

        int[] numeros2 = {10, 20, 10, 35, 40, 30};

        for (int Num : numeros2) {
            if (Num <= 10) {
                continue;
            }
            System.out.println(Num);
        }
    }
}
