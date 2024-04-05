package exercicio4.entitites;

public class Funcionario {
    private String nome;
    private double salarioHora;
    private final int ID_FUNC;
    private static int proxID = 1;
    public static final double SALARIO_HORA_MINIMO = 12.50;

    private double horasTrabalhadasMes;

    public Funcionario(String nome) {
        atualizaNome(nome);
        salarioHora = SALARIO_HORA_MINIMO;
        ID_FUNC = getProximoID();
        proxID++;
        reiniciaMesTrabalho();
    }

    public Funcionario(String nome, double salarioHora) {
        atualizaNome(nome);
        this.salarioHora = salarioHora >= SALARIO_HORA_MINIMO ? salarioHora : SALARIO_HORA_MINIMO;
        ID_FUNC = getProximoID();
        proxID++;
        reiniciaMesTrabalho();
    }

    public String getNome() {
        return nome;
    }

    public int getIDFuncionario() {
        return ID_FUNC;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double calculaSalarioMes() {
        return salarioHora * horasTrabalhadasMes;
    }

    public void reiniciaMesTrabalho() {
        horasTrabalhadasMes = 0;
    }

    public void atualizaNome(String nome) {
        if (nome.indexOf(' ') < nome.length() - 1 && nome.charAt(nome.indexOf(' ') + 1) != ' ')
            this.nome = nome;
    }

    public void atualizaSalarioHora(double salarioHora) {
        if (salarioHora > this.salarioHora && salarioHora > SALARIO_HORA_MINIMO)
            this.salarioHora = salarioHora;
    }

    public int getProximoID() {
        return proxID;
    }

    public void adicionaDiaDeTrabalho(double horasTrabalhadas) {
        if (horasTrabalhadas > 4.0 && horasTrabalhadas <= 24)
            horasTrabalhadasMes += horasTrabalhadas;
    }
}
