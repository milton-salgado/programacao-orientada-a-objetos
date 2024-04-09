package exercicio6.entities;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, Funcionario chefe, double salario, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.chefe = chefe;
        this.salario = salario;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Funcionario))
            return false;

        Funcionario f = (Funcionario) obj;

        return f.getMatricula() == matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean mesmaChefia(Funcionario f) {
        return chefe.equals(f.getChefe());
    }
}
