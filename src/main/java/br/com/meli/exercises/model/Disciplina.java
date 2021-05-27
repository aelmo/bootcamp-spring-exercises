package br.com.meli.exercises.model;

public class Disciplina {
    private String nome;
    private Double nota;

    public Disciplina(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public double getNota() {
        return this.nota;
    }
}
