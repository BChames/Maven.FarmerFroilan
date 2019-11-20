package models.crops;

import interfaces.*;

public class TomatoPlant implements Crop, Produce {
    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public Boolean getFertilized() {
        return null;
    }

    public Boolean offFertilize() {
        return null;
    }


    public Edible yield() {
        return null;
    }
}
