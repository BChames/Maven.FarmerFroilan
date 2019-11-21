package models.vehicles;

import interfaces.*;
import models.buildings.Silo;

public class Tractor implements Ridable, Vehicle, NoiseMaker, FarmVehicle {
    Rider rider;

    public Tractor(){

    }

    public Tractor(Rider rider){
        this.rider=rider;
    }

    public String makeNoise() {
        return null;
    }

    public void harvest(Produce produce, Silo silo) {
        if (this.rider != null){
            silo.addEdible(produce.yield());

        }

    }

}
