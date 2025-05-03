package academy.devdojo.maratonajava.javecore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javecore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros02(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 2));
        System.out.println("--------------------");
        calculadora.imprimeDivisaodDeDoisNumeros(86, 0);
    }
}
