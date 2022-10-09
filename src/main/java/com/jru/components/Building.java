package com.jru.components;

import com.jru.reader.BuildingPropertiesReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Building {
    private int floorCount; // количество этажей в здании
    private List<Floor> floorList;


    public Building() {
        buildingGenerator();
    }

    private void buildingGenerator() {
        BuildingPropertiesReader propertiesReader = new BuildingPropertiesReader();
        int minFloor = propertiesReader.getMinFloor();
        int maxFloor = propertiesReader.getMaxFloor();
        Random random = new Random();
        /** прибавляем 1 потому что random работает [minFloor maxFloor), то все числа до последнего числа **/
        floorCount = minFloor + random.nextInt(maxFloor - minFloor +1);

        floorList = new ArrayList<>();
        for (int i =0; i < floorCount; i++) {
            floorList.add(new Floor(this, i));
        }
    }

    public int getFloorCount() {
        return floorCount;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }
}
