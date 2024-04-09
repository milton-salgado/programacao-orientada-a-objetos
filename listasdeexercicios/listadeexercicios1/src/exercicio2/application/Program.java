package exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de refeições de frango, bife e massa: ");
        int refeicoesFrango = sc.nextInt(), refeicoesBife = sc.nextInt(), refeicoesMassa = sc.nextInt();

        System.out.print("Número de refeições pedidas de frango, bife e massa: ");
        int refeicoesPedidasFrango = sc.nextInt(), refeicoesPedidasBife = sc.nextInt(), refeicoesPedidasMassa = sc.nextInt();

        int totalPassageirosNaoAtentidos = 0;

        if (refeicoesFrango < refeicoesPedidasFrango)
            totalPassageirosNaoAtentidos += refeicoesPedidasFrango - refeicoesFrango;

        if (refeicoesBife < refeicoesPedidasBife)
            totalPassageirosNaoAtentidos += refeicoesPedidasBife - refeicoesBife;

        if (refeicoesMassa < refeicoesPedidasMassa)
            totalPassageirosNaoAtentidos += refeicoesPedidasMassa - refeicoesMassa;

        System.out.println("Total de passageiros que seguramente não poderão ser atendidos: " + totalPassageirosNaoAtentidos);

        sc.close();
    }
}