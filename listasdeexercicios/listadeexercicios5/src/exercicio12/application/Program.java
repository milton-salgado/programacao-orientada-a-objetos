package exercicio12.application;

import exercicio12.entities.Aluno;
import exercicio12.entities.Disciplina;

public class Program {
    public static void main(String[] args) {
        Disciplina programacaoOrientadaAObjetos = new Disciplina("Programação Orientada a Objetos", 123, 80);
        Disciplina estruturaDeDados = new Disciplina("Estrutura de Dados", 456, 80);
        Disciplina bancoDeDados = new Disciplina("Banco de Dados", 789, 80);

        Aluno aluno1 = new Aluno("João", 1, 7.5, 8.0, 6.5);
        Aluno aluno2 = new Aluno("Maria", 2, 9.5, 8.0, 10.0);
        Aluno aluno3 = new Aluno("José", 3, 5.5, 6.0, 6.5);

        programacaoOrientadaAObjetos.matricularAluno(aluno1);
        programacaoOrientadaAObjetos.matricularAluno(aluno2);
        programacaoOrientadaAObjetos.matricularAluno(aluno3);

        System.out.println(programacaoOrientadaAObjetos + "\n");
        programacaoOrientadaAObjetos.imprimirAlunos();

        estruturaDeDados.matricularAluno(aluno1);
        estruturaDeDados.matricularAluno(aluno2);
        estruturaDeDados.matricularAluno(aluno3);

        System.out.println("\n" + estruturaDeDados + "\n");
        estruturaDeDados.imprimirAlunos();

        bancoDeDados.matricularAluno(aluno1);
        bancoDeDados.matricularAluno(aluno2);
        bancoDeDados.matricularAluno(aluno3);

        System.out.println("\n" + bancoDeDados + "\n");
        bancoDeDados.imprimirAlunos();

        bancoDeDados = null;
        estruturaDeDados = null;
        programacaoOrientadaAObjetos = null;

        System.out.println("\n" + aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}
