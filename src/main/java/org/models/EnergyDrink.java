package org.models;

import java.util.UUID;

public class EnergyDrink {
    private UUID id;
    private String name;
    private String manufacturer;
    private double volume;
    private double price;
    private String description;

    public EnergyDrink(UUID id, String name, String manufacturer, double volume, double price, String description) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.volume = volume;
        this.price = price;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
