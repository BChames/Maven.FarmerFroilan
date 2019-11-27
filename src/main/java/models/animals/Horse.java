package models.animals;

import interfaces.*;

import java.util.ArrayList;
import java.util.List;


public class Horse implements Animal, Eater, NoiseMaker, Ridable {
    private ArrayList<Edible> stomach = new ArrayList<Edible>();
    private int rideTimeMinutes;
    String name;

    public String getName() {
        return name;
    }

    public Horse(String name) {
        this.name = name;
    }

    public void eat(Edible food) {
        this.stomach.add(food);
    }

    public String makeNoise() {
        return "Neigh neighhhhhh I'm a horse";
    }

    public ArrayList<Edible> getStomach() {
        return this.stomach;
    }

    public int getRideTime() {
        return rideTimeMinutes;
    }

    public void setRideTimeMinutes(int rideTimeMinutes) {
        this.rideTimeMinutes = rideTimeMinutes;
    }

}
