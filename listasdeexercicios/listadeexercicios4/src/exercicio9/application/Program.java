package exercicio9.application;

import exercicio9.entities.Funcionario;
import exercicio9.entities.Gerente;
import exercicio9.entities.enums.Trimestre;

public class Program {
    public static void main(String[] args) {
        Gerente jose = new Gerente("José", 2222, 10500.00, null);
        Funcionario eugenio = new Funcionario("Eugênio", 9999, 4500.00,
                jose);
        Trimestre t = Trimestre._4o;

        // Bônus de José: 10500 * 0.15 = 1575
        System.out.println("\nBônus de " + jose.getNome() + " no " + t + " trimestre:");
        System.out.println(jose.bonus(t));

        // Bônus de Eugênio: 4500 * 0.1 = 450
        System.out.println("\nBônus de " + eugenio.getNome() + " no " + t +
                " trimestre:");
        System.out.println(eugenio.bonus(t));
    }
}
