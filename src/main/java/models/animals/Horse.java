package models.animals;

import interfaces.*;
import java.util.List;

public class Horse implements Animal, Eater, NoiseMaker, Ridable {
    private List<Edible> stomach;

    public void eat(Crop food) {
    }

    public String makeNoise() {
        return null;
    }
}
