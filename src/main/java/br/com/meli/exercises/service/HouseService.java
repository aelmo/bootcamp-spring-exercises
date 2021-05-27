package br.com.meli.exercises.service;

import br.com.meli.exercises.model.House;
import br.com.meli.exercises.model.Room;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface HouseService {

    House getHouseSize(House house);

    House getHouseAmount(House house);

    Room getBiggestRoom(House house);

    HashMap<String, Double> getTotalSizeByRoom(House house);

}
