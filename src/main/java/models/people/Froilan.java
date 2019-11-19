package models.people;

import interfaces.*;
import models.crops.CropRow;
import java.util.List;

public class Froilan implements Farmer, Botanist, NoiseMaker, Eater, Rider, Person {
    private static final Froilan INSTANCE = new Froilan();
    private List<Edible> stomach;
    Boolean mounted;

    public Froilan wakeUp() {
        return INSTANCE;
    }

    public void operate(Vehicle vehicle) {

    }

    public void mount(Ridable ridable) {
        setMounted(true);
    }

    public void dismount() {
        setMounted(false);
    }

    public void setMounted(Boolean mounted) {
        this.mounted = mounted;
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

}
