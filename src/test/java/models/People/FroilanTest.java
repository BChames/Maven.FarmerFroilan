package models.People;

import models.buildings.Field;
import models.crops.CropRow;
import models.crops.Egg;
import models.crops.TomatoPlant;
import models.people.Froilan;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

public class FroilanTest {
    Field field;
    CropRow cropRow;
    Froilan froilan = Froilan.wakeUp();

    @Before
    public void setUp() {

        this.field = new Field();
        this.cropRow = new CropRow();
        field.addToField(1,cropRow);

    }

    @Test
    public void plantTest() {
        TomatoPlant tom = new TomatoPlant();
        froilan.plant(tom,cropRow);
        int actual = cropRow.cropRowSize();
        int expected = 1;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void eatTest(){
        Egg eggo = new Egg();
        froilan.eat(eggo);
        Integer actual = froilan.howFull();
        Integer expected = 1;
        Assert.assertEquals(expected,actual);
    }

}
