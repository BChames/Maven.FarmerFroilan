package models.people;

import interfaces.*;
import models.crops.CropRow;

import java.util.List;

public class Froilan implements Farmer, Botanist, NoiseMaker, Eater, Rider, Person {
    private static final Froilan INSTANCE = new Froilan();
    private List<Edible> stomach;
    private Boolean mounted;
    private Ridable ridingOn;


    public Froilan wakeUp() {
        return INSTANCE;

    }

    public void mount(Ridable ridable) {
        setMounted(true);
        setRidingOn(ridable);
    }

    public void dismount() {
        setMounted(false);
        setRidingOn(null);
    }

    public void setMounted(Boolean mountStatus) {
        mounted = mountStatus;
    }

    public void setRidingOn(Ridable ridingOn) {
        this.ridingOn = ridingOn;
    }

    public void eat(Edible food) {
        stomach.add(food);

    }

    public Boolean plant(Crop crop, CropRow cropRow) {
        cropRow.addToCropRow(crop);
        return true;
    }

    public String makeNoise() {
        return "I'm too old for this...";
    }

    public String ride() {
        return null;
    }

    public void operate(Vehicle vehicle) {

    }
}
