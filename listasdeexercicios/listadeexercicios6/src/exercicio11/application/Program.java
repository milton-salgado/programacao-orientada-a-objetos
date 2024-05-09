package exercicio11.application;

import exercicio11.entities.Pontuacao;

public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)
            Pontuacao.getPontuacao().ganhaPontos(10); // 10 20 30 40

        System.out.println(Pontuacao.getPontuacao().getPontos()); // 40
    }
}
