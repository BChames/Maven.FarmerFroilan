package models.animals;

import interfaces.*;

public class Horse implements Animal, Eater, NoiseMaker, Ridable {

    public void eat(Crop food) {
    }

    public String makeNoise() {
        return null;
    }
}
