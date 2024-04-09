package exercicio5.application;

import exercicio5.entities.Agenda;
import exercicio5.entities.Contato;

// Driver class - ponto de entrada da execução do código.
public class Program {
    public static void main(String[] args) {
        Agenda ag = new Agenda();
        Contato c1 = new Contato("João", "+55 21 99999-9999");
        Contato c2 = new Contato("João", "+55 21 92222-2222");
        Contato c3 = new Contato("Maria", "+55 21 98888-8888");
        Contato c4 = new Contato("José", "+55 21 97777-7777");
        Contato c5 = new Contato("", "+55 21 91111-1111");
        Contato c6 = new Contato("", "+55 21 91111-1111");
        ag.adicionarContato(c1);
        ag.adicionarContato(c2);
        ag.adicionarContato(c3);
        ag.adicionarContato(c4);
        ag.adicionarContato(c5);
        ag.adicionarContato(c6);
        ag.listarContatos();
        String d = (ag.ehDuplicado(c1)) ? "" : " NÃO";
        System.out.println("\nO contato " + c1.getNome() + d + " é duplicado.");
        String k = (ag.ehDuplicado(c6)) ? "" : " NÃO";
        System.out.println("\nO contato " + c6.getNome() + k + " é duplicado.");
        ag.removerContato(c1);
        ag.listarContatos();
    }
}