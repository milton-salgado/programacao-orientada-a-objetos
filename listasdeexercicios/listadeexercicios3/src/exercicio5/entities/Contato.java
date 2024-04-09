package exercicio5.entities;

public class Contato {
    private String nome;
    private String tel;

    // Método construtor:
    public Contato(String nome, String tel) {
        // Note que o 'this' é necessário aqui!
        this.nome = nome == "" ? "Anônimo" : nome;
        this.tel = tel;
    }

    @Override
    public boolean equals(Object obj) { // Criaremos nossa definição de "igualdade"
        if (obj == this) // comparação de referência!
            return false; // Isso mesmo, falso! Entende o motivo?
        if (!(obj instanceof Contato)) // "Se obj *NÃO* é da classe Contato, então...
            return false; // ...obviamente não é uma duplicata.
        Contato c = (Contato) obj; // Convertemos o objeto genérico obj para o tipo Contato.
        // A classe String tb herda de Object, daí tb tem seu próprio "equals()"!
        return this.nome.equals(c.getNome()) && this.tel.equals(c.getTel());
    }

    public String getNome() {
        return nome; // O mesmo que "return this.nome"
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}