package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.CodigoMorseService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CodigoMorseController {
    private CodigoMorseService codigoMorseService;

    public CodigoMorseController(CodigoMorseService codigoMorseService) {
        this.codigoMorseService = codigoMorseService;
    }

    @GetMapping(path = "/morse")
    public String traduzCodigoMorse(@RequestParam String codigoMorse) {
        return this.codigoMorseService.traduzCodigoMorse(codigoMorse);
    }
}
