package com.jru.reader;

public class FloorPropertiesReader extends PropertiesReader{
    int minQueue;
    int maxQueue;

    public FloorPropertiesReader() {
        minQueue = Integer.parseInt(properties.getProperty("building.floor.queue_min"));
        maxQueue = Integer.parseInt(properties.getProperty("building.floor.queue_max"));
    }

    public int getMinQueue() {
        return minQueue;
    }

    public int getMaxQueue() {
        return maxQueue;
    }
}
