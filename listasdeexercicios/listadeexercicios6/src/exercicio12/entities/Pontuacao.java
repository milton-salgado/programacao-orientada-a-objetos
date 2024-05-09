package exercicio12.entities;

public class Pontuacao {
    private static Pontuacao instance;
    private int pontos;

    private Pontuacao() {
        this.pontos = 0;
    }

    public static Pontuacao getPontuacao() {
        if (instance == null)
            instance = new Pontuacao();

        return instance;
    }

    public void ganhaPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getPontos() {
        return pontos;
    }
}
