package academy.devdojo.maratonajava.javecore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javecore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calc = new Calculadora();
        int []  nums = {1,2,3,4,5,6,7,8,9,10};
        calc.somaVarArgs(12,4,5,6,7,8,9,7,9,766);
        calc.somaArray(nums);

    }
}
