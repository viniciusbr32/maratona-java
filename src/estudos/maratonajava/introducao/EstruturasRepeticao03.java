package estudos.maratonajava.introducao;

// imprima os primeiros 25 numeros de um dado valor exemplo. 50
public class EstruturasRepeticao03 {
    public static void main(String[] args) {

        int valorMax = 10;
        for(int i = 1; i <= valorMax; i++) {
            if(i > 5) {
                break;
            }
            System.out.println(+i);
        }
    }
}
