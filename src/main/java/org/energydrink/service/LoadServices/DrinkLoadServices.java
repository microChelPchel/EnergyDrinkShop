package org.energydrink.service.LoadServices;

import org.models.EnergyDrink;
import org.utils.common.BaseLoadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DrinkLoadServices extends BaseLoadFile<List<EnergyDrink>> {

    private static final String FILE_NAME = "EnergyDrinksData";

    public void add(EnergyDrink data) throws IOException {
        List<EnergyDrink> energyDrinks = getEnergyDrinks();
        energyDrinks.add(data);
        save(energyDrinks, FILE_NAME);
    }

    public List<EnergyDrink> get() throws IOException {
        return getEnergyDrinks();
    }

    public void update(EnergyDrink data) throws IOException {
        List<EnergyDrink> energyDrinks = getEnergyDrinks();
        energyDrinks.replaceAll(element -> {
            if (element.getId() == data.getId()) {
                return data;
            }
            return element;
        });
        save(energyDrinks, FILE_NAME);
    }

    public void save(List<EnergyDrink> data) throws IOException {
        save(data, FILE_NAME);
    }

    public void delete(EnergyDrink data) throws IOException {
        List<EnergyDrink> energyDrinks = getEnergyDrinks();
        energyDrinks.removeIf(item -> item.getId().equals(data.getId()));
        save(energyDrinks, FILE_NAME);
    }

    private List<EnergyDrink> getEnergyDrinks() throws IOException {
        try {
            return load(FILE_NAME);
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

}
