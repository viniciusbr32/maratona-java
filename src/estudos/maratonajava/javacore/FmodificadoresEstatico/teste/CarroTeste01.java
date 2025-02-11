package estudos.maratonajava.javacore.FmodificadoresEstatico.teste;


import estudos.maratonajava.javacore.FmodificadoresEstatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 260);
        Carro carro1 = new Carro("Porsche", 270);
        Carro.setVelocidadeLimite(210);

        System.out.println();
        
        carro.imprime();
        carro1.imprime();


    }
}
