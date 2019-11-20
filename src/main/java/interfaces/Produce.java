package interfaces;

import com.sun.org.apache.xpath.internal.operations.Bool;

public interface Produce {

    Boolean getFertilized();
    Boolean offFertilize();
    Edible yield();
}
