package com.jru;

import com.jru.components.Building;
import com.jru.components.Direction;
import com.jru.components.Lift;

import java.util.List;

/***
 * Управляет работой лифта
 */

public class LiftManager {
    private Lift lift;
    private Building building;
    private Direction currentDirection;
    private List<Boolean> activeFloor; // список этажей, на которых стоят люди и ждут лифта

    public LiftManager() {
        this.lift = lift;
    }

}
