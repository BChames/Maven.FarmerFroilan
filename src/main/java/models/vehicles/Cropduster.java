package models.vehicles;

import interfaces.*;

public class Cropduster implements Vehicle, Ridable, Aircraft, NoiseMaker, FarmVehicle {

    public void fertilize() {

    }

    public String makeNoise() {
        return null;
    }
    public void setMounted(Boolean x){
        this.mounted = x;

    }

}
