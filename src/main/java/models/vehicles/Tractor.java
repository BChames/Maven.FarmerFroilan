package models.vehicles;

import interfaces.*;

public class Tractor implements Ridable, Vehicle, NoiseMaker, FarmVehicle {

    public String makeNoise() {
        return null;
    }

    public void harvest() {

    }

}
