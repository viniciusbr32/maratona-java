package estudos.maratonajava.javacore.Lclassesabstratas.teste;

import estudos.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import estudos.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class ClassesAbstratasTeste01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Vinicius", 12000);
        Gerente gerente = new Gerente("Marcos", 10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
