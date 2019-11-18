package models.animals;

import interfaces.*;

import java.util.List;

public class Horse implements Animal, Eater, NoiseMaker, Ridable {
    private List<Edible> stomach;

    public void eat(Crop food) {
        this.stomach.add((Edible) food);
    }

    public String makeNoise() {
        return "Neigh neighhhhhh I'm a horse";
    }

    public List<Edible> getStomach() {
        return this.stomach;
    }
}
