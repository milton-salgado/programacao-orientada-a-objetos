package exercicio3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            Exercício 3: (Beecrowd 1011) Faça um programa que calcule e mostre o volume de uma esfera
            sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi
            * R3. Considere pi = 3.14159.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Raio: ");
        double R = sc.nextDouble();

        double volume = (4.0 / 3.0) * pi * R * R * R;

        System.out.println("Volume: " + volume);

        sc.close();
    }
}