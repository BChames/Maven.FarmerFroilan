package models.crops;

import interfaces.Edible;

public class PizzaTree {
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
}
