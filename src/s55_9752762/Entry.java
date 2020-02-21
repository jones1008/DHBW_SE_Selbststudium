package s55_9752762;

import java.util.ArrayList;
import java.util.List;

public class Entry {
    private PassportReader passportReader;
    private List<Door> doors;

    public Entry() {
        doors = new ArrayList<>();
        doors.add(new Door());
        doors.add(new Door());
        passportReader = new PassportReader();
    }

    public PassportReader getPassportReader() {
        return passportReader;
    }

    public List<Door> getDoors() {
        return doors;
    }
}
