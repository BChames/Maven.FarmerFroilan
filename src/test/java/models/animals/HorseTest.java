package models.animals;

import models.crops.Earcorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void makeNoiseTest(){

        Horse testHorse = new Horse("Horsey");

        String expected = "Neigh neighhhhhh I'm a horse";
        String actual = testHorse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){

        Earcorn cornTest = new Earcorn();
        Horse testHorse = new Horse("Horsey");

        testHorse.eat(cornTest);

        Assert.assertTrue(testHorse.getStomach().contains(cornTest));
    }
}
