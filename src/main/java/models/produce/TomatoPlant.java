package models.produce;

import interfaces.*;
import models.crops.Tomato;

public class TomatoPlant implements Crop, Produce {
    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public TomatoPlant() {
    }

    public Boolean getFertilized() {
        return null;
    }

    public Boolean offFertilize() {
        return null;
    }

    public Edible yield() {
        return new Tomato();
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void Fertilize() {

    }
}
