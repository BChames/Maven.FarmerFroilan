package models.vehicles;

import interfaces.*;

public class Cropduster implements Vehicle, Ridable, Aircraft, NoiseMaker, FarmVehicle {

    public void fertilize() {

    }

    public String makeNoise() {
        return null;
    }

}
