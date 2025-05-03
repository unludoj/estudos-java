package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.print(dias[i][j]);
            }
        }

        for(int [] arrBase : dias){
            for(int num : dias[0]){
                System.out.println(num);
            }
        }
    }
}
