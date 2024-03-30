package atividade1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        1ª atividade: Escreva um programa em Java que leia 2 raios R e r de entrada e
        calcula a área da coroa circular A = pi * (R^2 - r^2). Considere pi = 3,14159
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("R: ");
        double R = sc.nextDouble();

        System.out.print("r: ");
        double r = sc.nextDouble();

        double pi = 3.14159;
        double A = pi * (R * R - r * r);

        System.out.println("A = " + A);
    }
}
