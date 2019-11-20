package models.crops;

import interfaces.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CropRow {
    private List<Crop> cropRow;

    public CropRow() {
        this.cropRow = new ArrayList<Crop>();
    }

    public void addToCropRow(Crop ... crops) {
        List<Crop> cropsList = Arrays.asList(crops);
        cropRow.addAll(cropsList);
    }

    public void addToCropRow(Crop crop) {
        cropRow.add(crop);
    }
}
