package exercicio7.entities.enums.enums;

public enum Tipo {
    OUROS("ouros"),
    ESPADAS("espadas"),
    PAUS("paus"),
    COPAS("copas");

    private String naipe;

    Tipo(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return naipe;
    }
}
