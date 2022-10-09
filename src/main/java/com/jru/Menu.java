package com.jru;

import com.jru.components.Building;
import com.jru.components.Direction;
import com.jru.components.Lift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {

    private int stepId;
    private List<Integer> gone; //список людей, которые сошли на определенных этажах
    private StringBuilder data; //записываю все этапы, что бы выводить с помощью DataWriter

    public Menu(int floorCount, int liftCapacity) {
        stepId = 0;
        //создаем ArrayList и заполняем его 0 по количеству наших этажей
        gone = new ArrayList<>(Collections.nCopies(floorCount, 0));
        data = new StringBuilder();
        data.append("Building: ").append(floorCount).append(" floors. Lift capacity: ").append(liftCapacity);
    }

    public void doStep(Building building, Lift lift, Direction direction) {
        data.append("******** STEP ").append(stepId++).append(" ********\n");
    }
}
