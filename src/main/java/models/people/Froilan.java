package models.people;

import interfaces.*;
import models.animals.Horse;
import models.crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Froilan implements Farmer, Botanist, NoiseMaker, Eater, Rider, Person {
    private static final Froilan INSTANCE = new Froilan();
    private ArrayList<Edible> stomach = new ArrayList<Edible>();
    private Boolean mounted;
    private Ridable ridingOn;


    public static Froilan wakeUp() {
        return INSTANCE;

    }

    public void mount(Ridable ridable) {
        setRidingOn(ridable);
    }

    public void dismount() {
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

    public Integer howFull(){
        return stomach.size();
    }


    public String ride(Horse horse, Integer minutes) {
        mount(horse);
        horse.setRideTimeMinutes(horse.getRideTime()+minutes);
        dismount();
        return "Froilan rode " + horse.getName() +" for " + minutes +" minutes.";
    }

    public void operate(Vehicle vehicle) {

    }
    public void feed(Horse horse, Edible edible){
        for (int i = 0; i < 3; i++) {
            horse.eat(edible);
    }
}
}
