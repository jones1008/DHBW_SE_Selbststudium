package s55_9752762;

import java.util.ArrayList;
import java.util.List;

public class Exit implements IExit {
    private List<Door> doors;
    private ExitSensor sensor;

    public Exit() {
        doors = new ArrayList<>();
        doors.add(new Door("Exit1"));
        doors.add(new Door("Exit2"));
        sensor = new ExitSensor();
    }

    public List<Door> getDoors() {
        return doors;
    }

    public ExitSensor getSensor() {
        return sensor;
    }
}
