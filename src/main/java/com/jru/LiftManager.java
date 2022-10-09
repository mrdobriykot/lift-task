package com.jru;

import com.jru.components.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * Управляет работой лифта
 */

public class LiftManager {
    private Lift lift;
    private Building building;
    private Direction currentDirection;
    private Menu menu;
    private List<Boolean> activeFloor; // список этажей, на которых стоят люди и ждут лифта
    private Set<Person> goingUpPeople;
    private Set<Person> goingDownPeople;

    public LiftManager(Lift lift, Building building, Menu menu) {
        this.lift = lift;
        this.building = building;
        this.menu = menu;
        goingDownPeople = new HashSet<>();
        goingUpPeople = new HashSet<>();

        for (Floor floor: building.getFloorList()) {
            List<Person> floorQueue = floor.getQueue();

            //Добавляю людей, которые хотят ехать вверх или вниз
            for (int i = 0; i <floorQueue.size(); i++) {
                if (floorQueue.get(i).getDirection() == Direction.UP) {
                    goingUpPeople.add(floorQueue.get(i));
                } else {
                    goingDownPeople.add(floorQueue.get(i));
                }
            }

            //Определяю этиж, где люди ждут лифта
            if (floor.getQueue().isEmpty()) {
                activeFloor.add(false);
            } else {
                activeFloor.add(true);
            }
        }
    }

}
