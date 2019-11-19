package models.animals;

import interfaces.*;

import java.util.List;


public class Horse implements Animal, Eater, NoiseMaker, Ridable {
    private List<Edible> stomach;

    public void eat(Edible food) {
        this.stomach.add(food);
    }

    public String makeNoise() {
        return "Neigh neighhhhhh I'm a horse";
    }

    public List<Edible> getStomach() {
        return this.stomach;
    }




}
