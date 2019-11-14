package models.vehicles;

import interfaces.*;
import models.buildings.Farm;

public class Cropduster implements Vehicle, Ridable, Aircraft, NoiseMaker, FarmVehicle {

    public void fertilize() {

    }

    public String makeNoise() {
        return null;
    }

}
