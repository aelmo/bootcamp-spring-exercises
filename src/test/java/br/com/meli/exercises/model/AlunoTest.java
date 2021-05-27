package br.com.meli.exercises.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    @Test
    void calculaNotaMediaDasDisciplinas() {
        Disciplina disciplina1 = new Disciplina("Matematica", 10D);
        Disciplina disciplina2 = new Disciplina("Portugues", 6D);
        List<Disciplina> disciplinas = List.of(disciplina1, disciplina2);
        Aluno aluno = new Aluno("Joao", disciplinas);

        Double result = aluno.calculaMedia();

        assertEquals(8D, result);
    }
}
