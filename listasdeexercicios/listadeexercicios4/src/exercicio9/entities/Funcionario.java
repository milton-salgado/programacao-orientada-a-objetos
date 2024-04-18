package exercicio9.entities;

import exercicio9.entities.enums.Trimestre;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    private Funcionario chefe;

    public Funcionario(String n, int m, double s, Funcionario c) {
        nome = n;
        matricula = m;
        salario = s;
        chefe = c;
    }

    public double bonus(Trimestre t) {
        return salario * 0.1;
    }

    public String getNome() {
        return this.nome;
    }

    // Método equals() para comparar funcionários pela matrícula
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return false;
        if (!(obj instanceof Funcionario))
            return false;

        Funcionario f = (Funcionario) obj;

        System.out.println(f.matricula);

        return f.matricula == this.matricula;
    }
}
