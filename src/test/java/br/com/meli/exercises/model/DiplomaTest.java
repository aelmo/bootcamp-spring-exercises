package br.com.meli.exercises.model;

import br.com.meli.exercises.model.Aluno;
import br.com.meli.exercises.model.Diploma;
import br.com.meli.exercises.model.Disciplina;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiplomaTest {

    @Test
    void retorna_Diploma_Nome_Media_e_Mensagem() {
        Disciplina disciplina1 = new Disciplina("Matematica", 10D);
        Disciplina disciplina2 = new Disciplina("Portugues", 6D);
        List<Disciplina> disciplinas = List.of(disciplina1, disciplina2);
        Aluno aluno = new Aluno("Joao", disciplinas);

        Diploma result = new Diploma(aluno);

        assertEquals(result.getMedia(), 8D);
    }
}