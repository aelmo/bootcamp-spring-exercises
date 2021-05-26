package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.NumerosRomanosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    private final NumerosRomanosService numerosRomanosService;

    NumerosRomanosController(NumerosRomanosService numerosRomanosService) {
        this.numerosRomanosService = numerosRomanosService;
    }

    @GetMapping(path = "/romano")
    public String decimalParaNumeroRomano(@RequestParam int decimal) {
        return this.numerosRomanosService.decimalParaNumeroRomano(decimal);
    }
}
