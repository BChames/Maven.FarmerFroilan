package models.buildings;

import models.animals.Chicken;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickenCoop;

    public ChickenCoop() {
        chickenCoop = new ArrayList();
    }

    public Boolean addChicken(Chicken chicken) {
        return chickenCoop.add(chicken);
    }

    public Boolean removeChicken(Chicken chicken) {
        return null;
    }

    public Boolean removeMultipleChickens(Integer numberOfChickens) {
        return null;
    }
}







