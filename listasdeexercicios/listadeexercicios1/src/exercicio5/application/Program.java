package exercicio5.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            Exercício 5: (Beecrowd 1017) Joaozinho quer calcular e mostrar a quantidade de litros de
            combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para
            isso, ele gostaria que você o auxiliasse através de um simples programa. Para
            efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a
            velocidade média durante a mesma (em km/h). Assim, pode-se obter distância
            percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor
            com 3 casas decimais após o ponto.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo gasto (em horas): ");
        double tempoGasto = sc.nextDouble();

        System.out.print("Velocidade média (em km/h): ");
        double velocidadeMedia = sc.nextDouble();

        double distanciaPercorrida = velocidadeMedia * tempoGasto;
        double litrosNecessarios = distanciaPercorrida / 12.0;

        System.out.printf("Litros necessários: %.3f%n", litrosNecessarios);
        
        sc.close();
    }
}