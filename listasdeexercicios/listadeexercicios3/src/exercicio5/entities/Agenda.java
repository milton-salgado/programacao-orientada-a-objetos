package exercicio5.entities;

public class Agenda {
    private final int MAX = 100;
    private Contato[] meusContatos;
    private int total = 0;

    //Construtor:
    public Agenda() {
        meusContatos = new Contato[MAX];
    }

    public boolean ehDuplicado(Contato c) {
        for (int i = 0; i < total; ++i) {
            if (c.equals(meusContatos[i])) { // Chama o nosso "equals()"
                return true;
            }
        }
        return false;
    }

    public void listarContatos() {
        for (int i = 0; i < total; ++i) {
            System.out.println(meusContatos[i].getNome());
        }
        System.out.println("Total de " + total + " contatos listados.");
    }

    public boolean adicionarContato(Contato c) {
        if (total == MAX || ehDuplicado(c)) //Agenda lotada?
            return false;
        meusContatos[total] = c;
        ++total;
        return true;
    }

    public boolean removerContato(Contato c) {
        for (int i = 0; i < total; i++) {
            if (c == meusContatos[i]) {
                meusContatos[i] = meusContatos[total - 1];
                meusContatos[total - 1] = null;
                --total;
                return true;
            }
        }
        return false;

    }
}