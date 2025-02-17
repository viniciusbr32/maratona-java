package estudos.maratonajava.javacore.Jmodificadorfinal.teste;

import estudos.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import estudos.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import estudos.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");

        Ferrari ferrari2 = new Ferrari();
        ferrari2.setNome("Puro Sangue");

        ferrari.imprime();
        ferrari2.imprime();

        carro.COMPRADOR.setNome("teste");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR.toString());

    }

}
