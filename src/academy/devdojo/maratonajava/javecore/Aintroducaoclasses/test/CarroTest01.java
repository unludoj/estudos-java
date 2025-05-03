package academy.devdojo.maratonajava.javecore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javecore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.modelo = "Ford";
        carro.nome = "Fusion";
        carro.ano = 2015;

        carro2.modelo = "Honda";
        carro2.nome = "Civic";
        carro2.ano = 2024;

        carro = carro2;

        System.out.println(carro.modelo);
        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println("----------------------");
        System.out.println(carro2.modelo);
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
    }
}
