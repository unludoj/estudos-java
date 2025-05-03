package academy.devdojo.maratonajava.javecore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javecore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        est.nome = "Mario";
        est.idade = 18;
        est.sexo = 'M';
        System.out.println(est.nome);
        System.out.println(est.idade);
        System.out.println(est.sexo);
    }
}
