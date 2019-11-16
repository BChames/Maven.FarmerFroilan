package models.buildings;

import interfaces.FarmStuff;
import models.animals.Chicken;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements FarmStuff<Chicken> {
    private List<Chicken> chickenCoop;

    public ChickenCoop() {
        chickenCoop = new ArrayList();
    }

    public Boolean removeMultipleChickens(Integer numberOfChickens) {
        return null;
    }

    public Boolean addFarmObject(Chicken chicken) {
        return chickenCoop.add(chicken);
    }

    public Boolean removeFarmObject(Chicken chicken) {
        return null;
    }
}








