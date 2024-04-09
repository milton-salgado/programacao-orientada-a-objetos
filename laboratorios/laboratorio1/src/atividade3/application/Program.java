package atividade3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        double soma = nota1 + nota2;
        double media = soma / 2.0;

        if (media >= 7.0)
            System.out.println("Aprovado");
        else if (media >= 3)
            System.out.println("Prova final");
        else
            System.out.println("Reprovado");
    }
}
