package models.people;

import models.animals.Horse;
import models.buildings.Field;
import models.buildings.Silo;
import models.buildings.Stable;
import models.crops.*;
import models.produce.PizzaTree;
import models.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FroilanTest {
    Froilan froilan;
    Field field;
    CropRow cropRow, cropRow2, cropRow3;
    Stable stable;

    @Test
    public void setUp() {
        this.froilan = Froilan.wakeUp();
        this.field = new Field();
        this.cropRow = new CropRow();
        this.cropRow2 = new CropRow();
        this.cropRow3 = new CropRow();
        field.addToField(1, cropRow);
        field.addToField(2, cropRow2);
        field.addToField(3, cropRow3);
        Silo silo = new Silo();
        for (int i = 0; i < 60; i++) {
            silo.addEdible(new Egg());
            silo.addEdible(new Tomato());
            silo.addEdible(new Pizza());
        }
        this.stable = new Stable();
        for (int i = 0; i < 10; i++) {
            stable.addFarmObject(new Horse("Jim" + i));
        }


    }

    @Test
    public void plantTest() {
        TomatoPlant tom = new TomatoPlant();
        froilan.plant(tom, cropRow);
        Integer actual = cropRow.cropRowSize();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Egg eggo = new Egg();
        froilan.eat(eggo);
        Integer actual = froilan.howFull();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SundayFroilanTest() {
        TomatoPlant tomo = new TomatoPlant();
        PizzaTree pie = new PizzaTree();
        Cornstalk corny = new Cornstalk();
        for (int i = 0; i < 5; i++) {
            Egg egg = new Egg();
            froilan.eat(egg);
        }
        for (int i = 0; i < 2; i++) {
            Tomato tom = new Tomato();
            froilan.eat(tom);
        }
        Earcorn corn = new Earcorn();
        froilan.eat(corn);

        for (int i = 0; i < stable.size(); i++) {
            froilan.ride(stable.get(i), 20);
            froilan.feed(stable.get(i),new Earcorn());
        }

        froilan.plant(new TomatoPlant(), cropRow);
        froilan.plant(new  Cornstalk() , cropRow2);
        froilan.plant(new PizzaTree(), cropRow3);

    }

    @Test
    public void tuesdayFroilanTest() {
        Tractor tractor = new Tractor(froilan);
        for (int i = 0; i < 5; i++) {
            Egg egg = new Egg();
            froilan.eat(egg);
        }
        for (int i = 0; i < 2; i++) {
            Tomato tom = new Tomato();
            froilan.eat(tom);
        }
        Earcorn corn = new Earcorn();
        froilan.eat(corn);

        for (int i = 0; i < stable.size(); i++) {
            froilan.ride(stable.get(i), 20);
            froilan.feed(stable.get(i), new Earcorn());
        }


    }
}
