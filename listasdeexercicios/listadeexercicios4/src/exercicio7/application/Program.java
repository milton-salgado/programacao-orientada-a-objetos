package exercicio7.application;

import exercicio7.entities.Funcionario;
import exercicio7.entities.Gerente;
import exercicio7.entities.enums.Trimestre;

public class Program {
    public static void main(String[] args) {
        Gerente jose = new Gerente("José", 2222, 10500.00, null);
        Funcionario eugenio = new Funcionario("Eugênio", 9999, 4500.00,
                jose);
        Trimestre t = Trimestre._3o;

        // Bônus de José: 10500 * 0.15 = 1575
        System.out.println("\nBônus de " + jose.getNome() + " no " + t + " trimestre:");
        System.out.println(jose.bonus(t));
        
        // Bônus de Eugênio: 4500 * 0.1 = 450
        System.out.println("\nBônus de " + eugenio.getNome() + " no " + t +
                " trimestre:");
        System.out.println(eugenio.bonus(t));
    }
}
