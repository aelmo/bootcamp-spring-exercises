package br.com.meli.exercises.controller;

import br.com.meli.exercises.model.House;
import br.com.meli.exercises.model.Room;
import br.com.meli.exercises.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("/house/size/")
    public House getTotalHouseSize(@RequestBody House house) {
        return houseService.getHouseSize(house);
    }

    @GetMapping("/house/value/")
    public House getHouseAmount(@RequestBody House house) {
        return houseService.getHouseAmount(house);
    }

    @GetMapping("/house/biggerRoom/")
    public Room getBiggerRoom(@RequestBody House house) {
        return houseService.getBiggerRoom(house);
    }

    @GetMapping("/house/room/sizes")
    public HashMap<String, Double> getTotalSizesByRoom(@RequestBody House house) {
        return houseService.getTotalSizeByRoom(house);
    }


}
