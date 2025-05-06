package academy.devdojo.maratonajava.javecore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javecore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javecore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante Impressora = new ImpressoraEstudante();


        estudante01.nome = "Maradona";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Lucia";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        Impressora.imprime(estudante01);
        Impressora.imprime(estudante02);


    }
}
