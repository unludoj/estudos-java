package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * / =
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);


        // %
        int resto = 20% 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualDez);

        // && (AND) || (or) !

        int idade = 35;
        float salario = 3000f;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >=3500;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >=3500;
        System.out.println("isDentroDaLeiMaiorQue30 "+isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 "+isDentroDaLeiMenorQue30);

        double valorEmContaCorrente = 300d;
        double valorEmContaPoupanca = 3000d;
        float PsCinco = 3400f;
        boolean isPsCincoCompravel = valorEmContaCorrente > PsCinco || valorEmContaPoupanca > PsCinco;
        System.out.println("isPsCincoCompravel "+isPsCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1600;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus "+bonus);

        //
        int contador = 0;
        contador++;
        System.out.println("contador "+contador);
    }
}
