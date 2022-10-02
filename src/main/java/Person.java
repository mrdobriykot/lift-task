import com.jru.reader.FloorPropertiesReader;

import java.util.Random;

public class Person {
    private Floor floor;
    private int currentFloor;
    private int neededFloor;
    private Direction direction;

    public Person(Floor floor) {
        this.floor = floor;
        this.currentFloor = floor.getFloorId();
        generateNeededFloor();
        direction = currentFloor < neededFloor ? Direction.UP : Direction.DOWN;
    }

    private void generateNeededFloor() {
        Random random = new Random();
        // что бы не создавался этаж на котором мы уже находимся
        do {
            // рандомайзер целевого этажа, куда нужно человеку
            neededFloor = random.nextInt(floor.getBuilding().getFloorCount()) +1;
        } while (neededFloor == currentFloor);
    }

    public int getNeededFloor() {
        return neededFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}
