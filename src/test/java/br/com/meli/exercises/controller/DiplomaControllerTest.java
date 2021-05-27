package br.com.meli.exercises.controller;

import br.com.meli.exercises.model.Aluno;
import br.com.meli.exercises.model.Disciplina;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.sql.Statement;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DiplomaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void retornaDiploma() throws Exception {
        Disciplina disciplina1 = new Disciplina("Matematica", 10D);
        Disciplina disciplina2 = new Disciplina("Portugues", 6D);
        List<Disciplina> disciplinas = List.of(disciplina1, disciplina2);
        Aluno aluno = new Aluno("Joao", disciplinas);

        ObjectMapper mapper = new ObjectMapper();
        String requestJson = mapper.writeValueAsString(aluno);

        mockMvc.perform(post("/diploma")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"nomeAluno\":\"Joao\",\"mensagem\":null,\"media\":8.0}"));
    }

    @Test
    void retornaDiplomaComParabensSeMediaMaiorOuIgualA9() throws Exception {
        Disciplina disciplina1 = new Disciplina("Matematica", 10D);
        Disciplina disciplina2 = new Disciplina("Portugues", 8D);
        List<Disciplina> disciplinas = List.of(disciplina1, disciplina2);
        Aluno aluno = new Aluno("Joao", disciplinas);

        ObjectMapper mapper = new ObjectMapper();
        String requestJson = mapper.writeValueAsString(aluno);

        mockMvc.perform(post("/diploma")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"nomeAluno\":\"Joao\",\"mensagem\":\"Parabens!!\",\"media\":9.0}"));
    }
}
