package s55_9752762;

public class CloseEntryDoorsCommand extends CloseDoorCommand {
    public CloseEntryDoorsCommand() {
        this.currentDoors = AutomaticPassportControl.instance.getEntry().getDoors();
    }
}
