package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        int [] numeros2 = {1, 2 , 3 , 4 , 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros2[i]);
        }
        for(int i: numeros2){
            System.out.println(i);
        }
    }
}
