package exercicio8.entities;

public class Onibus extends VeiculoTerrestre {
    String modelo;
    private Onibus.Motor meuMotor;

    public Onibus(String modelo) {
        this.modelo = modelo;
        meuMotor = new Onibus.Motor();
    }

    private class Motor {
        String modelo;

        public void liga() {
        }
    }
}
