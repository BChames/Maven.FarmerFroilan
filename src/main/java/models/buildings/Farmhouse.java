package models.buildings;

import interfaces.FarmStuff;
import interfaces.Person;
import java.util.ArrayList;
import java.util.List;

public class Farmhouse implements FarmStuff<Person> {
    private List<Person> farmHouse = new ArrayList();

    public Farmhouse() {
    }

    public Boolean addFarmObject(Person person) {
        return null;
    }

    public Boolean removeFarmObject(Person person) {
        return null;
    }
}


