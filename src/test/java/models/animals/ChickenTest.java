package models.animals;

import interfaces.Edible;
import models.crops.Earcorn;
import models.crops.Egg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void makeNoiseTest(){

        Chicken testChicken = new Chicken(false);

        String expected = "cluck cluck I'm a chicken";
        String actual = testChicken.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){

        Earcorn cornTest = new Earcorn();
        Chicken testChicken = new Chicken(false);

        testChicken.stomach.add(cornTest);

        Assert.assertTrue(testChicken.getStomach().contains(cornTest));
    }

    @Test
    public void yieldTest(){

        Chicken testChicken = new Chicken(false);

        testChicken.yield();

        Assert.assertTrue(testChicken.yield() instanceof Egg);
    }

    @Test
    public void setFertilizeTest(){

        Chicken testChicken = new Chicken(false);

        testChicken.setHasBeenFertilized(true);

        Assert.assertTrue(testChicken.getHasBeenFertilized());
    }
}
