package s55_9752762;

public class OpenDoorCommand implements ICommand {
    private Door[] currentDoors;

    public void execute() {
        for (Door door : currentDoors) {
            door.open();
        }
    }

    public void setCurrentDoors(Door[] currentDoors) {
        this.currentDoors = currentDoors;
    }
}
