package br.com.meli.exercises.controller;

import br.com.meli.exercises.service.impl.AgeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
    @Autowired
    public AgeServiceImpl ageService = new AgeServiceImpl();

    @GetMapping("/{day}/{month}/{year}")
    public int getAgeByBornDate(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return ageService.getAgeByBornDate(day, month, year);
    }
}