package models.buildings;

import models.crops.CropRow;
import java.util.HashMap;
import java.util.Map;

public class Field {
    private Map<Integer, CropRow> field;

    public Field() {
        this.field = new HashMap();
    }

    public CropRow addToField(Integer row, CropRow cropRow) {
        return field.put(row, cropRow);
    }

    public CropRow removeFromField(Integer row) {
        return field.remove(row);
    }

}
