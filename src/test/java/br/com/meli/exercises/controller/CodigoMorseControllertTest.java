package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.CodigoMorseService;
import br.com.meli.exercises.service.impl.CodigoMorseServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CodigoMorseControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void Respond_With_Translated_Morse_Code_And_Status_Ok () throws Exception {
        String morse = "-- . .-. -.-. .- -.. ---   .-.. .. -... .-. .";

        mockMvc.perform(get("/morse")
                .param("codigoMorse", morse))
                .andExpect(status().isOk())
                .andExpect(content().string("mercado libre"));
    }
}
