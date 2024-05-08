package exercicio13.application;

import exercicio13.entities.Residencia;

public class Program {
    public static void main(String[] args) {
        Residencia casa = new Residencia("Sala", 20);
        casa.adicionaComodo("Quarto", 10);
        casa.adicionaComodo("Cozinha", 15);
        casa.adicionaComodo("Banheiro", 5);

        System.out.println(casa);
        System.out.println("Área total: " + casa.calculaAreaTotal());

        Residencia apartamento = new Residencia("Sala", 15);
        apartamento.adicionaComodo("Quarto", 10);
        apartamento.adicionaComodo("Cozinha", 10);
        apartamento.adicionaComodo("Banheiro", 5);

        System.out.println(apartamento);
        System.out.println("Área total: " + apartamento.calculaAreaTotal());

        casa = null;
        apartamento = null;

        System.out.println("Área total: " + apartamento.calculaAreaTotal());
    }
}
