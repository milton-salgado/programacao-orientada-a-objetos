package exercicio8.application;

import exercicio8.entities.Carro;
import exercicio8.entities.Onibus;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Carro c1 = new Carro("VW");
        Carro c2 = new Carro("GM");
        Carro c3 = new Carro("Honda");
        ArrayList<Carro> lc = new ArrayList<Carro>();
        lc.add(c1);
        lc.add(c2);
        lc.add(c3);
        lc.getFirst().liga(); // A mensagem exibida é "VW ligado"
        // lc = null; // Linha descomentada.
        c1.liga(); // A mensagem exibida é "VW ligado"
        // As mensagens exibidas são "VW ligado" e "VW ligado", referentes ao primeiro carro.
        // O objeto c1 não foi afetado pela linha lc = null, pois a referência lc é que foi anulada.
        // lc.getFirst().liga(); // O objeto lc não existe mais, então uma exceção é lançada, NullPointerException.
        c2.liga(); // A mensagem exibida é "GM ligado"
        c3.liga(); // A mensagem exibida é "Honda ligado"
        // Os objetos c2 e c3 não foram afetados pela linha lc = null, pois a referência lc é que foi anulada.
        Onibus o1 = new Onibus("MeuOnibus");
        o1.liga();
        o1.desliga();
    }
}
