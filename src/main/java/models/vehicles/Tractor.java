package models.vehicles;

import interfaces.*;

public class Tractor implements Ridable, Vehicle, NoiseMaker, FarmVehicle {
    Boolean mounted;

    public String makeNoise() {
        return null;
    }

    public void harvest() {


    }

}
