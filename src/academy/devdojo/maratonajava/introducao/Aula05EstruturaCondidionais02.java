package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondidionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 30;
        if (idade < 15) {
            System.out.println("categoria infantil");
        }else if(idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        }else if(idade >= 18) {
            System.out.println("categoria adulto");
        }
    }
}
