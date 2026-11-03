package exercicio.samu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tema {
    private String nome;
    private int id;
    private List<Ajuda> ajudas;

    public Tema(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.ajudas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAjuda(Ajuda ajuda) {
        if (this.ajudas.size() < 100) {
            this.ajudas.add(ajuda);
        }
    }

    public int contarAjudas() {
        return this.ajudas.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tema tema = (Tema) o;
        return id == tema.id && Objects.equals(nome, tema.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEMA ").append(nome).append(" ").append(id);
        for (Ajuda ajuda : ajudas) {
            sb.append("\n | ").append(ajuda.toString());
        }
        return sb.toString();
    }
}