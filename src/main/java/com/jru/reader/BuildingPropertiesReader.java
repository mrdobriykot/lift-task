package com.jru.reader;

public class BuildingPropertiesReader extends PropertiesReader{
    private final int maxFloor;
    private final int minFloor;

    public BuildingPropertiesReader() {
        maxFloor = Integer.parseInt(properties.getProperty("building.max_floor"));
        minFloor = Integer.parseInt(properties.getProperty("building.min_floor"));
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getMinFloor() {
        return minFloor;
    }
}
