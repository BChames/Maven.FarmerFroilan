package models.people;

import interfaces.*;
import models.crops.CropRow;

import java.util.List;

public class Froilanda implements NoiseMaker, Eater, Rider, Person, Pilot {
    private static final Froilanda INSTANCE = new Froilanda();
    private List<Edible> stomach;
    private Boolean mounted;
    private Ridable ridingOn;


    private Froilanda() {
    }

    public Froilanda wakeUp() {
        return INSTANCE;
    }

    public void operate(Vehicle vehicle) {

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

    public void fly(Aircraft aircraft) {

    }

//    public void eat(Crop food) {
//
//    }

    public Boolean plant(Crop crop, CropRow cropRow) {
        cropRow.addToCropRow(crop);
        return true;
    }

    public String makeNoise() {
        return "My husband is too old for me....";

    }

    public String ride() {
        return null;
    }

    public void eat(Edible food) {
    stomach.add(food);
    }


}
