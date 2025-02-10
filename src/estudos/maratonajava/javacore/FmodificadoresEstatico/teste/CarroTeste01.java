package estudos.maratonajava.javacore.FmodificadoresEstatico.teste;

import estudos.maratonajava.javacore.FmodificadoresEstatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW" , 260);
        Carro carro1 = new Carro("Porsche", 270);

        carro.imprime();
        carro1.imprime();
        System.out.println();

        Carro.velocidadeLimite = 210;
        System.out.println("Depois de Alterar a velocidade Limite");

        carro.imprime();
        carro1.imprime();
    }
}
