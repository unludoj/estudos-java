package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        String feriadoOuNao = "Sabado";
        switch (feriadoOuNao) {
            case "Sabado":
            case "Domingo":
                System.out.println("Feriado");
                break;
            case "Segunda":
            case "Terça":
            case "Quarta":
            case "Quinta":
            case "Sexta":
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
