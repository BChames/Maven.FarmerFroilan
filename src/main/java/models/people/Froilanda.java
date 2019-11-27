package models.people;

import interfaces.*;
import models.animals.Horse;
import models.crops.CropRow;
import models.vehicles.Cropduster;

import java.util.List;

public class Froilanda extends Cropduster implements NoiseMaker, Eater, Rider, Person, Pilot {
    private static final Froilanda INSTANCE = new Froilanda();
    private List<Edible> stomach;
    private Boolean mounted;
    private Ridable ridingOn;


    private Froilanda() {
    }

    public Froilanda wakeUp() {
        return INSTANCE;
    }

//    public void operate(Vehicle vehicle) {
//
//    }


    public void mount(Ridable ridable) {
        setMounted(true);
        setRidingOn(ridable);
    }

    public void dismount() {
        setMounted(false);
        setRidingOn(null);
    }

    private void setMounted(Boolean mountStatus) {
        mounted = mountStatus;
    }

    private void setRidingOn(Ridable ridingOn) {
        this.ridingOn = ridingOn;
    }

    public Ridable getRidingOn(){
        return ridingOn;
    }

    public void fly(Aircraft aircraft) {
        setMounted(true);
    }

//    public void eat(Crop food) {
//
//    }

    public Boolean plant(Crop crop, CropRow cropRow) {
        cropRow.addToCropRow(crop);
        return true;
    }

    public String makeNoise() {
        return "My brother is a trash farmer....";

    }

    public String ride() {
        return "Vroom vroom";
    }

    public void eat(Edible food) {
    stomach.add(food);
    }

    public Integer howFull(){
        return stomach.size();
    }

    public void feed(Horse horse, Edible edible) {
        for (int i = 0; i < 3; i++) {
            horse.eat(edible);
        }
    }

    public String ride(Horse horse, Integer minutes) {
        mount(horse);
        horse.setRideTimeMinutes(horse.getRideTime()+minutes);
        dismount();
        return "Froilanda rode " + horse.getName() +" for " + minutes +" minutes.";
    }


    public boolean getMounted() {
        return mounted;
    }
}
