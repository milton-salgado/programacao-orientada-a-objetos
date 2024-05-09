package exercicio8.entities;

import exercicio8.entities.enums.Numero;
import exercicio8.entities.enums.Tipo;
import exercicio8.entities.interfaces.Printavel;

public class Carta implements Printavel {
    private class Naipe {
        private Tipo naipe;

        public Naipe(Tipo naipe) {
            this.naipe = naipe;
        }

        @Override
        public String toString() {
            return naipe.toString();
        }
    }
        private Numero valor;
        private Naipe naipe;

    public Carta(Numero valor, Tipo naipe) {
        this.valor = valor;
        this.naipe = new Naipe(naipe);
    }

    public String imprimir() {
        return valor.toString() + " de " + naipe.toString();
    }
}
