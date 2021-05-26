package br.com.meli.exercises.service.impl;

import br.com.meli.exercises.service.HouseService;
import org.springframework.stereotype.Component;

@Component
public class HouseImple implements HouseService {

    @Override
    public Double getTotalHouseSize(Double width, Double height) {
        return width * height;
    }
}
