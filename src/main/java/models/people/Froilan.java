package models.people;

import interfaces.*;

public class Froilan implements Farmer, Botanist, NoiseMaker, Eater, Rider, Person {
    private static final Froilan INSTANCE = new Froilan();

    public Froilan wakeUp() {
        return INSTANCE;
    }

    public void operate(Vehicle vehicle) {

    }

    public void mount(Ridable ridable) {

    }

    public void dismount() {

    }

    public void eat(Crop food) {

    }

    public Boolean plant(Crop crop) {
        return null;
    }

    public String makeNoise() {
        return null;
    }

    public String ride() {
        return null;
    }
}
