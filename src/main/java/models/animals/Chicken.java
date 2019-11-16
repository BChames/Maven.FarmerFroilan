package models.animals;

import interfaces.*;
import models.crops.Egg;

import java.util.List;

public class Chicken implements Animal, Eater, NoiseMaker, Produce {
    private Boolean hasBeenFertilized;
    private List<Edible> stomach;

    public Chicken(Boolean hasBeenFertilized) {

    }

    public String makeNoise() {
        return null;
    }

    public Egg yield() {
        return null;
    }

    public void eat(Crop produce) {
    }
}
