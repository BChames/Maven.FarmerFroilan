package models.buildings;

import models.crops.CropRow;
import java.util.Map;

public class Field {
    Map<Integer, CropRow> field;

    public Field() {
    }

    public CropRow addToField(Integer row, CropRow cropRow) {
        return field.put(row, cropRow);
    }

    public CropRow removeFromField(Integer row) {
        return field.remove(row);
    }

}
