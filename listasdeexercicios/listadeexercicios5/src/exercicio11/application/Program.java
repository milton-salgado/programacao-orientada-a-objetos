package exercicio11.application;

import exercicio11.entities.Carro;
import exercicio11.entities.Onibus;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Carro c1 = new Carro("VW");
        Carro c2 = new Carro("GM");
        Carro c3 = new Carro("Honda");
        ArrayList<Carro> lc = new ArrayList<Carro>();
        lc.add(c1);
        lc.add(c2);
        lc.add(c3);
        lc.getFirst().liga(); // A mensagem exibida é "VW ligado"
        // lc = null; // Linha descomentada.
        c1.liga(); // A mensagem exibida é "VW ligado"
        // As mensagens exibidas são "VW ligado" e "VW ligado", referentes ao primeiro carro.
        // O objeto c1 não foi afetado pela linha lc = null, pois a referência lc é que foi anulada.
        // lc.getFirst().liga(); // O objeto lc não existe mais, então uma exceção é lançada, NullPointerException.
        c2.liga(); // A mensagem exibida é "GM ligado"
        c3.liga(); // A mensagem exibida é "Honda ligado"
        // Os objetos c2 e c3 não foram afetados pela linha lc = null, pois a referência lc é que foi anulada.
        Onibus o1 = new Onibus("MeuOnibus");
        o1.liga(); // A mensagem exibida é "null ligado (Veiculo)"
        // A mensagem produzida fala em Veiculo pois o método liga() da classe Onibus não foi sobrescrito,
        // e portanto, é o mesmo da classe Veiculo.
        // Além disso, a mensagem produzida contém um erro, pois deveria ser "MeuOnibus ligado (Veiculo)".
        // Isso ocorre porque o atributo modelo da classe Onibus não é o utilizado no método ligar(), e portanto, como
        // esse método foi herdado da classe Veiculo, o atributo modelo de Veiculo
        // (que tem valor null, visto que não foi inicializado em nenhum momento) foi o utilizado no método.
        o1.desliga(); // A mensagem exibida é "null desligado (Veiculo Terrestre)"
        // A mensagem produzida fala em Veiculo Terrestre pois o método desliga() da classe Onibus não foi sobrescrito,
        // e portanto, é o mesmo da classe VeiculoTerrestre.
        // Além disso, a mensagem produzida contém um erro, pois deveria ser "MeuOnibus desligado (Veiculo Terrestre)".
        // Isso ocorre porque o atributo modelo da classe Onibus não é o utilizado no método desliga(), e portanto, como
        // esse método foi herdado da classe VeiculoTerrestre, o atributo modelo de VeiculoTerrestre
        // (herdado de Veiculo e portanto tem valor null, visto que não foi inicializado em nenhum momento) foi o utilizado no método.
        // Para corrigir, basta remover o atributo modelo da classe Onibus, visto que agora o atributo modelo de Veiculo
        // não será sobrescrito pela classe Onibus (o atributo modelo em Onibus sobreporia o atributo modelo de Veiculo,
        // perdendo assim a referência para o atributo modelo de VeiculoTerrestre, que por sua vez perderia a referência para o atributo modelo de Veiculo),
        // mas sim herdado dessa classe, e portanto, ao ser construído um objeto Onibus, agora o valor da String modelo será preenchido em toda a relação de Herança entre Onibus, VeiculoTerrestre e Veiculo.
    }
}
