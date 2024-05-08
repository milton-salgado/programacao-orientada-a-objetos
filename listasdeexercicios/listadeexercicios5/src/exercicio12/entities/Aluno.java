package exercicio12.entities;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " - Matrícula: " + matricula + " - Média: " + String.format("%.2f", calculaMedia());
    }
}
