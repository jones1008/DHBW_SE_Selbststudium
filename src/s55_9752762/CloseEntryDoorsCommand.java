package s55_9752762;

public class CloseEntryDoorsCommand extends CloseDoorCommand {
    public CloseEntryDoorsCommand(Door listener) {
        this.currentDoor = listener;
    }
}
