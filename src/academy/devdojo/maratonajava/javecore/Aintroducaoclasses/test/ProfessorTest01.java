package academy.devdojo.maratonajava.javecore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javecore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Joao";
        professor.sexo = 'M';
        professor.materia = "Fisica";
        professor.matricula = 1328727788;
        System.out.println("Nome: " + professor.nome + " Sexo: " + professor.sexo + " Materia: " + professor.materia + " Matricula: " + professor.matricula);
    }
}
