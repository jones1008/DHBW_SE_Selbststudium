package s55_9752762;

import java.util.ArrayList;
import java.util.List;

public class Exit {
    private List<Door> doors;
    private ExitSensor sensor;

    public Exit() {
        doors = new ArrayList<>();
        doors.add(new Door());
        doors.add(new Door());
        sensor = new ExitSensor();
    }

    public List<Door> getDoors() {
        return doors;
    }

    public ExitSensor getSensor() {
        return sensor;
    }
}
