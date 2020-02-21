package s55_9752762;

public class OpenExitDoorsCommand extends OpenDoorCommand {
    public OpenExitDoorsCommand() {
        this.currentDoors = AutomaticPassportControl.instance.getExit().getDoors();
    }
}
