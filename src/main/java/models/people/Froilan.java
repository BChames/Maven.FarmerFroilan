package models.people;

import interfaces.*;
import models.crops.CropRow;
import java.util.List;

public class Froilan implements Farmer, Botanist, NoiseMaker, Eater, Rider, Person {
    private static final Froilan INSTANCE = new Froilan();
    private List<Edible> stomach;


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

    public Boolean plant(Crop crop, CropRow cropRow) {
        return null;
    }

    public String makeNoise() {
        return null;
    }

    public String ride() {
        return null;
    }
}
