package models.animals;

import interfaces.*;
import models.crops.Egg;

public class Chicken implements Animal, Eater, NoiseMaker {
    private Boolean hasBeenFertilized;

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
