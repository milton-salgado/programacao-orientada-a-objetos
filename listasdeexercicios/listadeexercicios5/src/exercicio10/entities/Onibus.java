package exercicio10.entities;

public class Onibus extends VeiculoTerrestre {
    private Motor meuMotor;

    public Onibus(String modelo) {
        this.modelo = modelo;
        meuMotor = new Motor();
    }

    private class Motor {
        String modelo;

        public void liga() {
        }
    }
}
