package models.vehicles;

import interfaces.*;
import models.buildings.Farm;

public class Tractor implements Ridable, Vehicle, NoiseMaker, FarmVehicle {

    public String makeNoise() {
        return null;
    }

}
