package com.jru.components;

import com.jru.reader.LiftPropertiesReader;

import java.util.ArrayList;
import java.util.List;

public class Lift {
    private final int maxCapacity;
    private int currentFloor;
    private List<Person> people;

    public Lift() {
        LiftPropertiesReader liftPropertiesReader = new LiftPropertiesReader();
        maxCapacity = liftPropertiesReader.getMaxCapacity();
        currentFloor = liftPropertiesReader.getStartFloor();
        people = new ArrayList<>();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public List<Person> getPeople() {
        return people;
    }

    public boolean iFull() {
        return people.size() == maxCapacity;
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }
}
