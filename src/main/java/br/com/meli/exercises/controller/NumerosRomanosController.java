package br.com.meli.exercises.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    final int[] valoresNumericos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    final String[] valoresRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    @GetMapping("/romano/{decimal}")
    public String decimalParaNumeroRomano(@PathVariable int decimal) {
        StringBuilder romano = new StringBuilder();

        for (int i = 0; i < valoresNumericos.length; i++) {
            while (decimal >= valoresNumericos[i]) {
                decimal -= valoresNumericos[i];
                romano.append(valoresRomanos[i]);
            }
        }

        return romano.toString();
    }
}
