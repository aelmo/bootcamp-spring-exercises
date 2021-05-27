package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.AgeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
    private final AgeService ageService;

    public AgeController(AgeService ageService) {
        this.ageService = ageService;
    }

    @GetMapping("/{day}/{month}/{year}")
    public int getAgeByBornDate(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return ageService.getAgeByBornDate(day, month, year);
    }
}
