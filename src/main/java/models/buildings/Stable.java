package models.buildings;

import interfaces.FarmStuff;
import models.animals.Horse;

import java.util.List;

public class Stable implements FarmStuff {
    List<Horse> horses;

    public Stable(Horse... horses) {

    }

    public Boolean addHorse(Horse horse) {
        return null;
    }

    public Boolean removeHorse(Horse horse) {
        return null;
    }

    public Boolean removeMultipleHorses(Integer numberOfHorses) {
        return null;
    }
}
