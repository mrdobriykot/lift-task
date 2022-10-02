import com.jru.reader.FloorPropertiesReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Floor {
    private Building building; //делаем композицию что бы этажи знали о доме
    private final int floorId;
    private List<Person> queue;


    public Floor(Building building, int floorId) {
        this.building = building;
        this.floorId = ++floorId; // увеличиваем на 1 так как в цикле идет с нуля, а этаж у нас всегда первый
        generateQueue();
    }

    private void generateQueue(){
        Random random = new Random();
        FloorPropertiesReader floorPropertiesReader = new FloorPropertiesReader();
        int floorMinQueue = floorPropertiesReader.getMinQueue();
        int floorMaxQueue = floorPropertiesReader.getMaxQueue();
        int queueCount = floorMinQueue + random.nextInt(floorMaxQueue - floorMinQueue + 1);
        queue = new ArrayList<>(queueCount);

        for (int i = 0; i < queueCount; i++) {
            queue.add(new Person(this));
        }
    }

    public Building getBuilding() {
        return building;
    }

    public int getFloorId() {
        return floorId;
    }

    public List<Person> getQueue() {
        return queue;
    }
}
