package models.animals;

import interfaces.*;
import models.crops.Egg;

import java.util.List;

public class Chicken implements Animal, Eater, NoiseMaker, Produce {
    private Boolean hasBeenFertilized;
    private List<Edible> stomach;

    public Chicken(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;

    }

    public String makeNoise() {
        return "cluck cluck I'm a chicken";
    }

    public Boolean getFertilized() {
    }

    public Boolean offFertilize() {
        return null;
    }

    public Egg yield() {
        return new Egg();
    }

    public void eat(Edible produce) {
        this.stomach.add(produce);
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public List<Edible> getStomach() {
        return this.stomach;
    }
}
