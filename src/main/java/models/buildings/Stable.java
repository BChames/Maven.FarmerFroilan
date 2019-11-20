package models.buildings;

import interfaces.FarmStuff;
import models.animals.Horse;

import java.util.List;

public class Stable implements FarmStuff<Horse> {
    List<Horse> horses;

    public Stable(Horse... horses) {

    }


    public Boolean removeMultipleHorses(Integer numberOfHorses) {
        return null;
    }

    public Boolean addFarmObject(Horse horse) {
        return null;
    }

    public Boolean removeFarmObject(Horse horse) {
        return null;
    }

}
