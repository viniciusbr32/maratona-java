package estudos.maratonajava.introducao;

public class ArraysMultiDimensionais02 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 1}, {2, 3, 4}, {4, 5, 6, 7, 8, 9}};

        for (int[] arrBase: arrayInt2) {
            System.out.println("\n------");
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
