package academy.devdojo.maratonajava.javecore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javecore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{2500,2500,2400};

        funcionario.imprime();
    }
}
