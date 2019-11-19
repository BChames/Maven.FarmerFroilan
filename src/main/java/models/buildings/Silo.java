package models.buildings;

import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Silo {
    private List<Edible> silo;

    public Silo() {
        this.silo = new ArrayList<Edible>();
    }

    public Boolean addEdible(Edible food) {
        return silo.add(food);
    }

    public Boolean removeEdible(Edible food) {
        return silo.remove(food);
    }
}
