package models.crops;

import interfaces.*;

public class TomatoPlant implements Crop, Produce {
    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public Edible yield() {
        return null;
    }
}
