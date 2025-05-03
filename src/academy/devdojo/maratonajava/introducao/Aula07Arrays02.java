package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int , long , float e double 0
        // char '\u0000' ' '
        //boolean false
        // String null

        String[] nomes = new String[7];
        nomes[0] = "Julian";
        nomes[1] = "Ana";
        nomes[2] = "Julian";
        nomes[3] = "Ana Julia";
        nomes[4] = "Beto";
        nomes[5] = "Ana Dilme";
        nomes[6] = "Joao";
         for (int i = 0; i < nomes.length; i++) {
             System.out.println(nomes[i]);
         }
    }
}