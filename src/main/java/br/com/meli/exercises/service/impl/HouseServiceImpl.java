package br.com.meli.exercises.service.impl;

import br.com.meli.exercises.model.House;
import br.com.meli.exercises.model.Room;
import br.com.meli.exercises.service.HouseService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.HashMap;

@Component
public class HouseServiceImpl implements HouseService {

    @Override
    public House getHouseSize(House house) {
        Double totalSize = 0.0;

        for(Room room: house.getRooms()) {
            totalSize = totalSize + (room.getSize());
        }

        house.setTotalSize(totalSize);
        return house;
    }

    public House getHouseAmount(House house) {
        Double totalSize = this.getHouseSize(house).getTotalSize();
        house.setAmount(totalSize * 800);
        return house;
    }

    public Room getBiggestRoom(House house) {
        return house.getBiggestRoom();
    }

    public HashMap<String, Double> getTotalSizeByRoom(House house) {
        HashMap<String, Double> roomSizesHashMap = new HashMap<>();

        for(Room room: house.getRooms()) {
            roomSizesHashMap.put(room.getName(),                                                            room.getSize());
        }

        return roomSizesHashMap;
    }
}
