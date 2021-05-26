package br.com.meli.exercises.model;

import java.util.List;

public class House {
    private String name;
    private String alias;
    private List<Room> rooms;
    private Double amount;
    private Double totalSize;

    public House(String name, String alias, List<Room> rooms) {
        this.name = name;
        this.alias = alias;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Double totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", rooms=" + rooms +
                ", amount=" + amount +
                ", totalSize=" + totalSize +
                '}';
    }


}
