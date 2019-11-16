package models.buildings;

import interfaces.FarmStuff;
import java.util.List;

public class Farm {
    private List<FarmStuff> farm;

    public Boolean addToFarm(FarmStuff farmStuff) {
        return farm.add(farmStuff);
    }

    public Boolean removeFromFarm(FarmStuff farmStuff) {
        return farm.remove(farmStuff);
    }


}
