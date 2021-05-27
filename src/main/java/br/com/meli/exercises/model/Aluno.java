package br.com.meli.exercises.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public double calculaMedia() {
        double soma = 0;

        for(Disciplina disciplina: disciplinas) {
            soma += disciplina.getNota();
        }

        return soma/disciplinas.size();
    }

    public String getNome() {
        return this.nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
