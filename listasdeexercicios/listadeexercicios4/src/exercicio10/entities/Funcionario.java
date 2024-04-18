package exercicio10.entities;

import exercicio10.enums.Trimestre;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public boolean equals(Object obj) {
        if (obj == this)
            return false;
        if (!(obj instanceof Funcionario))
            return false;

        Funcionario f = (Funcionario) obj;

        return f.getMatricula() == this.matricula;
    }
}
