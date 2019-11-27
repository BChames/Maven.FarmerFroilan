package models.people;

import models.animals.Horse;
import models.buildings.Field;
import models.buildings.Stable;
import models.crops.CropRow;
import models.crops.Earcorn;
import models.crops.Egg;
import models.crops.Tomato;
import models.vehicles.Cropduster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FroilandaTest {
    Froilanda froilanda;
    Horse horse1;
    Stable stable;
    Earcorn earcornOne, earcornTwo, earcornThree;
    Tomato tomato;
    Egg eggOne, eggTwo;
    Cropduster cropduster;
    CropRow cropRow1, cropRow2, cropRow3;
    Field field;

    @Before
    public void setUp(){
        froilanda = froilanda.wakeUp();
        horse1 = new Horse("Johnny");
        stable = new Stable();
        earcornOne = new Earcorn();
        earcornTwo = new Earcorn();
        earcornThree = new Earcorn();
        tomato = new Tomato();
        eggOne = new Egg();
        eggTwo = new Egg();
        cropduster = new Cropduster();
        cropRow1 = new CropRow();
        cropRow2 = new CropRow();
        cropRow3 = new CropRow();
        field = new Field();
    }

    @Test
    public void testMorning(){
        froilanda.ride();
        froilanda.dismount();
        stable.addFarmObject(horse1);
        froilanda.feed(horse1, earcornOne);
    }

    @Test
    public void testMount(){
        froilanda.mount(horse1);

        Assert.assertTrue(froilanda.getMounted());
        Assert.assertEquals(froilanda.getRidingOn(),horse1);
    }




}
