package models.buildings;

import interfaces.FarmStuff;

import java.util.ArrayList;
import java.util.List;

public class Farm implements FarmStuff<FarmStuff>{
    private List<FarmStuff> farm;

    public Farm() {
        this.farm = new ArrayList<FarmStuff>();
    }

    public Boolean addFarmObject(FarmStuff farmObject) {
        return farm.add(farmObject);
    }

    public Boolean removeFarmObject(FarmStuff farmObject) {
        return farm.remove(farmObject);
    }
}
