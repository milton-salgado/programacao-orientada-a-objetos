package exercicio4.entities;

public class Carro extends VeiculoTerrestre {
    String modelo;
    private Motor meuMotor;
    public Carro(String modelo) {
        this.modelo = modelo;
        meuMotor = new Motor();
    }

    @Override
    public void liga() {
        meuMotor.liga();
        System.out.println(modelo + " ligado! (Carro)");
    }

    private class Motor {
        String modelo;

        public void liga() {
        }
    }
}
