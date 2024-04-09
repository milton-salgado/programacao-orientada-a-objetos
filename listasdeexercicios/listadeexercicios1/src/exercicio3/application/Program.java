package exercicio3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
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