package s55_9752762;

public class CloseExitDoorsCommand extends CloseDoorCommand {
    public CloseExitDoorsCommand() {
        this.currentDoors = AutomaticPassportControl.instance.getExit().getDoors();
    }
}
