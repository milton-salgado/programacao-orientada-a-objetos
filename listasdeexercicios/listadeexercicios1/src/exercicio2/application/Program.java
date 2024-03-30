package exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            Exercício 2: (Beecrowd 2702) Em um longo voo, companhias aéreas oferecem uma refeição aos
            seus passageiros. Geralmente as aeromoças conduzem carrinhos contendo as
            refeições pelos corredores do avião. Quando o carrinho chega em sua fileira, você é
            questionado imediatamente: “Frango, bife, ou massa?”. Você sabe suas opções,
            mas você tem apenas alguns segundos para escolher e você não sabe qual a
            aparência de sua escolha pois seu vizinho ainda não abriu o embrulho…

            A aeromoça deste voo decidiu alterar o procedimento. Primeiro ela vai perguntar a
            todos os passageiros qual sua escolha de refeição, e depois vai checar se o número
            de refeições disponíveis neste voo para cada escolha é suficiente.

            Por exemplo, considere que o número de refeições de frango, bife e massa
            disponíveis são respectivamente (80, 20, 40), enquanto o número de passageiros
            que escolheu frango, bife e massa seja respectivamente (45,23, 48). Neste caso,
            onze pessoas seguramente ficaram sem suas respectivas escolhas de refeição, já
            que três passageiros que queriam bife e oito que gostariam de massa não poderão
            ser atendidos.

            Dada a quantidade de refeições disponíveis para cada escolha e o número de
            refeições pedidas para cada escolha, você poderia por favor ajudar a aeromoça a
            determinar quantos passageiros seguramente não poderão ser atendidos?
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de refeições de frango, bife e massa: ");
        int refeicoesFrango = sc.nextInt(), refeicoesBife = sc.nextInt(), refeicoesMassa = sc.nextInt();

        System.out.print("Número de refeições pedidas de frango, bife e massa: ");
        int refeicoesPedidasFrango = sc.nextInt(), refeicoesPedidasBife = sc.nextInt(), refeicoesPedidasMassa = sc.nextInt();

        int totalPassageirosNaoAtentidos = 0;

        if (refeicoesFrango < refeicoesPedidasFrango)
            totalPassageirosNaoAtentidos += refeicoesPedidasFrango - refeicoesFrango;

        if (refeicoesBife < refeicoesPedidasBife)
            totalPassageirosNaoAtentidos += refeicoesPedidasBife - refeicoesBife;

        if (refeicoesMassa < refeicoesPedidasMassa)
            totalPassageirosNaoAtentidos += refeicoesPedidasMassa - refeicoesMassa;

        System.out.println("Total de passageiros que seguramente não poderão ser atendidos: " + totalPassageirosNaoAtentidos);

        sc.close();
    }
}