package models.produce;

import interfaces.Crop;
import interfaces.Edible;
import interfaces.Produce;
import models.crops.Pizza;

public class PizzaTree implements Crop, Produce {
    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public PizzaTree() {
    }

    public Edible yield() {
        return new Pizza();
    }

    public void setHasBeenHarvested(Boolean value) {
        this.hasBeenHarvested = value;
    }

    public void setHasBeenFertilized(Boolean value) {
        this.hasBeenHarvested = value;
    }

    public Boolean getHasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    public Boolean getHasBeenFertilized() {
        return this.hasBeenFertilized;
    }

    public void Fertilize() {

    }
}
