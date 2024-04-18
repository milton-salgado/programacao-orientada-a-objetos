package exercicio10.entities;

import exercicio10.enums.Trimestre;

public class Gerente extends Funcionario {
    public Gerente(String nome, int mat, double sal, Funcionario chefe) {
        super(nome, mat, sal, chefe);
    }

    @Override
    public double bonus(Trimestre t) {
        // Chamando bonus() do pai, pois se não, ele chama o próprio bonus, criando um efeito recursivo, visto que no exercício 7 o trimestre é o 3o, e não o 4o.
        // Agora o código não compila pois salario é private, e não protected, no exercício 8.
        return (t == Trimestre._4o) ? getSalario() * 0.15 : super.bonus(t);
    }
}
