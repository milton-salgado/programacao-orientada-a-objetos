package exercicio4.entities;

public abstract class VeiculoTerrestre extends Veiculo {
    @Override
    public void desliga() {
        System.out.println(modelo + " desligado! (Veiculo Terrestre)");
    }
}
