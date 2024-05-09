package exercicio9.application;

import exercicio9.entities.Carta;
import exercicio9.entities.FactoryCarta;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Carta> mao = new ArrayList<Carta>();

        for (int i = 0; i < 5; i++)
            mao.add(FactoryCarta.criarCarta());

        for (Carta carta : mao)
            System.out.println(carta.imprimir());
    }
}
