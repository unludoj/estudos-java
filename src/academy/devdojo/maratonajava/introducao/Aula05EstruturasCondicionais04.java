package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salatioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;
        if (salatioAnual <= 34712){
            valorImposto = salatioAnual * primeiraFaixa;
        } else if (salatioAnual >= 34712 && salatioAnual <= 68507){
            valorImposto = salatioAnual * segundaFaixa;
        } else {
            valorImposto = salatioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
