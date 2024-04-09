package exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota = 0.0, soma = 0.0, media = 0.0;
        int cont = 0;

        while (nota != -1.0) {
            System.out.print("Nota " + (cont + 1) + ": ");
            nota = sc.nextDouble();

            if (nota != -1.0) {
                soma += nota;
                cont++;
            }
        }

        media = soma / cont;

        System.out.println("Média de notas da turma: " + media);

        sc.close();
    }
}