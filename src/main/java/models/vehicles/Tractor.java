package models.vehicles;

import interfaces.*;

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

    public void harvest(Produce produce) {
        if (this.rider != null){
            produce.yield();
        }

    }

}
