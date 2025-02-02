package estudos.maratonajava.introducao;

public class ArraysMultiDimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 15;
        dias[0][1] = 10;
        dias[0][2] = 12;

        dias[1][0] = 8;
        dias[1][1] = 9;
        dias[1][2] = 10;
        System.out.println("teste" + dias[0][1]);

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Dentro da referencia " + i + " Dentro do elemento do array no index " + j + " Valor do array: " + dias[i][j]);
            }
        }

        System.out.println("---------------------");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }


    }


}
