package br.com.meli.exercises.controller;


import br.com.meli.exercises.model.Aluno;
import br.com.meli.exercises.model.Diploma;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping
    ResponseEntity diploma(@RequestBody Aluno aluno) {
        Diploma diploma = new Diploma(aluno);

        return new ResponseEntity(diploma, HttpStatus.OK);
    }
}
