package s55_9752762;

public class CloseExitDoorsCommand extends CloseDoorCommand {
    public CloseExitDoorsCommand(Door listener) {
        this.currentDoor = listener;
    }
}
