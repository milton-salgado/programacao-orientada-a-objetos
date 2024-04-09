package exercicio5.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
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