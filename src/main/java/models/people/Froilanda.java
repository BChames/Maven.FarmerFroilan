package models.people;

import interfaces.*;
import java.util.List;

public class Froilanda implements NoiseMaker, Eater, Rider, Person, Pilot {
    private static final Froilanda INSTANCE = new Froilanda();
    private List<Edible> stomach;


    private Froilanda() {
    }

    public Froilanda wakeUp() {
        return INSTANCE;
    }

    public void operate(Vehicle vehicle) {

    }

    public void mount(Ridable ridable) {

    }

    public void dismount() {

    }

    public void fly(Aircraft aircraft) {

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
