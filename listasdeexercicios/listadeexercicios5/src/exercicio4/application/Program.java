package exercicio4.application;

import exercicio4.entities.Carro;

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
        lc.getFirst().liga();
        // lc = null
        c1.liga();
    }
}
