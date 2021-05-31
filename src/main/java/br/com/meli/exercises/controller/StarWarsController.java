package br.com.meli.exercises.controller;

import br.com.meli.exercises.model.Character;
import br.com.meli.exercises.service.StarWarsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StarWarsController {
    private final StarWarsService starwarsService;

    public StarWarsController(StarWarsService starWarsService){
        this.starwarsService = starWarsService;
    }

    @GetMapping("/character/{nameCharacter}")
    public ResponseEntity getCharacteres(@PathVariable String nameCharacter){
        List<Character> character = starwarsService.findCharacter(nameCharacter);
        return new ResponseEntity(character, HttpStatus.OK);
    }

}
