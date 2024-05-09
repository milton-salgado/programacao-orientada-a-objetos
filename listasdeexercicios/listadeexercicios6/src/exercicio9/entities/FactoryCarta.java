package exercicio9.entities;

import exercicio9.entities.enums.Numero;
import exercicio9.entities.enums.Tipo;

import java.util.Random;

public class FactoryCarta {
    public static Carta criarCarta() {
        Random rand = new Random();

        Numero numero = Numero.values()[rand.nextInt(Numero.values().length)];
        Tipo tipo = Tipo.values()[rand.nextInt(Tipo.values().length)];

        return new Carta(numero, tipo);
    }
}
