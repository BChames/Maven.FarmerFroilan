package models.animals;

import interfaces.*;
import models.crops.Egg;

public class Chicken implements Eater, Produce, NoiseMaker {
    private Boolean isEdible = true;

    public String makeNoise() {
        return null;
    }

    public Egg yield() {
        return null;
    }

    public void eat(Crop produce) {
    }
}
