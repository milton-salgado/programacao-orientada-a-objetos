package exercicio6.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            Exercício 6: Faça um programa que
            a) adivinhe o número que o usuário pensou entre 0 e 100 e
            b) diga a quantidade de chamadas que o programa precisou fazer para
            encontrar o número.
            Seu programa deve perguntar ao usuário tão somente se o número impresso na tela é o
            correto. Em caso negativo, perguntar se o número é maior ou menor que o exibido.
        */

        Scanner sc = new Scanner(System.in);

        int minimo = 0, maximo = 100, chamadas = 0, numero = (maximo + minimo) / 2;
        String resultado = "";

        do {
            System.out.print("O número que você pensou é " + numero + "? ");
            resultado = sc.nextLine().toLowerCase();

            if (!resultado.equals("sim")) {
                System.out.print("O número que você pensou é maior ou menor que " + numero + "? ");
                resultado = sc.nextLine();

                if (resultado.equals("maior"))
                    minimo = numero + 1;
                else if (resultado.equals("menor"))
                    maximo = numero - 1;

                numero = (minimo + maximo) / 2;
            }

            chamadas++;
        } while (!resultado.equals("sim"));

        System.out.println("\nQuantidade de chamadas para encontrar o número: " + chamadas);

        sc.close();
    }
}