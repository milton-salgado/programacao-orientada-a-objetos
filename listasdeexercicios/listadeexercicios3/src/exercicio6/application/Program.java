package exercicio6.application;

import exercicio6.entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "Gerente", 123, null, 5000.0, 30);
        Funcionario f2 = new Funcionario("Maria", "Assistente", 124, f1, 2000.0, 25);
        Funcionario f3 = new Funcionario("José", "Assistente", 125, f1, 2000.0, 25);
        Funcionario f4 = f2;

        System.out.println(f2.equals(f3));
        System.out.println(f2.mesmaChefia(f3));
        System.out.println(f2.equals(f4));
        System.out.println(f2.mesmaChefia(f4));
    }
}
