package atividade4.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        4ª atividade: Escreva um programa em Java que leia um número inteiro N de
        entrada e calcule recursivamente o seu fatorial.
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        int resultado = fatorial(N);
        System.out.println("N! = " + resultado);
    }

    public static int fatorial(int N) {
        if (N == 0)
            return 1;
        else if (N == 1)
            return 1;
        else
            return N * fatorial(N - 1);
    }
}
