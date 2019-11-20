package models.animals;

import interfaces.*;

import java.util.ArrayList;
import java.util.List;


public class Horse implements Animal, Eater, NoiseMaker, Ridable {
    private ArrayList<Edible> stomach = new ArrayList<Edible>();

    public void eat(Edible food) {
        this.stomach.add(food);
    }

    public String makeNoise() {
        return "Neigh neighhhhhh I'm a horse";
    }

    public ArrayList<Edible> getStomach() {
        return this.stomach;
    }




}
