package exercicio13.entities;

import java.util.ArrayList;

public class Residencia {
    private class Comodo {
        private String nome;
        private double area;

        private Comodo(String nome, double area) {
            this.nome = nome;
            this.area = area;
        }

        private String getNome() {
            return nome;
        }

        private void setNome(String nome) {
            this.nome = nome;
        }

        private double getArea() {
            return area;
        }

        private void setArea(double area) {
            this.area = area;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + " - Área: " + String.format("%.2f", area);
        }
    }

    private ArrayList<Comodo> comodos = new ArrayList<>();

    public Residencia(String nome, double area) {
        adicionaComodo(nome, area);
    }

    public void adicionaComodo(String nome, double area) {
        comodos.add(new Comodo(nome, area));
    }

    public double calculaAreaTotal() {
        double areaTotal = 0;
        for (Comodo comodo : comodos)
            areaTotal += comodo.getArea();

        return areaTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Comodo comodo : comodos)
            sb.append(comodo).append("\n");

        return sb.toString();
    }

    public String getComodo(String nome) {
        for (Comodo comodo : comodos)
            if (comodo.getNome().equals(nome))
                return comodo.toString();

        return null;
    }

    public void setComodo(String nome, double area) {
        for (Comodo comodo : comodos) {
            if (comodo.getNome().equals(nome)) {
                comodo.setArea(area);
                return;
            }
        }
    }

    public void removeComodo(String nome) {
        for (Comodo comodo : comodos) {
            if (comodo.getNome().equals(nome)) {
                comodos.remove(comodo);
                return;
            }
        }
    }
}
