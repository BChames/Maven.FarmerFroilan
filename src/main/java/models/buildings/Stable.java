package models.buildings;

import interfaces.FarmStuff;
import models.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable implements FarmStuff<Horse> {


    List<Horse> stable = new ArrayList<Horse>();


    public Stable(Horse... horses) {
        for (Horse i : horses) {
            this.stable.add(i);
        }
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

    public Horse get(int num) {
        return stable.get(num);
    }
    public Integer size() {
        return stable.size();
    }

    public Horse findHorseByName(String name, Stable stable) {
        Horse finder = null;
        for (int i = 0; i < stable.size(); i++) {
            if (stable.get(i).getName().equals(name)){
                finder = stable.get(i);
            }
        } return finder;
    }
}

