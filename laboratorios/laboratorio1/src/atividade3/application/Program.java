package atividade3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        3ª atividade: Escreva um programa em Java que receba as duas notas de um aluno e
        calcule se o aluno ficou aprovado, em prova final ou reprovado. Considere:
        ● Aprovação: Média >= 7;
        ● Prova final: 3 <= Média < 7;
        ● Reprovação: Média < 3.
    */

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
