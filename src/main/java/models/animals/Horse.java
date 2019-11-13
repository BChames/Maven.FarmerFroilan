package models.animals;

import interfaces.*;
import models.crops.Produce;

public class Horse implements Eater, NoiseMaker {
    private Boolean ridable = true;

    public void eat(Crop food) {
    }

    public String makeNoise() {
        return null;
    }
}
