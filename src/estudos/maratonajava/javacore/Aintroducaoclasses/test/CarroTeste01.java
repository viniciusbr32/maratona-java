package estudos.maratonajava.javacore.Aintroducaoclasses.test;

import estudos.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Astra";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2010;

        carro2.nome = "Civic";
        carro2.modelo = "Honda";
        carro2.ano = 2010;

        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

    }
}
