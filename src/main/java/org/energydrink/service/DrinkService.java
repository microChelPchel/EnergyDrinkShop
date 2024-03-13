package org.energydrink.service;

import org.energydrink.service.LoadServices.DrinkLoadServices;
import org.models.EnergyDrink;

import java.io.IOException;
import java.util.List;

public class DrinkService {

    private final DrinkLoadServices drinkLoadServices;

    public DrinkService(DrinkLoadServices drinkLoadServices) {
        this.drinkLoadServices = drinkLoadServices;
    }

    public List<EnergyDrink> getAllDrinks() throws IOException {
        return  drinkLoadServices.get();
    }

}
