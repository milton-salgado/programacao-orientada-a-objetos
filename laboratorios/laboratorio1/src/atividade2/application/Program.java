package atividade2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        2ª atividade: Escreva um programa em Java que peça ao usuário seu nome, idade e
        altura e imprima na tela as três informações.
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
