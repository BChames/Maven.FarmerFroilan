package models.animals;

import interfaces.*;
import models.crops.Egg;

import java.util.ArrayList;
import java.util.List;

public class Chicken implements Animal, Eater, NoiseMaker, Produce {
    private Boolean hasBeenFertilized;
    ArrayList<Edible> stomach = new ArrayList<Edible>();

    public Chicken(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;

    }

    public String makeNoise() {
        return "cluck cluck I'm a chicken";
    }

    public Egg yield() {
        return new Egg();
    }

    public void eat(Edible food) {
        this.stomach.add(food);
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public ArrayList<Edible> getStomach() {
        return this.stomach;
    }
}
