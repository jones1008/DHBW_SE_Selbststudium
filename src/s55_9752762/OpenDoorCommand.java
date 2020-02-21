package s55_9752762;

import java.util.List;

public abstract class OpenDoorCommand implements ICommand {
    protected List<Door> currentDoors;

    public void execute() {
        for (Door door : currentDoors) {
            door.open();
        }
    }
}
