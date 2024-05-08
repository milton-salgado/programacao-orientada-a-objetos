package exercicio11.entities;

public abstract class Veiculo {
    protected String modelo;

    public void liga() {
        System.out.println(modelo + " ligado! (Veiculo)");
    }

    public abstract void desliga();
}
