package exercicio12.application;

import exercicio12.entities.Pontuacao;

public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)
            Pontuacao.getPontuacao().ganhaPontos(10); // 10 20 30 40

        System.out.println(Pontuacao.getPontuacao().getPontos()); // 40

        Pontuacao p = new Pontuacao(); // Erro, pois o construtor é privado, visto que segue o padrão Singleton
    }
}
