package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.CodigoMorseService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CodigoMorseController {

    private final CodigoMorseService codigoMorseService;

    public CodigoMorseController(CodigoMorseService codigoMorseService) {
        this.codigoMorseService = codigoMorseService;
    }

    @PostMapping(path = "/morse", consumes = "application/json", produces = "application/json")
    public String traduzCodigoMorse(@RequestBody String codigoMorse) {
        return this.codigoMorseService.traduzCodigoMorse(codigoMorse);
    }
}
