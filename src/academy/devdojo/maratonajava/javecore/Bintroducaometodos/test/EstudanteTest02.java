package academy.devdojo.maratonajava.javecore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javecore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Maradona";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Lucia";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}