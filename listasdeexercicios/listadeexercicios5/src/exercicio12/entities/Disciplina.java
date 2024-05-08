package exercicio12.entities;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int codigo;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, int codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void desmatricularAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : alunos)
            System.out.println(aluno);
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + " - Código: " + codigo + " - Carga Horária: " + cargaHoraria;
    }

}
