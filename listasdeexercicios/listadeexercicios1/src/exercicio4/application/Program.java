package exercicio4.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char operacao = 'N';
        double resultado = 0.0;

        do {
            System.out.print("Operação: ");
            operacao = sc.nextLine().toUpperCase().charAt(0);

            if (operacao != 'S') {
                System.out.print("Valor 1: ");
                double valor1 = sc.nextDouble();

                System.out.print("Valor 2: ");
                double valor2 = sc.nextDouble();

                sc.nextLine();

                switch (operacao) {
                    case '+':
                        resultado = valor1 + valor2;
                        break;
                    case '-':
                        resultado = valor1 - valor2;
                        break;
                    case '*':
                        resultado = valor1 * valor2;
                        break;
                    case '/':
                        if (valor2 == 0.0) {
                            System.out.println("Erro: Divisão por zero.\n");
                            resultado = 0.0;
                        } else
                            resultado = valor1 / valor2;
                        break;
                    default:
                        break;
                }

                System.out.println("Resultado: " + resultado + "\n");
            }
        } while (operacao != 'S');

        sc.close();
    }
}