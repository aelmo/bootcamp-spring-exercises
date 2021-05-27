package br.com.meli.exercises.service.impl;

import br.com.meli.exercises.service.AgeService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class AgeServiceImpl implements AgeService {

    @Override
    public int getAgeByBornDate(int day, int month, int year) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}