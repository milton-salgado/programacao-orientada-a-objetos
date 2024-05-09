package exercicio6.entities;

import exercicio6.entities.enums.Numero;
import exercicio6.entities.enums.Tipo;

public class Carta {
    private class Naipe {
        private Tipo naipe;

        public Naipe(Tipo naipe) {
            this.naipe = naipe;
        }
    }
        private Numero valor;
        private Naipe naipe;

    public Carta(Numero valor, Tipo naipe) {
        this.valor = valor;
        this.naipe = new Naipe(naipe);
    }
}
