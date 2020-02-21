package s55_9752762;

import java.util.List;

public abstract class CloseDoorCommand implements ICommand {
    protected Door currentDoor;

    public void execute() {
        currentDoor.close();
    }
}
