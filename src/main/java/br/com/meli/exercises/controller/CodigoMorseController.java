package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.CodigoMorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CodigoMorseController {
    private CodigoMorseService codigoMorseService;

    public CodigoMorseController(CodigoMorseService codigoMorseService) {
        this.codigoMorseService = codigoMorseService;
    }

    @GetMapping(path = "/morse", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String traduzCodigoMorse(@RequestBody String codigoMorse) {
        return this.codigoMorseService.traduzCodigoMorse(codigoMorse);
    }
}
