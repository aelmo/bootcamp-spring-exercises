package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.NumerosRomanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    @Autowired
    private NumerosRomanosService numerosRomanosService;

    @GetMapping("/romano/{decimal}")
    public String decimalParaNumeroRomano(@PathVariable int decimal) {
        return this.numerosRomanosService.decimalParaNumeroRomano(decimal);
    }
}
