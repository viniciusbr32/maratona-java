package estudos.maratonajava.javacore.Qstring;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "       Luffy ";
        String numeros = "012345";

        // 012345

        System.out.println(nome);

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f" , "l"));
        System.out.println(numeros.length());
        System.out.println(numeros.substring(2, 4));
        System.out.println(nome.trim());
    }
}
